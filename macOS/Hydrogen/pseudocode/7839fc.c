
undefined8 FUN_007839fc(void)

{
  long unaff_x19;
  undefined8 unaff_x20;
  
  if (*(long *)(unaff_x19 + 0x850) != 0) {
    *(uint *)(&UNK_00001344 + unaff_x19) = *(uint *)(&UNK_00001344 + unaff_x19) & 0xfffffffc | 2;
  }
  if (((((int)unaff_x20 == 0) &&
       (unaff_x20 = func_0x00775ed0((long)&linkedit_data_command_00001318.cmd + unaff_x19),
       (int)unaff_x20 == 0)) &&
      (unaff_x20 = func_0x00775ed0(unaff_x19 + 0x1320,*(undefined8 *)(unaff_x19 + 0x850)),
      (int)unaff_x20 == 0)) &&
     (unaff_x20 = func_0x00775ed0(unaff_x19 + 0x1330,*(undefined8 *)(unaff_x19 + 0x860)),
     (int)unaff_x20 == 0)) {
    unaff_x20 = func_0x00775ed0(&UNK_00001338 + unaff_x19,*(undefined8 *)(unaff_x19 + 0x868));
  }
  *(undefined4 *)(unaff_x19 + 0x118) = 0;
  func_0x0074e9f0();
  return unaff_x20;
}

