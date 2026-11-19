/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d503c
 */

undefined8 tls_parse_stoc_use_srtp(SSL *param_1,long *param_2)

{
  undefined1 uVar1;
  undefined1 uVar2;
  char cVar3;
  int iVar4;
  int iVar5;
  stack_st_SRTP_PROTECTION_PROFILE *psVar6;
  EVP_MD_CTX *pEVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  ulong uVar10;
  undefined1 *puVar11;
  
  uVar10 = param_2[1];
  if (uVar10 < 2) {
LAB_009d50b4:
    ERR_new();
    uVar8 = 0x66a;
  }
  else {
    puVar11 = (undefined1 *)*param_2;
    uVar1 = *puVar11;
    uVar2 = puVar11[1];
    *param_2 = (long)(puVar11 + 2);
    param_2[1] = uVar10 - 2;
    if ((CONCAT11(uVar1,uVar2) != 2) || (uVar10 - 2 < 2)) goto LAB_009d50b4;
    uVar1 = puVar11[2];
    uVar2 = puVar11[3];
    *param_2 = (long)(puVar11 + 4);
    param_2[1] = uVar10 - 4;
    if (uVar10 - 4 == 0) goto LAB_009d50b4;
    cVar3 = puVar11[4];
    *param_2 = (long)(puVar11 + 5);
    param_2[1] = uVar10 - 5;
    if (uVar10 - 5 != 0) goto LAB_009d50b4;
    if (cVar3 != '\0') {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x670,"tls_parse_stoc_use_srtp");
      uVar8 = 0x2f;
      uVar9 = 0x160;
      goto LAB_009d50d8;
    }
    psVar6 = SSL_get_srtp_profiles(param_1);
    if (psVar6 == (stack_st_SRTP_PROTECTION_PROFILE *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/statem/extensions_clnt.c",0x677,"tls_parse_stoc_use_srtp");
      uVar8 = 0x32;
      uVar9 = 0x167;
      goto LAB_009d50d8;
    }
    iVar4 = OPENSSL_sk_num();
    if (0 < iVar4) {
      iVar4 = 0;
      do {
        pEVar7 = (EVP_MD_CTX *)OPENSSL_sk_value(psVar6,iVar4);
        if (pEVar7->engine == (ENGINE *)(ulong)CONCAT11(uVar1,uVar2)) {
          param_1[4].read_hash = pEVar7;
          return 1;
        }
        iVar4 = iVar4 + 1;
        iVar5 = OPENSSL_sk_num(psVar6);
      } while (iVar4 < iVar5);
    }
    ERR_new();
    uVar8 = 0x689;
  }
  ERR_set_debug("ssl/statem/extensions_clnt.c",uVar8,"tls_parse_stoc_use_srtp");
  uVar8 = 0x32;
  uVar9 = 0x161;
LAB_009d50d8:
  ossl_statem_fatal(param_1,uVar8,uVar9,0);
  return 0;
}

