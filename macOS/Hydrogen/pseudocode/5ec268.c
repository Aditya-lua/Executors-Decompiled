
void FUN_005ec268(long param_1)

{
  code *pcVar1;
  
  func_0x007a2378(param_1 + 0x198);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5ec274);
  (*pcVar1)();
}

