/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0da48
 */

int NCONF_dump_fp(CONF *conf,FILE *out)

{
  int iVar1;
  BIO *bp;
  
  bp = BIO_new_fp(out,0);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/conf/conf_lib.c",0x182,"NCONF_dump_fp");
    ERR_set_error(0xe,0x80007,0);
    iVar1 = 0;
  }
  else {
    if (conf == (CONF *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/conf/conf_lib.c",0x18e,"NCONF_dump_bio");
      ERR_set_error(0xe,0x69,0);
      iVar1 = 0;
    }
    else {
      iVar1 = (*conf->meth->dump)(conf,bp);
    }
    BIO_free(bp);
  }
  return iVar1;
}

