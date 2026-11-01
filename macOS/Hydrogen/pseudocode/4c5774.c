
void FUN_004c5774(undefined1 param_1 [16],undefined1 param_2 [16],undefined1 param_3 [16])

{
  code *pcVar1;
  undefined8 uVar2;
  undefined8 unaff_x21;
  long unaff_x25;
  long unaff_x26;
  undefined1 auStack_7ffffffe [2147483646];
  
  uVar2 = *(undefined8 *)(unaff_x25 + 0x360);
  *(long *)(unaff_x26 + 0x70) = param_3._8_8_;
  *(long *)(unaff_x26 + 0x68) = param_3._0_8_;
  *(long *)(unaff_x26 + 0x80) = param_2._8_8_;
  *(long *)(unaff_x26 + 0x78) = param_2._0_8_;
  *(undefined8 *)(unaff_x26 + 0x10) = uVar2;
  *(undefined8 *)(unaff_x26 + 0x18) = unaff_x21;
  *(undefined8 *)(unaff_x26 + 0x28) = *(undefined8 *)(unaff_x26 + 0x138);
  *(undefined8 *)(unaff_x26 + 0x20) = *(undefined8 *)(unaff_x26 + 0x130);
  *(undefined8 *)(unaff_x26 + 0x38) = *(undefined8 *)(unaff_x26 + 0x148);
  *(undefined8 *)(unaff_x26 + 0x30) = *(undefined8 *)(unaff_x26 + 0x140);
  *(undefined8 *)(unaff_x26 + 0x48) = *(undefined8 *)(unaff_x26 + 0x158);
  *(undefined8 *)(unaff_x26 + 0x40) = *(undefined8 *)(unaff_x26 + 0x150);
  *(undefined8 *)(unaff_x26 + 0x50) = *(undefined8 *)(unaff_x26 + 0x160);
  func_0x007a2810(&UNK_008a2019,0x2b,auStack_7ffffffe + 0x8000066e,&UNK_009e5948,&UNK_009e6288);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4c5944);
  (*pcVar1)();
}

