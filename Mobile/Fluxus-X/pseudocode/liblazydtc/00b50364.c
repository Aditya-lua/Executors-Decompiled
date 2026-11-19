/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b50364
 */

undefined4 FUN_00b50364(long param_1,ulong param_2,code *param_3,undefined8 param_4)

{
  int iVar1;
  undefined4 uVar2;
  long lVar3;
  long lVar4;
  
  iVar1 = ossl_prov_is_running();
  uVar2 = 0;
  if ((((param_2 & 3) != 0) && (param_1 != 0)) && (iVar1 != 0)) {
    lVar3 = OSSL_PARAM_BLD_new();
    if (lVar3 == 0) {
      uVar2 = 0;
    }
    else {
      iVar1 = ossl_param_build_set_octet_string
                        (lVar3,0,&DAT_002ad463,param_1 + 0x11,*(undefined8 *)(param_1 + 0x58));
      if (((iVar1 == 0) ||
          ((((param_2 & 1) != 0 && (*(long *)(param_1 + 0x50) != 0)) &&
           (iVar1 = ossl_param_build_set_octet_string
                              (lVar3,0,&DAT_002a3e83,*(long *)(param_1 + 0x50),
                               *(undefined8 *)(param_1 + 0x58)), iVar1 == 0)))) ||
         (lVar4 = OSSL_PARAM_BLD_to_param(lVar3), lVar4 == 0)) {
        uVar2 = 0;
      }
      else {
        uVar2 = (*param_3)(lVar4,param_4);
        OSSL_PARAM_free(lVar4);
      }
      OSSL_PARAM_BLD_free(lVar3);
    }
  }
  return uVar2;
}

