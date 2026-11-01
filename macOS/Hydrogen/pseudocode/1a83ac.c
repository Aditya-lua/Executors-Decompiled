
void FUN_001a83ac(void)

{
  long *plVar1;
  undefined8 *puVar2;
  long unaff_x19;
  undefined8 *unaff_x20;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  
  while( true ) {
    puVar2 = unaff_x20 + 3;
    unaff_x19 = unaff_x19 + -1;
    if (unaff_x19 == 0) break;
    plVar1 = unaff_x20 + 2;
    unaff_x20 = puVar2;
    if (*plVar1 != 0) {
      func_0x00187bd4(*puVar2,*plVar1,1);
    }
  }
  if (in_stack_00000018 != 0) {
    func_0x00187bd4(in_stack_00000020,in_stack_00000018 * 0x18,8);
  }
  return;
}

