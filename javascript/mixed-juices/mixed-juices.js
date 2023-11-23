// @ts-check
//
// The line above enables type checking for this file. Various IDEs interpret
// the @ts-check directive. It will give you helpful autocompletion when
// implementing this exercise.

/**
 * Determines how long it takes to prepare a certain juice.
 *
 * @param {string} name
 * @returns {number} time in minutes
 */
export function timeToMixJuice(name) {
  switch (name) {
    case name = 'Pure Strawberry Joy':
      return 0.5;
    case name = 'Energizer' :
    case name = 'Green Garden' :
      return 1.5;
    case name = 'Tropical Island':
      return 3;
    case name = 'All or Nothing':
      return 5;
    default :
      return 2.5;
}
}

/**
 * Calculates the number of limes that need to be cut
 * to reach a certain supply.
 *
 * @param {number} wedgesNeeded
 * @param {string[]} limes
 * @returns {number} number of limes cut
 */
export function limesToCut(wedgesNeeded, limes) {

  const newLimes = []

  for (let i = 0; i < limes.length; i++) {
    switch (limes[i]) {
      case limes[i] = 'small':
        newLimes[i] = 6;
        break;
      case limes[i] = 'medium':
        newLimes[i] = 8;
        break;
      case limes[i] = 'large':
        newLimes[i] = 10;
        break;
      default:
        newLimes[i] = 0;
    }
  } 

  let limesCut = 0
  let limesIndex = 0

  while (limesCut < wedgesNeeded && limesIndex < newLimes.length) {
    let wedgesFromCurrentLine = Math.min(newLimes[limesIndex], wedgesNeeded - limesCut)

    limesCut += wedgesFromCurrentLine;
    console.log(limesCut);
    limesIndex++;
  }

  return limesIndex;
}

/**
 * Determines which juices still need to be prepared after the end of the shift.
 *
 * @param {number} timeLeft
 * @param {string[]} orders
 * @returns {string[]} remaining orders after the time is up
 */


export function remainingOrders(timeLeft, orders) {
  let i = 0
  let length = orders.length

  do {
    orders.shift()
    timeLeft -= timeToMixJuice(orders[i])
    i++

    if (timeLeft < timeToMixJuice(orders[i])) {
      continue;
    }
  } while (timeLeft > 0 && i < length)

  return orders;
}
