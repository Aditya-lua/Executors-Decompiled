/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b58c4
 */

long SSL_CTX_callback_ctrl(SSL_CTX *param_1,int param_2,_func_3378 *param_3)

{
  uint uVar1;
  
  if (param_2 == 0xf) {
    *(_func_3378 **)(param_1->sid_ctx + 0x10) = param_3;
    return 1;
  }
                    /* WARNING: Could not recover jumptable at 0x009b58e8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*param_1->cipher_list[6].stack.comp)(param_1,(void *)(ulong)(uint)param_2);
  return (ulong)uVar1;
}

