
void FUN_006db40c(void)

{
  code *in_x9;
  long unaff_x19;
  long in_stack_00000010;
  long in_stack_00000038;
  long in_stack_00000068;
  
  (*in_x9)();
  if (in_stack_00000068 != 0) {
    __ZdlPv();
    *(undefined8 *)(unaff_x19 + 0x68) = 0;
    *(undefined8 *)(unaff_x19 + 0x70) = 0;
  }
  if (in_stack_00000038 != 0) {
    __ZdlPv();
    *(undefined8 *)(unaff_x19 + 0x38) = 0;
    *(undefined8 *)(unaff_x19 + 0x40) = 0;
  }
  if (in_stack_00000010 != 0) {
    __ZdlPv();
  }
  return;
}

