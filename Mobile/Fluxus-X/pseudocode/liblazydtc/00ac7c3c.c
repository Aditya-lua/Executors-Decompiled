/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac7c3c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int RAND_poll(void)

{
  int iVar1;
  RAND_METHOD *pRVar2;
  RAND_METHOD *pRVar3;
  long lVar4;
  long lVar5;
  void *buf;
  ulong uVar6;
  uint uVar7;
  _func_3915 *p_Var8;
  
  pRVar2 = RAND_get_rand_method();
  pRVar3 = (RAND_METHOD *)RAND_OpenSSL();
  uVar7 = 0;
  if (pRVar2 != (RAND_METHOD *)0x0) {
    if (pRVar2 == pRVar3) {
      pRVar2 = RAND_get_rand_method();
      if ((pRVar2 == (RAND_METHOD *)0x0) || (pRVar2->seed == (_func_3912 *)0x0)) {
        lVar4 = RAND_get0_primary(0);
        if (lVar4 != 0) {
          EVP_RAND_reseed(lVar4,0,0,0,"polling",8);
        }
      }
      else {
        (*pRVar2->seed)("polling",8);
      }
      uVar7 = 1;
    }
    else {
      lVar4 = ossl_rand_pool_new(0x100,1,0x20,0x3000);
      if (lVar4 == 0) {
        uVar7 = 0;
      }
      else {
        lVar5 = ossl_pool_acquire_entropy();
        if ((lVar5 == 0) || (p_Var8 = pRVar2->add, p_Var8 == (_func_3915 *)0x0)) {
          uVar7 = 0;
        }
        else {
          buf = (void *)ossl_rand_pool_buffer(lVar4);
          iVar1 = ossl_rand_pool_length(lVar4);
          uVar6 = ossl_rand_pool_entropy(lVar4);
          iVar1 = (*p_Var8)(buf,iVar1,(double)uVar6 * 0.125);
          uVar7 = (uint)(iVar1 != 0);
        }
        ossl_rand_pool_free(lVar4);
      }
    }
  }
  return uVar7;
}

