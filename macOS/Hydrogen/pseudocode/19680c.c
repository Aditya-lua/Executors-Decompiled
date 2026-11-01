
void FUN_0019680c(void)

{
  code *pcVar1;
  
  func_0x007a11c0(&UNK_0081b8dc);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x196834);
  (*pcVar1)();
}

