
void FUN_004a6e70(long *param_1)

{
  code *pcVar1;
  undefined8 uVar2;
  long *in_x9;
  long lVar3;
  undefined8 extraout_x9;
  undefined8 uVar4;
  undefined8 *unaff_x19;
  long unaff_x23;
  long unaff_x29;
  long lVar5;
  undefined8 uStack00000000000000c0;
  long in_stack_000000d8;
  undefined8 uStack00000000000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined1 uStack0000000000000150;
  undefined8 uStack0000000000000190;
  long *in_stack_00000198;
  
  if (param_1 != in_x9) {
    in_stack_00000198 = param_1 + 4;
    lVar3 = *param_1;
    if (lVar3 != 0) {
      lVar5 = param_1[1];
      in_stack_000000d8 = param_1[3];
      *(long *)(unaff_x23 + 0x98) = param_1[2];
      *(long *)(unaff_x23 + 0x90) = lVar5;
      uStack00000000000000c0 = lVar3;
      func_0x004ad8b8(&uStack00000000000000e0,&uStack00000000000000c0);
      if (uStack00000000000000e0 != 0) {
        *(undefined8 *)(unaff_x29 + -0xb8) = in_stack_000000e8;
        *(long *)(unaff_x29 + -0xc0) = uStack00000000000000e0;
        *(undefined8 *)(unaff_x29 + -0xa8) = in_stack_000000f8;
        *(undefined8 *)(unaff_x29 + -0xb0) = in_stack_000000f0;
        func_0x007a2810(&UNK_008a04ac,99,unaff_x29 + -0xc0,&UNK_009e3ad8,&UNK_009e3928);
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x4a6f20);
        (*pcVar1)();
      }
      uVar2 = 1;
      uVar4 = in_stack_000000e8;
      goto LAB_004a6dc4;
    }
  }
  func_0x004b7fe4(&uStack0000000000000190);
  uVar2 = 0;
  uStack0000000000000190 = 0;
  uVar4 = extraout_x9;
LAB_004a6dc4:
  unaff_x19[1] = uVar2;
  unaff_x19[2] = uVar4;
  *unaff_x19 = 2;
  func_0x004a8a78(&uStack0000000000000150);
  return;
}

