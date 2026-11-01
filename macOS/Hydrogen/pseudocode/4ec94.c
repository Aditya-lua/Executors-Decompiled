
void FUN_0004ec94(void)

{
  char cVar1;
  undefined8 *unaff_x19;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  undefined8 in_stack_00000058;
  long in_stack_00000068;
  undefined8 in_stack_00000090;
  
  do {
    __ZdlPv(in_stack_00000058);
    cVar1 = *(char *)((long)unaff_x19 + 0x17);
    while( true ) {
      if (cVar1 < '\0') {
        __ZdlPv(*unaff_x19);
      }
      __Unwind_Resume();
      __ZdlPv(in_stack_00000090);
      if (in_stack_00000010 < 0) {
        __ZdlPv(in_stack_00000000);
      }
      if (in_stack_00000030 < 0) {
        __ZdlPv(in_stack_00000020);
      }
      if (in_stack_00000068 < 0) break;
      cVar1 = *(char *)((long)unaff_x19 + 0x17);
    }
  } while( true );
}

