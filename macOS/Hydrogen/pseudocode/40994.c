
void FUN_00040994(void)

{
  code *pcVar1;
  undefined8 uVar2;
  
  uVar2 = ___cxa_allocate_exception(0x10);
  __ZNSt13runtime_errorC1EPKc
            (uVar2,
             "GCM mode requires authenticated encryption/decryption functions, not supported by this helper."
            );
  ___cxa_throw(uVar2,PTR___ZTISt13runtime_error_009b0128,PTR___ZNSt13runtime_errorD1Ev_009b0050);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x40a18);
  (*pcVar1)();
}

