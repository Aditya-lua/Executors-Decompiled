
void FUN_00515050(long param_1,undefined1 param_2 [16])

{
  bool in_ZR;
  long unaff_x19;
  long unaff_x20;
  undefined8 *puVar1;
  undefined8 *in_stack_00000020;
  long in_stack_00000058;
  
  in_stack_00000020[1] = param_2._8_8_;
  *in_stack_00000020 = param_2._0_8_;
  in_stack_00000020[2] = *(undefined8 *)(param_1 + 0x10);
  in_stack_00000020[3] = 0x8000000000000000;
  if (!in_ZR) {
    puVar1 = (undefined8 *)(unaff_x20 + 8);
    do {
      if (puVar1[-1] != 0) {
        func_0x00187bd4(*puVar1,puVar1[-1],1);
      }
      puVar1 = puVar1 + 3;
      unaff_x19 = unaff_x19 + -1;
    } while (unaff_x19 != 0);
  }
  if (in_stack_00000058 != 0) {
    func_0x00187bd4();
  }
  return;
}

