
void FUN_00616a40(long *param_1)

{
  long *plStack0000000000000018;
  undefined *puStack0000000000000028;
  
  puStack0000000000000028 = &UNK_009f6848;
  plStack0000000000000018 = param_1;
  func_0x00617ff4();
  if (plStack0000000000000018 != (long *)0x0) {
    (**(code **)(*plStack0000000000000018 + 8))();
  }
  return;
}

