
void FUN_0060cab0(void)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  ulong in_stack_00000078;
  ulong in_stack_00000080;
  long in_stack_00000088;
  undefined1 uStack0000000000000098;
  long in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000160;
  long in_stack_00000188;
  
  func_0x00621488();
  lVar3 = in_stack_00000188;
  uVar2 = in_stack_00000100;
  lVar1 = in_stack_000000c8;
  if (in_stack_00000188 != in_stack_00000088) {
    _memcpy(in_stack_00000188,in_stack_00000088,in_stack_00000080 << 3);
  }
  if (lVar1 * 2 != in_stack_00000080) {
    _bzero(lVar3 + in_stack_00000080 * 8,lVar1 * 0x10 + in_stack_00000080 * -8);
  }
  func_0x005fc898(uVar2,lVar3 + lVar1 * 0x10,lVar3,in_stack_000000d0,in_stack_00000160,lVar1);
  func_0x005fde88();
  if (in_stack_00000080 <= in_stack_00000078) {
    in_stack_00000078 = in_stack_00000080;
  }
  if (in_stack_00000088 != 0) {
    if (in_stack_00000078 != 0) {
      do {
        *(undefined8 *)(in_stack_00000088 + -8 + in_stack_00000078 * 8) = 0;
        in_stack_00000078 = in_stack_00000078 - 1;
      } while (in_stack_00000078 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000020 <= in_stack_00000018) {
    in_stack_00000018 = in_stack_00000020;
  }
  if (in_stack_00000028 != 0) {
    if (in_stack_00000018 != 0) {
      do {
        *(undefined8 *)(in_stack_00000028 + -8 + in_stack_00000018 * 8) = 0;
        in_stack_00000018 = in_stack_00000018 - 1;
      } while (in_stack_00000018 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000050 <= in_stack_00000048) {
    in_stack_00000048 = in_stack_00000050;
  }
  if (in_stack_00000058 != 0) {
    if (in_stack_00000048 != 0) {
      do {
        *(undefined8 *)(in_stack_00000058 + -8 + in_stack_00000048 * 8) = 0;
        in_stack_00000048 = in_stack_00000048 - 1;
      } while (in_stack_00000048 != 0);
    }
    func_0x00611644();
  }
  func_0x00610518(&uStack0000000000000098);
  return;
}

