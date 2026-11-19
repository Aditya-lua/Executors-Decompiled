/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d38dc
 */

undefined8 tls_construct_ctos_cookie(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  if (*(long *)(param_1 + 0xb40) == 0) {
    uVar2 = 2;
  }
  else {
    iVar1 = WPACKET_put_bytes__(param_2,0x2c,2);
    if ((((iVar1 == 0) || (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 == 0)) ||
        (iVar1 = WPACKET_sub_memcpy__
                           (param_2,*(undefined8 *)(param_1 + 0xb38),
                            *(undefined8 *)(param_1 + 0xb40),2), iVar1 == 0)) ||
       (iVar1 = WPACKET_close(param_2), iVar1 == 0)) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x2d6,"tls_construct_ctos_cookie");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      uVar2 = 0;
    }
    else {
      uVar2 = 1;
    }
    CRYPTO_free(*(void **)(param_1 + 0xb38));
    *(undefined8 *)(param_1 + 0xb40) = 0;
    *(undefined8 *)(param_1 + 0xb38) = 0;
  }
  return uVar2;
}

