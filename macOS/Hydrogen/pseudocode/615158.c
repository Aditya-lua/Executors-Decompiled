
void FUN_00615158(ulong param_1,undefined8 *param_2)

{
  code *pcVar1;
  
  param_2[2] = param_1 & 0xffffffff | 0x6f63656400000000;
  param_2[3] = 0x726f727265206564;
  *(undefined1 *)(param_2 + 4) = 0;
  *(undefined1 *)((long)param_2 + 0x27) = 0x10;
  *param_2 = &UNK_009f60b8;
  ___cxa_throw(param_2,&UNK_009f6090,&DAT_0060f08c);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x615268);
  (*pcVar1)();
}

