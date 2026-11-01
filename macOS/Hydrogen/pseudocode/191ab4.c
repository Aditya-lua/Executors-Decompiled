
long FUN_00191ab4(void)

{
  code *pcVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x21;
  
  lVar2 = _SecPolicyCreateSSL();
  if (lVar2 == 0) {
    func_0x007a11c0(&UNK_0081a9b0,0x22,&UNK_009c11b8);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x191b00);
    (*pcVar1)();
  }
  if (unaff_x19 != 0) {
    func_0x0019fb28(unaff_x21 + 8);
  }
  return lVar2;
}

