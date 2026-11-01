
void FUN_00213a48(void)

{
  long lVar1;
  dword *pdVar2;
  long unaff_x19;
  ulong unaff_x21;
  long *unaff_x25;
  undefined1 auVar3 [16];
  undefined1 uStack00000000000001e8;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  long lStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  long lStack_90;
  long lStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined1 uStack_28;
  
  if ((unaff_x21 | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4();
  }
  lVar1 = *unaff_x25;
  *unaff_x25 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9b44(&uStack00000000000001e8);
  }
  if (*(long *)(unaff_x19 + 0x80) != -0x7ffffffffffffffe) {
    func_0x00208e34();
  }
  func_0x00207f98(unaff_x19 + 0x68);
  pdVar2 = &MACH_HEADER.cpusubtype;
  func_0x00187bd4();
  __Unwind_Resume();
  auVar3 = func_0x007a2668();
  lVar1 = auVar3._8_8_;
  if (lVar1 == 0) {
    lVar1 = 0;
    lStack_90 = 8;
  }
  else {
    lStack_90 = *(long *)(lVar1 + 8);
    lVar1 = *(long *)(lVar1 + 0x10);
  }
  uStack_80 = 0;
  uStack_78 = 0;
  lStack_88 = lStack_90 + lVar1 * 0x18;
  uStack_70 = 0;
  uStack_c0 = 1;
  lStack_b8 = 0;
  uStack_a8 = 1;
  uStack_a0 = 0;
  func_0x001a4cd4(&uStack_d8,&uStack_c0,&UNK_009c2508);
  uStack_b0 = *(undefined8 *)(pdVar2 + 2);
  lVar1 = *(long *)pdVar2;
  lStack_b8 = 0;
  if (lVar1 != -0x8000000000000000) {
    lStack_b8 = lVar1;
  }
  else {
    uStack_b0 = 1;
  }
  uStack_a8 = 0;
  if (lVar1 != -0x8000000000000000) {
    uStack_a8 = *(undefined8 *)(pdVar2 + 4);
  }
  uStack_a0 = uStack_d8;
  lStack_90 = uStack_c8;
  uStack_98 = uStack_d0;
  uStack_28 = 8;
  uStack_c0 = 0x8000000000000005;
  func_0x0024a370(auVar3._0_8_,&uStack_c0);
  return;
}

