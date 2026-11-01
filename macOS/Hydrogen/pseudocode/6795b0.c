
void FUN_006795b0(void)

{
  bool in_ZR;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  long in_stack_00000038;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  undefined1 uStack0000000000000060;
  
  if (!in_ZR) {
    _memcpy();
  }
  func_0x006553a4(&uStack0000000000000060);
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
  if (in_stack_00000030 <= in_stack_00000028) {
    in_stack_00000028 = in_stack_00000030;
  }
  if (in_stack_00000038 != 0) {
    if (in_stack_00000028 != 0) {
      do {
        *(undefined8 *)(in_stack_00000038 + -8 + in_stack_00000028 * 8) = 0;
        in_stack_00000028 = in_stack_00000028 - 1;
      } while (in_stack_00000028 != 0);
    }
    func_0x00611644();
  }
  return;
}

