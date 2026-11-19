/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b60a34
 */

void ossl_digest_rsa_sign_get_md_nid(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = ossl_digest_get_approved_nid_with_sha1(param_1,param_2,1);
  if (iVar1 == 0) {
    ossl_digest_md_to_nid(param_2,&DAT_00ca5d68,6);
    return;
  }
  return;
}

