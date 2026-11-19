/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0d5cc
 */

int CONF_dump_fp(lhash_st_CONF_VALUE *conf,FILE *out)

{
  int iVar1;
  BIO *bp;
  CONF local_60 [2];
  
  bp = BIO_new_fp(out,0);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/conf/conf_lib.c",0x9d,"CONF_dump_fp");
    ERR_set_error(0xe,0x80007,0);
    iVar1 = 0;
  }
  else {
    if (DAT_00d21950 == (CONF_METHOD *)0x0) {
      DAT_00d21950 = NCONF_default();
    }
    (*DAT_00d21950->init)(local_60);
    local_60[0].data = conf;
    iVar1 = (*(local_60[0].meth)->dump)(local_60,bp);
    BIO_free(bp);
  }
  return iVar1;
}

