
void FUN_00642c04(undefined8 param_1,undefined8 *param_2)

{
  code *pcVar1;
  undefined8 in_x9;
  
  param_2[2] = param_1;
  param_2[3] = in_x9;
  *(undefined1 *)(param_2 + 4) = 0;
  *(undefined1 *)((long)param_2 + 0x27) = 0x10;
  *param_2 = &UNK_009f60b8;
  ___cxa_throw(param_2,&UNK_009f6090,&DAT_0060f08c);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x642d00);
  (*pcVar1)();
}

