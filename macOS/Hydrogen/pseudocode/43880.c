
void FUN_00043880(undefined8 *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  code *pcVar6;
  char *pcVar7;
  
  pcVar7 = (char *)__Znwm(0x40);
  uVar1 = CONCAT71(s_StreamTransformation__this_objec_008d0e0b._48_7_,
                   s_StreamTransformation__this_objec_008d0e0b[0x2f]);
  *(undefined8 *)(pcVar7 + 0x37) = s_StreamTransformation__this_objec_008d0e0b._55_8_;
  *(undefined8 *)(pcVar7 + 0x2f) = uVar1;
  uVar5 = s_StreamTransformation__this_objec_008d0e0b._32_8_;
  uVar4 = s_StreamTransformation__this_objec_008d0e0b._16_8_;
  uVar3 = s_StreamTransformation__this_objec_008d0e0b._8_8_;
  uVar2 = s_StreamTransformation__this_objec_008d0e0b._0_8_;
  uVar1 = CONCAT17(s_StreamTransformation__this_objec_008d0e0b[0x2f],
                   s_StreamTransformation__this_objec_008d0e0b._40_7_);
  *(undefined8 *)(pcVar7 + 0x18) = s_StreamTransformation__this_objec_008d0e0b._24_8_;
  *(undefined8 *)(pcVar7 + 0x10) = uVar4;
  *(undefined8 *)(pcVar7 + 0x28) = uVar1;
  *(undefined8 *)(pcVar7 + 0x20) = uVar5;
  *(undefined8 *)(pcVar7 + 8) = uVar3;
  *(undefined8 *)pcVar7 = uVar2;
  pcVar7[0x3f] = '\0';
  *param_1 = &UNK_009b2ec8;
  *(undefined4 *)(param_1 + 1) = 0;
  func_0x00017634(param_1 + 2,pcVar7,0x3f);
  *param_1 = &UNK_009b2ea0;
  ___cxa_throw(param_1,&UNK_009b2e78,&DAT_00026d7c);
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x438fc);
  (*pcVar6)();
}

