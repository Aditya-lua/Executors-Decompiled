/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b60684
 */

undefined8 FUN_00b60684(long param_1,long param_2,long param_3,int param_4)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = *(int *)(param_1 + 0x68);
  if (iVar1 == 6) {
    if (*(int *)(param_1 + 0xb4) == -1) {
      return 1;
    }
    if ((param_2 == 0) || (iVar1 = EVP_MD_is_a(*(undefined8 *)(param_1 + 0x20)), iVar1 != 0)) {
      if (param_3 == 0) {
        return 1;
      }
      iVar1 = EVP_MD_is_a(*(undefined8 *)(param_1 + 0x70),param_3);
      if (iVar1 != 0) {
        return 1;
      }
    }
    ERR_new();
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x90,"rsa_check_padding");
    uVar2 = 0xae;
  }
  else if (iVar1 == 5) {
    iVar1 = RSA_X931_hash_id(param_4);
    if (iVar1 != -1) {
      return 1;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x87,"rsa_check_padding");
    uVar2 = 0xaa;
  }
  else {
    if ((iVar1 != 3) || ((param_2 == 0 && (param_4 == 0)))) {
      return 1;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x81,"rsa_check_padding");
    uVar2 = 0xa8;
  }
  ERR_set_error(0x39,uVar2,0);
  return 0;
}

