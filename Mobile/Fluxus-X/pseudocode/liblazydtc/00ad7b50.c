/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad7b50
 */

int RSA_generate_key_ex(RSA *rsa,int bits,BIGNUM *e,BN_GENCB *cb)

{
  int iVar1;
  
  if (*(code **)(rsa->engine + 0x68) == (code *)0x0) {
    iVar1 = RSA_generate_multi_prime_key((int)rsa,bits,2);
    return iVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x00ad7b6c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (**(code **)(rsa->engine + 0x68))((int)rsa,bits,e,cb);
  return iVar1;
}

