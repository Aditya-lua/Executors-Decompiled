
void FUN_0079b378(void)

{
  code *pcVar1;
  undefined1 uStack0000000000000008;
  
  FUN_007a241c(&uStack0000000000000008,&UNK_009c2aa0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x79b38c);
  (*pcVar1)();
}

