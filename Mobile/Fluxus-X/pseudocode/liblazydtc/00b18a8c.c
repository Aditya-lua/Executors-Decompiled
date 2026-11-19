/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b18a8c
 */

ulong OSSL_HTTP_set1_request
                (long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,long param_5,
                undefined8 param_6,undefined4 param_7,undefined8 param_8,undefined4 param_9,
                undefined4 param_10)

{
  undefined4 uVar1;
  bool bVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  ulong uVar6;
  long lVar7;
  char *pcVar8;
  
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0x400,"OSSL_HTTP_set1_request");
    uVar1 = 0xc0102;
LAB_00b18b3c:
    ERR_set_error(0x3d,uVar1,0);
    uVar6 = 0;
  }
  else {
    if (*(long *)(param_1 + 0x40) == 0) {
      lVar7 = 0;
    }
    else {
      lVar7 = 0;
      if ((*(int *)(param_1 + 0x38) == 0) && (lVar7 = *(long *)(param_1 + 0x48), lVar7 == 0)) {
        ERR_new();
        ERR_set_debug("crypto/http/http_client.c",0x405,"OSSL_HTTP_set1_request");
        uVar1 = 0x80106;
        goto LAB_00b18b3c;
      }
    }
    *(undefined8 *)(param_1 + 0x98) = param_8;
    uVar6 = OSSL_HTTP_REQ_CTX_set_request_line
                      (param_1,param_5 != 0,lVar7,*(undefined8 *)(param_1 + 0x50),param_2);
    if ((int)uVar6 != 0) {
      pcVar8 = *(char **)(param_1 + 0x48);
      if (pcVar8 == (char *)0x0) {
        bVar3 = false;
      }
      else {
        bVar3 = *pcVar8 != '\0';
      }
      iVar4 = OPENSSL_sk_num(param_3);
      if (0 < iVar4) {
        iVar4 = 0;
        do {
          lVar7 = OPENSSL_sk_value(param_3,iVar4);
          if (bVar3) {
            iVar5 = OPENSSL_strcasecmp(&DAT_002ccd27,*(undefined8 *)(lVar7 + 8));
            bVar2 = false;
            if (iVar5 != 0) {
              bVar2 = bVar3;
            }
            bVar3 = bVar2;
          }
          uVar6 = OSSL_HTTP_REQ_CTX_add1_header
                            (param_1,*(undefined8 *)(lVar7 + 8),*(undefined8 *)(lVar7 + 0x10));
          if ((int)uVar6 == 0) {
            return uVar6;
          }
          iVar4 = iVar4 + 1;
          iVar5 = OPENSSL_sk_num(param_3);
        } while (iVar4 < iVar5);
      }
      if (((!bVar3) ||
          (uVar6 = OSSL_HTTP_REQ_CTX_add1_header(param_1,&DAT_002ad152,pcVar8), (int)uVar6 != 0)) &&
         (uVar6 = OSSL_HTTP_REQ_CTX_set_expected(param_1,param_6,param_7,param_9,param_10),
         (int)uVar6 != 0)) {
        iVar4 = FUN_00b1777c(param_1,param_4,param_5);
        uVar6 = (ulong)(iVar4 != 0);
      }
    }
  }
  return uVar6;
}

