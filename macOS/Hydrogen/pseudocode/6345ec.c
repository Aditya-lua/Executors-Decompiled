
void FUN_006345ec(undefined8 param_1)

{
  undefined8 *unaff_x19;
  long unaff_x23;
  
  *unaff_x19 = param_1;
  unaff_x19[0x1e] = unaff_x23 + 0x678;
  unaff_x19[0x1f] = 0;
  unaff_x19[0x20] = 0;
  unaff_x19[0x21] = 0;
  func_0x005fdd18(unaff_x19 + 0x22);
  func_0x005fdd18(unaff_x19 + 0x28);
  *(undefined2 *)(unaff_x19 + 0x2e) = 0x100;
  func_0x0063408c();
  return;
}

