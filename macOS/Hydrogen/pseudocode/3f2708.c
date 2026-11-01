
ulong FUN_003f2708(long param_1,ulong param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  bool bVar4;
  bool bVar5;
  uint in_w9;
  uint unaff_w19;
  
  bVar4 = (param_2 & 1) == 0;
  uVar2 = (uint)(param_2 >> 8);
  uVar3 = (uint)(param_2 >> 0x10) & 0xffffff;
  if (bVar4) {
    uVar2 = unaff_w19;
    uVar3 = (uint)param_1;
  }
  bVar5 = param_1 == 0;
  uVar1 = (uint)param_1;
  if (bVar5) {
    uVar1 = uVar3;
  }
  if (bVar5) {
    unaff_w19 = uVar2;
  }
  if (bVar5) {
    in_w9 = (uint)bVar4;
  }
  return (ulong)uVar1 << 0x10 | ((ulong)unaff_w19 & 0xff) << 8 | (ulong)in_w9;
}

