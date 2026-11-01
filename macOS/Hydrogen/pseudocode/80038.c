
/* WARNING: Removing unreachable block (ram,0x0008031c) */
/* WARNING: Removing unreachable block (ram,0x000803ec) */
/* WARNING: Type propagation algorithm not settling */

long thunk_FUN_0008005c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 *******pppppppuVar1;
  byte *pbVar2;
  byte *pbVar3;
  byte bVar4;
  undefined4 uVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 *extraout_x1;
  undefined *puVar8;
  undefined8 *extraout_x8;
  undefined8 *extraout_x8_00;
  long unaff_x20;
  long unaff_x29;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  undefined1 uStack0000000000000050;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000088;
  undefined1 uStack_118;
  undefined7 uStack_117;
  char cStack_101;
  undefined7 uStack_100;
  undefined4 uStack_f9;
  undefined1 uStack_f5;
  char cStack_e9;
  undefined8 auStack_e8 [2];
  char cStack_d1;
  undefined8 *******apppppppuStack_d0 [2];
  char cStack_b9;
  undefined1 auStack_b8 [24];
  byte *pbStack_a0;
  byte *pbStack_98;
  undefined8 uStack_90;
  long *plStack_80;
  undefined8 uStack_78;
  ulong uStack_70;
  undefined8 uStack_68;
  undefined1 uStack_60;
  long lStack_58;
  long lStack_30;
  undefined8 uStack_28;
  
  _uStack0000000000000050 = &UNK_009b9460;
  __ZNSt13runtime_errorD1Ev(unaff_x20 + 0x10);
  __ZNSt9exceptionD2Ev(&uStack0000000000000050);
  if (in_stack_00000028 < 0) {
    __ZdlPv(in_stack_00000018);
  }
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
  }
  if (in_stack_00000088._7_1_ < '\0') {
    __ZdlPv(in_stack_00000078);
    lVar6 = *(long *)(unaff_x29 + -0x70);
  }
  else {
    lVar6 = *(long *)(unaff_x29 + -0x70);
  }
  while (lVar6 == 0) {
    param_1 = __Unwind_Resume(param_1);
    lVar6 = *(long *)(unaff_x29 + -0x70);
  }
  __ZdlPv();
  lVar6 = __Unwind_Resume(param_1);
  lStack_30 = (long)register0x00000008 + -0x10;
  *(undefined1 *)(lVar6 + 0x58) = 1;
  if (*(char *)(lVar6 + 0x80) == '\0') {
    return 0;
  }
  uVar7 = ___cxa_allocate_exception(0x28);
  uVar7 = func_0x00084a00(uVar7,param_4);
  puVar8 = &DAT_0008084c;
  lVar6 = ___cxa_throw(uVar7,&UNK_009b95a0,&DAT_0008084c);
  uStack_28 = 0x801a4;
  lStack_58 = *(long *)PTR____stack_chk_guard_009b01e8;
  *extraout_x8 = 0;
  extraout_x8[1] = 0;
  extraout_x8[2] = 0;
  pbVar3 = *(byte **)(lVar6 + 0x40);
  uVar7 = s_parse_error_008d3281._0_8_;
  for (pbVar2 = *(byte **)(lVar6 + 0x38); s_parse_error_008d3281._0_8_ = uVar7, pbVar2 != pbVar3;
      pbVar2 = pbVar2 + 1) {
    bVar4 = *pbVar2;
    if (bVar4 < 0x20) {
      uStack_60 = 0;
      uStack_68 = 0;
      uStack_70 = (ulong)bVar4;
      _snprintf(&uStack_68,9,"<U+%.4X>");
      puVar8 = (undefined *)_strlen(&uStack_68);
      lVar6 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                        (extraout_x8,&uStack_68,puVar8);
    }
    else {
      lVar6 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                        (extraout_x8,(int)(char)bVar4);
    }
    uVar7 = s_parse_error_008d3281._0_8_;
  }
  s_parse_error_008d3281[0] = (char)uVar7;
  s_parse_error_008d3281[1] = SUB81(uVar7,1);
  s_parse_error_008d3281[2] = SUB81(uVar7,2);
  s_parse_error_008d3281[3] = SUB81(uVar7,3);
  s_parse_error_008d3281[4] = SUB81(uVar7,4);
  s_parse_error_008d3281[5] = SUB81(uVar7,5);
  s_parse_error_008d3281[6] = SUB81(uVar7,6);
  s_parse_error_008d3281[7] = SUB81(uVar7,7);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_58) {
    return lVar6;
  }
  s_parse_error_008d3281._0_8_ = uVar7;
  uVar7 = ___stack_chk_fail();
  if (*(char *)((long)extraout_x8 + 0x17) < '\0') {
    __ZdlPv(*extraout_x8);
  }
  uVar5 = __Unwind_Resume(uVar7);
  uStack_78 = 0x80294;
  cStack_e9 = '\v';
  uStack_100 = s_parse_error_008d3281._0_7_;
  uStack_f9._0_1_ = s_parse_error_008d3281[7];
  uStack_f9 = CONCAT31(0x726f72,(char)uStack_f9);
  uStack_f5 = 0;
  uStack_118 = 0x2e;
  pbStack_a0 = pbVar3;
  pbStack_98 = pbVar2;
  uStack_90 = uVar7;
  plStack_80 = &lStack_30;
  __ZNSt3__19to_stringEi(auStack_b8);
  func_0x00079404(auStack_e8,"[json.exception.",&uStack_100,&uStack_118,auStack_b8,"] ");
  func_0x00084c34(auStack_b8,extraout_x1);
  cStack_101 = '\0';
  uStack_118 = 0;
  func_0x00084a8c(apppppppuStack_d0,auStack_e8,"parse error",auStack_b8,": ",&uStack_118,puVar8);
  if (cStack_101 < '\0') {
    __ZdlPv(CONCAT71(uStack_117,uStack_118));
  }
  if (cStack_d1 < '\0') {
    __ZdlPv(auStack_e8[0]);
  }
  if (cStack_e9 < '\0') {
    __ZdlPv(CONCAT17((char)uStack_f9,uStack_100));
  }
  uVar7 = *extraout_x1;
  pppppppuVar1 = apppppppuStack_d0[0];
  if (-1 < cStack_b9) {
    pppppppuVar1 = apppppppuStack_d0;
  }
  *extraout_x8_00 = &UNK_009b9460;
  *(undefined4 *)(extraout_x8_00 + 1) = uVar5;
  lVar6 = __ZNSt13runtime_errorC1EPKc(extraout_x8_00 + 2,pppppppuVar1);
  *extraout_x8_00 = &UNK_009b95c8;
  extraout_x8_00[4] = uVar7;
  if (cStack_b9 < '\0') {
    lVar6 = __ZdlPv(apppppppuStack_d0[0]);
    return lVar6;
  }
  return lVar6;
}

