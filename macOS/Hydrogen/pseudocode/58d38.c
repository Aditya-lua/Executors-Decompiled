
long FUN_00058d38(void)

{
  long lVar1;
  long lVar2;
  long *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  long *unaff_x24;
  undefined8 *unaff_x25;
  undefined8 uStack0000000000000000;
  long lStack0000000000000010;
  
  while( true ) {
    unaff_x23 = unaff_x22 + unaff_x23;
    if (unaff_x22 < 0) {
      return unaff_x22;
    }
    unaff_x24 = (long *)*unaff_x24;
    if (unaff_x24 == (long *)0x0) break;
    uStack0000000000000000 = 0;
    lStack0000000000000010 = 0;
    if (unaff_x25 != unaff_x24 + 2) {
      if (*(char *)((long)unaff_x24 + 0x27) < '\0') {
        func_0x000176c0();
      }
      else {
        uStack0000000000000000 = unaff_x24[2];
        lStack0000000000000010 = unaff_x24[4];
      }
    }
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    unaff_x22 = (**(code **)(*unaff_x19 + 0x30))();
    if (lStack0000000000000010 < 0) {
      __ZdlPv(uStack0000000000000000);
    }
  }
  lVar2 = (**(code **)(*unaff_x19 + 0x30))();
  lVar1 = 0;
  if (-1 < lVar2) {
    lVar1 = unaff_x23;
  }
  return lVar1 + lVar2;
}

