
long FUN_00027ff8(long param_1)

{
  ulong in_x9;
  ulong uVar1;
  ulong in_x10;
  ulong uVar2;
  long in_x17;
  
  uVar2 = in_x17 + (in_x10 ^ in_x10 >> 0x2f) * param_1;
  uVar1 = (uVar2 ^ in_x9) * param_1;
  uVar1 = (uVar2 ^ uVar1 >> 0x2f ^ uVar1) * param_1;
  return (uVar1 ^ uVar1 >> 0x2f) * param_1;
}

