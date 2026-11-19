/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae8850
 */

int * OPENSSL_sk_deep_copy(uint *param_1,code *param_2,code *param_3)

{
  bool bVar1;
  int *ptr;
  long lVar2;
  long lVar3;
  int iVar4;
  uint uVar5;
  undefined8 uVar6;
  
  ptr = CRYPTO_malloc(0x20,"crypto/stack/stack.c",0x57);
  if (ptr == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/stack/stack.c",0x7c,"OPENSSL_sk_deep_copy");
    ERR_set_error(0xf,0xc0100,0);
  }
  else {
    if (param_1 == (uint *)0x0) {
      *ptr = 0;
      ptr[4] = 0;
      ptr[6] = 0;
      ptr[7] = 0;
    }
    else {
      uVar6 = *(undefined8 *)(param_1 + 4);
      *(undefined8 *)(ptr + 6) = *(undefined8 *)(param_1 + 6);
      *(undefined8 *)(ptr + 4) = uVar6;
      uVar6 = *(undefined8 *)param_1;
      *(undefined8 *)(ptr + 2) = *(undefined8 *)(param_1 + 2);
      *(undefined8 *)ptr = uVar6;
      uVar5 = *param_1;
      if (uVar5 != 0) {
        if ((int)uVar5 < 5) {
          uVar5 = 4;
        }
        ptr[5] = uVar5;
        lVar2 = CRYPTO_zalloc((ulong)uVar5 << 3,"crypto/stack/stack.c",0x6b);
        *(long *)(ptr + 2) = lVar2;
        if (lVar2 == 0) {
LAB_00ae899c:
          ERR_new();
          ERR_set_debug("crypto/stack/stack.c",0x7c,"OPENSSL_sk_deep_copy");
          ERR_set_error(0xf,0xc0100,0);
          if (ptr == (int *)0x0) {
            return (int *)0x0;
          }
          CRYPTO_free(*(void **)(ptr + 2));
          CRYPTO_free(ptr);
          return (int *)0x0;
        }
        iVar4 = *ptr;
        if (iVar4 < 1) {
          return ptr;
        }
        lVar2 = 0;
        do {
          if (*(long *)(*(long *)(param_1 + 2) + lVar2 * 8) != 0) {
            lVar3 = (*param_2)();
            *(long *)(*(long *)(ptr + 2) + lVar2 * 8) = lVar3;
            if (lVar3 == 0) {
              if ((int)lVar2 != 0) {
                do {
                  if (*(long *)(*(long *)(ptr + 2) + (lVar2 + -1) * 8) != 0) {
                    (*param_3)();
                  }
                  bVar1 = 1 < lVar2;
                  lVar2 = lVar2 + -1;
                } while (bVar1);
              }
              goto LAB_00ae899c;
            }
            iVar4 = *ptr;
          }
          lVar2 = lVar2 + 1;
          if (iVar4 <= lVar2) {
            return ptr;
          }
        } while( true );
      }
    }
    ptr[2] = 0;
    ptr[3] = 0;
    ptr[5] = 0;
  }
  return ptr;
}

