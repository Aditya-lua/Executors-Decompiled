/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0d68c
 */

int CONF_dump_bio(lhash_st_CONF_VALUE *conf,BIO *out)

{
  int iVar1;
  CONF local_60 [2];
  
  if (DAT_00d21950 == (CONF_METHOD *)0x0) {
    DAT_00d21950 = NCONF_default();
  }
  (*DAT_00d21950->init)(local_60);
  local_60[0].data = conf;
  iVar1 = (*(local_60[0].meth)->dump)(local_60,out);
  return iVar1;
}

