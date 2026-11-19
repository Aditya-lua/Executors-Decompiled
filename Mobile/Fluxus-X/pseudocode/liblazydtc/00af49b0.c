/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af49b0
 */

stack_st_CONF_VALUE * X509V3_get_section(X509V3_CTX *ctx,char *section)

{
  stack_st_CONF_VALUE *psVar1;
  _func_4288 *UNRECOVERED_JUMPTABLE;
  
  if (((ctx->db == (void *)0x0) || (ctx->db_meth == (X509V3_CONF_METHOD *)0x0)) ||
     (UNRECOVERED_JUMPTABLE = ctx->db_meth->get_section, UNRECOVERED_JUMPTABLE == (_func_4288 *)0x0)
     ) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_conf.c",0x18b,"X509V3_get_section");
    ERR_set_error(0x22,0x94,0);
    return (stack_st_CONF_VALUE *)0x0;
  }
                    /* WARNING: Could not recover jumptable at 0x00af49cc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  psVar1 = (*UNRECOVERED_JUMPTABLE)(ctx->db,section);
  return psVar1;
}

