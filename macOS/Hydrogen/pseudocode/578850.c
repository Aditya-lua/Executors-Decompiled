
ulong FUN_00578850(long param_1)

{
  ulong uVar1;
  ulong uVar2;
  long in_x9;
  ulong in_x10;
  ulong uVar3;
  ulong uVar4;
  ulong in_x11;
  ulong uVar5;
  long in_stack_00000030;
  ulong in_stack_00000038;
  
  in_stack_00000038 = in_stack_00000038 | in_stack_00000030 << 0x38;
  uVar5 = in_stack_00000038 ^ in_x11;
  uVar2 = in_x10 + param_1;
  uVar3 = uVar2 ^ (in_x10 >> 0x33 | in_x10 << 0xd);
  uVar1 = uVar5 + in_x9 + uVar3;
  uVar5 = uVar5 + in_x9 ^ (uVar5 >> 0x30 | uVar5 << 0x10);
  uVar4 = uVar1 ^ (uVar3 >> 0x2f | uVar3 << 0x11);
  uVar2 = uVar5 + (uVar2 >> 0x20 | uVar2 << 0x20);
  uVar3 = uVar2 ^ (uVar5 >> 0x2b | uVar5 << 0x15);
  uVar2 = (uVar2 ^ in_stack_00000038) + uVar4;
  uVar4 = uVar2 ^ (uVar4 >> 0x33 | uVar4 << 0xd);
  uVar1 = uVar3 + ((uVar1 >> 0x20 | uVar1 << 0x20) ^ 0xff);
  uVar5 = uVar4 + uVar1;
  uVar1 = uVar1 ^ (uVar3 >> 0x30 | uVar3 << 0x10);
  uVar4 = uVar5 ^ (uVar4 >> 0x2f | uVar4 << 0x11);
  uVar2 = uVar1 + (uVar2 >> 0x20 | uVar2 << 0x20);
  uVar3 = uVar4 + uVar2;
  uVar2 = uVar2 ^ (uVar1 >> 0x2b | uVar1 << 0x15);
  uVar4 = uVar3 ^ (uVar4 >> 0x33 | uVar4 << 0xd);
  uVar1 = uVar2 + (uVar5 >> 0x20 | uVar5 << 0x20);
  uVar5 = uVar4 + uVar1;
  uVar1 = uVar1 ^ (uVar2 >> 0x30 | uVar2 << 0x10);
  uVar4 = uVar5 ^ (uVar4 >> 0x2f | uVar4 << 0x11);
  uVar2 = uVar1 + (uVar3 >> 0x20 | uVar3 << 0x20);
  uVar3 = uVar2 ^ (uVar1 >> 0x2b | uVar1 << 0x15);
  uVar4 = uVar4 + uVar2 ^ (uVar4 >> 0x33 | uVar4 << 0xd);
  uVar2 = uVar3 + (uVar5 >> 0x20 | uVar5 << 0x20);
  uVar1 = uVar4 + uVar2;
  uVar2 = uVar2 ^ (uVar3 >> 0x30 | uVar3 << 0x10);
  return (uVar2 >> 0x2b | uVar2 << 0x15) ^ (uVar4 >> 0x2f | uVar4 << 0x11) ^
         (uVar1 >> 0x20 | uVar1 << 0x20) ^ uVar1;
}

