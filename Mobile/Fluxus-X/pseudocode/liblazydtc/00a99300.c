/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a99300
 */

undefined8 FUN_00a99300(long param_1,int param_2)

{
  long *plVar1;
  undefined8 *ptr;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  long *ptr_00;
  long *ptr_01;
  long *plVar5;
  
  iVar2 = CRYPTO_THREAD_run_once(&DAT_00d220d8,&LAB_00a99894);
  ptr = DAT_00d220e0;
  uVar4 = 0;
  if (((DAT_00d220e0 != (undefined8 *)0x0) && (iVar2 != 0)) && (DAT_00d220dc != 0)) {
    if (param_2 == 0) {
      uVar4 = CRYPTO_THREAD_write_lock(DAT_00d220e0[1]);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
    }
    else {
      DAT_00d220e0 = (undefined8 *)0x0;
    }
    iVar2 = OPENSSL_sk_num(*ptr);
    if (0 < iVar2) {
      iVar2 = 0;
      do {
        ptr_00 = (long *)OPENSSL_sk_value(*ptr,iVar2);
        if (ptr_00 == (long *)0x0) {
          if (param_2 == 0) {
            CRYPTO_THREAD_unlock(ptr[1]);
            return 0;
          }
          return 0;
        }
        plVar5 = (long *)*ptr_00;
        if (plVar5 == (long *)0x0) {
LAB_00a993fc:
          if (param_2 != 0) {
            CRYPTO_free(ptr_00);
          }
        }
        else {
          ptr_01 = (long *)0x0;
          do {
            plVar1 = ptr_00;
            if (ptr_01 != (long *)0x0) {
              plVar1 = ptr_01 + 3;
            }
            ptr_01 = plVar5;
            while ((param_2 != 0 || (*ptr_01 == param_1))) {
              *plVar1 = ptr_01[3];
              plVar5 = (long *)ptr_01[3];
              CRYPTO_free(ptr_01);
              ptr_01 = plVar5;
              if (plVar5 == (long *)0x0) goto LAB_00a993fc;
            }
            plVar5 = (long *)ptr_01[3];
          } while (plVar5 != (long *)0x0);
        }
        iVar2 = iVar2 + 1;
        iVar3 = OPENSSL_sk_num(*ptr);
      } while (iVar2 < iVar3);
    }
    if (param_2 == 0) {
      CRYPTO_THREAD_unlock(ptr[1]);
    }
    else {
      CRYPTO_THREAD_lock_free();
      OPENSSL_sk_free(*ptr);
      CRYPTO_free(ptr);
    }
    uVar4 = 1;
  }
  return uVar4;
}

