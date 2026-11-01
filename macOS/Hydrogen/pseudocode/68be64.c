
bool FUN_0068be64(undefined8 param_1,undefined8 param_2,uint param_3)

{
  bool bVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  ulong unaff_x21;
  uint uVar5;
  long unaff_x29;
  undefined1 auVar6 [16];
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
  
  func_0x00087574(unaff_x29 + -0xa0);
  if ((unaff_x21 & 1) == 0) {
    func_0x00087574(unaff_x29 + -0x70);
  }
  auVar6 = __Unwind_Resume(param_1);
  uVar4 = auVar6._8_8_;
  func_0x005fe1e8(apuStack_90,3);
  iVar2 = func_0x00609ec8(uVar4,apuStack_90);
  apuStack_90[0] = &UNK_009f5d60;
  uVar3 = uStack_80;
  if (uStack_78 <= uStack_80) {
    uVar3 = uStack_78;
  }
  if (lStack_70 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lStack_70 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  if (iVar2 < 1) {
    func_0x005fe1e8(apuStack_90,2);
    iVar2 = func_0x00609ec8(uVar4,apuStack_90);
    if (iVar2 == 0) {
      bVar1 = true;
    }
    else {
      func_0x005fe1e8(apuStack_c0,3);
      iVar2 = func_0x00609ec8(uVar4,apuStack_c0);
      bVar1 = iVar2 == 0;
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
    }
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
    func_0x005fdd18();
    if (param_3 == 0) {
      bVar1 = true;
    }
    else {
      bVar1 = false;
      uVar5 = 0;
      do {
        func_0x005fe1e8(apuStack_c0,2);
        func_0x005fe1e8(apuStack_120,2);
        func_0x00607398(apuStack_f0,uVar4,apuStack_120);
        func_0x00602f68(apuStack_90,auVar6._0_8_,apuStack_c0,apuStack_f0);
        apuStack_f0[0] = &UNK_009f5d60;
        uVar3 = uStack_e0;
        if (uStack_d8 <= uStack_e0) {
          uVar3 = uStack_d8;
        }
        if (lStack_d0 != 0) {
          if (uVar3 != 0) {
            do {
              *(undefined8 *)(lStack_d0 + -8 + uVar3 * 8) = 0;
              uVar3 = uVar3 - 1;
            } while (uVar3 != 0);
          }
          func_0x00611644();
        }
        apuStack_120[0] = &UNK_009f5d60;
        uVar3 = uStack_110;
        if (uStack_108 <= uStack_110) {
          uVar3 = uStack_108;
        }
        if (lStack_100 != 0) {
          if (uVar3 != 0) {
            do {
              *(undefined8 *)(lStack_100 + -8 + uVar3 * 8) = 0;
              uVar3 = uVar3 - 1;
            } while (uVar3 != 0);
          }
          func_0x00611644();
        }
        apuStack_c0[0] = &UNK_009f5d60;
        uVar3 = uStack_b0;
        if (uStack_a8 <= uStack_b0) {
          uVar3 = uStack_a8;
        }
        if (lStack_a0 != 0) {
          if (uVar3 != 0) {
            do {
              *(undefined8 *)(lStack_a0 + -8 + uVar3 * 8) = 0;
              uVar3 = uVar3 - 1;
            } while (uVar3 != 0);
          }
          func_0x00611644();
        }
        uVar3 = func_0x0068b85c(uVar4,apuStack_90);
        if ((uVar3 & 1) == 0) break;
        uVar5 = uVar5 + 1;
        bVar1 = param_3 <= uVar5;
      } while (uVar5 != param_3);
    }
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
  return bVar1;
}

