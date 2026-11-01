
/* WARNING: Possible PIC construction at 0x002461ec: Changing call to branch */

void FUN_002461d8(code *param_1)

{
  undefined8 *puVar1;
  code *pcVar2;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x29;
  undefined8 uVar3;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  
  (*param_1)();
  if (*(long *)(unaff_x20 + 8) == 0) {
    puVar1 = *(undefined8 **)(unaff_x19 + 0x28);
    pcVar2 = (code *)*puVar1;
    if (pcVar2 != (code *)0x0) {
      (*pcVar2)(*(undefined8 *)(unaff_x19 + 0x20));
    }
    if (puVar1[1] == 0) {
      return;
    }
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000030;
    unaff_x29 = in_stack_00000020;
    uVar3 = in_stack_00000028;
  }
  else {
    uVar3 = 0x2461f0;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar3;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

