/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0cd34
 */

void CONF_set_nconf(CONF *conf,lhash_st_CONF_VALUE *hash)

{
  if (DAT_00d21950 == (CONF_METHOD *)0x0) {
    DAT_00d21950 = NCONF_default();
  }
  (*DAT_00d21950->init)(conf);
  conf->data = hash;
  return;
}

