
void FUN_00276cc0(undefined8 *param_1,undefined8 *param_2)

{
                    /* WARNING: Could not recover jumptable at 0x00469224. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1[1] + 0x18))
            (*param_1,*(undefined8 *)(&UNK_009cccd0 + (ulong)*(byte *)*param_2 * 8),
             *(undefined8 *)(&UNK_0082dc10 + (ulong)*(byte *)*param_2 * 8));
  return;
}

