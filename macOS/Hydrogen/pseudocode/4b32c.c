
void FUN_0004b32c(long param_1)

{
  code *pcVar1;
  undefined1 uStack0000000000000018;
  
  func_0x00049ad4(&uStack0000000000000018,param_1 + 0x2db);
  __ZNSt13runtime_errorC1ERKNSt3__112basic_stringIcNS0_11char_traitsIcEENS0_9allocatorIcEEEE();
  ___cxa_throw();
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4b36c);
  (*pcVar1)();
}

