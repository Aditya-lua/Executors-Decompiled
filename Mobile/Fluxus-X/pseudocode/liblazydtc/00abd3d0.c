/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abd3d0
 */

char * OPENSSL_uni2utf8(uchar *param_1,uint param_2)

{
  byte *pbVar1;
  int iVar2;
  char *pcVar3;
  ulong uVar4;
  long lVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  
  if ((param_2 & 1) != 0) {
    return (char *)0x0;
  }
  if ((int)param_2 < 1) {
    iVar6 = 0;
  }
  else {
    iVar7 = 0;
    iVar6 = 0;
    do {
      iVar2 = param_2 - iVar7;
      if (iVar2 == 0) {
        iVar2 = 0;
        iVar7 = iVar7 + 2;
      }
      else {
        if (iVar2 < 2) {
LAB_00abd4bc:
          pcVar3 = OPENSSL_uni2asc(param_1,param_2);
          return pcVar3;
        }
        pbVar1 = param_1 + iVar7;
        uVar4 = (ulong)CONCAT11(*pbVar1,pbVar1[1]);
        if ((*pbVar1 & 0xf8) == 0xd8) {
          if ((iVar2 < 4) || ((pbVar1[2] & 0xfc) != 0xdc)) goto LAB_00abd4bc;
          uVar4 = (uVar4 * 0x400 - 0x3600000 | (ulong)(CONCAT11(pbVar1[2],pbVar1[3]) - 0xdc00)) +
                  0x10000;
        }
        if (3 < iVar2) {
          iVar2 = 4;
        }
        iVar2 = UTF8_putc((uchar *)0x0,iVar2,uVar4);
        if (iVar2 < 0) goto LAB_00abd4bc;
        iVar8 = iVar2;
        if (iVar2 != 4) {
          iVar8 = 2;
        }
        iVar7 = iVar8 + iVar7;
      }
      iVar6 = iVar2 + iVar6;
    } while (iVar7 < (int)param_2);
  }
  if (((param_2 == 0) || (param_1[(long)(int)param_2 + -2] != '\0')) ||
     (param_1[(long)(int)param_2 + -1] != '\0')) {
    iVar6 = iVar6 + 1;
  }
  pcVar3 = CRYPTO_malloc(iVar6,"crypto/pkcs12/p12_utl.c",0xcf);
  if (pcVar3 == (char *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_utl.c",0xd0,"OPENSSL_uni2utf8");
    ERR_set_error(0x23,0xc0100,0);
  }
  else {
    if ((int)param_2 < 1) {
      lVar5 = 0;
    }
    else {
      iVar6 = 0;
      iVar7 = 0;
      do {
        iVar2 = param_2 - iVar6;
        if (iVar2 == 0) {
          iVar2 = 0;
LAB_00abd5cc:
          iVar6 = iVar6 + 2;
        }
        else {
          if (iVar2 < 2) {
LAB_00abd5c0:
            iVar2 = -1;
            goto LAB_00abd5cc;
          }
          pbVar1 = param_1 + iVar6;
          uVar4 = (ulong)CONCAT11(*pbVar1,pbVar1[1]);
          if ((*pbVar1 & 0xf8) == 0xd8) {
            if ((iVar2 < 4) || ((pbVar1[2] & 0xfc) != 0xdc)) goto LAB_00abd5c0;
            uVar4 = (uVar4 * 0x400 - 0x3600000 | (ulong)(CONCAT11(pbVar1[2],pbVar1[3]) - 0xdc00)) +
                    0x10000;
          }
          if (3 < iVar2) {
            iVar2 = 4;
          }
          iVar2 = UTF8_putc((uchar *)(pcVar3 + iVar7),iVar2,uVar4);
          iVar8 = iVar2;
          if (iVar2 != 4) {
            iVar8 = 2;
          }
          iVar6 = iVar8 + iVar6;
        }
        iVar7 = iVar2 + iVar7;
      } while (iVar6 < (int)param_2);
      lVar5 = (long)iVar7;
    }
    if (((param_2 == 0) || (param_1[(long)(int)param_2 + -2] != '\0')) ||
       (param_1[(long)(int)param_2 + -1] != '\0')) {
      pcVar3[lVar5] = '\0';
    }
  }
  return pcVar3;
}

