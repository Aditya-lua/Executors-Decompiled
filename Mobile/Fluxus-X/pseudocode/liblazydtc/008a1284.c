/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a1284
 */

int FUN_008a1284(double param_1,double param_2,double param_3)

{
  int iVar1;
  int iVar2;
  int iVar3;
  uint uVar4;
  
  if (ABS(param_1) <= 32767.0) {
    iVar2 = -0x80000000;
    if (param_1 == (double)(int)param_1) {
      iVar2 = (int)param_1;
    }
  }
  else {
    iVar2 = -0x80000000;
  }
  if (ABS(param_2) <= 32767.0) {
    iVar3 = -0x80000000;
    if (param_2 == (double)(int)param_2) {
      iVar3 = (int)param_2;
    }
  }
  else {
    iVar3 = -0x80000000;
  }
  if ((ABS(param_3) <= 32767.0) && (uVar4 = (uint)param_3, param_3 == (double)(int)uVar4)) {
    iVar1 = -1;
    if (((uVar4 & 0x7fffffff) != 0) && ((iVar2 != -0x80000000 && (iVar3 != -0x80000000)))) {
      if ((((int)uVar4 < 0) && (iVar2 < iVar3)) || ((0 < (int)uVar4 && (iVar3 < iVar2)))) {
        return 0;
      }
      iVar1 = 0;
      if (uVar4 != 0) {
        iVar1 = (iVar3 - iVar2) / (int)uVar4;
      }
      iVar1 = iVar1 + 1;
    }
    return iVar1;
  }
  return -1;
}

