
void FUN_006b380c(void)

{
  bool bVar1;
  long lVar2;
  long lVar3;
  uint uVar4;
  long *unaff_x19;
  uint unaff_w21;
  byte bStack000000000000000f;
  
  do {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    bVar1 = 0x7f < unaff_w21;
    unaff_w21 = unaff_w21 >> 7;
  } while (bVar1);
  lVar3 = unaff_x19[1];
  for (lVar2 = *unaff_x19; lVar2 != lVar3; lVar2 = lVar2 + 0x88) {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  }
  uVar4 = *(uint *)((long)unaff_x19 + 0x1c);
  do {
    bStack000000000000000f = (byte)uVar4 & 0x7f | (0x7f < uVar4) << 7;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    bVar1 = 0x7f < uVar4;
    uVar4 = uVar4 >> 7;
  } while (bVar1);
  return;
}

