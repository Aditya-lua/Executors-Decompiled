/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a142b8
 */

ulong SCT_validate(int *param_1,undefined8 *param_2)

{
  int iVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  EVP_PKEY *pEVar5;
  ulong uVar6;
  X509_PUBKEY *local_40;
  X509_PUBKEY *local_38;
  
  local_40 = (X509_PUBKEY *)0x0;
  local_38 = (X509_PUBKEY *)0x0;
  if (*param_1 != 0) {
    iVar1 = 5;
LAB_00a142e0:
    param_1[0x18] = iVar1;
    return 0;
  }
  lVar3 = CTLOG_STORE_get0_log_by_id
                    (param_2[2],*(undefined8 *)(param_1 + 6),*(undefined8 *)(param_1 + 8));
  if (lVar3 == 0) {
    iVar1 = 1;
    goto LAB_00a142e0;
  }
  lVar4 = SCT_CTX_new(param_2[4],param_2[5]);
  if (lVar4 != 0) {
    pEVar5 = (EVP_PKEY *)CTLOG_get0_public_key(lVar3);
    iVar1 = X509_PUBKEY_set(&local_40,pEVar5);
    if ((iVar1 == 1) && (iVar1 = SCT_CTX_set1_pubkey(lVar4,local_40), iVar1 == 1)) {
      if (param_1[0x16] == 1) {
        if (param_2[1] != 0) {
          pEVar5 = (EVP_PKEY *)X509_get0_pubkey();
          iVar1 = X509_PUBKEY_set(&local_38,pEVar5);
          if ((iVar1 != 1) || (iVar1 = SCT_CTX_set1_issuer_pubkey(lVar4,local_38), iVar1 != 1))
          goto LAB_00a143c8;
          goto LAB_00a14384;
        }
LAB_00a14404:
        uVar6 = 0;
        iVar1 = 4;
      }
      else {
LAB_00a14384:
        SCT_CTX_set_time(lVar4,param_2[3]);
        iVar1 = SCT_CTX_set1_cert(lVar4,*param_2,0);
        if (iVar1 != 1) goto LAB_00a14404;
        iVar2 = SCT_CTX_verify(lVar4,param_1);
        uVar6 = (ulong)(iVar2 == 1);
        iVar1 = 2;
        if (iVar2 != 1) {
          iVar1 = 3;
        }
      }
      param_1[0x18] = iVar1;
      goto LAB_00a143cc;
    }
  }
LAB_00a143c8:
  uVar6 = 0xffffffff;
LAB_00a143cc:
  X509_PUBKEY_free(local_38);
  X509_PUBKEY_free(local_40);
  SCT_CTX_free(lVar4);
  return uVar6;
}

