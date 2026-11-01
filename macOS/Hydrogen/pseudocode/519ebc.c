
/* WARNING: Possible PIC construction at 0x00519ed8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00519f28: Changing call to branch */

void FUN_00519ebc(void)

{
  code *pcVar1;
  long *unaff_x19;
  long unaff_x22;
  undefined8 *puVar2;
  long unaff_x23;
  undefined8 unaff_x29;
  undefined *puVar3;
  undefined8 in_stack_00000030;
  undefined *in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  while (unaff_x23 = unaff_x23 + -1, unaff_x23 != 0) {
    func_0x00489dec(unaff_x22);
    unaff_x22 = unaff_x22 + 0x20;
  }
  if (unaff_x19[7] == 0) {
    if ((*unaff_x19 != 2) && (unaff_x19[1] != 0)) {
      func_0x00187bd4(unaff_x19[2],unaff_x19[1],1);
    }
    if (unaff_x19[0xd] != 0) {
      puVar2 = (undefined8 *)unaff_x19[0xe];
      pcVar1 = (code *)*puVar2;
      if (pcVar1 != (code *)0x0) {
        (*pcVar1)(unaff_x19[0xd]);
      }
      if (puVar2[1] != 0) {
        puVar3 = &UNK_00519f2c;
        goto code_r0x00187bd4;
      }
    }
    if ((unaff_x19[10] < -0x7ffffffffffffffe) || (unaff_x19[10] == 0)) {
      return;
    }
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
    unaff_x29 = in_stack_00000030;
    puVar3 = in_stack_00000038;
  }
  else {
    puVar3 = &UNK_00519edc;
  }
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar3;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

