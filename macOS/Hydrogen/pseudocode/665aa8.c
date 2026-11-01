
ulong FUN_00665aa8(undefined8 param_1,undefined8 param_2,undefined8 param_3,ulong param_4)

{
  byte bVar1;
  int iVar2;
  undefined4 uVar3;
  ulong uVar4;
  undefined8 uVar5;
  long *plVar6;
  long lVar7;
  long lVar8;
  undefined1 *puVar9;
  long *plVar10;
  long unaff_x19;
  undefined8 *unaff_x21;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined *apuStack_248 [2];
  ulong uStack_238;
  ulong uStack_230;
  long lStack_228;
  undefined *apuStack_218 [2];
  ulong uStack_208;
  ulong uStack_200;
  long lStack_1f8;
  undefined *apuStack_1e8 [2];
  ulong uStack_1d8;
  ulong uStack_1d0;
  long lStack_1c8;
  undefined *apuStack_1b8 [2];
  ulong uStack_1a8;
  ulong uStack_1a0;
  long lStack_198;
  undefined *apuStack_188 [2];
  ulong uStack_178;
  ulong uStack_170;
  long lStack_168;
  undefined *apuStack_158 [2];
  ulong uStack_148;
  ulong uStack_140;
  long lStack_138;
  byte bStack_121;
  long alStack_e0 [7];
  long lStack_a8;
  undefined1 auStack_70 [56];
  long lStack_38;
  
  func_0x006129a4(param_1,param_2,0x30);
  func_0x0060bbd4(*unaff_x21);
  lVar8 = unaff_x19 + 0x48;
  func_0x0060bbd4(*(undefined8 *)(unaff_x19 + 0x10));
  func_0x00612b0c();
  uVar4 = func_0x006143a8();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return uVar4;
  }
  ___stack_chk_fail();
  uVar5 = __Unwind_Resume();
  func_0x006143a8();
  auVar11 = __Unwind_Resume(uVar5);
  puVar9 = auStack_70;
  lStack_38 = *(long *)PTR____stack_chk_guard_009b01e8;
  func_0x0060ecc4(auStack_70,lVar8,param_4);
  uVar4 = (**(code **)(*auVar11._0_8_ + 0x80))(auVar11._0_8_,auVar11._8_8_,auStack_70);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
    return uVar4;
  }
  ___stack_chk_fail();
  auVar11 = __Unwind_Resume();
  plVar10 = alStack_e0;
  lStack_a8 = *(long *)PTR____stack_chk_guard_009b01e8;
  func_0x0060ecc4(alStack_e0,puVar9,param_4);
  plVar6 = (long *)(auVar11._0_8_ + -8);
  uVar4 = (**(code **)(*plVar6 + 0x80))(plVar6,auVar11._8_8_);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_a8) {
    return uVar4;
  }
  ___stack_chk_fail();
  auVar11 = __Unwind_Resume();
  lVar8 = auVar11._8_8_;
  plVar6 = auVar11._0_8_;
  if ((param_4 != 0) && (lVar7 = (**(code **)(*plVar10 + 0xa8))(plVar10,&bStack_121), lVar7 != 0)) {
    if (bStack_121 - 2 < 2) {
      uVar4 = (**(code **)(*plVar6 + 0x78))(plVar6,1);
      if ((uVar4 & 0xffffffff) == param_4) {
        func_0x005fe0b4(apuStack_158,plVar6[2] + 0x18);
        *(undefined1 *)(lVar8 + 0x68) = 0;
        uVar3 = func_0x0060bcf4(plVar6[2]);
        lVar7 = lVar8 + 8;
        func_0x005fe7ec(lVar7,plVar10,uVar3,0);
        func_0x00608730(apuStack_248,lVar7,lVar7);
        func_0x006072ac(apuStack_218,apuStack_248,plVar6 + 3);
        func_0x00608730(apuStack_1e8,apuStack_218,lVar7);
        func_0x006072ac(apuStack_1b8,apuStack_1e8,plVar6 + 9);
        func_0x0060986c(apuStack_188,apuStack_1b8,apuStack_158);
        lVar8 = lVar8 + 0x38;
        func_0x005ffccc(lVar8,apuStack_188);
        apuStack_188[0] = &UNK_009f5d60;
        uVar4 = uStack_178;
        if (uStack_170 <= uStack_178) {
          uVar4 = uStack_170;
        }
        if (lStack_168 != 0) {
          if (uVar4 != 0) {
            do {
              *(undefined8 *)(lStack_168 + -8 + uVar4 * 8) = 0;
              uVar4 = uVar4 - 1;
            } while (uVar4 != 0);
          }
          func_0x00611644();
        }
        apuStack_1b8[0] = &UNK_009f5d60;
        if (uStack_1a0 <= uStack_1a8) {
          uStack_1a8 = uStack_1a0;
        }
        if (lStack_198 != 0) {
          if (uStack_1a8 != 0) {
            do {
              *(undefined8 *)(lStack_198 + -8 + uStack_1a8 * 8) = 0;
              uStack_1a8 = uStack_1a8 - 1;
            } while (uStack_1a8 != 0);
          }
          func_0x00611644();
        }
        apuStack_1e8[0] = &UNK_009f5d60;
        if (uStack_1d0 <= uStack_1d8) {
          uStack_1d8 = uStack_1d0;
        }
        if (lStack_1c8 != 0) {
          if (uStack_1d8 != 0) {
            do {
              *(undefined8 *)(lStack_1c8 + -8 + uStack_1d8 * 8) = 0;
              uStack_1d8 = uStack_1d8 - 1;
            } while (uStack_1d8 != 0);
          }
          func_0x00611644();
        }
        apuStack_218[0] = &UNK_009f5d60;
        if (uStack_200 <= uStack_208) {
          uStack_208 = uStack_200;
        }
        if (lStack_1f8 != 0) {
          if (uStack_208 != 0) {
            do {
              *(undefined8 *)(lStack_1f8 + -8 + uStack_208 * 8) = 0;
              uStack_208 = uStack_208 - 1;
            } while (uStack_208 != 0);
          }
          func_0x00611644();
        }
        apuStack_248[0] = &UNK_009f5d60;
        if (uStack_230 <= uStack_238) {
          uStack_238 = uStack_230;
        }
        if (lStack_228 != 0) {
          if (uStack_238 != 0) {
            do {
              *(undefined8 *)(lStack_228 + -8 + uStack_238 * 8) = 0;
              uStack_238 = uStack_238 - 1;
            } while (uStack_238 != 0);
          }
          func_0x00611644();
        }
        iVar2 = func_0x0068c6f4(lVar8,apuStack_158);
        uVar4 = (ulong)(iVar2 == 1);
        if (iVar2 == 1) {
          func_0x00690ec4(apuStack_188,lVar8,apuStack_158);
          func_0x005ffccc(lVar8,apuStack_188);
          apuStack_188[0] = &UNK_009f5d60;
          if (uStack_170 <= uStack_178) {
            uStack_178 = uStack_170;
          }
          if (lStack_168 != 0) {
            if (uStack_178 != 0) {
              do {
                *(undefined8 *)(lStack_168 + -8 + uStack_178 * 8) = 0;
                uStack_178 = uStack_178 - 1;
              } while (uStack_178 != 0);
            }
            func_0x00611644();
          }
          bVar1 = func_0x005ffe3c(lVar8,0);
          if (((bVar1 ^ (bStack_121 & 1) == 0) & 1) == 0) {
            func_0x00607398(apuStack_188,apuStack_158,lVar8);
            func_0x005ffccc(lVar8,apuStack_188);
            func_0x00087574(apuStack_188);
          }
        }
        apuStack_158[0] = &UNK_009f5d60;
        if (uStack_140 <= uStack_148) {
          uStack_148 = uStack_140;
        }
        if (lStack_138 == 0) {
          return uVar4;
        }
        if (uStack_148 != 0) {
          do {
            *(undefined8 *)(lStack_138 + -8 + uStack_148 * 8) = 0;
            uStack_148 = uStack_148 - 1;
          } while (uStack_148 != 0);
        }
        func_0x00611644();
        return uVar4;
      }
    }
    else {
      if (bStack_121 == 4) {
        uVar4 = (**(code **)(*plVar6 + 0x78))(plVar6,0);
        if ((uVar4 & 0xffffffff) == param_4) {
          uVar3 = func_0x0060bcf4(plVar6[2]);
          *(undefined1 *)(lVar8 + 0x68) = 0;
          func_0x005fe7ec(lVar8 + 8,plVar10,uVar3,0);
          func_0x005fe7ec(lVar8 + 0x38,plVar10,uVar3,0);
          return 1;
        }
        return 0;
      }
      if (bStack_121 == 0) {
        *(undefined1 *)(lVar8 + 0x68) = 1;
        return 1;
      }
    }
  }
  return 0;
}

