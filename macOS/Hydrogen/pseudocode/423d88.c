
void FUN_00423d88(undefined8 *param_1,undefined8 param_2)

{
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  undefined1 in_stack_00000028;
  undefined2 in_stack_00000050;
  undefined1 uStack0000000000000052;
  undefined8 uStack0000000000000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 uStack0000000000000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  
  func_0x0046a8c4(&uStack0000000000000008,param_2);
  uStack0000000000000018 = (char *)*param_1;
  in_stack_00000020 = param_1[1];
  if (in_stack_00000020 == 0) {
    uStack0000000000000052 = false;
  }
  else {
    uStack0000000000000052 = *uStack0000000000000018 == '/';
  }
  in_stack_00000028 = 6;
  in_stack_00000050 = 0x200;
  func_0x004245b4(&uStack0000000000000058,&uStack0000000000000018);
  while ((char)uStack0000000000000058 != '\n') {
    uStack0000000000000090 = CONCAT71(uStack0000000000000058._1_7_,(char)uStack0000000000000058);
    in_stack_00000098 = in_stack_00000060;
    in_stack_000000a0 = in_stack_00000068;
    in_stack_000000a8 = in_stack_00000070;
    in_stack_000000b0 = in_stack_00000078;
    in_stack_000000b8 = in_stack_00000080;
    in_stack_000000c0 = in_stack_00000088;
    func_0x00465960(&uStack0000000000000008,&uStack0000000000000090,&UNK_009d9178);
    func_0x004245b4(&uStack0000000000000058,&uStack0000000000000018);
  }
  func_0x00465c80(&uStack0000000000000008);
  return;
}

