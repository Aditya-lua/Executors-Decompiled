/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b602e8
 */

undefined8 FUN_00b602e8(undefined8 *param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  undefined8 uVar5;
  char *pcVar6;
  
  if (param_3 == 0) {
    param_3 = param_1[1];
  }
  lVar3 = EVP_MD_fetch(*param_1,param_2,param_3);
  if (lVar3 == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x166,"rsa_setup_mgf1_md");
    ERR_set_error(0x39,0x7a,"%s could not be fetched",param_2);
    return 0;
  }
  iVar1 = ossl_digest_rsa_sign_get_md_nid(*param_1,lVar3,1);
  if (iVar1 < 1) {
    ERR_new();
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x16e,"rsa_setup_mgf1_md");
    pcVar6 = "digest=%s";
    uVar5 = 0xae;
  }
  else {
    iVar2 = FUN_00b60684(param_1,0,param_2,iVar1);
    if (iVar2 == 0) goto LAB_00b60404;
    uVar4 = OPENSSL_strlcpy((long)param_1 + 0x7c,param_2,0x32);
    if (uVar4 < 0x32) {
      EVP_MD_free(param_1[0xe]);
      param_1[0xe] = lVar3;
      *(int *)(param_1 + 0xf) = iVar1;
      *(byte *)((long)param_1 + 0x1c) = *(byte *)((long)param_1 + 0x1c) | 2;
      return 1;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x175,"rsa_setup_mgf1_md");
    pcVar6 = "%s exceeds name buffer length";
    uVar5 = 0x7a;
  }
  ERR_set_error(0x39,uVar5,pcVar6,param_2);
LAB_00b60404:
  EVP_MD_free(lVar3);
  return 0;
}

