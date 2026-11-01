
/* WARNING: Possible PIC construction at 0x00524ac4: Changing call to branch */

void FUN_00524aac(void)

{
  long lVar1;
  long *unaff_x19;
  undefined8 unaff_x29;
  undefined8 uVar2;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  if (unaff_x19[8] == 0) {
    lVar1 = *unaff_x19;
    if (lVar1 < -0x7ffffffffffffffe || lVar1 == 0) {
      if (unaff_x19[3] < -0x7ffffffffffffffe || unaff_x19[3] == 0) {
        return;
      }
    }
    else {
      func_0x00187bd4(unaff_x19[1],lVar1,1);
      if (unaff_x19[3] < -0x7ffffffffffffffe || unaff_x19[3] == 0) {
        return;
      }
    }
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
    unaff_x29 = in_stack_00000030;
    uVar2 = in_stack_00000038;
  }
  else {
    uVar2 = 0x524ac8;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar2;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

