
void FUN_00484ec0(void)

{
  code *pcVar1;
  
  func_0x007a247c(&UNK_0089e9a7,0x24,&UNK_009e1520);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4851b4);
  (*pcVar1)();
}

