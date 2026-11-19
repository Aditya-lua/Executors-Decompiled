/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0ccd0
 */

void FUN_00a0ccd0(void)

{
  bool bVar1;
  
  DAT_00d21928 = CRYPTO_THREAD_lock_new();
  bVar1 = DAT_00d21928 == 0;
  if (bVar1) {
    ERR_new();
    ERR_set_debug("crypto/conf/conf_mod.c",0x67,"do_init_module_list_lock");
    ERR_set_error(0xe,0xc0100,0);
  }
  DAT_00d21944 = (uint)!bVar1;
  return;
}

