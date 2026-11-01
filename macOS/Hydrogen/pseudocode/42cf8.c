
void FUN_00042cf8(void)

{
  undefined8 *puVar1;
  undefined8 *unaff_x19;
  undefined8 uVar2;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  
  uStack0000000000000008._0_4_ = 0x534541;
  puVar1 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack0000000000000008,"/",1);
  in_stack_00000028 = puVar1[1];
  uStack0000000000000020 = *puVar1;
  in_stack_00000030 = puVar1[2];
  puVar1[1] = 0;
  puVar1[2] = 0;
  *puVar1 = 0;
  puVar1 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack0000000000000020,"ECB",3);
  uVar2 = *puVar1;
  unaff_x19[1] = puVar1[1];
  *unaff_x19 = uVar2;
  unaff_x19[2] = puVar1[2];
  puVar1[1] = 0;
  puVar1[2] = 0;
  *puVar1 = 0;
  if (in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  if (in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(CONCAT44(uStack0000000000000008._4_4_,(undefined4)uStack0000000000000008));
    return;
  }
  return;
}

