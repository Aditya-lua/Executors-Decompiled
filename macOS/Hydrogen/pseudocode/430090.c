
undefined1  [16] FUN_00430090(void)

{
  code *pcVar1;
  int iVar2;
  uint uVar3;
  long *plVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  ulong extraout_x1;
  ulong extraout_x1_00;
  ulong uVar8;
  undefined *puVar9;
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 uStack000000000000000c;
  undefined1 uStack0000000000000010;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined4 uStack_f8;
  long lStack_f0;
  undefined *puStack_e8;
  undefined8 uStack_e0;
  long *plStack_d8;
  undefined1 *puStack_d0;
  undefined *puStack_c8;
  ulong uStack_b8;
  undefined1 auStack_b0 [64];
  int iStack_70;
  int iStack_6c;
  int iStack_68;
  int iStack_64;
  undefined8 auStack_60 [6];
  undefined1 auStack_6 [6];
  
  _uStack0000000000000010 = 0;
  puVar9 = &UNK_0081a9a8;
  auVar10 = func_0x0079ffdc(0,&uStack000000000000000c,&UNK_0081a9a8,&uStack0000000000000010,
                            &UNK_009db8e8);
  auVar10._8_8_ = auVar10._8_8_;
  auVar10._0_8_ = auVar10._0_8_;
  plVar4 = (long *)func_0x00187bd0(0x10,8);
  if (plVar4 == (long *)0x0) {
    func_0x007a1f18(8,0x10);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x430200);
    (*pcVar1)();
  }
  *plVar4 = auVar10._8_8_;
  plVar4[1] = (long)puVar9;
  uStack_b8 = 0;
  iStack_70 = _pthread_attr_init(auStack_b0);
  if (iStack_70 == 0) {
    if (auVar10._0_8_ < &UNK_00004001) {
      auVar10._0_8_ = (undefined *)0x4000;
    }
    iVar2 = _pthread_attr_setstacksize(auStack_b0,auVar10._0_8_);
    if (iVar2 == 0) {
LAB_0043015c:
      uVar3 = _pthread_create(&uStack_b8,auStack_b0,&DAT_004302dc,plVar4);
      iStack_64 = _pthread_attr_destroy(auStack_b0);
      if (iStack_64 == 0) {
        if (uVar3 == 0) {
          uVar6 = 0;
        }
        else {
          auVar10._8_8_ = *plVar4;
          puVar7 = (undefined8 *)plVar4[1];
          if ((code *)*puVar7 != (code *)0x0) {
            (*(code *)*puVar7)(auVar10._8_8_);
          }
          if (puVar7[1] != 0) {
            func_0x00187bd4(auVar10._8_8_,puVar7[1],puVar7[2]);
          }
          func_0x00187bd4(plVar4,0x10,8);
          uStack_b8 = (ulong)uVar3 << 0x20 | 2;
          uVar6 = 1;
        }
        auVar11._8_8_ = uStack_b8;
        auVar11._0_8_ = uVar6;
        return auVar11;
      }
      goto code_r0x00430224;
    }
    iStack_6c = iVar2;
    if (iVar2 == 0x16) {
      lVar5 = _sysconf(0x1d);
      iStack_68 = _pthread_attr_setstacksize
                            (auStack_b0,(ulong)(auVar10._0_8_ + lVar5 + -1) & -lVar5);
      if (iStack_68 != 0) goto LAB_0043026c;
      goto LAB_0043015c;
    }
  }
  else {
    auStack_60[0] = 0;
    func_0x0079ffdc(0,&iStack_70,&UNK_0081a9a8,auStack_60,&UNK_009db948);
code_r0x00430224:
    auStack_60[0] = 0;
    func_0x0079ffdc(0,&iStack_64,&UNK_0081a9a8,auStack_60,&UNK_009db900);
  }
  auStack_60[0] = 0;
  func_0x0079ffdc(0,&iStack_6c,&UNK_008884a8,auStack_60,&UNK_009db930);
LAB_0043026c:
  auStack_60[0] = 0;
  uVar6 = func_0x0079ffdc(0,&iStack_68,&UNK_0081a9a8,auStack_60,&UNK_009db918);
  if (*(long *)(auVar10._8_8_ + 8) != 0) {
    func_0x00187bd4(puVar9,*(long *)(auVar10._8_8_ + 8),*(undefined8 *)(auVar10._8_8_ + 0x10));
  }
  func_0x00187bd4(plVar4,0x10,8);
  uVar6 = __Unwind_Resume(uVar6);
  func_0x003f58cc(auVar10._8_8_,puVar9);
  __Unwind_Resume(uVar6);
  puVar7 = (undefined8 *)func_0x007a2668();
  puStack_c8 = &DAT_004302dc;
  lStack_f0 = auVar10._8_8_;
  puStack_e8 = puVar9;
  uStack_e0 = uVar6;
  plStack_d8 = plVar4;
  puStack_d0 = auStack_6 + -10;
  lVar5 = func_0x0042fcc4(0);
  uVar6 = *puVar7;
  auVar10._8_8_ = puVar7[1];
  (**(code **)(auVar10._8_8_ + 0x18))(uVar6);
  if (*(long *)(auVar10._8_8_ + 8) != 0) {
    func_0x00187bd4(uVar6,*(long *)(auVar10._8_8_ + 8),*(undefined8 *)(auVar10._8_8_ + 0x10));
  }
  func_0x00187bd4(puVar7,0x10,8);
  auVar10._8_8_ = lRam0000000000a3bff0;
  uVar8 = extraout_x1;
  if (lVar5 != 0) {
    uStack_108 = 0;
    uStack_100 = 0x20000;
    uStack_f8 = 4;
    _sigaltstack(&uStack_108,0);
    _munmap(lVar5 - auVar10._8_8_,auVar10._8_8_ + 0x20000);
    uVar8 = extraout_x1_00;
  }
  auVar10._8_8_ = 0;
  auVar10._0_8_ = uVar8;
  return auVar10 << 0x40;
}

