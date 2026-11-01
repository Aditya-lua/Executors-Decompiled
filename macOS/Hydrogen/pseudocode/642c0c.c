
void FUN_00642c0c(undefined8 *param_1)

{
  code *pcVar1;
  
  *(undefined1 *)((long)param_1 + 0x27) = 0x10;
  *param_1 = &UNK_009f60b8;
  ___cxa_throw(param_1,&UNK_009f6090,&DAT_0060f08c);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x642d00);
  (*pcVar1)();
}

