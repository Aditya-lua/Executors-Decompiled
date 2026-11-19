/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b21880
 */

undefined8 ossl_rsa_check_key(undefined8 param_1,undefined8 param_2,int param_3)

{
  int iVar1;
  undefined8 uVar2;
  char *pcVar3;
  
  if (param_3 < 0x200) {
    param_1 = 1;
    if (param_3 == 0x10) {
      return 1;
    }
    if (param_3 == 0x20) {
      return 1;
    }
    if (param_3 == 0x40) goto LAB_00b218e8;
  }
  else if (param_3 < 0x1000) {
    if ((param_3 == 0x200) || (param_3 == 0x400)) {
LAB_00b218e8:
      iVar1 = RSA_test_flags(param_2,0xf000);
      if (iVar1 != 0x1000) {
        return 1;
      }
      ERR_new();
      ERR_set_debug("providers/common/securitycheck.c",0x30,"ossl_rsa_check_key");
      pcVar3 = "operation: %d";
      uVar2 = 0xb2;
      goto LAB_00b21964;
    }
  }
  else if ((param_3 == 0x2000) || (param_3 == 0x1000)) goto LAB_00b218e8;
  ERR_new(param_1);
  ERR_set_debug("providers/common/securitycheck.c",0x37,"ossl_rsa_check_key");
  pcVar3 = "invalid operation: %d";
  uVar2 = 0xc0103;
LAB_00b21964:
  ERR_set_error(0x39,uVar2,pcVar3,param_3);
  return 0;
}

