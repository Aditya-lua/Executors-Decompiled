/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4c84
 */

void X509V3_set_conf_lhash(X509V3_CTX *ctx,lhash_st_CONF_VALUE *lhash)

{
  if (ctx == (X509V3_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_conf.c",0x212,"X509V3_set_conf_lhash");
    ERR_set_error(0x22,0xc0102,0);
    return;
  }
  ctx->db_meth = (X509V3_CONF_METHOD *)&PTR_LAB_00cc95b0;
  ctx->db = lhash;
  return;
}

