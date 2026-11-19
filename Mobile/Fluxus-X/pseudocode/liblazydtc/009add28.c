/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009add28
 */

void ssl_ctx_security(long param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4,
                     undefined8 param_5)

{
                    /* WARNING: Could not recover jumptable at 0x009add50. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)(param_1 + 0x158) + 0x1e8))
            (0,param_1,param_2,param_3,param_4,param_5,
             *(undefined8 *)(*(long *)(param_1 + 0x158) + 0x1f8));
  return;
}

