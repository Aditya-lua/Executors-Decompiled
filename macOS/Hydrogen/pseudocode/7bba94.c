
void FUN_007bba94(undefined8 param_1)

{
  code *pcVar1;
  undefined8 *in_x13;
  undefined8 unaff_x28;
  
  *in_x13 = unaff_x28;
  in_x13[1] = param_1;
                    /* WARNING: Does not return */
  pcVar1 = (code *)UndefinedInstructionException(0x4401,0x7bba98);
  (*pcVar1)();
}

