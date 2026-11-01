
/* WARNING: Removing unreachable block (ram,0x0007a708) */
/* WARNING: Removing unreachable block (ram,0x0007a728) */
/* WARNING: Removing unreachable block (ram,0x0007a738) */
/* WARNING: Removing unreachable block (ram,0x0007a748) */

long FUN_0007a74c(undefined8 param_1,undefined8 param_2,long param_3,undefined8 param_4)

{
  undefined1 auVar1 [16];
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  long in_stack_00000048;
  undefined8 in_stack_00000050;
  long in_stack_00000060;
  undefined8 in_stack_00000070;
  long in_stack_00000080;
  
  if (-1 < in_stack_00000030) goto LAB_0007a6d8;
code_r0x0007a758:
  __ZdlPv(in_stack_00000020);
  if (-1 < in_stack_00000080) goto LAB_0007a6e0;
LAB_0007a778:
  __ZdlPv(in_stack_00000070);
  if (-1 < in_stack_00000060) goto LAB_0007a6e8;
  while (__ZdlPv(in_stack_00000050), -1 < in_stack_00000048) {
    while( true ) {
      __Unwind_Resume(param_1);
      __ZdlPv(in_stack_00000008);
      if (in_stack_00000030 < 0) goto code_r0x0007a758;
LAB_0007a6d8:
      if (in_stack_00000080 < 0) goto LAB_0007a778;
LAB_0007a6e0:
      if (in_stack_00000060 < 0) break;
LAB_0007a6e8:
      if (in_stack_00000048 < 0) goto LAB_0007a7b8;
    }
  }
LAB_0007a7b8:
  __ZdlPv(in_stack_00000038);
  auVar1 = __Unwind_Resume(param_1);
  param_3 = param_3 * auVar1._8_8_;
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
            (param_4,auVar1._0_8_,param_3);
  return param_3;
}

