
void FUN_005264e8(void)

{
  code *pcVar1;
  bool bVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  long *unaff_x19;
  long unaff_x21;
  long unaff_x28;
  long unaff_x29;
  undefined1 auStack_7ffffffe [2147483646];
  
  if (unaff_x21 == 0) {
    lVar3 = 1;
    _memcpy(1);
    lVar4 = *unaff_x19;
  }
  else {
    lVar3 = func_0x00187bd0();
    if (lVar3 == 0) {
      func_0x007a1f00(1);
      func_0x007a1f00();
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x52741c);
      (*pcVar1)();
    }
    _memcpy();
    lVar4 = *unaff_x19;
  }
  if (lVar4 != 0) {
    func_0x00187bd4();
  }
  *unaff_x19 = unaff_x21;
  unaff_x19[1] = lVar3;
  unaff_x19[2] = unaff_x21;
  *(undefined **)(unaff_x29 + -0xf0) = &UNK_009ea698;
  *(undefined **)(unaff_x29 + -0xe8) = &DAT_00519924;
  func_0x0046849c();
  if (((*(byte *)(unaff_x28 + 0x2bd) >> 5 & 1) == 0) &&
     ((*(byte *)(unaff_x28 + 0x2c1) >> 5 & 1) == 0)) {
    func_0x005277b0();
  }
  else {
    bVar2 = *(long *)(unaff_x28 + 0x128) != -0x8000000000000000;
    lVar3 = 0x230;
    if (bVar2) {
      lVar3 = 0x130;
    }
    lVar4 = 0x238;
    if (bVar2) {
      lVar4 = 0x138;
    }
    if (*(long *)(unaff_x28 + 0x1e8) != -0x8000000000000000) {
      lVar4 = 0x1f8;
      lVar3 = 0x1f0;
    }
    uVar5 = *(undefined8 *)(unaff_x28 + lVar4);
    *(undefined8 *)(unaff_x29 + -0x88) = *(undefined8 *)(unaff_x28 + lVar3);
    *(undefined8 *)(unaff_x29 + -0x80) = uVar5;
    *(long *)(unaff_x29 + -0xf0) = unaff_x29 + -0x70;
    *(undefined **)(unaff_x29 + -0xe8) = &DAT_00524310;
    *(long *)(unaff_x29 + -0xe0) = unaff_x29 + -0x88;
    *(undefined **)(unaff_x29 + -0xd8) = &DAT_00519924;
    func_0x0046849c();
  }
  *(undefined1 **)(unaff_x29 + -0xf0) = auStack_7ffffffe + 0x800004c6;
  *(undefined **)(unaff_x29 + -0xe8) = &DAT_00524310;
  *(long *)(unaff_x29 + -0xe0) = unaff_x29 + -0xa0;
  *(undefined **)(unaff_x29 + -0xd8) = &DAT_00519924;
  func_0x0046849c();
  return;
}

