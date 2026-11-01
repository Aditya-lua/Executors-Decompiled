
void FUN_000419a0(void)

{
  code *pcVar1;
  undefined8 *unaff_x19;
  undefined1 unaff_w22;
  
  *(undefined1 *)((long)unaff_x19 + 0x27) = unaff_w22;
  *unaff_x19 = &UNK_009b2ea0;
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x419cc);
  (*pcVar1)();
}

