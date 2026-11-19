/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1441c
 */

int X509_VERIFY_PARAM_clear_flags(X509_VERIFY_PARAM *param,ulong flags)

{
  param->flags = param->flags & (flags ^ 0xffffffffffffffff);
  return 1;
}

