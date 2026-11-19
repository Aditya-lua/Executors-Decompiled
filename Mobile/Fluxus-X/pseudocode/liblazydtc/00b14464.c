/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14464
 */

void X509_VERIFY_PARAM_set_depth(X509_VERIFY_PARAM *param,int depth)

{
  param->depth = depth;
  return;
}

