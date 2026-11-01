
/* WARNING: Possible PIC construction at 0x001d5d84: Changing call to branch */

void FUN_001d5d40(void)

{
  long lVar1;
  long lVar2;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  undefined8 unaff_x29;
  undefined8 uVar3;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  lVar2 = *(long *)(unaff_x19 + 0x30);
  if (lVar2 == 0) {
    lVar2 = *unaff_x20;
    if (lVar2 == 0) {
      return;
    }
    lVar1 = unaff_x20[1];
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000050;
    unaff_x29 = in_stack_00000040;
    uVar3 = in_stack_00000048;
  }
  else {
    lVar1 = *(long *)(unaff_x21 + 0x10);
    uVar3 = 0x1d5d88;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar3;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar1,lVar2,1);
  return;
}

