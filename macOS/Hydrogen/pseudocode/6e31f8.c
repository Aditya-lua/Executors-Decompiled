
undefined8 FUN_006e31f8(undefined8 param_1)

{
  bool in_ZR;
  bool in_CY;
  undefined8 uVar1;
  long in_x9;
  
  if (in_CY && !in_ZR) {
    return param_1;
  }
                    /* WARNING: Could not recover jumptable at 0x006e31cc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*(code *)(&UNK_006e31d0 + (ulong)(byte)(&UNK_008c7ab4)[in_x9] * 4))();
  return uVar1;
}

