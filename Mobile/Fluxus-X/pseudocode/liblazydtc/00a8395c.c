/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8395c
 */

undefined8
ossl_crypto_new_ex_data_ex(undefined8 param_1,uint param_2,undefined8 param_3,undefined8 *param_4)

{
  undefined4 uVar1;
  uint uVar2;
  int iVar3;
  long *plVar4;
  undefined8 uVar5;
  undefined1 *ptr;
  undefined8 *puVar6;
  ulong uVar7;
  undefined1 local_a0 [80];
  
  ptr = local_a0;
  plVar4 = (long *)ossl_lib_ctx_get_ex_data_global();
  if (plVar4 == (long *)0x0) {
    return 0;
  }
  if (param_2 < 0x12) {
    if (*plVar4 == 0) {
      return 0;
    }
    uVar5 = CRYPTO_THREAD_write_lock();
    if ((int)uVar5 == 0) {
      return uVar5;
    }
    *param_4 = param_1;
    param_4[1] = 0;
    uVar2 = OPENSSL_sk_num(plVar4[(long)(int)param_2 + 1]);
    if ((int)uVar2 < 1) {
      ptr = (undefined1 *)0x0;
    }
    else if (((int)uVar2 < 10) ||
            (ptr = CRYPTO_malloc(uVar2 << 3,"crypto/ex_data.c",0xed), ptr != (undefined1 *)0x0)) {
      uVar7 = 0;
      do {
        uVar5 = OPENSSL_sk_value(plVar4[(long)(int)param_2 + 1],uVar7 & 0xffffffff);
        *(undefined8 *)(ptr + uVar7 * 8) = uVar5;
        uVar7 = uVar7 + 1;
      } while (uVar2 != uVar7);
    }
    CRYPTO_THREAD_unlock(*plVar4);
    if (((int)uVar2 < 1) || (ptr != (undefined1 *)0x0)) {
      if (0 < (int)uVar2) {
        uVar7 = 0;
        do {
          if ((*(long *)(ptr + uVar7 * 8) != 0) &&
             (*(long *)(*(long *)(ptr + uVar7 * 8) + 0x18) != 0)) {
            if (param_4[1] == 0) {
              uVar5 = 0;
            }
            else {
              iVar3 = OPENSSL_sk_num();
              uVar5 = 0;
              if ((long)uVar7 < (long)iVar3) {
                uVar5 = OPENSSL_sk_value(param_4[1],uVar7 & 0xffffffff);
              }
            }
            puVar6 = *(undefined8 **)(ptr + uVar7 * 8);
            (*(code *)puVar6[3])(param_3,uVar5,param_4,uVar7 & 0xffffffff,*puVar6,puVar6[1]);
          }
          uVar7 = uVar7 + 1;
        } while (uVar2 != uVar7);
      }
      if (ptr != local_a0) {
        CRYPTO_free(ptr);
      }
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/ex_data.c",0xf5,"ossl_crypto_new_ex_data_ex");
    uVar1 = 0xc0100;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/ex_data.c",0x23,"get_and_lock");
    uVar1 = 0x80106;
  }
  ERR_set_error(0xf,uVar1,0);
  return 0;
}

