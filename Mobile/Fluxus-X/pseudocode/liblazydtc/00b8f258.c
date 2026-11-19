/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8f258
 */

int psa_generate_key_custom
              (ushort *param_1,int *param_2,undefined8 param_3,long param_4,undefined4 *param_5)

{
  ushort uVar1;
  ushort uVar2;
  ulong uVar3;
  long lVar4;
  undefined8 *puVar5;
  size_t sVar6;
  int iVar7;
  long lVar8;
  ulong uVar9;
  void *pvVar10;
  uint uVar11;
  undefined8 *puVar12;
  size_t *psVar13;
  size_t local_80;
  size_t local_78;
  undefined8 *local_70;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  local_78 = 0;
  local_70 = (undefined8 *)0x0;
  *param_5 = 0;
  if ((param_1[1] == 0) || ((*param_1 & 0x7000) == 0x4000)) {
LAB_00b8f2cc:
    iVar7 = -0x87;
    goto LAB_00b8f2d0;
  }
  if (*param_1 == 0x7001) {
    if (*param_2 != 0) goto LAB_00b8f2cc;
  }
  else {
    iVar7 = -0x87;
    if ((param_4 != 0) || (*param_2 != 0)) goto LAB_00b8f2d0;
  }
  iVar7 = FUN_00b8785c(param_1,&local_70,&local_78);
  puVar12 = local_70;
  puVar5 = local_70;
  if (iVar7 != 0) goto joined_r0x00b8f5e4;
  pvVar10 = (void *)local_70[5];
  if (pvVar10 == (void *)0x0) {
    if (*(uint *)(param_1 + 2) < 0x100) {
      uVar1 = *param_1;
      uVar2 = param_1[1];
      uVar9 = (ulong)uVar2;
      if (((uVar1 & 0x7000) == 0x2000) || ((uVar1 & 0x7000) == 0x1000)) {
        iVar7 = psa_validate_unstructured_key_bit_size(uVar1);
        puVar5 = local_70;
        if (iVar7 != 0) goto joined_r0x00b8f5e4;
      }
      else if (uVar1 == 0x7001) {
        iVar7 = -0x86;
        if ((0xc00 < uVar9 - 0x400) || ((uVar2 & 7) != 0)) goto joined_r0x00b8f5e4;
      }
      else if ((uVar1 & 0xff00) != 0x7100) {
        if ((uVar1 & 0xff00) == 0x7200) {
          iVar7 = -0x86;
          uVar3 = uVar9 - 0x800 >> 10;
          if (((uVar3 | uVar9 << 0x36) < 7) && ((1L << (uVar3 & 0x3f) & 0x57U) != 0))
          goto LAB_00b8f568;
        }
        else {
          iVar7 = -0x86;
        }
        goto joined_r0x00b8f5e4;
      }
LAB_00b8f568:
      if ((((uVar1 & 0x7000) == 0x2000) || ((uVar1 & 0x7000) == 0x1000)) ||
         ((uVar1 & 0xcf00) == 0x4200)) {
LAB_00b8f5a4:
        uVar11 = uVar2 + 7 >> 3;
      }
      else if (uVar1 < 0x7001) {
        if (uVar1 == 0x4001) {
          uVar11 = (uVar2 >> 3) + 0x10;
        }
        else {
          if (uVar1 != 0x4002) goto LAB_00b8f678;
          uVar11 = (uint)(uVar2 >> 3) * 3 + 0x4a;
        }
      }
      else if (uVar1 == 0x7002) {
        uVar11 = (uint)(uVar2 >> 3) * 3 + 0x5a;
      }
      else if (uVar1 == 0x7001) {
        uVar11 = ((uVar2 >> 1) + 1 >> 3) * 9 + 0x3b;
      }
      else {
LAB_00b8f678:
        if ((uVar1 & 0xff00) == 0x4100) {
          uVar11 = uVar2 + 7 >> 2 | 1;
        }
        else {
          uVar11 = 0;
          if ((uVar1 & 0xff00) == 0x7100) goto LAB_00b8f5a4;
        }
      }
      local_80 = (size_t)uVar11;
LAB_00b8f5b8:
      sVar6 = local_80;
      pvVar10 = calloc(1,local_80);
      puVar12[5] = pvVar10;
      if (pvVar10 != (void *)0x0) {
        psVar13 = puVar12 + 6;
        *psVar13 = sVar6;
        goto LAB_00b8f33c;
      }
      iVar7 = -0x8d;
      puVar5 = local_70;
    }
    else {
      iVar7 = psa_driver_wrapper_get_key_buffer_size(param_1,&local_80);
      puVar5 = local_70;
      if (iVar7 == 0) {
        if (local_70[5] == 0) {
          puVar12 = local_70;
          goto LAB_00b8f5b8;
        }
        iVar7 = -0x8b;
      }
    }
  }
  else {
    psVar13 = local_70 + 6;
LAB_00b8f33c:
    if (*(uint *)(param_1 + 2) < 0x100) {
      iVar7 = psa_generate_key_internal(param_1);
      puVar12 = local_70;
      if (iVar7 == 0) {
        if (*(char *)((long)local_70 + 4) != '\0') {
          iVar7 = psa_save_persistent_key(local_70,local_70[5],local_70[6]);
          puVar5 = local_70;
          if (iVar7 != 0) goto joined_r0x00b8f5e4;
        }
        *param_5 = *(undefined4 *)((long)puVar12 + 0x14);
        if (*(int *)(puVar12 + 3) == 1) {
          iVar7 = 0;
          *(undefined4 *)(puVar12 + 3) = 2;
          goto LAB_00b8f2d0;
        }
        iVar7 = -0x97;
        *param_5 = 0;
        puVar5 = local_70;
        goto joined_r0x00b8f5e4;
      }
      puVar12 = local_70 + 5;
      pvVar10 = (void *)*puVar12;
      psVar13 = local_70 + 6;
      if (pvVar10 != (void *)0x0) goto LAB_00b8f3e0;
    }
    else {
      puVar12 = puVar12 + 5;
      iVar7 = -0x87;
      if ((*param_2 != 0 || param_4 != 0) && 0xff < *(uint *)(param_1 + 2)) {
        iVar7 = -0x86;
      }
LAB_00b8f3e0:
      mbedtls_zeroize_and_free(pvVar10,*psVar13);
    }
    *puVar12 = 0;
    *psVar13 = 0;
    puVar5 = local_70;
  }
joined_r0x00b8f5e4:
  local_70 = puVar5;
  if (puVar5 == (undefined8 *)0x0) goto LAB_00b8f2d0;
  lVar8 = puVar5[5];
  if (lVar8 != 0) {
    mbedtls_zeroize_and_free(lVar8,puVar5[6]);
  }
  puVar5[5] = 0;
  puVar5[6] = 0;
  if (*(int *)(puVar5 + 3) - 2U < 2) {
    if (puVar5[4] != 1) goto LAB_00b8f444;
  }
  else if ((*(int *)(puVar5 + 3) != 1) || (puVar5[4] != 0)) {
LAB_00b8f444:
    puVar5[6] = 0;
    puVar5[3] = 0;
    puVar5[2] = 0;
    puVar5[5] = 0;
    puVar5[4] = 0;
    puVar5[1] = 0;
    *puVar5 = 0;
    goto LAB_00b8f2d0;
  }
  puVar5[5] = 0;
  puVar5[6] = 0;
  puVar5[1] = 0;
  *puVar5 = 0;
  puVar5[3] = 0;
  puVar5[2] = 0;
  puVar5[4] = 0;
  psa_free_key_slot(*(undefined1 *)((long)puVar5 + 0x1c),puVar5);
LAB_00b8f2d0:
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar7;
}

