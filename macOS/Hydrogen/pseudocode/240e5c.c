
void FUN_00240e5c(long param_1,undefined8 param_2,undefined8 param_3,code *param_4,
                 undefined8 param_5,undefined8 *param_6,ulong param_7,undefined8 param_8,
                 undefined8 param_9,undefined8 param_10,undefined8 *param_11,ulong param_12,
                 undefined8 param_13,ulong param_14,undefined8 param_15,ulong param_16,
                 undefined8 param_17,undefined8 param_18,ulong param_19,undefined8 param_20,
                 undefined8 param_21,undefined8 param_22,undefined8 param_23,undefined8 param_24,
                 undefined8 param_25,undefined8 param_26,undefined8 param_27,undefined8 param_28,
                 ulong param_29,undefined1 param_30)

{
  undefined8 uVar1;
  code *pcVar2;
  ulong uVar3;
  undefined *puVar4;
  undefined8 unaff_x21;
  code *unaff_x22;
  ulong unaff_x24;
  ulong uVar5;
  code *unaff_x27;
  ulong uVar6;
  long unaff_x29;
  ulong uStack00000000000000b0;
  ulong uStack00000000000000c0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  ulong in_stack_000000e8;
  
  uVar5 = *(ulong *)(unaff_x29 + 0x10);
  param_9 = param_7;
  param_10 = param_8;
  _param_30 = param_6;
  uStack00000000000000b0 = param_7;
  uStack00000000000000c0 = uVar5;
  (*param_4)(&param_11,param_3,&param_30,2);
  uVar3 = (*unaff_x27)();
  if (uVar3 == 0) {
    _param_30 = (undefined8 *)&UNK_009c9ce8;
    uStack00000000000000b0 = 1;
    uStack00000000000000c0 = 0;
    func_0x007a2420(&param_30,&UNK_009c9cf8);
code_r0x002412d4:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x2412d8);
    (*pcVar2)();
  }
  if (unaff_x24 != 0) {
    do {
      uVar1 = param_10;
      uVar6 = uVar3;
      if (unaff_x24 <= uVar3) {
        uVar6 = unaff_x24;
      }
      if (0x40 < param_19) {
        func_0x007a28b0(param_19,0x40,&UNK_009c9cd0);
        goto code_r0x002412d4;
      }
      uStack00000000000000b0 = param_19;
      uStack00000000000000c0 = param_9;
      _param_30 = &param_11;
      (*unaff_x22)(&param_21);
      if (0x40 < param_29) {
        uVar6 = param_29;
code_r0x00241290:
        puVar4 = &UNK_009c9cd0;
        uVar3 = 0x40;
code_r0x0024129c:
        func_0x007a28b0(uVar6,uVar3,puVar4);
        goto code_r0x002412d4;
      }
      if (param_29 < uVar6) {
        puVar4 = &UNK_009c9d10;
        uVar3 = param_29;
        goto code_r0x0024129c;
      }
      _memcpy(param_1,&param_21,uVar6);
      if (0x40 < param_19) {
        uVar6 = param_19;
        goto code_r0x00241290;
      }
      *(undefined8 ***)(unaff_x29 + -0x70) = &param_11;
      *(ulong *)(unaff_x29 + -0x68) = param_19;
      (*unaff_x22)(&param_30);
      param_19 = in_stack_000000e8;
      param_1 = param_1 + uVar6;
      param_15 = uVar1;
      param_18 = in_stack_000000e0;
      param_17 = in_stack_000000d8;
      param_12 = uStack00000000000000b0;
      param_11 = _param_30;
      param_14 = uStack00000000000000c0;
      param_21._0_1_ = 0;
      param_21._1_1_ = 0;
      param_21._2_1_ = 0;
      param_21._3_1_ = 0;
      param_21._4_1_ = 0;
      param_21._5_1_ = 0;
      param_21._6_1_ = 0;
      param_21._7_1_ = 0;
      param_22._0_1_ = 0;
      param_22._1_1_ = 0;
      param_22._2_1_ = 0;
      param_22._3_1_ = 0;
      param_22._4_1_ = 0;
      param_22._5_1_ = 0;
      param_22._6_1_ = 0;
      param_22._7_1_ = 0;
      param_23._0_1_ = 0;
      param_23._1_1_ = 0;
      param_23._2_1_ = 0;
      param_23._3_1_ = 0;
      param_23._4_1_ = 0;
      param_23._5_1_ = 0;
      param_23._6_1_ = 0;
      param_23._7_1_ = 0;
      param_24._0_1_ = 0;
      param_24._1_1_ = 0;
      param_24._2_1_ = 0;
      param_24._3_1_ = 0;
      param_24._4_1_ = 0;
      param_24._5_1_ = 0;
      param_24._6_1_ = 0;
      param_24._7_1_ = 0;
      param_25._0_1_ = 0;
      param_25._1_1_ = 0;
      param_25._2_1_ = 0;
      param_25._3_1_ = 0;
      param_25._4_1_ = 0;
      param_25._5_1_ = 0;
      param_25._6_1_ = 0;
      param_25._7_1_ = 0;
      param_26._0_1_ = 0;
      param_26._1_1_ = 0;
      param_26._2_1_ = 0;
      param_26._3_1_ = 0;
      param_26._4_1_ = 0;
      param_26._5_1_ = 0;
      param_26._6_1_ = 0;
      param_26._7_1_ = 0;
      param_27._0_1_ = 0;
      param_27._1_1_ = 0;
      param_27._2_1_ = 0;
      param_27._3_1_ = 0;
      param_27._4_1_ = 0;
      param_27._5_1_ = 0;
      param_27._6_1_ = 0;
      param_27._7_1_ = 0;
      param_28._0_1_ = 0;
      param_28._1_1_ = 0;
      param_28._2_1_ = 0;
      param_28._3_1_ = 0;
      param_28._4_1_ = 0;
      param_28._5_1_ = 0;
      param_28._6_1_ = 0;
      param_28._7_1_ = 0;
      unaff_x24 = unaff_x24 - uVar6;
      param_13 = unaff_x21;
      param_16 = uVar5;
    } while (unaff_x24 != 0);
  }
  return;
}

