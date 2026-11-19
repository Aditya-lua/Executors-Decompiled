/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a19c54
 */

/* WARNING: Type propagation algorithm not settling */

bool DH_check_ex(DH *param_1)

{
  bool bVar1;
  int iVar2;
  uint local_14;
  
  local_14 = 0;
  iVar2 = DH_check(param_1,(int *)&local_14);
  bVar1 = false;
  if (iVar2 != 0) {
    if ((local_14 >> 3 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_check.c",0x77,"DH_check_ex");
      ERR_set_error(5,0x78,0);
    }
    if ((local_14 >> 4 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_check.c",0x79,"DH_check_ex");
      ERR_set_error(5,0x77,0);
    }
    if ((local_14 >> 5 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_check.c",0x7b,"DH_check_ex");
      ERR_set_error(5,0x74,0);
    }
    if ((local_14 >> 6 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_check.c",0x7d,"DH_check_ex");
      ERR_set_error(5,0x73,0);
    }
    if ((local_14 >> 2 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_check.c",0x7f,"DH_check_ex");
      ERR_set_error(5,0x79,0);
    }
    if ((local_14 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_check.c",0x81,"DH_check_ex");
      ERR_set_error(5,0x75,0);
    }
    if ((local_14 >> 1 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_check.c",0x83,"DH_check_ex");
      ERR_set_error(5,0x76,0);
    }
    if ((local_14 >> 7 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_check.c",0x85,"DH_check_ex");
      ERR_set_error(5,0x7e,0);
    }
    if ((local_14 >> 8 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_check.c",0x87,"DH_check_ex");
      ERR_set_error(5,0x67,0);
    }
    bVar1 = local_14 == 0;
  }
  return bVar1;
}

