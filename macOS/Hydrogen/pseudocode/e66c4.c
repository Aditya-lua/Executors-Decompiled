
void FUN_000e66c4(void)

{
  long unaff_x19;
  undefined4 unaff_w24;
  long in_stack_00000028;
  
  func_0x000f3af4();
  *(undefined4 *)(unaff_x19 + 0x30) = unaff_w24;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000028) {
    return;
  }
  ___stack_chk_fail();
  func_0x0010adc0("Codepoint: U+%04X");
  func_0x0010df50();
  func_0x0010adc0("Visible: %d");
  func_0x0010adc0("AdvanceX: %.1f");
  func_0x0010adc0("Pos: (%.2f,%.2f)->(%.2f,%.2f)");
  func_0x0010adc0("UV: (%.3f,%.3f)->(%.3f,%.3f)");
  return;
}

