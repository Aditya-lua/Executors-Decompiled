
undefined8 FUN_0065deb8(void)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  long lVar3;
  long *unaff_x20;
  undefined8 uVar4;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  
  puVar1 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  uVar4 = *puVar1;
  lVar3 = puVar1[2];
  puVar1[1] = 0;
  puVar1[2] = 0;
  *puVar1 = 0;
  uVar2 = (**(code **)(*unaff_x20 + 0x10))();
  if (lVar3 < 0) {
    __ZdlPv(uVar4);
  }
  if (in_stack_00000018 < 0) {
    __ZdlPv(in_stack_00000008);
    return uVar2;
  }
  return uVar2;
}

