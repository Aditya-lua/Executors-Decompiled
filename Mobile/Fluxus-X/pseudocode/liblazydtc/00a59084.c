/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a59084
 */

int * FUN_00a59084(int param_1,long param_2,long param_3)

{
  int *piVar1;
  char cVar2;
  int iVar3;
  bool bVar4;
  int iVar5;
  int *ptr;
  long lVar6;
  undefined8 uVar7;
  undefined8 *puVar8;
  long lVar9;
  undefined8 local_158;
  undefined8 uStack_150;
  undefined8 local_148;
  undefined8 uStack_140;
  undefined8 local_138;
  undefined8 local_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 local_110;
  undefined8 local_108;
  undefined8 uStack_100;
  undefined8 local_f8;
  undefined8 uStack_f0;
  undefined8 local_e8;
  undefined8 local_e0;
  undefined8 uStack_d8;
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined8 local_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  ulong local_68;
  ulong local_60;
  undefined8 local_58;
  
  lVar9 = *(long *)(param_2 + 0x10);
  ptr = (int *)CRYPTO_zalloc(0xf0,"crypto/evp/digest.c",0x35f);
  if (ptr != (int *)0x0) {
    lVar6 = CRYPTO_THREAD_lock_new();
    *(long *)(ptr + 0x20) = lVar6;
    if (lVar6 != 0) {
      piVar1 = ptr + 0x1e;
      *piVar1 = 1;
      *ptr = 0;
      iVar5 = evp_names_do_all(param_3,param_1,&LAB_00a59610,ptr);
      if ((iVar5 == 0) || (*ptr == -1)) {
        ERR_new();
        ERR_set_debug("crypto/evp/digest.c",0x3b8,"evp_md_from_algorithm");
        ERR_set_error(6,0xc0103,0);
        if (ptr[6] != 0) {
          return (int *)0x0;
        }
        do {
          iVar5 = *piVar1;
          iVar3 = iVar5 + -1;
          cVar2 = '\x01';
          bVar4 = (bool)ExclusiveMonitorPass(piVar1,0x10);
          if (bVar4) {
            *piVar1 = iVar3;
            cVar2 = ExclusiveMonitorsStatus();
          }
        } while (cVar2 != '\0');
      }
      else {
        ptr[0x16] = param_1;
        lVar6 = ossl_algorithm_get1_first_name(param_2);
        *(long *)(ptr + 0x18) = lVar6;
        if (lVar6 != 0) {
          iVar5 = 0;
          *(undefined8 *)(ptr + 0x1a) = *(undefined8 *)(param_2 + 0x18);
          puVar8 = (undefined8 *)(lVar9 + 8);
LAB_00a59148:
          switch(*(undefined4 *)(puVar8 + -1)) {
          case 0:
            goto switchD_00a5915c_caseD_0;
          case 1:
            if (*(long *)(ptr + 0x22) == 0) {
              iVar5 = iVar5 + 1;
              *(undefined8 *)(ptr + 0x22) = *puVar8;
              puVar8 = puVar8 + 2;
              goto LAB_00a59148;
            }
            break;
          case 2:
            if (*(long *)(ptr + 0x24) == 0) {
              iVar5 = iVar5 + 1;
              *(undefined8 *)(ptr + 0x24) = *puVar8;
              puVar8 = puVar8 + 2;
              goto LAB_00a59148;
            }
            break;
          case 3:
            if (*(long *)(ptr + 0x26) == 0) {
              iVar5 = iVar5 + 1;
              *(undefined8 *)(ptr + 0x26) = *puVar8;
              puVar8 = puVar8 + 2;
              goto LAB_00a59148;
            }
            break;
          case 4:
            if (*(long *)(ptr + 0x28) == 0) {
              iVar5 = iVar5 + 1;
              *(undefined8 *)(ptr + 0x28) = *puVar8;
              puVar8 = puVar8 + 2;
              goto LAB_00a59148;
            }
            break;
          case 5:
            if (*(long *)(ptr + 0x2a) == 0) {
              *(undefined8 *)(ptr + 0x2a) = *puVar8;
              puVar8 = puVar8 + 2;
              goto LAB_00a59148;
            }
            break;
          case 6:
            if (*(long *)(ptr + 0x2c) == 0) {
              iVar5 = iVar5 + 1;
              *(undefined8 *)(ptr + 0x2c) = *puVar8;
              puVar8 = puVar8 + 2;
              goto LAB_00a59148;
            }
            break;
          case 7:
            if (*(long *)(ptr + 0x2e) == 0) {
              *(undefined8 *)(ptr + 0x2e) = *puVar8;
              puVar8 = puVar8 + 2;
              goto LAB_00a59148;
            }
            break;
          case 8:
            if (*(long *)(ptr + 0x30) == 0) {
              *(undefined8 *)(ptr + 0x30) = *puVar8;
              puVar8 = puVar8 + 2;
              goto LAB_00a59148;
            }
            break;
          case 9:
            if (*(long *)(ptr + 0x32) == 0) {
              *(undefined8 *)(ptr + 0x32) = *puVar8;
              puVar8 = puVar8 + 2;
              goto LAB_00a59148;
            }
            break;
          case 10:
            if (*(long *)(ptr + 0x34) == 0) {
              *(undefined8 *)(ptr + 0x34) = *puVar8;
              puVar8 = puVar8 + 2;
              goto LAB_00a59148;
            }
            break;
          case 0xb:
            if (*(long *)(ptr + 0x36) == 0) {
              *(undefined8 *)(ptr + 0x36) = *puVar8;
              puVar8 = puVar8 + 2;
              goto LAB_00a59148;
            }
            break;
          case 0xc:
            if (*(long *)(ptr + 0x38) != 0) break;
            *(undefined8 *)(ptr + 0x38) = *puVar8;
            puVar8 = puVar8 + 2;
            goto LAB_00a59148;
          case 0xd:
            if (*(long *)(ptr + 0x3a) == 0) {
              *(undefined8 *)(ptr + 0x3a) = *puVar8;
            }
          }
          puVar8 = puVar8 + 2;
          goto LAB_00a59148;
        }
        if (ptr[6] != 0) {
          return (int *)0x0;
        }
        do {
          iVar5 = *piVar1;
          iVar3 = iVar5 + -1;
          cVar2 = '\x01';
          bVar4 = (bool)ExclusiveMonitorPass(piVar1,0x10);
          if (bVar4) {
            *piVar1 = iVar3;
            cVar2 = ExclusiveMonitorsStatus();
          }
        } while (cVar2 != '\0');
      }
      if (iVar3 == 0) {
        DataMemoryBarrier(2,1);
      }
      else if (1 < iVar5) {
        return (int *)0x0;
      }
      evp_md_free_int(ptr);
      return (int *)0x0;
    }
    CRYPTO_free(ptr);
  }
  ERR_new();
  ERR_set_debug("crypto/evp/digest.c",0x3b0,"evp_md_from_algorithm");
  uVar7 = 0xc0100;
  goto LAB_00a59310;
switchD_00a5915c_caseD_0:
  if ((iVar5 == 5) || ((iVar5 == 0 && (*(long *)(ptr + 0x2a) != 0)))) {
    *(long *)(ptr + 0x1c) = param_3;
    if (param_3 != 0) {
      ossl_provider_up_ref(param_3);
    }
    local_60 = 0;
    local_58 = 0;
    local_68 = 0;
    OSSL_PARAM_construct_size_t(&local_158,"blocksize",&local_60);
    local_110 = local_138;
    uStack_128 = uStack_150;
    local_130 = local_158;
    uStack_118 = uStack_140;
    uStack_120 = local_148;
    OSSL_PARAM_construct_size_t(&local_158,&DAT_002d7e7d,&local_68);
    local_e8 = local_138;
    uStack_f0 = uStack_140;
    local_f8 = local_148;
    uStack_100 = uStack_150;
    local_108 = local_158;
    OSSL_PARAM_construct_int(&local_158,&DAT_002dbfe7,(long)&local_58 + 4);
    local_c0 = local_138;
    uStack_c8 = uStack_140;
    local_d0 = local_148;
    uStack_d8 = uStack_150;
    local_e0 = local_158;
    OSSL_PARAM_construct_int(&local_158,"algid-absent",&local_58);
    local_98 = local_138;
    uStack_a0 = uStack_140;
    local_a8 = local_148;
    uStack_b0 = uStack_150;
    local_b8 = local_158;
    OSSL_PARAM_construct_end(&local_158);
    local_70 = local_138;
    uStack_88 = uStack_150;
    local_90 = local_158;
    uStack_78 = uStack_140;
    uStack_80 = local_148;
    iVar5 = evp_do_md_getparams(ptr,&local_130);
    bVar4 = (local_60 | local_68) >> 0x1f == 0;
    if (0 < iVar5 && bVar4) {
      ptr[0x12] = (int)local_60;
      ptr[2] = (int)local_68;
      if (local_58._4_4_ != 0) {
        *(ulong *)(ptr + 4) = *(ulong *)(ptr + 4) | 2;
      }
      if ((int)local_58 != 0) {
        *(ulong *)(ptr + 4) = *(ulong *)(ptr + 4) | 8;
      }
      if (0 < iVar5 && bVar4) {
        return ptr;
      }
    }
    if (ptr[6] == 0) {
      do {
        iVar5 = *piVar1;
        iVar3 = iVar5 + -1;
        cVar2 = '\x01';
        bVar4 = (bool)ExclusiveMonitorPass(piVar1,0x10);
        if (bVar4) {
          *piVar1 = iVar3;
          cVar2 = ExclusiveMonitorsStatus();
        }
      } while (cVar2 != '\0');
      if (iVar3 == 0) {
        DataMemoryBarrier(2,1);
      }
      else if (1 < iVar5) goto LAB_00a59560;
      evp_md_free_int(ptr);
    }
LAB_00a59560:
    ERR_new();
    ERR_set_debug("crypto/evp/digest.c",0x41c,"evp_md_from_algorithm");
    uVar7 = 0xe1;
    goto LAB_00a59310;
  }
  if (ptr[6] == 0) {
    do {
      iVar5 = *piVar1;
      iVar3 = iVar5 + -1;
      cVar2 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(piVar1,0x10);
      if (bVar4) {
        *piVar1 = iVar3;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
    if (iVar3 == 0) {
      DataMemoryBarrier(2,1);
    }
    else if (1 < iVar5) goto LAB_00a59528;
    evp_md_free_int(ptr);
  }
LAB_00a59528:
  ERR_new();
  ERR_set_debug("crypto/evp/digest.c",0x413,"evp_md_from_algorithm");
  uVar7 = 0xc1;
LAB_00a59310:
  ERR_set_error(6,uVar7,0);
  return (int *)0x0;
}

