
void FUN_0067e740(undefined8 param_1,undefined8 param_2,long *param_3)

{
  int iVar1;
  ulong uVar2;
  long lVar3;
  long *plVar4;
  undefined4 uVar5;
  long unaff_x20;
  undefined1 auVar6 [16];
  undefined *apuStack_1c8 [2];
  ulong uStack_1b8;
  ulong uStack_1b0;
  long lStack_1a8;
  undefined1 auStack_198 [48];
  undefined1 auStack_168 [52];
  undefined4 uStack_134;
  undefined *apuStack_130 [2];
  ulong uStack_120;
  ulong uStack_118;
  long lStack_110;
  undefined *apuStack_100 [2];
  ulong uStack_f0;
  ulong uStack_e8;
  long lStack_e0;
  undefined *apuStack_d0 [2];
  ulong uStack_c0;
  ulong uStack_b8;
  long lStack_b0;
  undefined *apuStack_a0 [2];
  ulong uStack_90;
  ulong uStack_88;
  long lStack_80;
  undefined *apuStack_70 [2];
  ulong uStack_60;
  ulong uStack_58;
  long lStack_50;
  
  lVar3 = *(long *)(unaff_x20 + 0x20);
  uVar2 = *(ulong *)(unaff_x20 + 0x10);
  if (*(ulong *)(unaff_x20 + 0x18) <= *(ulong *)(unaff_x20 + 0x10)) {
    uVar2 = *(ulong *)(unaff_x20 + 0x18);
  }
  if (lVar3 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(lVar3 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  __Unwind_Resume();
  auVar6 = func_0x0001753c();
  lVar3 = auVar6._0_8_;
  plVar4 = (long *)(lVar3 + -8);
  func_0x005fdd18(apuStack_70);
  func_0x005fdd18(apuStack_a0);
  func_0x005fdd18(apuStack_d0);
  iVar1 = (**(code **)(*param_3 + 0x10))(param_3,"Modulus",&UNK_009f5fc0,apuStack_70);
  if ((iVar1 == 0) ||
     (iVar1 = (**(code **)(*param_3 + 0x10))(param_3,"SubgroupGenerator",&UNK_009f5fc0,apuStack_d0),
     iVar1 == 0)) {
    uVar2 = (**(code **)(*param_3 + 0x10))(param_3,"ModulusSize",PTR___ZTIi_009b0170,apuStack_130);
    if ((uVar2 & 1) == 0) {
      iVar1 = (**(code **)(*param_3 + 0x10))(param_3,"KeySize",PTR___ZTIi_009b0170,apuStack_1c8);
      uVar5 = apuStack_1c8[0]._0_4_;
      if (iVar1 == 0) {
        uVar5 = 0x800;
      }
      apuStack_130[0] = (undefined *)CONCAT44(apuStack_130[0]._4_4_,uVar5);
    }
    uVar2 = (**(code **)(*param_3 + 0x10))
                      (param_3,"SubgroupOrderSize",PTR___ZTIi_009b0170,&uStack_134);
    if ((uVar2 & 1) == 0) {
      uStack_134 = (**(code **)(*plVar4 + 0xb8))(plVar4,(ulong)apuStack_130[0] & 0xffffffff);
    }
    func_0x0067e6b0(apuStack_1c8);
    iVar1 = (**(code **)(*plVar4 + 0xb0))(plVar4);
    uVar5 = 1;
    if (iVar1 != 1) {
      uVar5 = 0xffffffff;
    }
    func_0x00692d10(apuStack_1c8,uVar5,auVar6._8_8_,(ulong)apuStack_130[0] & 0xffffffff,uStack_134);
    func_0x005ffccc(apuStack_70,apuStack_1c8);
    func_0x005ffccc(apuStack_a0,auStack_198);
    func_0x005ffccc(apuStack_d0,auStack_168);
    func_0x0067fe54(apuStack_1c8);
  }
  else {
    func_0x0064c514(apuStack_130,plVar4,apuStack_70);
    func_0x00609b98(apuStack_100,apuStack_130,2);
    func_0x00604a88(apuStack_1c8,param_3,"SubgroupOrder",apuStack_100);
    func_0x005ffccc(apuStack_a0,apuStack_1c8);
    apuStack_1c8[0] = &UNK_009f5d60;
    if (uStack_1b0 <= uStack_1b8) {
      uStack_1b8 = uStack_1b0;
    }
    if (lStack_1a8 != 0) {
      if (uStack_1b8 != 0) {
        do {
          *(undefined8 *)(lStack_1a8 + -8 + uStack_1b8 * 8) = 0;
          uStack_1b8 = uStack_1b8 - 1;
        } while (uStack_1b8 != 0);
      }
      func_0x00611644();
    }
    apuStack_100[0] = &UNK_009f5d60;
    if (uStack_e8 <= uStack_f0) {
      uStack_f0 = uStack_e8;
    }
    if (lStack_e0 != 0) {
      if (uStack_f0 != 0) {
        do {
          *(undefined8 *)(lStack_e0 + -8 + uStack_f0 * 8) = 0;
          uStack_f0 = uStack_f0 - 1;
        } while (uStack_f0 != 0);
      }
      func_0x00611644();
    }
    apuStack_130[0] = &UNK_009f5d60;
    if (uStack_118 <= uStack_120) {
      uStack_120 = uStack_118;
    }
    if (lStack_110 != 0) {
      if (uStack_120 != 0) {
        do {
          *(undefined8 *)(lStack_110 + -8 + uStack_120 * 8) = 0;
          uStack_120 = uStack_120 - 1;
        } while (uStack_120 != 0);
      }
      func_0x00611644();
    }
  }
  (**(code **)(*plVar4 + 0xa8))(plVar4,apuStack_70,apuStack_d0);
  func_0x005ffccc(lVar3 + 0x10,apuStack_a0);
  *(undefined4 *)(lVar3 + 8) = 0;
  apuStack_d0[0] = &UNK_009f5d60;
  if (uStack_b8 <= uStack_c0) {
    uStack_c0 = uStack_b8;
  }
  if (lStack_b0 != 0) {
    if (uStack_c0 != 0) {
      do {
        *(undefined8 *)(lStack_b0 + -8 + uStack_c0 * 8) = 0;
        uStack_c0 = uStack_c0 - 1;
      } while (uStack_c0 != 0);
    }
    func_0x00611644();
  }
  apuStack_a0[0] = &UNK_009f5d60;
  if (uStack_88 <= uStack_90) {
    uStack_90 = uStack_88;
  }
  if (lStack_80 != 0) {
    if (uStack_90 != 0) {
      do {
        *(undefined8 *)(lStack_80 + -8 + uStack_90 * 8) = 0;
        uStack_90 = uStack_90 - 1;
      } while (uStack_90 != 0);
    }
    func_0x00611644();
  }
  apuStack_70[0] = &UNK_009f5d60;
  if (uStack_58 <= uStack_60) {
    uStack_60 = uStack_58;
  }
  if (lStack_50 != 0) {
    if (uStack_60 != 0) {
      do {
        *(undefined8 *)(lStack_50 + -8 + uStack_60 * 8) = 0;
        uStack_60 = uStack_60 - 1;
      } while (uStack_60 != 0);
    }
    func_0x00611644();
  }
  return;
}

