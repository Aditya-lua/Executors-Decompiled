
/* WARNING: Possible PIC construction at 0x004fd3a4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004fd3f4: Changing call to branch */

void FUN_004fd374(long param_1,long param_2)

{
  long lVar1;
  code *pcVar2;
  long *unaff_x19;
  undefined8 *puVar3;
  undefined8 unaff_x29;
  undefined *puVar4;
  undefined8 in_stack_00000030;
  undefined *in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  param_1 = param_1 + 1;
  while (param_1 = param_1 + -1, param_1 != 0) {
    func_0x00489dec(param_2);
    param_2 = param_2 + 0x20;
  }
  if (unaff_x19[7] == 0) {
    if ((*unaff_x19 != 2) && (unaff_x19[1] != 0)) {
      func_0x00187bd4(unaff_x19[2],unaff_x19[1],1);
    }
    if (unaff_x19[0xd] != 0) {
      puVar3 = (undefined8 *)unaff_x19[0xe];
      pcVar2 = (code *)*puVar3;
      if (pcVar2 != (code *)0x0) {
        (*pcVar2)(unaff_x19[0xd]);
      }
      if (puVar3[1] != 0) {
        puVar4 = &LAB_004fd3f8;
        goto code_r0x00187bd4;
      }
    }
    lVar1 = unaff_x19[10];
    if ((-0x7fffffffffffffff < lVar1) && (lVar1 != 0)) {
      func_0x00187bd4(unaff_x19[0xb],lVar1,1);
    }
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
    unaff_x29 = in_stack_00000030;
    puVar4 = in_stack_00000038;
  }
  else {
    puVar4 = (undefined *)0x4fd3a8;
  }
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar4;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

