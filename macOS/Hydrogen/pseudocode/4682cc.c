
bool FUN_004682cc(ulong *param_1,byte param_2)

{
  ulong uVar1;
  byte in_w8;
  ulong uVar2;
  undefined1 uStack000000000000000c;
  byte bStack000000000000000d;
  
  uStack000000000000000c = in_w8 | 0xc0;
  bStack000000000000000d = param_2 & 0x3f | 0x80;
  uVar2 = *param_1;
  uVar1 = uVar2 + 2;
  if (0x27 >= uVar1 && 0xfffffffffffffffd >= uVar2) {
    _memcpy((long)param_1 + uVar2 + 8,&uStack000000000000000c);
    *param_1 = uVar1;
  }
  return 0x27 < uVar1 || 0xfffffffffffffffd < uVar2;
}

