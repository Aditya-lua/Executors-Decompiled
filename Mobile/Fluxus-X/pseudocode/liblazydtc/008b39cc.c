/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b39cc
 */

void FUN_008b39cc(undefined8 param_1,char *param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  undefined8 local_2b0;
  undefined8 uStack_2a8;
  undefined8 local_2a0;
  undefined8 uStack_298;
  undefined8 local_290;
  undefined8 uStack_288;
  undefined1 *local_260;
  char *pcStack_258;
  undefined8 *puStack_250;
  undefined8 uStack_248;
  char acStack_238 [512];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  pcStack_258 = acStack_238 + -0x48;
  puStack_250 = &local_2b0;
  uStack_248 = 0xffffff80ffffffd0;
  local_2b0 = param_3;
  uStack_2a8 = param_4;
  local_2a0 = param_5;
  uStack_298 = param_6;
  local_290 = param_7;
  uStack_288 = param_8;
  local_260 = (undefined1 *)register0x00000008;
  vsnprintf(acStack_238,0x200,param_2,&local_260);
  FUN_008aa60c(param_1,1);
  FUN_008b3d00(param_1,acStack_238);
  if (*(long *)(lVar1 + 0x28) == local_38) {
                    /* WARNING: Subroutine does not return */
    FUN_008b3f9c(param_1,2);
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

