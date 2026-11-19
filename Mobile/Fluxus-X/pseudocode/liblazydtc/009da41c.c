/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009da41c
 */

void ossl_statem_check_finish_init(long param_1,int param_2)

{
  int iVar1;
  uint uVar2;
  
  if (param_2 == -1) {
    if ((*(uint *)(param_1 + 0x5c) & 0xfffffffe) != 0x2e) {
      return;
    }
    iVar1 = *(int *)(param_1 + 0x84);
LAB_009da454:
    *(undefined4 *)(param_1 + 100) = 1;
    if (iVar1 == 3) {
      *(undefined4 *)(param_1 + 0x84) = 7;
      return;
    }
  }
  else {
    if (*(int *)(param_1 + 0x38) == 0) {
      uVar2 = *(uint *)(param_1 + 0x5c);
      if (param_2 != 0) {
        if ((uVar2 & 0xfffffffe) != 0x2e) {
          return;
        }
        iVar1 = *(int *)(param_1 + 0x84);
        if (iVar1 == 4) {
          return;
        }
        goto LAB_009da454;
      }
    }
    else {
      if (*(int *)(param_1 + 0x84) != 0xc) {
        return;
      }
      uVar2 = *(uint *)(param_1 + 0x5c);
    }
    if (uVar2 == 0x2e) {
      *(undefined4 *)(param_1 + 100) = 1;
    }
  }
  return;
}

