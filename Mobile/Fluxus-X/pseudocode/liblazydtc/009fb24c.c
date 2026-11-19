/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fb24c
 */

undefined8 BIO_parse_hostserv(char *param_1,long *param_2,long *param_3,int param_4)

{
  bool bVar1;
  char *pcVar2;
  size_t sVar3;
  char *pcVar4;
  char *pcVar5;
  long lVar6;
  undefined8 uVar7;
  size_t sVar8;
  
  if (*param_1 == '[') {
    pcVar2 = strchr(param_1,0x5d);
    if (pcVar2 != (char *)0x0) {
      pcVar4 = param_1 + 1;
      sVar8 = (long)pcVar2 - (long)pcVar4;
      param_1 = pcVar4;
      if (pcVar2[1] == '\0') {
LAB_009fb3b8:
        bVar1 = false;
        sVar3 = 0;
        pcVar2 = (char *)0x0;
        goto LAB_009fb3c4;
      }
      if (pcVar2[1] == ':') {
        sVar3 = strlen(pcVar2 + 2);
        bVar1 = true;
        pcVar2 = pcVar2 + 2;
        goto LAB_009fb360;
      }
    }
  }
  else {
    pcVar2 = strrchr(param_1,0x3a);
    pcVar4 = strchr(param_1,0x3a);
    if (pcVar4 != pcVar2) {
      ERR_new();
      ERR_set_debug("crypto/bio/bio_addr.c",0x22d,"BIO_parse_hostserv");
      uVar7 = 0x81;
      goto LAB_009fb394;
    }
    if (pcVar2 == (char *)0x0) {
      sVar8 = strlen(param_1);
      if (param_4 == 0) goto LAB_009fb3b8;
      pcVar4 = (char *)0x0;
      sVar3 = sVar8;
      sVar8 = 0;
    }
    else {
      sVar8 = (long)pcVar2 - (long)param_1;
      sVar3 = strlen(pcVar2 + 1);
      pcVar4 = param_1;
      param_1 = pcVar2 + 1;
    }
    bVar1 = param_1 != (char *)0x0;
    pcVar2 = param_1;
LAB_009fb360:
    pcVar5 = strchr(pcVar2,0x3a);
    param_1 = pcVar4;
    if (pcVar5 == (char *)0x0) {
LAB_009fb3c4:
      if ((param_2 == (long *)0x0) || (param_1 == (char *)0x0)) {
LAB_009fb40c:
        if (param_3 == (long *)0x0 || !bVar1) {
          return 1;
        }
        if ((sVar3 == 0) || ((sVar3 == 1 && (*pcVar2 == '*')))) {
          *param_3 = 0;
          return 1;
        }
        lVar6 = CRYPTO_strndup(pcVar2,sVar3,"crypto/bio/bio_addr.c",0x225);
        *param_3 = lVar6;
        if (lVar6 != 0) {
          return 1;
        }
      }
      else {
        if ((sVar8 == 0) || ((sVar8 == 1 && (*param_1 == '*')))) {
          *param_2 = 0;
          goto LAB_009fb40c;
        }
        lVar6 = CRYPTO_strndup(param_1,sVar8,"crypto/bio/bio_addr.c",0x21b);
        *param_2 = lVar6;
        if (lVar6 != 0) goto LAB_009fb40c;
      }
      ERR_new();
      ERR_set_debug("crypto/bio/bio_addr.c",0x233,"BIO_parse_hostserv");
      uVar7 = 0xc0100;
      goto LAB_009fb394;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/bio/bio_addr.c",0x230,"BIO_parse_hostserv");
  uVar7 = 0x82;
LAB_009fb394:
  ERR_set_error(0x20,uVar7,0);
  return 0;
}

