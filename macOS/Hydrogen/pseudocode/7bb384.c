
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bb384(undefined8 param_1,undefined4 *param_2)

{
  undefined4 unaff_s12;
  
  *param_2 = unaff_s12;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

