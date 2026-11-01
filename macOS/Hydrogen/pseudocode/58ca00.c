
void FUN_0058ca00(void)

{
  code *pcVar1;
  long lVar2;
  undefined8 extraout_x8;
  undefined *puVar3;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  undefined8 uVar4;
  long unaff_x22;
  undefined8 unaff_x23;
  ulong uVar5;
  undefined8 *unaff_x25;
  code *unaff_x27;
  long unaff_x29;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  
  lVar2 = (*unaff_x27)(unaff_x22 + 1);
  *(undefined8 *)(lVar2 + 8) = extraout_x8;
  if (unaff_x20 == 0) {
    *(undefined8 *)(unaff_x29 + -0x80) = 0;
    *(undefined8 *)(unaff_x29 + -0x78) = 0;
    puVar3 = &UNK_0089eb70;
    lVar2 = 8;
    *(undefined8 *)(unaff_x29 + -0x70) = 0;
code_r0x0058ca28:
    unaff_x19[5] = in_stack_00000030;
    unaff_x19[4] = in_stack_00000028;
    unaff_x19[7] = in_stack_00000040;
    unaff_x19[6] = in_stack_00000038;
    unaff_x19[1] = in_stack_00000010;
    *unaff_x19 = in_stack_00000008;
    unaff_x19[3] = in_stack_00000020;
    unaff_x19[2] = in_stack_00000018;
    unaff_x19[8] = in_stack_00000048;
    unaff_x19[9] = unaff_x20;
    unaff_x19[10] = lVar2;
    unaff_x19[0xb] = 0;
    unaff_x19[0xc] = puVar3;
    uVar4 = *unaff_x25;
    unaff_x19[0xe] = unaff_x25[1];
    unaff_x19[0xd] = uVar4;
    unaff_x19[0xf] = *(undefined8 *)(unaff_x29 + -0x70);
    unaff_x19[0x10] = unaff_x22;
    unaff_x19[0x11] = unaff_x23;
    return;
  }
  func_0x005950a0(unaff_x29 + -0x80);
  uVar4 = 0;
  uVar6 = unaff_x25[1];
  puVar3 = (undefined *)*unaff_x25;
  uVar8 = unaff_x25[3];
  uVar7 = unaff_x25[2];
  uVar5 = unaff_x20 * 0x10;
  if ((unaff_x20 >> 0x3c == 0) && (uVar5 < 0x7ffffffffffffff9)) {
    uVar4 = 8;
    lVar2 = func_0x00187bd0(uVar5,8);
    if (lVar2 != 0) {
      unaff_x25[1] = uVar7;
      *unaff_x25 = uVar6;
      *(undefined8 *)(unaff_x29 + -0x70) = uVar8;
      goto code_r0x0058ca28;
    }
  }
  func_0x007a1f00(uVar4,uVar5,&UNK_009f0de8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x58ca9c);
  (*pcVar1)();
}

