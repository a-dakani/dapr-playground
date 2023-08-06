const express = require('express')
const app = express()
const port = 3000

app.get('/', (req, res) => {
    res.send('Hello Dapr!')
})

app.listen(port, () => {
    console.log(`Demo app listening on port ${port}`)
})