/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be6ac
 */

undefined8 SSL_SESSION_set1_id(long param_1,void *param_2,uint param_3)

{
  if (0x20 < param_3) {
    ERR_new();
    ERR_set_debug("ssl/ssl_sess.c",0x390,"SSL_SESSION_set1_id");
    ERR_set_error(0x14,0x198,0);
    return 0;
  }
  *(ulong *)(param_1 + 0x250) = (ulong)param_3;
  if ((void *)(param_1 + 600) != param_2) {
    memcpy((void *)(param_1 + 600),param_2,(ulong)param_3);
  }
  return 1;
}

