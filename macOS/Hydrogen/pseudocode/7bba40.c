
/* WARNING: Control flow encountered bad instruction data */

void FUN_007bba40(long param_1)

{
  undefined8 unaff_d11;
  undefined8 in_register_00005168;
  undefined8 in_d21;
  undefined8 in_register_000052a8;
  
  *(undefined8 *)(param_1 + 0x88) = in_register_00005168;
  *(undefined8 *)(param_1 + 0x80) = unaff_d11;
  *(undefined8 *)(param_1 + 0x98) = in_register_000052a8;
  *(undefined8 *)(param_1 + 0x90) = in_d21;
                    /* WARNING: Bad instruction - Truncating control flow here */
  halt_baddata();
}

