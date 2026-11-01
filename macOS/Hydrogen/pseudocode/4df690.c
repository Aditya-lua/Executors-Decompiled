
void FUN_004df690(long param_1)

{
  long lVar1;
  long unaff_x19;
  
code_r0x004df690:
  if (param_1 != 0) goto LAB_004df7b0;
LAB_004df694:
  lVar1 = *(long *)(unaff_x19 + 0x140);
  if (lVar1 != 0) goto LAB_004df7cc;
LAB_004df69c:
  lVar1 = *(long *)(unaff_x19 + 0x158);
  if (lVar1 != 0) goto LAB_004df7e4;
LAB_004df6a4:
  lVar1 = *(long *)(unaff_x19 + 0x170);
  if (lVar1 != 0) goto LAB_004df7fc;
LAB_004df6ac:
  lVar1 = *(long *)(unaff_x19 + 0x188);
  if (lVar1 != 0) goto LAB_004df814;
LAB_004df6b4:
  lVar1 = *(long *)(unaff_x19 + 0x1a0);
  do {
    if (lVar1 != 0) {
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x1a8),lVar1 << 4,8);
    }
    func_0x004df838(unaff_x19 + 0x1b8);
    __Unwind_Resume();
    func_0x00187bd4();
    if (*(long *)(unaff_x19 + 0x68) == 0) {
      lVar1 = *(long *)(unaff_x19 + 0x80);
      if (lVar1 != 0) goto code_r0x004df708;
LAB_004df65c:
      lVar1 = *(long *)(unaff_x19 + 0x98);
      if (lVar1 != 0) goto code_r0x004df720;
LAB_004df664:
      lVar1 = *(long *)(unaff_x19 + 0xb0);
      if (lVar1 != 0) goto code_r0x004df738;
LAB_004df66c:
      lVar1 = *(long *)(unaff_x19 + 200);
      if (lVar1 != 0) goto code_r0x004df750;
LAB_004df674:
      lVar1 = *(long *)(unaff_x19 + 0xe0);
      if (lVar1 != 0) goto code_r0x004df768;
LAB_004df67c:
      lVar1 = *(long *)(unaff_x19 + 0xf8);
      if (lVar1 != 0) goto code_r0x004df780;
LAB_004df684:
      lVar1 = *(long *)(unaff_x19 + 0x110);
    }
    else {
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x70),*(long *)(unaff_x19 + 0x68) << 4,8);
      lVar1 = *(long *)(unaff_x19 + 0x80);
      if (lVar1 == 0) goto LAB_004df65c;
code_r0x004df708:
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x88),lVar1 << 4,8);
      lVar1 = *(long *)(unaff_x19 + 0x98);
      if (lVar1 == 0) goto LAB_004df664;
code_r0x004df720:
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0xa0),lVar1 << 4,8);
      lVar1 = *(long *)(unaff_x19 + 0xb0);
      if (lVar1 == 0) goto LAB_004df66c;
code_r0x004df738:
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0xb8),lVar1 << 5,8);
      lVar1 = *(long *)(unaff_x19 + 200);
      if (lVar1 == 0) goto LAB_004df674;
code_r0x004df750:
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0xd0),lVar1 << 5,8);
      lVar1 = *(long *)(unaff_x19 + 0xe0);
      if (lVar1 == 0) goto LAB_004df67c;
code_r0x004df768:
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0xe8),lVar1 << 5,8);
      lVar1 = *(long *)(unaff_x19 + 0xf8);
      if (lVar1 == 0) goto LAB_004df684;
code_r0x004df780:
      func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x100),lVar1 << 4,8);
      lVar1 = *(long *)(unaff_x19 + 0x110);
    }
    if (lVar1 == 0) {
      param_1 = *(long *)(unaff_x19 + 0x128);
      goto code_r0x004df690;
    }
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x118),lVar1 << 4,8);
    param_1 = *(long *)(unaff_x19 + 0x128);
    if (param_1 == 0) goto LAB_004df694;
LAB_004df7b0:
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x130),param_1 * 0x18,8);
    lVar1 = *(long *)(unaff_x19 + 0x140);
    if (lVar1 == 0) goto LAB_004df69c;
LAB_004df7cc:
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x148),lVar1 << 3,4);
    lVar1 = *(long *)(unaff_x19 + 0x158);
    if (lVar1 == 0) goto LAB_004df6a4;
LAB_004df7e4:
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x160),lVar1 << 4,8);
    lVar1 = *(long *)(unaff_x19 + 0x170);
    if (lVar1 == 0) goto LAB_004df6ac;
LAB_004df7fc:
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 0x178),lVar1 << 4,8);
    lVar1 = *(long *)(unaff_x19 + 0x188);
    if (lVar1 == 0) goto LAB_004df6b4;
LAB_004df814:
    func_0x00187bd4(*(undefined8 *)(unaff_x19 + 400),lVar1 * 0x30,8);
    lVar1 = *(long *)(unaff_x19 + 0x1a0);
  } while( true );
}

