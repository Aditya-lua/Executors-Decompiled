void FUN_180c66200(undefined8 param_1,longlong param_2,char param_3)

{
  byte *pbVar1;
  char cVar2;
  undefined2 in_AX;
  longlong unaff_RBP;
  longlong unaff_RSI;
  undefined1 uStack0000000000000000;
  ulonglong in_stack_00000048;
  
  *(char *)(unaff_RBP + 0x33) = *(char *)(unaff_RBP + 0x33) + param_3;
  *(char *)(param_2 + 0x66) = *(char *)(param_2 + 0x66) >> 8;
  cVar2 = (char)((ushort)in_AX >> 8);
  *(int *)(unaff_RBP + 0x33) = *(int *)(unaff_RBP + 0x33) + 1;
  pbVar1 = (byte *)(CONCAT71((uint7)(uint3)(int3)cVar2,0xe9) + -0x73);
  *pbVar1 = *pbVar1 >> 5 | *pbVar1 << 3;
  LOCK();
  *(char *)(param_2 + unaff_RSI) = cVar2;
  UNLOCK();
  FUN_180c14a90(param_1,0x3c3);
  FUN_180e155e0(in_stack_00000048 ^ (ulonglong)&uStack0000000000000000);
  return;
}

