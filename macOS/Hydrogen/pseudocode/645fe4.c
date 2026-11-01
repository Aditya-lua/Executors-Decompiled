
/* WARNING: Possible PIC construction at 0x00646008: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0064600c) */
/* WARNING: Removing unreachable block (ram,0x00646014) */

undefined8 * FUN_00645fe4(undefined8 *param_1)

{
  bool in_ZR;
  undefined8 uStack0000000000000008;
  undefined *in_stack_00000010;
  undefined *in_stack_00000018;
  undefined *in_stack_00000020;
  undefined *in_stack_00000028;
  undefined *in_stack_00000030;
  undefined1 uStack0000000000000038;
  undefined1 uStack00000000000001b0;
  
  if (in_ZR) {
    return param_1;
  }
  ___stack_chk_fail();
  uStack0000000000000008 = &UNK_00a09bc0;
  in_stack_00000010 = &UNK_00a09ca8;
  in_stack_00000018 = &UNK_00a09d00;
  in_stack_00000020 = &UNK_00a02900;
  in_stack_00000028 = &UNK_00a029a0;
  in_stack_00000030 = &UNK_00a02a70;
  func_0x00631cc8(&uStack00000000000001b0);
  in_stack_00000028 = &UNK_00a02ae8;
  in_stack_00000030 = &UNK_00a02bb8;
  func_0x00633a74(&uStack0000000000000038,&UNK_009fb230);
  return &uStack0000000000000008;
}

