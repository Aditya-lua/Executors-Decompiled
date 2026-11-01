
/* WARNING: Removing unreachable block (ram,0x006596f8) */

void FUN_00659678(undefined8 *param_1)

{
  undefined8 *puVar1;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined8 uVar2;
  undefined8 uStack0000000000000008;
  char cStack000000000000001f;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000048;
  
  param_1[1] = 0;
  param_1[2] = 0;
  *param_1 = 0;
  cStack000000000000001f = '\x01';
  uStack0000000000000008._0_2_ = 0x29;
  puVar1 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (unaff_x29 + -0x30,&uStack0000000000000008,1);
  uVar2 = *puVar1;
  unaff_x19[1] = puVar1[1];
  *unaff_x19 = uVar2;
  unaff_x19[2] = puVar1[2];
  puVar1[1] = 0;
  puVar1[2] = 0;
  *puVar1 = 0;
  if (cStack000000000000001f < '\0') {
    __ZdlPv(CONCAT62(uStack0000000000000008._2_6_,(undefined2)uStack0000000000000008));
  }
  if (in_stack_00000030._7_1_ < '\0') {
    __ZdlPv(in_stack_00000020);
  }
  if (in_stack_00000048._7_1_ < '\0') {
    __ZdlPv(in_stack_00000038);
    return;
  }
  return;
}

