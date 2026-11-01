
void FUN_00082764(void)

{
  int in_w8;
  undefined8 *in_x9;
  undefined8 *unaff_x19;
  undefined4 unaff_w20;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000048;
  
  if (-1 < in_w8) {
    in_x9 = &uStack0000000000000038;
  }
  *unaff_x19 = &UNK_009b9460;
  *(undefined4 *)(unaff_x19 + 1) = unaff_w20;
  __ZNSt13runtime_errorC1EPKc(unaff_x19 + 2,in_x9);
  *unaff_x19 = &UNK_009b9548;
  if (in_stack_00000048._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000038);
    return;
  }
  return;
}

