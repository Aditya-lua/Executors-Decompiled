/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e3318
 */

undefined8 FUN_009e3318(long param_1,undefined8 *param_2,undefined8 *param_3,long *param_4)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  char *pcVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  long local_38;
  
  if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
      (iVar1 = **(int **)(param_1 + 8), 0x303 < iVar1)) && (iVar1 != 0x10000)) {
    param_2[6] = 0x2020202020202020;
    param_2[7] = 0x2020202020202020;
    param_2[4] = 0x2020202020202020;
    param_2[5] = 0x2020202020202020;
    param_2[2] = 0x2020202020202020;
    param_2[3] = 0x2020202020202020;
    *param_2 = 0x2020202020202020;
    param_2[1] = 0x2020202020202020;
    if (*(int *)(param_1 + 0x5c) - 0x27U < 2) {
      pcVar4 = "TLS 1.3, server CertificateVerify";
    }
    else {
      pcVar4 = "TLS 1.3, client CertificateVerify";
    }
    uVar7 = *(undefined8 *)(pcVar4 + 8);
    uVar6 = *(undefined8 *)pcVar4;
    uVar5 = *(undefined8 *)(pcVar4 + 0x18);
    uVar3 = *(undefined8 *)(pcVar4 + 0x10);
    *(undefined2 *)(param_2 + 0xc) = 0x79;
    param_2[9] = uVar7;
    param_2[8] = uVar6;
    param_2[0xb] = uVar5;
    param_2[10] = uVar3;
    if ((*(int *)(param_1 + 0x5c) == 0x27) || (*(int *)(param_1 + 0x5c) == 0x1d)) {
      memcpy((void *)((long)param_2 + 0x62),(void *)(param_1 + 0x8a0),*(size_t *)(param_1 + 0x8e0));
      local_38 = *(long *)(param_1 + 0x8e0);
    }
    else {
      uVar3 = ssl_handshake_hash(param_1,(long)param_2 + 0x62,0x40,&local_38);
      if ((int)uVar3 == 0) {
        return uVar3;
      }
    }
    *param_3 = param_2;
    *param_4 = local_38 + 0x62;
  }
  else {
    lVar2 = BIO_ctrl(*(BIO **)(param_1 + 0x188),3,0,param_3);
    if (lVar2 < 1) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_lib.c",0x108,"get_cert_verify_tbs_data");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      return 0;
    }
    *param_4 = lVar2;
  }
  return 1;
}

