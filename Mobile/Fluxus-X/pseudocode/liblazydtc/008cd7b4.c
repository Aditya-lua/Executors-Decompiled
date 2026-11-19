/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cd7b4
 */

void FUN_008cd7b4(undefined8 param_1,long *param_2,long *param_3,long *param_4)

{
  long lVar1;
  int iVar2;
  long local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (*(int *)((long)param_4 + 0xc) == 3) {
LAB_008cd820:
    if (*(int *)((long)param_2 + 0xc) != 3) {
      if ((*(int *)((long)param_2 + 0xc) != 5) ||
         (iVar2 = FUN_008b93c8(*param_2 + 0x18,&local_50), iVar2 == 0)) goto LAB_008cd8dc;
      *(undefined4 *)((long)param_2 + 0xc) = 3;
      *param_2 = local_50;
    }
    if (*(int *)((long)param_3 + 0xc) != 3) {
      if ((*(int *)((long)param_3 + 0xc) != 5) ||
         (iVar2 = FUN_008b93c8(*param_3 + 0x18,&local_50), iVar2 == 0)) goto LAB_008cd900;
      *(undefined4 *)((long)param_3 + 0xc) = 3;
      *param_3 = local_50;
    }
    if (*(long *)(lVar1 + 0x28) == local_48) {
      return;
    }
  }
  else {
    if ((*(int *)((long)param_4 + 0xc) == 5) &&
       (iVar2 = FUN_008b93c8(*param_4 + 0x18,&local_50), iVar2 != 0)) {
      *(undefined4 *)((long)param_4 + 0xc) = 3;
      *param_4 = local_50;
      goto LAB_008cd820;
    }
    if (*(long *)(lVar1 + 0x28) != local_48) goto LAB_008cd924;
    FUN_008b3a88(param_1,param_4,"initial value");
LAB_008cd8dc:
    if (*(long *)(lVar1 + 0x28) != local_48) goto LAB_008cd924;
    FUN_008b3a88(param_1,param_2,"limit");
LAB_008cd900:
    if (*(long *)(lVar1 + 0x28) == local_48) {
      FUN_008b3a88(param_1,param_3,&DAT_002a71f5);
    }
  }
LAB_008cd924:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

