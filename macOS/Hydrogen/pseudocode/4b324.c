
void FUN_0004b324(void)

{
  code *pcVar1;
  undefined1 uStack0000000000000018;
  
  __ZNKSt3__110error_code7messageEv();
  func_0x00049ad4(&uStack0000000000000018,"Failed to canonicalize workspace: ");
  __ZNSt13runtime_errorC1ERKNSt3__112basic_stringIcNS0_11char_traitsIcEENS0_9allocatorIcEEEE();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4b36c);
  (*pcVar1)();
}

