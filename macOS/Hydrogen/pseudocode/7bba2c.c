
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_007bba2c(long param_1)

{
  code *pcVar1;
  undefined8 unaff_x24;
  
  *(long *)(param_1 + 0xc0) = param_1;
  *(undefined8 *)(param_1 + 200) = unaff_x24;
                    /* WARNING: Does not return */
  pcVar1 = (code *)UndefinedInstructionException(0x5001,0x7bba38);
  (*pcVar1)();
}

