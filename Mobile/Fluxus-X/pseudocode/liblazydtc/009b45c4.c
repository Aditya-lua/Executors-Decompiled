/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b45c4
 */

long SSL_get_default_timeout(SSL *s)

{
  _func_3075 *UNRECOVERED_JUMPTABLE;
  ssl_method_st *psVar1;
  
  UNRECOVERED_JUMPTABLE = s->method->get_ssl_method;
                    /* WARNING: Could not recover jumptable at 0x009b45cc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  psVar1 = (*UNRECOVERED_JUMPTABLE)((int)UNRECOVERED_JUMPTABLE);
  return (long)psVar1;
}

