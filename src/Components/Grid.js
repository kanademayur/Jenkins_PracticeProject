import React from 'react'
import {Grid} from '@mui/material'
import { Box } from '@mui/system'
import { blue, red } from '@mui/material/colors'

function Grid1() {
  return (
    <div>
        <Grid container spacing={2}>
            <Grid item xs>
                <Box bgcolor={red} p={2}>
                    Item 1
                </Box>
            </Grid>
            <Grid item xs>
                <Box bgcolor={blue} p={2}>
                    Item 2
                </Box>
            </Grid>
            <Grid item xs>
                <Box bgcolor={blue} p={2}>
                    Item 3
                </Box>
            </Grid>
        </Grid>
    </div>
  )
}

export default Grid1