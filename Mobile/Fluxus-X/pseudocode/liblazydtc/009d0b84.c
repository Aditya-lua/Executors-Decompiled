/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d0b84
 */

undefined4 should_add_extension(int *param_1,uint param_2,uint param_3,int param_4)

{
  uint uVar1;
  int iVar2;
  bool bVar3;
  undefined4 uVar4;
  
  if ((param_3 & param_2) == 0) {
    return 0;
  }
  uVar1 = *(uint *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60);
  if ((param_3 >> 0xb & 1) == 0) {
    bVar3 = false;
    if ((uVar1 >> 3 & 1) == 0) {
      iVar2 = **(int **)(param_1 + 2);
      bVar3 = false;
      if (0x303 < iVar2) {
        bVar3 = iVar2 != 0x10000;
      }
      goto joined_r0x009d0bdc;
    }
  }
  else {
    bVar3 = true;
  }
  if (((param_2 >> 2 & 1) != 0) && ((uVar1 >> 3 & 1) != 0)) {
    return 0;
  }
joined_r0x009d0bdc:
  if ((((((param_2 >> 3 & 1) != 0) || (uVar4 = 0, *param_1 != 0x300)) &&
       (((param_2 >> 4 & 1) == 0 || (uVar4 = 0, !bVar3)))) &&
      ((((param_3 >> 7 & 1) != 0 || ((param_2 >> 5 & 1) == 0)) || (uVar4 = 0, bVar3)))) &&
     (((((param_2 >> 5 & 1) == 0 || (bVar3)) || (uVar4 = 0, param_1[0xe] == 0)) &&
      (uVar4 = 0, ((param_2 >> 6 ^ 0xffffffff) & 1) != 0 || param_1[0x134] == 0)))) {
    if (((param_2 >> 5 & 1) != 0) && ((param_3 >> 7 & 1) != 0)) {
      if (param_4 < 0x304) {
        return 0;
      }
      if ((uVar1 >> 3 & 1) != 0) {
        return 0;
      }
    }
    uVar4 = 1;
  }
  return uVar4;
}

