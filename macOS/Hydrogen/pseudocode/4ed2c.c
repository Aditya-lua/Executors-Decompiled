
void FUN_0004ed2c(void)

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
    __Unwind_Resume();
    __ZdlPv(in_stack_00000090);
    if (in_stack_00000010 < 0) {
      __ZdlPv(in_stack_00000000);
      if (in_stack_00000030 < 0) goto code_r0x0004ed54;
LAB_0004ed14:
      if (-1 < in_stack_00000068) goto LAB_0004ed1c;
code_r0x0004ed64:
      __ZdlPv(in_stack_00000058);
      cVar1 = *(char *)((long)unaff_x19 + 0x17);
    }
    else {
      if (-1 < in_stack_00000030) goto LAB_0004ed14;
code_r0x0004ed54:
      __ZdlPv(in_stack_00000020);
      if (in_stack_00000068 < 0) goto code_r0x0004ed64;
LAB_0004ed1c:
      cVar1 = *(char *)((long)unaff_x19 + 0x17);
    }
    if (cVar1 < '\0') {
      __ZdlPv(*unaff_x19);
    }
  } while( true );
}

