
void FUN_0057fef0(void)

{
  long *plVar1;
  code *pcVar2;
  long lVar3;
  long *plVar4;
  ulong uVar5;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  undefined8 *unaff_x21;
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
  
  func_0x0057c5c4();
  __Unwind_Resume();
  func_0x007a2668();
  *unaff_x21 = unaff_x20;
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
    func_0x0057dc40(auStack_d0);
    if (-1 < lStack_110) {
      if (lStack_110 == 0) {
        lVar3 = 1;
      }
      else {
        uVar7 = 1;
        lVar3 = func_0x00187bd0(lStack_110,1);
        if (lVar3 == 0) goto LAB_005801cc;
      }
      _memcpy(lVar3,uStack_118,lStack_110);
      lStack_90 = lStack_110;
      lStack_80 = lStack_110;
      lStack_f0 = plVar4[4];
      lStack_88 = lVar3;
      if (lStack_f0 == 0) {
        func_0x007a28bc(1,0,&UNK_009edf90);
        goto LAB_005801e0;
      }
      plVar4[4] = 1;
      lStack_108 = plVar4[3] + 0x40;
      lStack_100 = plVar4[3] + lStack_f0 * 0x40;
      lStack_e8 = 0;
      plStack_f8 = plVar1;
      func_0x0055af64(auStack_78,&lStack_108,&UNK_009f02e0);
      func_0x005ce9d0(&lStack_108,auStack_d0,&lStack_90,auStack_78);
      uVar5 = *puVar6 ^ 0x8000000000000000;
      if (1 < uVar5) {
        uVar5 = 2;
      }
      if (uVar5 != 0) {
        if (uVar5 == 1) {
          func_0x0057d2dc(plVar1);
        }
        else {
          func_0x0057d54c(puVar6);
        }
      }
      goto LAB_00580094;
    }
    uVar7 = 0;
LAB_005801cc:
    func_0x007a1f00(uVar7,lStack_110,&UNK_009f0528);
    goto LAB_005801e0;
  }
  if (*plVar4 != 2) {
    return;
  }
  func_0x0056ba90(&lStack_120,plVar4 + 1);
  if (lStack_120 == 0) {
    return;
  }
  func_0x0057dc40(auStack_d0);
  if (lStack_110 < 0) {
    uVar7 = 0;
LAB_005801b0:
    func_0x007a1f00(uVar7,lStack_110,&UNK_009f0528);
  }
  else {
    if (lStack_110 == 0) {
      lVar3 = 1;
    }
    else {
      uVar7 = 1;
      lVar3 = func_0x00187bd0(lStack_110,1);
      if (lVar3 == 0) goto LAB_005801b0;
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
      func_0x0055af64(auStack_78,&lStack_108,&UNK_009f02e0);
      func_0x005ce9d0(&lStack_108,auStack_d0,&lStack_90,auStack_78);
      func_0x0057c5c4(plVar4);
      *plVar4 = 3;
LAB_00580094:
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
LAB_005801e0:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x5801e4);
  (*pcVar2)();
}

