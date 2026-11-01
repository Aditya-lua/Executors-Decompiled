
/* WARNING: Possible PIC construction at 0x00524aa4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00524b0c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00524aa8) */
/* WARNING: Removing unreachable block (ram,0x00524b10) */
/* WARNING: Removing unreachable block (ram,0x00524b18) */
/* WARNING: Removing unreachable block (ram,0x00524b1c) */

void FUN_00524a78(void)

{
  long lVar1;
  long lVar2;
  long *unaff_x19;
  long unaff_x21;
  long *unaff_x22;
  undefined8 unaff_x29;
  undefined8 uVar3;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  do {
    lVar2 = unaff_x22[-1];
    if (lVar2 != -0x8000000000000000 && lVar2 != 0) {
      lVar1 = *unaff_x22;
      uVar3 = 0x524aa8;
      goto code_r0x00187bd4;
    }
    unaff_x22 = unaff_x22 + 3;
    unaff_x21 = unaff_x21 + -1;
  } while (unaff_x21 != 0);
  if (unaff_x19[8] != 0) {
    func_0x00187bd4();
  }
  lVar2 = *unaff_x19;
  if (lVar2 < -0x7ffffffffffffffe || lVar2 == 0) {
    lVar2 = unaff_x19[3];
    if (lVar2 < -0x7ffffffffffffffe || lVar2 == 0) {
      return;
    }
    lVar1 = unaff_x19[4];
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
    unaff_x29 = in_stack_00000030;
    uVar3 = in_stack_00000038;
  }
  else {
    lVar1 = unaff_x19[1];
    uVar3 = 0x524b10;
  }
code_r0x00187bd4:
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar3;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,lVar2,1);
  return;
}

