
void FUN_00584780(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0x48) = param_2;
  *(undefined8 *)(param_1 + 0x40) = param_2;
  *(undefined8 *)(param_1 + 0x58) = 0xffffffffffffffff;
  *(undefined4 *)(param_1 + 0x78) = 0;
  return;
}

