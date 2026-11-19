/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02c20
 */

int BN_security_bits(int param_1,int param_2)

{
  int iVar1;
  int iVar2;
  int iVar3;
  
  if (param_1 < 0x3c00) {
    if (param_1 < 0x1e00) {
      if (param_1 < 0xc00) {
        if (param_1 < 0x800) {
          if (param_1 < 0x400) {
            return 0;
          }
          iVar3 = 0x50;
          iVar2 = 0x50;
        }
        else {
          iVar3 = 0x70;
          iVar2 = 0x70;
        }
      }
      else {
        iVar3 = 0x80;
        iVar2 = 0x80;
      }
    }
    else {
      iVar3 = 0xc0;
      iVar2 = 0xc0;
    }
  }
  else {
    iVar3 = 0x100;
    iVar2 = 0x100;
  }
  if (param_2 == -1) {
    return iVar3;
  }
  iVar3 = param_2;
  if (param_2 < 0) {
    iVar3 = param_2 + 1;
  }
  iVar1 = 0;
  if ((0x9f < param_2) && (iVar1 = iVar3 >> 1, iVar2 <= iVar3 >> 1)) {
    iVar1 = iVar2;
  }
  return iVar1;
}

