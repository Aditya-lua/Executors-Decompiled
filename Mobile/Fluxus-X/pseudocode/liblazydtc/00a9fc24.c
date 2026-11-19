/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9fc24
 */

undefined8 * OSSL_PARAM_merge(long *param_1,long *param_2)

{
  int iVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  ulong __nmemb;
  ulong __nmemb_00;
  long *plVar5;
  long *plVar6;
  undefined8 **ppuVar7;
  undefined8 **ppuVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  long local_850 [129];
  undefined8 *local_448 [129];
  
  plVar6 = local_850;
  puVar4 = (undefined8 *)0x0;
  if (param_1 != (long *)0x0 || param_2 != (long *)0x0) {
    if ((param_1 == (long *)0x0) || (*param_1 == 0)) {
      __nmemb = 0;
    }
    else {
      __nmemb = 0;
      do {
        local_448[__nmemb] = param_1;
        param_1 = param_1 + 5;
        __nmemb = __nmemb + 1;
        if (0x7f < __nmemb) break;
      } while (*param_1 != 0);
    }
    local_448[__nmemb] = (undefined8 *)0x0;
    if ((param_2 == (long *)0x0) || (*param_2 == 0)) {
      __nmemb_00 = 0;
    }
    else {
      __nmemb_00 = 0;
      do {
        local_850[__nmemb_00] = (long)param_2;
        param_2 = param_2 + 5;
        __nmemb_00 = __nmemb_00 + 1;
        if (0x7f < __nmemb_00) break;
      } while (*param_2 != 0);
    }
    local_850[__nmemb_00] = 0;
    if (__nmemb_00 == 0 && __nmemb == 0) {
      puVar4 = (undefined8 *)0x0;
    }
    else {
      qsort(local_448,__nmemb,8,(__compar_fn_t)&LAB_00a9fe64);
      qsort(local_850,__nmemb_00,8,(__compar_fn_t)&LAB_00a9fe64);
      puVar4 = (undefined8 *)
               CRYPTO_zalloc((__nmemb_00 + __nmemb) * 0x28 + 0x28,"crypto/params_dup.c",0xb5);
      if (puVar4 == (undefined8 *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/params_dup.c",0xb7,"OSSL_PARAM_merge");
        ERR_set_error(0xf,0xc0100,0);
      }
      else {
        puVar2 = puVar4;
        if (local_448[0] != (undefined8 *)0x0) {
          plVar5 = local_850;
          ppuVar7 = local_448;
          puVar3 = puVar4;
          do {
            if ((undefined8 *)*plVar5 == (undefined8 *)0x0) {
              do {
                ppuVar8 = ppuVar7 + 1;
                puVar2 = *ppuVar7;
                puVar3[4] = puVar2[4];
                uVar9 = puVar2[2];
                puVar3[3] = puVar2[3];
                puVar3[2] = uVar9;
                uVar9 = *puVar2;
                puVar3[1] = puVar2[1];
                *puVar3 = uVar9;
                puVar3 = puVar3 + 5;
                ppuVar7 = ppuVar8;
              } while (*ppuVar8 != (undefined8 *)0x0);
              return puVar4;
            }
            iVar1 = OPENSSL_strcasecmp(*local_448[0],*(undefined8 *)*plVar5);
            if (iVar1 == 0) {
              plVar6 = plVar5 + 1;
              puVar2 = (undefined8 *)*plVar5;
              ppuVar8 = ppuVar7 + 1;
              puVar3[4] = puVar2[4];
              uVar9 = puVar2[2];
              puVar3[3] = puVar2[3];
              puVar3[2] = uVar9;
              uVar10 = puVar2[1];
              uVar9 = *puVar2;
            }
            else {
              if (iVar1 < 1) {
                ppuVar8 = ppuVar7 + 1;
                puVar2 = *ppuVar7;
              }
              else {
                puVar2 = (undefined8 *)*plVar5;
                plVar5 = plVar5 + 1;
                ppuVar8 = ppuVar7;
              }
              puVar3[4] = puVar2[4];
              uVar9 = puVar2[2];
              puVar3[3] = puVar2[3];
              puVar3[2] = uVar9;
              uVar10 = puVar2[1];
              uVar9 = *puVar2;
              plVar6 = plVar5;
            }
            puVar3[1] = uVar10;
            *puVar3 = uVar9;
            local_448[0] = *ppuVar8;
            puVar2 = puVar3 + 5;
            plVar5 = plVar6;
            ppuVar7 = ppuVar8;
            puVar3 = puVar3 + 5;
          } while (local_448[0] != (undefined8 *)0x0);
        }
        do {
          plVar5 = plVar6 + 1;
          puVar3 = (undefined8 *)*plVar6;
          puVar2[4] = puVar3[4];
          uVar9 = puVar3[2];
          puVar2[3] = puVar3[3];
          puVar2[2] = uVar9;
          uVar9 = *puVar3;
          puVar2[1] = puVar3[1];
          *puVar2 = uVar9;
          puVar2 = puVar2 + 5;
          plVar6 = plVar5;
        } while (*plVar5 != 0);
      }
    }
  }
  return puVar4;
}

