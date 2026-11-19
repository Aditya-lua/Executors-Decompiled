/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ebbc4
 */

undefined4 tls_post_process_client_key_exchange(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  undefined4 uVar3;
  
  if ((*(int *)(param_1 + 0x74) == 0) && (*(long *)(*(long *)(param_1 + 0x918) + 0x2b8) != 0)) {
    if (*(long *)(param_1 + 0x188) == 0) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_srvr.c",0xd43,"tls_post_process_client_key_exchange");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      return 0;
    }
    uVar2 = 1;
  }
  else {
    uVar2 = 0;
  }
  iVar1 = ssl3_digest_cached_records(param_1,uVar2);
  uVar3 = 0;
  if (iVar1 != 0) {
    uVar3 = 2;
  }
  return uVar3;
}

