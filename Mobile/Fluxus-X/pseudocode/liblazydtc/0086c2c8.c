/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086c2c8
 */

undefined8 FUN_0086c2c8(long param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  long *plVar5;
  undefined1 auVar6 [16];
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 local_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  undefined8 uStack_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  if (*(char *)(param_1 + 0x68) == '\x01') {
    lVar3 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x38);
    local_88 = 0xffffffffffffffff;
    local_80 = 0xffffffffffffffff;
    local_78 = 0;
    uStack_70 = 0;
    local_68 = 0xffffffffffffffff;
    uStack_60 = 0xffffffffffffffff;
    FUN_00851ed0(lVar3,&local_88);
  }
  else {
    lVar3 = 0;
  }
  lVar1 = 0;
  if (lVar3 != 0) {
    lVar1 = lVar3 + 8;
  }
  local_88 = 0;
  local_80 = 0;
  auVar6 = FUN_0086c3dc(param_1,lVar1,&local_88);
  uStack_90 = local_80;
  local_98 = param_2;
  uVar4 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x38);
  FUN_0084f6c8(uVar4,&local_98,param_3,auVar6._0_8_,auVar6._8_8_);
  if (*(char *)(param_1 + 0x68) == '\x01') {
    local_98 = uVar4;
    plVar5 = (long *)FUN_00860fa0(param_1 + 0x4b0,&local_98);
    *plVar5 = lVar3;
  }
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar4;
}

