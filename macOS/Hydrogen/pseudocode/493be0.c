
/* WARNING: Possible PIC construction at 0x00493c1c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00493c20) */

void FUN_00493be0(long *param_1)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  long *plVar5;
  long unaff_x29;
  undefined8 unaff_x30;
  undefined1 uStack0000000000000040;
  
  lVar4 = param_1[2];
  if (lVar4 != 0) {
    plVar5 = (long *)(param_1[1] + 8);
    do {
      lVar2 = plVar5[-1];
      if (lVar2 != 0) {
        lVar1 = *plVar5;
        uVar3 = 1;
        unaff_x30 = 0x493c20;
        unaff_x29 = (long)register0x00000008 + 0x30;
        goto code_r0x00187bd4;
      }
      plVar5 = plVar5 + 3;
      lVar4 = lVar4 + -1;
    } while (lVar4 != 0);
  }
  if (*param_1 != 0) {
    func_0x00187bd4(param_1[1],*param_1 * 0x18,8);
  }
  lVar1 = param_1[4];
  lVar4 = param_1[5] + 1;
  lVar2 = lVar1;
  while (lVar4 = lVar4 + -1, lVar4 != 0) {
    func_0x00489ff8(lVar2);
    lVar2 = lVar2 + 0x90;
  }
  if (param_1[3] == 0) {
    return;
  }
  lVar2 = param_1[3] * 0x90;
  uVar3 = 8;
  register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
code_r0x00187bd4:
  *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = unaff_x30;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,lVar2,uVar3);
  return;
}

