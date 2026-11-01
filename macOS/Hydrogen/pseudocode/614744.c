
void FUN_00614744(undefined8 *param_1)

{
  code *pcVar1;
  
  *param_1 = &UNK_009f60b8;
  ___cxa_throw(param_1,&UNK_009f6090,&DAT_0060f08c);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x614768);
  (*pcVar1)();
}

