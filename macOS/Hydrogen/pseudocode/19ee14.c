
void FUN_0019ee14(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  code *pcVar1;
  undefined1 uStack0000000000000038;
  
  func_0x007a2810(param_1,0x37,&uStack0000000000000038,param_4,&UNK_009c2168);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x19ee2c);
  (*pcVar1)();
}

