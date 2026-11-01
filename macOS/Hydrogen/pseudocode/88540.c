
void FUN_00088540(char *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  code *pcVar6;
  undefined8 *unaff_x19;
  
  uVar1 = CONCAT44(s_PK_MessageAccumulator__Truncated_008d34f0._48_4_,
                   s_PK_MessageAccumulator__Truncated_008d34f0._44_4_);
  *(undefined8 *)(param_1 + 0x34) = s_PK_MessageAccumulator__Truncated_008d34f0._52_8_;
  *(undefined8 *)(param_1 + 0x2c) = uVar1;
  uVar5 = s_PK_MessageAccumulator__Truncated_008d34f0._32_8_;
  uVar4 = s_PK_MessageAccumulator__Truncated_008d34f0._16_8_;
  uVar3 = s_PK_MessageAccumulator__Truncated_008d34f0._8_8_;
  uVar2 = s_PK_MessageAccumulator__Truncated_008d34f0._0_8_;
  uVar1 = CONCAT44(s_PK_MessageAccumulator__Truncated_008d34f0._44_4_,
                   s_PK_MessageAccumulator__Truncated_008d34f0._40_4_);
  *(undefined8 *)(param_1 + 0x18) = s_PK_MessageAccumulator__Truncated_008d34f0._24_8_;
  *(undefined8 *)(param_1 + 0x10) = uVar4;
  *(undefined8 *)(param_1 + 0x28) = uVar1;
  *(undefined8 *)(param_1 + 0x20) = uVar5;
  *(undefined8 *)(param_1 + 8) = uVar3;
  *(undefined8 *)param_1 = uVar2;
  param_1[0x3c] = '\0';
  *unaff_x19 = &UNK_009b2ec8;
  *(undefined4 *)(unaff_x19 + 1) = 0;
  func_0x00017634(unaff_x19 + 2,param_1,0x3c);
  *unaff_x19 = &UNK_009b2ea0;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x885b0);
  (*pcVar6)();
}

