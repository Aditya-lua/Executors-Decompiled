
void FUN_0058a3fc(long param_1)

{
  long *plVar1;
  code *pcVar2;
  undefined8 *puVar3;
  long lVar4;
  long *plVar5;
  ulong uVar6;
  undefined8 unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  ulong *puVar7;
  undefined8 uVar8;
  undefined1 auVar9 [16];
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
  
  func_0x007a23bc(param_1 + 0xcf0);
  func_0x007a247c(&UNK_008ad6b7,0x28,&UNK_009f0d08);
  *(undefined8 *)(unaff_x20 + 0x10) = unaff_x19;
  puVar3 = (undefined8 *)__Unwind_Resume();
  func_0x005876a4();
  __Unwind_Resume(puVar3);
  func_0x007a2668();
  *unaff_x21 = unaff_x20;
  puVar3[1] = in_stack_00000008;
  *puVar3 = in_stack_00000000;
  puVar3[3] = in_stack_00000018;
  puVar3[2] = in_stack_00000010;
  puVar3[5] = in_stack_00000028;
  puVar3[4] = in_stack_00000020;
  puVar3[6] = in_stack_00000030;
  auVar9 = __Unwind_Resume();
  plVar5 = auVar9._8_8_;
  if (*plVar5 == 0xb) {
    puVar7 = (ulong *)(plVar5 + 1);
    if (*puVar7 != 0x8000000000000001) {
      return;
    }
    plVar1 = plVar5 + 2;
    func_0x0056ba90(&lStack_120,plVar1);
    if (lStack_120 == 0) {
      return;
    }
    func_0x005882f4(auStack_d0);
    if (-1 < lStack_110) {
      if (lStack_110 == 0) {
        lVar4 = 1;
      }
      else {
        uVar8 = 1;
        lVar4 = func_0x00187bd0(lStack_110,1);
        if (lVar4 == 0) goto code_r0x0058a708;
      }
      _memcpy(lVar4,uStack_118,lStack_110);
      lStack_90 = lStack_110;
      lStack_80 = lStack_110;
      lStack_f0 = plVar5[4];
      lStack_88 = lVar4;
      if (lStack_f0 == 0) {
        func_0x007a28bc(1,0,&UNK_009edf90);
        goto code_r0x0058a71c;
      }
      plVar5[4] = 1;
      lStack_108 = plVar5[3] + 0x40;
      lStack_100 = plVar5[3] + lStack_f0 * 0x40;
      lStack_e8 = 0;
      plStack_f8 = plVar1;
      func_0x0055af64(auStack_78,&lStack_108,&UNK_009f09e0);
      func_0x005ce9d0(&lStack_108,auStack_d0,&lStack_90,auStack_78);
      uVar6 = *puVar7 ^ 0x8000000000000000;
      if (1 < uVar6) {
        uVar6 = 2;
      }
      if (uVar6 != 0) {
        if (uVar6 == 1) {
          func_0x00587bf4(plVar1);
        }
        else {
          func_0x00587d08(puVar7);
        }
      }
      goto code_r0x0058a5d0;
    }
    uVar8 = 0;
code_r0x0058a708:
    func_0x007a1f00(uVar8,lStack_110,&UNK_009f0c48);
    goto code_r0x0058a71c;
  }
  if (*plVar5 != 2) {
    return;
  }
  func_0x0056ba90(&lStack_120,plVar5 + 1);
  if (lStack_120 == 0) {
    return;
  }
  func_0x005882f4(auStack_d0);
  if (lStack_110 < 0) {
    uVar8 = 0;
code_r0x0058a6ec:
    func_0x007a1f00(uVar8,lStack_110,&UNK_009f0c48);
  }
  else {
    if (lStack_110 == 0) {
      lVar4 = 1;
    }
    else {
      uVar8 = 1;
      lVar4 = func_0x00187bd0(lStack_110,1);
      if (lVar4 == 0) goto code_r0x0058a6ec;
    }
    _memcpy(lVar4,uStack_118,lStack_110);
    lStack_90 = lStack_110;
    lStack_80 = lStack_110;
    lStack_f0 = plVar5[3];
    lStack_88 = lVar4;
    if (lStack_f0 != 0) {
      plVar5[3] = 1;
      lStack_108 = plVar5[2] + 0x40;
      lStack_100 = plVar5[2] + lStack_f0 * 0x40;
      lStack_e8 = 0;
      plStack_f8 = plVar5 + 1;
      func_0x0055af64(auStack_78,&lStack_108,&UNK_009f09e0);
      func_0x005ce9d0(&lStack_108,auStack_d0,&lStack_90,auStack_78);
      func_0x005876a4(plVar5);
      *plVar5 = 3;
code_r0x0058a5d0:
      plVar5[2] = lStack_100;
      plVar5[1] = lStack_108;
      plVar5[4] = lStack_f0;
      plVar5[3] = (long)plStack_f8;
      plVar5[6] = lStack_e0;
      plVar5[5] = lStack_e8;
      plVar5[7] = lStack_d8;
      *auVar9._0_8_ = 1;
      return;
    }
    func_0x007a28bc(1,0,&UNK_009edf90);
  }
code_r0x0058a71c:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x58a720);
  (*pcVar2)();
}

