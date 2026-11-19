/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00907008
 */

int FUN_00907008(long param_1,int param_2,undefined1 *param_3)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  long lVar4;
  long *plVar5;
  char local_6c [4];
  undefined1 local_68 [16];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  for (plVar5 = *(long **)(*(long *)(param_1 + 0x20) + (long)param_2 * 8 + 0x248);
      plVar5 != (long *)0x0; plVar5 = (long *)plVar5[1]) {
    if ((*(byte *)((long)plVar5 + 0x24) & 3) == 1) {
      *param_3 = 0;
      local_68 = FUN_00941cb8();
      uVar3 = FUN_009089d0(param_1,param_2);
      if ((uVar3 & 1) == 0) {
        FUN_009087dc(param_1,param_2,local_68);
        goto LAB_009070cc;
      }
      lVar4 = FUN_00908868(*(undefined8 *)(param_1 + 0x20),param_2,local_68);
      if (-1 < lVar4) goto LAB_009070cc;
      FUN_00904b80(param_1,"SSL shutdown timeout");
      iVar2 = 0x1c;
      goto LAB_00907160;
    }
  }
  goto LAB_00907154;
LAB_009070cc:
  do {
    if ((*(byte *)((long)plVar5 + 0x24) >> 1 & 1) == 0) {
      local_6c[0] = '\0';
      iVar2 = (**(code **)(*plVar5 + 0x28))(plVar5,param_1,local_6c);
      if (iVar2 != 0) {
        if ((((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
            ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
           && (0 < *(int *)(*plVar5 + 0xc))) {
          FUN_00904ddc(param_1,plVar5,"shut down failed with %d",iVar2);
        }
        goto LAB_00907160;
      }
      if (local_6c[0] == '\0') {
        if (param_1 != 0) {
          iVar2 = 0;
          if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) goto LAB_00907160;
          if (((*(long *)(param_1 + 0x12a0) == 0) || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))
              ) && (0 < *(int *)(*plVar5 + 0xc))) {
            FUN_00904ddc(param_1,plVar5,"shut down not done yet");
          }
        }
        iVar2 = 0;
        goto LAB_00907160;
      }
      if (((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
         (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
          (0 < *(int *)(*plVar5 + 0xc))))) {
        FUN_00904ddc(param_1,plVar5,"shut down successfully");
      }
      *(byte *)((long)plVar5 + 0x24) = *(byte *)((long)plVar5 + 0x24) | 2;
    }
    plVar5 = (long *)plVar5[1];
  } while (plVar5 != (long *)0x0);
LAB_00907154:
  iVar2 = 0;
  *param_3 = 1;
LAB_00907160:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

