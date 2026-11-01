
void FUN_0027b494(undefined8 param_1,undefined8 param_2,long param_3)

{
  code *pcVar1;
  
  func_0x007a247c(&UNK_0082e2a6,0x28,param_3 + 0xa40);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x27b4ac);
  (*pcVar1)();
}

