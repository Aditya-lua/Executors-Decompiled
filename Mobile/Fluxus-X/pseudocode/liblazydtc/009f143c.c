/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f143c
 */

char * ossl_sk_ASN1_UTF8STRING2text(undefined8 param_1,char *param_2,ulong param_3)

{
  char *__s;
  size_t sVar1;
  int iVar2;
  int iVar3;
  size_t sVar4;
  int *piVar5;
  char *pcVar6;
  char *__dest;
  ulong uVar7;
  
  __s = "";
  if (param_2 != (char *)0x0) {
    __s = param_2;
  }
  sVar4 = strlen(__s);
  iVar2 = OPENSSL_sk_num(param_1);
  if (iVar2 < 1) {
    iVar2 = 1;
  }
  else {
    uVar7 = 0;
    iVar2 = 0;
    do {
      piVar5 = (int *)OPENSSL_sk_value(param_1,iVar2);
      sVar1 = 0;
      if (iVar2 != 0) {
        sVar1 = sVar4;
      }
      uVar7 = sVar1 + uVar7 + (long)*piVar5;
      if ((param_3 != 0) && (param_3 < uVar7)) {
        return (char *)0x0;
      }
      iVar2 = iVar2 + 1;
      iVar3 = OPENSSL_sk_num(param_1);
    } while (iVar2 < iVar3);
    iVar2 = (int)uVar7 + 1;
  }
  pcVar6 = CRYPTO_malloc(iVar2,"crypto/asn1/asn1_lib.c",0x1c5);
  if (pcVar6 != (char *)0x0) {
    iVar2 = OPENSSL_sk_num(param_1);
    __dest = pcVar6;
    if (0 < iVar2) {
      iVar2 = 0;
      do {
        piVar5 = (int *)OPENSSL_sk_value(param_1,iVar2);
        iVar3 = *piVar5;
        if ((sVar4 != 0) && (iVar2 != 0)) {
          strncpy(__dest,__s,sVar4 + 1);
          __dest = __dest + sVar4;
        }
        strncpy(__dest,*(char **)(piVar5 + 2),(long)iVar3);
        __dest = __dest + iVar3;
        iVar2 = iVar2 + 1;
        iVar3 = OPENSSL_sk_num(param_1);
      } while (iVar2 < iVar3);
    }
    *__dest = '\0';
  }
  return pcVar6;
}

