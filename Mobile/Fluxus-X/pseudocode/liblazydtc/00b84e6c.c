/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b84e6c
 */

void FUN_00b84e6c(void *param_1,void *param_2,long *param_3,long param_4,long param_5,ulong param_6,
                 int param_7,undefined8 param_8,undefined8 *param_9)

{
  long lVar1;
  undefined8 *__dest;
  undefined8 *puVar2;
  bool bVar3;
  long lVar4;
  ulong uVar5;
  undefined8 *puVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  ulong uVar11;
  size_t __n;
  
  if (param_7 == 0x2a2a2a2a) {
    lVar4 = (long)(int)param_6 * -0x40 + -0x40;
    lVar8 = (long)(int)param_6;
    do {
      if (lVar8 < 1) goto LAB_00b84f00;
      lVar4 = lVar4 + 0x40;
      lVar9 = *(long *)(param_5 + lVar8 * 8 + -8);
      lVar8 = lVar8 + -1;
    } while (lVar9 == 0);
    uVar5 = -lVar4 - LZCOUNT(lVar9);
    if (uVar5 == 0) {
LAB_00b84f00:
      uVar5 = 1;
    }
    param_6 = uVar5 >> 6;
    uVar5 = uVar5 & 0x3f;
  }
  else {
    uVar5 = 0;
  }
  lVar8 = *param_3;
  lVar4 = 3;
  if (param_6 * 0x40 < 0x50) {
    lVar4 = 1;
  }
  __dest = param_9 + (param_4 << lVar4);
  __n = param_4 * 8;
  puVar2 = __dest + param_4;
  lVar9 = ((ulong)((int)lVar8 * 2 + 4) & 8) + lVar8;
  lVar9 = (2 - lVar9 * lVar8) * lVar9;
  lVar9 = (2 - lVar9 * lVar8) * lVar9;
  lVar9 = (2 - lVar9 * lVar8) * lVar9;
  lVar8 = -(lVar9 * (2 - lVar9 * lVar8));
  memset(param_9,0,__n);
  *param_9 = 1;
  mbedtls_mpi_core_montmul(param_9,param_9,param_8,param_4,param_3,param_4,lVar8,puVar2);
  memcpy(param_9 + param_4,param_2,__n);
  if (0x4f < param_6 * 0x40) {
    lVar9 = (1L << lVar4) - 2;
    puVar6 = param_9;
    do {
      mbedtls_mpi_core_montmul
                (puVar6 + param_4 * 2,puVar6 + param_4,param_9 + param_4,param_4,param_3,param_4,
                 lVar8,puVar2);
      lVar9 = lVar9 + -1;
      puVar6 = puVar6 + param_4;
    } while (lVar9 != 0);
  }
  memcpy(param_1,param_9,__n);
  lVar9 = 0;
  uVar11 = 0;
  do {
    while( true ) {
      mbedtls_mpi_core_montmul(param_1,param_1,param_1,param_4,param_3,param_4,lVar8,puVar2);
      bVar3 = uVar5 == 0;
      param_6 = param_6 - bVar3;
      uVar7 = uVar5 - 1;
      uVar5 = 0x3f;
      if (!bVar3) {
        uVar5 = uVar7;
      }
      lVar9 = lVar9 + 1;
      uVar11 = *(ulong *)(param_5 + param_6 * 8) >> (uVar5 & 0x3f) & 1 | uVar11 << 1;
      if ((lVar9 == lVar4) || (param_6 == 0 && uVar5 == 0)) break;
      if (param_6 == 0 && uVar5 == 0) {
        return;
      }
    }
    if (param_7 == 0x2a2a2a2a) {
      memcpy(__dest,param_9 + uVar11 * param_4,__n);
    }
    else {
      uVar7 = 0;
      puVar6 = param_9;
      do {
        uVar10 = (long)(-(uVar11 ^ uVar7) | uVar11 ^ uVar7) >> 0x3f;
        if ((param_4 != 0) && (puVar6 != __dest)) {
          lVar9 = 0;
          do {
            lVar1 = lVar9 + 1;
            __dest[lVar9] = puVar6[lVar9] & ~uVar10 | uVar10 & __dest[lVar9];
            lVar9 = lVar1;
          } while (param_4 != lVar1);
        }
        uVar7 = uVar7 + 1;
        puVar6 = puVar6 + param_4;
      } while (uVar7 != 1L << lVar4);
    }
    mbedtls_mpi_core_montmul(param_1,param_1,__dest,param_4,param_3,param_4,lVar8,puVar2);
    lVar9 = 0;
    uVar11 = 0;
  } while (param_6 != 0 || uVar5 != 0);
  return;
}

