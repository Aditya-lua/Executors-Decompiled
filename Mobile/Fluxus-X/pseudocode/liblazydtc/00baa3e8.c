/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baa3e8
 */

int mbedtls_oid_from_numeric_string(undefined4 *param_1,byte *param_2,ulong param_3)

{
  byte bVar1;
  void *__src;
  void *__dest;
  ulong uVar2;
  long lVar3;
  long lVar4;
  byte *pbVar5;
  uint uVar6;
  ulong uVar7;
  uint uVar8;
  byte *pbVar9;
  ulong uVar10;
  byte *pbVar11;
  int iVar12;
  size_t sVar13;
  
  if (param_3 == 0) {
    return -0x68;
  }
  lVar3 = 0;
  uVar2 = 0;
  if (param_3 == 1) {
LAB_00baa458:
    lVar4 = param_3 - uVar2;
    pbVar5 = param_2 + uVar2;
    do {
      if (*pbVar5 == 0x2e) {
        lVar3 = lVar3 + 1;
      }
      lVar4 = lVar4 + -1;
      pbVar5 = pbVar5 + 1;
    } while (lVar4 != 0);
  }
  else {
    uVar2 = param_3 & 0xfffffffffffffffe;
    lVar4 = 0;
    lVar3 = 0;
    pbVar5 = param_2 + 1;
    uVar7 = uVar2;
    do {
      if (pbVar5[-1] == 0x2e) {
        lVar4 = lVar4 + 1;
      }
      if (*pbVar5 == 0x2e) {
        lVar3 = lVar3 + 1;
      }
      uVar7 = uVar7 - 2;
      pbVar5 = pbVar5 + 2;
    } while (uVar7 != 0);
    lVar3 = lVar3 + lVar4;
    if (uVar2 != param_3) goto LAB_00baa458;
  }
  if (0x7e < lVar3 - 1U) {
    return -0x68;
  }
  sVar13 = lVar3 * 5;
  __src = calloc(sVar13,1);
  *(void **)(param_1 + 4) = __src;
  if (__src == (void *)0x0) {
    return -0x6a;
  }
  if (0 < (long)param_3) {
    uVar6 = 0;
    pbVar5 = param_2 + param_3;
    iVar12 = -0x68;
    do {
      bVar1 = *param_2;
      if (9 < bVar1 - 0x30) {
        if (iVar12 != 0) goto LAB_00baa5b4;
        break;
      }
      if (0x19999999 < uVar6) goto LAB_00baa5b0;
      param_2 = param_2 + 1;
      iVar12 = 0;
      uVar6 = ((uint)bVar1 + uVar6 * 10) - 0x30;
    } while (param_2 < pbVar5);
    iVar12 = -0x68;
    if ((2 < uVar6) || (pbVar5 <= param_2)) goto LAB_00baa5b4;
    if ((*param_2 == 0x2e) && (param_2 = param_2 + 1, param_2 < pbVar5)) {
      uVar8 = 0;
      iVar12 = -0x68;
      do {
        bVar1 = *param_2;
        if (9 < bVar1 - 0x30) {
          if (iVar12 != 0) goto LAB_00baa5b4;
          break;
        }
        if (0x19999999 < uVar8) goto LAB_00baa5b0;
        param_2 = param_2 + 1;
        iVar12 = 0;
        uVar8 = ((uint)bVar1 + uVar8 * 10) - 0x30;
      } while (param_2 < pbVar5);
      if ((1 < uVar6) || (uVar8 < 0x28)) {
        if (param_2 < pbVar5) {
          if (*param_2 != 0x2e) goto LAB_00baa5b0;
          param_2 = param_2 + 1;
        }
        if (uVar8 <= ~(uVar6 * 0x28)) {
          uVar8 = uVar8 + uVar6 * 0x28;
          uVar2 = 0;
          uVar6 = uVar8;
          do {
            uVar7 = uVar2;
            uVar6 = uVar6 >> 7;
            uVar2 = uVar7 + 1;
          } while (uVar6 != 0);
          if (uVar7 < sVar13) {
            *(byte *)((long)__src + uVar7) = (byte)uVar8 & 0x7f;
            if (1 < uVar2) {
              uVar10 = 1;
              pbVar9 = (byte *)((long)__src + (uVar7 - 1));
              do {
                uVar8 = uVar8 >> 7;
                uVar10 = uVar10 + 1;
                *pbVar9 = (byte)uVar8 | 0x80;
                pbVar9 = pbVar9 + -1;
              } while (uVar10 <= uVar7);
            }
            lVar3 = (long)__src + uVar2;
            if (param_2 < pbVar5) {
              do {
                uVar6 = 0;
                iVar12 = -0x68;
                do {
                  bVar1 = *param_2;
                  if (9 < bVar1 - 0x30) {
                    if (iVar12 != 0) goto LAB_00baa5b4;
                    break;
                  }
                  if (0x19999999 < uVar6) goto LAB_00baa5b0;
                  param_2 = param_2 + 1;
                  iVar12 = 0;
                  uVar6 = ((uint)bVar1 + uVar6 * 10) - 0x30;
                } while (param_2 < pbVar5);
                if (param_2 < pbVar5) {
                  if (*param_2 != 0x2e) goto LAB_00baa5b0;
                  param_2 = param_2 + 1;
                }
                pbVar9 = (byte *)(lVar3 + -1);
                uVar2 = 0;
                uVar8 = uVar6;
                do {
                  uVar7 = uVar2;
                  pbVar11 = pbVar9;
                  uVar8 = uVar8 >> 7;
                  uVar2 = uVar7 + 1;
                  pbVar9 = pbVar11 + 1;
                } while (uVar8 != 0);
                if ((long)__src + (sVar13 - lVar3) <= uVar7) goto LAB_00baa748;
                *(byte *)(lVar3 + uVar7) = (byte)uVar6 & 0x7f;
                if (1 < uVar2) {
                  uVar10 = 1;
                  do {
                    uVar6 = uVar6 >> 7;
                    uVar10 = uVar10 + 1;
                    *pbVar11 = (byte)uVar6 | 0x80;
                    pbVar11 = pbVar11 + -1;
                  } while (uVar10 <= uVar7);
                }
                lVar3 = lVar3 + uVar2;
              } while (param_2 < pbVar5);
              __src = *(void **)(param_1 + 4);
            }
            sVar13 = lVar3 - (long)__src;
            __dest = calloc(sVar13,1);
            if (__dest != (void *)0x0) {
              memcpy(__dest,__src,sVar13);
              free(__src);
              *(size_t *)(param_1 + 2) = sVar13;
              *(void **)(param_1 + 4) = __dest;
              *param_1 = 6;
              return 0;
            }
            iVar12 = -0x6a;
          }
          else {
LAB_00baa748:
            iVar12 = -0xb;
          }
          goto LAB_00baa5b4;
        }
      }
    }
  }
LAB_00baa5b0:
  iVar12 = -0x68;
LAB_00baa5b4:
  free(*(void **)(param_1 + 4));
  *(undefined8 *)(param_1 + 2) = 0;
  *(undefined8 *)(param_1 + 4) = 0;
  return iVar12;
}

