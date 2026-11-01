
void FUN_005edfe4(undefined8 param_1)

{
  code *pcVar1;
  undefined1 uStack0000000000000008;
  
  func_0x0000a968(&uStack0000000000000008,
                  "Cryptographic algorithms are disabled before the power-up self tests are performed."
                 );
  func_0x005ee06c(param_1,&uStack0000000000000008);
  ___cxa_throw(param_1,&UNK_009f4668,&DAT_005ee0ec);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5ee028);
  (*pcVar1)();
}

