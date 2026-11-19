/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7bc84
 */

int mbedtls_ecdsa_raw_to_der
              (long param_1,void *param_2,long param_3,void *param_4,long param_5,size_t *param_6)

{
  long lVar1;
  int iVar2;
  int iVar3;
  char *pcVar4;
  size_t sVar5;
  ulong __n;
  char *pcVar6;
  long lVar7;
  long lVar8;
  char *pcVar9;
  ulong uVar10;
  char *local_100;
  char *local_f8;
  char local_f0 [68];
  char local_ac [68];
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  __n = param_1 + 7U >> 3;
  pcVar9 = (char *)((long)param_4 + param_5);
  local_100 = pcVar9;
  if (__n * 2 == param_3) {
    if (0x217 < param_1 + 7U) {
LAB_00b7bd48:
      iVar2 = -0x6c;
      goto LAB_00b7bd4c;
    }
    pcVar4 = local_f0;
    memcpy(local_ac,param_2,__n);
    memcpy(local_f0,(void *)((long)param_2 + __n),__n);
    lVar8 = __n << 0x20;
    lVar7 = lVar8;
    uVar10 = __n;
    do {
      local_f8 = pcVar9;
      if (*pcVar4 != '\0') {
        sVar5 = lVar7 >> 0x20;
        if (param_5 < (long)sVar5) goto LAB_00b7bd48;
        pcVar6 = pcVar9 + -sVar5;
        local_f8 = pcVar6;
        memcpy(pcVar6,pcVar4,sVar5);
        if (*pcVar6 < '\0') {
          if ((long)pcVar6 - (long)param_4 < 1) goto LAB_00b7bd48;
          local_f8 = pcVar6 + -1;
          uVar10 = (ulong)((int)uVar10 + 1);
          pcVar6[-1] = '\0';
        }
        iVar2 = mbedtls_asn1_write_len(&local_f8,param_4,(long)(int)uVar10);
        if (iVar2 < 0) goto LAB_00b7bd4c;
        iVar3 = mbedtls_asn1_write_tag(&local_f8,param_4,2);
        if (iVar3 < 0) goto LAB_00b7befc;
        iVar2 = iVar2 + (int)uVar10 + iVar3;
        if (iVar2 < 0) goto LAB_00b7bd4c;
        lVar7 = (long)iVar2;
        pcVar4 = local_ac;
        pcVar9 = pcVar9 + -lVar7;
        goto LAB_00b7be04;
      }
      pcVar4 = pcVar4 + 1;
      uVar10 = uVar10 - 1;
      lVar7 = lVar7 + -0x100000000;
    } while (uVar10 != 0);
  }
  goto LAB_00b7bd34;
  while( true ) {
    pcVar4 = pcVar4 + 1;
    __n = __n - 1;
    lVar8 = lVar8 + -0x100000000;
    if (__n == 0) break;
LAB_00b7be04:
    local_100 = pcVar9;
    local_f8 = pcVar9;
    if (*pcVar4 != '\0') {
      sVar5 = lVar8 >> 0x20;
      if ((long)pcVar9 - (long)param_4 < (long)sVar5) goto LAB_00b7bd48;
      pcVar6 = pcVar9 + -sVar5;
      local_f8 = pcVar6;
      memcpy(pcVar6,pcVar4,sVar5);
      if (*pcVar6 < '\0') {
        if ((long)pcVar6 - (long)param_4 < 1) goto LAB_00b7bd48;
        local_f8 = pcVar6 + -1;
        __n = (ulong)((int)__n + 1);
        pcVar6[-1] = '\0';
      }
      iVar2 = mbedtls_asn1_write_len(&local_f8,param_4,(long)(int)__n);
      if (iVar2 < 0) goto LAB_00b7bd4c;
      iVar3 = mbedtls_asn1_write_tag(&local_f8,param_4,2);
      if (iVar3 < 0) goto LAB_00b7befc;
      iVar2 = iVar2 + (int)__n + iVar3;
      if (-1 < iVar2) {
        lVar7 = iVar2 + lVar7;
        local_100 = pcVar9 + -(long)iVar2;
        iVar2 = mbedtls_asn1_write_len(&local_100,param_4,lVar7);
        if (-1 < iVar2) {
          iVar3 = mbedtls_asn1_write_tag(&local_100,param_4,0x30);
          if (iVar3 < 0) {
LAB_00b7befc:
            iVar2 = iVar3;
          }
          else {
            sVar5 = lVar7 + iVar2 + (long)iVar3;
            memmove(param_4,local_100,sVar5);
            iVar2 = 0;
            *param_6 = sVar5;
          }
        }
      }
      goto LAB_00b7bd4c;
    }
  }
LAB_00b7bd34:
  iVar2 = -0x68;
LAB_00b7bd4c:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

