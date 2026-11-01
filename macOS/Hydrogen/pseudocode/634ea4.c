
void FUN_00634ea4(undefined8 *param_1)

{
  code *pcVar1;
  
  param_1[2] = 0x6f63656420524542;
  param_1[3] = 0x726f727265206564;
  *(undefined1 *)(param_1 + 4) = 0;
  *(undefined1 *)((long)param_1 + 0x27) = 0x10;
  *param_1 = &UNK_009f60b8;
  ___cxa_throw(param_1,&UNK_009f6090,&DAT_0060f08c);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x634ef8);
  (*pcVar1)();
}

