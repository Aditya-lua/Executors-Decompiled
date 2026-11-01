
void FUN_0042cbfc(long *param_1)

{
  undefined *puVar1;
  long lVar2;
  long unaff_x23;
  undefined1 uStack0000000000000010;
  
  puVar1 = (undefined *)param_1[1];
  if (puVar1 == (undefined *)0x0) {
    puVar1 = &UNK_00888474;
    if (*param_1 != lRam0000000000a3bfe8) {
      puVar1 = (undefined *)0x0;
    }
    lVar2 = 4;
  }
  else {
    lVar2 = param_1[2] + -1;
  }
  func_0x0042cd4c(&uStack0000000000000010,puVar1,lVar2);
                    /* WARNING: Could not recover jumptable at 0x0042cc88. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_0042cc8c + (ulong)(byte)(&UNK_00884ef6)[**(byte **)(unaff_x23 + 0x10)] * 4))();
  return;
}

