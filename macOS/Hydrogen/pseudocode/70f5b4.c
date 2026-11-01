
void FUN_0070f5b4(long param_1,long *param_2)

{
  long unaff_x19;
  undefined8 *unaff_x21;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  if (param_1 == 0x30) {
    (**(code **)(*param_2 + 0x10))();
    func_0x0002a730();
    return;
  }
  func_0x00798aa4(&uStack0000000000000008,"%d parse errors");
  if (*(char *)(unaff_x19 + 0x37) < '\0') {
    __ZdlPv(*unaff_x21);
  }
  unaff_x21[1] = in_stack_00000010;
  *unaff_x21 = uStack0000000000000008;
  unaff_x21[2] = in_stack_00000018;
  return;
}

