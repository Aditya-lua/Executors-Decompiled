/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4a2c
 */

void X509V3_section_free(X509V3_CTX *ctx,stack_st_CONF_VALUE *section)

{
  _func_4290 *UNRECOVERED_JUMPTABLE;
  
  if ((section == (stack_st_CONF_VALUE *)0x0) ||
     (UNRECOVERED_JUMPTABLE = ctx->db_meth->free_section, UNRECOVERED_JUMPTABLE == (_func_4290 *)0x0
     )) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00af4a40. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(ctx->db,section);
  return;
}

