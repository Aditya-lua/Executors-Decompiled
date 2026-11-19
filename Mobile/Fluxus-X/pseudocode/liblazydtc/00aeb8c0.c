/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeb8c0
 */

void * FUN_00aeb8c0(undefined8 *param_1,undefined8 param_2,long param_3)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  void *ptr;
  long lVar7;
  undefined8 *puVar8;
  long lVar9;
  
  ossl_provider_libctx(param_2);
  uVar6 = ossl_namemap_stored();
  iVar5 = ossl_namemap_add_name(uVar6,0,*param_1);
  if (iVar5 != 0) {
    lVar9 = param_1[2];
    ptr = (void *)CRYPTO_zalloc(0xd0,"crypto/store/store_meth.c",0x31);
    if (ptr != (void *)0x0) {
      lVar7 = CRYPTO_THREAD_lock_new();
      *(long *)((long)ptr + 0x88) = lVar7;
      if (lVar7 != 0) {
        *(undefined8 *)((long)ptr + 0x60) = param_2;
        ossl_provider_up_ref(param_2);
        piVar1 = (int *)((long)ptr + 0x80);
        *piVar1 = 1;
        *(int *)((long)ptr + 0x68) = iVar5;
        *(undefined8 *)((long)ptr + 0x70) = param_1[1];
        *(undefined8 *)((long)ptr + 0x78) = param_1[3];
        puVar8 = (undefined8 *)(lVar9 + 8);
LAB_00aeb96c:
        switch(*(undefined4 *)(puVar8 + -1)) {
        case 0:
          goto switchD_00aeb980_caseD_0;
        case 1:
          if (*(long *)((long)ptr + 0x90) == 0) {
            *(undefined8 *)((long)ptr + 0x90) = *puVar8;
            puVar8 = puVar8 + 2;
            goto LAB_00aeb96c;
          }
          break;
        case 2:
          if (*(long *)((long)ptr + 0x98) == 0) {
            *(undefined8 *)((long)ptr + 0x98) = *puVar8;
            puVar8 = puVar8 + 2;
            goto LAB_00aeb96c;
          }
          break;
        case 3:
          if (*(long *)((long)ptr + 0xa0) == 0) {
            *(undefined8 *)((long)ptr + 0xa0) = *puVar8;
            puVar8 = puVar8 + 2;
            goto LAB_00aeb96c;
          }
          break;
        case 4:
          if (*(long *)((long)ptr + 0xa8) == 0) {
            *(undefined8 *)((long)ptr + 0xa8) = *puVar8;
            puVar8 = puVar8 + 2;
            goto LAB_00aeb96c;
          }
          break;
        case 5:
          if (*(long *)((long)ptr + 0xb0) == 0) {
            *(undefined8 *)((long)ptr + 0xb0) = *puVar8;
            puVar8 = puVar8 + 2;
            goto LAB_00aeb96c;
          }
          break;
        case 6:
          if (*(long *)((long)ptr + 0xb8) == 0) {
            *(undefined8 *)((long)ptr + 0xb8) = *puVar8;
            puVar8 = puVar8 + 2;
            goto LAB_00aeb96c;
          }
          break;
        case 7:
          if (*(long *)((long)ptr + 0xc0) != 0) break;
          *(undefined8 *)((long)ptr + 0xc0) = *puVar8;
          puVar8 = puVar8 + 2;
          goto LAB_00aeb96c;
        case 8:
          if (*(long *)((long)ptr + 200) == 0) {
            *(undefined8 *)((long)ptr + 200) = *puVar8;
          }
        }
        puVar8 = puVar8 + 2;
        goto LAB_00aeb96c;
      }
    }
    CRYPTO_free(ptr);
  }
  goto LAB_00aebae0;
switchD_00aeb980_caseD_0:
  if ((((*(long *)((long)ptr + 0x90) != 0) || (*(long *)((long)ptr + 0x98) != 0)) &&
      (*(long *)((long)ptr + 0xb0) != 0)) &&
     ((*(long *)((long)ptr + 0xb8) != 0 && (*(long *)((long)ptr + 0xc0) != 0)))) {
    return ptr;
  }
  lVar9 = *(long *)((long)ptr + 0x60);
  if (lVar9 == 0) {
LAB_00aebaa0:
    CRYPTO_free(ptr);
  }
  else {
    do {
      iVar5 = *piVar1;
      iVar4 = iVar5 + -1;
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
      if (bVar3) {
        *piVar1 = iVar4;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
    if (iVar4 == 0) {
      DataMemoryBarrier(2,1);
      lVar9 = *(long *)((long)ptr + 0x60);
LAB_00aeba94:
      ossl_provider_free(lVar9);
      CRYPTO_THREAD_lock_free(*(undefined8 *)((long)ptr + 0x88));
      goto LAB_00aebaa0;
    }
    if (iVar5 < 2) goto LAB_00aeba94;
  }
  ERR_new();
  ERR_set_debug("crypto/store/store_meth.c",0xfb,"loader_from_algorithm");
  ERR_set_error(0x2c,0x74,0);
LAB_00aebae0:
  *(byte *)(param_3 + 0x28) = *(byte *)(param_3 + 0x28) | 1;
  return (void *)0x0;
}

