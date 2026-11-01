
/* WARNING: Possible PIC construction at 0x006127ec: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x006127f0) */
/* WARNING: Removing unreachable block (ram,0x006127f8) */

ulong FUN_006125ec(void)

{
  byte bVar1;
  undefined1 *puVar2;
  ulong uVar3;
  undefined8 *puVar4;
  long *plVar5;
  long lVar6;
  long *plVar7;
  undefined1 *puVar8;
  long *unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  undefined *unaff_x22;
  undefined1 *unaff_x23;
  long unaff_x24;
  undefined1 *unaff_x29;
  undefined8 uVar9;
  undefined1 auVar10 [12];
  undefined1 auVar11 [16];
  
  lVar6 = unaff_x24;
  if (unaff_x23 == (undefined1 *)0x0) {
    if (unaff_x22 == (undefined *)0x0) goto LAB_0061262c;
  }
  else {
    _memcpy();
  }
  for (; lVar6 != 0; lVar6 = lVar6 + -1) {
    unaff_x22[lVar6 + -1] = 0;
    unaff_x24 = 0;
  }
  func_0x00611644();
LAB_0061262c:
  *(ulong *)(unaff_x20 + 0x10) = unaff_x21;
  *(undefined1 **)(unaff_x20 + 0x18) = unaff_x23;
  *(undefined8 *)(unaff_x20 + 8) = 0xffffffffffffffff;
  func_0x006853e4();
  uVar3 = (**(code **)(*unaff_x19 + 0xb0))();
  if (unaff_x21 == uVar3) {
    return unaff_x21;
  }
  puVar4 = (undefined8 *)___cxa_allocate_exception(0x28);
  *(undefined4 *)(puVar4 + 1) = 1;
  puVar4[2] = 0x6f63656420524542;
  puVar4[3] = 0x726f727265206564;
  *(undefined1 *)(puVar4 + 4) = 0;
  *(undefined1 *)((long)puVar4 + 0x27) = 0x10;
  *puVar4 = &UNK_009f60b8;
  uVar9 = 0x6126dc;
  auVar11 = ___cxa_throw(puVar4,&UNK_009f6090,&DAT_0060f08c);
  puVar2 = (undefined1 *)register0x00000008;
  while( true ) {
    plVar7 = auVar11._8_8_;
    plVar5 = auVar11._0_8_;
    *(long *)(puVar2 + -0x40) = unaff_x24;
    *(undefined1 **)(puVar2 + -0x38) = unaff_x23;
    *(undefined **)(puVar2 + -0x30) = unaff_x22;
    *(ulong *)(puVar2 + -0x28) = unaff_x21;
    *(ulong *)(puVar2 + -0x20) = unaff_x20;
    *(long **)(puVar2 + -0x18) = unaff_x19;
    *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
    *(undefined8 *)(puVar2 + -8) = uVar9;
    unaff_x29 = puVar2 + -0x10;
    *(undefined8 *)(puVar2 + -0x48) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    (**(code **)(*plVar5 + 0xb8))(plVar5,puVar2 + -0xe1);
    unaff_x21 = (ulong)(byte)puVar2[-0xe1];
    func_0x005edf2c(puVar2 + -0x80,0);
    unaff_x23 = puVar2 + -0x80;
    *(undefined4 *)(puVar2 + -0x68) = 0xffffffff;
    puVar2[-100] = 0;
    unaff_x22 = &UNK_009f68a0;
    *(undefined **)(puVar2 + -0x80) = &UNK_009f68a0;
    *(undefined **)(puVar2 + -0x78) = &UNK_009f6a38;
    *(long **)(puVar2 + -0x60) = plVar5;
    *(undefined8 *)(puVar2 + -0x58) = 0;
    puVar2[-0x50] = 0;
    func_0x00613e90(puVar2 + -0x80,unaff_x21);
    bVar1 = puVar2[-0xe1];
    unaff_x20 = (ulong)bVar1;
    func_0x0069862c(puVar2 + -0xd8,0);
    *(undefined **)(puVar2 + -0xd8) = &UNK_009f6a68;
    *(undefined **)(puVar2 + -0xd0) = &UNK_009f6bf8;
    *(long **)(puVar2 + -0x90) = plVar7;
    puVar2[-0x88] = bVar1;
    puVar2[-0x87] = 0;
    if (puVar2[-0x4f] != '\0') break;
    lVar6 = func_0x005f1624(*(undefined8 *)(puVar2 + -0x60),puVar2 + -0xe0,1);
    if (lVar6 == 2 && *(short *)(puVar2 + -0xe0) == 0) goto LAB_00612800;
    auVar11._8_8_ = puVar2 + -0xd8;
    auVar11._0_8_ = puVar2 + -0x80;
    uVar9 = 0x6127f0;
    puVar2 = puVar2 + -0xf0;
    unaff_x19 = plVar7;
  }
  *(undefined8 *)(puVar2 + -0xe0) = *(undefined8 *)(puVar2 + -0x58);
  (**(code **)(*(long *)(puVar2 + -0x80) + 0x118))
            (puVar2 + -0x80,puVar2 + -0xd8,puVar2 + -0xe0,&UNK_008ba5c8,1);
LAB_00612800:
  func_0x00612a40(puVar2 + -0x80);
  puVar2[-0x87] = 1;
  uVar9 = func_0x00698d50(puVar2 + -0xd8);
  puVar2[-0xe0] = puVar2[-0x88];
  (**(code **)(**(long **)(puVar2 + -0x90) + 0x38))(*(long **)(puVar2 + -0x90),puVar2 + -0xe0,1,0,1)
  ;
  func_0x00611648(*(undefined8 *)(puVar2 + -0x90),uVar9);
  *(undefined8 *)(puVar2 + -0xe0) = 0xffffffffffffffff;
  puVar8 = puVar2 + -0xe0;
  (**(code **)(*(long *)(puVar2 + -0xd8) + 0x118))
            (puVar2 + -0xd8,*(undefined8 *)(puVar2 + -0x90),puVar8,&UNK_008ba5c8,1);
  uVar3 = func_0x006143a8(puVar2 + -0xd8);
  *(undefined **)(puVar2 + -0x80) = &UNK_009f68a0;
  *(undefined **)(puVar2 + -0x78) = &UNK_009f6a38;
  if (puVar2[-0x50] == '\0') {
    uVar3 = func_0x00612a40(puVar2 + -0x80);
  }
  while( true ) {
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar2 + -0x48)) {
      return uVar3;
    }
    auVar10 = ___stack_chk_fail();
    uVar9 = auVar10._0_8_;
    if (auVar10._8_4_ == 0) break;
    if (auVar10._8_4_ != 2) {
      uVar9 = func_0x0001753c(uVar9);
      func_0x00612ba4(puVar2 + -0x80);
      uVar9 = __Unwind_Resume(uVar9);
      break;
    }
    ___cxa_begin_catch(uVar9);
    uVar3 = ___cxa_end_catch();
  }
  uVar9 = __Unwind_Resume(uVar9);
  func_0x006143a8(puVar2 + -0xd8);
  func_0x00612ba4(puVar2 + -0x80);
  auVar11 = __Unwind_Resume(uVar9);
  *(undefined **)(puVar2 + -0x120) = &UNK_009f68a0;
  *(ulong *)(puVar2 + -0x118) = unaff_x21;
  *(ulong *)(puVar2 + -0x110) = unaff_x20;
  *(undefined8 *)(puVar2 + -0x108) = uVar9;
  *(undefined1 **)(puVar2 + -0x100) = unaff_x29;
  *(undefined8 *)(puVar2 + -0xf8) = 0x612940;
  puVar4 = (undefined8 *)func_0x005edf2c(auVar11._0_8_,0);
  *(undefined4 *)(puVar4 + 3) = 0xffffffff;
  *(undefined1 *)((long)puVar4 + 0x1c) = 0;
  *puVar4 = &UNK_009f68a0;
  puVar4[1] = &UNK_009f6a38;
  puVar4[4] = auVar11._8_8_;
  puVar4[5] = 0;
  *(undefined1 *)(puVar4 + 6) = 0;
  func_0x00613e90(puVar4,puVar8);
  return auVar11._0_8_;
}

