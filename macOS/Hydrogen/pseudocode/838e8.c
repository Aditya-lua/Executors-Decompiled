
void FUN_000838e8(void)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  int in_w8;
  undefined8 *extraout_x8;
  undefined8 uVar4;
  long unaff_x29;
  undefined1 auVar5 [16];
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  
  if (in_w8 < 0) {
    __ZdlPv(*(undefined8 *)(unaff_x29 + -0x40));
  }
  if (in_stack_00000018 < 0) {
    __ZdlPv(in_stack_00000008);
  }
  auVar5 = __Unwind_Resume();
  *extraout_x8 = 0;
  extraout_x8[1] = 0;
  extraout_x8[2] = 0;
  lVar1 = _strlen();
  lVar2 = _strlen(*auVar5._8_8_);
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7reserveEm
            (extraout_x8,lVar2 + lVar1);
  uVar3 = _strlen(auVar5._0_8_);
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
            (extraout_x8,auVar5._0_8_,uVar3);
  uVar4 = *auVar5._8_8_;
  uVar3 = _strlen(uVar4);
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
            (extraout_x8,uVar4,uVar3);
  return;
}

