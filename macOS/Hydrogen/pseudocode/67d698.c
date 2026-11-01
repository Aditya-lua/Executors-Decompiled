
void FUN_0067d698(undefined8 param_1,undefined8 param_2,long *param_3)

{
  int iVar1;
  long *plVar2;
  ulong uVar3;
  undefined4 uVar4;
  uint unaff_w21;
  long unaff_x29;
  undefined1 auVar5 [16];
  undefined8 in_stack_00000070;
  long in_stack_00000080;
  undefined1 uStack00000000000000a0;
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
  
  if (in_stack_00000080 < 0) {
    __ZdlPv(in_stack_00000070);
    unaff_w21 = unaff_w21 & 1;
  }
  if (unaff_w21 != 0) {
    ___cxa_free_exception();
  }
  func_0x00087574(&uStack00000000000000a0);
  func_0x00087574(unaff_x29 + -0x90);
  func_0x00087574(unaff_x29 + -0x60);
  auVar5 = __Unwind_Resume(param_1);
  plVar2 = auVar5._0_8_;
  func_0x005fdd18(apuStack_70);
  func_0x005fdd18(apuStack_a0);
  func_0x005fdd18(apuStack_d0);
  iVar1 = (**(code **)(*param_3 + 0x10))(param_3,"Modulus",&UNK_009f5fc0,apuStack_70);
  if ((iVar1 == 0) ||
     (iVar1 = (**(code **)(*param_3 + 0x10))(param_3,"SubgroupGenerator",&UNK_009f5fc0,apuStack_d0),
     iVar1 == 0)) {
    uVar3 = (**(code **)(*param_3 + 0x10))(param_3,"ModulusSize",PTR___ZTIi_009b0170,apuStack_130);
    if ((uVar3 & 1) == 0) {
      iVar1 = (**(code **)(*param_3 + 0x10))(param_3,"KeySize",PTR___ZTIi_009b0170,apuStack_1c8);
      uVar4 = apuStack_1c8[0]._0_4_;
      if (iVar1 == 0) {
        uVar4 = 0x800;
      }
      apuStack_130[0] = (undefined *)CONCAT44(apuStack_130[0]._4_4_,uVar4);
    }
    uVar3 = (**(code **)(*param_3 + 0x10))
                      (param_3,"SubgroupOrderSize",PTR___ZTIi_009b0170,&uStack_134);
    if ((uVar3 & 1) == 0) {
      uStack_134 = (**(code **)(*plVar2 + 0xb8))(plVar2,(ulong)apuStack_130[0] & 0xffffffff);
    }
    func_0x0067e6b0(apuStack_1c8);
    iVar1 = (**(code **)(*plVar2 + 0xb0))(plVar2);
    uVar4 = 1;
    if (iVar1 != 1) {
      uVar4 = 0xffffffff;
    }
    func_0x00692d10(apuStack_1c8,uVar4,auVar5._8_8_,(ulong)apuStack_130[0] & 0xffffffff,uStack_134);
    func_0x005ffccc(apuStack_70,apuStack_1c8);
    func_0x005ffccc(apuStack_a0,auStack_198);
    func_0x005ffccc(apuStack_d0,auStack_168);
    func_0x0067fe54(apuStack_1c8);
  }
  else {
    func_0x0064c514(apuStack_130,plVar2,apuStack_70);
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
  (**(code **)(*plVar2 + 0xa8))(plVar2,apuStack_70,apuStack_d0);
  func_0x005ffccc(plVar2 + 3,apuStack_a0);
  *(undefined4 *)(plVar2 + 2) = 0;
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

