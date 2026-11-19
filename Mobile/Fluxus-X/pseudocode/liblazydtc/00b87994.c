/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b87994
 */

int psa_copy_key(undefined8 param_1,short *param_2,undefined4 *param_3)

{
  size_t sVar1;
  uint uVar2;
  int iVar3;
  short sVar4;
  long lVar5;
  undefined8 *puVar6;
  int iVar7;
  int iVar8;
  undefined8 *puVar9;
  short *psVar10;
  bool bVar11;
  int iVar12;
  int iVar13;
  int iVar14;
  long lVar15;
  void *__dest;
  void *pvVar16;
  short sVar17;
  size_t local_a0;
  size_t sStack_98;
  undefined8 local_90;
  undefined8 uStack_88;
  ulong local_80;
  undefined8 *local_78;
  short *local_70;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  local_78 = (undefined8 *)0x0;
  local_70 = (short *)0x0;
  local_80 = *(ulong *)(param_2 + 8);
  uStack_88 = *(undefined8 *)(param_2 + 4);
  local_90 = *(undefined8 *)param_2;
  local_a0 = 0;
  sStack_98 = 0;
  *param_3 = 0;
  iVar12 = psa_get_and_lock_key_slot(param_1,&local_70);
  psVar10 = local_70;
  puVar6 = local_78;
  if (iVar12 == 0) {
    uVar2 = *(uint *)(local_70 + 4);
    if ((uVar2 >> 1 & 1) == 0) {
      local_70 = (short *)0x0;
      psa_unregister_read_under_mutex(psVar10);
      iVar12 = -0x85;
      puVar6 = local_78;
    }
    else {
      if ((*param_2 == 0) || (*param_2 == *local_70)) {
        sVar4 = param_2[1];
        sVar17 = local_70[1];
        if ((sVar4 == 0) || (bVar11 = sVar4 == sVar17, sVar17 = sVar4, bVar11)) {
          iVar7 = uStack_88._4_4_;
          local_90 = CONCAT62(CONCAT42(local_90._4_4_,sVar17),*local_70);
          iVar12 = *(int *)(local_70 + 6);
          sVar4 = *local_70;
          iVar13 = FUN_00b90dcc(sVar4,uStack_88._4_4_,iVar12);
          iVar8 = (int)local_80;
          iVar3 = *(int *)(psVar10 + 8);
          iVar14 = FUN_00b90dcc(sVar4,local_80 & 0xffffffff,iVar3);
          if ((((iVar12 == 0) || (iVar7 == 0)) || (iVar13 != 0)) &&
             (((iVar3 == 0 || (iVar8 == 0)) || (iVar14 != 0)))) {
            local_80 = CONCAT44(local_80._4_4_,iVar14);
            uStack_88 = CONCAT44(iVar13,(uint)uStack_88 & uVar2);
            iVar12 = FUN_00b8785c(&local_90,&local_78,&sStack_98);
            puVar9 = local_78;
            puVar6 = local_78;
            if (iVar12 == 0) {
              if ((*(uint *)(local_70 + 2) ^ *(uint *)((long)local_78 + 4)) < 0x100) {
                if (local_90._4_4_ < 0x100) {
                  if (local_78[5] == 0) {
                    pvVar16 = *(void **)(local_70 + 0x14);
                    sVar1 = *(size_t *)(local_70 + 0x18);
                    __dest = calloc(1,sVar1);
                    puVar9[5] = __dest;
                    if (__dest == (void *)0x0) {
LAB_00b87ca4:
                      iVar12 = -0x8d;
                      puVar6 = local_78;
                    }
                    else {
                      puVar9[6] = sVar1;
                      memcpy(__dest,pvVar16,sVar1);
                      if ((*(char *)((long)puVar9 + 4) == '\0') ||
                         (iVar12 = psa_save_persistent_key(puVar9,puVar9[5],puVar9[6]),
                         puVar6 = local_78, iVar12 == 0)) {
                        *param_3 = *(undefined4 *)((long)puVar9 + 0x14);
                        if (*(int *)(puVar9 + 3) == 1) {
                          *(undefined4 *)(puVar9 + 3) = 2;
                          iVar12 = psa_unregister_read_under_mutex(local_70);
                          goto LAB_00b87b40;
                        }
                        iVar12 = -0x97;
                        *param_3 = 0;
                        puVar6 = local_78;
                      }
                    }
                  }
                  else {
                    iVar12 = -0x8b;
                  }
                }
                else {
                  iVar12 = psa_driver_wrapper_get_key_buffer_size(&local_90,&local_a0);
                  puVar6 = local_78;
                  sVar1 = local_a0;
                  if (iVar12 == 0) {
                    if (local_78[5] == 0) {
                      pvVar16 = calloc(1,local_a0);
                      puVar6[5] = pvVar16;
                      if (pvVar16 != (void *)0x0) {
                        puVar6[6] = sVar1;
                        goto LAB_00b87b2c;
                      }
                      goto LAB_00b87ca4;
                    }
                    iVar12 = -0x8b;
                  }
                }
              }
              else {
                iVar12 = -0x86;
              }
            }
            goto joined_r0x00b87cac;
          }
        }
      }
LAB_00b87b2c:
      iVar12 = -0x87;
      puVar6 = local_78;
    }
  }
joined_r0x00b87cac:
  local_78 = puVar6;
  if (puVar6 != (undefined8 *)0x0) {
    lVar15 = puVar6[5];
    if (lVar15 != 0) {
      mbedtls_zeroize_and_free(lVar15,puVar6[6]);
    }
    puVar6[5] = 0;
    puVar6[6] = 0;
    if (*(int *)(puVar6 + 3) - 2U < 2) {
      if (puVar6[4] != 1) {
LAB_00b87a6c:
        puVar6[6] = 0;
        puVar6[3] = 0;
        puVar6[2] = 0;
        puVar6[5] = 0;
        puVar6[4] = 0;
        puVar6[1] = 0;
        *puVar6 = 0;
        goto LAB_00b87b38;
      }
    }
    else if ((*(int *)(puVar6 + 3) != 1) || (puVar6[4] != 0)) goto LAB_00b87a6c;
    puVar6[5] = 0;
    puVar6[6] = 0;
    puVar6[1] = 0;
    *puVar6 = 0;
    puVar6[3] = 0;
    puVar6[2] = 0;
    puVar6[4] = 0;
    psa_free_key_slot(*(undefined1 *)((long)puVar6 + 0x1c),puVar6);
  }
LAB_00b87b38:
  psa_unregister_read_under_mutex(local_70);
LAB_00b87b40:
  if (*(long *)(lVar5 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar12;
}

