/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a36ef0
 */

int ECDSA_do_verify(uchar *dgst,int dgst_len,ECDSA_SIG *sig,EC_KEY *eckey)

{
  int iVar1;
  
  if (*(code **)(*(long *)eckey + 0x70) == (code *)0x0) {
    ERR_new(dgst,dgst_len);
    ERR_set_debug("crypto/ec/ecdsa_vrf.c",0x1f,"ECDSA_do_verify");
    ERR_set_error(0x10,0x98,0);
    return -1;
  }
                    /* WARNING: Could not recover jumptable at 0x00a36efc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  iVar1 = (**(code **)(*(long *)eckey + 0x70))();
  return iVar1;
}

