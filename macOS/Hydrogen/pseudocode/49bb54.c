
void FUN_0049bb54(undefined8 param_1)

{
  code *pcVar1;
  long unaff_x29;
  
  func_0x007a2810(param_1,0x37,unaff_x29 + -0x59,&UNK_009e2b20,&UNK_009e2b08);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x49bc98);
  (*pcVar1)();
}

