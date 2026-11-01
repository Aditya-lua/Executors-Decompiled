
long FUN_00058cd8(void)

{
  long lVar1;
  long lVar2;
  long *unaff_x19;
  long unaff_x23;
  long *unaff_x24;
  undefined8 *unaff_x25;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  
  while( true ) {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    lVar1 = (**(code **)(*unaff_x19 + 0x30))();
    if (in_stack_00000010 < 0) {
      __ZdlPv(in_stack_00000000);
    }
    unaff_x23 = lVar1 + unaff_x23;
    if (lVar1 < 0) break;
    unaff_x24 = (long *)*unaff_x24;
    if (unaff_x24 == (long *)0x0) {
      lVar2 = (**(code **)(*unaff_x19 + 0x30))();
      lVar1 = 0;
      if (-1 < lVar2) {
        lVar1 = unaff_x23;
      }
      return lVar1 + lVar2;
    }
    in_stack_00000000 = 0;
    in_stack_00000010 = 0;
    if (unaff_x25 != unaff_x24 + 2) {
      if (*(char *)((long)unaff_x24 + 0x27) < '\0') {
        func_0x000176c0();
      }
      else {
        in_stack_00000000 = unaff_x24[2];
        in_stack_00000010 = unaff_x24[4];
      }
    }
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  }
  return lVar1;
}

