
/* WARNING: Possible PIC construction at 0x006700a0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x006700a4) */

undefined8 * FUN_00670074(undefined8 *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  char *pcVar5;
  uint in_w8;
  long unaff_x19;
  
  if (((in_w8 >> 4 & 1) == 0) || (*(char *)(unaff_x19 + 200) != '\0')) {
    return param_1;
  }
  puVar4 = (undefined8 *)___cxa_allocate_exception(0x28);
  pcVar5 = (char *)__Znwm(0x30);
  uVar3 = s_VerifierFilter__digital_signatur_008e9428._16_8_;
  uVar2 = s_VerifierFilter__digital_signatur_008e9428._0_8_;
  uVar1 = CONCAT53(s_VerifierFilter__digital_signatur_008e9428._27_5_,
                   s_VerifierFilter__digital_signatur_008e9428._24_3_);
  *(undefined8 *)(pcVar5 + 8) = s_VerifierFilter__digital_signatur_008e9428._8_8_;
  *(undefined8 *)pcVar5 = uVar2;
  *(undefined8 *)(pcVar5 + 0x18) = uVar1;
  *(undefined8 *)(pcVar5 + 0x10) = uVar3;
  uVar1 = CONCAT35(s_VerifierFilter__digital_signatur_008e9428._32_3_,
                   s_VerifierFilter__digital_signatur_008e9428._27_5_);
  *(undefined8 *)(pcVar5 + 0x23) = s_VerifierFilter__digital_signatur_008e9428._35_8_;
  *(undefined8 *)(pcVar5 + 0x1b) = uVar1;
  pcVar5[0x2b] = '\0';
  *puVar4 = &UNK_009b2ec8;
  *(undefined4 *)(puVar4 + 1) = 3;
  func_0x00017634(puVar4 + 2,pcVar5,0x2b);
  __ZdlPv(pcVar5);
  *puVar4 = &UNK_00a0efb0;
  return puVar4;
}

