/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d2cc0
 */

undefined8
tls_construct_ctos_status_request(long param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  int iVar1;
  int iVar2;
  int iVar3;
  OCSP_RESPID *a;
  undefined8 uVar4;
  uchar *puStack_38;
  
  if ((param_4 != 0) || (*(int *)(param_1 + 0xa60) != 1)) {
    return 2;
  }
  iVar1 = WPACKET_put_bytes__(param_2,5,2);
  if ((((iVar1 == 0) || (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 == 0)) ||
      (iVar1 = WPACKET_put_bytes__(param_2,1,1), iVar1 == 0)) ||
     (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 == 0)) {
    ERR_new();
    uVar4 = 0x155;
  }
  else {
    iVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0xa78));
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        a = (OCSP_RESPID *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0xa78),iVar1);
        iVar2 = i2d_OCSP_RESPID(a,(uchar **)0x0);
        if (((iVar2 < 1) ||
            (iVar3 = WPACKET_sub_allocate_bytes__(param_2,(long)iVar2,&puStack_38,2), iVar3 == 0))
           || (iVar3 = i2d_OCSP_RESPID(a,&puStack_38), iVar3 != iVar2)) {
          ERR_new();
          uVar4 = 0x161;
          goto LAB_009d2e58;
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0xa78));
      } while (iVar1 < iVar2);
    }
    iVar1 = WPACKET_close(param_2);
    if ((iVar1 == 0) || (iVar1 = WPACKET_start_sub_packet_len__(param_2,2), iVar1 == 0)) {
      ERR_new();
      uVar4 = 0x167;
    }
    else {
      if (*(X509_EXTENSIONS **)(param_1 + 0xa80) != (X509_EXTENSIONS *)0x0) {
        iVar1 = i2d_X509_EXTENSIONS(*(X509_EXTENSIONS **)(param_1 + 0xa80),(uchar **)0x0);
        if (iVar1 < 0) {
          ERR_new();
          uVar4 = 0x16f;
          goto LAB_009d2e58;
        }
        iVar2 = WPACKET_allocate_bytes(param_2,(long)iVar1,&puStack_38);
        if ((iVar2 == 0) ||
           (iVar2 = i2d_X509_EXTENSIONS(*(X509_EXTENSIONS **)(param_1 + 0xa80),&puStack_38),
           iVar2 != iVar1)) {
          ERR_new();
          uVar4 = 0x175;
          goto LAB_009d2e58;
        }
      }
      iVar1 = WPACKET_close(param_2);
      if ((iVar1 != 0) && (iVar1 = WPACKET_close(param_2), iVar1 != 0)) {
        return 1;
      }
      ERR_new();
      uVar4 = 0x17a;
    }
  }
LAB_009d2e58:
  ERR_set_debug("ssl/statem/extensions_clnt.c",uVar4,"tls_construct_ctos_status_request");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
  return 0;
}

