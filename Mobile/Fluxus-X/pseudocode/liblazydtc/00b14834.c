/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14834
 */

undefined ** X509_VERIFY_PARAM_get0(int param_1)

{
  undefined **ppuVar1;
  
  if (param_1 < 5) {
    return &PTR_s_default_00c81c08 + (long)param_1 * 0xe;
  }
  ppuVar1 = (undefined **)OPENSSL_sk_value(DAT_00d227f0,param_1 + -5);
  return ppuVar1;
}

