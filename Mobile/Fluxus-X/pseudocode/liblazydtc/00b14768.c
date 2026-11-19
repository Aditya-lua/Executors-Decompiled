/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14768
 */

int X509_VERIFY_PARAM_get_depth(X509_VERIFY_PARAM *param)

{
  return param->depth;
}

