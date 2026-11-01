
void FUN_000704d8(long param_1)

{
  long unaff_x19;
  
  if (param_1 != 0) {
    _munmap(param_1,*(undefined8 *)(unaff_x19 + 0x20));
    *(undefined8 *)(unaff_x19 + 0x28) = 0;
  }
  if (*(int *)(unaff_x19 + 0x18) != -1) {
    _close();
    *(undefined4 *)(unaff_x19 + 0x18) = 0xffffffff;
  }
  *(undefined8 *)(unaff_x19 + 0x20) = 0;
  return;
}

