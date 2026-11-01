
void FUN_000704ec(int param_1)

{
  long unaff_x19;
  
  if (param_1 != -1) {
    _close();
    *(undefined4 *)(unaff_x19 + 0x18) = 0xffffffff;
  }
  *(undefined8 *)(unaff_x19 + 0x20) = 0;
  return;
}

