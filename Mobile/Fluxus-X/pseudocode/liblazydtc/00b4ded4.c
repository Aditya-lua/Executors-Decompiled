/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4ded4
 */

undefined8 FUN_00b4ded4(long param_1,undefined4 *param_2)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  
  if ((*(BIGNUM **)(param_1 + 8) == (BIGNUM *)0x0) || (*(long *)(param_1 + 0x10) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/dsa/dsa_check.c",0x19,"dsa_precheck_params");
    uVar3 = 0x72;
  }
  else {
    iVar1 = BN_num_bits(*(BIGNUM **)(param_1 + 8));
    if (iVar1 < 0x2711) {
      iVar1 = BN_num_bits(*(BIGNUM **)(param_1 + 0x10));
      iVar2 = BN_num_bits(*(BIGNUM **)(param_1 + 8));
      if (iVar1 < iVar2) {
        return 1;
      }
      ERR_new();
      ERR_set_debug("crypto/dsa/dsa_check.c",0x25,"dsa_precheck_params");
      uVar3 = 0x66;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/dsa/dsa_check.c",0x1f,"dsa_precheck_params");
      uVar3 = 0x67;
    }
  }
  ERR_set_error(10,uVar3,0);
  *param_2 = 0x800;
  return 0;
}

