
bool FUN_0068c230(undefined8 param_1)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  ulong uVar5;
  long unaff_x29;
  undefined1 uStack0000000000000060;
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
  
  func_0x00087574(&uStack0000000000000060);
  func_0x00087574(unaff_x29 + -0x80);
  uVar4 = __Unwind_Resume(param_1);
  func_0x00087574(unaff_x29 + -0x80);
  uVar4 = __Unwind_Resume(uVar4);
  func_0x005fe1e8(apuStack_80,1);
  iVar2 = func_0x00609ec8(uVar4,apuStack_80);
  apuStack_80[0] = &UNK_009f5d60;
  uVar5 = uStack_70;
  if (uStack_68 <= uStack_70) {
    uVar5 = uStack_68;
  }
  if (lStack_60 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(lStack_60 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  if (iVar2 < 1) {
    bVar1 = false;
  }
  else {
    uVar5 = func_0x005ffe3c(uVar4,0);
    if ((uVar5 & 1) == 0) {
      func_0x005fe1e8(apuStack_80,2);
      iVar2 = func_0x00609ec8(uVar4,apuStack_80);
      bVar1 = iVar2 == 0;
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
    }
    else {
      func_0x005fe1e8(apuStack_80,3);
      iVar2 = 0;
      while( true ) {
        func_0x00608730(apuStack_e0,apuStack_80,apuStack_80);
        func_0x005fe1e8(apuStack_110,4);
        func_0x00607398(apuStack_b0,apuStack_e0,apuStack_110);
        iVar3 = func_0x0068c6f4(apuStack_b0,uVar4);
        apuStack_b0[0] = &UNK_009f5d60;
        uVar5 = uStack_a0;
        if (uStack_98 <= uStack_a0) {
          uVar5 = uStack_98;
        }
        if (lStack_90 != 0) {
          if (uVar5 != 0) {
            do {
              *(undefined8 *)(lStack_90 + -8 + uVar5 * 8) = 0;
              uVar5 = uVar5 - 1;
            } while (uVar5 != 0);
          }
          func_0x00611644();
        }
        apuStack_110[0] = &UNK_009f5d60;
        uVar5 = uStack_100;
        if (uStack_f8 <= uStack_100) {
          uVar5 = uStack_f8;
        }
        if (lStack_f0 != 0) {
          if (uVar5 != 0) {
            do {
              *(undefined8 *)(lStack_f0 + -8 + uVar5 * 8) = 0;
              uVar5 = uVar5 - 1;
            } while (uVar5 != 0);
          }
          func_0x00611644();
        }
        apuStack_e0[0] = &UNK_009f5d60;
        uVar5 = uStack_d0;
        if (uStack_c8 <= uStack_d0) {
          uVar5 = uStack_c8;
        }
        if (lStack_c0 != 0) {
          if (uVar5 != 0) {
            do {
              *(undefined8 *)(lStack_c0 + -8 + uVar5 * 8) = 0;
              uVar5 = uVar5 - 1;
            } while (uVar5 != 0);
          }
          func_0x00611644();
        }
        if (iVar3 != 1) break;
        iVar2 = iVar2 + 1;
        if ((iVar2 == 0x40) && (uVar5 = func_0x0060a44c(uVar4), (uVar5 & 1) != 0))
        goto LAB_0068c46c;
        func_0x00605a2c(apuStack_80);
        func_0x00605a2c(apuStack_80);
      }
      if (iVar3 != 0) {
        func_0x005fe1e8(apuStack_110,1);
        func_0x006072ac(apuStack_e0,uVar4,apuStack_110);
        func_0x0068c96c(apuStack_b0,apuStack_e0,apuStack_80,uVar4);
        func_0x005fe1e8(apuStack_140,2);
        iVar2 = func_0x00609ec8(apuStack_b0,apuStack_140);
        bVar1 = iVar2 == 0;
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
        goto LAB_0068c58c;
      }
LAB_0068c46c:
      bVar1 = false;
LAB_0068c58c:
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
    }
  }
  return bVar1;
}

