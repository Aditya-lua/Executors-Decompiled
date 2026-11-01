
undefined8 FUN_00744744(long param_1,undefined8 param_2)

{
  long unaff_x19;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  
  if (*(int *)(param_1 + 0x570) < 1) {
    return param_2;
  }
  uStack0000000000000000 = *(undefined8 *)(&UNK_00a1e570 + (ulong)*(byte *)(unaff_x19 + 0x4f6) * 8);
  uStack0000000000000008 = 0;
  func_0x0073cfbc();
  return 0;
}

