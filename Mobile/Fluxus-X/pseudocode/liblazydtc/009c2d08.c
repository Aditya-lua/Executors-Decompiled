/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c2d08
 */

bool ssl_cipher_disabled(long param_1,long param_2,undefined4 param_3,int param_4)

{
  int iVar1;
  int iVar2;
  int iVar3;
  
  if ((*(uint *)(param_1 + 0x3dc) & *(uint *)(param_2 + 0x1c)) != 0) {
    return true;
  }
  if ((*(uint *)(param_1 + 0x3e0) & *(uint *)(param_2 + 0x20)) != 0) {
    return true;
  }
  iVar2 = *(int *)(param_1 + 1000);
  if (iVar2 == 0) {
    return true;
  }
  if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0) {
    iVar3 = *(int *)(param_2 + 0x2c);
    if ((iVar3 == 0x301 && param_4 != 0) && (*(uint *)(param_2 + 0x1c) & 0x84) != 0) {
      iVar3 = 0x300;
    }
    if (iVar2 < iVar3) {
      return true;
    }
    if (*(int *)(param_2 + 0x30) < *(int *)(param_1 + 0x3e4)) {
      return true;
    }
  }
  else {
    iVar3 = 0xff00;
    if (*(int *)(param_2 + 0x34) != 0x100) {
      iVar3 = *(int *)(param_2 + 0x34);
    }
    iVar1 = 0xff00;
    if (iVar2 != 0x100) {
      iVar1 = iVar2;
    }
    if (iVar3 < iVar1) {
      return true;
    }
    iVar2 = 0xff00;
    if (*(int *)(param_2 + 0x38) != 0x100) {
      iVar2 = *(int *)(param_2 + 0x38);
    }
    iVar3 = 0xff00;
    if (*(int *)(param_1 + 0x3e4) != 0x100) {
      iVar3 = *(int *)(param_1 + 0x3e4);
    }
    if (iVar3 < iVar2) {
      return true;
    }
  }
  iVar2 = ssl_security(param_1,param_3,*(undefined4 *)(param_2 + 0x44),0);
  return iVar2 == 0;
}

