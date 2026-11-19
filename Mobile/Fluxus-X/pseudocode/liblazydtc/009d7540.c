/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d7540
 */

undefined8 tls_parse_ctos_use_srtp(SSL *param_1,long *param_2)

{
  byte bVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  int iVar4;
  stack_st_SRTP_PROTECTION_PROFILE *psVar5;
  EVP_MD_CTX *pEVar6;
  undefined8 uVar7;
  byte *pbVar8;
  ulong uVar9;
  undefined1 *puVar10;
  int iVar11;
  ulong uVar12;
  undefined1 *puVar13;
  
  psVar5 = SSL_get_srtp_profiles(param_1);
  if (psVar5 == (stack_st_SRTP_PROTECTION_PROFILE *)0x0) {
    return 1;
  }
  uVar9 = param_2[1] - 2;
  if ((ulong)param_2[1] < 2) {
LAB_009d7598:
    ERR_new();
    uVar7 = 0x1dc;
  }
  else {
    puVar10 = (undefined1 *)*param_2;
    bVar1 = puVar10[1];
    uVar2 = *puVar10;
    puVar10 = puVar10 + 2;
    *param_2 = (long)puVar10;
    param_2[1] = uVar9;
    if ((bVar1 & 1) != 0) goto LAB_009d7598;
    uVar12 = (ulong)CONCAT11(uVar2,bVar1);
    if (uVar9 < uVar12) goto LAB_009d7598;
    *param_2 = (long)(puVar10 + uVar12);
    param_2[1] = uVar9 - uVar12;
    psVar5 = SSL_get_srtp_profiles(param_1);
    param_1[4].read_hash = (EVP_MD_CTX *)0x0;
    iVar4 = OPENSSL_sk_num();
LAB_009d75fc:
    puVar13 = puVar10;
    if (uVar12 != 0) {
      if (uVar12 == 1) {
        ERR_new();
        uVar7 = 0x1e8;
        goto LAB_009d75b0;
      }
      puVar10 = puVar13 + 2;
      uVar12 = uVar12 - 2;
      if (0 < iVar4) {
        uVar2 = *puVar13;
        uVar3 = puVar13[1];
        iVar11 = 0;
        do {
          pEVar6 = (EVP_MD_CTX *)OPENSSL_sk_value(psVar5,iVar11);
          if (pEVar6->engine == (ENGINE *)(ulong)CONCAT11(uVar2,uVar3)) {
            param_1[4].read_hash = pEVar6;
            iVar4 = iVar11;
            break;
          }
          iVar11 = iVar11 + 1;
        } while (iVar11 < iVar4);
      }
      goto LAB_009d75fc;
    }
    if (param_2[1] != 0) {
      uVar12 = param_2[1] - 1;
      pbVar8 = (byte *)*param_2 + 1;
      uVar9 = (ulong)*(byte *)*param_2;
      *param_2 = (long)pbVar8;
      param_2[1] = uVar12;
      if (uVar9 <= uVar12) {
        *param_2 = (long)(pbVar8 + uVar9);
        param_2[1] = uVar12 - uVar9;
        if (uVar12 - uVar9 == 0) {
          return 1;
        }
      }
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_srvr.c",0x207,"tls_parse_ctos_use_srtp");
      uVar7 = 0x160;
      goto LAB_009d75bc;
    }
    ERR_new();
    uVar7 = 0x201;
  }
LAB_009d75b0:
  ERR_set_debug("ssl/statem/extensions_srvr.c",uVar7,"tls_parse_ctos_use_srtp");
  uVar7 = 0x161;
LAB_009d75bc:
  ossl_statem_fatal(param_1,0x32,uVar7,0);
  return 0;
}

