
/* WARNING: Possible PIC construction at 0x0069abc8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0069abcc) */

void FUN_0069abc4(void)

{
  ulong uVar1;
  undefined1 uStack000000000000000c;
  undefined1 uStack0000000000000010;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  undefined8 uStack0000000000000068;
  undefined1 uStack0000000000000070;
  ulong in_stack_000000b8;
  ulong in_stack_000000c0;
  undefined1 *in_stack_000000c8;
  
  if (in_stack_000000c0 <= in_stack_000000b8) {
    in_stack_000000b8 = in_stack_000000c0;
  }
  uVar1 = in_stack_000000b8;
  if (in_stack_000000c8 == &uStack0000000000000070) {
    for (; uVar1 != 0; uVar1 = uVar1 - 1) {
      *(undefined4 *)((long)&uStack0000000000000068 + uVar1 * 4 + 4) = 0;
    }
  }
  if (in_stack_00000060 <= in_stack_00000058) {
    in_stack_00000058 = in_stack_00000060;
  }
  uVar1 = in_stack_00000058;
  if (uStack0000000000000068 == &uStack0000000000000010 && in_stack_00000058 != 0) {
    do {
      *(undefined4 *)(&uStack000000000000000c + uVar1 * 4) = 0;
      uVar1 = uVar1 - 1;
    } while (uVar1 != 0);
  }
  return;
}

