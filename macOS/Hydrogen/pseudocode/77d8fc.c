
void FUN_0077d8fc(void)

{
  undefined8 uVar1;
  long lVar2;
  int in_w8;
  byte *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  int *unaff_x23;
  long unaff_x29;
  undefined1 auVar3 [16];
  
  if (in_w8 == 0) {
    if (*unaff_x23 == 0x11) {
      *(byte *)(unaff_x20 + 0x24) = *(byte *)(unaff_x20 + 0x24) | 1;
      func_0x00784f38();
      uVar1 = 0;
      if (*(long *)(unaff_x20 + 0x10) != 0) {
        (*pcRam0000000000a2b5f0)();
        uVar1 = 0;
        *(undefined8 *)(unaff_x20 + 0x10) = 0;
      }
    }
    else {
      uVar1 = 0;
    }
  }
  else {
    *(int *)(&UNK_00001440 + unaff_x21) = in_w8;
    uVar1 = 0x61;
  }
  *unaff_x19 = *(byte *)(unaff_x20 + 0x24) & 1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
  auVar3 = ___stack_chk_fail(uVar1);
  lVar2 = auVar3._0_8_;
  *(byte *)(lVar2 + 0x24) = *(byte *)(lVar2 + 0x24) & 0xfe;
  if (*(long *)(lVar2 + 0x10) != 0) {
    (*pcRam0000000000a2b5f0)();
    *(undefined8 *)(lVar2 + 0x10) = 0;
  }
                    /* WARNING: Could not recover jumptable at 0x0077e07c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(long **)(lVar2 + 8) + 0x20))(*(long **)(lVar2 + 8),auVar3._8_8_);
  return;
}

