/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0d55c
 */

void CONF_free(lhash_st_CONF_VALUE *conf)

{
  CONF local_50 [2];
  
  if (DAT_00d21950 == (CONF_METHOD *)0x0) {
    DAT_00d21950 = NCONF_default();
  }
  (*DAT_00d21950->init)(local_50);
  local_50[0].data = conf;
  (*(local_50[0].meth)->destroy_data)(local_50);
  return;
}

