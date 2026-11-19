/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d61f8
 */

undefined8 custom_exts_copy(long *param_1,long *param_2)

{
  bool bVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  void *ptr;
  ulong uVar5;
  undefined8 *puVar6;
  long lVar7;
  ulong uVar8;
  
  if (param_2[1] != 0) {
    lVar2 = CRYPTO_memdup(*param_2,param_2[1] * 0x38,"ssl/statem/extensions_cust.c",0x119);
    *param_1 = lVar2;
    if (lVar2 == 0) {
      return 0;
    }
    param_1[1] = param_2[1];
    uVar5 = param_2[1];
    if (uVar5 != 0) {
      lVar7 = 0;
      bVar1 = false;
      uVar8 = 1;
      while( true ) {
        if (*(undefined1 **)(*param_2 + lVar7 + 0x10) == &LAB_009d63b4) {
          if (bVar1) {
            *(undefined8 *)(lVar2 + lVar7 + 0x20) = 0;
            *(undefined8 *)(lVar2 + lVar7 + 0x30) = 0;
          }
          else {
            lVar4 = *param_2 + lVar7;
            uVar3 = CRYPTO_memdup(*(undefined8 *)(lVar4 + 0x20),0x18,"ssl/statem/extensions_cust.c",
                                  0x131);
            lVar2 = lVar2 + lVar7;
            *(undefined8 *)(lVar2 + 0x20) = uVar3;
            lVar4 = CRYPTO_memdup(*(undefined8 *)(lVar4 + 0x30),0x10,"ssl/statem/extensions_cust.c",
                                  0x133);
            *(long *)(lVar2 + 0x30) = lVar4;
            uVar5 = param_2[1];
            bVar1 = lVar4 == 0 || *(long *)(lVar2 + 0x20) == 0;
          }
        }
        if (uVar5 <= uVar8) break;
        lVar2 = *param_1;
        uVar8 = uVar8 + 1;
        lVar7 = lVar7 + 0x38;
      }
      if (bVar1) {
        ptr = (void *)*param_1;
        uVar5 = param_1[1];
        if (uVar5 != 0) {
          uVar8 = 0;
          puVar6 = (undefined8 *)((long)ptr + 0x30);
          do {
            if ((undefined1 *)puVar6[-4] == &LAB_009d63b4) {
              CRYPTO_free((void *)puVar6[-2]);
              CRYPTO_free((void *)*puVar6);
              uVar5 = param_1[1];
            }
            uVar8 = uVar8 + 1;
            puVar6 = puVar6 + 7;
          } while (uVar8 < uVar5);
          ptr = (void *)*param_1;
        }
        CRYPTO_free(ptr);
        *param_1 = 0;
        param_1[1] = 0;
        return 0;
      }
    }
  }
  return 1;
}

