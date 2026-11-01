
void FUN_00082d70(void)

{
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  undefined8 *extraout_x8;
  undefined1 auVar6 [16];
  undefined8 in_stack_00000038;
  long in_stack_00000048;
  
  __ZNSt9exceptionD2Ev();
  if (in_stack_00000048 < 0) {
    __ZdlPv(in_stack_00000038);
  }
  auVar6 = __Unwind_Resume();
  puVar5 = auVar6._8_8_;
  *extraout_x8 = 0;
  extraout_x8[1] = 0;
  extraout_x8[2] = 0;
  lVar3 = _strlen();
  uVar1 = puVar5[1];
  if (-1 < (char)*(byte *)((long)puVar5 + 0x17)) {
    uVar1 = (ulong)*(byte *)((long)puVar5 + 0x17);
  }
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE7reserveEm
            (extraout_x8,uVar1 + lVar3);
  uVar4 = _strlen(auVar6._0_8_);
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
            (extraout_x8,auVar6._0_8_,uVar4);
  uVar1 = puVar5[1];
  puVar2 = (undefined8 *)*puVar5;
  if (-1 < (char)*(byte *)((long)puVar5 + 0x17)) {
    uVar1 = (ulong)*(byte *)((long)puVar5 + 0x17);
    puVar2 = puVar5;
  }
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
            (extraout_x8,puVar2,uVar1);
  return;
}

