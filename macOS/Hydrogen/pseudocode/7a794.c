
/* WARNING: Removing unreachable block (ram,0x0007a708) */
/* WARNING: Removing unreachable block (ram,0x0007a728) */
/* WARNING: Removing unreachable block (ram,0x0007a738) */
/* WARNING: Removing unreachable block (ram,0x0007a748) */

long FUN_0007a794(undefined8 param_1,undefined8 param_2,long param_3,undefined8 param_4)

{
  int in_w8;
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
  
  if (-1 < in_w8) goto joined_r0x0007a7a4;
  do {
    __ZdlPv(in_stack_00000050);
joined_r0x0007a7a4:
    do {
      if (in_stack_00000048 < 0) {
        __ZdlPv(in_stack_00000038);
        auVar1 = __Unwind_Resume();
        param_3 = param_3 * auVar1._8_8_;
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                  (param_4,auVar1._0_8_,param_3);
        return param_3;
      }
      __Unwind_Resume();
      __ZdlPv(in_stack_00000008);
      if (in_stack_00000030 < 0) {
        __ZdlPv(in_stack_00000020);
      }
      if (in_stack_00000080 < 0) {
        __ZdlPv(in_stack_00000070);
      }
    } while (-1 < in_stack_00000060);
  } while( true );
}

