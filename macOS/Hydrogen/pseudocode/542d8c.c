
void FUN_00542d8c(undefined8 param_1,undefined8 param_2,long param_3)

{
  code *pcVar1;
  
  func_0x007a23d8(&UNK_008aad91,0x16,param_3 + 0x590);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5431a0);
  (*pcVar1)();
}

