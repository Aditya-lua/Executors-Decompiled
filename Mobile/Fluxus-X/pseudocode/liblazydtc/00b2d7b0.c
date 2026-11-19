/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2d7b0
 */

undefined8
FUN_00b2d7b0(undefined8 param_1,undefined8 param_2,undefined8 *param_3,ulong param_4,
            undefined8 param_5,ulong param_6)

{
  int iVar1;
  undefined8 uVar2;
  
  *param_3 = 0;
  if (param_6 == 0) {
    return 1;
  }
  if (param_4 < param_6) {
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/cipher_tdes_wrap.c",0x9f,"tdes_wrap_update");
    uVar2 = 0x6a;
  }
  else {
    iVar1 = FUN_00b2d43c();
    if (iVar1 != 0) {
      return 1;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/cipher_tdes_wrap.c",0xa4,"tdes_wrap_update");
    uVar2 = 0x66;
  }
  ERR_set_error(0x39,uVar2,0);
  return 0;
}

