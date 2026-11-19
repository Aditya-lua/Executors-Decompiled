/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7d28
 */

void SSL_CTX_set_not_resumable_session_callback(long param_1,undefined8 param_2)

{
                    /* WARNING: Could not recover jumptable at 0x009b7d38. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)(param_1 + 8) + 0xd8))(param_1,0x4f,param_2);
  return;
}

