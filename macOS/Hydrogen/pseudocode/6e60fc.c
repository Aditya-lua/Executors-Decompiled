
long FUN_006e60fc(long param_1,long param_2)

{
  long *in_x9;
  
  *(undefined8 *)(param_1 + 0x480) = *(undefined8 *)(*in_x9 + 0x10);
  *(undefined4 *)(param_1 + 0x48c) = 6;
  return *(long *)(param_2 + 0x18) + 0x480;
}

