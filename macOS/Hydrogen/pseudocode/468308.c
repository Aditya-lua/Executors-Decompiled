
bool FUN_00468308(ulong *param_1,ulong param_2)

{
  ulong uVar1;
  ulong uVar2;
  undefined1 uStack000000000000000c;
  byte bStack000000000000000d;
  byte bStack000000000000000e;
  
  uStack000000000000000c = (byte)(param_2 >> 0xc) | 0xe0;
  bStack000000000000000d = (byte)((uint)param_2 >> 6) & 0x3f | 0x80;
  bStack000000000000000e = (byte)param_2 & 0x3f | 0x80;
  uVar2 = *param_1;
  uVar1 = uVar2 + 3;
  if (0x27 >= uVar1 && 0xfffffffffffffffc >= uVar2) {
    _memcpy((long)param_1 + uVar2 + 8,&uStack000000000000000c);
    *param_1 = uVar1;
  }
  return 0x27 < uVar1 || 0xfffffffffffffffc < uVar2;
}

