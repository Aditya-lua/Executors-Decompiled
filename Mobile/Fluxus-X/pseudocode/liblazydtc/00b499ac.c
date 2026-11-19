/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b499ac
 */

undefined8 FUN_00b499ac(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  iVar1 = ossl_prov_is_running();
  if ((iVar1 != 0) && (iVar1 = FUN_00b496d8(param_1,param_4), iVar1 != 0)) {
    if (*(long *)(param_1 + 0x28) == 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/sskdf.c",0x1ad,"x963kdf_derive");
      uVar3 = 0x84;
    }
    else if (*(long *)(param_1 + 8) == 0) {
      lVar2 = ossl_prov_digest_md(param_1 + 0x10);
      if (lVar2 != 0) {
        uVar3 = FUN_00b49ab4(lVar2,*(undefined8 *)(param_1 + 0x28),*(undefined8 *)(param_1 + 0x30),
                             *(undefined8 *)(param_1 + 0x38),*(undefined8 *)(param_1 + 0x40),1,
                             param_2,param_3);
        return uVar3;
      }
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/sskdf.c",0x1b9,"x963kdf_derive");
      uVar3 = 0x81;
    }
    else {
      ERR_new();
      ERR_set_debug("providers/implementations/kdfs/sskdf.c",0x1b2,"x963kdf_derive");
      uVar3 = 0x88;
    }
    ERR_set_error(0x39,uVar3,0);
  }
  return 0;
}

