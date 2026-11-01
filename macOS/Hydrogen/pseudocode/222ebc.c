
/* WARNING: Possible PIC construction at 0x00222efc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00222f00) */

void FUN_00222ebc(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  long *unaff_x19;
  long lVar3;
  long *plVar4;
  undefined8 unaff_x29;
  undefined8 uVar5;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  if (param_1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001fa698();
  }
  lVar3 = unaff_x19[2];
  if (lVar3 != 0) {
    plVar4 = (long *)(unaff_x19[1] + 8);
    do {
      lVar1 = plVar4[-1];
      if (lVar1 != 0) {
        lVar3 = *plVar4;
        uVar2 = 1;
        uVar5 = 0x222f00;
        goto code_r0x00187bd4;
      }
      plVar4 = plVar4 + 3;
      lVar3 = lVar3 + -1;
    } while (lVar3 != 0);
  }
  if (*unaff_x19 != 0) {
    func_0x00187bd4(unaff_x19[1],*unaff_x19 * 0x18,8);
  }
  lVar3 = unaff_x19[5] + 1;
  lVar1 = unaff_x19[4];
  while (lVar3 = lVar3 + -1, lVar3 != 0) {
    func_0x001a08c4(lVar1);
    lVar1 = lVar1 + 0x98;
  }
  if (unaff_x19[3] == 0) {
    return;
  }
  lVar3 = unaff_x19[4];
  lVar1 = unaff_x19[3] * 0x98;
  uVar2 = 8;
  register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
  unaff_x29 = in_stack_00000030;
  uVar5 = in_stack_00000038;
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar3,lVar1,uVar2);
  return;
}

