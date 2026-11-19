/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00866148
 */

void FUN_00866148(long param_1,undefined8 *param_2,undefined8 *param_3,undefined8 *param_4,
                 undefined8 *param_5)

{
  undefined4 uVar1;
  long lVar2;
  undefined8 uVar3;
  int iVar4;
  long lVar5;
  ulong uVar6;
  ulong local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined1 local_78;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  iVar4 = *(int *)(param_1 + 0x90);
  do {
    if (iVar4 == 0x106) {
LAB_008663c0:
      uVar3 = FUN_00866418(param_1);
      goto LAB_008663e4;
    }
    if (iVar4 == 0x119) {
      FUN_00853d20(&local_90,param_1 + 0x70);
      if ((int)local_90 == 0x106) goto LAB_008663c0;
      if ((*(int *)(param_1 + 0x90) != 0x119) ||
         (FUN_00853d20(&local_90,param_1 + 0x70), (int)local_90 != 0x3a)) goto LAB_008662d0;
      uVar6 = param_3[2];
      while (uVar6 < (ulong)param_2[2]) {
        local_90 = local_90 & 0xffffffffffffff00;
        local_78 = 0;
        FUN_00871bec(*param_3,&local_90);
        uVar6 = param_3[2] + 1;
        param_3[2] = uVar6;
      }
      if ((param_5 != (undefined8 *)0x0) && ((ulong)param_5[2] < (ulong)param_2[2])) {
        do {
          local_90 = 0xffffffffffffffff;
          FUN_00870ce4(*param_5,&local_90);
          lVar5 = param_5[2];
          param_5[2] = lVar5 + 1U;
        } while (lVar5 + 1U < (ulong)param_2[2]);
      }
      uStack_80 = *(undefined8 *)(param_1 + 0x9c);
      uStack_88 = *(undefined8 *)(param_1 + 0x94);
      local_90 = *(ulong *)(param_1 + 0xa8);
      local_78 = 1;
      FUN_00871bec(*param_3,&local_90);
      param_3[2] = param_3[2] + 1;
      FUN_00858f2c(param_1);
      if (param_5 != (undefined8 *)0x0) {
        FUN_00870ce4(*param_5,param_1 + 0x94);
        param_5[2] = param_5[2] + 1;
      }
      if (*(int *)(param_1 + 0x90) == 0x3a) {
        FUN_00858f2c();
      }
      else {
        FUN_0086e3b4(param_1,0x3a,0);
      }
    }
    else {
LAB_008662d0:
      if (param_3[2] != 0) {
        local_90 = local_90 & 0xffffffffffffff00;
        local_78 = 0;
        FUN_00871bec(*param_3,&local_90);
        param_3[2] = param_3[2] + 1;
        if (param_5 != (undefined8 *)0x0) {
          local_90 = 0xffffffffffffffff;
          FUN_00870ce4(*param_5,&local_90);
          param_5[2] = param_5[2] + 1;
        }
      }
    }
    uStack_88 = *(undefined8 *)(param_1 + 0x9c);
    local_90 = *(ulong *)(param_1 + 0x94);
    uVar3 = 0;
    uVar1 = *(undefined4 *)(param_1 + 0x124);
    if ((*(int *)(param_1 + 0x90) != 0x26) && (*(int *)(param_1 + 0x90) != 0x7c)) {
      uVar3 = FUN_008695d4(param_1,0,0);
      *(undefined4 *)(param_1 + 0x124) = uVar1;
    }
    local_90 = FUN_00867310(param_1,uVar3,&local_90);
    *(undefined4 *)(param_1 + 0x124) = uVar1;
    FUN_00871cec(*param_2,&local_90);
    param_2[2] = param_2[2] + 1;
    if (*(int *)(param_1 + 0x90) != 0x2c) goto LAB_008663e0;
    if (param_4 != (undefined8 *)0x0) {
      FUN_00870ce4(*param_4,param_1 + 0x94);
      param_4[2] = param_4[2] + 1;
    }
    FUN_00858f2c(param_1);
    iVar4 = *(int *)(param_1 + 0x90);
  } while (iVar4 != 0x29);
  FUN_00860ecc(param_1,param_1 + 0x94,"Expected type after \',\' but got \')\' instead");
LAB_008663e0:
  uVar3 = 0;
LAB_008663e4:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

