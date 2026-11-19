/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a83f58
 */

void CRYPTO_free_ex_data(int class_index,void *obj,CRYPTO_EX_DATA *ad)

{
  int iVar1;
  uint uVar2;
  int iVar3;
  long *plVar4;
  undefined1 *__base;
  undefined8 uVar5;
  ulong uVar6;
  int *piVar7;
  ulong uVar8;
  undefined8 *puVar9;
  undefined4 *puVar10;
  undefined1 local_100 [160];
  
  __base = local_100;
  plVar4 = (long *)ossl_lib_ctx_get_ex_data_global(ad->sk);
  if (plVar4 != (long *)0x0) {
    if ((uint)class_index < 0x12) {
      if ((*plVar4 != 0) && (iVar1 = CRYPTO_THREAD_write_lock(), iVar1 != 0)) {
        uVar2 = OPENSSL_sk_num(plVar4[(long)class_index + 1]);
        uVar6 = (ulong)uVar2;
        if (((int)uVar2 < 1) ||
           ((9 < (int)uVar2 &&
            (__base = CRYPTO_malloc(uVar2 << 4,"crypto/ex_data.c",0x183),
            __base == (undefined1 *)0x0)))) {
          CRYPTO_THREAD_unlock(*plVar4);
          __base = (undefined1 *)0x0;
        }
        else {
          uVar8 = 0;
          puVar10 = (undefined4 *)(__base + 8);
          do {
            uVar5 = OPENSSL_sk_value(plVar4[(long)class_index + 1],uVar8 & 0xffffffff);
            *(undefined8 *)(puVar10 + -2) = uVar5;
            *puVar10 = (int)uVar8;
            uVar8 = uVar8 + 1;
            puVar10 = puVar10 + 4;
          } while (uVar6 != uVar8);
          CRYPTO_THREAD_unlock(*plVar4);
          qsort(__base,(long)(int)uVar2,0x10,(__compar_fn_t)&LAB_00a84144);
          if (0 < (int)uVar2) {
            piVar7 = (int *)(__base + 8);
            do {
              puVar9 = *(undefined8 **)(piVar7 + -2);
              if ((puVar9 != (undefined8 *)0x0) && (puVar9[4] != 0)) {
                if (*(long *)&ad->dummy == 0) {
                  uVar5 = 0;
                }
                else {
                  iVar1 = *piVar7;
                  iVar3 = OPENSSL_sk_num();
                  uVar5 = 0;
                  if (iVar1 < iVar3) {
                    uVar5 = OPENSSL_sk_value(*(undefined8 *)&ad->dummy,iVar1);
                  }
                }
                (*(code *)puVar9[4])(obj,uVar5,ad,*piVar7,*puVar9,puVar9[1]);
              }
              uVar6 = uVar6 - 1;
              piVar7 = piVar7 + 4;
            } while (uVar6 != 0);
          }
          if (__base == local_100) goto LAB_00a84118;
        }
        CRYPTO_free(__base);
      }
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/ex_data.c",0x23,"get_and_lock");
      ERR_set_error(0xf,0x80106,0);
    }
  }
LAB_00a84118:
  OPENSSL_sk_free(*(undefined8 *)&ad->dummy);
  ad->sk = (stack_st_void *)0x0;
  *(undefined8 *)&ad->dummy = 0;
  return;
}

