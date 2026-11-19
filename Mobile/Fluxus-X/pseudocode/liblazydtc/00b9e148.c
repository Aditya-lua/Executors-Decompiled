/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9e148
 */

/* WARNING: Removing unreachable block (ram,0x00b9df24) */

int mbedtls_psa_mac_verify_setup
              (uint *param_1,short *param_2,void *param_3,ulong param_4,uint param_5)

{
  uint *puVar1;
  uint uVar2;
  short sVar3;
  long lVar4;
  ulong *puVar5;
  int iVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  ulong *puVar10;
  ulong *puVar11;
  ulong uVar12;
  ulong __n;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uStack_f0;
  ulong auStack_e8 [18];
  long lStack_58;
  
  lVar4 = tpidr_el0;
  lStack_58 = *(long *)(lVar4 + 0x28);
  if (*param_1 != 0) {
    iVar6 = -0x89;
    goto LAB_00b9dd48;
  }
  *param_1 = param_5;
  if ((param_5 & 0xffc07fff) == 0x3c00200) {
    puVar1 = param_1 + 2;
    mbedtls_cipher_init(puVar1);
    sVar3 = param_2[1];
    if ((*param_2 == 0x2301) && ((iVar6 = -0x86, sVar3 == 0x40 || (sVar3 == 0x80))))
    goto LAB_00b9e0e0;
    lVar7 = mbedtls_cipher_info_from_psa(0x3c00200,*param_2,sVar3,0);
    if (lVar7 != 0) {
      iVar6 = mbedtls_cipher_setup(puVar1,lVar7);
      if (iVar6 == 0) {
        mbedtls_cipher_cmac_starts(puVar1,param_3,param_2[1]);
      }
      iVar6 = mbedtls_to_psa_error();
      goto joined_r0x00b9e0dc;
    }
    iVar6 = -0x86;
    uVar2 = *param_1;
    goto joined_r0x00b9e0e4;
  }
  if ((param_5 & 0x7fc00000) != 0x3800000) {
    memset(param_1,0,0x188);
    iVar6 = -0x86;
    goto LAB_00b9dd48;
  }
  uVar2 = param_5 & 0xff | 0x2000000;
  param_1[2] = 0;
  uVar8 = 0x30;
  __n = 0x40;
  uVar9 = 0x14;
  uStack_f0 = param_4;
  switch(param_5 & 0xff) {
  case 3:
  case 8:
  case 9:
    break;
  case 4:
  case 5:
    goto switchD_00b9de54_caseD_4;
  default:
    uVar9 = (ulong)(uVar2 == 0x2000013) << 6;
switchD_00b9de54_caseD_4:
    uVar8 = uVar9;
    if (((param_5 - 4 & 0xff) < 6) && ((0x33U >> (ulong)(param_5 - 4 & 0x1f) & 1) != 0)) {
      __n = 0x40;
      break;
    }
switchD_00b9de54_caseD_a:
    param_5 = param_5 - 10;
    if (((param_5 & 0xff) < 9) && ((0x1cfU >> (ulong)(param_5 & 0x1f) & 1) != 0)) {
      __n = *(ulong *)(&DAT_00787740 + (long)(char)param_5 * 8);
      break;
    }
    __n = 0x48;
    if (uVar2 != 0x2000013) {
      __n = 0;
    }
    param_1[2] = uVar2;
    if (uVar8 <= __n) goto LAB_00b9df3c;
    iVar6 = -0x86;
    goto LAB_00b9e0e0;
  case 10:
  case 0x12:
    goto switchD_00b9de54_caseD_a;
  case 0xb:
  case 0xc:
  case 0xd:
    __n = 0x80;
    break;
  case 0x10:
    __n = 0x90;
    break;
  case 0x11:
    __n = 0x88;
  }
  param_1[2] = uVar2;
LAB_00b9df3c:
  if (__n < param_4) {
    iVar6 = psa_hash_compute(uVar2,param_3,param_4,auStack_e8,0x90,&uStack_f0);
    if (iVar6 == 0) {
      param_4 = uStack_f0;
      if (uStack_f0 == 0) goto LAB_00b9e078;
      goto LAB_00b9df88;
    }
  }
  else {
    if (param_4 == 0) {
LAB_00b9e078:
      memset(auStack_e8,0x36,__n);
      param_4 = 0;
      uVar8 = __n;
    }
    else {
      memcpy(auStack_e8,param_3,param_4);
LAB_00b9df88:
      uVar9 = param_4;
      if (param_4 < 2) {
        uVar9 = 1;
      }
      uVar8 = 0;
      if (uVar9 < 0x20) {
LAB_00b9dfdc:
        do {
          *(byte *)((long)auStack_e8 + uVar8) = *(byte *)((long)auStack_e8 + uVar8) ^ 0x36;
          uVar8 = uVar8 + 1;
        } while (uVar8 < param_4);
      }
      else {
        uVar8 = uVar9 & 0xffffffffffffffe0;
        puVar10 = auStack_e8 + 2;
        uVar12 = uVar8;
        do {
          uVar12 = uVar12 - 0x20;
          puVar10[-1] = puVar10[-1] ^ 0x3636363636363636;
          puVar10[-2] = puVar10[-2] ^ 0x3636363636363636;
          puVar10[1] = puVar10[1] ^ 0x3636363636363636;
          *puVar10 = *puVar10 ^ 0x3636363636363636;
          puVar10 = puVar10 + 4;
        } while (uVar12 != 0);
        if (uVar9 != uVar8) goto LAB_00b9dfdc;
      }
      uVar8 = __n - param_4;
      memset((void *)((long)auStack_e8 + param_4),0x36,uVar8);
      uVar9 = 0;
      if (0x1f < param_4) {
        uVar9 = param_4 & 0xffffffffffffffe0;
        puVar10 = auStack_e8 + 2;
        puVar11 = (ulong *)(param_1 + 0x42);
        uVar12 = uVar9;
        do {
          puVar5 = puVar10 + -1;
          uVar13 = puVar10[-2];
          uVar15 = puVar10[1];
          uVar14 = *puVar10;
          puVar10 = puVar10 + 4;
          uVar12 = uVar12 - 0x20;
          puVar11[-1] = *puVar5 ^ 0x6a6a6a6a6a6a6a6a;
          puVar11[-2] = uVar13 ^ 0x6a6a6a6a6a6a6a6a;
          puVar11[1] = uVar15 ^ 0x6a6a6a6a6a6a6a6a;
          *puVar11 = uVar14 ^ 0x6a6a6a6a6a6a6a6a;
          puVar11 = puVar11 + 4;
        } while (uVar12 != 0);
        if (param_4 == uVar9) goto LAB_00b9e090;
      }
      do {
        uVar12 = uVar9 + 1;
        *(byte *)((long)param_1 + uVar9 + 0xf8) = *(byte *)((long)auStack_e8 + uVar9) ^ 0x6a;
        uVar9 = uVar12;
      } while (param_4 != uVar12);
    }
LAB_00b9e090:
    memset((void *)((long)param_1 + param_4 + 0xf8),0x5c,uVar8);
    iVar6 = psa_hash_setup(param_1 + 4,uVar2);
    if (iVar6 == 0) {
      iVar6 = psa_hash_update(param_1 + 4,auStack_e8,__n);
    }
  }
  mbedtls_platform_zeroize(auStack_e8,0x90);
joined_r0x00b9e0dc:
  if (iVar6 != 0) {
LAB_00b9e0e0:
    uVar2 = *param_1;
joined_r0x00b9e0e4:
    if (uVar2 != 0) {
      if ((uVar2 & 0xffc07fff) == 0x3c00200) {
        mbedtls_cipher_free(param_1 + 2);
        *param_1 = 0;
      }
      else if ((uVar2 & 0x7fc00000) == 0x3800000) {
        mbedtls_platform_zeroize(param_1 + 0x3e,0x90);
        psa_hash_abort(param_1 + 4);
        *param_1 = 0;
      }
      else {
        memset(param_1,0,0x188);
      }
    }
  }
LAB_00b9dd48:
  if (*(long *)(lVar4 + 0x28) != lStack_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar6;
}

