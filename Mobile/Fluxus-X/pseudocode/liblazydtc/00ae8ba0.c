/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae8ba0
 */

undefined8 FUN_00ae8ba0(int *param_1,int param_2,int param_3)

{
  uint uVar1;
  bool bVar2;
  long lVar3;
  void *pvVar4;
  undefined8 uVar5;
  uint uVar6;
  uint uVar7;
  
  if (0x7fffffff - *param_1 < param_2) {
    ERR_new();
    uVar5 = 0xb4;
LAB_00ae8bdc:
    ERR_set_debug("crypto/stack/stack.c",uVar5,"sk_reserve");
    uVar5 = 0x72;
  }
  else {
    uVar6 = *param_1 + param_2;
    if ((int)uVar6 < 5) {
      uVar6 = 4;
    }
    if (*(void **)(param_1 + 2) == (void *)0x0) {
      lVar3 = CRYPTO_zalloc((ulong)uVar6 << 3,"crypto/stack/stack.c",0xc3);
      *(long *)(param_1 + 2) = lVar3;
      if (lVar3 != 0) {
        param_1[5] = uVar6;
        return 1;
      }
      ERR_new();
      uVar5 = 0xc4;
    }
    else {
      uVar7 = param_1[5];
      if (param_3 == 0) {
        if ((int)uVar6 <= (int)uVar7) {
          return 1;
        }
        do {
          if (0x55555554 < (int)uVar7) {
            uVar7 = 0x7fffffff;
            goto LAB_00ae8cc0;
          }
          uVar1 = uVar7;
          if ((int)uVar7 < 0) {
            uVar1 = uVar7 + 1;
          }
          uVar7 = uVar7 + ((int)uVar1 >> 1);
        } while ((int)uVar7 < (int)uVar6);
        if (uVar7 == 0) {
          ERR_new();
          uVar5 = 0xd0;
          goto LAB_00ae8bdc;
        }
      }
      else {
        bVar2 = uVar6 == uVar7;
        uVar7 = uVar6;
        if (bVar2) {
          return 1;
        }
      }
LAB_00ae8cc0:
      pvVar4 = CRYPTO_realloc(*(void **)(param_1 + 2),uVar7 << 3,"crypto/stack/stack.c",0xd7);
      if (pvVar4 != (void *)0x0) {
        *(void **)(param_1 + 2) = pvVar4;
        param_1[5] = uVar7;
        return 1;
      }
      ERR_new();
      uVar5 = 0xd9;
    }
    ERR_set_debug("crypto/stack/stack.c",uVar5,"sk_reserve");
    uVar5 = 0xc0100;
  }
  ERR_set_error(0xf,uVar5,0);
  return 0;
}

