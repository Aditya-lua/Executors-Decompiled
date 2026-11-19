/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b59430
 */

int FUN_00b59430(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 local_80;
  int local_74;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 local_50;
  
  memset(&local_70,0,0x50);
  uVar2 = *(undefined8 *)(param_1 + 0x30);
  local_74 = 0;
  OSSL_PARAM_construct_uint(&local_a0,"reseed_counter",&local_74);
  local_50 = local_80;
  uStack_68 = uStack_98;
  local_70 = local_a0;
  uStack_58 = uStack_88;
  uStack_60 = uStack_90;
  if (((*(long *)(param_1 + 0x30) == 0) || (*(code **)(param_1 + 0x40) == (code *)0x0)) ||
     (iVar1 = (**(code **)(param_1 + 0x40))(), iVar1 != 0)) {
    iVar1 = (**(code **)(param_1 + 0x50))(uVar2,&local_70);
    if (iVar1 == 0) {
      local_74 = 0;
    }
    if ((*(long *)(param_1 + 0x30) != 0) && (*(code **)(param_1 + 0x48) != (code *)0x0)) {
      (**(code **)(param_1 + 0x48))();
    }
  }
  else {
    ERR_new();
    ERR_set_debug("providers/implementations/rands/drbg.c",0x46,"ossl_drbg_lock_parent");
    ERR_set_error(0x39,0xb6,0);
    ERR_new();
    ERR_set_debug("providers/implementations/rands/drbg.c",0x75,"get_parent_reseed_count");
    ERR_set_error(0x39,0xc9,0);
    local_74 = *(int *)(param_1 + 0xd8) + -2;
    if (local_74 == 0) {
      local_74 = -1;
    }
  }
  return local_74;
}

