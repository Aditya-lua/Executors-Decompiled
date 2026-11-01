
void FUN_0065a818(void)

{
  undefined8 *puVar1;
  undefined2 in_w8;
  undefined8 *unaff_x19;
  undefined8 uVar2;
  undefined4 uStack0000000000000000;
  undefined4 uStack0000000000000004;
  char cStack0000000000000017;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  long in_stack_00000040;
  
  cStack0000000000000017 = '\a';
  uStack0000000000000000 = 0x2d414853;
  uStack0000000000000004 = 0x363532;
  uStack0000000000000018._4_2_ = in_w8;
  puVar1 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack0000000000000018);
  in_stack_00000038 = puVar1[1];
  uStack0000000000000030 = *puVar1;
  in_stack_00000040 = puVar1[2];
  puVar1[1] = 0;
  puVar1[2] = 0;
  *puVar1 = 0;
  puVar1 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack0000000000000030,")",1);
  uVar2 = *puVar1;
  unaff_x19[1] = puVar1[1];
  *unaff_x19 = uVar2;
  unaff_x19[2] = puVar1[2];
  puVar1[1] = 0;
  puVar1[2] = 0;
  *puVar1 = 0;
  if (in_stack_00000040 < 0) {
    __ZdlPv(uStack0000000000000030);
  }
  if (cStack0000000000000017 < '\0') {
    __ZdlPv(CONCAT44(uStack0000000000000004,uStack0000000000000000));
  }
  if (in_stack_00000028._7_1_ < '\0') {
    __ZdlPv(CONCAT26(uStack0000000000000018._6_2_,
                     CONCAT24(uStack0000000000000018._4_2_,(undefined4)uStack0000000000000018)));
    return;
  }
  return;
}

