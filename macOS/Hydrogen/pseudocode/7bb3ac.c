
void FUN_007bb3ac(undefined1 param_1 [16],undefined1 param_2 [16])

{
  code *pcVar1;
  long in_x5;
  undefined8 in_d28;
  undefined8 in_register_00005388;
  
  *(undefined8 *)(in_x5 + 0x28) = in_register_00005388;
  *(undefined8 *)(in_x5 + 0x20) = in_d28;
  *(long *)(in_x5 + 0x38) = param_2._8_8_;
  *(long *)(in_x5 + 0x30) = param_2._0_8_;
                    /* WARNING: Does not return */
  pcVar1 = (code *)UndefinedInstructionException(0x2804,0x7bb3b0);
  (*pcVar1)();
}

