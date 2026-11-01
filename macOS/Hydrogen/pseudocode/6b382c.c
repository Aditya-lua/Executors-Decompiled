
void FUN_006b382c(void)

{
  bool bVar1;
  uint uVar2;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  byte bStack000000000000000f;
  
  do {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    unaff_x21 = unaff_x21 + 0x88;
  } while (unaff_x21 != unaff_x22);
  uVar2 = *(uint *)(unaff_x19 + 0x1c);
  do {
    bStack000000000000000f = (byte)uVar2 & 0x7f | (0x7f < uVar2) << 7;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
    bVar1 = 0x7f < uVar2;
    uVar2 = uVar2 >> 7;
  } while (bVar1);
  return;
}

