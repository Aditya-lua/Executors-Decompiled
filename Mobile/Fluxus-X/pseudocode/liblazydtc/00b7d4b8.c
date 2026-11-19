/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7d4b8
 */

undefined8 mbedtls_mpi_safe_cond_swap(undefined8 *param_1,undefined8 *param_2,ulong param_3)

{
  ushort uVar1;
  ushort uVar2;
  short sVar3;
  undefined8 uVar4;
  void *pvVar5;
  ulong uVar6;
  ulong __nmemb;
  ulong __nmemb_00;
  void *pvVar7;
  size_t __n;
  
  if (param_1 == param_2) {
LAB_00b7d624:
    uVar4 = 0;
  }
  else {
    uVar6 = -(param_3 & 0xff);
    uVar1 = *(ushort *)((long)param_2 + 10);
    __nmemb = (ulong)uVar1;
    if (__nmemb < 0x2711) {
      uVar2 = *(ushort *)((long)param_1 + 10);
      __nmemb_00 = (ulong)uVar2;
      if (uVar2 < uVar1) {
        pvVar5 = calloc(__nmemb,8);
        if (pvVar5 != (void *)0x0) {
          pvVar7 = (void *)*param_1;
          if (pvVar7 != (void *)0x0) {
            memcpy(pvVar5,pvVar7,__nmemb_00 << 3);
            mbedtls_zeroize_and_free(pvVar7,__nmemb_00 << 3);
          }
          *(ushort *)((long)param_1 + 10) = uVar1;
          *param_1 = pvVar5;
          __nmemb_00 = __nmemb;
LAB_00b7d570:
          uVar1 = *(ushort *)((long)param_2 + 10);
          if ((uint)uVar1 < (uint)__nmemb_00) {
            pvVar5 = calloc(__nmemb_00,8);
            if (pvVar5 == (void *)0x0) goto LAB_00b7d500;
            pvVar7 = (void *)*param_2;
            if (pvVar7 != (void *)0x0) {
              __n = (ulong)uVar1 << 3;
              memcpy(pvVar5,pvVar7,__n);
              mbedtls_zeroize_and_free(pvVar7,__n);
            }
            *(short *)((long)param_2 + 10) = (short)__nmemb_00;
            *param_2 = pvVar5;
          }
          sVar3 = *(short *)(param_1 + 1);
          uVar1 = (ushort)((long)uVar6 >> 0x3f);
          *(ushort *)(param_1 + 1) =
               (*(short *)(param_2 + 1) + 1U & uVar1 | ~uVar1 & sVar3 + 1U) - 1;
          *(ushort *)(param_2 + 1) =
               (sVar3 + 1U & uVar1 | ~uVar1 & *(short *)(param_2 + 1) + 1U) - 1;
          mbedtls_mpi_core_cond_swap
                    (*param_1,*param_2,*(undefined2 *)((long)param_1 + 10),
                     (long)(uVar6 | param_3 & 0xff) >> 0x3f);
          goto LAB_00b7d624;
        }
      }
      else if (uVar2 < 0x2711) goto LAB_00b7d570;
    }
LAB_00b7d500:
    uVar4 = 0xfffffff0;
  }
  return uVar4;
}

