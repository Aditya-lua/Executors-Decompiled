
void FUN_0058a440(void)

{
  long *plVar1;
  code *pcVar2;
  long lVar3;
  long *plVar4;
  ulong uVar5;
  undefined8 *unaff_x19;
  ulong *puVar6;
  undefined8 uVar7;
  undefined1 auVar8 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  long lStack_120;
  undefined8 uStack_118;
  long lStack_110;
  long lStack_108;
  long lStack_100;
  long *plStack_f8;
  long lStack_f0;
  long lStack_e8;
  long lStack_e0;
  long lStack_d8;
  undefined1 auStack_d0 [64];
  long lStack_90;
  long lStack_88;
  long lStack_80;
  undefined1 auStack_78 [24];
  
  unaff_x19[1] = in_stack_00000008;
  *unaff_x19 = in_stack_00000000;
  unaff_x19[3] = in_stack_00000018;
  unaff_x19[2] = in_stack_00000010;
  unaff_x19[5] = in_stack_00000028;
  unaff_x19[4] = in_stack_00000020;
  unaff_x19[6] = in_stack_00000030;
  auVar8 = __Unwind_Resume();
  plVar4 = auVar8._8_8_;
  if (*plVar4 == 0xb) {
    puVar6 = (ulong *)(plVar4 + 1);
    if (*puVar6 != 0x8000000000000001) {
      return;
    }
    plVar1 = plVar4 + 2;
    func_0x0056ba90(&lStack_120,plVar1);
    if (lStack_120 == 0) {
      return;
    }
    func_0x005882f4(auStack_d0);
    if (-1 < lStack_110) {
      if (lStack_110 == 0) {
        lVar3 = 1;
      }
      else {
        uVar7 = 1;
        lVar3 = func_0x00187bd0(lStack_110,1);
        if (lVar3 == 0) goto LAB_0058a708;
      }
      _memcpy(lVar3,uStack_118,lStack_110);
      lStack_90 = lStack_110;
      lStack_80 = lStack_110;
      lStack_f0 = plVar4[4];
      lStack_88 = lVar3;
      if (lStack_f0 == 0) {
        func_0x007a28bc(1,0,&UNK_009edf90);
        goto code_r0x0058a71c;
      }
      plVar4[4] = 1;
      lStack_108 = plVar4[3] + 0x40;
      lStack_100 = plVar4[3] + lStack_f0 * 0x40;
      lStack_e8 = 0;
      plStack_f8 = plVar1;
      func_0x0055af64(auStack_78,&lStack_108,&UNK_009f09e0);
      func_0x005ce9d0(&lStack_108,auStack_d0,&lStack_90,auStack_78);
      uVar5 = *puVar6 ^ 0x8000000000000000;
      if (1 < uVar5) {
        uVar5 = 2;
      }
      if (uVar5 != 0) {
        if (uVar5 == 1) {
          func_0x00587bf4(plVar1);
        }
        else {
          func_0x00587d08(puVar6);
        }
      }
      goto code_r0x0058a5d0;
    }
    uVar7 = 0;
LAB_0058a708:
    func_0x007a1f00(uVar7,lStack_110,&UNK_009f0c48);
    goto code_r0x0058a71c;
  }
  if (*plVar4 != 2) {
    return;
  }
  func_0x0056ba90(&lStack_120,plVar4 + 1);
  if (lStack_120 == 0) {
    return;
  }
  func_0x005882f4(auStack_d0);
  if (lStack_110 < 0) {
    uVar7 = 0;
code_r0x0058a6ec:
    func_0x007a1f00(uVar7,lStack_110,&UNK_009f0c48);
  }
  else {
    if (lStack_110 == 0) {
      lVar3 = 1;
    }
    else {
      uVar7 = 1;
      lVar3 = func_0x00187bd0(lStack_110,1);
      if (lVar3 == 0) goto code_r0x0058a6ec;
    }
    _memcpy(lVar3,uStack_118,lStack_110);
    lStack_90 = lStack_110;
    lStack_80 = lStack_110;
    lStack_f0 = plVar4[3];
    lStack_88 = lVar3;
    if (lStack_f0 != 0) {
      plVar4[3] = 1;
      lStack_108 = plVar4[2] + 0x40;
      lStack_100 = plVar4[2] + lStack_f0 * 0x40;
      lStack_e8 = 0;
      plStack_f8 = plVar4 + 1;
      func_0x0055af64(auStack_78,&lStack_108,&UNK_009f09e0);
      func_0x005ce9d0(&lStack_108,auStack_d0,&lStack_90,auStack_78);
      func_0x005876a4(plVar4);
      *plVar4 = 3;
code_r0x0058a5d0:
      plVar4[2] = lStack_100;
      plVar4[1] = lStack_108;
      plVar4[4] = lStack_f0;
      plVar4[3] = (long)plStack_f8;
      plVar4[6] = lStack_e0;
      plVar4[5] = lStack_e8;
      plVar4[7] = lStack_d8;
      *auVar8._0_8_ = 1;
      return;
    }
    func_0x007a28bc(1,0,&UNK_009edf90);
  }
code_r0x0058a71c:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x58a720);
  (*pcVar2)();
}

