/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1a0d4
 */

bool DH_check_pub_key_ex(DH *param_1,BIGNUM *param_2)

{
  bool bVar1;
  int iVar2;
  uint local_14;
  
  local_14 = 0;
  iVar2 = DH_check_pub_key(param_1,param_2,(int *)&local_14);
  bVar1 = false;
  if (iVar2 != 0) {
    if ((local_14 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_check.c",0xee,"DH_check_pub_key_ex");
      ERR_set_error(5,0x7c,0);
    }
    if ((local_14 >> 1 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_check.c",0xf0,"DH_check_pub_key_ex");
      ERR_set_error(5,0x7b,0);
    }
    if ((local_14 >> 2 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_check.c",0xf2,"DH_check_pub_key_ex");
      ERR_set_error(5,0x7a,0);
    }
    bVar1 = local_14 == 0;
  }
  return bVar1;
}

