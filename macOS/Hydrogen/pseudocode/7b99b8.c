
/* WARNING: Control flow encountered bad instruction data */

void FUN_007b99b8(long param_1,long param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5
                 )

{
  long *in_x14;
  
  *in_x14 = param_1;
  in_x14[1] = param_2;
  *(undefined8 *)(param_1 + 0x18) = param_5;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

