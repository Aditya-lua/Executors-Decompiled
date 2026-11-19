/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0484
 */

/* WARNING: Type propagation algorithm not settling */

char * SSL_CIPHER_description(SSL_CIPHER *param_1,char *buf,int size)

{
  int iVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  char *param4;
  char *param5;
  char *param6;
  char *param7;
  char *param8;
  
  if (buf == (char *)0x0) {
    size = 0x80;
    buf = CRYPTO_malloc(0x80,"ssl/ssl_ciph.c",0x6a4);
    if (buf == (char *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_ciph.c",0x6a5,"SSL_CIPHER_description");
      ERR_set_error(0x14,0xc0100,0);
      return (char *)0x0;
    }
  }
  else if (size < 0x80) {
    return (char *)0x0;
  }
  iVar1 = *(int *)((long)&param_1->algorithm_mkey + 4);
  uVar3 = (uint)param_1->algorithm_auth;
  iVar2 = *(int *)((long)&param_1->algorithm_auth + 4);
  iVar4 = (int)param_1->algorithm_enc;
  param4 = (char *)ssl_protocol_to_string(*(undefined4 *)((long)&param_1->algorithm_enc + 4));
  if (iVar1 < 0x80) {
    param5 = "RSA";
    switch(iVar1) {
    case 0:
      param5 = "any";
      break;
    case 2:
      param5 = "DH";
      break;
    default:
switchD_009b0520_caseD_3:
      param5 = "unknown";
    case 1:
      break;
    case 4:
      param5 = "ECDH";
      break;
    case 8:
      param5 = "PSK";
      break;
    case 0x10:
      param5 = "GOST";
      break;
    case 0x20:
      param5 = "SRP";
      break;
    case 0x40:
      param5 = "RSAPSK";
    }
  }
  else if (iVar1 == 0x80) {
    param5 = "ECDHEPSK";
  }
  else if (iVar1 == 0x100) {
    param5 = "DHEPSK";
  }
  else {
    if (iVar1 != 0x200) goto switchD_009b0520_caseD_3;
    param5 = "GOST18";
  }
  if (uVar3 < 0x41) {
    param6 = "RSA";
    switch((long)&switchD_009b0668::switchdataD_0074b748 +
           (long)(int)(&switchD_009b0668::switchdataD_0074b748)[uVar3]) {
    case 0x9b066c:
      param6 = "any";
    case 0x9b0674:
      break;
    default:
      goto switchD_009b0668_caseD_9b07cc;
    case 0x9b07e0:
      param6 = "DSS";
      break;
    case 0x9b07f4:
      param6 = "None";
      break;
    case 0x9b0808:
      param6 = "ECDSA";
      break;
    case 0x9b081c:
      param6 = "PSK";
      break;
    case 0x9b0830:
      param6 = "GOST01";
      break;
    case 0x9b0844:
      param6 = "SRP";
    }
  }
  else if (uVar3 == 0xa0) {
    param6 = "GOST12";
  }
  else {
switchD_009b0668_caseD_9b07cc:
    param6 = "unknown";
  }
  if (iVar2 < 0x1000) {
    if (iVar2 < 0x80) {
      param7 = "DES(56)";
      switch(iVar2) {
      case 1:
switchD_009b06a8_caseD_1:
        break;
      case 2:
        param7 = "3DES(168)";
        break;
      default:
switchD_009b06a8_caseD_3:
        param7 = "unknown";
        break;
      case 4:
        param7 = "RC4(128)";
        break;
      case 8:
        param7 = "RC2(128)";
        break;
      case 0x10:
        param7 = "IDEA(128)";
        break;
      case 0x20:
        param7 = "None";
        break;
      case 0x40:
        param7 = "AES(128)";
      }
    }
    else if (iVar2 < 0x200) {
      if (iVar2 == 0x80) {
        param7 = "AES(256)";
      }
      else {
        if (iVar2 != 0x100) goto switchD_009b06a8_caseD_3;
        param7 = "Camellia(128)";
      }
    }
    else if (iVar2 == 0x200) {
      param7 = "Camellia(256)";
    }
    else {
      if (iVar2 == 0x400) goto LAB_009b087c;
      if (iVar2 != 0x800) goto switchD_009b06a8_caseD_3;
      param7 = "SEED(128)";
    }
  }
  else if (iVar2 < 0x40000) {
    if (iVar2 < 0x8000) {
      if (iVar2 == 0x1000) {
        param7 = "AESGCM(128)";
      }
      else if (iVar2 == 0x2000) {
        param7 = "AESGCM(256)";
      }
      else {
        if (iVar2 != 0x4000) goto switchD_009b06a8_caseD_3;
        param7 = "AESCCM(128)";
      }
    }
    else if (iVar2 == 0x8000) {
      param7 = "AESCCM(256)";
    }
    else if (iVar2 == 0x10000) {
      param7 = "AESCCM8(128)";
    }
    else {
      if (iVar2 != 0x20000) goto switchD_009b06a8_caseD_3;
      param7 = "AESCCM8(256)";
    }
  }
  else if (iVar2 < 0x200000) {
    if (iVar2 == 0x40000) {
LAB_009b087c:
      param7 = "GOST89(256)";
      goto switchD_009b06a8_caseD_1;
    }
    if (iVar2 == 0x80000) {
      param7 = "CHACHA20/POLY1305(256)";
    }
    else {
      if (iVar2 != 0x100000) goto switchD_009b06a8_caseD_3;
      param7 = "ARIAGCM(128)";
    }
  }
  else if (iVar2 == 0x200000) {
    param7 = "ARIAGCM(256)";
  }
  else if (iVar2 == 0x400000) {
    param7 = "MAGMA";
  }
  else {
    if (iVar2 != 0x800000) goto switchD_009b06a8_caseD_3;
    param7 = "KUZNYECHIK";
  }
  if (iVar4 < 0x80) {
    param8 = "MD5";
    switch(iVar4) {
    case 1:
      break;
    case 2:
      param8 = "SHA1";
      break;
    default:
switchD_009b08b0_caseD_3:
      param8 = "unknown";
      break;
    case 4:
      param8 = "GOST94";
      break;
    case 8:
switchD_009b08b0_caseD_8:
      param8 = "GOST89";
      break;
    case 0x10:
      param8 = "SHA256";
      break;
    case 0x20:
      param8 = "SHA384";
      break;
    case 0x40:
      param8 = "AEAD";
    }
  }
  else {
    if (iVar4 != 0x80) {
      if (iVar4 == 0x100) goto switchD_009b08b0_caseD_8;
      if (iVar4 != 0x200) goto switchD_009b08b0_caseD_3;
    }
    param8 = "GOST2012";
  }
  BIO_snprintf(buf,(long)size,"%-30s %-7s Kx=%-8s Au=%-5s Enc=%-22s Mac=%-4s\n",param_1->name,param4
               ,param5,param6,param7,param8);
  return buf;
}

