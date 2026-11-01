
undefined8 FUN_00054970(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  long unaff_x22;
  undefined1 uStack000000000000000d;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000038;
  
  while( true ) {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (param_1,&uStack000000000000000d,param_3);
    unaff_x22 = unaff_x22 + -1;
    if (unaff_x22 == 0) break;
    _snprintf(&uStack000000000000000d,3);
    param_3 = _strlen(&uStack000000000000000d);
    param_1 = &uStack0000000000000010;
  }
  func_0x006e3964();
  if (in_stack_00000020._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000010);
  }
  if (in_stack_00000038._7_1_ < '\0') {
    __ZdlPv(in_stack_00000028);
    return 1;
  }
  return 1;
}

