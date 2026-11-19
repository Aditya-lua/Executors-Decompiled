/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba37fc
 */

void mbedtls_psa_get_stats(long *param_1)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  uint *puVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  uint uVar11;
  uint uVar12;
  
  lVar5 = 0;
  uVar11 = 0;
  lVar6 = 0;
  lVar7 = 0;
  uVar12 = 0;
  lVar8 = 0;
  lVar9 = 0;
  lVar10 = 0;
  param_1[5] = 0;
  param_1[4] = 0;
  param_1[7] = 0;
  param_1[6] = 0;
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  do {
    if ((&DAT_00d26028)[lVar10] != 0) {
      uVar3 = 0x20;
      if (lVar10 != 0x16) {
        uVar3 = (ulong)(uint)(0x10 << (ulong)((uint)lVar10 & 0x1f));
      }
      if (uVar3 != 0) {
        puVar4 = (uint *)((&DAT_00d26028)[lVar10] + 0x14);
        do {
          if (puVar4[1] == 0) {
            lVar5 = lVar5 + 1;
            param_1[5] = lVar5;
          }
          else {
            if (*(long *)(puVar4 + 3) != 0) {
              lVar9 = lVar9 + 1;
              param_1[6] = lVar9;
            }
            uVar2 = puVar4[-4];
            if ((uVar2 & 0xff) == 0) {
              lVar7 = lVar7 + 1;
              *param_1 = lVar7;
            }
            else {
              uVar1 = *puVar4;
              lVar8 = lVar8 + 1;
              param_1[1] = lVar8;
              if (uVar12 < uVar1) {
                *(uint *)(param_1 + 7) = uVar1;
                uVar12 = uVar1;
              }
            }
            if (0xff < uVar2) {
              uVar2 = *puVar4;
              lVar6 = lVar6 + 1;
              param_1[2] = lVar6;
              if (uVar11 < uVar2) {
                *(uint *)((long)param_1 + 0x3c) = uVar2;
                uVar11 = uVar2;
              }
            }
          }
          uVar3 = uVar3 - 1;
          puVar4 = puVar4 + 0xe;
        } while (uVar3 != 0);
      }
    }
    lVar10 = lVar10 + 1;
  } while (lVar10 != 0x17);
  return;
}

