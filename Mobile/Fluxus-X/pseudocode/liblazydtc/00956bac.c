/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00956bac
 */

int FUN_00956bac(long param_1,long param_2)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  long lVar3;
  int iVar4;
  ulong uVar5;
  undefined1 *puVar6;
  undefined1 *puVar7;
  int local_4c;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  if ((*(byte *)(param_2 + 0x523) >> 1 & 1) == 0) {
    uVar5 = FUN_00945a8c(param_2 + 0x4c8,param_1);
    if ((uVar5 & 1) != 0) {
      iVar4 = FUN_00945ab0(param_2 + 0x4c8,param_1,*(byte *)(param_2 + 0x523) >> 4 & 1,&local_4c);
      if (iVar4 != 0) goto LAB_00956d14;
      if (local_4c == 1) {
        iVar4 = 0;
        *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x518) = 5;
        goto LAB_00956d14;
      }
      if (((*(byte *)(param_2 + 0x523) >> 3 & 1) != 0) || ((*(byte *)(param_2 + 0x521) & 1) == 0)) {
        if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
           ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
        {
          FUN_00904c98(param_1,"No known authentication mechanisms supported");
        }
        iVar4 = 0x43;
        goto LAB_00956d14;
      }
      if (*(long *)(param_1 + 0x12f0) != 0) {
        puVar6 = (undefined1 *)FUN_00956d44(*(undefined8 *)(param_2 + 0x1c8),0);
        puVar7 = (undefined1 *)FUN_00956d44(*(undefined8 *)(param_2 + 0x1d0),0);
        puVar1 = &DAT_002ab32c;
        if (puVar6 != (undefined1 *)0x0) {
          puVar1 = puVar6;
        }
        puVar2 = &DAT_002ab32c;
        if (puVar7 != (undefined1 *)0x0) {
          puVar2 = puVar7;
        }
        iVar4 = FUN_00956a58(param_1,"LOGIN %s %s",puVar1,puVar2);
        (*(code *)PTR_free_00cc4678)(puVar6);
        (*(code *)PTR_free_00cc4678)(puVar7);
        if (iVar4 == 0) {
          *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x518) = 6;
        }
        goto LAB_00956d14;
      }
    }
  }
  iVar4 = 0;
  *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x518) = 0;
LAB_00956d14:
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

