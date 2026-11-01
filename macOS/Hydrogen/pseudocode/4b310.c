
void FUN_0004b310(void)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000030;
  
  uVar2 = ___cxa_allocate_exception(0x10);
  __ZNKSt3__110error_code7messageEv(&uStack0000000000000030);
  func_0x00049ad4(&uStack0000000000000018,"Failed to canonicalize workspace: ");
  __ZNSt13runtime_errorC1ERKNSt3__112basic_stringIcNS0_11char_traitsIcEENS0_9allocatorIcEEEE
            (uVar2,&uStack0000000000000018);
  ___cxa_throw(uVar2,PTR___ZTISt13runtime_error_009b0128,PTR___ZNSt13runtime_errorD1Ev_009b0050);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x4b36c);
  (*pcVar1)();
}

