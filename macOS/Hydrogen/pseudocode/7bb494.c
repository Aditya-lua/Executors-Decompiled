
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb494(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 long param_5)

{
  *(long *)(param_5 + 0x80) = param_5;
  *(undefined8 *)(param_5 + 0x88) = param_3;
  LOAcquire();
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

