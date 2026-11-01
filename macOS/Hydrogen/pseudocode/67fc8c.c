
void FUN_0067fc8c(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  code *pcVar4;
  undefined8 *puVar5;
  char *pcVar6;
  
  puVar5 = (undefined8 *)___cxa_allocate_exception(0x28);
  pcVar6 = (char *)__Znwm(0x58);
  pcVar6[0x50] = 'y';
  uVar3 = s_PK_MessageEncodingMethod__this_s_008d3465._56_8_;
  uVar2 = s_PK_MessageEncodingMethod__this_s_008d3465._48_8_;
  uVar1 = s_PK_MessageEncodingMethod__this_s_008d3465._32_8_;
  pcVar6[0x51] = '\0';
  *(undefined8 *)(pcVar6 + 0x28) = s_PK_MessageEncodingMethod__this_s_008d3465._40_8_;
  *(undefined8 *)(pcVar6 + 0x20) = uVar1;
  *(undefined8 *)(pcVar6 + 0x38) = uVar3;
  *(undefined8 *)(pcVar6 + 0x30) = uVar2;
  uVar1 = s_PK_MessageEncodingMethod__this_s_008d3465._64_8_;
  *(undefined8 *)(pcVar6 + 0x48) = s_PK_MessageEncodingMethod__this_s_008d3465._72_8_;
  *(undefined8 *)(pcVar6 + 0x40) = uVar1;
  uVar3 = s_PK_MessageEncodingMethod__this_s_008d3465._24_8_;
  uVar2 = s_PK_MessageEncodingMethod__this_s_008d3465._16_8_;
  uVar1 = s_PK_MessageEncodingMethod__this_s_008d3465._0_8_;
  *(undefined8 *)(pcVar6 + 8) = s_PK_MessageEncodingMethod__this_s_008d3465._8_8_;
  *(undefined8 *)pcVar6 = uVar1;
  *(undefined8 *)(pcVar6 + 0x18) = uVar3;
  *(undefined8 *)(pcVar6 + 0x10) = uVar2;
  *puVar5 = &UNK_009b2ec8;
  *(undefined4 *)(puVar5 + 1) = 0;
  func_0x00017634(puVar5 + 2,pcVar6,0x51);
  *puVar5 = &UNK_009b2ea0;
  ___cxa_throw(puVar5,&UNK_009b2e78,&DAT_00026d7c);
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x67fd1c);
  (*pcVar4)();
}

