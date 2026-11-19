/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b9568
 */

long FUN_008b9568(long param_1,char *param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  undefined8 uVar2;
  long *plVar3;
  long lVar4;
  undefined8 *puVar5;
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
  puVar5 = *(undefined8 **)(param_1 + 0x68);
  uVar2 = __strlen_chk(acStack_238,0x200);
  uVar2 = FUN_008b9ff8(param_1,acStack_238,uVar2);
  *puVar5 = uVar2;
  lVar4 = *(long *)(param_1 + 0x48);
  plVar3 = *(long **)(param_1 + 0x68);
  *(undefined4 *)((long)puVar5 + 0xc) = 5;
  if (lVar4 - (long)plVar3 < 0x11) {
    FUN_008b41e4(param_1,1);
    plVar3 = *(long **)(param_1 + 0x68);
  }
  *(long **)(param_1 + 0x68) = plVar3 + 2;
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return *plVar3 + 0x18;
}

