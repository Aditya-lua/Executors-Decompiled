
void FUN_0061d134(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  code *pcVar4;
  char *pcVar5;
  undefined8 *unaff_x19;
  
  pcVar5 = (char *)__Znwm();
  *(ulong *)(pcVar5 + 0x1d) =
       CONCAT53(s_RoundUpToMultipleOf__integer_ove_008e5516._32_5_,
                s_RoundUpToMultipleOf__integer_ove_008e5516._29_3_);
  uVar3 = s_RoundUpToMultipleOf__integer_ove_008e5516._16_8_;
  uVar2 = s_RoundUpToMultipleOf__integer_ove_008e5516._0_8_;
  uVar1 = CONCAT35(s_RoundUpToMultipleOf__integer_ove_008e5516._29_3_,
                   s_RoundUpToMultipleOf__integer_ove_008e5516._24_5_);
  *(undefined8 *)(pcVar5 + 8) = s_RoundUpToMultipleOf__integer_ove_008e5516._8_8_;
  *(undefined8 *)pcVar5 = uVar2;
  *(undefined8 *)(pcVar5 + 0x18) = uVar1;
  *(undefined8 *)(pcVar5 + 0x10) = uVar3;
  pcVar5[0x25] = '\0';
  *unaff_x19 = &UNK_009b2ec8;
  *(undefined4 *)(unaff_x19 + 1) = 1;
  func_0x00017634(unaff_x19 + 2,pcVar5,0x25);
  *unaff_x19 = &UNK_009b2f08;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x61d1a4);
  (*pcVar4)();
}

