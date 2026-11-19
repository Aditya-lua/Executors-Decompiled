/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8454c
 */

ulong OPENSSL_init_crypto(ulong param_1,long param_2)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  ulong uVar4;
  long lVar5;
  uint uVar6;
  ulong local_38;
  
  uVar6 = (uint)param_1;
  if (DAT_00d21ffc == '\x01') {
    if ((uVar6 >> 0x12 & 1) == 0) {
      ERR_new(0);
      ERR_set_debug("crypto/init.c",0x1d8,"OPENSSL_init_crypto");
      ERR_set_error(0xf,0xc0105,0);
      return 0;
    }
    return 0;
  }
  iVar2 = CRYPTO_atomic_load(&DAT_00d22020,&local_38,0);
  if (iVar2 == 0) {
    bVar1 = false;
  }
  else {
    bVar1 = true;
    if ((param_1 & (local_38 ^ 0xffffffffffffffff)) == 0) {
      return 1;
    }
  }
  uVar4 = CRYPTO_THREAD_run_once(&DAT_00d22028,FUN_00a849c4);
  if ((int)uVar4 == 0) {
    return uVar4;
  }
  if (DAT_00d2202c == 0) {
    return 0;
  }
  if ((uVar6 >> 0x12 & 1) != 0) {
    return 1;
  }
  if (!bVar1) {
    uVar4 = CRYPTO_atomic_load(&DAT_00d22020,&local_38,DAT_00d22008);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    if ((param_1 & (local_38 ^ 0xffffffffffffffff)) == 0) {
      return 1;
    }
  }
  if ((uVar6 >> 0x13 & 1) == 0) {
    uVar4 = CRYPTO_THREAD_run_once(&DAT_00d22030,FUN_00a84a64);
    iVar2 = (int)uVar4;
  }
  else {
    uVar4 = CRYPTO_THREAD_run_once(&DAT_00d22030,&LAB_00a84a54);
    iVar2 = (int)uVar4;
  }
  if (iVar2 == 0) {
    return uVar4;
  }
  if (DAT_00d22034 == 0) {
    return 0;
  }
  uVar4 = CRYPTO_THREAD_run_once(&DAT_00d22038,&LAB_00a84a90);
  if ((int)uVar4 == 0) {
    return uVar4;
  }
  if (DAT_00d2203c == '\0') {
    return 0;
  }
  if ((param_1 & 1) != 0) {
    uVar4 = CRYPTO_THREAD_run_once(&DAT_00d22040,&LAB_00a84aa0);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    if (DAT_00d22044 == 0) {
      return 0;
    }
  }
  if ((uVar6 >> 1 & 1) != 0) {
    uVar4 = CRYPTO_THREAD_run_once(&DAT_00d22040,FUN_00a84ab0);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    if (DAT_00d22044 == 0) {
      return 0;
    }
  }
  if ((uVar6 >> 4 & 1) != 0) {
    uVar4 = CRYPTO_THREAD_run_once(&DAT_00d22048,&LAB_00a84acc);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    if (DAT_00d2204c == '\0') {
      return 0;
    }
  }
  if ((uVar6 >> 2 & 1) != 0) {
    uVar4 = CRYPTO_THREAD_run_once(&DAT_00d22048,FUN_00a84adc);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    if (DAT_00d2204c == '\0') {
      return 0;
    }
  }
  if ((uVar6 >> 5 & 1) != 0) {
    uVar4 = CRYPTO_THREAD_run_once(&DAT_00d22050,&LAB_00a84afc);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    if (DAT_00d22054 == '\0') {
      return 0;
    }
  }
  if ((uVar6 >> 3 & 1) != 0) {
    uVar4 = CRYPTO_THREAD_run_once(&DAT_00d22050,FUN_00a84b0c);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    if (DAT_00d22054 == '\0') {
      return 0;
    }
  }
  if (((uVar6 >> 0x11 & 1) != 0) && (uVar4 = openssl_init_fork_handlers(0), (int)uVar4 == 0)) {
    return uVar4;
  }
  if ((uVar6 >> 7 & 1) != 0) {
    uVar4 = CRYPTO_THREAD_run_once(&DAT_00d22058,FUN_00a84b2c);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    if (DAT_00d2205c == 0) {
      return 0;
    }
  }
  if (((uVar6 >> 6 & 1) == 0) || (lVar5 = CRYPTO_THREAD_get_local(&DAT_00d22018), lVar5 != 0)) {
LAB_00a84820:
    if (((((((uVar6 >> 8 & 1) == 0) ||
           ((uVar4 = CRYPTO_THREAD_run_once(&DAT_00d22068,FUN_00a84b90), (int)uVar4 != 0 &&
            (uVar4 = 0, DAT_00d2206c != 0)))) &&
          (((uVar6 >> 0xb & 1) == 0 ||
           ((uVar4 = CRYPTO_THREAD_run_once(&DAT_00d22070,FUN_00a84bc4), (int)uVar4 != 0 &&
            (uVar4 = 0, DAT_00d22074 != '\0')))))) &&
         (((uVar6 >> 9 & 1) == 0 ||
          ((uVar4 = CRYPTO_THREAD_run_once(&DAT_00d22078,FUN_00a84be4), (int)uVar4 != 0 &&
           (uVar4 = 0, DAT_00d2207c != '\0')))))) &&
        (((uVar6 >> 10 & 1) == 0 ||
         ((uVar4 = CRYPTO_THREAD_run_once(&DAT_00d22080,FUN_00a84c04), (int)uVar4 != 0 &&
          (uVar4 = 0, DAT_00d22084 != '\0')))))) &&
       (((uVar6 >> 0xe & 1) == 0 ||
        ((uVar4 = CRYPTO_THREAD_run_once(&DAT_00d22088,FUN_00a84c24), (int)uVar4 != 0 &&
         (uVar4 = 0, DAT_00d2208c != '\0')))))) {
      if ((param_1 & 0xfe00) != 0) {
        ENGINE_register_all_complete();
      }
      iVar2 = CRYPTO_atomic_or(&DAT_00d22020,param_1,&local_38,DAT_00d22008);
      uVar4 = (ulong)(iVar2 != 0);
    }
  }
  else {
    uVar4 = CRYPTO_THREAD_set_local(&DAT_00d22018,0xffffffffffffffff);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    if (param_2 == 0) {
      uVar4 = CRYPTO_THREAD_run_once(&DAT_00d22058,FUN_00a84b4c);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
      iVar2 = DAT_00d2205c;
LAB_00a849b4:
      if (0 < iVar2) goto LAB_00a84820;
    }
    else {
      uVar4 = CRYPTO_THREAD_write_lock(DAT_00d22010);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
      DAT_00d22060 = param_2;
      iVar3 = CRYPTO_THREAD_run_once(&DAT_00d22058,FUN_00a84b6c);
      iVar2 = DAT_00d2205c;
      DAT_00d22060 = 0;
      CRYPTO_THREAD_unlock(DAT_00d22010);
      if (iVar3 != 0) goto LAB_00a849b4;
    }
    uVar4 = 0;
  }
  return uVar4;
}

