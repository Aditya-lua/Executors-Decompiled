
bool FUN_0041b778(void)

{
  ulong uVar1;
  uint *puVar2;
  ulong uVar3;
  undefined8 *unaff_x24;
  
  *unaff_x24 = 0;
  unaff_x24[1] = 0;
  uVar1 = _readv(0);
  if (uVar1 == 0xffffffffffffffff) {
    puVar2 = (uint *)___error();
    uVar3 = (ulong)*puVar2 << 0x20 | 2;
  }
  else {
    uVar3 = uVar1;
  }
  return (uVar1 == 0xffffffffffffffff) !=
         (uVar1 == 0xffffffffffffffff && (uVar3 & 0xffffffff00000003) == 0x900000002);
}

