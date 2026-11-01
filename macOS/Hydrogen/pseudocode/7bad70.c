
void FUN_007bad70(void)

{
  code *pcVar1;
  
                    /* WARNING: Does not return */
  pcVar1 = (code *)UndefinedInstructionException(0,0x7bad70);
  (*pcVar1)();
}

