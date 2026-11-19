/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8d94c
 */

int psa_key_derivation_output_key_custom
              (long param_1,int *param_2,int *param_3,undefined8 param_4,long param_5,
              undefined4 *param_6)

{
  ushort uVar1;
  long lVar2;
  ushort *puVar3;
  int iVar4;
  undefined8 uVar5;
  byte *__ptr;
  void *pvVar6;
  ushort *puVar7;
  ulong __size;
  size_t __size_00;
  ushort uVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 local_178;
  ushort *local_170;
  ulong local_168;
  ulong local_160;
  undefined1 auStack_158 [104];
  undefined1 auStack_f0 [24];
  ulong local_d8;
  undefined1 auStack_98 [16];
  undefined1 auStack_88 [20];
  int local_74;
  long local_70;
  
  lVar2 = tpidr_el0;
  local_70 = *(long *)(lVar2 + 0x28);
  local_178 = 0;
  local_170 = (ushort *)0x0;
  *param_6 = 0;
  iVar4 = -0x87;
  if (((*(short *)(param_1 + 2) == 0) || (param_5 != 0)) || (*param_3 != 0)) goto LAB_00b8da90;
  if (*param_2 == 0) {
    iVar4 = -0x89;
    goto LAB_00b8da90;
  }
  if ((*(byte *)(param_2 + 1) & 1) == 0) {
    iVar4 = -0x85;
    goto LAB_00b8da90;
  }
  iVar4 = FUN_00b8785c(param_1,&local_170,&local_178);
  puVar3 = local_170;
  if (iVar4 == 0) {
    uVar8 = *(ushort *)(param_1 + 2);
    uVar9 = (ulong)uVar8;
    uVar10 = uVar9 + 7;
    __size = uVar10 >> 3;
    uVar1 = *local_170;
    local_168 = __size;
    local_160 = uVar9;
    if ((uVar1 & 0x7000) == 0x4000) {
LAB_00b8da40:
      iVar4 = -0x87;
    }
    else {
      if ((uVar1 & 0xcf00) == 0x4100) {
        if ((uVar1 & 0xc0) == 0) {
          local_74 = 1;
          mbedtls_mpi_init(auStack_88);
          mbedtls_mpi_init(auStack_98);
          uVar8 = *puVar3;
          if ((uVar8 & 0xcf00) != 0x4100) {
            uVar8 = 0;
          }
          iVar4 = mbedtls_ecc_group_from_psa(uVar8,uVar9);
          if (iVar4 == 0) {
            __ptr = (byte *)0x0;
            uVar5 = 0xffffff98;
LAB_00b8dc88:
            iVar4 = mbedtls_to_psa_error(uVar5);
            if (iVar4 != 0) {
LAB_00b8dc94:
              free(__ptr);
              __ptr = (byte *)0x0;
            }
          }
          else {
            mbedtls_ecp_group_init(auStack_158);
            uVar5 = mbedtls_ecp_group_load(auStack_158,iVar4);
            if (((int)uVar5 != 0) ||
               (uVar5 = mbedtls_mpi_sub_int(auStack_98,auStack_f0,2), (int)uVar5 != 0)) {
              __ptr = (byte *)0x0;
              goto LAB_00b8dc88;
            }
            uVar10 = local_d8 + 7 >> 3;
            __ptr = calloc(1,uVar10);
            if (__ptr == (byte *)0x0) {
              uVar5 = 0xffffff96;
              goto LAB_00b8dc88;
            }
            do {
              iVar4 = psa_key_derivation_output_bytes(param_2,__ptr,uVar10);
              if (iVar4 != 0) goto LAB_00b8dc94;
              if ((local_d8 & 7) != 0) {
                *__ptr = *__ptr & (char)(1 << (local_d8 & 7)) - 1U;
              }
              uVar5 = mbedtls_mpi_read_binary(auStack_88,__ptr,uVar10);
              if (((int)uVar5 != 0) ||
                 (uVar5 = mbedtls_mpi_lt_mpi_ct(auStack_98,auStack_88,&local_74), (int)uVar5 != 0))
              goto LAB_00b8dc88;
            } while (local_74 != 0);
            uVar5 = mbedtls_mpi_add_int(auStack_88,auStack_88,1);
            if (((int)uVar5 != 0) ||
               (uVar5 = mbedtls_mpi_write_binary(auStack_88,__ptr,uVar10), (int)uVar5 != 0))
            goto LAB_00b8dc88;
            iVar4 = 0;
          }
          mbedtls_mpi_free(auStack_88);
          mbedtls_mpi_free(auStack_98);
          if (iVar4 != 0) goto LAB_00b8dd64;
          uVar8 = (ushort)local_160;
          goto LAB_00b8dcb8;
        }
        if (uVar8 == 0xff) {
          __size_00 = 0x20;
        }
        else {
          if (uVar8 != 0x1c0) {
            __ptr = (byte *)0x0;
            iVar4 = -0x87;
            goto LAB_00b8dd64;
          }
          __size_00 = 0x38;
        }
        __ptr = calloc(1,__size_00);
        if (__ptr == (byte *)0x0) {
LAB_00b8dd60:
          iVar4 = -0x8d;
        }
        else {
          iVar4 = psa_key_derivation_output_bytes(param_2,__ptr,__size_00);
          if (iVar4 == 0) {
            if (uVar8 == 0x1c0) {
              uVar8 = 0x1c0;
              *__ptr = *__ptr & 0xfc;
              __ptr[0x37] = __ptr[0x37] | 0x80;
            }
            else {
              if (uVar8 != 0xff) {
                iVar4 = -0x97;
                goto LAB_00b8dd64;
              }
              uVar8 = 0xff;
              *__ptr = *__ptr & 0xf8;
              __ptr[0x1f] = __ptr[0x1f] & 0x3f | 0x40;
            }
            goto LAB_00b8dcb8;
          }
        }
      }
      else {
        if (((uVar1 & 0x7000) != 0x2000) && ((uVar1 & 0x7000) != 0x1000)) {
          iVar4 = -0x86;
          goto joined_r0x00b8dcf4;
        }
        if ((uVar8 & 7) != 0) goto LAB_00b8da40;
        __ptr = calloc(1,__size);
        if (__ptr == (byte *)0x0) {
          iVar4 = -0x8d;
          puVar3 = local_170;
          goto joined_r0x00b8dcf4;
        }
        iVar4 = psa_key_derivation_output_bytes(param_2,__ptr,__size);
        if (iVar4 != 0) goto LAB_00b8dd64;
        if (((0x3f < uVar10) && (*puVar3 == 0x2301)) &&
           ((mbedtls_des_key_set_parity(__ptr), 0x7f < uVar10 &&
            (mbedtls_des_key_set_parity(__ptr + 8), 0xbf < uVar10)))) {
          mbedtls_des_key_set_parity(__ptr + 0x10);
        }
LAB_00b8dcb8:
        puVar3[1] = uVar8;
        if ((*(uint *)(puVar3 + 2) < 0x100) ||
           (iVar4 = psa_driver_wrapper_get_key_buffer_size(puVar3,&local_168), iVar4 == 0)) {
          uVar10 = local_168;
          if (*(long *)(puVar3 + 0x14) == 0) {
            pvVar6 = calloc(1,local_168);
            *(void **)(puVar3 + 0x14) = pvVar6;
            if (pvVar6 == (void *)0x0) goto LAB_00b8dd60;
            *(ulong *)(puVar3 + 0x18) = uVar10;
            iVar4 = -0x87;
            if (*(uint *)(puVar3 + 2) < 0x100) {
              iVar4 = psa_import_key_into_slot
                                (puVar3,__ptr,__size,pvVar6,uVar10,puVar3 + 0x18,&local_160);
            }
            if (local_160 != puVar3[1]) {
              iVar4 = -0x87;
            }
          }
          else {
            iVar4 = -0x8b;
          }
        }
      }
LAB_00b8dd64:
      free(__ptr);
      puVar7 = local_170;
      puVar3 = local_170;
      if ((iVar4 == 0) &&
         (((char)local_170[2] == '\0' ||
          (iVar4 = psa_save_persistent_key
                             (local_170,*(undefined8 *)(local_170 + 0x14),
                              *(undefined8 *)(local_170 + 0x18)), puVar3 = local_170, iVar4 == 0))))
      {
        *param_6 = *(undefined4 *)(puVar7 + 10);
        if (*(int *)(puVar7 + 0xc) == 1) {
          iVar4 = 0;
          puVar7[0xc] = 2;
          puVar7[0xd] = 0;
          goto LAB_00b8da90;
        }
        iVar4 = -0x97;
        *param_6 = 0;
        puVar3 = local_170;
      }
    }
  }
joined_r0x00b8dcf4:
  local_170 = puVar3;
  if (puVar3 == (ushort *)0x0) goto LAB_00b8da90;
  puVar7 = puVar3 + 0x14;
  if (*(long *)puVar7 != 0) {
    mbedtls_zeroize_and_free(*(long *)puVar7,*(undefined8 *)(puVar3 + 0x18));
  }
  puVar7[0] = 0;
  puVar7[1] = 0;
  puVar7[2] = 0;
  puVar7[3] = 0;
  puVar3[0x18] = 0;
  puVar3[0x19] = 0;
  puVar3[0x1a] = 0;
  puVar3[0x1b] = 0;
  if (*(int *)(puVar3 + 0xc) - 2U < 2) {
    if (*(long *)(puVar3 + 0x10) != 1) {
LAB_00b8da60:
      puVar3[0x18] = 0;
      puVar3[0x19] = 0;
      puVar3[0x1a] = 0;
      puVar3[0x1b] = 0;
      puVar3[0xc] = 0;
      puVar3[0xd] = 0;
      puVar3[0xe] = 0;
      puVar3[0xf] = 0;
      puVar3[8] = 0;
      puVar3[9] = 0;
      puVar3[10] = 0;
      puVar3[0xb] = 0;
      puVar3[0x14] = 0;
      puVar3[0x15] = 0;
      puVar3[0x16] = 0;
      puVar3[0x17] = 0;
      puVar3[0x10] = 0;
      puVar3[0x11] = 0;
      puVar3[0x12] = 0;
      puVar3[0x13] = 0;
      puVar3[4] = 0;
      puVar3[5] = 0;
      puVar3[6] = 0;
      puVar3[7] = 0;
      puVar3[0] = 0;
      puVar3[1] = 0;
      puVar3[2] = 0;
      puVar3[3] = 0;
      goto LAB_00b8da90;
    }
  }
  else if ((*(int *)(puVar3 + 0xc) != 1) || (*(long *)(puVar3 + 0x10) != 0)) goto LAB_00b8da60;
  uVar8 = puVar3[0xe];
  puVar3[0x14] = 0;
  puVar3[0x15] = 0;
  puVar3[0x16] = 0;
  puVar3[0x17] = 0;
  puVar3[0x18] = 0;
  puVar3[0x19] = 0;
  puVar3[0x1a] = 0;
  puVar3[0x1b] = 0;
  puVar3[4] = 0;
  puVar3[5] = 0;
  puVar3[6] = 0;
  puVar3[7] = 0;
  puVar3[0] = 0;
  puVar3[1] = 0;
  puVar3[2] = 0;
  puVar3[3] = 0;
  puVar3[0xc] = 0;
  puVar3[0xd] = 0;
  puVar3[0xe] = 0;
  puVar3[0xf] = 0;
  puVar3[8] = 0;
  puVar3[9] = 0;
  puVar3[10] = 0;
  puVar3[0xb] = 0;
  puVar3[0x10] = 0;
  puVar3[0x11] = 0;
  puVar3[0x12] = 0;
  puVar3[0x13] = 0;
  psa_free_key_slot((char)uVar8,puVar3);
LAB_00b8da90:
  if (*(long *)(lVar2 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

