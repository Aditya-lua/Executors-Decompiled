/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094e12c
 */

void FUN_0094e12c(long param_1,long *param_2,int *param_3)

{
  undefined4 uVar1;
  long lVar2;
  bool bVar3;
  int iVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  undefined8 uVar8;
  undefined4 *puVar9;
  undefined *puVar10;
  long lVar11;
  int iVar12;
  int local_7c;
  long local_78;
  int local_6c;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  lVar11 = *(long *)(param_1 + 0x20);
  uVar1 = *(undefined4 *)(lVar11 + 0x220);
  local_7c = 0;
  if (param_3 == (int *)0x0) {
    param_3 = &local_7c;
  }
  else {
    *param_3 = 0;
  }
  iVar12 = 0;
  *param_2 = 0;
  do {
    lVar5 = FUN_00945038(param_1,lVar11 + 0x428,0);
    if (lVar5 < 1) {
      FUN_00904b80(param_1,"FTP response timeout");
      uVar8 = 0x1c;
      goto LAB_0094e380;
    }
    if (999 < lVar5) {
      lVar5 = 1000;
    }
    lVar6 = FUN_00904984(lVar11 + 0x488);
    if (((iVar12 < 2) && (lVar6 != 0)) || (uVar7 = FUN_009078cc(param_1,0), (uVar7 & 1) != 0)) {
LAB_0094e1fc:
      uVar8 = FUN_00945480(param_1,0,lVar11 + 0x428,&local_6c,&local_78);
      bVar3 = local_6c == 0x1a5;
      *(int *)(param_1 + 0x1328) = local_6c;
      *param_3 = local_6c;
      if (bVar3) {
        if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
           ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
        {
          FUN_00904c98(param_1,"We got a 421 - timeout");
        }
        lVar5 = *(long *)(param_1 + 0x20);
        if (((((ulong)*(byte *)(lVar5 + 0x536) != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)
             ) && ((*(long *)(param_1 + 0x12a0) == 0 ||
                   (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) && (0 < DAT_00cc46c0)) {
          if (lVar5 == 0) {
            puVar10 = &DAT_002c11b5;
          }
          else {
            puVar10 = (&PTR_DAT_00c508c0)[*(byte *)(lVar5 + 0x536)];
          }
          FUN_00905258(param_1,"[%s] -> [%s]",puVar10,&DAT_002c11b9);
        }
        uVar8 = 0x1c;
        *(undefined1 *)(lVar5 + 0x536) = 0;
        goto LAB_0094e37c;
      }
      if ((int)uVar8 != 0) goto LAB_0094e37c;
      if (local_78 == 0) {
        lVar5 = FUN_00904984(lVar11 + 0x488);
        iVar4 = 0;
        if (lVar5 != 0) {
          iVar4 = iVar12 + 1;
        }
        iVar12 = iVar4;
      }
      else {
        iVar12 = 0;
      }
      *param_2 = *param_2 + local_78;
    }
    else {
      iVar4 = FUN_0093456c(uVar1,0xffffffff,0xffffffff,lVar5);
      if (iVar4 != 0) {
        if (iVar4 != -1) goto LAB_0094e1fc;
        puVar9 = (undefined4 *)__errno();
        FUN_00904b80(param_1,"FTP response aborted due to select/poll error: %d",*puVar9);
        uVar8 = 0x38;
        goto LAB_0094e380;
      }
      iVar4 = FUN_009314dc(param_1);
      if (iVar4 != 0) {
        uVar8 = 0x2a;
        goto LAB_0094e380;
      }
    }
  } while (*param_3 == 0);
  uVar8 = 0;
LAB_0094e37c:
  *(undefined1 *)(lVar11 + 0x430) = 0;
LAB_0094e380:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar8);
  }
  return;
}

