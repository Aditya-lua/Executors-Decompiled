/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a19a1c
 */

/* WARNING: Type propagation algorithm not settling */

ulong DH_check_params_ex(undefined8 param_1)

{
  uint uVar1;
  ulong uVar2;
  uint local_14;
  
  local_14 = 0;
  uVar2 = DH_check_params(param_1,&local_14);
  uVar1 = local_14;
  if ((int)uVar2 != 0) {
    if ((local_14 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_check.c",0x24,"DH_check_params_ex");
      ERR_set_error(5,0x75,0);
    }
    if ((uVar1 >> 3 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_check.c",0x26,"DH_check_params_ex");
      ERR_set_error(5,0x78,0);
    }
    if ((uVar1 >> 7 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_check.c",0x28,"DH_check_params_ex");
      ERR_set_error(5,0x7e,0);
    }
    if ((uVar1 >> 8 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/dh/dh_check.c",0x2a,"DH_check_params_ex");
      ERR_set_error(5,0x67,0);
    }
    uVar2 = (ulong)(uVar1 == 0);
  }
  return uVar2;
}

