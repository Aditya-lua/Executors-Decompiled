
void FUN_005fb3ec(ulong param_1)

{
  long in_x9;
  
                    /* WARNING: Could not recover jumptable at 0x005fb41c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(in_x9 + (param_1 & 0xfffffffffffffff8)))();
  return;
}

