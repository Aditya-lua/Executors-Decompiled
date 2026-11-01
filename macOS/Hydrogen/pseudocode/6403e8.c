
void FUN_006403e8(long param_1)

{
  long *plVar1;
  
  plVar1 = *(long **)(param_1 + 0x30);
  (**(code **)(*(long *)(param_1 + -8) + 0x20))((long *)(param_1 + -8));
                    /* WARNING: Could not recover jumptable at 0x00640424. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*plVar1 + 0x98))(plVar1);
  return;
}

