/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac82e4
 */

ulong RAND_priv_bytes_ex(undefined8 param_1,uchar *param_2,undefined8 param_3,undefined4 param_4)

{
  uint uVar1;
  RAND_METHOD *pRVar2;
  RAND_METHOD *pRVar3;
  long lVar4;
  ulong uVar5;
  
  pRVar2 = RAND_get_rand_method();
  if ((pRVar2 == (RAND_METHOD *)0x0) || (pRVar3 = (RAND_METHOD *)RAND_OpenSSL(), pRVar2 == pRVar3))
  {
    lVar4 = RAND_get0_private(param_1);
    uVar5 = 0;
    if (lVar4 != 0) {
      uVar5 = EVP_RAND_generate(lVar4,param_2,param_3,param_4,0,0,0);
      return uVar5;
    }
  }
  else {
    if (pRVar2->bytes != (_func_3913 *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00ac8340. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar1 = (*pRVar2->bytes)(param_2,(int)param_3);
      return (ulong)uVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/rand/rand_lib.c",0x14f,"RAND_priv_bytes_ex");
    ERR_set_error(0x24,0x65,0);
    uVar5 = 0xffffffff;
  }
  return uVar5;
}

