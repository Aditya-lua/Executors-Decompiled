
undefined8
FUN_0069199c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5,undefined8 param_6)

{
  int iVar1;
  undefined8 uVar2;
  ulong uVar3;
  long unaff_x29;
  undefined1 auVar4 [16];
  undefined1 uStack0000000000000068;
  undefined *apuStack_1a0 [2];
  ulong uStack_190;
  ulong uStack_188;
  long lStack_180;
  undefined *apuStack_170 [2];
  ulong uStack_160;
  ulong uStack_158;
  long lStack_150;
  undefined *apuStack_140 [2];
  ulong uStack_130;
  ulong uStack_128;
  long lStack_120;
  undefined *apuStack_110 [2];
  ulong uStack_100;
  ulong uStack_f8;
  long lStack_f0;
  undefined *apuStack_e0 [2];
  ulong uStack_d0;
  ulong uStack_c8;
  long lStack_c0;
  undefined *apuStack_b0 [2];
  ulong uStack_a0;
  ulong uStack_98;
  long lStack_90;
  undefined *apuStack_80 [2];
  ulong uStack_70;
  ulong uStack_68;
  long lStack_60;
  
  func_0x00087574(&uStack0000000000000068);
  func_0x00087574(unaff_x29 + -0xe8);
  func_0x00087574(unaff_x29 + -0xb8);
  func_0x00087574(unaff_x29 + -0x88);
  uVar2 = __Unwind_Resume();
  func_0x00087574(unaff_x29 + -0xb8);
  func_0x00087574(unaff_x29 + -0x88);
  uVar2 = __Unwind_Resume(uVar2);
  func_0x00087574(unaff_x29 + -0x88);
  auVar4 = __Unwind_Resume(uVar2);
  func_0x00608730(apuStack_e0,param_4,param_4);
  func_0x005fe1e8(apuStack_170,4);
  func_0x00608730(apuStack_140,apuStack_170,param_3);
  func_0x00608730(apuStack_110,apuStack_140,param_5);
  func_0x00607398(apuStack_b0,apuStack_e0,apuStack_110);
  func_0x0060986c(apuStack_80,apuStack_b0,param_6);
  apuStack_b0[0] = &UNK_009f5d60;
  uVar3 = uStack_a0;
  if (uStack_98 <= uStack_a0) {
    uVar3 = uStack_98;
  }
  if (lStack_90 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lStack_90 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  apuStack_110[0] = &UNK_009f5d60;
  uVar3 = uStack_100;
  if (uStack_f8 <= uStack_100) {
    uVar3 = uStack_f8;
  }
  if (lStack_f0 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lStack_f0 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  apuStack_140[0] = &UNK_009f5d60;
  uVar3 = uStack_130;
  if (uStack_128 <= uStack_130) {
    uVar3 = uStack_128;
  }
  if (lStack_120 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lStack_120 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  apuStack_170[0] = &UNK_009f5d60;
  uVar3 = uStack_160;
  if (uStack_158 <= uStack_160) {
    uVar3 = uStack_158;
  }
  if (lStack_150 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lStack_150 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  apuStack_e0[0] = &UNK_009f5d60;
  uVar3 = uStack_d0;
  if (uStack_c8 <= uStack_d0) {
    uVar3 = uStack_c8;
  }
  if (lStack_c0 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lStack_c0 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  iVar1 = func_0x0068c6f4(apuStack_80,param_6);
  if (iVar1 == 0) {
    func_0x006000a8(apuStack_110,param_4);
    func_0x006072ac(apuStack_170,param_3,param_3);
    func_0x0060aaf0(apuStack_140,apuStack_170,param_6);
    func_0x00608730(apuStack_e0,apuStack_110,apuStack_140);
    func_0x0060986c(apuStack_b0,apuStack_e0,param_6);
    uVar2 = func_0x005ffccc(auVar4._8_8_,apuStack_b0);
    func_0x005ffccc(auVar4._0_8_,uVar2);
    apuStack_b0[0] = &UNK_009f5d60;
    if (uStack_98 <= uStack_a0) {
      uStack_a0 = uStack_98;
    }
    if (lStack_90 != 0) {
      if (uStack_a0 != 0) {
        do {
          *(undefined8 *)(lStack_90 + -8 + uStack_a0 * 8) = 0;
          uStack_a0 = uStack_a0 - 1;
        } while (uStack_a0 != 0);
      }
      func_0x00611644();
    }
    apuStack_e0[0] = &UNK_009f5d60;
    if (uStack_c8 <= uStack_d0) {
      uStack_d0 = uStack_c8;
    }
    if (lStack_c0 != 0) {
      if (uStack_d0 != 0) {
        do {
          *(undefined8 *)(lStack_c0 + -8 + uStack_d0 * 8) = 0;
          uStack_d0 = uStack_d0 - 1;
        } while (uStack_d0 != 0);
      }
      func_0x00611644();
    }
    apuStack_140[0] = &UNK_009f5d60;
    if (uStack_128 <= uStack_130) {
      uStack_130 = uStack_128;
    }
    if (lStack_120 != 0) {
      if (uStack_130 != 0) {
        do {
          *(undefined8 *)(lStack_120 + -8 + uStack_130 * 8) = 0;
          uStack_130 = uStack_130 - 1;
        } while (uStack_130 != 0);
      }
      func_0x00611644();
    }
    apuStack_170[0] = &UNK_009f5d60;
    if (uStack_158 <= uStack_160) {
      uStack_160 = uStack_158;
    }
    if (lStack_150 != 0) {
      if (uStack_160 != 0) {
        do {
          *(undefined8 *)(lStack_150 + -8 + uStack_160 * 8) = 0;
          uStack_160 = uStack_160 - 1;
        } while (uStack_160 != 0);
      }
      func_0x00611644();
    }
    apuStack_110[0] = &UNK_009f5d60;
    if (uStack_f8 <= uStack_100) {
      uStack_100 = uStack_f8;
    }
    if (lStack_f0 != 0) {
      if (uStack_100 != 0) {
        do {
          *(undefined8 *)(lStack_f0 + -8 + uStack_100 * 8) = 0;
          uStack_100 = uStack_100 - 1;
        } while (uStack_100 != 0);
      }
      func_0x00611644();
    }
  }
  else {
    if (iVar1 != 1) {
      uVar2 = 0;
      goto code_r0x006920dc;
    }
    func_0x00690ec4(apuStack_b0,apuStack_80,param_6);
    func_0x006072ac(apuStack_110,param_3,param_3);
    func_0x0060aaf0(apuStack_e0,apuStack_110,param_6);
    apuStack_110[0] = &UNK_009f5d60;
    uVar3 = uStack_100;
    if (uStack_f8 <= uStack_100) {
      uVar3 = uStack_f8;
    }
    if (lStack_f0 != 0) {
      if (uVar3 != 0) {
        do {
          *(undefined8 *)(lStack_f0 + -8 + uVar3 * 8) = 0;
          uVar3 = uVar3 - 1;
        } while (uVar3 != 0);
      }
      func_0x00611644();
    }
    func_0x00607398(apuStack_170,apuStack_b0,param_4);
    func_0x00608730(apuStack_140,apuStack_170,apuStack_e0);
    func_0x0060986c(apuStack_110,apuStack_140,param_6);
    func_0x005ffccc(auVar4._0_8_,apuStack_110);
    apuStack_110[0] = &UNK_009f5d60;
    uVar3 = uStack_100;
    if (uStack_f8 <= uStack_100) {
      uVar3 = uStack_f8;
    }
    if (lStack_f0 != 0) {
      if (uVar3 != 0) {
        do {
          *(undefined8 *)(lStack_f0 + -8 + uVar3 * 8) = 0;
          uVar3 = uVar3 - 1;
        } while (uVar3 != 0);
      }
      func_0x00611644();
    }
    apuStack_140[0] = &UNK_009f5d60;
    uVar3 = uStack_130;
    if (uStack_128 <= uStack_130) {
      uVar3 = uStack_128;
    }
    if (lStack_120 != 0) {
      if (uVar3 != 0) {
        do {
          *(undefined8 *)(lStack_120 + -8 + uVar3 * 8) = 0;
          uVar3 = uVar3 - 1;
        } while (uVar3 != 0);
      }
      func_0x00611644();
    }
    apuStack_170[0] = &UNK_009f5d60;
    uVar3 = uStack_160;
    if (uStack_158 <= uStack_160) {
      uVar3 = uStack_158;
    }
    if (lStack_150 != 0) {
      if (uVar3 != 0) {
        do {
          *(undefined8 *)(lStack_150 + -8 + uVar3 * 8) = 0;
          uVar3 = uVar3 - 1;
        } while (uVar3 != 0);
      }
      func_0x00611644();
    }
    func_0x006000a8(apuStack_1a0,apuStack_b0);
    func_0x00607398(apuStack_170,apuStack_1a0,param_4);
    func_0x00608730(apuStack_140,apuStack_170,apuStack_e0);
    func_0x0060986c(apuStack_110,apuStack_140,param_6);
    func_0x005ffccc(auVar4._8_8_,apuStack_110);
    apuStack_110[0] = &UNK_009f5d60;
    if (uStack_f8 <= uStack_100) {
      uStack_100 = uStack_f8;
    }
    if (lStack_f0 != 0) {
      if (uStack_100 != 0) {
        do {
          *(undefined8 *)(lStack_f0 + -8 + uStack_100 * 8) = 0;
          uStack_100 = uStack_100 - 1;
        } while (uStack_100 != 0);
      }
      func_0x00611644();
    }
    apuStack_140[0] = &UNK_009f5d60;
    if (uStack_128 <= uStack_130) {
      uStack_130 = uStack_128;
    }
    if (lStack_120 != 0) {
      if (uStack_130 != 0) {
        do {
          *(undefined8 *)(lStack_120 + -8 + uStack_130 * 8) = 0;
          uStack_130 = uStack_130 - 1;
        } while (uStack_130 != 0);
      }
      func_0x00611644();
    }
    apuStack_170[0] = &UNK_009f5d60;
    if (uStack_158 <= uStack_160) {
      uStack_160 = uStack_158;
    }
    if (lStack_150 != 0) {
      if (uStack_160 != 0) {
        do {
          *(undefined8 *)(lStack_150 + -8 + uStack_160 * 8) = 0;
          uStack_160 = uStack_160 - 1;
        } while (uStack_160 != 0);
      }
      func_0x00611644();
    }
    apuStack_1a0[0] = &UNK_009f5d60;
    if (uStack_188 <= uStack_190) {
      uStack_190 = uStack_188;
    }
    if (lStack_180 != 0) {
      if (uStack_190 != 0) {
        do {
          *(undefined8 *)(lStack_180 + -8 + uStack_190 * 8) = 0;
          uStack_190 = uStack_190 - 1;
        } while (uStack_190 != 0);
      }
      func_0x00611644();
    }
    apuStack_e0[0] = &UNK_009f5d60;
    if (uStack_c8 <= uStack_d0) {
      uStack_d0 = uStack_c8;
    }
    if (lStack_c0 != 0) {
      if (uStack_d0 != 0) {
        do {
          *(undefined8 *)(lStack_c0 + -8 + uStack_d0 * 8) = 0;
          uStack_d0 = uStack_d0 - 1;
        } while (uStack_d0 != 0);
      }
      func_0x00611644();
    }
    apuStack_b0[0] = &UNK_009f5d60;
    if (uStack_98 <= uStack_a0) {
      uStack_a0 = uStack_98;
    }
    if (lStack_90 != 0) {
      if (uStack_a0 != 0) {
        do {
          *(undefined8 *)(lStack_90 + -8 + uStack_a0 * 8) = 0;
          uStack_a0 = uStack_a0 - 1;
        } while (uStack_a0 != 0);
      }
      func_0x00611644();
    }
  }
  uVar2 = 1;
code_r0x006920dc:
  apuStack_80[0] = &UNK_009f5d60;
  if (uStack_68 <= uStack_70) {
    uStack_70 = uStack_68;
  }
  if (lStack_60 != 0) {
    if (uStack_70 != 0) {
      do {
        *(undefined8 *)(lStack_60 + -8 + uStack_70 * 8) = 0;
        uStack_70 = uStack_70 - 1;
      } while (uStack_70 != 0);
    }
    func_0x00611644();
  }
  return uVar2;
}

