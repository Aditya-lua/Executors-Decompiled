/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5965c
 */

undefined8 OSSL_EC_curve_nid2name(int param_1)

{
  ulong uVar1;
  int *piVar2;
  
  if (0 < param_1) {
    uVar1 = 0;
    piVar2 = &DAT_00c5d078;
    do {
      if (*piVar2 == param_1) {
        return *(undefined8 *)(piVar2 + -2);
      }
      uVar1 = uVar1 + 1;
      piVar2 = piVar2 + 4;
    } while (uVar1 < 0x52);
  }
  return 0;
}

