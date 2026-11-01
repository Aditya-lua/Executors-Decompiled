
void FUN_004934b0(long param_1)

{
  long lVar1;
  long unaff_x19;
  
code_r0x004934b0:
  if (param_1 == 0) goto LAB_00493354;
code_r0x004934b4:
  func_0x00187bd4(*(undefined8 *)(unaff_x19 + 400),param_1 * 0x30,8);
  lVar1 = *(long *)(unaff_x19 + 0x1a0);
  do {
    if (lVar1 != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x1a8),lVar1 << 4,8);
    }
    func_0x0049366c(unaff_x19 + 0x1b8);
    __Unwind_Resume();
    func_0x00187bd4();
    if (*(long *)(unaff_x19 + 0x68) == 0) {
      lVar1 = *(long *)(unaff_x19 + 0x80);
      if (lVar1 != 0) goto code_r0x004933a8;
code_r0x004932fc:
      lVar1 = *(long *)(unaff_x19 + 0x98);
      if (lVar1 != 0) goto code_r0x004933c0;
code_r0x00493304:
      lVar1 = *(long *)(unaff_x19 + 0xb0);
      if (lVar1 != 0) goto code_r0x004933d8;
code_r0x0049330c:
      lVar1 = *(long *)(unaff_x19 + 200);
      if (lVar1 != 0) goto code_r0x004933f0;
code_r0x00493314:
      lVar1 = *(long *)(unaff_x19 + 0xe0);
      if (lVar1 != 0) goto code_r0x00493408;
code_r0x0049331c:
      lVar1 = *(long *)(unaff_x19 + 0xf8);
      if (lVar1 != 0) goto code_r0x00493420;
code_r0x00493324:
      lVar1 = *(long *)(unaff_x19 + 0x110);
      if (lVar1 != 0) goto code_r0x00493438;
code_r0x0049332c:
      lVar1 = *(long *)(unaff_x19 + 0x128);
      if (lVar1 != 0) goto code_r0x00493450;
code_r0x00493334:
      lVar1 = *(long *)(unaff_x19 + 0x140);
      if (lVar1 != 0) goto code_r0x0049346c;
code_r0x0049333c:
      lVar1 = *(long *)(unaff_x19 + 0x158);
      if (lVar1 != 0) goto code_r0x00493484;
code_r0x00493344:
      lVar1 = *(long *)(unaff_x19 + 0x170);
    }
    else {
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x70),*(long *)(unaff_x19 + 0x68) << 4,8);
      lVar1 = *(long *)(unaff_x19 + 0x80);
      if (lVar1 == 0) goto code_r0x004932fc;
code_r0x004933a8:
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x88),lVar1 << 4,8);
      lVar1 = *(long *)(unaff_x19 + 0x98);
      if (lVar1 == 0) goto code_r0x00493304;
code_r0x004933c0:
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0xa0),lVar1 << 4,8);
      lVar1 = *(long *)(unaff_x19 + 0xb0);
      if (lVar1 == 0) goto code_r0x0049330c;
code_r0x004933d8:
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0xb8),lVar1 << 5,8);
      lVar1 = *(long *)(unaff_x19 + 200);
      if (lVar1 == 0) goto code_r0x00493314;
code_r0x004933f0:
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0xd0),lVar1 << 5,8);
      lVar1 = *(long *)(unaff_x19 + 0xe0);
      if (lVar1 == 0) goto code_r0x0049331c;
code_r0x00493408:
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0xe8),lVar1 << 5,8);
      lVar1 = *(long *)(unaff_x19 + 0xf8);
      if (lVar1 == 0) goto code_r0x00493324;
code_r0x00493420:
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x100),lVar1 << 4,8);
      lVar1 = *(long *)(unaff_x19 + 0x110);
      if (lVar1 == 0) goto code_r0x0049332c;
code_r0x00493438:
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x118),lVar1 << 4,8);
      lVar1 = *(long *)(unaff_x19 + 0x128);
      if (lVar1 == 0) goto code_r0x00493334;
code_r0x00493450:
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x130),lVar1 * 0x18,8);
      lVar1 = *(long *)(unaff_x19 + 0x140);
      if (lVar1 == 0) goto code_r0x0049333c;
code_r0x0049346c:
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x148),lVar1 << 3,4);
      lVar1 = *(long *)(unaff_x19 + 0x158);
      if (lVar1 == 0) goto code_r0x00493344;
code_r0x00493484:
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x160),lVar1 << 4,8);
      lVar1 = *(long *)(unaff_x19 + 0x170);
    }
    if (lVar1 != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x178),lVar1 << 4,8);
      param_1 = *(long *)(unaff_x19 + 0x188);
      goto code_r0x004934b0;
    }
    param_1 = *(long *)(unaff_x19 + 0x188);
    if (param_1 != 0) goto code_r0x004934b4;
LAB_00493354:
    lVar1 = *(long *)(unaff_x19 + 0x1a0);
  } while( true );
}

