
void FUN_005287f8(undefined8 param_1,long param_2)

{
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *puVar1;
  long in_stack_00000030;
  long in_stack_000000d0;
  long in_stack_000000d8;
  long in_stack_000000e0;
  long in_stack_000000e8;
  undefined8 in_stack_000000f0;
  long in_stack_00000100;
  undefined8 in_stack_00000108;
  long in_stack_00000118;
  undefined8 in_stack_00000120;
  
  while( true ) {
    if (param_2 != 0) {
      func_0x00187bd4(*unaff_x20,param_2,1);
    }
    unaff_x19 = unaff_x19 + -1;
    if (unaff_x19 == 0) break;
    param_2 = unaff_x20[2];
    unaff_x20 = unaff_x20 + 3;
  }
  if (in_stack_00000118 != 0) {
    func_0x00187bd4(in_stack_00000120,in_stack_00000118 * 0x18,8);
  }
  if (in_stack_00000100 != 0) {
    func_0x00187bd4(in_stack_00000108,in_stack_00000100 << 4,8);
  }
  if (in_stack_000000e8 != 0) {
    func_0x00187bd4(in_stack_000000f0,in_stack_000000e8 << 4,8);
  }
  if (in_stack_00000030 == 0) {
    if (in_stack_000000e0 != 0) {
      puVar1 = (undefined8 *)(in_stack_000000d8 + 8);
      do {
        if (puVar1[-1] != 0) {
          func_0x00187bd4(*puVar1,puVar1[-1] << 3,8);
        }
        puVar1 = puVar1 + 5;
        in_stack_000000e0 = in_stack_000000e0 + -1;
      } while (in_stack_000000e0 != 0);
    }
    if (in_stack_000000d0 != 0) {
      func_0x00187bd4(in_stack_000000d8,in_stack_000000d0 * 0x28,8);
    }
  }
  return;
}

