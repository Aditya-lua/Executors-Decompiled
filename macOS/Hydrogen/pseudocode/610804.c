
void FUN_00610804(long param_1)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  
  *(undefined1 *)(param_1 + 0x19) = 0;
  *unaff_x19 = &UNK_009b2ec8;
  *(undefined4 *)(unaff_x19 + 1) = 1;
  func_0x00017634(unaff_x19 + 2);
  *unaff_x19 = &UNK_009b2f08;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x610854);
  (*pcVar1)();
}

