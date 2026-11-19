/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a36f40
 */

int ECDSA_verify(int type,uchar *dgst,int dgstlen,uchar *sig,int siglen,EC_KEY *eckey)

{
  int iVar1;
  
  if (*(code **)(*(long *)eckey + 0x68) == (code *)0x0) {
    ERR_new(type,dgst,dgstlen,sig,siglen);
    ERR_set_debug("crypto/ec/ecdsa_vrf.c",0x2f,"ECDSA_verify");
    ERR_set_error(0x10,0x98,0);
    return -1;
  }
                    /* WARNING: Could not recover jumptable at 0x00a36f4c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (**(code **)(*(long *)eckey + 0x68))();
  return iVar1;
}

