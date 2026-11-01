
undefined8 FUN_00746f2c(long param_1)

{
  long unaff_x19;
  undefined8 unaff_x22;
  char *pcStack0000000000000000;
  
  if (0 < *(int *)(param_1 + 8)) {
    if (*(long *)(unaff_x19 + 0x18) == 0) {
      pcStack0000000000000000 = "???";
    }
    else {
      pcStack0000000000000000 =
           *(char **)(&UNK_00a1e570 + (ulong)*(byte *)(*(long *)(unaff_x19 + 0x18) + 0x4f6) * 8);
    }
    func_0x0073cfbc();
    unaff_x22 = 0;
  }
  return unaff_x22;
}

