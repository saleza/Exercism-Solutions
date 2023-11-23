/// <reference path="./global.d.ts" />
// @ts-check

export function cookingStatus(remainingTime) {
    if (remainingTime === 0) {
        return 'Lasagna is done.'
    } else if (remainingTime > 0) {
        return 'Not done, please wait.'
    } else return 'You forgot to set the timer.'
}

export function preparationTime(layers, timePerLayer) {
    if (timePerLayer === undefined) {
        timePerLayer = 2;
    }

    return layers.length * timePerLayer;
}

export function quantities(layers) {
    const result = {noodles: 0, sauce: 0}
    for (let i = 0; i < layers.length; i++) {
        if (layers[i] === 'sauce') {
            result.sauce += 0.2
        } else if (layers[i] === 'noodles') {
            result.noodles += 50
        }
    }

    return result;
}

export function addSecretIngredient(friendsList, myList) {
    myList.push(friendsList[friendsList.length - 1])
}

export function scaleRecipe(recipe, portionsNumber) {
    let newRecipe = {}
    for (let key in recipe) {
        newRecipe[key] = recipe[key] * 0.5 * portionsNumber
    }
    return newRecipe;
}