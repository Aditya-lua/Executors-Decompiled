/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b47228
 */

undefined8 FUN_00b47228(undefined8 *param_1,undefined8 *param_2,long param_3)

{
  undefined8 uVar1;
  void *pvVar2;
  
  CRYPTO_clear_free(*param_1,*param_2,"providers/implementations/kdfs/pbkdf2.c",0x80);
  *param_1 = 0;
  *param_2 = 0;
  if (*(long *)(param_3 + 0x18) == 0) {
    pvVar2 = CRYPTO_malloc(1,"providers/implementations/kdfs/pbkdf2.c",0x85);
    *param_1 = pvVar2;
    if (pvVar2 == (void *)0x0) {
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/pbkdf2.c",0x86,"pbkdf2_set_membuf");
      ERR_set_error(0x39,0xc0100,0);
      return 0;
    }
  }
  else if ((*(long *)(param_3 + 0x10) != 0) &&
          (uVar1 = OSSL_PARAM_get_octet_string(param_3,param_1,0,param_2), (int)uVar1 == 0)) {
    return uVar1;
  }
  return 1;
}

