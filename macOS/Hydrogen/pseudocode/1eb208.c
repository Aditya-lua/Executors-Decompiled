
void FUN_001eb208(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  undefined1 auVar7 [16];
  undefined1 auStack_190 [16];
  long lStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  long lStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  func_0x00187bd4();
  auVar7 = __Unwind_Resume();
  puVar2 = auVar7._0_8_;
  auVar7 = func_0x00169ec0(auVar7._8_8_);
  if (auVar7._0_8_ == 4) {
    puVar3 = (undefined8 *)func_0x00187bd0(0x10,8);
    if (puVar3 != (undefined8 *)0x0) {
      puVar3[1] = 1;
      *puVar3 = 1;
      *puVar2 = 0x8000000000000026;
      puVar2[1] = puVar3;
      puVar2[2] = &UNK_009c8188;
      return;
    }
    func_0x007a1f18(8,0x10);
  }
  else {
    auStack_190 = auVar7;
    func_0x002709c8(&lStack_e0,auStack_190);
    if (lStack_e0 != 4) {
      uStack_108 = uStack_68;
      uStack_110 = uStack_70;
      uStack_f8 = uStack_58;
      uStack_100 = uStack_60;
      uStack_e8 = uStack_48;
      uStack_f0 = uStack_50;
      uStack_148 = uStack_a8;
      uStack_150 = uStack_b0;
      uStack_138 = uStack_98;
      uStack_140 = uStack_a0;
      uStack_128 = uStack_88;
      uStack_130 = uStack_90;
      uStack_118 = uStack_78;
      uStack_120 = uStack_80;
      uStack_168 = uStack_c8;
      uStack_170 = uStack_d0;
      uStack_158 = uStack_b8;
      uStack_160 = uStack_c0;
      lStack_180 = lStack_e0;
      uStack_178 = uStack_d8;
      auVar7 = func_0x00270ff8(&lStack_180);
      lVar5 = auVar7._8_8_;
      if (lVar5 < 0) {
        uVar6 = 0;
      }
      else {
        if (lVar5 == 0) {
          lVar4 = 1;
LAB_001eb36c:
          _memcpy(lVar4,auVar7._0_8_,lVar5);
          func_0x002d8de8(uStack_178);
          puVar2[2] = lVar4;
          puVar2[3] = lVar5;
          *(undefined1 (*) [16])(puVar2 + 4) = auStack_190;
          *puVar2 = 0x8000000000000027;
          puVar2[1] = lVar5;
          return;
        }
        uVar6 = 1;
        lVar4 = func_0x00187bd0(lVar5,1);
        if (lVar4 != 0) goto LAB_001eb36c;
      }
      func_0x007a1f00(uVar6,lVar5,&UNK_009c3768);
      goto LAB_001eb3ec;
    }
    puVar3 = (undefined8 *)func_0x00187bd0(0x10,8);
    if (puVar3 != (undefined8 *)0x0) {
      puVar3[1] = 1;
      *puVar3 = 1;
      *puVar2 = 0x8000000000000026;
      puVar2[1] = puVar3;
      puVar2[2] = &UNK_009c8188;
      func_0x002d8de8(auStack_190._8_8_);
      return;
    }
  }
  func_0x007a1f18(8,0x10);
LAB_001eb3ec:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x1eb3f0);
  (*pcVar1)();
}

