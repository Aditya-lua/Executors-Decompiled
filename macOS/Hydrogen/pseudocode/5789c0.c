
ulong FUN_005789c0(ulong param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong in_x9;
  ulong in_x10;
  ulong uVar5;
  ulong in_x12;
  
  uVar4 = in_x10 + in_x9;
  uVar2 = in_x9 ^ (param_1 >> 0x2b | param_1 << 0x15);
  uVar5 = uVar4 ^ (in_x10 >> 0x33 | in_x10 << 0xd);
  uVar3 = uVar2 + (in_x12 >> 0x20 | in_x12 << 0x20);
  uVar1 = uVar5 + uVar3;
  uVar3 = uVar3 ^ (uVar2 >> 0x30 | uVar2 << 0x10);
  uVar5 = uVar1 ^ (uVar5 >> 0x2f | uVar5 << 0x11);
  uVar4 = uVar3 + (uVar4 >> 0x20 | uVar4 << 0x20);
  uVar2 = uVar4 ^ (uVar3 >> 0x2b | uVar3 << 0x15);
  uVar5 = uVar5 + uVar4 ^ (uVar5 >> 0x33 | uVar5 << 0xd);
  uVar4 = uVar2 + (uVar1 >> 0x20 | uVar1 << 0x20);
  uVar3 = uVar5 + uVar4;
  uVar4 = uVar4 ^ (uVar2 >> 0x30 | uVar2 << 0x10);
  return (uVar4 >> 0x2b | uVar4 << 0x15) ^ (uVar5 >> 0x2f | uVar5 << 0x11) ^
         (uVar3 >> 0x20 | uVar3 << 0x20) ^ uVar3;
}

