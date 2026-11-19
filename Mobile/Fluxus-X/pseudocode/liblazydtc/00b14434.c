/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14434
 */

ulong X509_VERIFY_PARAM_get_flags(X509_VERIFY_PARAM *param)

{
  return param->flags;
}

