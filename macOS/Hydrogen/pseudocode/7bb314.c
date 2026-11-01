
void FUN_007bb314(void)

{
  code *pcVar1;
  
  Hint_Prefetch(0x7bd350,0,0,0);
                    /* WARNING: Does not return */
  pcVar1 = (code *)UndefinedInstructionException(0x1001,0x7bb318);
  (*pcVar1)();
}

