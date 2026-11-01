
void FUN_0060f42c(void)

{
  undefined8 *puVar1;
  ulong uVar2;
  long unaff_x21;
  long unaff_x26;
  undefined1 uStack000000000000001c;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  undefined8 uStack0000000000000078;
  ulong in_stack_000000c8;
  ulong in_stack_000000d0;
  long in_stack_000000d8;
  
  uVar2 = in_stack_000000c8;
  if (in_stack_000000d0 <= in_stack_000000c8) {
    uVar2 = in_stack_000000d0;
  }
  if (in_stack_000000d8 == unaff_x21) {
    for (; uVar2 != 0; uVar2 = uVar2 - 1) {
      *(undefined4 *)((long)&uStack0000000000000078 + uVar2 * 4 + 4) = 0;
    }
  }
  uVar2 = in_stack_00000068;
  if (in_stack_00000070 <= in_stack_00000068) {
    uVar2 = in_stack_00000070;
  }
  if (uStack0000000000000078 == unaff_x26 && uVar2 != 0) {
    do {
      *(undefined4 *)(&uStack000000000000001c + uVar2 * 4) = 0;
      uVar2 = uVar2 - 1;
    } while (uVar2 != 0);
  }
  puVar1 = (undefined8 *)__Unwind_Resume();
  uVar2 = puVar1[0x17];
  if ((ulong)puVar1[0x18] <= (ulong)puVar1[0x17]) {
    uVar2 = puVar1[0x18];
  }
  *(undefined1 *)((long)puVar1 + 0xb1) = 0;
  if ((undefined8 *)puVar1[0x19] == puVar1 + 0xe && uVar2 != 0) {
    do {
      *(undefined4 *)((long)puVar1 + uVar2 * 4 + 0x6c) = 0;
      uVar2 = uVar2 - 1;
    } while (uVar2 != 0);
  }
  *puVar1 = &UNK_009b66c8;
  uVar2 = puVar1[0xb];
  if ((ulong)puVar1[0xc] <= (ulong)puVar1[0xb]) {
    uVar2 = puVar1[0xc];
  }
  *(undefined1 *)((long)puVar1 + 0x51) = 0;
  if ((undefined8 *)puVar1[0xd] == puVar1 + 2 && uVar2 != 0) {
    do {
      *(undefined4 *)((long)puVar1 + uVar2 * 4 + 0xc) = 0;
      uVar2 = uVar2 - 1;
    } while (uVar2 != 0);
  }
  return;
}

