
/* WARNING: Removing unreachable block (ram,0x00647250) */

void FUN_00647198(undefined8 *param_1)

{
  undefined8 *puVar1;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  long in_stack_00000050;
  
  *param_1 = 0;
  puVar1 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack0000000000000020,"(",1);
  in_stack_00000048 = puVar1[1];
  uStack0000000000000040 = *puVar1;
  in_stack_00000050 = puVar1[2];
  puVar1[1] = 0;
  puVar1[2] = 0;
  *puVar1 = 0;
  puVar1 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack0000000000000040,"SHA-1",5);
  uVar3 = puVar1[1];
  uVar2 = *puVar1;
  *(undefined8 *)(unaff_x29 + -0x20) = puVar1[2];
  *(undefined8 *)(unaff_x29 + -0x28) = uVar3;
  *(undefined8 *)(unaff_x29 + -0x30) = uVar2;
  puVar1[1] = 0;
  puVar1[2] = 0;
  *puVar1 = 0;
  puVar1 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (unaff_x29 + -0x30,")",1);
  uVar2 = *puVar1;
  unaff_x19[1] = puVar1[1];
  *unaff_x19 = uVar2;
  unaff_x19[2] = puVar1[2];
  puVar1[1] = 0;
  puVar1[2] = 0;
  *puVar1 = 0;
  if (in_stack_00000050 < 0) {
    __ZdlPv(uStack0000000000000040);
  }
  if (in_stack_00000030._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000020);
  }
  if (in_stack_00000018 < 0) {
    __ZdlPv(in_stack_00000008);
    return;
  }
  return;
}

