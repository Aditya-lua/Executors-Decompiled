/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092ba18
 */

void FUN_0092ba18(long param_1)

{
  int iVar1;
  
  if ((*(long *)(param_1 + 0xc0) != 0) &&
     ((*(long *)(param_1 + 0xdc8) != 0 || (*(int *)(param_1 + 0xdd0) != 0)))) {
    iVar1 = FUN_009415dc(*(undefined8 *)(*(long *)(param_1 + 0xc0) + 0xd0),param_1 + 0xdd8);
    if ((iVar1 != 0) &&
       (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0 &&
        ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))))) {
      FUN_00904c98(param_1,"Internal error clearing splay node = %d",iVar1);
    }
    if (*(long *)(param_1 + 0xe28) != 0) {
      do {
        FUN_00925d80(param_1 + 0xe10,*(undefined8 *)(param_1 + 0xe18),0);
      } while (*(long *)(param_1 + 0xe28) != 0);
    }
    *(undefined8 *)(param_1 + 0xdc8) = 0;
    *(undefined4 *)(param_1 + 0xdd0) = 0;
  }
  return;
}

