/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0fb88
 */

void _CONF_free_data(CONF *conf)

{
  if (conf != (CONF *)0x0) {
    CRYPTO_free(conf[1].meth_data);
    if (conf->data != (lhash_st_CONF_VALUE *)0x0) {
      OPENSSL_LH_set_down_load(conf->data,0);
      OPENSSL_LH_doall_arg(conf->data,&LAB_00a0fc00,conf->data);
      OPENSSL_LH_doall(conf->data,&LAB_00a0fc1c);
      OPENSSL_LH_free(conf->data);
      return;
    }
  }
  return;
}

