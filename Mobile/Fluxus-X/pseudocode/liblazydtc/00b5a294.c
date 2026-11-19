/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5a294
 */

ulong FUN_00b5a294(long param_1,uchar *param_2,ulong param_3,long param_4,long param_5)

{
  uchar *md;
  int iVar1;
  uint uVar2;
  char cVar3;
  uint uVar4;
  int iVar5;
  ulong uVar6;
  EVP_MD *pEVar7;
  long lVar8;
  char *pcVar9;
  long lVar10;
  long lVar11;
  EVP_MD_CTX *pEVar12;
  long lVar13;
  
  uVar2 = *(uint *)(param_1 + 0xc0);
  lVar13 = *(long *)(param_1 + 0xf8);
  if (*(long *)(lVar13 + 0x18) == 0) {
    uVar6 = 0;
  }
  else {
    lVar11 = lVar13;
    if ((param_4 != 0) && (param_5 != 0)) {
      uVar6 = FUN_00b5a720(param_1,2,param_4,param_5);
      if ((int)uVar6 == 0) {
        return uVar6;
      }
      lVar11 = *(long *)(param_1 + 0xf8);
    }
    if (param_3 == 0) {
LAB_00b5a428:
      uVar6 = FUN_00b5a720(param_1,3,0,0);
      if ((int)uVar6 != 0) {
        lVar11 = *(long *)(param_1 + 0xe8);
        if (lVar11 != 0) {
          iVar5 = 0;
          lVar10 = lVar11;
          do {
            lVar8 = lVar13 + lVar10;
            lVar10 = lVar10 + -1;
            iVar1 = iVar5 + (uint)*(byte *)(lVar8 + 0x27) + (uint)*(byte *)(lVar8 + 0x96);
            iVar5 = iVar1 >> 8;
            *(char *)(lVar8 + 0x27) = (char)iVar1;
          } while (lVar10 != 0);
          if ((iVar5 != 0) && (*(long *)(param_1 + 0xe8) != lVar11)) {
            pcVar9 = (char *)(lVar13 + 0x27);
            lVar11 = lVar11 - *(long *)(param_1 + 0xe8);
            do {
              cVar3 = *pcVar9;
              *pcVar9 = cVar3 + '\x01';
              if ((char)(cVar3 + '\x01') != '\0') break;
              lVar11 = lVar11 + 1;
              pcVar9 = pcVar9 + -1;
            } while (lVar11 != 0);
          }
        }
        lVar10 = *(long *)(param_1 + 0xe8);
        lVar11 = lVar13 + lVar10;
        uVar4 = (uint)*(byte *)(lVar11 + 0x27) + (uVar2 & 0xff);
        *(char *)(lVar11 + 0x27) = (char)uVar4;
        uVar4 = (uint)*(byte *)(lVar11 + 0x26) + (uVar4 >> 8) + (uVar2 >> 8 & 0xff);
        *(char *)(lVar11 + 0x26) = (char)uVar4;
        uVar4 = (uint)*(byte *)(lVar11 + 0x25) + (uVar4 >> 8) + (uVar2 >> 0x10 & 0xff);
        *(char *)(lVar11 + 0x25) = (char)uVar4;
        uVar2 = (uint)*(byte *)(lVar11 + 0x24) + (uVar4 >> 8) + (uVar2 >> 0x18);
        *(char *)(lVar11 + 0x24) = (char)uVar2;
        if (((uVar2 & 0xfff00) != 0) && (*(long *)(param_1 + 0xe8) != 4)) {
          pcVar9 = (char *)(lVar13 + lVar10 + 0x23);
          lVar13 = 4 - *(long *)(param_1 + 0xe8);
          do {
            cVar3 = *pcVar9;
            *pcVar9 = cVar3 + '\x01';
            if ((char)(cVar3 + '\x01') != '\0') break;
            lVar13 = lVar13 + 1;
            pcVar9 = pcVar9 + -1;
          } while (lVar13 != 0);
        }
        uVar6 = 1;
      }
    }
    else {
      md = (uchar *)(lVar11 + 0x106);
      memcpy(md,(void *)(lVar11 + 0x28),*(size_t *)(param_1 + 0xe8));
      pEVar12 = *(EVP_MD_CTX **)(lVar11 + 0x18);
      pEVar7 = (EVP_MD *)ossl_prov_digest_md(lVar11);
      uVar4 = EVP_DigestInit_ex(pEVar12,pEVar7,(ENGINE *)0x0);
      uVar6 = (ulong)uVar4;
      if (uVar4 != 0) {
        do {
          iVar5 = EVP_DigestUpdate(*(EVP_MD_CTX **)(lVar11 + 0x18),md,*(size_t *)(param_1 + 0xe8));
          if (iVar5 == 0) {
            return 0;
          }
          if (param_3 < *(ulong *)(lVar11 + 0x20)) {
            iVar5 = EVP_DigestFinal(*(EVP_MD_CTX **)(lVar11 + 0x18),md,(uint *)0x0);
            if (iVar5 == 0) {
              return 0;
            }
            memcpy(param_2,md,param_3);
            goto LAB_00b5a428;
          }
          iVar5 = EVP_DigestFinal(*(EVP_MD_CTX **)(lVar11 + 0x18),param_2,(uint *)0x0);
          if (iVar5 == 0) {
            return 0;
          }
          param_3 = param_3 - *(long *)(lVar11 + 0x20);
          if (param_3 == 0) goto LAB_00b5a428;
          lVar8 = *(long *)(param_1 + 0xe8);
          param_2 = param_2 + *(long *)(lVar11 + 0x20);
          lVar10 = lVar11 + lVar8;
          uVar4 = *(byte *)(lVar10 + 0x105) + 1;
          *(char *)(lVar10 + 0x105) = (char)uVar4;
          if ((uVar4 >> 8 != 0) && (*(long *)(param_1 + 0xe8) != 1)) {
            pcVar9 = (char *)(lVar11 + lVar8 + 0x104);
            lVar10 = 1 - *(long *)(param_1 + 0xe8);
            do {
              cVar3 = *pcVar9;
              *pcVar9 = cVar3 + '\x01';
              if ((char)(cVar3 + '\x01') != '\0') break;
              lVar10 = lVar10 + 1;
              pcVar9 = pcVar9 + -1;
            } while (lVar10 != 0);
          }
          pEVar12 = *(EVP_MD_CTX **)(lVar11 + 0x18);
          pEVar7 = (EVP_MD *)ossl_prov_digest_md(lVar11);
          iVar5 = EVP_DigestInit_ex(pEVar12,pEVar7,(ENGINE *)0x0);
        } while (iVar5 != 0);
        uVar6 = 0;
      }
    }
  }
  return uVar6;
}

