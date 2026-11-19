/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094befc
 */

void FUN_0094befc(long param_1)

{
  long lVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  undefined1 auStack_58 [8];
  byte *local_50;
  long local_48;
  long local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (((*(byte *)(param_1 + 0x131d) & 1) == 0) || (*(long *)(param_1 + 0x1110) == 0)) {
    uVar4 = 0;
    *(undefined8 *)(param_1 + 0xe0) = 0xffffffffffffffff;
    goto LAB_0094bfb0;
  }
  iVar2 = FUN_00941b6c(*(long *)(param_1 + 0x1110),&local_50,10,&local_40);
  if (iVar2 != 1) {
    while ((*local_50 < 0x2e && ((1L << ((ulong)*local_50 & 0x3f) & 0x200100000200U) != 0))) {
      local_50 = local_50 + 1;
    }
    uVar4 = FUN_00941b6c(local_50,auStack_58,10,&local_48);
    iVar3 = (int)uVar4;
    if (iVar3 != 1) {
      if ((iVar2 == 0) && (iVar3 == 2)) {
        uVar4 = 0;
        *(long *)(param_1 + 0x1118) = local_40;
        goto LAB_0094bfb0;
      }
      if ((iVar2 == 2) && (iVar3 == 0)) {
        *(long *)(param_1 + 0xe0) = local_48;
        *(long *)(param_1 + 0x1118) = -local_48;
        goto LAB_0094bfb0;
      }
      if ((local_40 <= local_48) && (local_48 - local_40 != 0x7fffffffffffffff)) {
        uVar4 = 0;
        *(long *)(param_1 + 0xe0) = (local_48 - local_40) + 1;
        *(long *)(param_1 + 0x1118) = local_40;
        goto LAB_0094bfb0;
      }
    }
  }
  uVar4 = 0x21;
LAB_0094bfb0:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

