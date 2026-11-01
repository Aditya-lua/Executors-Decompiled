
/* WARNING: Removing unreachable block (ram,0x0008031c) */
/* WARNING: Removing unreachable block (ram,0x000803ec) */

void FUN_000802c0(void)

{
  undefined8 *puVar1;
  undefined8 *unaff_x19;
  undefined4 unaff_w20;
  undefined8 *unaff_x21;
  undefined8 uVar2;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  char cStack000000000000001f;
  undefined1 uStack0000000000000020;
  char cStack0000000000000027;
  undefined1 uStack000000000000002b;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000060;
  
  _uStack0000000000000020 = s_parse_error_008d3281._0_7_;
  cStack0000000000000027 = s_parse_error_008d3281[7];
  _cStack0000000000000027 = CONCAT31(0x726f72,cStack0000000000000027);
  uStack000000000000002b = 0;
  uStack0000000000000008._0_1_ = 0x2e;
  __ZNSt3__19to_stringEi(unaff_x29 + -0x38);
  func_0x00079404(&uStack0000000000000038,"[json.exception.",&uStack0000000000000020,
                  &uStack0000000000000008,unaff_x29 + -0x38,"] ");
  func_0x00084c34(unaff_x29 + -0x38);
  cStack000000000000001f = '\0';
  uStack0000000000000008._0_1_ = 0;
  func_0x00084a8c(&uStack0000000000000050,&uStack0000000000000038,"parse error",unaff_x29 + -0x38,
                  ": ",&uStack0000000000000008);
  if (cStack000000000000001f < '\0') {
    __ZdlPv(CONCAT71(uStack0000000000000008._1_7_,(undefined1)uStack0000000000000008));
  }
  if (in_stack_00000048._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000038);
  }
  if (in_stack_00000030._7_1_ < '\0') {
    __ZdlPv(CONCAT17(cStack0000000000000027,_uStack0000000000000020));
  }
  uVar2 = *unaff_x21;
  puVar1 = uStack0000000000000050;
  if (-1 < in_stack_00000060._7_1_) {
    puVar1 = &uStack0000000000000050;
  }
  *unaff_x19 = &UNK_009b9460;
  *(undefined4 *)(unaff_x19 + 1) = unaff_w20;
  __ZNSt13runtime_errorC1EPKc(unaff_x19 + 2,puVar1);
  *unaff_x19 = &UNK_009b95c8;
  unaff_x19[4] = uVar2;
  if (in_stack_00000060._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000050);
    return;
  }
  return;
}

