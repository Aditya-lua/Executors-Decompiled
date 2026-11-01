
undefined8 FUN_00753060(void)

{
  byte bVar1;
  ulong uVar2;
  undefined8 uVar3;
  long unaff_x19;
  int unaff_w20;
  long unaff_x23;
  
  *(byte *)(unaff_x19 + 0xd18) = *(byte *)(unaff_x19 + 0xd18) | 1;
  uVar2 = func_0x0079080c();
  if (((uVar2 & 1) == 0) && ((*(byte *)(unaff_x23 + 0x39a) >> 3 & 1) == 0)) {
    uVar3 = 0;
    bVar1 = *(byte *)(unaff_x19 + 0xcf8);
    *(byte *)(unaff_x19 + 0xcf8) = bVar1 | 1;
    bVar1 = bVar1 & 3 | 1;
  }
  else {
    uVar3 = func_0x00753160();
    bVar1 = *(byte *)(unaff_x19 + 0xcf8) & 3;
  }
  if ((((bVar1 == 2) || ((*(byte *)(unaff_x19 + 0xd18) & 3) == 2)) && (unaff_w20 != 0)) &&
     (unaff_w20 != 5)) {
    *(uint *)(unaff_x19 + 0x1c1) = *(uint *)(unaff_x19 + 0x1c1) | 0x40000;
    return uVar3;
  }
  *(uint *)(unaff_x19 + 0x1c1) = *(uint *)(unaff_x19 + 0x1c1) & 0xfffbffff;
  return uVar3;
}

