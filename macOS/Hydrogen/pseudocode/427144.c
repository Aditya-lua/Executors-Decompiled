
void FUN_00427144(void)

{
  uint uVar1;
  code *pcVar2;
  int iVar3;
  uint *puVar4;
  long *unaff_x19;
  ulong uVar5;
  undefined4 unaff_w23;
  ulong unaff_x24;
  long unaff_x29;
  undefined1 auVar6 [16];
  long in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  long in_stack_00000038;
  long in_stack_00000040;
  undefined1 uStack000000000000004c;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  
  auVar6 = func_0x00430c40(&uStack000000000000004c,&uStack0000000000000030);
  if ((auVar6._0_8_ & 1) != 0) {
    *(long *)(unaff_x29 + -0x38) = auVar6._8_8_;
    func_0x007a2810(&UNK_008851be,0x2b,unaff_x29 + -0x38,&UNK_009d93d8,&UNK_009daf30);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4272cc);
    (*pcVar2)();
  }
  _close();
  if ((unaff_x24 & 1) == 0) {
    *(undefined4 *)(unaff_x29 + -0x38) = 0;
    do {
      iVar3 = _waitpid();
      if (iVar3 != -1) {
        unaff_w23 = *(undefined4 *)(unaff_x29 + -0x38);
        goto LAB_004271e4;
      }
      puVar4 = (uint *)___error();
      uVar1 = *puVar4;
    } while (uVar1 == 4);
    if (uStack0000000000000030 != 0) {
      func_0x00187bd4(in_stack_00000038,uStack0000000000000030,1);
    }
    uVar5 = (ulong)uVar1 << 0x20 | 2;
    if (in_stack_00000018 != 0) {
      func_0x00187bd4(in_stack_00000020,in_stack_00000018,1);
    }
  }
  else {
LAB_004271e4:
    uVar5 = in_stack_00000020;
    if (in_stack_00000018 != -0x8000000000000000) {
      unaff_x19[4] = in_stack_00000038;
      unaff_x19[3] = uStack0000000000000030;
      unaff_x19[5] = in_stack_00000040;
      *unaff_x19 = in_stack_00000018;
      unaff_x19[1] = in_stack_00000020;
      unaff_x19[2] = in_stack_00000028;
      *(undefined4 *)(unaff_x19 + 6) = unaff_w23;
      return;
    }
  }
  *unaff_x19 = -0x8000000000000000;
  unaff_x19[1] = uVar5;
  return;
}

