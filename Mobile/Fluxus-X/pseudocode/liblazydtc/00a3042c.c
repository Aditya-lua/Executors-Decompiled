/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3042c
 */

void EC_POINT_free(EC_POINT *point)

{
  if (point == (EC_POINT *)0x0) {
    return;
  }
  if (*(code **)(*(long *)point + 0x58) != (code *)0x0) {
    (**(code **)(*(long *)point + 0x58))(point);
  }
  CRYPTO_free(point);
  return;
}

