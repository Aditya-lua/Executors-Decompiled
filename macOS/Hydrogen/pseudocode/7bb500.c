
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb500(undefined1 param_1 [16],undefined1 param_2,long param_3)

{
  *(undefined1 *)(param_3 + 0x39) = param_2;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

