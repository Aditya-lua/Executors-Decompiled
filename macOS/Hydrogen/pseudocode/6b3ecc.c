
void FUN_006b3ecc(undefined8 param_1,undefined8 param_2)

{
  long unaff_x20;
  long lVar1;
  long unaff_x21;
  long unaff_x23;
  ulong uVar2;
  long in_stack_00000000;
  
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm(param_1,param_2,1);
  if (*(long *)(unaff_x20 + 0x48) != *(long *)(unaff_x20 + 0x40)) {
    uVar2 = 0;
    do {
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
      uVar2 = uVar2 + 1;
    } while (uVar2 < (ulong)(*(long *)(unaff_x20 + 0x48) - *(long *)(unaff_x20 + 0x40) >> 2));
  }
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

