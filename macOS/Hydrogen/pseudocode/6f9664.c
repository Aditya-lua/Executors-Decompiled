
uint FUN_006f9664(void)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  int unaff_w22;
  ulong unaff_x23;
  ulong in_stack_00000010;
  undefined8 in_stack_00000020;
  uint in_stack_00000028;
  
  while( true ) {
    lVar1 = func_0x006f9748();
    if (lVar1 != 0) {
      if (unaff_w22 == 0) {
        uVar2 = in_stack_00000028;
        if (in_stack_00000028 < 2) {
          uVar2 = 1;
        }
        func_0x006e6978(in_stack_00000020,uVar2,"too many captures");
        if ((int)uVar2 < 1) {
          uVar2 = in_stack_00000028;
        }
        else {
          uVar3 = 0;
          do {
            func_0x006fa2fc();
            uVar3 = uVar3 + 1;
          } while (uVar2 != uVar3);
        }
      }
      else {
        func_0x006e3870();
        func_0x006e3870();
        func_0x006e6978(in_stack_00000020,in_stack_00000028,"too many captures");
        if (0 < (int)in_stack_00000028) {
          uVar2 = 0;
          do {
            func_0x006fa2fc();
            uVar2 = uVar2 + 1;
          } while (in_stack_00000028 != uVar2);
        }
        uVar2 = in_stack_00000028 + 2;
      }
      return uVar2;
    }
    if (in_stack_00000010 <= unaff_x23) break;
    in_stack_00000028 = 0;
    unaff_x23 = unaff_x23 + 1;
  }
  func_0x006e383c();
  return 1;
}

