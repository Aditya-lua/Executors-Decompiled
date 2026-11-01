
/* WARNING: Possible PIC construction at 0x004dd634: Changing call to branch */

void FUN_004dd5e8(long *param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  undefined4 *puVar3;
  undefined4 *puVar4;
  long unaff_x29;
  undefined *unaff_x30;
  undefined1 uStack0000000000000040;
  
  lVar1 = *param_1;
  if (lVar1 != 0) {
    lVar2 = param_1[2];
    puVar4 = (undefined4 *)param_1[3];
    for (puVar3 = (undefined4 *)param_1[1]; puVar3 != puVar4; puVar3 = puVar3 + 1) {
      func_0x004d1c68(param_2,*puVar3);
    }
    if (lVar2 != 0) {
      unaff_x30 = &LAB_004dd638;
      unaff_x29 = (long)register0x00000008 + 0x30;
      goto code_r0x00187bd4;
    }
  }
  lVar1 = param_1[4];
  if (lVar1 != 0) {
    lVar2 = param_1[6];
    puVar4 = (undefined4 *)param_1[7];
    for (puVar3 = (undefined4 *)param_1[5]; puVar3 != puVar4; puVar3 = puVar3 + 1) {
      func_0x004d1c68(param_2,*puVar3);
    }
    if (lVar2 != 0) {
      register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
code_r0x00187bd4:
      *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined **)((long)register0x00000008 + -8) = unaff_x30;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lVar1,lVar2 << 2,4);
      return;
    }
  }
  return;
}

