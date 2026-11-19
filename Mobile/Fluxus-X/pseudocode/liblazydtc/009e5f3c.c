/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e5f3c
 */

undefined8 construct_ca_names(long param_1,long param_2,undefined8 param_3)

{
  int iVar1;
  int iVar2;
  int iVar3;
  X509_NAME *a;
  undefined8 uVar4;
  uchar *puStack_48;
  
  iVar1 = WPACKET_start_sub_packet_len__(param_3,2);
  if (iVar1 == 0) {
    ERR_new();
    uVar4 = 0x90e;
  }
  else {
    if (((param_2 != 0) && ((*(byte *)(param_1 + 0x9e9) >> 1 & 1) == 0)) &&
       (iVar1 = OPENSSL_sk_num(param_2), 0 < iVar1)) {
      iVar1 = 0;
      do {
        a = (X509_NAME *)OPENSSL_sk_value(param_2,iVar1);
        if (((a == (X509_NAME *)0x0) || (iVar2 = i2d_X509_NAME(a,(uchar **)0x0), iVar2 < 0)) ||
           ((iVar3 = WPACKET_sub_allocate_bytes__(param_3,(long)iVar2,&puStack_48,2), iVar3 == 0 ||
            (iVar3 = i2d_X509_NAME(a,&puStack_48), iVar3 != iVar2)))) {
          ERR_new();
          uVar4 = 0x91f;
          goto LAB_009e6058;
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(param_2);
      } while (iVar1 < iVar2);
    }
    iVar1 = WPACKET_close(param_3);
    if (iVar1 != 0) {
      return 1;
    }
    ERR_new();
    uVar4 = 0x926;
  }
LAB_009e6058:
  ERR_set_debug("ssl/statem/statem_lib.c",uVar4,"construct_ca_names");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
  return 0;
}

