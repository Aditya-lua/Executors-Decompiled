/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a83bb0
 */

int CRYPTO_dup_ex_data(int class_index,CRYPTO_EX_DATA *to,CRYPTO_EX_DATA *from)

{
  undefined4 uVar1;
  int iVar2;
  int iVar3;
  long *plVar4;
  undefined1 *ptr;
  undefined8 uVar5;
  void *pvVar6;
  undefined8 *puVar7;
  uint uVar8;
  ulong uVar9;
  undefined1 local_b0 [80];
  void *local_58;
  
  ptr = local_b0;
  to->sk = from->sk;
  if (*(long *)&from->dummy == 0) {
LAB_00a83d14:
    iVar2 = 1;
  }
  else {
    plVar4 = (long *)ossl_lib_ctx_get_ex_data_global(from->sk);
    if (plVar4 == (long *)0x0) {
      return 0;
    }
    if ((uint)class_index < 0x12) {
      if (*plVar4 == 0) {
        return 0;
      }
      iVar2 = CRYPTO_THREAD_write_lock();
      if (iVar2 == 0) {
        return 0;
      }
      iVar3 = OPENSSL_sk_num(plVar4[(long)class_index + 1]);
      iVar2 = OPENSSL_sk_num(*(undefined8 *)&from->dummy);
      if (iVar3 <= iVar2) {
        iVar2 = iVar3;
      }
      if (iVar2 < 1) {
        ptr = (undefined1 *)0x0;
LAB_00a83cd8:
        CRYPTO_THREAD_unlock(*plVar4);
        if (iVar2 == 0) goto LAB_00a83d14;
        if (ptr != (undefined1 *)0x0) {
          if (*(long *)&to->dummy == 0) {
            pvVar6 = (void *)0x0;
          }
          else {
            iVar3 = OPENSSL_sk_num();
            pvVar6 = (void *)0x0;
            if (iVar2 <= iVar3) {
              pvVar6 = (void *)OPENSSL_sk_value(*(undefined8 *)&to->dummy,iVar2 + -1);
            }
          }
          iVar3 = CRYPTO_set_ex_data(to,iVar2 + -1,pvVar6);
          uVar8 = (uint)(iVar3 != 0);
          if ((iVar3 != 0) && (0 < iVar2)) {
            uVar9 = 0;
            do {
              if (*(long *)&from->dummy == 0) {
                pvVar6 = (void *)0x0;
              }
              else {
                iVar3 = OPENSSL_sk_num();
                pvVar6 = (void *)0x0;
                if ((long)uVar9 < (long)iVar3) {
                  pvVar6 = (void *)OPENSSL_sk_value(*(undefined8 *)&from->dummy,uVar9 & 0xffffffff);
                }
              }
              local_58 = pvVar6;
              puVar7 = *(undefined8 **)(ptr + uVar9 * 8);
              if (((puVar7 != (undefined8 *)0x0) && ((code *)puVar7[5] != (code *)0x0)) &&
                 (iVar3 = (*(code *)puVar7[5])
                                    (to,from,&local_58,uVar9 & 0xffffffff,*puVar7,puVar7[1]),
                 iVar3 == 0)) {
                uVar8 = 0;
                goto LAB_00a83e24;
              }
              CRYPTO_set_ex_data(to,(int)uVar9,local_58);
              uVar9 = uVar9 + 1;
            } while ((long)uVar9 < (long)iVar2);
            uVar8 = 1;
          }
LAB_00a83e24:
          if (ptr == local_b0) {
            return uVar8;
          }
          CRYPTO_free(ptr);
          return uVar8;
        }
      }
      else {
        if ((iVar2 < 10) ||
           (ptr = CRYPTO_malloc(iVar2 << 3,"crypto/ex_data.c",0x12d), ptr != (undefined1 *)0x0)) {
          uVar9 = 0;
          do {
            uVar5 = OPENSSL_sk_value(plVar4[(long)class_index + 1],uVar9 & 0xffffffff);
            *(undefined8 *)(ptr + uVar9 * 8) = uVar5;
            uVar9 = uVar9 + 1;
          } while ((long)uVar9 < (long)iVar2);
          goto LAB_00a83cd8;
        }
        CRYPTO_THREAD_unlock(*plVar4);
      }
      ERR_new();
      ERR_set_debug("crypto/ex_data.c",0x137,"CRYPTO_dup_ex_data");
      uVar1 = 0xc0100;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/ex_data.c",0x23,"get_and_lock");
      uVar1 = 0x80106;
    }
    ERR_set_error(0xf,uVar1,0);
    iVar2 = 0;
  }
  return iVar2;
}

