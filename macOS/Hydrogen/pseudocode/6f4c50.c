
ulong FUN_006f4c50(long *param_1,long *param_2)

{
  bool in_ZR;
  ulong uVar1;
  long in_x9;
  
  if (!in_ZR) {
    return 0;
  }
  if ((uint)in_x9 < 5) {
                    /* WARNING: Could not recover jumptable at 0x006f4c74. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar1 = (*(code *)(&UNK_006f4c78 + (ulong)(byte)(&UNK_008c81cd)[in_x9] * 4))(1);
    return uVar1;
  }
  return (ulong)(*param_1 == *param_2);
}

