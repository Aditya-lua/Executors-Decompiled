
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_0052af78(void)

{
  undefined1 *puVar1;
  code *pcVar2;
  long lVar3;
  undefined8 *puVar4;
  long lVar5;
  long lVar6;
  long extraout_x1;
  undefined8 extraout_x1_00;
  undefined *puVar7;
  long lVar8;
  long in_x3;
  long in_x4;
  undefined8 *extraout_x8;
  undefined8 *extraout_x8_00;
  undefined8 *extraout_x8_01;
  undefined8 *extraout_x8_02;
  undefined8 *extraout_x8_03;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 uVar9;
  undefined1 auVar10 [16];
  long lStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  long lStack_168;
  long lStack_160;
  long lStack_158;
  char cStack_e0;
  undefined1 uStack_df;
  undefined8 uStack_d8;
  long lStack_d0;
  undefined8 *puStack_c8;
  undefined1 **ppuStack_c0;
  undefined *puStack_b8;
  long lStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  undefined1 *puStack_40;
  undefined *puStack_38;
  char cStack_30;
  undefined1 uStack_2f;
  undefined8 uStack_28;
  undefined8 *puStack_20;
  undefined1 auStack_6 [6];
  
  lVar8 = in_x3;
  lVar3 = func_0x00187bd0();
  if (lVar3 != 0) {
    _memcpy(lVar3,in_x3);
    puVar4 = (undefined8 *)func_0x00187bd0(0x28,8);
    if (puVar4 == (undefined8 *)0x0) {
      func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x52b020);
      (*pcVar2)();
    }
    puVar4[1] = 1;
    *puVar4 = 1;
    puVar4[2] = unaff_x19;
    puVar4[3] = lVar3;
    puVar4[4] = unaff_x19;
    *unaff_x20 = puVar4;
    unaff_x20[1] = &UNK_009e9ab0;
    uVar9 = _UNK_008a6810;
    unaff_x20[3] = _UNK_008a6818;
    unaff_x20[2] = uVar9;
    return puVar4;
  }
  puVar4 = (undefined8 *)func_0x007a1f00(1);
  if (unaff_x19 != 0) {
    func_0x00187bd4();
    unaff_x20 = puVar4;
  }
  __Unwind_Resume(puVar4);
  puVar1 = auStack_6 + -10;
  puStack_20 = unaff_x20;
  puVar4 = (undefined8 *)func_0x0052da6c(&cStack_30);
  if (cStack_30 == '\x01') {
    *extraout_x8 = 0;
    extraout_x8[1] = uStack_28;
  }
  else {
    puVar4 = (undefined8 *)func_0x00187bd0(0x18,8);
    if (puVar4 == (undefined8 *)0x0) {
      func_0x007a1f18(8,0x18);
      puStack_38 = &DAT_0052b0f0;
      lVar3 = lVar8;
      lVar6 = in_x4;
      puStack_40 = puVar1;
      if (in_x4 < 0) {
        uVar9 = 0;
        puStack_c8 = extraout_x8;
      }
      else {
        if (in_x4 == 0) {
          lVar5 = 1;
code_r0x0052b150:
          uVar9 = _memcpy(lVar5,lVar8,in_x4);
          lStack_98 = in_x4;
          lStack_90 = lVar5;
          lStack_88 = in_x4;
          puVar4 = (undefined8 *)func_0x0052b7a0(&lStack_b0,uVar9,extraout_x1);
          if (lStack_b0 == -0x8000000000000000) {
            *extraout_x8_00 = 0;
            extraout_x8_00[1] = uStack_a8;
          }
          else {
            puVar4 = (undefined8 *)func_0x00187bd0(0x28,8);
            if (puVar4 == (undefined8 *)0x0) {
              func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
              pcVar2 = (code *)SoftwareBreakpoint(1,0x52b200);
              (*pcVar2)();
            }
            puVar4[1] = 1;
            *puVar4 = 1;
            puVar4[2] = lStack_b0;
            puVar4[3] = uStack_a8;
            puVar4[4] = uStack_a0;
            *extraout_x8_00 = puVar4;
            extraout_x8_00[1] = &UNK_009e9a70;
            uVar9 = _UNK_008a6800;
            extraout_x8_00[3] = _UNK_008a6808;
            extraout_x8_00[2] = uVar9;
          }
          return puVar4;
        }
        uVar9 = 1;
        lVar5 = func_0x00187bd0(in_x4,1);
        puStack_c8 = extraout_x8_00;
        unaff_x21 = extraout_x1;
        if (lVar5 != 0) {
          goto code_r0x0052b150;
        }
      }
      puVar7 = &UNK_009eaac8;
      puVar4 = (undefined8 *)func_0x007a1f00(uVar9,in_x4,&UNK_009eaac8);
      if (unaff_x21 != 0) {
        puVar7 = (undefined *)0x1;
        func_0x00187bd4(in_x4,unaff_x21,1);
        puStack_c8 = puVar4;
      }
      auVar10 = __Unwind_Resume(puVar4);
      lVar8 = auVar10._8_8_;
      puStack_b8 = &DAT_0052b238;
      lStack_d0 = in_x4;
      ppuStack_c0 = &puStack_40;
      puVar4 = (undefined8 *)func_0x0052c198(&cStack_e0,auVar10._0_8_,lVar8,puVar7,lVar3,lVar6);
      if (cStack_e0 == '\x01') {
        *extraout_x8_01 = 0;
        extraout_x8_01[1] = uStack_d8;
      }
      else {
        puVar4 = (undefined8 *)func_0x00187bd0(0x18,8);
        if (puVar4 == (undefined8 *)0x0) {
          func_0x007a1f18(8,0x18);
          auVar10 = func_0x0052cecc();
          puVar4 = auVar10._0_8_;
          if (((ulong)puVar4 & 1) == 0) {
            puVar4 = (undefined8 *)func_0x00187bd0(0x18,8);
            if (puVar4 == (undefined8 *)0x0) {
              func_0x007a1f18(8,0x18);
              if (lVar3 < 0) {
                uVar9 = 0;
code_r0x0052b480:
                uVar9 = func_0x007a1f00(uVar9,lVar3,&UNK_009eaac8);
                if (unaff_x21 != 0) {
                  func_0x00187bd4(lVar3,unaff_x21,1);
                }
                __Unwind_Resume(uVar9);
                return (undefined8 *)0x596b48cc04376e6;
              }
              if (lVar3 == 0) {
                lVar6 = 1;
              }
              else {
                uVar9 = 1;
                lVar6 = func_0x00187bd0(lVar3,1);
                unaff_x21 = lVar8;
                if (lVar6 == 0) goto code_r0x0052b480;
              }
              uVar9 = _memcpy(lVar6,puVar7,lVar3);
              lStack_168 = lVar3;
              lStack_160 = lVar6;
              lStack_158 = lVar3;
              puVar4 = (undefined8 *)
                       func_0x0052babc(&lStack_180,uVar9,extraout_x1_00,lVar8,&lStack_168);
              if (lStack_180 == -0x8000000000000000) {
                *extraout_x8_03 = 0;
                extraout_x8_03[1] = uStack_178;
              }
              else {
                puVar4 = (undefined8 *)func_0x00187bd0(0x28,8);
                if (puVar4 == (undefined8 *)0x0) {
                  func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
                  pcVar2 = (code *)SoftwareBreakpoint(1,0x52b47c);
                  (*pcVar2)();
                }
                puVar4[1] = 1;
                *puVar4 = 1;
                puVar4[2] = lStack_180;
                puVar4[3] = uStack_178;
                puVar4[4] = uStack_170;
                *extraout_x8_03 = puVar4;
                extraout_x8_03[1] = &UNK_009e9a10;
                uVar9 = _UNK_008a67d0;
                extraout_x8_03[3] = _UNK_008a67d8;
                extraout_x8_03[2] = uVar9;
              }
              return puVar4;
            }
            puVar4[1] = 1;
            *puVar4 = 1;
            puVar4[2] = auVar10._8_8_;
            *extraout_x8_02 = puVar4;
            extraout_x8_02[1] = &UNK_009e9a30;
            uVar9 = _UNK_008a67e0;
            extraout_x8_02[3] = _UNK_008a67e8;
            extraout_x8_02[2] = uVar9;
          }
          else {
            *extraout_x8_02 = 0;
            extraout_x8_02[1] = auVar10._8_8_;
          }
          return puVar4;
        }
        puVar4[1] = 1;
        *puVar4 = 1;
        *(undefined1 *)(puVar4 + 2) = uStack_df;
        *extraout_x8_01 = puVar4;
        extraout_x8_01[1] = &UNK_009e9a90;
        uVar9 = _UNK_0089f380;
        extraout_x8_01[3] = _UNK_0089f388;
        extraout_x8_01[2] = uVar9;
      }
      return puVar4;
    }
    puVar4[1] = 1;
    *puVar4 = 1;
    *(undefined1 *)(puVar4 + 2) = uStack_2f;
    *extraout_x8 = puVar4;
    extraout_x8[1] = &UNK_009e9a50;
    uVar9 = _UNK_008a67f0;
    extraout_x8[3] = _UNK_008a67f8;
    extraout_x8[2] = uVar9;
  }
  return puVar4;
}

