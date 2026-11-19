/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1447c
 */

void X509_VERIFY_PARAM_set_time(X509_VERIFY_PARAM *param,time_t t)

{
  param->check_time = t;
  param->flags = param->flags | 2;
  return;
}

