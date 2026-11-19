/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b87578
 */

int psa_import_key(short *param_1,void *param_2,ulong param_3,undefined4 *param_4)

{
  long lVar1;
  short *psVar2;
  short sVar3;
  int iVar4;
  void *__dest;
  long lVar5;
  void *pvVar6;
  ulong uVar7;
  long *plVar8;
  ulong local_60 [2];
  short *local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_60[1] = 0;
  local_50 = (short *)0x0;
  *param_4 = 0;
  if (param_3 == 0) {
    iVar4 = -0x87;
    goto LAB_00b87774;
  }
  if (param_3 >> 0x3d != 0) {
    iVar4 = -0x86;
    goto LAB_00b87774;
  }
  __dest = calloc(param_3,1);
  if (__dest == (void *)0x0) {
LAB_00b876a0:
    iVar4 = -0x8d;
  }
  else {
    memcpy(__dest,param_2,param_3);
    iVar4 = FUN_00b8785c(param_1,&local_50,local_60 + 1);
    psVar2 = local_50;
    if (iVar4 == 0) {
      pvVar6 = *(void **)(local_50 + 0x14);
      if (pvVar6 == (void *)0x0) {
        if (*(uint *)(param_1 + 2) < 0x100) {
          pvVar6 = calloc(1,param_3);
          *(void **)(psVar2 + 0x14) = pvVar6;
          if (pvVar6 == (void *)0x0) goto LAB_00b876a0;
          *(ulong *)(psVar2 + 0x18) = param_3;
          local_60[0] = (ulong)(ushort)psVar2[1];
          goto LAB_00b87660;
        }
      }
      else {
        local_60[0] = (ulong)(ushort)local_50[1];
        if (*(uint *)(param_1 + 2) < 0x100) {
LAB_00b87660:
          iVar4 = psa_import_key_into_slot
                            (param_1,__dest,param_3,pvVar6,*(undefined8 *)(psVar2 + 0x18),
                             psVar2 + 0x18,local_60);
          psVar2 = local_50;
          if (iVar4 == 0) {
            uVar7 = (ulong)(ushort)local_50[1];
            if (uVar7 == 0) {
              uVar7 = local_60[0] & 0xffffffff;
              local_50[1] = (short)local_60[0];
            }
            else if (local_60[0] != uVar7) goto LAB_00b876e8;
            if (local_60[0] < 0xfff9) {
              if (((*param_1 != 0) && (*param_1 != *local_50)) ||
                 (((ushort)param_1[1] != 0 && ((uint)(ushort)param_1[1] != ((uint)uVar7 & 0xffff))))
                 ) goto LAB_00b876e8;
              if (((char)local_50[2] == '\0') ||
                 (iVar4 = psa_save_persistent_key
                                    (local_50,*(undefined8 *)(local_50 + 0x14),
                                     *(undefined8 *)(local_50 + 0x18)), iVar4 == 0)) {
                *param_4 = *(undefined4 *)(psVar2 + 10);
                if (*(int *)(psVar2 + 0xc) == 1) {
                  psVar2[0xc] = 2;
                  psVar2[0xd] = 0;
                  free(__dest);
                  iVar4 = 0;
                  goto LAB_00b87774;
                }
                iVar4 = -0x97;
                *param_4 = 0;
              }
            }
            else {
              iVar4 = -0x86;
            }
          }
          goto LAB_00b876ec;
        }
      }
LAB_00b876e8:
      iVar4 = -0x87;
    }
  }
LAB_00b876ec:
  free(__dest);
  psVar2 = local_50;
  if (local_50 == (short *)0x0) goto LAB_00b87774;
  plVar8 = (long *)(local_50 + 0x14);
  lVar5 = *plVar8;
  if (lVar5 != 0) {
    mbedtls_zeroize_and_free(lVar5,*(undefined8 *)(local_50 + 0x18));
  }
  *plVar8 = 0;
  psVar2[0x18] = 0;
  psVar2[0x19] = 0;
  psVar2[0x1a] = 0;
  psVar2[0x1b] = 0;
  if (*(int *)(psVar2 + 0xc) - 2U < 2) {
    if (*(long *)(psVar2 + 0x10) != 1) goto LAB_00b87744;
  }
  else if ((*(int *)(psVar2 + 0xc) != 1) || (*(long *)(psVar2 + 0x10) != 0)) {
LAB_00b87744:
    psVar2[0x18] = 0;
    psVar2[0x19] = 0;
    psVar2[0x1a] = 0;
    psVar2[0x1b] = 0;
    psVar2[0xc] = 0;
    psVar2[0xd] = 0;
    psVar2[0xe] = 0;
    psVar2[0xf] = 0;
    psVar2[8] = 0;
    psVar2[9] = 0;
    psVar2[10] = 0;
    psVar2[0xb] = 0;
    psVar2[0x14] = 0;
    psVar2[0x15] = 0;
    psVar2[0x16] = 0;
    psVar2[0x17] = 0;
    psVar2[0x10] = 0;
    psVar2[0x11] = 0;
    psVar2[0x12] = 0;
    psVar2[0x13] = 0;
    psVar2[4] = 0;
    psVar2[5] = 0;
    psVar2[6] = 0;
    psVar2[7] = 0;
    psVar2[0] = 0;
    psVar2[1] = 0;
    psVar2[2] = 0;
    psVar2[3] = 0;
    goto LAB_00b87774;
  }
  sVar3 = psVar2[0xe];
  psVar2[0x14] = 0;
  psVar2[0x15] = 0;
  psVar2[0x16] = 0;
  psVar2[0x17] = 0;
  psVar2[0x18] = 0;
  psVar2[0x19] = 0;
  psVar2[0x1a] = 0;
  psVar2[0x1b] = 0;
  psVar2[4] = 0;
  psVar2[5] = 0;
  psVar2[6] = 0;
  psVar2[7] = 0;
  psVar2[0] = 0;
  psVar2[1] = 0;
  psVar2[2] = 0;
  psVar2[3] = 0;
  psVar2[0xc] = 0;
  psVar2[0xd] = 0;
  psVar2[0xe] = 0;
  psVar2[0xf] = 0;
  psVar2[8] = 0;
  psVar2[9] = 0;
  psVar2[10] = 0;
  psVar2[0xb] = 0;
  psVar2[0x10] = 0;
  psVar2[0x11] = 0;
  psVar2[0x12] = 0;
  psVar2[0x13] = 0;
  psa_free_key_slot((char)sVar3,psVar2);
LAB_00b87774:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

