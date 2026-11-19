/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5a720
 */

undefined4 FUN_00b5a720(long param_1,undefined1 param_2,void *param_3,size_t param_4)

{
  int iVar1;
  long lVar2;
  char cVar3;
  int iVar4;
  undefined4 uVar5;
  EVP_MD *type;
  long lVar6;
  long lVar7;
  char *pcVar8;
  byte *pbVar9;
  long lVar10;
  long lVar11;
  EVP_MD_CTX *ctx;
  undefined1 local_34 [4];
  
  lVar11 = *(long *)(param_1 + 0xf8);
  ctx = *(EVP_MD_CTX **)(lVar11 + 0x18);
  local_34[0] = param_2;
  type = (EVP_MD *)ossl_prov_digest_md(lVar11);
  iVar4 = EVP_DigestInit_ex(ctx,type,(ENGINE *)0x0);
  uVar5 = 0;
  if (iVar4 != 0) {
    iVar4 = EVP_DigestUpdate(ctx,local_34,1);
    uVar5 = 0;
    if (iVar4 != 0) {
      iVar4 = EVP_DigestUpdate(ctx,(void *)(lVar11 + 0x28),*(size_t *)(param_1 + 0xe8));
      uVar5 = 0;
      if (iVar4 != 0) {
        if ((param_3 != (void *)0x0) && (iVar4 = EVP_DigestUpdate(ctx,param_3,param_4), iVar4 == 0))
        {
          return 0;
        }
        iVar4 = EVP_DigestFinal(ctx,(uchar *)(lVar11 + 0x106),(uint *)0x0);
        uVar5 = 0;
        if (iVar4 != 0) {
          lVar6 = *(long *)(lVar11 + 0x20);
          if (lVar6 != 0) {
            iVar4 = 0;
            lVar7 = *(long *)(param_1 + 0xe8) + -1;
            pbVar9 = (byte *)(lVar11 + lVar7 + 0x28);
            lVar10 = lVar6;
            do {
              lVar2 = lVar11 + lVar10;
              lVar10 = lVar10 + -1;
              iVar1 = iVar4 + (uint)*pbVar9 + (uint)*(byte *)(lVar2 + 0x105);
              iVar4 = iVar1 >> 8;
              *pbVar9 = (byte)iVar1;
              pbVar9 = pbVar9 + -1;
            } while (lVar10 != 0);
            if ((iVar4 != 0) && (*(long *)(param_1 + 0xe8) != lVar6)) {
              pcVar8 = (char *)(lVar11 + (lVar7 - lVar6) + 0x28);
              lVar6 = lVar6 - *(long *)(param_1 + 0xe8);
              while (cVar3 = *pcVar8, *pcVar8 = cVar3 + '\x01', (char)(cVar3 + '\x01') == '\0') {
                pcVar8 = pcVar8 + -1;
                lVar6 = lVar6 + 1;
                if (lVar6 == 0) {
                  return 1;
                }
              }
            }
          }
          uVar5 = 1;
        }
      }
    }
  }
  return uVar5;
}

