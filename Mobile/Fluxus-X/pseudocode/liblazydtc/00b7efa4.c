/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7efa4
 */

undefined8 mbedtls_mpi_add_abs(long *param_1,long *param_2,long *param_3)

{
  long *plVar1;
  ushort uVar2;
  long *plVar3;
  bool bVar4;
  undefined8 uVar5;
  void *pvVar6;
  ulong uVar7;
  long lVar8;
  ulong __nmemb;
  ulong uVar9;
  ulong *puVar10;
  void *pvVar11;
  ulong __nmemb_00;
  size_t __n;
  long lVar12;
  ulong uVar13;
  
  plVar1 = param_2;
  plVar3 = param_1;
  if (param_1 != param_3) {
    plVar1 = param_3;
    plVar3 = param_2;
  }
  if ((plVar3 != param_1) && (uVar5 = mbedtls_mpi_copy(param_1), (int)uVar5 != 0)) {
    return uVar5;
  }
  *(undefined2 *)(param_1 + 1) = 1;
  lVar12 = (ulong)*(ushort *)((long)plVar1 + 10) * -8 + -8;
  uVar7 = (ulong)*(ushort *)((long)plVar1 + 10);
  do {
    __nmemb = uVar7;
    if (__nmemb == 0) goto LAB_00b7f148;
    lVar8 = *plVar1;
    lVar12 = lVar12 + 8;
    uVar7 = __nmemb - 1;
  } while (*(long *)(lVar8 + __nmemb * 8 + -8) == 0);
  if (__nmemb < 0x2711) {
    uVar2 = *(ushort *)((long)param_1 + 10);
    if (uVar2 < __nmemb) {
      pvVar6 = calloc(__nmemb,8);
      if (pvVar6 == (void *)0x0) goto LAB_00b7f028;
      pvVar11 = (void *)*param_1;
      if (pvVar11 != (void *)0x0) {
        __n = (ulong)uVar2 << 3;
        memcpy(pvVar6,pvVar11,__n);
        mbedtls_zeroize_and_free(pvVar11,__n);
      }
      *(short *)((long)param_1 + 10) = (short)__nmemb;
      *param_1 = (long)pvVar6;
      lVar8 = *plVar1;
    }
    else {
      pvVar6 = (void *)*param_1;
    }
    uVar7 = mbedtls_mpi_core_add(pvVar6,pvVar6,lVar8,__nmemb);
    uVar5 = 0;
    if (uVar7 != 0) {
      uVar9 = (ulong)*(ushort *)((long)param_1 + 10);
      lVar8 = -lVar12;
      puVar10 = (ulong *)((long)pvVar6 - lVar12);
      do {
        __nmemb_00 = __nmemb + 1;
        uVar13 = uVar9 & 0xffff;
        if (uVar13 <= __nmemb) {
          if (10000 < __nmemb_00) goto LAB_00b7f028;
          if (uVar13 < __nmemb_00) {
            pvVar6 = calloc(__nmemb_00,8);
            if (pvVar6 == (void *)0x0) goto LAB_00b7f028;
            pvVar11 = (void *)*param_1;
            if (pvVar11 != (void *)0x0) {
              memcpy(pvVar6,pvVar11,uVar13 << 3);
              mbedtls_zeroize_and_free(pvVar11,uVar13 << 3);
            }
            uVar9 = __nmemb_00 & 0xffffffff;
            *(short *)((long)param_1 + 10) = (short)__nmemb_00;
            *param_1 = (long)pvVar6;
          }
          else {
            pvVar6 = (void *)*param_1;
          }
          puVar10 = (ulong *)((long)pvVar6 + lVar8);
        }
        lVar8 = lVar8 + 8;
        bVar4 = CARRY8(*puVar10,uVar7);
        *puVar10 = *puVar10 + uVar7;
        uVar7 = 1;
        puVar10 = puVar10 + 1;
        __nmemb = __nmemb_00;
      } while (bVar4);
LAB_00b7f148:
      uVar5 = 0;
    }
  }
  else {
LAB_00b7f028:
    uVar5 = 0xfffffff0;
  }
  return uVar5;
}

