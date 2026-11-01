
undefined8 FUN_00641808(void)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long *unaff_x20;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000013;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  
  _uStack0000000000000008 = s_ThisObject__008e578e._0_8_;
  uStack0000000000000013 = 0;
  uVar1 = _strlen(&UNK_008be284);
  puVar2 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack0000000000000008,&UNK_008be284,uVar1);
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
  s_ThisObject__008e578e[0] = s_ThisObject__008e578e[0];
  s_ThisObject__008e578e[1] = s_ThisObject__008e578e[1];
  s_ThisObject__008e578e[2] = s_ThisObject__008e578e[2];
  s_ThisObject__008e578e[3] = s_ThisObject__008e578e[3];
  s_ThisObject__008e578e[4] = s_ThisObject__008e578e[4];
  s_ThisObject__008e578e[5] = s_ThisObject__008e578e[5];
  s_ThisObject__008e578e[6] = s_ThisObject__008e578e[6];
  s_ThisObject__008e578e[7] = s_ThisObject__008e578e[7];
  return uVar1;
}

