/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d90c4
 */

undefined8
tls_construct_stoc_status_request
          (long param_1,undefined8 param_2,int param_3,undefined8 param_4,long param_5)

{
  int iVar1;
  undefined8 uVar2;
  
  if (((param_3 == 0x4000) || (*(int *)(param_1 + 0xa74) == 0)) ||
     (((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0 &&
      (((iVar1 = **(int **)(param_1 + 8), 0x303 < iVar1 && (param_5 != 0)) && (iVar1 != 0x10000)))))
     ) {
    uVar2 = 2;
  }
  else {
    iVar1 = WPACKET_put_bytes__(param_2,5,2);
    if ((iVar1 == 0) || (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 == 0)) {
      ERR_new();
      uVar2 = 0x595;
    }
    else {
      if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
          (iVar1 = **(int **)(param_1 + 8), 0x303 < iVar1)) &&
         ((iVar1 != 0x10000 &&
          (uVar2 = tls_construct_cert_status_body(param_1,param_2), (int)uVar2 == 0)))) {
        return uVar2;
      }
      iVar1 = WPACKET_close(param_2);
      if (iVar1 != 0) {
        return 1;
      }
      ERR_new();
      uVar2 = 0x5a3;
    }
    ERR_set_debug("ssl/statem/extensions_srvr.c",uVar2,"tls_construct_stoc_status_request");
    ossl_statem_fatal(param_1,0x50,0xc0103,0);
    uVar2 = 0;
  }
  return uVar2;
}

