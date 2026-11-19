/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c8cb8
 */

undefined8 srp_verify_server_param(long param_1)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  iVar1 = BN_ucmp(*(BIGNUM **)(param_1 + 0xc00),*(BIGNUM **)(param_1 + 0xbf8));
  if (((iVar1 < 0) &&
      (iVar1 = BN_ucmp(*(BIGNUM **)(param_1 + 0xc10),*(BIGNUM **)(param_1 + 0xbf8)), iVar1 < 0)) &&
     (iVar1 = BN_is_zero(*(undefined8 *)(param_1 + 0xc10)), iVar1 == 0)) {
    iVar1 = BN_num_bits(*(BIGNUM **)(param_1 + 0xbf8));
    if (iVar1 < *(int *)(param_1 + 0xc40)) {
      ERR_new();
      uVar3 = 0x18d;
    }
    else {
      if (*(code **)(param_1 + 0xbe0) != (code *)0x0) {
        iVar1 = (**(code **)(param_1 + 0xbe0))(param_1,*(undefined8 *)(param_1 + 0xbd0));
        if (0 < iVar1) {
          return 1;
        }
        ERR_new();
        ERR_set_debug("ssl/tls_srp.c",0x193,"srp_verify_server_param");
        uVar3 = 0x47;
        uVar4 = 0xea;
        goto LAB_009c8d18;
      }
      lVar2 = SRP_check_known_gN_param
                        (*(undefined8 *)(param_1 + 0xc00),*(undefined8 *)(param_1 + 0xbf8));
      if (lVar2 != 0) {
        return 1;
      }
      ERR_new();
      uVar3 = 0x198;
    }
    ERR_set_debug("ssl/tls_srp.c",uVar3,"srp_verify_server_param");
    uVar3 = 0x47;
    uVar4 = 0xf1;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/tls_srp.c",0x188,"srp_verify_server_param");
    uVar3 = 0x2f;
    uVar4 = 0x186;
  }
LAB_009c8d18:
  ossl_statem_fatal(param_1,uVar3,uVar4,0);
  return 0;
}

