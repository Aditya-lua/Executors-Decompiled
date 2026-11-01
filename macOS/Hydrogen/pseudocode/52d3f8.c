
void FUN_0052d3f8(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 long param_5)

{
  code *pcVar1;
  long unaff_x29;
  
  func_0x007a2810(param_1,0x37,unaff_x29 + -0x59,param_4,param_5 + 0xa20);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x52d950);
  (*pcVar1)();
}

