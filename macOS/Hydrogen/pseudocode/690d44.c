
void FUN_00690d44(void)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  ulong uVar6;
  undefined8 uVar7;
  uint uVar8;
  undefined8 extraout_x8;
  uint uVar9;
  uint uVar10;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined1 uStack0000000000000068;
  undefined1 uStack0000000000000098;
  undefined1 uStack00000000000000c8;
  undefined1 uStack00000000000000f8;
  undefined1 uStack0000000000000128;
  undefined1 uStack0000000000000158;
  undefined1 uStack0000000000000188;
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
  undefined *apuStack_128 [2];
  ulong uStack_118;
  ulong uStack_110;
  long lStack_108;
  undefined *apuStack_f8 [2];
  ulong uStack_e8;
  ulong uStack_e0;
  long lStack_d8;
  undefined *apuStack_c8 [2];
  ulong uStack_b8;
  ulong uStack_b0;
  long lStack_a8;
  undefined *apuStack_98 [2];
  ulong uStack_88;
  ulong uStack_80;
  long lStack_78;
  
  func_0x00087574(&uStack0000000000000188);
  func_0x00087574(unaff_x29 + -0xa8);
  func_0x00087574();
  uVar4 = __Unwind_Resume();
  func_0x00087574(unaff_x29 + -0xa8);
  func_0x00087574();
  uVar4 = __Unwind_Resume(uVar4);
  func_0x00087574();
  uVar4 = __Unwind_Resume(uVar4);
  func_0x00087574(&uStack0000000000000068);
  func_0x00087574(unaff_x29 + -0xa8);
  func_0x00087574(&uStack00000000000000c8);
  func_0x00087574(&uStack0000000000000098);
  func_0x00087574(&uStack00000000000000f8);
  func_0x00087574(&uStack0000000000000128);
  func_0x00087574(&uStack0000000000000158);
  func_0x00087574(&uStack0000000000000188);
  func_0x00087574(unaff_x29 + -0xd8);
  func_0x00087574();
  auVar11 = __Unwind_Resume(uVar4);
  uVar7 = auVar11._8_8_;
  uVar4 = auVar11._0_8_;
  lVar5 = func_0x00609cf4(uVar7,4);
  if (lVar5 == 3) {
    func_0x005fe1e8(apuStack_f8,1);
    func_0x006072ac(apuStack_c8,uVar7,apuStack_f8);
    func_0x00609b98(apuStack_98,apuStack_c8,4);
    func_0x0060a860(extraout_x8,uVar4,apuStack_98,uVar7);
    apuStack_98[0] = &UNK_009f5d60;
    if (uStack_80 <= uStack_88) {
      uStack_88 = uStack_80;
    }
    if (lStack_78 != 0) {
      if (uStack_88 != 0) {
        do {
          *(undefined8 *)(lStack_78 + -8 + uStack_88 * 8) = 0;
          uStack_88 = uStack_88 - 1;
        } while (uStack_88 != 0);
      }
      func_0x00611644();
    }
    apuStack_c8[0] = &UNK_009f5d60;
    if (uStack_b0 <= uStack_b8) {
      uStack_b8 = uStack_b0;
    }
    if (lStack_a8 != 0) {
      if (uStack_b8 != 0) {
        do {
          *(undefined8 *)(lStack_a8 + -8 + uStack_b8 * 8) = 0;
          uStack_b8 = uStack_b8 - 1;
        } while (uStack_b8 != 0);
      }
      func_0x00611644();
    }
    apuStack_f8[0] = &UNK_009f5d60;
    if (uStack_e0 <= uStack_e8) {
      uStack_e8 = uStack_e0;
    }
    if (lStack_d8 != 0) {
      if (uStack_e8 != 0) {
        do {
          *(undefined8 *)(lStack_d8 + -8 + uStack_e8 * 8) = 0;
          uStack_e8 = uStack_e8 - 1;
        } while (uStack_e8 != 0);
      }
      func_0x00611644();
    }
  }
  else {
    func_0x005fe1e8(apuStack_c8,1);
    func_0x00607398(apuStack_98,uVar7,apuStack_c8);
    apuStack_c8[0] = &UNK_009f5d60;
    uVar6 = uStack_b8;
    if (uStack_b0 <= uStack_b8) {
      uVar6 = uStack_b0;
    }
    if (lStack_a8 != 0) {
      if (uVar6 != 0) {
        do {
          *(undefined8 *)(lStack_a8 + -8 + uVar6 * 8) = 0;
          uVar6 = uVar6 - 1;
        } while (uVar6 != 0);
      }
      func_0x00611644();
    }
    uVar9 = 0;
    while (uVar6 = func_0x005ffe3c(apuStack_98,0), (uVar6 & 1) == 0) {
      uVar9 = uVar9 + 1;
      func_0x006078e0(apuStack_98,1);
    }
    func_0x005fe1e8(apuStack_c8,2);
    while (iVar3 = func_0x0068c6f4(apuStack_c8,uVar7), iVar3 != -1) {
      func_0x00605a2c(apuStack_c8);
    }
    func_0x0060a860(apuStack_f8,apuStack_c8,apuStack_98,uVar7);
    func_0x005fe1e8(apuStack_1b8,1);
    func_0x00607398(apuStack_188,apuStack_98,apuStack_1b8);
    func_0x00609b98(apuStack_158,apuStack_188,2);
    func_0x0060a860(apuStack_128,uVar4,apuStack_158,uVar7);
    apuStack_158[0] = &UNK_009f5d60;
    uVar6 = uStack_148;
    if (uStack_140 <= uStack_148) {
      uVar6 = uStack_140;
    }
    if (lStack_138 != 0) {
      if (uVar6 != 0) {
        do {
          *(undefined8 *)(lStack_138 + -8 + uVar6 * 8) = 0;
          uVar6 = uVar6 - 1;
        } while (uVar6 != 0);
      }
      func_0x00611644();
    }
    apuStack_188[0] = &UNK_009f5d60;
    uVar6 = uStack_178;
    if (uStack_170 <= uStack_178) {
      uVar6 = uStack_170;
    }
    if (lStack_168 != 0) {
      if (uVar6 != 0) {
        do {
          *(undefined8 *)(lStack_168 + -8 + uVar6 * 8) = 0;
          uVar6 = uVar6 - 1;
        } while (uVar6 != 0);
      }
      func_0x00611644();
    }
    apuStack_1b8[0] = &UNK_009f5d60;
    uVar6 = uStack_1a8;
    if (uStack_1a0 <= uStack_1a8) {
      uVar6 = uStack_1a0;
    }
    if (lStack_198 != 0) {
      if (uVar6 != 0) {
        do {
          *(undefined8 *)(lStack_198 + -8 + uVar6 * 8) = 0;
          uVar6 = uVar6 - 1;
        } while (uVar6 != 0);
      }
      func_0x00611644();
    }
    func_0x00608730(apuStack_1e8,apuStack_128,apuStack_128);
    func_0x0060986c(apuStack_1b8,apuStack_1e8,uVar7);
    func_0x00608730(apuStack_188,apuStack_1b8,uVar4);
    func_0x0060986c(apuStack_158,apuStack_188,uVar7);
    apuStack_188[0] = &UNK_009f5d60;
    uVar6 = uStack_178;
    if (uStack_170 <= uStack_178) {
      uVar6 = uStack_170;
    }
    if (lStack_168 != 0) {
      if (uVar6 != 0) {
        do {
          *(undefined8 *)(lStack_168 + -8 + uVar6 * 8) = 0;
          uVar6 = uVar6 - 1;
        } while (uVar6 != 0);
      }
      func_0x00611644();
    }
    apuStack_1b8[0] = &UNK_009f5d60;
    uVar6 = uStack_1a8;
    if (uStack_1a0 <= uStack_1a8) {
      uVar6 = uStack_1a0;
    }
    if (lStack_198 != 0) {
      if (uVar6 != 0) {
        do {
          *(undefined8 *)(lStack_198 + -8 + uVar6 * 8) = 0;
          uVar6 = uVar6 - 1;
        } while (uVar6 != 0);
      }
      func_0x00611644();
    }
    apuStack_1e8[0] = &UNK_009f5d60;
    uVar6 = uStack_1d8;
    if (uStack_1d0 <= uStack_1d8) {
      uVar6 = uStack_1d0;
    }
    if (lStack_1c8 != 0) {
      if (uVar6 != 0) {
        do {
          *(undefined8 *)(lStack_1c8 + -8 + uVar6 * 8) = 0;
          uVar6 = uVar6 - 1;
        } while (uVar6 != 0);
      }
      func_0x00611644();
    }
    func_0x00608730(apuStack_1b8,uVar4,apuStack_128);
    func_0x0060986c(apuStack_188,apuStack_1b8,uVar7);
    func_0x005ffccc(apuStack_128,apuStack_188);
    apuStack_188[0] = &UNK_009f5d60;
    uVar6 = uStack_178;
    if (uStack_170 <= uStack_178) {
      uVar6 = uStack_170;
    }
    if (lStack_168 != 0) {
      if (uVar6 != 0) {
        do {
          *(undefined8 *)(lStack_168 + -8 + uVar6 * 8) = 0;
          uVar6 = uVar6 - 1;
        } while (uVar6 != 0);
      }
      func_0x00611644();
    }
    apuStack_1b8[0] = &UNK_009f5d60;
    uVar6 = uStack_1a8;
    if (uStack_1a0 <= uStack_1a8) {
      uVar6 = uStack_1a0;
    }
    if (lStack_198 != 0) {
      if (uVar6 != 0) {
        do {
          *(undefined8 *)(lStack_198 + -8 + uVar6 * 8) = 0;
          uVar6 = uVar6 - 1;
        } while (uVar6 != 0);
      }
      func_0x00611644();
    }
    func_0x005fdd18(apuStack_188);
    func_0x005fdd18(apuStack_1b8);
    while( true ) {
      func_0x005fe1e8(apuStack_1e8,1);
      iVar3 = func_0x00609ec8(apuStack_158,apuStack_1e8);
      apuStack_1e8[0] = &UNK_009f5d60;
      uVar6 = uStack_1d8;
      if (uStack_1d0 <= uStack_1d8) {
        uVar6 = uStack_1d0;
      }
      if (lStack_1c8 != 0) {
        if (uVar6 != 0) {
          do {
            *(undefined8 *)(lStack_1c8 + -8 + uVar6 * 8) = 0;
            uVar6 = uVar6 - 1;
          } while (uVar6 != 0);
        }
        func_0x00611644();
      }
      if (iVar3 == 0) break;
      func_0x005ffccc(apuStack_188,apuStack_158);
      uVar1 = 0;
      uVar2 = uVar9 - 2;
      do {
        uVar8 = uVar2;
        uVar10 = uVar1;
        func_0x00608730(apuStack_218,apuStack_158,apuStack_158);
        func_0x0060986c(apuStack_1e8,apuStack_218,uVar7);
        func_0x005ffccc(apuStack_158,apuStack_1e8);
        apuStack_1e8[0] = &UNK_009f5d60;
        uVar6 = uStack_1d8;
        if (uStack_1d0 <= uStack_1d8) {
          uVar6 = uStack_1d0;
        }
        if (lStack_1c8 != 0) {
          if (uVar6 != 0) {
            do {
              *(undefined8 *)(lStack_1c8 + -8 + uVar6 * 8) = 0;
              uVar6 = uVar6 - 1;
            } while (uVar6 != 0);
          }
          func_0x00611644();
        }
        apuStack_218[0] = &UNK_009f5d60;
        uVar6 = uStack_208;
        if (uStack_200 <= uStack_208) {
          uVar6 = uStack_200;
        }
        if (lStack_1f8 != 0) {
          if (uVar6 != 0) {
            do {
              *(undefined8 *)(lStack_1f8 + -8 + uVar6 * 8) = 0;
              uVar6 = uVar6 - 1;
            } while (uVar6 != 0);
          }
          func_0x00611644();
        }
        uVar1 = uVar10 + 1;
        if (uVar1 == uVar9) {
          uVar4 = func_0x00604c44();
          func_0x005fe0b4(extraout_x8,uVar4);
          goto code_r0x006916f4;
        }
        func_0x005fe1e8(apuStack_1e8,1);
        iVar3 = func_0x00609ec8(apuStack_158,apuStack_1e8);
        apuStack_1e8[0] = &UNK_009f5d60;
        uVar6 = uStack_1d8;
        if (uStack_1d0 <= uStack_1d8) {
          uVar6 = uStack_1d0;
        }
        if (lStack_1c8 != 0) {
          if (uVar6 != 0) {
            do {
              *(undefined8 *)(lStack_1c8 + -8 + uVar6 * 8) = 0;
              uVar6 = uVar6 - 1;
            } while (uVar6 != 0);
          }
          func_0x00611644();
        }
        uVar2 = uVar8 - 1;
      } while (iVar3 != 0);
      func_0x005ffccc(apuStack_1b8,apuStack_f8);
      if (uVar9 - 2 != uVar10) {
        uVar9 = 0;
        if (uVar8 < 2) {
          uVar8 = 1;
        }
        do {
          func_0x00608730(apuStack_218,apuStack_1b8,apuStack_1b8);
          func_0x0060986c(apuStack_1e8,apuStack_218,uVar7);
          func_0x005ffccc(apuStack_1b8,apuStack_1e8);
          apuStack_1e8[0] = &UNK_009f5d60;
          uVar6 = uStack_1d8;
          if (uStack_1d0 <= uStack_1d8) {
            uVar6 = uStack_1d0;
          }
          if (lStack_1c8 != 0) {
            if (uVar6 != 0) {
              do {
                *(undefined8 *)(lStack_1c8 + -8 + uVar6 * 8) = 0;
                uVar6 = uVar6 - 1;
              } while (uVar6 != 0);
            }
            func_0x00611644();
          }
          apuStack_218[0] = &UNK_009f5d60;
          uVar6 = uStack_208;
          if (uStack_200 <= uStack_208) {
            uVar6 = uStack_200;
          }
          if (lStack_1f8 != 0) {
            if (uVar6 != 0) {
              do {
                *(undefined8 *)(lStack_1f8 + -8 + uVar6 * 8) = 0;
                uVar6 = uVar6 - 1;
              } while (uVar6 != 0);
            }
            func_0x00611644();
          }
          uVar9 = uVar9 + 1;
        } while (uVar9 != uVar8);
      }
      func_0x00608730(apuStack_218,apuStack_1b8,apuStack_1b8);
      func_0x0060986c(apuStack_1e8,apuStack_218,uVar7);
      func_0x005ffccc(apuStack_f8,apuStack_1e8);
      apuStack_1e8[0] = &UNK_009f5d60;
      uVar6 = uStack_1d8;
      if (uStack_1d0 <= uStack_1d8) {
        uVar6 = uStack_1d0;
      }
      if (lStack_1c8 != 0) {
        if (uVar6 != 0) {
          do {
            *(undefined8 *)(lStack_1c8 + -8 + uVar6 * 8) = 0;
            uVar6 = uVar6 - 1;
          } while (uVar6 != 0);
        }
        func_0x00611644();
      }
      apuStack_218[0] = &UNK_009f5d60;
      uVar6 = uStack_208;
      if (uStack_200 <= uStack_208) {
        uVar6 = uStack_200;
      }
      if (lStack_1f8 != 0) {
        if (uVar6 != 0) {
          do {
            *(undefined8 *)(lStack_1f8 + -8 + uVar6 * 8) = 0;
            uVar6 = uVar6 - 1;
          } while (uVar6 != 0);
        }
        func_0x00611644();
      }
      func_0x00608730(apuStack_218,apuStack_128,apuStack_1b8);
      func_0x0060986c(apuStack_1e8,apuStack_218,uVar7);
      func_0x005ffccc(apuStack_128,apuStack_1e8);
      apuStack_1e8[0] = &UNK_009f5d60;
      uVar6 = uStack_1d8;
      if (uStack_1d0 <= uStack_1d8) {
        uVar6 = uStack_1d0;
      }
      if (lStack_1c8 != 0) {
        if (uVar6 != 0) {
          do {
            *(undefined8 *)(lStack_1c8 + -8 + uVar6 * 8) = 0;
            uVar6 = uVar6 - 1;
          } while (uVar6 != 0);
        }
        func_0x00611644();
      }
      apuStack_218[0] = &UNK_009f5d60;
      uVar6 = uStack_208;
      if (uStack_200 <= uStack_208) {
        uVar6 = uStack_200;
      }
      if (lStack_1f8 != 0) {
        if (uVar6 != 0) {
          do {
            *(undefined8 *)(lStack_1f8 + -8 + uVar6 * 8) = 0;
            uVar6 = uVar6 - 1;
          } while (uVar6 != 0);
        }
        func_0x00611644();
      }
      func_0x00608730(apuStack_218,apuStack_188,apuStack_f8);
      func_0x0060986c(apuStack_1e8,apuStack_218,uVar7);
      func_0x005ffccc(apuStack_158,apuStack_1e8);
      apuStack_1e8[0] = &UNK_009f5d60;
      uVar6 = uStack_1d8;
      if (uStack_1d0 <= uStack_1d8) {
        uVar6 = uStack_1d0;
      }
      if (lStack_1c8 != 0) {
        if (uVar6 != 0) {
          do {
            *(undefined8 *)(lStack_1c8 + -8 + uVar6 * 8) = 0;
            uVar6 = uVar6 - 1;
          } while (uVar6 != 0);
        }
        func_0x00611644();
      }
      apuStack_218[0] = &UNK_009f5d60;
      uVar6 = uStack_208;
      if (uStack_200 <= uStack_208) {
        uVar6 = uStack_200;
      }
      if (lStack_1f8 != 0) {
        if (uVar6 != 0) {
          do {
            *(undefined8 *)(lStack_1f8 + -8 + uVar6 * 8) = 0;
            uVar6 = uVar6 - 1;
          } while (uVar6 != 0);
        }
        func_0x00611644();
      }
      uVar9 = uVar1;
    }
    func_0x005fe0b4(extraout_x8,apuStack_128);
code_r0x006916f4:
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
    apuStack_158[0] = &UNK_009f5d60;
    if (uStack_140 <= uStack_148) {
      uStack_148 = uStack_140;
    }
    if (lStack_138 != 0) {
      if (uStack_148 != 0) {
        do {
          *(undefined8 *)(lStack_138 + -8 + uStack_148 * 8) = 0;
          uStack_148 = uStack_148 - 1;
        } while (uStack_148 != 0);
      }
      func_0x00611644();
    }
    apuStack_128[0] = &UNK_009f5d60;
    if (uStack_110 <= uStack_118) {
      uStack_118 = uStack_110;
    }
    if (lStack_108 != 0) {
      if (uStack_118 != 0) {
        do {
          *(undefined8 *)(lStack_108 + -8 + uStack_118 * 8) = 0;
          uStack_118 = uStack_118 - 1;
        } while (uStack_118 != 0);
      }
      func_0x00611644();
    }
    apuStack_f8[0] = &UNK_009f5d60;
    if (uStack_e0 <= uStack_e8) {
      uStack_e8 = uStack_e0;
    }
    if (lStack_d8 != 0) {
      if (uStack_e8 != 0) {
        do {
          *(undefined8 *)(lStack_d8 + -8 + uStack_e8 * 8) = 0;
          uStack_e8 = uStack_e8 - 1;
        } while (uStack_e8 != 0);
      }
      func_0x00611644();
    }
    apuStack_c8[0] = &UNK_009f5d60;
    if (uStack_b0 <= uStack_b8) {
      uStack_b8 = uStack_b0;
    }
    if (lStack_a8 != 0) {
      if (uStack_b8 != 0) {
        do {
          *(undefined8 *)(lStack_a8 + -8 + uStack_b8 * 8) = 0;
          uStack_b8 = uStack_b8 - 1;
        } while (uStack_b8 != 0);
      }
      func_0x00611644();
    }
    apuStack_98[0] = &UNK_009f5d60;
    if (uStack_80 <= uStack_88) {
      uStack_88 = uStack_80;
    }
    if (lStack_78 != 0) {
      if (uStack_88 != 0) {
        do {
          *(undefined8 *)(lStack_78 + -8 + uStack_88 * 8) = 0;
          uStack_88 = uStack_88 - 1;
        } while (uStack_88 != 0);
      }
      func_0x00611644();
    }
  }
  return;
}

