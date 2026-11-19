/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b59544
 */

undefined8 ossl_drbg_enable_locking(long *param_1)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  if ((param_1 == (long *)0x0) || (*param_1 != 0)) {
LAB_00b59580:
    uVar3 = 1;
  }
  else {
    if (((code *)param_1[7] == (code *)0x0) ||
       (iVar1 = (*(code *)param_1[7])(param_1[6]), iVar1 != 0)) {
      lVar2 = CRYPTO_THREAD_lock_new();
      *param_1 = lVar2;
      if (lVar2 != 0) goto LAB_00b59580;
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg.c",0x2ee,"ossl_drbg_enable_locking");
      uVar3 = 0xb4;
    }
    else {
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg.c",0x2e9,"ossl_drbg_enable_locking");
      uVar3 = 0xb6;
    }
    ERR_set_error(0x39,uVar3,0);
    uVar3 = 0;
  }
  return uVar3;
}

