
char * FUN_000738b8(undefined8 param_1,undefined8 param_2)

{
  code *pcVar1;
  long unaff_x19;
  char *unaff_x20;
  char *unaff_x21;
  int unaff_w22;
  
  func_0x0002c694(param_1,param_2,1);
  *(int *)(unaff_x19 + 0x1c) = *(int *)(unaff_x19 + 0x1c) + unaff_w22;
  if ((unaff_x20 == unaff_x21) || (*unaff_x20 != ')')) {
    func_0x0002c744();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x7390c);
    (*pcVar1)();
  }
  func_0x0002ac7c();
  return unaff_x20 + 1;
}

