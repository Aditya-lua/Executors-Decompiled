
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb3d4(long param_1,undefined1 param_2)

{
  *(undefined1 *)(param_1 + 0x1c) = param_2;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

