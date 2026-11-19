/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e0870
 */

undefined8 ssl3_check_cert_and_algorithm(long param_1)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 uVar6;
  long local_28;
  
  uVar1 = *(uint *)(*(long *)(param_1 + 0x2e0) + 0x20);
  if ((uVar1 & 0xab) == 0) {
LAB_009e0980:
    uVar4 = 1;
  }
  else {
    uVar2 = *(uint *)(*(long *)(param_1 + 0x2e0) + 0x1c);
    uVar4 = X509_get0_pubkey(*(undefined8 *)(*(long *)(param_1 + 0x918) + 0x2b8));
    lVar5 = ssl_cert_lookup_by_pkey(uVar4,&local_28);
    if ((lVar5 == 0) || ((*(uint *)(lVar5 + 4) & uVar1) == 0)) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_clnt.c",0xde4,"ssl3_check_cert_and_algorithm");
      uVar4 = 0x28;
      uVar6 = 0xdd;
    }
    else if ((*(uint *)(lVar5 + 4) >> 3 & 1) == 0) {
      if (((uVar2 & 0x41) == 0) || (local_28 == 0)) {
        if (((uVar2 >> 1 & 1) == 0) || (*(long *)(param_1 + 0x4b0) != 0)) goto LAB_009e0980;
        ERR_new();
        ERR_set_debug("ssl/statem/statem_clnt.c",0xdf6,"ssl3_check_cert_and_algorithm");
        uVar4 = 0x50;
        uVar6 = 0xc0103;
      }
      else {
        ERR_new();
        ERR_set_debug("ssl/statem/statem_clnt.c",0xdf1,"ssl3_check_cert_and_algorithm");
        uVar4 = 0x28;
        uVar6 = 0xa9;
      }
    }
    else {
      iVar3 = ssl_check_srvr_ecc_cert_and_alg
                        (*(undefined8 *)(*(long *)(param_1 + 0x918) + 0x2b8),param_1);
      if (iVar3 != 0) goto LAB_009e0980;
      ERR_new();
      ERR_set_debug("ssl/statem/statem_clnt.c",0xdeb,"ssl3_check_cert_and_algorithm");
      uVar4 = 0x28;
      uVar6 = 0x130;
    }
    ossl_statem_fatal(param_1,uVar4,uVar6,0);
    uVar4 = 0;
  }
  return uVar4;
}

