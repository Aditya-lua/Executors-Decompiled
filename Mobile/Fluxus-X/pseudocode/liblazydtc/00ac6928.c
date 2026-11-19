/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac6928
 */

void ossl_property_merge(int *param_1,int *param_2)

{
  undefined8 *puVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  int *addr;
  int iVar6;
  long lVar7;
  int iVar8;
  int iVar9;
  long lVar10;
  int *piVar11;
  undefined8 uVar12;
  
  iVar2 = *param_1;
  iVar3 = *param_2;
  iVar9 = iVar3 + iVar2;
  iVar8 = 0x20;
  if (iVar9 != 0) {
    iVar8 = (iVar9 + -1) * 0x18 + 0x20;
  }
  addr = CRYPTO_malloc(iVar8,"crypto/property/property_parse.c",0x225);
  if (addr == (int *)0x0) {
    return;
  }
  iVar6 = 0;
  iVar8 = 0;
  iVar9 = 0;
  lVar7 = -0x100000000;
  lVar10 = 8;
  *(byte *)(addr + 1) = *(byte *)(addr + 1) & 0xfe;
  do {
    if (iVar8 < *param_1) {
      if (iVar9 < *param_2) {
        lVar5 = (long)iVar9;
        piVar11 = param_1 + (long)iVar8 * 6 + 2;
        iVar4 = param_2[lVar5 * 6 + 2];
        if (iVar4 < *piVar11) {
          iVar9 = iVar9 + 1;
          piVar11 = param_2 + lVar5 * 6 + 2;
        }
        else {
          if (*piVar11 == iVar4) {
            iVar9 = iVar9 + 1;
          }
          iVar8 = iVar8 + 1;
        }
      }
      else {
        lVar5 = (long)iVar8;
        iVar8 = iVar8 + 1;
        piVar11 = param_1 + lVar5 * 6 + 2;
      }
    }
    else {
      if (*param_2 <= iVar9) {
        *addr = -iVar6;
        if (-(iVar3 + iVar2) == iVar6) {
          return;
        }
        CRYPTO_realloc(addr,(int)((ulong)lVar7 >> 0x20) * 0x18 + 0x20,
                       "crypto/property/property_parse.c",0x23b);
        return;
      }
      lVar5 = (long)iVar9;
      iVar9 = iVar9 + 1;
      piVar11 = param_2 + lVar5 * 6 + 2;
    }
    puVar1 = (undefined8 *)((long)addr + lVar10);
    lVar7 = lVar7 + 0x100000000;
    iVar6 = iVar6 + -1;
    puVar1[2] = *(undefined8 *)(piVar11 + 4);
    uVar12 = *(undefined8 *)piVar11;
    lVar10 = lVar10 + 0x18;
    puVar1[1] = *(undefined8 *)(piVar11 + 2);
    *puVar1 = uVar12;
    *(byte *)(addr + 1) = *(byte *)(piVar11 + 3) & 1 | *(byte *)(addr + 1);
  } while( true );
}

