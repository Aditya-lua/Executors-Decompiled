/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b59874
 */

undefined8 FUN_00b59874(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 local_60;
  
  memset(&local_80,0,0x50);
  if (*(long *)(param_1 + 0x50) == 0) {
    ERR_new();
    uVar2 = 0x5b;
  }
  else {
    uVar2 = *(undefined8 *)(param_1 + 0x30);
    OSSL_PARAM_construct_uint(&local_a8,"strength",param_2);
    local_60 = local_88;
    uStack_78 = uStack_a0;
    local_80 = local_a8;
    uStack_68 = uStack_90;
    uStack_70 = local_98;
    if (((*(long *)(param_1 + 0x30) != 0) && (*(code **)(param_1 + 0x40) != (code *)0x0)) &&
       (iVar1 = (**(code **)(param_1 + 0x40))(), iVar1 == 0)) {
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg.c",0x46,"ossl_drbg_lock_parent");
      ERR_set_error(0x39,0xb6,0);
      ERR_new();
      ERR_set_debug("providers/implementations/rands/drbg.c",0x61,"get_parent_strength");
      uVar2 = 0xc9;
      goto LAB_00b59964;
    }
    iVar1 = (**(code **)(param_1 + 0x50))(uVar2,&local_80);
    if ((*(long *)(param_1 + 0x30) != 0) && (*(code **)(param_1 + 0x48) != (code *)0x0)) {
      (**(code **)(param_1 + 0x48))(*(long *)(param_1 + 0x30));
    }
    if (iVar1 != 0) {
      return 1;
    }
    ERR_new();
    uVar2 = 0x67;
  }
  ERR_set_debug("providers/implementations/rands/drbg.c",uVar2,"get_parent_strength");
  uVar2 = 199;
LAB_00b59964:
  ERR_set_error(0x39,uVar2,0);
  return 0;
}

