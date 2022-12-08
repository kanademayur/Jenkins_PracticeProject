import React from 'react'
import img1 from '/home/mayuk/React Assignment/assignment-1/src/images/image.png'
import AccessTimeIcon from '@mui/icons-material/AccessTime';
import MoreHorizIcon from '@mui/icons-material/MoreHoriz';




function Card1() {
  return (
    <div className='card-container'>
      <div className='image-container'>
        <img src={img1} alt='' />

      </div>
      <div className='card-body'>
          <h2 id='book-name'>Beyond Entrepreneurship</h2>
          <p id='author-name'>Jim Collins & Bill Lazier</p>
          <p id='time' style={{
                                display: 'flex',
                                alignItems: 'center',
                                flexWrap: 'wrap',
                                
                            }}><AccessTimeIcon /><span>13-minute read</span></p>
          <p id='more'><MoreHorizIcon/></p>
          
          
          
      </div>

    </div>
  )
}

export default Card1