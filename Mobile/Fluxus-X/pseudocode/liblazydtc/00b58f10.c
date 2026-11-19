/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b58f10
 */

undefined8
FUN_00b58f10(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5,undefined4 param_6)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  uint uVar4;
  long *plVar5;
  uint local_4c;
  long local_48;
  
  local_48 = param_1;
  if (*(long *)(param_1 + 0x30) == 0) {
    uVar3 = ossl_prov_get_entropy(*(undefined8 *)(param_1 + 8),param_2,param_3,param_4,param_5);
    return uVar3;
  }
  plVar5 = (long *)(param_1 + 0x60);
  if (*plVar5 == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/rands/drbg.c",0xd3,"get_entropy");
    uVar3 = 0xbb;
  }
  else {
    iVar1 = FUN_00b59874(param_1,&local_4c);
    if (iVar1 == 0) {
      return 0;
    }
    uVar4 = *(uint *)(param_1 + 0x80);
    if (uVar4 <= local_4c) {
      lVar2 = *(long *)(param_1 + 0x30);
      if ((lVar2 != 0) && (*(code **)(param_1 + 0x40) != (code *)0x0)) {
        iVar1 = (**(code **)(param_1 + 0x40))();
        if (iVar1 == 0) {
          ERR_new();
          ERR_set_debug("providers/implementations/rands/drbg.c",0x46,"ossl_drbg_lock_parent");
          uVar3 = 0xb6;
          goto LAB_00b58fdc;
        }
        lVar2 = *(long *)(local_48 + 0x30);
        uVar4 = *(uint *)(local_48 + 0x80);
        plVar5 = (long *)(local_48 + 0x60);
      }
      uVar3 = (*(code *)*plVar5)(lVar2,param_2,uVar4,param_4,param_5,param_6,&local_48,8);
      if (*(long *)(local_48 + 0x30) == 0) {
        return uVar3;
      }
      if (*(code **)(local_48 + 0x48) == (code *)0x0) {
        return uVar3;
      }
      (**(code **)(local_48 + 0x48))(*(long *)(local_48 + 0x30));
      return uVar3;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/rands/drbg.c",0xdd,"get_entropy");
    uVar3 = 0xc2;
  }
LAB_00b58fdc:
  ERR_set_error(0x39,uVar3,0);
  return 0;
}

