
uint FUN_006f9674(long param_1)

{
  uint uVar1;
  uint uVar2;
  int unaff_w22;
  ulong unaff_x23;
  ulong in_stack_00000010;
  undefined8 in_stack_00000020;
  uint in_stack_00000028;
  
  while( true ) {
    if (param_1 != 0) {
      if (unaff_w22 == 0) {
        uVar1 = in_stack_00000028;
        if (in_stack_00000028 < 2) {
          uVar1 = 1;
        }
        func_0x006e6978(in_stack_00000020,uVar1,"too many captures");
        if ((int)uVar1 < 1) {
          uVar1 = in_stack_00000028;
        }
        else {
          uVar2 = 0;
          do {
            func_0x006fa2fc();
            uVar2 = uVar2 + 1;
          } while (uVar1 != uVar2);
        }
      }
      else {
        func_0x006e3870();
        func_0x006e3870();
        func_0x006e6978(in_stack_00000020,in_stack_00000028,"too many captures");
        if (0 < (int)in_stack_00000028) {
          uVar1 = 0;
          do {
            func_0x006fa2fc();
            uVar1 = uVar1 + 1;
          } while (in_stack_00000028 != uVar1);
        }
        uVar1 = in_stack_00000028 + 2;
      }
      return uVar1;
    }
    if (in_stack_00000010 <= unaff_x23) break;
    in_stack_00000028 = 0;
    param_1 = func_0x006f9748();
    unaff_x23 = unaff_x23 + 1;
  }
  func_0x006e383c();
  return 1;
}

