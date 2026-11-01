
void FUN_000e6738(undefined8 param_1)

{
  uint *unaff_x19;
  double dStack0000000000000000;
  
  dStack0000000000000000 = (double)param_1;
  func_0x0010adc0("Codepoint: U+%04X");
  func_0x0010df50();
  dStack0000000000000000 = (double)(ulong)(*unaff_x19 >> 1 & 1);
  func_0x0010adc0("Visible: %d");
  dStack0000000000000000 = (double)(float)unaff_x19[1];
  func_0x0010adc0("AdvanceX: %.1f");
  dStack0000000000000000 = (double)(float)unaff_x19[2];
  func_0x0010adc0("Pos: (%.2f,%.2f)->(%.2f,%.2f)");
  dStack0000000000000000 = (double)(float)unaff_x19[6];
  func_0x0010adc0("UV: (%.3f,%.3f)->(%.3f,%.3f)");
  return;
}

