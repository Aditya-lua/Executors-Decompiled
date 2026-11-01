
void FUN_00628c90(long *param_1)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)((long)param_1 + *(long *)(*param_1 + -0x18));
  *puVar1 = &UNK_009ff3a0;
  puVar1[1] = &UNK_009ff440;
  puVar1[2] = &UNK_009ff510;
  func_0x00621dd4(puVar1 + 0x1f);
  puVar1[1] = &UNK_009ff600;
  puVar1[2] = &UNK_009ff6d0;
  func_0x0065a978(puVar1 + 3);
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)(puVar1);
  return;
}

