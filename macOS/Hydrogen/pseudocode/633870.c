
/* WARNING: Possible PIC construction at 0x0063387c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00633880) */
/* WARNING: Removing unreachable block (ram,0x006338e8) */
/* WARNING: Removing unreachable block (ram,0x006338f0) */
/* WARNING: Removing unreachable block (ram,0x006338f4) */
/* WARNING: Removing unreachable block (ram,0x006338f8) */
/* WARNING: Removing unreachable block (ram,0x00633904) */
/* WARNING: Removing unreachable block (ram,0x00633908) */

undefined8 * FUN_00633870(void)

{
  ulong uVar1;
  undefined8 uStack0000000000000008;
  undefined *in_stack_00000010;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  long in_stack_00000030;
  undefined *in_stack_00000040;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
  long in_stack_00000060;
  
  func_0x0001753c();
  uStack0000000000000008 = &UNK_00a09a40;
  in_stack_00000040 = &UNK_009f5d60;
  uVar1 = in_stack_00000050;
  if (in_stack_00000058 <= in_stack_00000050) {
    uVar1 = in_stack_00000058;
  }
  if (in_stack_00000060 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined8 *)(in_stack_00000060 + -8 + uVar1 * 8) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644();
  }
  in_stack_00000010 = &UNK_009f5d60;
  uVar1 = in_stack_00000020;
  if (in_stack_00000028 <= in_stack_00000020) {
    uVar1 = in_stack_00000028;
  }
  if (in_stack_00000030 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined8 *)(in_stack_00000030 + -8 + uVar1 * 8) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644();
  }
  return &uStack0000000000000008;
}

