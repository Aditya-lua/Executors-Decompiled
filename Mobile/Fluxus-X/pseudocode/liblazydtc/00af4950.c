/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4950
 */

char * X509V3_get_string(X509V3_CTX *ctx,char *name,char *section)

{
  char *pcVar1;
  _func_4287 *UNRECOVERED_JUMPTABLE;
  
  if (((ctx->db == (void *)0x0) || (ctx->db_meth == (X509V3_CONF_METHOD *)0x0)) ||
     (UNRECOVERED_JUMPTABLE = ctx->db_meth->get_string, UNRECOVERED_JUMPTABLE == (_func_4287 *)0x0))
  {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_conf.c",0x180,"X509V3_get_string");
    ERR_set_error(0x22,0x94,0);
    return (char *)0x0;
  }
                    /* WARNING: Could not recover jumptable at 0x00af496c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  pcVar1 = (*UNRECOVERED_JUMPTABLE)(ctx->db,name,section);
  return pcVar1;
}

