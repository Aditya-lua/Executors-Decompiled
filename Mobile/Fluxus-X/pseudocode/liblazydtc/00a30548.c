/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30548
 */

void EC_POINT_clear_free(EC_POINT *point)

{
  code *pcVar1;
  
  if (point == (EC_POINT *)0x0) {
    return;
  }
  pcVar1 = *(code **)(*(long *)point + 0x60);
  if ((pcVar1 != (code *)0x0) || (pcVar1 = *(code **)(*(long *)point + 0x58), pcVar1 != (code *)0x0)
     ) {
    (*pcVar1)(point);
  }
  CRYPTO_clear_free(point,0x30,"crypto/ec/ec_lib.c",0x2fc);
  return;
}

