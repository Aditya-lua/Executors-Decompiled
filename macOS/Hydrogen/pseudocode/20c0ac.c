
void FUN_0020c0ac(void)

{
  code *pcVar1;
  undefined8 *unaff_x20;
  ulong unaff_x21;
  long unaff_x29;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  if (0x40 < unaff_x21) {
    func_0x007a28b0();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x20c154);
    (*pcVar1)();
  }
  *(undefined8 *)(unaff_x29 + -0x58) = 0;
  *(undefined8 *)(unaff_x29 + -0x60) = 0;
  *(undefined8 *)(unaff_x29 + -0x48) = 0;
  *(undefined8 *)(unaff_x29 + -0x50) = 0;
  *(undefined8 *)(unaff_x29 + -0x78) = 0;
  *(undefined8 *)(unaff_x29 + -0x80) = 0;
  *(undefined8 *)(unaff_x29 + -0x68) = 0;
  *(undefined8 *)(unaff_x29 + -0x70) = 0;
  *(ulong *)(unaff_x29 + -0x40) = unaff_x21;
  _memcpy(unaff_x29 + -0x80);
  uVar2 = *(undefined8 *)(unaff_x29 + -0x60);
  uVar4 = *(undefined8 *)(unaff_x29 + -0x48);
  uVar3 = *(undefined8 *)(unaff_x29 + -0x50);
  unaff_x20[5] = *(undefined8 *)(unaff_x29 + -0x58);
  unaff_x20[4] = uVar2;
  unaff_x20[7] = uVar4;
  unaff_x20[6] = uVar3;
  unaff_x20[8] = *(undefined8 *)(unaff_x29 + -0x40);
  uVar4 = *(undefined8 *)(unaff_x29 + -0x80);
  uVar3 = *(undefined8 *)(unaff_x29 + -0x68);
  uVar2 = *(undefined8 *)(unaff_x29 + -0x70);
  unaff_x20[1] = *(undefined8 *)(unaff_x29 + -0x78);
  *unaff_x20 = uVar4;
  unaff_x20[3] = uVar3;
  unaff_x20[2] = uVar2;
  func_0x00187bd4();
  return;
}

