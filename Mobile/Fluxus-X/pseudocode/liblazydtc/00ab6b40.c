/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab6b40
 */

int PEM_get_EVP_CIPHER_INFO(char *header,EVP_CIPHER_INFO *cipher)

{
  char *pcVar1;
  char cVar2;
  uint uVar3;
  int iVar4;
  uint uVar5;
  size_t sVar6;
  EVP_CIPHER *pEVar7;
  undefined8 uVar8;
  ulong uVar9;
  uint uVar10;
  uchar *__s;
  char *pcVar11;
  ulong uVar12;
  
  __s = cipher->iv;
  __s[0] = '\0';
  __s[1] = '\0';
  __s[2] = '\0';
  __s[3] = '\0';
  __s[4] = '\0';
  __s[5] = '\0';
  __s[6] = '\0';
  __s[7] = '\0';
  cipher->cipher = (EVP_CIPHER *)0x0;
  cipher->iv[8] = '\0';
  cipher->iv[9] = '\0';
  cipher->iv[10] = '\0';
  cipher->iv[0xb] = '\0';
  cipher->iv[0xc] = '\0';
  cipher->iv[0xd] = '\0';
  cipher->iv[0xe] = '\0';
  cipher->iv[0xf] = '\0';
  if (header == (char *)0x0) {
    return 1;
  }
  if (*header == '\0') {
    return 1;
  }
  if (*header == '\n') {
    return 1;
  }
  iVar4 = strncmp(header,"Proc-Type:",10);
  if (iVar4 != 0) {
    ERR_new();
    ERR_set_debug("crypto/pem/pem_lib.c",0x1f6,"PEM_get_EVP_CIPHER_INFO");
    uVar8 = 0x6b;
    goto LAB_00ab6bc0;
  }
  sVar6 = strspn(header + 10," \t");
  pcVar1 = header + 10 + sVar6;
  if (*pcVar1 != '4') {
    return 0;
  }
  pcVar11 = pcVar1 + 2;
  if (pcVar1[1] != ',') {
    return 0;
  }
  sVar6 = strspn(pcVar11," \t");
  iVar4 = strncmp(pcVar11 + sVar6,"ENCRYPTED",9);
  if (iVar4 == 0) {
    pcVar1 = pcVar11 + sVar6 + 9;
    sVar6 = strspn(pcVar1," \t\r\n");
    if (sVar6 != 0) {
      sVar6 = strspn(pcVar1," \t\r");
      pcVar1 = pcVar1 + sVar6;
      if (*pcVar1 == '\n') {
        iVar4 = strncmp(pcVar1 + 1,"DEK-Info:",9);
        if (iVar4 == 0) {
          sVar6 = strspn(pcVar1 + 10," \t");
          pcVar1 = pcVar1 + 10 + sVar6;
          sVar6 = strcspn(pcVar1," \t,");
          pcVar11 = pcVar1 + sVar6;
          cVar2 = *pcVar11;
          *pcVar11 = '\0';
          pEVar7 = EVP_get_cipherbyname(pcVar1);
          cipher->cipher = pEVar7;
          *pcVar11 = cVar2;
          sVar6 = strspn(pcVar11," \t");
          if (pEVar7 == (EVP_CIPHER *)0x0) {
            ERR_new();
            ERR_set_debug("crypto/pem/pem_lib.c",0x225,"PEM_get_EVP_CIPHER_INFO");
            uVar8 = 0x72;
          }
          else {
            pcVar11 = pcVar11 + sVar6;
            iVar4 = EVP_CIPHER_get_iv_length(pEVar7);
            if (iVar4 < 1) {
              if ((iVar4 == 0) && (*pcVar11 == ',')) {
                ERR_new();
                ERR_set_debug("crypto/pem/pem_lib.c",0x22d,"PEM_get_EVP_CIPHER_INFO");
                uVar8 = 0x82;
                goto LAB_00ab6bc0;
              }
            }
            else {
              cVar2 = *pcVar11;
              pcVar11 = pcVar11 + 1;
              if (cVar2 != ',') {
                ERR_new();
                ERR_set_debug("crypto/pem/pem_lib.c",0x22a,"PEM_get_EVP_CIPHER_INFO");
                uVar8 = 0x81;
                goto LAB_00ab6bc0;
              }
            }
            uVar5 = EVP_CIPHER_get_iv_length(pEVar7);
            if ((int)uVar5 < 1) {
              return 1;
            }
            memset(__s,0,(ulong)uVar5);
            uVar10 = 0;
            uVar12 = 0;
            while (iVar4 = OPENSSL_hexchar2int(pcVar11[uVar12]), -1 < iVar4) {
              uVar9 = uVar12 >> 1 & 0x7fffffff;
              uVar3 = ~uVar10;
              uVar12 = uVar12 + 1;
              uVar10 = uVar10 + 4;
              cipher->iv[uVar9] = cipher->iv[uVar9] | (byte)(iVar4 << (ulong)(uVar3 & 4));
              if ((int)(uVar5 * 2) <= (int)uVar12) {
                return 1;
              }
            }
            ERR_new();
            ERR_set_debug("crypto/pem/pem_lib.c",0x243,"load_iv");
            uVar8 = 0x67;
          }
        }
        else {
          ERR_new();
          ERR_set_debug("crypto/pem/pem_lib.c",0x212,"PEM_get_EVP_CIPHER_INFO");
          uVar8 = 0x69;
        }
      }
      else {
        ERR_new();
        ERR_set_debug("crypto/pem/pem_lib.c",0x209,"PEM_get_EVP_CIPHER_INFO");
        uVar8 = 0x70;
      }
      goto LAB_00ab6bc0;
    }
  }
  ERR_new();
  ERR_set_debug("crypto/pem/pem_lib.c",0x203,"PEM_get_EVP_CIPHER_INFO");
  uVar8 = 0x6a;
LAB_00ab6bc0:
  ERR_set_error(9,uVar8,0);
  return 0;
}

