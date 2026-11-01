
undefined8 FUN_00640824(void)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long *unaff_x20;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000014;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  
  _uStack0000000000000008 = s_ThisPointer__008e5781._0_8_;
  uStack0000000000000014 = 0;
  uVar1 = _strlen(&UNK_008be83d);
  puVar2 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack0000000000000008,&UNK_008be83d,uVar1);
  in_stack_00000028 = puVar2[1];
  in_stack_00000020 = *puVar2;
  in_stack_00000030 = puVar2[2];
  puVar2[1] = 0;
  puVar2[2] = 0;
  *puVar2 = 0;
  uVar1 = (**(code **)(*unaff_x20 + 0x10))();
  if (in_stack_00000030 < 0) {
    __ZdlPv(in_stack_00000020);
  }
  if (in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(_uStack0000000000000008);
    return uVar1;
  }
  s_ThisPointer__008e5781[0] = s_ThisPointer__008e5781[0];
  s_ThisPointer__008e5781[1] = s_ThisPointer__008e5781[1];
  s_ThisPointer__008e5781[2] = s_ThisPointer__008e5781[2];
  s_ThisPointer__008e5781[3] = s_ThisPointer__008e5781[3];
  s_ThisPointer__008e5781[4] = s_ThisPointer__008e5781[4];
  s_ThisPointer__008e5781[5] = s_ThisPointer__008e5781[5];
  s_ThisPointer__008e5781[6] = s_ThisPointer__008e5781[6];
  s_ThisPointer__008e5781[7] = s_ThisPointer__008e5781[7];
  return uVar1;
}

