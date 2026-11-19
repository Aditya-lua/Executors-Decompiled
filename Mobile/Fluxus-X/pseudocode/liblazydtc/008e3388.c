/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e3388
 */

undefined8 DobbyHook(long param_1,long param_2,undefined8 *param_3)

{
  undefined4 uVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  
  if (param_1 == 0) {
    FUN_008e34b8();
    uVar2 = 0xffffffff;
    log_internal_impl();
    log_internal_impl(0xffffffff,"[!] function address is 0x0\n");
  }
  else {
    uVar2 = FUN_008e4ce8();
    lVar3 = FUN_008e4d3c(uVar2,param_1);
    if ((lVar3 == 0) || (*(long *)(*(long *)(lVar3 + 0x10) + 0x30) != param_2)) {
      puVar4 = operator_new(0x70);
      puVar4[1] = 0;
      *puVar4 = 0;
      puVar4[3] = 0;
      puVar4[2] = 0;
      puVar4[5] = 0;
      puVar4[4] = 0;
      puVar4[7] = 0;
      puVar4[6] = 0;
      puVar4[9] = 0;
      puVar4[8] = 0;
      puVar4[0xb] = 0;
      puVar4[10] = 0;
      puVar4[0xd] = 0;
      puVar4[0xc] = 0;
      FUN_008e4ce8();
      uVar1 = FUN_008e4d8c();
      *(undefined4 *)puVar4 = uVar1;
      *(undefined4 *)((long)puVar4 + 4) = 1;
      puVar4[1] = param_1;
      puVar5 = operator_new(0x40);
      puVar4[2] = puVar5;
      puVar5[4] = 0;
      puVar5[5] = 0;
      puVar5[6] = 0;
      puVar5[7] = param_2;
      *puVar5 = &PTR_FUN_00c4e3b0;
      puVar5[1] = puVar4;
      FUN_008e34d8();
      (**(code **)*puVar5)(puVar5);
      uVar2 = FUN_008e4ce8();
      FUN_008e4d54(uVar2,puVar4);
      *param_3 = puVar4[3];
      FUN_008e3624(puVar5);
      uVar2 = 0;
    }
    else {
      FUN_008e34b8();
      uVar2 = 0xffffffff;
      log_internal_impl();
      log_internal_impl(0xffffffff,"[!] function %p already been hooked.\n",param_1);
    }
  }
  return uVar2;
}

