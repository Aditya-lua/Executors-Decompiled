
void FUN_00049fa0(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 *puVar1;
  undefined8 *unaff_x19;
  undefined8 uVar2;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  
  puVar1 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6insertEmPKcm
                     (&uStack0000000000000008,0,param_3,5);
  uVar2 = *puVar1;
  unaff_x19[1] = puVar1[1];
  *unaff_x19 = uVar2;
  unaff_x19[2] = puVar1[2];
  puVar1[1] = 0;
  puVar1[2] = 0;
  *puVar1 = 0;
  if (in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000008);
    return;
  }
  return;
}

