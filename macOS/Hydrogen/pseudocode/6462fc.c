
/* WARNING: Possible PIC construction at 0x00646308: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0064630c) */
/* WARNING: Removing unreachable block (ram,0x00646314) */

undefined8 * FUN_006462fc(void)

{
  undefined8 uStack0000000000000008;
  undefined *in_stack_00000010;
  undefined *in_stack_00000018;
  undefined *in_stack_00000020;
  undefined *in_stack_00000028;
  undefined *in_stack_00000030;
  undefined1 uStack0000000000000038;
  undefined1 auStack_7ffffffe [2147483614];
  
  ___stack_chk_fail();
  uStack0000000000000008 = &UNK_00a09fb0;
  in_stack_00000010 = &UNK_00a0a098;
  in_stack_00000018 = &UNK_00a0a0f0;
  in_stack_00000020 = &UNK_00a02f80;
  in_stack_00000028 = &UNK_00a03020;
  in_stack_00000030 = &UNK_00a030f0;
  func_0x00630324(auStack_7ffffffe + 0x80000226);
  in_stack_00000028 = &UNK_00a03168;
  in_stack_00000030 = &UNK_00a03238;
  func_0x00638f0c(&uStack0000000000000038,&UNK_009fb428);
  return &uStack0000000000000008;
}

