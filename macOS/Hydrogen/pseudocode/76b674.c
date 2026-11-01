
undefined8 FUN_0076b674(long param_1)

{
  int in_w8;
  
  if (in_w8 != 0xb1e) {
    return 1;
  }
  if ((*(byte *)(param_1 + 0x271) >> 2 & 1) == 0) {
    func_0x0076b6c8();
    return 0;
  }
  return 8;
}

