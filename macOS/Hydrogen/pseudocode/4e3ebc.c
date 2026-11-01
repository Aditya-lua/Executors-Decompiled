
void FUN_004e3ebc(undefined8 param_1)

{
  code *pcVar1;
  undefined8 unaff_x23;
  
  func_0x007a1f00(param_1,unaff_x23,&UNK_009e7fc8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4e3f0c);
  (*pcVar1)();
}

