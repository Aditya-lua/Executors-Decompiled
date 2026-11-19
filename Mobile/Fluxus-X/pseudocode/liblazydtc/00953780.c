/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00953780
 */

void FUN_00953780(long param_1)

{
  long lVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined *puVar5;
  long lVar6;
  char local_3c [4];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  lVar6 = *(long *)(param_1 + 0x20);
  if ((((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
      ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) &&
     (0 < DAT_00cc46c0)) {
    FUN_00905258(param_1,"InitiateTransfer()");
  }
  if ((((((*(byte *)(lVar6 + 0x3a2) >> 2 & 1) == 0) || ((*(byte *)(param_1 + 0xa83) >> 4 & 1) == 0))
       || (uVar2 = FUN_00907858(lVar6,1), (uVar2 & 1) != 0)) ||
      (uVar3 = FUN_0096a268(param_1,lVar6,1), (int)uVar3 == 0)) &&
     ((uVar3 = FUN_00907508(param_1,1,1,local_3c), (int)uVar3 == 0 && (local_3c[0] != '\0')))) {
    if (*(char *)(lVar6 + 0x537) == '!') {
      FUN_00931c50(param_1,*(undefined8 *)(param_1 + 0x1158));
      uVar3 = 2;
      uVar4 = 0xffffffffffffffff;
    }
    else {
      uVar4 = *(undefined8 *)(lVar6 + 0x508);
      uVar3 = 1;
    }
    FUN_0094339c(param_1,uVar3,uVar4,1);
    *(undefined1 *)(lVar6 + 0x430) = 1;
    lVar6 = *(long *)(param_1 + 0x20);
    if (((param_1 != 0) && (*(byte *)(lVar6 + 0x536) != 0)) &&
       (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0 &&
        (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
         (0 < DAT_00cc46c0)))))) {
      if (lVar6 == 0) {
        puVar5 = &DAT_002c11b5;
      }
      else {
        puVar5 = (&PTR_DAT_00c508c0)[*(byte *)(lVar6 + 0x536)];
      }
      FUN_00905258(param_1,"[%s] -> [%s]",puVar5,&DAT_002c11b9);
    }
    uVar3 = 0;
    *(undefined1 *)(lVar6 + 0x536) = 0;
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

