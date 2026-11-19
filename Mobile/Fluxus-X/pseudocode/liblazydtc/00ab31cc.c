/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab31cc
 */

ulong FUN_00ab31cc(X509 *param_1,undefined8 *param_2,undefined8 param_3)

{
  int iVar1;
  int iVar2;
  EVP_MD *type;
  X509_NAME *data;
  undefined8 *puVar3;
  undefined8 uVar4;
  ulong uVar5;
  uchar auStack_a4 [64];
  char acStack_64 [52];
  
  if (param_2 == (undefined8 *)0x0) {
    iVar1 = OPENSSL_sk_num(param_3);
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        puVar3 = (undefined8 *)OPENSSL_sk_value(param_3,iVar1);
        uVar5 = FUN_00ab31cc(param_1,*puVar3,0);
        if ((int)uVar5 < 1) {
          return uVar5;
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(param_3);
      } while (iVar1 < iVar2);
    }
    return 1;
  }
  OBJ_obj2txt(acStack_64,0x32,(ASN1_OBJECT *)*param_2,0);
  ERR_set_mark();
  type = (EVP_MD *)EVP_MD_fetch(0,acStack_64,0);
  if ((type == (EVP_MD *)0x0) && (type = EVP_get_digestbyname(acStack_64), type == (EVP_MD *)0x0)) {
    ERR_clear_last_mark();
    ERR_new();
    ERR_set_debug("crypto/ocsp/ocsp_vfy.c",0x145,"ocsp_match_issuerid");
    uVar4 = 0x77;
LAB_00ab333c:
    ERR_set_error(0x27,uVar4,0);
  }
  else {
    ERR_pop_to_mark();
    iVar1 = EVP_MD_get_size(type);
    if (iVar1 < 0) {
      ERR_new();
      ERR_set_debug("crypto/ocsp/ocsp_vfy.c",0x14c,"ocsp_match_issuerid");
      uVar4 = 0x6b;
      goto LAB_00ab333c;
    }
    if ((*(int *)(param_2 + 2) != iVar1) || (*(int *)(param_2 + 5) != iVar1)) {
LAB_00ab328c:
      uVar5 = 0;
      goto LAB_00ab3348;
    }
    data = X509_get_subject_name(param_1);
    iVar2 = X509_NAME_digest(data,type,auStack_a4,(uint *)0x0);
    if (iVar2 != 0) {
      iVar2 = memcmp(auStack_a4,(void *)param_2[3],(long)iVar1);
      if (iVar2 == 0) {
        iVar2 = X509_pubkey_digest(param_1,type,auStack_a4,(uint *)0x0);
        if (iVar2 != 0) {
          iVar1 = memcmp(auStack_a4,(void *)param_2[6],(long)iVar1);
          uVar5 = (ulong)(iVar1 == 0);
          goto LAB_00ab3348;
        }
        ERR_new();
        ERR_set_debug("crypto/ocsp/ocsp_vfy.c",0x15c,"ocsp_match_issuerid");
        uVar4 = 0x66;
        goto LAB_00ab333c;
      }
      goto LAB_00ab328c;
    }
  }
  uVar5 = 0xffffffff;
LAB_00ab3348:
  EVP_MD_free(type);
  return uVar5;
}

