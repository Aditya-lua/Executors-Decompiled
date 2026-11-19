/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac8184
 */

void RAND_add(void *buf,int num,double entropy)

{
  RAND_METHOD *pRVar1;
  long lVar2;
  
  pRVar1 = RAND_get_rand_method();
  if ((pRVar1 != (RAND_METHOD *)0x0) && (pRVar1->add != (_func_3915 *)0x0)) {
                    /* WARNING: Could not recover jumptable at 0x00ac81c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*pRVar1->add)(buf,num,entropy);
    return;
  }
  lVar2 = RAND_get0_primary(0);
  if ((num < 1) || (lVar2 == 0)) {
    return;
  }
  EVP_RAND_reseed(lVar2,0,0,0,buf,(long)num);
  return;
}

