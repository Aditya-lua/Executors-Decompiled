
void FUN_00622f58(long param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  int iVar1;
  long *plVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 extraout_x8;
  ulong uVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long unaff_x29;
  undefined1 auVar9 [16];
  long lStack0000000000000048;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  long in_stack_00000068;
  undefined1 uStack00000000000000a8;
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
  
  lStack0000000000000048 = param_1 + 0xd60;
  if (in_stack_00000060 <= in_stack_00000058) {
    in_stack_00000058 = in_stack_00000060;
  }
  if (in_stack_00000068 != 0) {
    if (in_stack_00000058 != 0) {
      do {
        *(undefined8 *)(in_stack_00000068 + -8 + in_stack_00000058 * 8) = 0;
        in_stack_00000058 = in_stack_00000058 - 1;
      } while (in_stack_00000058 != 0);
    }
    func_0x00611644();
  }
  func_0x00087574(&uStack00000000000000a8);
  func_0x00087574(unaff_x29 + -0xb8);
  func_0x00087574(unaff_x29 + -0x88);
  auVar9 = __Unwind_Resume();
  lVar4 = auVar9._8_8_;
  plVar2 = auVar9._0_8_;
  lVar6 = (param_4 - lVar4 >> 5) * -0x5555555555555555;
  if (lVar6 - 2U == 0) {
                    /* WARNING: Could not recover jumptable at 0x00623220. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*plVar2 + 0x60))(extraout_x8,plVar2,lVar4,lVar4 + 0x30,lVar4 + 0x60,lVar4 + 0x90);
    return;
  }
  if (lVar6 == 1) {
                    /* WARNING: Could not recover jumptable at 0x006231e0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*plVar2 + 0x58))(extraout_x8,plVar2,lVar4,lVar4 + 0x30);
    return;
  }
  func_0x005fdd18(apuStack_90);
  func_0x005fdd18(apuStack_c0);
  if (0x60 < param_4 - lVar4) {
    uVar5 = lVar6 - 2U >> 1;
    lVar8 = uVar5 + 1;
    lVar7 = lVar4 + uVar5 * 0x60;
    do {
      func_0x00659964(lVar4,apuStack_f0,lVar6,lVar7);
      lVar7 = lVar7 + -0x60;
      lVar8 = lVar8 + -1;
    } while (lVar8 != 0);
  }
  func_0x00659be4(lVar4,param_4,apuStack_f0,lVar6);
  lVar8 = param_4 + -0x60;
  lVar7 = param_4 + -0x30;
  while (uVar5 = func_0x005ffc7c(lVar4 + 0x30), (uVar5 & 1) == 0) {
    func_0x005ffccc(apuStack_c0,lVar7);
    func_0x00608f38(lVar7,apuStack_90,apuStack_c0,lVar4 + 0x30);
    uVar3 = func_0x00604ce4();
    iVar1 = func_0x00609ec8(apuStack_90,uVar3);
    if (iVar1 == 0) {
      (**(code **)(*plVar2 + 0x48))(plVar2,lVar4,lVar8);
    }
    else {
      (**(code **)(*plVar2 + 0x58))(apuStack_f0,plVar2,lVar8,apuStack_90);
      (**(code **)(*plVar2 + 0x48))(plVar2,lVar4,apuStack_f0);
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
    }
    func_0x00659e44(lVar4,param_4,apuStack_f0,lVar6);
    func_0x00659be4(lVar4,param_4,apuStack_f0,lVar6);
  }
  (**(code **)(*plVar2 + 0x58))(extraout_x8,plVar2,lVar8,lVar7);
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
  return;
}

