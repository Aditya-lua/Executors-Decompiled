/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4a10
 */

void X509V3_string_free(X509V3_CTX *ctx,char *str)

{
  _func_4289 *UNRECOVERED_JUMPTABLE;
  
  if ((str == (char *)0x0) ||
     (UNRECOVERED_JUMPTABLE = ctx->db_meth->free_string, UNRECOVERED_JUMPTABLE == (_func_4289 *)0x0)
     ) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00af4a24. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(ctx->db,str);
  return;
}

