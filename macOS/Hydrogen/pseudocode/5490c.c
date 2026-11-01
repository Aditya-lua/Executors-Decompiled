
undefined8 FUN_0005490c(ulong param_1)

{
  ulong uVar1;
  undefined8 uVar2;
  int in_w9;
  undefined1 uStack000000000000000d;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  ulong in_stack_00000030;
  undefined8 in_stack_00000038;
  
  uVar1 = in_stack_00000030;
  if (-1 < in_w9) {
    uVar1 = param_1;
  }
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7reserveEm
            (&uStack0000000000000010,uVar1 << 1);
  uVar1 = in_stack_00000030;
  if (-1 < (char)in_stack_00000038._7_1_) {
    uVar1 = (ulong)in_stack_00000038._7_1_;
  }
  for (; uVar1 != 0; uVar1 = uVar1 - 1) {
    _snprintf(&uStack000000000000000d,3,"%02X");
    uVar2 = _strlen(&uStack000000000000000d);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
              (&uStack0000000000000010,&uStack000000000000000d,uVar2);
  }
  func_0x006e3964();
  if (in_stack_00000020._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000010);
  }
  if ((char)in_stack_00000038._7_1_ < '\0') {
    __ZdlPv(in_stack_00000028);
    return 1;
  }
  return 1;
}

