
undefined8 FUN_00662298(long *param_1)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  long *plVar3;
  undefined1 uStack0000000000000008;
  undefined4 uStack0000000000000010;
  undefined1 uStack0000000000000014;
  char cStack000000000000001f;
  undefined8 uStack0000000000000020;
  long in_stack_00000028;
  long in_stack_00000030;
  
  cStack000000000000001f = '\f';
  uStack0000000000000010 = 0x3a726574;
  _uStack0000000000000008 = s_ThisPointer__008e5781._0_8_;
  uStack0000000000000014 = 0;
  uVar2 = _strlen(&UNK_008bdd07);
  plVar3 = (long *)__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                             (&uStack0000000000000008,&UNK_008bdd07,uVar2);
  in_stack_00000028 = plVar3[1];
  uStack0000000000000020 = (undefined8 *)*plVar3;
  in_stack_00000030 = plVar3[2];
  plVar3[1] = 0;
  plVar3[2] = 0;
  *plVar3 = 0;
  puVar1 = uStack0000000000000020;
  if (-1 < in_stack_00000030) {
    puVar1 = &uStack0000000000000020;
  }
  uVar2 = (**(code **)(*param_1 + 0x10))(param_1,puVar1,&UNK_00a0bed8);
  if (in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  if (cStack000000000000001f < '\0') {
    __ZdlPv(_uStack0000000000000008);
    return uVar2;
  }
  s_ThisPointer__008e5781[0] = s_ThisPointer__008e5781[0];
  s_ThisPointer__008e5781[1] = s_ThisPointer__008e5781[1];
  s_ThisPointer__008e5781[2] = s_ThisPointer__008e5781[2];
  s_ThisPointer__008e5781[3] = s_ThisPointer__008e5781[3];
  s_ThisPointer__008e5781[4] = s_ThisPointer__008e5781[4];
  s_ThisPointer__008e5781[5] = s_ThisPointer__008e5781[5];
  s_ThisPointer__008e5781[6] = s_ThisPointer__008e5781[6];
  s_ThisPointer__008e5781[7] = s_ThisPointer__008e5781[7];
  return uVar2;
}

