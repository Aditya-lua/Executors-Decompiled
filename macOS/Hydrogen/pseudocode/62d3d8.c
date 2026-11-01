
/* WARNING: Possible PIC construction at 0x0062d434: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0062d438) */

void FUN_0062d3d8(void)

{
  undefined8 uVar1;
  ulong uVar2;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  
  func_0x0001753c();
  uVar1 = func_0x0001753c();
  uVar2 = in_stack_00000018;
  if (in_stack_00000020 <= in_stack_00000018) {
    uVar2 = in_stack_00000020;
  }
  if (in_stack_00000028 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000028 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  __Unwind_Resume(uVar1);
  func_0x0001753c();
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
  return;
}

