/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b54cc
 */

long SSL_callback_ctrl(SSL *param_1,int param_2,_func_3375 *param_3)

{
  uint uVar1;
  
  if (param_2 == 0xf) {
    param_1[1].tlsext_ocsp_resp = (uchar *)param_3;
    return 1;
  }
                    /* WARNING: Could not recover jumptable at 0x009b54f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*param_1->method->ssl_version)(param_1);
  return (ulong)uVar1;
}

