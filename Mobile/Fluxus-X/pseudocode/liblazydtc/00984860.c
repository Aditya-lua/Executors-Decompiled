/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00984860
 */

/* ix::Socket::wakeUpFromPoll(unsigned long) */

void ix::Socket::wakeUpFromPoll(ulong param_1)

{
                    /* WARNING: Could not recover jumptable at 0x0098486c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(long **)(param_1 + 0x38) + 0x18))();
  return;
}

