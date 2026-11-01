
uint FUN_00472ab8(long param_1)

{
  byte bVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  byte *in_x13;
  
  uVar3 = 0;
  do {
    if (param_1 == 0) {
      uVar2 = uVar3 << 0x10;
      uVar4 = (uint)((uVar3 & 0xffff) == 0);
      uVar3 = 0x400;
LAB_00472c18:
      return uVar3 | uVar2 | uVar4;
    }
    bVar1 = *in_x13;
    if (9 < bVar1 - 0x30) {
      uVar2 = 0;
      uVar3 = 0x100;
      uVar4 = 1;
      goto LAB_00472c18;
    }
    in_x13 = in_x13 + 1;
    uVar3 = uVar3 * 10 - (bVar1 - 0x30);
    param_1 = param_1 + -1;
  } while( true );
}

