/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9d92c
 */

void * OSSL_PARAM_BLD_to_param(undefined8 *param_1)

{
  undefined8 *__s;
  undefined8 *puVar1;
  undefined8 uVar2;
  bool bVar3;
  int iVar4;
  uint uVar5;
  long lVar6;
  undefined8 *puVar7;
  void *pvVar8;
  undefined8 *puVar9;
  void *ptr;
  size_t __n;
  long lVar10;
  undefined8 *puVar11;
  ulong uVar12;
  undefined8 *puVar13;
  ulong uVar14;
  undefined8 *puVar15;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  
  iVar4 = OPENSSL_sk_num(param_1[2]);
  lVar6 = ossl_param_bytes_to_blocks((long)(iVar4 + 1) * 0x28);
  uVar2 = *param_1;
  lVar10 = param_1[1] << 3;
  if (lVar10 == 0) {
    puVar7 = (undefined8 *)0x0;
  }
  else {
    puVar7 = (undefined8 *)CRYPTO_secure_malloc(lVar10,"crypto/param_build.c",0x170);
    if (puVar7 == (undefined8 *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/param_build.c",0x172,"OSSL_PARAM_BLD_to_param");
      ERR_set_error(0xf,0x6f,0);
      return (void *)0x0;
    }
  }
  pvVar8 = CRYPTO_malloc(((int)uVar2 + (int)lVar6) * 8,"crypto/param_build.c",0x176);
  if (pvVar8 == (void *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/param_build.c",0x178,"OSSL_PARAM_BLD_to_param");
    ERR_set_error(0xf,0xc0100,0);
    CRYPTO_secure_free(puVar7,"crypto/param_build.c",0x179);
  }
  else {
    uVar5 = OPENSSL_sk_num(param_1[2]);
    if ((int)uVar5 < 1) {
      uVar14 = 0;
    }
    else {
      uVar12 = 0;
      uVar14 = (ulong)uVar5;
      puVar13 = (undefined8 *)((long)pvVar8 + 0x10);
      puVar11 = (undefined8 *)((long)pvVar8 + lVar6 * 8);
      puVar15 = puVar7;
      do {
        puVar9 = (undefined8 *)OPENSSL_sk_value(param_1[2],uVar12 & 0xffffffff);
        puVar13[-2] = *puVar9;
        iVar4 = *(int *)(puVar9 + 1);
        *(int *)(puVar13 + -1) = iVar4;
        __n = puVar9[2];
        puVar13[1] = __n;
        puVar13[2] = 0xffffffffffffffff;
        lVar6 = puVar9[3];
        bVar3 = *(int *)((long)puVar9 + 0xc) != 0;
        __s = puVar11;
        if (bVar3) {
          __s = puVar15;
        }
        *puVar13 = __s;
        puVar1 = puVar11 + lVar6;
        if (bVar3) {
          puVar1 = puVar11;
          puVar15 = puVar15 + lVar6;
        }
        if (puVar9[4] == 0) {
          if (iVar4 - 4U < 2) {
            if ((void *)puVar9[5] == (void *)0x0) {
              memset(__s,0,__n);
            }
            else {
              memcpy(__s,(void *)puVar9[5],__n);
            }
            if (*(int *)(puVar9 + 1) == 4) {
              *(undefined1 *)((long)__s + puVar9[2]) = 0;
            }
          }
          else if (iVar4 - 6U < 2) {
            *__s = puVar9[5];
          }
          else if (__n < 9) {
            if (__n != 0) {
              memcpy(__s,puVar9 + 6,__n);
            }
          }
          else {
            memset(__s,0,__n);
          }
        }
        else {
          BN_bn2nativepad(puVar9[4],__s);
        }
        uVar12 = uVar12 + 1;
        puVar13 = puVar13 + 5;
        puVar11 = puVar1;
      } while (uVar14 != uVar12);
    }
    puVar13 = (undefined8 *)((long)pvVar8 + uVar14 * 0x28);
    OSSL_PARAM_construct_end(&local_88);
    puVar13[4] = local_68;
    puVar13[3] = uStack_70;
    puVar13[2] = local_78;
    puVar13[1] = uStack_80;
    *puVar13 = local_88;
    ossl_param_set_secure_block(puVar13,puVar7,lVar10);
    *param_1 = 0;
    param_1[1] = 0;
    iVar4 = OPENSSL_sk_num(param_1[2]);
    if (0 < iVar4) {
      do {
        ptr = (void *)OPENSSL_sk_pop(param_1[2]);
        CRYPTO_free(ptr);
        iVar4 = iVar4 + -1;
      } while (iVar4 != 0);
    }
  }
  return pvVar8;
}

