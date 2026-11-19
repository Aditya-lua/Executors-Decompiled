/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7e1ec
 */

int mbedtls_mpi_write_string(long *param_1,int param_2,char *param_3,ulong param_4,ulong *param_5)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  bool bVar5;
  bool bVar6;
  ulong uVar7;
  char *pcVar8;
  uint uVar9;
  char cVar10;
  ulong uVar11;
  ulong uVar12;
  long lVar13;
  char *__dest;
  size_t __n;
  ulong *local_90;
  undefined4 local_88;
  ulong *local_80;
  ushort local_78;
  undefined2 local_76;
  ulong local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  if (0xe < param_2 - 2U) {
    iVar2 = -4;
    goto LAB_00b7e6e8;
  }
  uVar3 = mbedtls_mpi_core_bitlen(*param_1,*(undefined2 *)((long)param_1 + 10));
  uVar3 = ((uVar3 >> (3 < param_2)) >> (0xf < param_2)) + 3;
  uVar3 = (uVar3 & 1) + uVar3;
  if (param_4 < uVar3) {
    *param_5 = uVar3;
    iVar2 = -8;
    goto LAB_00b7e6e8;
  }
  local_88 = 1;
  local_90 = (ulong *)0x0;
  if ((short)param_1[1] == -1) {
    __dest = param_3 + 1;
    *param_3 = '-';
    param_4 = param_4 - 1;
    if (param_2 == 0x10) goto LAB_00b7e2a8;
LAB_00b7e550:
    iVar2 = mbedtls_mpi_copy(&local_90,param_1);
    uVar9 = local_88;
    if (iVar2 == 0) {
      uVar9 = local_88 & 0xffff;
      if ((short)local_88 == -1) {
        uVar9 = 1;
        local_88 = CONCAT22(local_88._2_2_,1);
      }
      uVar11 = (ulong)param_2;
      __n = 0;
      pcVar8 = __dest + param_4;
      uVar3 = -uVar11;
      if (-1 < (long)uVar11) {
        uVar3 = uVar11;
      }
      do {
        if (param_4 <= __n) {
          iVar2 = -8;
          uVar9 = local_88;
          goto joined_r0x00b7e724;
        }
        uVar4 = (ulong)local_88._2_2_;
        if (uVar4 == 0) {
          uVar4 = 0;
        }
        else if (param_2 == 2) {
          uVar4 = *local_90 & 1;
        }
        else {
          uVar7 = 0;
          do {
            uVar4 = uVar4 - 1;
            uVar12 = local_90[uVar4];
            iVar2 = 0;
            if (uVar11 != 0) {
              iVar2 = (int)((uVar12 >> 0x20 | uVar7 << 0x20) / uVar11);
            }
            uVar7 = uVar12 & 0xffffffff |
                    (ulong)(uint)((int)(uVar12 >> 0x20) - iVar2 * param_2) << 0x20;
            uVar12 = 0;
            if (uVar11 != 0) {
              uVar12 = uVar7 / uVar11;
            }
            uVar7 = uVar7 - uVar12 * uVar11;
          } while (uVar4 != 0);
          uVar4 = uVar11 - uVar7;
          if (-1 < (short)uVar9 || uVar7 == 0) {
            uVar4 = uVar7;
          }
        }
        local_76 = 1;
        local_80 = &local_70;
        local_78 = (ushort)(param_2 >> 0x1f) | 1;
        local_70 = uVar3;
        iVar2 = mbedtls_mpi_div_mpi(&local_90,0,&local_90,&local_80);
        uVar9 = local_88;
        if (iVar2 != 0) goto joined_r0x00b7e724;
        if (uVar4 < 10) {
          cVar10 = (char)uVar4 + '0';
        }
        else {
          cVar10 = (char)uVar4 + '7';
        }
        pcVar8 = pcVar8 + -1;
        *pcVar8 = cVar10;
        uVar4 = (ulong)local_88._2_2_;
        __n = __n + 1;
        do {
          if (uVar4 == 0) goto LAB_00b7e6a8;
          lVar13 = uVar4 - 1;
          uVar4 = uVar4 - 1;
        } while (local_90[lVar13] == 0);
        uVar9 = local_88 & 0xffff;
      } while (uVar9 != 0);
LAB_00b7e6a8:
      memmove(__dest,pcVar8,__n);
      __dest = __dest + __n;
      goto LAB_00b7e6b8;
    }
  }
  else {
    __dest = param_3;
    if (param_2 != 0x10) goto LAB_00b7e550;
LAB_00b7e2a8:
    uVar3 = (ulong)*(ushort *)((long)param_1 + 10);
    if (uVar3 != 0) {
      lVar13 = uVar3 * 8 + -8;
      uVar11 = 0;
      bVar6 = false;
      do {
        uVar4 = *(ulong *)(*param_1 + lVar13 + uVar11 * 8);
        if ((-uVar3 - 6 == uVar11) || (bVar5 = false, bVar6 || uVar4 >> 0x38 != 0)) {
          cVar10 = "0123456789ABCDEF"[uVar4 >> 0x38 & 0xf];
          *__dest = "0123456789ABCDEF"[uVar4 >> 0x3c];
          __dest[1] = cVar10;
          __dest = __dest + 2;
          bVar5 = true;
          uVar4 = *(ulong *)(*param_1 + lVar13 + uVar11 * 8);
        }
        if (((-uVar3 - 5 == uVar11) || (bVar5)) || ((uVar4 & 0xff000000000000) != 0)) {
          cVar10 = "0123456789ABCDEF"[uVar4 >> 0x30 & 0xf];
          *__dest = "0123456789ABCDEF"[((ushort)(uVar4 >> 0x30) & 0xff) >> 4];
          __dest[1] = cVar10;
          __dest = __dest + 2;
          bVar6 = true;
          uVar4 = *(ulong *)(*param_1 + lVar13 + uVar11 * 8);
        }
        else {
          bVar6 = false;
        }
        uVar9 = (uint)(uVar4 >> 0x28) & 0xff;
        if (((-uVar3 - 4 == uVar11) || (bVar6)) || (uVar9 != 0)) {
          cVar10 = "0123456789ABCDEF"[uVar4 >> 0x28 & 0xf];
          *__dest = "0123456789ABCDEF"[uVar9 >> 4];
          __dest[1] = cVar10;
          __dest = __dest + 2;
          bVar6 = true;
          uVar4 = *(ulong *)(*param_1 + lVar13 + uVar11 * 8);
        }
        else {
          bVar6 = false;
        }
        if (((-uVar3 - 3 == uVar11) || (bVar6)) || ((uVar4 & 0xff00000000) != 0)) {
          cVar10 = "0123456789ABCDEF"[uVar4 >> 0x20 & 0xf];
          *__dest = "0123456789ABCDEF"[((uint)(uVar4 >> 0x20) & 0xff) >> 4];
          __dest[1] = cVar10;
          __dest = __dest + 2;
          bVar6 = true;
          uVar4 = *(ulong *)(*param_1 + lVar13 + uVar11 * 8);
        }
        else {
          bVar6 = false;
        }
        if (((-uVar3 - 2 == uVar11) || (bVar6)) || ((uVar4 & 0xff000000) != 0)) {
          cVar10 = "0123456789ABCDEF"[uVar4 >> 0x18 & 0xf];
          *__dest = "0123456789ABCDEF"[((uint)(uVar4 >> 0x18) & 0xff) >> 4];
          __dest[1] = cVar10;
          __dest = __dest + 2;
          bVar6 = true;
          uVar4 = *(ulong *)(*param_1 + lVar13 + uVar11 * 8);
        }
        else {
          bVar6 = false;
        }
        uVar9 = (uint)uVar4 >> 0x10 & 0xff;
        if (((~uVar3 == uVar11) || (bVar6)) || (uVar9 != 0)) {
          cVar10 = "0123456789ABCDEF"[uVar4 >> 0x10 & 0xf];
          *__dest = "0123456789ABCDEF"[uVar9 >> 4];
          __dest[1] = cVar10;
          __dest = __dest + 2;
          uVar4 = *(ulong *)(*param_1 + lVar13 + uVar11 * 8);
          uVar7 = uVar4 >> 8 & 0xff;
LAB_00b7e4d8:
          cVar10 = "0123456789ABCDEF"[uVar4 >> 8 & 0xf];
          *__dest = "0123456789ABCDEF"[uVar7 >> 4];
          __dest[1] = cVar10;
          uVar4 = *(ulong *)(*param_1 + lVar13 + uVar11 * 8);
          uVar9 = (uint)uVar4 & 0xff;
          pcVar8 = __dest + 2;
LAB_00b7e504:
          cVar10 = "0123456789ABCDEF"[uVar4 & 0xf];
          *pcVar8 = "0123456789ABCDEF"[uVar9 >> 4];
          __dest = pcVar8 + 2;
          pcVar8[1] = cVar10;
          bVar6 = true;
        }
        else {
          uVar7 = uVar4 >> 8 & 0xff;
          if ((int)uVar7 != 0) goto LAB_00b7e4d8;
          uVar9 = (uint)uVar4 & 0xff;
          pcVar8 = __dest;
          if ((1 - uVar3 == uVar11) || (bVar6 = false, (uVar4 & 0xff) != 0)) goto LAB_00b7e504;
        }
        uVar11 = uVar11 - 1;
      } while (-uVar11 != uVar3);
    }
LAB_00b7e6b8:
    *__dest = '\0';
    iVar2 = 0;
    *param_5 = (ulong)(__dest + (1 - (long)param_3));
    uVar9 = local_88;
  }
joined_r0x00b7e724:
  if (local_90 != (ulong *)0x0) {
    local_88._2_2_ = (ushort)(uVar9 >> 0x10);
    uVar3 = (ulong)local_88._2_2_;
    local_88 = uVar9;
    mbedtls_zeroize_and_free(local_90,uVar3 << 3);
  }
  local_88 = 1;
  local_90 = (ulong *)0x0;
LAB_00b7e6e8:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

