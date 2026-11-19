/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009dbb44
 */

undefined8 tls_client_key_exchange_post_work(long param_1)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  
  lVar4 = *(long *)(param_1 + 0x360);
  uVar3 = *(undefined8 *)(param_1 + 0x368);
  uVar1 = *(uint *)(*(long *)(param_1 + 0x2e0) + 0x1c);
  if ((uVar1 >> 5 & 1) == 0) {
    if ((lVar4 == 0) && ((uVar1 >> 3 & 1) == 0)) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_clnt.c",0xd18,"tls_client_key_exchange_post_work");
      ossl_statem_fatal(param_1,0x50,0xc0100,0);
      lVar4 = 0;
    }
    else {
      iVar2 = ssl_generate_master_secret(param_1,lVar4,uVar3,1);
      if (iVar2 != 0) {
        return 1;
      }
      lVar4 = 0;
      uVar3 = 0;
    }
  }
  else {
    iVar2 = srp_generate_client_master_secret(param_1);
    if (iVar2 != 0) {
      return 1;
    }
  }
  CRYPTO_clear_free(lVar4,uVar3,"ssl/statem/statem_clnt.c",0xd45);
  *(undefined8 *)(param_1 + 0x360) = 0;
  *(undefined8 *)(param_1 + 0x368) = 0;
  return 0;
}

