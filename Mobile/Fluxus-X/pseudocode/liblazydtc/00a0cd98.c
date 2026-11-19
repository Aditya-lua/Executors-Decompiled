/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0cd98
 */

lhash_st_CONF_VALUE * CONF_load(lhash_st_CONF_VALUE *conf,char *file,long *eline)

{
  int iVar1;
  BIO *bp;
  lhash_st_CONF_VALUE *plVar2;
  CONF local_60 [2];
  
  bp = BIO_new_file(file,"rb");
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/conf/conf_lib.c",0x3a,"CONF_load");
    ERR_set_error(0xe,0x80002,0);
    plVar2 = (lhash_st_CONF_VALUE *)0x0;
  }
  else {
    if (DAT_00d21950 == (CONF_METHOD *)0x0) {
      DAT_00d21950 = NCONF_default();
    }
    (*DAT_00d21950->init)(local_60);
    local_60[0].data = conf;
    iVar1 = (*(local_60[0].meth)->load_bio)(local_60,bp,eline);
    plVar2 = (lhash_st_CONF_VALUE *)0x0;
    if (iVar1 != 0) {
      plVar2 = local_60[0].data;
    }
    BIO_free(bp);
  }
  return plVar2;
}

