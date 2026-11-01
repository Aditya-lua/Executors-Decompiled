
ulong FUN_0057889c(ulong param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong in_x9;
  ulong in_x10;
  ulong uVar4;
  ulong uVar5;
  ulong in_x11;
  ulong in_x12;
  
  uVar2 = in_x9 ^ (param_1 >> 0x30 | param_1 << 0x10);
  uVar4 = in_x12 ^ (in_x10 >> 0x2f | in_x10 << 0x11);
  uVar3 = uVar2 + (in_x11 >> 0x20 | in_x11 << 0x20);
  uVar1 = uVar4 + uVar3;
  uVar3 = uVar3 ^ (uVar2 >> 0x2b | uVar2 << 0x15);
  uVar5 = uVar1 ^ (uVar4 >> 0x33 | uVar4 << 0xd);
  uVar2 = uVar3 + (in_x12 >> 0x20 | in_x12 << 0x20);
  uVar4 = uVar5 + uVar2;
  uVar2 = uVar2 ^ (uVar3 >> 0x30 | uVar3 << 0x10);
  uVar5 = uVar4 ^ (uVar5 >> 0x2f | uVar5 << 0x11);
  uVar3 = uVar2 + (uVar1 >> 0x20 | uVar1 << 0x20);
  uVar2 = uVar3 ^ (uVar2 >> 0x2b | uVar2 << 0x15);
  uVar5 = uVar5 + uVar3 ^ (uVar5 >> 0x33 | uVar5 << 0xd);
  uVar3 = uVar2 + (uVar4 >> 0x20 | uVar4 << 0x20);
  uVar1 = uVar5 + uVar3;
  uVar3 = uVar3 ^ (uVar2 >> 0x30 | uVar2 << 0x10);
  return (uVar3 >> 0x2b | uVar3 << 0x15) ^ (uVar5 >> 0x2f | uVar5 << 0x11) ^
         (uVar1 >> 0x20 | uVar1 << 0x20) ^ uVar1;
}

