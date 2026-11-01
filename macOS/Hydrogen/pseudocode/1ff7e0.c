
/* WARNING: Possible PIC construction at 0x001ff7f4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001ff854: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x001ff858) */

void FUN_001ff7e0(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  uint uVar1;
  long lVar2;
  long *plVar3;
  undefined8 uVar4;
  long *extraout_x8;
  int unaff_w25;
  uint unaff_w27;
  undefined1 auVar5 [16];
  long in_stack_00000060;
  long in_stack_00000068;
  undefined8 in_stack_00000070;
  long *in_stack_00000080;
  long lStack_f0;
  long lStack_e8;
  long lStack_e0;
  long lStack_d8;
  long lStack_d0;
  long lStack_c8;
  long lStack_c0;
  long lStack_b8;
  long lStack_b0;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  long lStack_70;
  long lStack_68;
  long lStack_60;
  long lStack_58;
  long lStack_50;
  
  if (param_1 == 0) {
    lVar2 = *in_stack_00000080;
    *in_stack_00000080 = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001fa1d4(in_stack_00000070);
    }
    func_0x001f9618(in_stack_00000060);
    if (*(long *)(in_stack_00000060 + 0x18) == -0x7fffffffffffffff) {
      param_1 = *(long *)(in_stack_00000060 + 0x20);
      uVar1 = 0;
      if (param_1 != 0) {
        uVar1 = unaff_w27;
      }
      if ((uVar1 & 1) != 0) {
        plVar3 = *(long **)(in_stack_00000060 + 0x28);
        uVar4 = 1;
        goto code_r0x00187bd4;
      }
    }
    else if (unaff_w25 != 0) {
      func_0x001f8430();
    }
    __Unwind_Resume();
    auVar5 = func_0x007a2668();
    plVar3 = auVar5._0_8_;
    func_0x001ff9e4(&lStack_f0,param_4,*(undefined1 *)((long)plVar3 + 0x89),auVar5._8_8_);
    lVar2 = lStack_e8;
    if (lStack_f0 == -0x7fffffffffffffd9) {
      lStack_58 = lStack_d8;
      lStack_60 = lStack_e0;
      lStack_50 = lStack_d0;
      lStack_88 = plVar3[0xd];
      lStack_90 = plVar3[0xc];
      lStack_78 = plVar3[0xf];
      lStack_80 = plVar3[0xe];
      lStack_68 = plVar3[0x11];
      lStack_70 = plVar3[0x10];
      lStack_c8 = plVar3[5];
      lStack_d0 = plVar3[4];
      lStack_b8 = plVar3[7];
      lStack_c0 = plVar3[6];
      lStack_a8 = plVar3[9];
      lStack_b0 = plVar3[8];
      lStack_98 = plVar3[0xb];
      lStack_a0 = plVar3[10];
      lStack_e8 = plVar3[1];
      lStack_f0 = *plVar3;
      lStack_d8 = plVar3[3];
      lStack_e0 = plVar3[2];
      func_0x001fe038(extraout_x8,&lStack_f0,&lStack_60,lVar2,param_4,auVar5._8_8_);
      func_0x001f8508(param_4);
    }
    else {
      extraout_x8[6] = lStack_c0;
      extraout_x8[5] = lStack_c8;
      extraout_x8[3] = lStack_d8;
      extraout_x8[2] = lStack_e0;
      extraout_x8[4] = lStack_d0;
      *extraout_x8 = lStack_f0;
      extraout_x8[1] = lStack_e8;
      func_0x001f8508(param_4);
      func_0x001f8e9c(plVar3);
    }
    param_1 = 0x90;
    uVar4 = 8;
  }
  else {
    plVar3 = *(long **)(in_stack_00000068 + 8);
    param_1 = param_1 << 2;
    uVar4 = 2;
  }
code_r0x00187bd4:
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(plVar3,param_1,uVar4);
  return;
}

