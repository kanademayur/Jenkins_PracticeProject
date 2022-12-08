import React from 'react'

function Cards(props) {
  return (
    <div className='wrapper'>
    <div className='card'>
      <div className='card_body'>
        <img src={props.img} alt='bookPic' className='card__image'/>
        <h2 className='card-title'>{props.title}</h2>
        <p className='author'>{props.author}</p>
        <p className='time'>{props.time}</p>

      </div>
      <button className='card-btn'>FINISHED</button>


      </div>
      </div>
  )
}

export default Cards