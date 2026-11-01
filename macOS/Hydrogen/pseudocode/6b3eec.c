
void FUN_006b3eec(void)

{
  long unaff_x20;
  long lVar1;
  long unaff_x21;
  long unaff_x23;
  ulong unaff_x24;
  long in_stack_00000000;
  
  do {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    unaff_x24 = unaff_x24 + 1;
  } while (unaff_x24 < (ulong)(*(long *)(unaff_x20 + 0x48) - *(long *)(unaff_x20 + 0x40) >> 2));
  if (unaff_x21 != 0) {
    lVar1 = unaff_x23 + 1;
    do {
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      lVar1 = lVar1 + -1;
    } while (lVar1 != 0);
  }
  if (in_stack_00000000 != 0) {
    __ZdlPv();
  }
  return;
}

