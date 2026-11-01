
void FUN_00462698(long param_1,undefined8 *param_2)

{
                    /* WARNING: Could not recover jumptable at 0x004626b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_2[1] + 0x18))
            (*param_2,param_1 + (ulong)*(byte *)(param_1 + 10),
             (ulong)*(byte *)(param_1 + 0xb) - (ulong)*(byte *)(param_1 + 10));
  return;
}

