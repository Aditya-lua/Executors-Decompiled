
void FUN_00727568(long param_1)

{
  undefined8 in_x9;
  long in_x10;
  undefined8 in_x11;
  undefined2 *in_x12;
  
  *(undefined8 *)(param_1 + 8) = in_x9;
  *(undefined8 *)(param_1 + 0x10) = in_x11;
  *in_x12 = 0x100;
  *(char **)(in_x12 + 4) = "DebugLuauReportReturnTypeVariadicWithTypeSuffix";
  *(long *)(in_x12 + 8) = param_1;
  uRam0000000000a337a0 = 0;
  pcRam0000000000a337a8 = "DebugLuauStringSingletonBasedOnQuotes";
  uRam0000000000a337b8 = 0;
  pcRam0000000000a337c0 = "LuauExplicitTypeExpressionInstantiation";
  uRam0000000000a337c8 = 0xa337a0;
  uRam0000000000a337d0 = 0;
  pcRam0000000000a337d8 = "LuauAutocompleteAttributes";
  uRam0000000000a337e0 = 0xa337b8;
  uRam0000000000a337e8 = 0;
  pcRam0000000000a337f0 = "LuauCstStatDoWithStatsStart";
  uRam0000000000a337f8 = 0xa337d0;
  puRam0000000000a337b0 = in_x12;
  *(undefined8 *)(in_x10 + 0xde8) = 0xa337e8;
  ___cxa_atexit(&DAT_007272b0,0,0);
  pcRam0000000000a33808 = "checked";
  uRam0000000000a33810 = 0;
  uRam0000000000a33818 = 0;
  uRam0000000000a33838 = 0;
  pcRam0000000000a33840 = "native";
  uRam0000000000a33848 = 1;
  uRam0000000000a33850 = 0;
  uRam0000000000a33870 = 0;
  pcRam0000000000a33878 = "deprecated";
  uRam0000000000a33880 = 2;
  puRam0000000000a33888 = &UNK_00a1dfa8;
  puRam0000000000a33890 = &DAT_0070eea8;
  uRam0000000000a338a0 = 0xa33888;
  uRam0000000000a338a8 = 1;
  uRam0000000000a338b0 = 0;
  uRam0000000000a338b8 = 0;
  uRam0000000000a338c0 = 0;
  uRam0000000000a338e0 = 0;
                    /* WARNING: Could not recover jumptable at 0x007b2fa4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR____cxa_atexit_00a24b08)(&DAT_007273c0,0,0);
  return;
}

