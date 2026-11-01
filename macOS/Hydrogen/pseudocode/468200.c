
bool FUN_00468200(ulong *param_1,ulong param_2)

{
  ulong uVar1;
  ulong uVar2;
  undefined1 uStack000000000000000c;
  byte bStack000000000000000d;
  byte bStack000000000000000e;
  byte bStack000000000000000f;
  
  uStack000000000000000c = (byte)(param_2 >> 0x12) | 0xf0;
  bStack000000000000000d = (byte)((uint)param_2 >> 0xc) & 0x3f | 0x80;
  bStack000000000000000e = (byte)((uint)param_2 >> 6) & 0x3f | 0x80;
  bStack000000000000000f = (byte)param_2 & 0x3f | 0x80;
  uVar2 = *param_1;
  uVar1 = uVar2 + 4;
  if (0xf >= uVar1 && 0xfffffffffffffffb >= uVar2) {
    _memcpy((long)param_1 + uVar2 + 8,&uStack000000000000000c);
    *param_1 = uVar1;
  }
  return 0xf < uVar1 || 0xfffffffffffffffb < uVar2;
}

