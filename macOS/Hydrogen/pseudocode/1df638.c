
/* WARNING: Removing unreachable block (ram,0x001df288) */
/* WARNING: Removing unreachable block (ram,0x001df290) */
/* WARNING: Removing unreachable block (ram,0x001df29c) */
/* WARNING: Removing unreachable block (ram,0x001df2a4) */
/* WARNING: Removing unreachable block (ram,0x001df2ac) */

void FUN_001df638(void)

{
  long lVar1;
  undefined8 *unaff_x20;
  long lVar2;
  undefined8 *unaff_x22;
  ulong unaff_x24;
  undefined1 uStack0000000000000040;
  long in_stack_000001b0;
  undefined8 in_stack_000001b8;
  undefined1 uStack00000000000001d0;
  long in_stack_000002c0;
  undefined8 *in_stack_000002c8;
  long in_stack_000002e8;
  long in_stack_000002f0;
  long in_stack_000002f8;
  undefined1 auStack_7ffffffe [2147483646];
  
  *unaff_x20 = 0x800000000000001a;
  *(undefined1 *)(unaff_x20 + 1) = 5;
  if ((code *)*unaff_x22 != (code *)0x0) {
    (*(code *)*unaff_x22)();
  }
  if (unaff_x22[1] != 0) {
    func_0x00187bd4();
  }
  func_0x001d50f8(auStack_7ffffffe + 0x800002fe);
  func_0x001d4e60(&uStack0000000000000040);
  if (((unaff_x24 & 1) != 0) && (in_stack_000001b0 != 0)) {
    func_0x00187bd4(in_stack_000001b8,in_stack_000001b0,1);
  }
  if (in_stack_000002c0 != 0) {
    if ((code *)*in_stack_000002c8 != (code *)0x0) {
      (*(code *)*in_stack_000002c8)(in_stack_000002c0);
    }
    if (in_stack_000002c8[1] != 0) {
      func_0x00187bd4(in_stack_000002c0,in_stack_000002c8[1],in_stack_000002c8[2]);
    }
  }
  func_0x001d5f88(&uStack00000000000001d0);
  lVar2 = in_stack_000002f8 + 1;
  lVar1 = in_stack_000002f0;
  while (lVar2 = lVar2 + -1, lVar2 != 0) {
    func_0x001a09ec(lVar1);
    lVar1 = lVar1 + 0x40;
  }
  if (in_stack_000002e8 != 0) {
    func_0x00187bd4(in_stack_000002f0,in_stack_000002e8 << 6,8);
  }
  func_0x00187bd4();
  return;
}

