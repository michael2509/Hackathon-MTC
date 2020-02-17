document.getElementById("submit").addEventListener("click", function () {
    
    const nbOfArticles = [];
    const customerNb = document.getElementById("customerNb").value;
    
    for (i = 0; i < customerNb; i++) {
        const randomArticles = Math.floor((Math.random() * 40) + 1);
        nbOfArticles.push(randomArticles);
    }
    console.log(nbOfArticles);
})

