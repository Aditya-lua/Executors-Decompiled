/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac8288
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int RAND_status(void)

{
  int iVar1;
  uint uVar2;
  RAND_METHOD *pRVar3;
  RAND_METHOD *pRVar4;
  long lVar5;
  
  pRVar3 = RAND_get_rand_method();
  if ((pRVar3 == (RAND_METHOD *)0x0) || (pRVar4 = (RAND_METHOD *)RAND_OpenSSL(), pRVar3 == pRVar4))
  {
    lVar5 = RAND_get0_primary(0);
    uVar2 = 0;
    if (lVar5 != 0) {
      iVar1 = EVP_RAND_get_state();
      uVar2 = (uint)(iVar1 == 1);
    }
  }
  else {
    uVar2 = 0;
    if (pRVar3->status != (_func_3917 *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00ac82bc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      iVar1 = (*pRVar3->status)();
      return iVar1;
    }
  }
  return uVar2;
}

