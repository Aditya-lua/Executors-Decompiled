/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0ce70
 */

lhash_st_CONF_VALUE * CONF_load_bio(lhash_st_CONF_VALUE *conf,BIO *bp,long *eline)

{
  lhash_st_CONF_VALUE *plVar1;
  int iVar2;
  CONF local_60 [2];
  
  if (DAT_00d21950 == (CONF_METHOD *)0x0) {
    DAT_00d21950 = NCONF_default();
  }
  (*DAT_00d21950->init)(local_60);
  local_60[0].data = conf;
  iVar2 = (*(local_60[0].meth)->load_bio)(local_60,bp,eline);
  plVar1 = (lhash_st_CONF_VALUE *)0x0;
  if (iVar2 != 0) {
    plVar1 = local_60[0].data;
  }
  return plVar1;
}

