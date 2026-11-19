/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ac9f8
 */

undefined8 ssl_cert_set_current(long *param_1,long param_2)

{
  long lVar1;
  int iVar2;
  long *plVar3;
  
  if (param_1 != (long *)0x0) {
    if (param_2 == 1) {
      iVar2 = 0;
    }
    else if ((param_2 != 2) ||
            (iVar2 = (int)((ulong)(*param_1 - (long)(param_1 + 4)) >> 3) * -0x33333333 + 1,
            8 < iVar2)) {
      return 0;
    }
    lVar1 = (long)iVar2 + -1;
    plVar3 = param_1 + (long)iVar2 * 5 + 4;
    do {
      if ((*plVar3 != 0) && (plVar3[1] != 0)) {
        *param_1 = (long)plVar3;
        return 1;
      }
      lVar1 = lVar1 + 1;
      plVar3 = plVar3 + 5;
    } while (lVar1 < 8);
  }
  return 0;
}

