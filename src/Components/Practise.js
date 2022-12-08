import React from 'react'
import {Tabs,Tab,AppBar} from '@mui/material'

function Practise() {
  const [value,setValue]= React.useState(0)
  
  const handleTabs=(e,val)=>{
    console.warn(val)
    setValue(val)
  }
  return (
    <div>
      <h1>My Library</h1>
      <AppBar position='static'>
        <Tabs value={value} onChange={handleTabs}>
          <Tab label='Currently reading'/>
          <Tab label='Finished'/>
        </Tabs>
      </AppBar>
    
      
    </div>
  )
}

export default Practise