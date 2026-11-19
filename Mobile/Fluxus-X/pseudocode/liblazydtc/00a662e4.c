/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a662e4
 */

void * FUN_00a662e4(undefined4 param_1,long param_2,long param_3)

{
  int *piVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  void *ptr;
  long lVar6;
  void *pvVar7;
  undefined8 uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  undefined8 *puVar14;
  long lVar15;
  
  lVar15 = *(long *)(param_2 + 0x10);
  ptr = (void *)CRYPTO_zalloc(0xe0,"crypto/evp/keymgmt_meth.c",0x18);
  if (ptr != (void *)0x0) {
    lVar6 = CRYPTO_THREAD_lock_new();
    piVar1 = (int *)((long)ptr + 0x20);
    *(long *)((long)ptr + 0x28) = lVar6;
    if (lVar6 != 0) {
      *piVar1 = 1;
      *(undefined4 *)((long)ptr + 4) = param_1;
      pvVar7 = (void *)ossl_algorithm_get1_first_name(param_2);
      *(void **)((long)ptr + 8) = pvVar7;
      if (pvVar7 == (void *)0x0) {
        do {
          iVar2 = *piVar1;
          iVar5 = iVar2 + -1;
          cVar3 = '\x01';
          bVar4 = (bool)ExclusiveMonitorPass(piVar1,0x10);
          if (bVar4) {
            *piVar1 = iVar5;
            cVar3 = ExclusiveMonitorsStatus();
          }
        } while (cVar3 != '\0');
        if (iVar5 == 0) {
          DataMemoryBarrier(2,1);
          pvVar7 = *(void **)((long)ptr + 8);
        }
        else {
          pvVar7 = (void *)0x0;
          if (1 < iVar2) {
            return (void *)0x0;
          }
        }
        CRYPTO_free(pvVar7);
        ossl_provider_free(*(undefined8 *)((long)ptr + 0x18));
        CRYPTO_THREAD_lock_free(*(undefined8 *)((long)ptr + 0x28));
        CRYPTO_free(ptr);
        return (void *)0x0;
      }
      uVar10 = 0;
      uVar9 = 0;
      uVar11 = 0;
      *(undefined8 *)((long)ptr + 0x10) = *(undefined8 *)(param_2 + 0x18);
      uVar12 = 0;
      uVar13 = 0;
      puVar14 = (undefined8 *)(lVar15 + 8);
LAB_00a6639c:
      switch(*(undefined4 *)(puVar14 + -1)) {
      case 0:
        goto switchD_00a663b0_caseD_0;
      case 1:
        if (*(long *)((long)ptr + 0x30) == 0) {
          *(undefined8 *)((long)ptr + 0x30) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 2:
        if (*(long *)((long)ptr + 0x60) == 0) {
          *(undefined8 *)((long)ptr + 0x60) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 3:
        if (*(long *)((long)ptr + 0x68) == 0) {
          *(undefined8 *)((long)ptr + 0x68) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 4:
        if (*(long *)((long)ptr + 0x70) == 0) {
          uVar11 = uVar11 + 1;
          *(undefined8 *)((long)ptr + 0x70) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 5:
        if (*(long *)((long)ptr + 0x78) == 0) {
          uVar11 = uVar11 + 1;
          *(undefined8 *)((long)ptr + 0x78) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 6:
        if (*(long *)((long)ptr + 0x80) == 0) {
          *(undefined8 *)((long)ptr + 0x80) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 7:
        if (*(long *)((long)ptr + 0x88) == 0) {
          *(undefined8 *)((long)ptr + 0x88) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 8:
        if (*(long *)((long)ptr + 0x90) == 0) {
          *(undefined8 *)((long)ptr + 0x90) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 10:
        if (*(long *)((long)ptr + 0x38) == 0) {
          *(undefined8 *)((long)ptr + 0x38) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 0xb:
        if (*(long *)((long)ptr + 0x40) == 0) {
          uVar9 = uVar9 + 1;
          *(undefined8 *)((long)ptr + 0x40) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 0xc:
        if (*(long *)((long)ptr + 0x48) == 0) {
          uVar9 = uVar9 + 1;
          *(undefined8 *)((long)ptr + 0x48) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 0xd:
        if (*(long *)((long)ptr + 0x50) == 0) {
          uVar10 = uVar10 + 1;
          *(undefined8 *)((long)ptr + 0x50) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 0xe:
        if (*(long *)((long)ptr + 0x58) == 0) {
          uVar10 = uVar10 + 1;
          *(undefined8 *)((long)ptr + 0x58) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 0x14:
        if (*(long *)((long)ptr + 0x98) == 0) {
          *(undefined8 *)((long)ptr + 0x98) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 0x15:
        if (*(long *)((long)ptr + 0xa0) == 0) {
          *(undefined8 *)((long)ptr + 0xa0) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 0x16:
        if (*(long *)((long)ptr + 0xa8) == 0) {
          *(undefined8 *)((long)ptr + 0xa8) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 0x17:
        if (*(long *)((long)ptr + 0xb0) == 0) {
          *(undefined8 *)((long)ptr + 0xb0) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 0x28:
        if (*(long *)((long)ptr + 0xb8) == 0) {
          uVar12 = uVar12 + 1;
          *(undefined8 *)((long)ptr + 0xb8) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 0x29:
        if (*(long *)((long)ptr + 0xc0) == 0) {
          uVar12 = uVar12 + 1;
          *(undefined8 *)((long)ptr + 0xc0) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 0x2a:
        if (*(long *)((long)ptr + 200) == 0) {
          uVar13 = uVar13 + 1;
          *(undefined8 *)((long)ptr + 200) = *puVar14;
          puVar14 = puVar14 + 2;
          goto LAB_00a6639c;
        }
        break;
      case 0x2b:
        if (*(long *)((long)ptr + 0xd0) == 0) {
          uVar13 = uVar13 + 1;
          *(undefined8 *)((long)ptr + 0xd0) = *puVar14;
        }
        break;
      case 0x2c:
        if (*(long *)((long)ptr + 0xd8) != 0) break;
        *(undefined8 *)((long)ptr + 0xd8) = *puVar14;
        puVar14 = puVar14 + 2;
        goto LAB_00a6639c;
      }
      puVar14 = puVar14 + 2;
      goto LAB_00a6639c;
    }
    do {
      iVar2 = *piVar1;
      iVar5 = iVar2 + -1;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(piVar1,0x10);
      if (bVar4) {
        *piVar1 = iVar5;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (iVar5 == 0) {
      DataMemoryBarrier(2,1);
    }
    else if (1 < iVar2) goto LAB_00a666a8;
    CRYPTO_free(*(void **)((long)ptr + 8));
    ossl_provider_free(*(undefined8 *)((long)ptr + 0x18));
    CRYPTO_THREAD_lock_free(*(undefined8 *)((long)ptr + 0x28));
    CRYPTO_free(ptr);
  }
LAB_00a666a8:
  ERR_new();
  ERR_set_debug("crypto/evp/keymgmt_meth.c",0x1b,"keymgmt_new");
  uVar8 = 0xc0100;
  goto LAB_00a66734;
switchD_00a663b0_caseD_0:
  if (((*(long *)((long)ptr + 0x38) != 0) &&
      ((((*(long *)((long)ptr + 0x30) != 0 || (*(long *)((long)ptr + 0x80) != 0)) ||
        (*(long *)((long)ptr + 0x90) != 0)) && (((uVar13 | 2) == 2 && ((uVar12 | 2) == 2)))))) &&
     (((uVar11 | 2) == 2 &&
      (((((uVar10 | 2) == 2 && ((uVar9 | 2) == 2)) && (*(long *)((long)ptr + 0xa0) != 0)) &&
       ((*(long *)((long)ptr + 0x80) == 0 ||
        ((*(long *)((long)ptr + 0x60) != 0 && (*(long *)((long)ptr + 0x88) != 0)))))))))) {
    *(long *)((long)ptr + 0x18) = param_3;
    if (param_3 != 0) {
      ossl_provider_up_ref(param_3);
    }
    return ptr;
  }
  do {
    iVar2 = *piVar1;
    iVar5 = iVar2 + -1;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(piVar1,0x10);
    if (bVar4) {
      *piVar1 = iVar5;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  if (iVar5 == 0) {
    DataMemoryBarrier(2,1);
    pvVar7 = *(void **)((long)ptr + 8);
LAB_00a666dc:
    CRYPTO_free(pvVar7);
    ossl_provider_free(*(undefined8 *)((long)ptr + 0x18));
    CRYPTO_THREAD_lock_free(*(undefined8 *)((long)ptr + 0x28));
    CRYPTO_free(ptr);
  }
  else if (iVar2 < 2) goto LAB_00a666dc;
  ERR_new();
  ERR_set_debug("crypto/evp/keymgmt_meth.c",0xc4,"keymgmt_from_algorithm");
  uVar8 = 0xc1;
LAB_00a66734:
  ERR_set_error(6,uVar8,0);
  return (void *)0x0;
}

