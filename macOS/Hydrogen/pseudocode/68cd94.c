
bool FUN_0068cd94(void)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  ulong uVar5;
  uint uVar6;
  uint uVar7;
  undefined1 uStack0000000000000038;
  undefined1 uStack0000000000000068;
  undefined1 uStack0000000000000098;
  undefined *apuStack_1e0 [2];
  ulong uStack_1d0;
  ulong uStack_1c8;
  long lStack_1c0;
  undefined *apuStack_1b0 [2];
  ulong uStack_1a0;
  ulong uStack_198;
  long lStack_190;
  undefined *apuStack_180 [2];
  ulong uStack_170;
  ulong uStack_168;
  long lStack_160;
  undefined *apuStack_150 [2];
  ulong uStack_140;
  ulong uStack_138;
  long lStack_130;
  undefined *apuStack_120 [2];
  ulong uStack_110;
  ulong uStack_108;
  long lStack_100;
  undefined *apuStack_f0 [2];
  ulong uStack_e0;
  ulong uStack_d8;
  long lStack_d0;
  undefined *apuStack_c0 [2];
  ulong uStack_b0;
  ulong uStack_a8;
  long lStack_a0;
  undefined *apuStack_90 [2];
  ulong uStack_80;
  ulong uStack_78;
  long lStack_70;
  
  func_0x00087574();
  func_0x00087574(&uStack0000000000000038);
  func_0x00087574(&uStack0000000000000068);
  func_0x00610518(&uStack0000000000000098);
  uVar4 = __Unwind_Resume();
  func_0x005fe1e8(apuStack_90,1);
  iVar2 = func_0x00609ec8(uVar4,apuStack_90);
  apuStack_90[0] = &UNK_009f5d60;
  uVar5 = uStack_80;
  if (uStack_78 <= uStack_80) {
    uVar5 = uStack_78;
  }
  if (lStack_70 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(lStack_70 + -8 + uVar5 * 8) = 0;
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
      func_0x005fe1e8(apuStack_90,2);
      iVar2 = func_0x00609ec8(uVar4,apuStack_90);
      bVar1 = iVar2 == 0;
      apuStack_90[0] = &UNK_009f5d60;
      if (uStack_78 <= uStack_80) {
        uStack_80 = uStack_78;
      }
      if (lStack_70 != 0) {
        if (uStack_80 != 0) {
          do {
            *(undefined8 *)(lStack_70 + -8 + uStack_80 * 8) = 0;
            uStack_80 = uStack_80 - 1;
          } while (uStack_80 != 0);
        }
        func_0x00611644();
      }
    }
    else {
      func_0x005fe1e8(apuStack_90,3);
      iVar2 = 0;
      while( true ) {
        func_0x00608730(apuStack_f0,apuStack_90,apuStack_90);
        func_0x005fe1e8(apuStack_120,4);
        func_0x00607398(apuStack_c0,apuStack_f0,apuStack_120);
        iVar3 = func_0x0068c6f4(apuStack_c0,uVar4);
        apuStack_c0[0] = &UNK_009f5d60;
        uVar5 = uStack_b0;
        if (uStack_a8 <= uStack_b0) {
          uVar5 = uStack_a8;
        }
        if (lStack_a0 != 0) {
          if (uVar5 != 0) {
            do {
              *(undefined8 *)(lStack_a0 + -8 + uVar5 * 8) = 0;
              uVar5 = uVar5 - 1;
            } while (uVar5 != 0);
          }
          func_0x00611644();
        }
        apuStack_120[0] = &UNK_009f5d60;
        uVar5 = uStack_110;
        if (uStack_108 <= uStack_110) {
          uVar5 = uStack_108;
        }
        if (lStack_100 != 0) {
          if (uVar5 != 0) {
            do {
              *(undefined8 *)(lStack_100 + -8 + uVar5 * 8) = 0;
              uVar5 = uVar5 - 1;
            } while (uVar5 != 0);
          }
          func_0x00611644();
        }
        apuStack_f0[0] = &UNK_009f5d60;
        uVar5 = uStack_e0;
        if (uStack_d8 <= uStack_e0) {
          uVar5 = uStack_d8;
        }
        if (lStack_d0 != 0) {
          if (uVar5 != 0) {
            do {
              *(undefined8 *)(lStack_d0 + -8 + uVar5 * 8) = 0;
              uVar5 = uVar5 - 1;
            } while (uVar5 != 0);
          }
          func_0x00611644();
        }
        if (iVar3 != 1) break;
        iVar2 = iVar2 + 1;
        if ((iVar2 == 0x40) && (uVar5 = func_0x0060a44c(uVar4), (uVar5 & 1) != 0))
        goto code_r0x0068cfc8;
        func_0x00605a2c(apuStack_90);
        func_0x00605a2c(apuStack_90);
      }
      if (iVar3 != 0) {
        func_0x005fe1e8(apuStack_f0,1);
        func_0x006072ac(apuStack_c0,uVar4,apuStack_f0);
        apuStack_f0[0] = &UNK_009f5d60;
        uVar5 = uStack_e0;
        if (uStack_d8 <= uStack_e0) {
          uVar5 = uStack_d8;
        }
        if (lStack_d0 != 0) {
          if (uVar5 != 0) {
            do {
              *(undefined8 *)(lStack_d0 + -8 + uVar5 * 8) = 0;
              uVar5 = uVar5 - 1;
            } while (uVar5 != 0);
          }
          func_0x00611644();
        }
        uVar6 = 0;
        while (uVar5 = func_0x005ffe3c(apuStack_c0,uVar6), (uVar5 & 1) == 0) {
          uVar6 = uVar6 + 1;
        }
        func_0x00609afc(apuStack_f0,apuStack_c0,uVar6);
        func_0x0068c96c(apuStack_120,apuStack_f0,apuStack_90,uVar4);
        func_0x005fe1e8(apuStack_150,2);
        iVar2 = func_0x00609ec8(apuStack_120,apuStack_150);
        if (iVar2 == 0) {
          bVar1 = true;
        }
        else {
          func_0x005fe1e8(apuStack_1b0,2);
          func_0x00607398(apuStack_180,uVar4,apuStack_1b0);
          iVar2 = func_0x00609ec8(apuStack_120,apuStack_180);
          bVar1 = iVar2 == 0;
          apuStack_180[0] = &UNK_009f5d60;
          uVar5 = uStack_170;
          if (uStack_168 <= uStack_170) {
            uVar5 = uStack_168;
          }
          if (lStack_160 != 0) {
            if (uVar5 != 0) {
              do {
                *(undefined8 *)(lStack_160 + -8 + uVar5 * 8) = 0;
                uVar5 = uVar5 - 1;
              } while (uVar5 != 0);
            }
            func_0x00611644();
          }
          apuStack_1b0[0] = &UNK_009f5d60;
          uVar5 = uStack_1a0;
          if (uStack_198 <= uStack_1a0) {
            uVar5 = uStack_198;
          }
          if (lStack_190 != 0) {
            if (uVar5 != 0) {
              do {
                *(undefined8 *)(lStack_190 + -8 + uVar5 * 8) = 0;
                uVar5 = uVar5 - 1;
              } while (uVar5 != 0);
            }
            func_0x00611644();
          }
        }
        apuStack_150[0] = &UNK_009f5d60;
        uVar5 = uStack_140;
        if (uStack_138 <= uStack_140) {
          uVar5 = uStack_138;
        }
        if (lStack_130 != 0) {
          if (uVar5 != 0) {
            do {
              *(undefined8 *)(lStack_130 + -8 + uVar5 * 8) = 0;
              uVar5 = uVar5 - 1;
            } while (uVar5 != 0);
          }
          func_0x00611644();
        }
        if (bVar1) {
          bVar1 = true;
        }
        else if (uVar6 < 2) {
          bVar1 = false;
        }
        else {
          uVar7 = 1;
          while( true ) {
            func_0x00608730(apuStack_1b0,apuStack_120,apuStack_120);
            func_0x005fe1e8(apuStack_1e0,2);
            func_0x00607398(apuStack_180,apuStack_1b0,apuStack_1e0);
            func_0x0060986c(apuStack_150,apuStack_180,uVar4);
            func_0x005ffccc(apuStack_120,apuStack_150);
            apuStack_150[0] = &UNK_009f5d60;
            uVar5 = uStack_140;
            if (uStack_138 <= uStack_140) {
              uVar5 = uStack_138;
            }
            if (lStack_130 != 0) {
              if (uVar5 != 0) {
                do {
                  *(undefined8 *)(lStack_130 + -8 + uVar5 * 8) = 0;
                  uVar5 = uVar5 - 1;
                } while (uVar5 != 0);
              }
              func_0x00611644();
            }
            apuStack_180[0] = &UNK_009f5d60;
            uVar5 = uStack_170;
            if (uStack_168 <= uStack_170) {
              uVar5 = uStack_168;
            }
            if (lStack_160 != 0) {
              if (uVar5 != 0) {
                do {
                  *(undefined8 *)(lStack_160 + -8 + uVar5 * 8) = 0;
                  uVar5 = uVar5 - 1;
                } while (uVar5 != 0);
              }
              func_0x00611644();
            }
            apuStack_1e0[0] = &UNK_009f5d60;
            uVar5 = uStack_1d0;
            if (uStack_1c8 <= uStack_1d0) {
              uVar5 = uStack_1c8;
            }
            if (lStack_1c0 != 0) {
              if (uVar5 != 0) {
                do {
                  *(undefined8 *)(lStack_1c0 + -8 + uVar5 * 8) = 0;
                  uVar5 = uVar5 - 1;
                } while (uVar5 != 0);
              }
              func_0x00611644();
            }
            apuStack_1b0[0] = &UNK_009f5d60;
            uVar5 = uStack_1a0;
            if (uStack_198 <= uStack_1a0) {
              uVar5 = uStack_198;
            }
            if (lStack_190 != 0) {
              if (uVar5 != 0) {
                do {
                  *(undefined8 *)(lStack_190 + -8 + uVar5 * 8) = 0;
                  uVar5 = uVar5 - 1;
                } while (uVar5 != 0);
              }
              func_0x00611644();
            }
            func_0x005fe1e8(apuStack_180,2);
            func_0x00607398(apuStack_150,uVar4,apuStack_180);
            iVar2 = func_0x00609ec8(apuStack_120,apuStack_150);
            bVar1 = iVar2 == 0;
            apuStack_150[0] = &UNK_009f5d60;
            uVar5 = uStack_140;
            if (uStack_138 <= uStack_140) {
              uVar5 = uStack_138;
            }
            if (lStack_130 != 0) {
              if (uVar5 != 0) {
                do {
                  *(undefined8 *)(lStack_130 + -8 + uVar5 * 8) = 0;
                  uVar5 = uVar5 - 1;
                } while (uVar5 != 0);
              }
              func_0x00611644();
            }
            apuStack_180[0] = &UNK_009f5d60;
            uVar5 = uStack_170;
            if (uStack_168 <= uStack_170) {
              uVar5 = uStack_168;
            }
            if (lStack_160 != 0) {
              if (uVar5 != 0) {
                do {
                  *(undefined8 *)(lStack_160 + -8 + uVar5 * 8) = 0;
                  uVar5 = uVar5 - 1;
                } while (uVar5 != 0);
              }
              func_0x00611644();
            }
            if (iVar2 == 0) break;
            func_0x005fe1e8(apuStack_150,2);
            iVar2 = func_0x00609ec8(apuStack_120,apuStack_150);
            apuStack_150[0] = &UNK_009f5d60;
            uVar5 = uStack_140;
            if (uStack_138 <= uStack_140) {
              uVar5 = uStack_138;
            }
            if (lStack_130 != 0) {
              if (uVar5 != 0) {
                do {
                  *(undefined8 *)(lStack_130 + -8 + uVar5 * 8) = 0;
                  uVar5 = uVar5 - 1;
                } while (uVar5 != 0);
              }
              func_0x00611644();
            }
            bVar1 = false;
            if ((iVar2 == 0) || (uVar7 = uVar7 + 1, uVar6 == uVar7)) break;
          }
        }
        apuStack_120[0] = &UNK_009f5d60;
        if (uStack_108 <= uStack_110) {
          uStack_110 = uStack_108;
        }
        if (lStack_100 != 0) {
          if (uStack_110 != 0) {
            do {
              *(undefined8 *)(lStack_100 + -8 + uStack_110 * 8) = 0;
              uStack_110 = uStack_110 - 1;
            } while (uStack_110 != 0);
          }
          func_0x00611644();
        }
        apuStack_f0[0] = &UNK_009f5d60;
        if (uStack_d8 <= uStack_e0) {
          uStack_e0 = uStack_d8;
        }
        if (lStack_d0 != 0) {
          if (uStack_e0 != 0) {
            do {
              *(undefined8 *)(lStack_d0 + -8 + uStack_e0 * 8) = 0;
              uStack_e0 = uStack_e0 - 1;
            } while (uStack_e0 != 0);
          }
          func_0x00611644();
        }
        apuStack_c0[0] = &UNK_009f5d60;
        if (uStack_a8 <= uStack_b0) {
          uStack_b0 = uStack_a8;
        }
        if (lStack_a0 != 0) {
          if (uStack_b0 != 0) {
            do {
              *(undefined8 *)(lStack_a0 + -8 + uStack_b0 * 8) = 0;
              uStack_b0 = uStack_b0 - 1;
            } while (uStack_b0 != 0);
          }
          func_0x00611644();
        }
        goto code_r0x0068d41c;
      }
code_r0x0068cfc8:
      bVar1 = false;
code_r0x0068d41c:
      apuStack_90[0] = &UNK_009f5d60;
      if (uStack_78 <= uStack_80) {
        uStack_80 = uStack_78;
      }
      if (lStack_70 != 0) {
        if (uStack_80 != 0) {
          do {
            *(undefined8 *)(lStack_70 + -8 + uStack_80 * 8) = 0;
            uStack_80 = uStack_80 - 1;
          } while (uStack_80 != 0);
        }
        func_0x00611644();
      }
    }
  }
  return bVar1;
}

