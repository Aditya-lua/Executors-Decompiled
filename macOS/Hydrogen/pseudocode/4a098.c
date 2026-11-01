
void FUN_0004a098(undefined8 *param_1)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000018;
  
  func_0x00049b30(&uStack0000000000000008,0x200,10);
  puVar1 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6insertEmPKcm
                     (&uStack0000000000000008,0,"SHA3-",5);
  uVar2 = *puVar1;
  param_1[1] = puVar1[1];
  *param_1 = uVar2;
  param_1[2] = puVar1[2];
  puVar1[1] = 0;
  puVar1[2] = 0;
  *puVar1 = 0;
  if (in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000008);
    return;
  }
  return;
}

