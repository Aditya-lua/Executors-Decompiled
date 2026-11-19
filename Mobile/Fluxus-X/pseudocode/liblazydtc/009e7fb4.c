/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e7fb4
 */

undefined8 tls_construct_certificate_request(long param_1,undefined8 param_2)

{
  int iVar1;
  void *pvVar2;
  undefined8 uVar3;
  undefined8 local_28;
  
  if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
      (iVar1 = **(int **)(param_1 + 8), 0x303 < iVar1)) && (iVar1 != 0x10000)) {
    if (*(int *)(param_1 + 0xba8) == 3) {
      CRYPTO_free(*(void **)(param_1 + 0xbb0));
      *(undefined8 *)(param_1 + 3000) = 0x20;
      pvVar2 = CRYPTO_malloc(0x20,"ssl/statem/statem_srvr.c",0xaae);
      *(void **)(param_1 + 0xbb0) = pvVar2;
      if (pvVar2 == (void *)0x0) {
        *(undefined8 *)(param_1 + 3000) = 0;
        ERR_new();
        uVar3 = 0xab0;
LAB_009e80f0:
        ERR_set_debug("ssl/statem/statem_srvr.c",uVar3,"tls_construct_certificate_request");
        ossl_statem_fatal(param_1,0x50,0xc0103,0);
        return 0;
      }
      iVar1 = RAND_bytes_ex(**(undefined8 **)(param_1 + 0x9a8),pvVar2,
                            *(undefined8 *)(param_1 + 3000),0);
      if ((iVar1 < 1) ||
         (iVar1 = WPACKET_sub_memcpy__
                            (param_2,*(undefined8 *)(param_1 + 0xbb0),
                             *(undefined8 *)(param_1 + 3000),1), iVar1 == 0)) {
        ERR_new();
        uVar3 = 0xab7;
        goto LAB_009e80f0;
      }
      uVar3 = tls13_restore_handshake_digest_for_pha(param_1);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
    }
    else {
      iVar1 = WPACKET_put_bytes__(param_2,0,1);
      if (iVar1 == 0) {
        ERR_new();
        uVar3 = 0xac1;
        goto LAB_009e80f0;
      }
    }
    uVar3 = tls_construct_extensions(param_1,param_2,0x4000,0,0);
    iVar1 = (int)uVar3;
  }
  else {
    iVar1 = WPACKET_start_sub_packet_len__(param_2,1);
    if (((iVar1 == 0) || (iVar1 = ssl3_get_req_cert_type(param_1,param_2), iVar1 == 0)) ||
       (iVar1 = WPACKET_close(param_2), iVar1 == 0)) {
      ERR_new();
      uVar3 = 0xad2;
      goto LAB_009e80f0;
    }
    if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 1 & 1) != 0) {
      uVar3 = tls12_get_psigalgs(param_1,1,&local_28);
      iVar1 = WPACKET_start_sub_packet_len__(param_2,2);
      if (((iVar1 == 0) || (iVar1 = WPACKET_set_flags(param_2,1), iVar1 == 0)) ||
         ((iVar1 = tls12_copy_sigalgs(param_1,param_2,local_28,uVar3), iVar1 == 0 ||
          (iVar1 = WPACKET_close(param_2), iVar1 == 0)))) {
        ERR_new();
        uVar3 = 0xade;
        goto LAB_009e80f0;
      }
    }
    uVar3 = get_ca_names(param_1);
    uVar3 = construct_ca_names(param_1,uVar3,param_2);
    iVar1 = (int)uVar3;
  }
  if (iVar1 == 0) {
    return uVar3;
  }
  *(undefined4 *)(param_1 + 0x348) = 1;
  *(int *)(param_1 + 0xbc0) = *(int *)(param_1 + 0xbc0) + 1;
  return 1;
}

