/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00873ff8
 */

void FUN_00873ff8(long param_1,byte param_2,byte param_3,undefined4 param_4,undefined8 param_5)

{
  long lVar1;
  long *plVar2;
  ulong uVar3;
  long lVar4;
  code *pcVar5;
  ulong uVar6;
  ulong *puVar7;
  ulong local_60;
  ulong uStack_58;
  ulong local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  uVar3 = *(ulong *)(param_1 + 0x318);
  puVar7 = (ulong *)(*(long *)(param_1 + 8) + (ulong)*(uint *)(param_1 + 0x20) * 0x88);
  pcVar5 = *(code **)(param_1 + 0x310);
  uVar6 = uVar3 & 1;
  *(byte *)(puVar7 + 3) = param_2;
  *(byte *)((long)puVar7 + 0x1a) = param_3;
  if (uVar6 != 0 || pcVar5 != (code *)0x0) {
    plVar2 = (long *)(param_1 + ((long)uVar3 >> 1));
    if (uVar6 != 0) {
      pcVar5 = *(code **)(pcVar5 + *plVar2);
    }
    (*pcVar5)(&local_60,plVar2,puVar7 + 0xb);
    if ((puVar7[5] & 1) != 0) {
      operator_delete((void *)puVar7[7],puVar7[5] & 0xfffffffffffffffe);
    }
    puVar7[7] = local_50;
    puVar7[6] = uStack_58;
    puVar7[5] = local_60;
  }
  lVar4 = *(long *)(param_1 + 0x38) - *(long *)(param_1 + 0x30);
  uVar3 = (lVar4 * 2 - (lVar4 >> 2)) + 0x20;
  if (uVar3 < 0xfffffffffffffff8) {
    uVar6 = 0x16;
    if ((*puVar7 & 1) != 0) {
      uVar6 = (*puVar7 & 0xfffffffffffffffe) - 1;
    }
    if (uVar6 < uVar3) {
      uVar6 = 0x19;
      if ((uVar3 | 7) != 0x17) {
        uVar6 = uVar3 | 7;
      }
      if (uVar3 < 0x17) {
        uVar6 = 0x16;
      }
      FUN_00879ca4(puVar7,uVar6);
    }
    plVar2 = *(long **)(param_1 + 0x2a0);
    if (plVar2 != (long *)0x0) {
      (**(code **)(*plVar2 + 0x10))
                (plVar2,*(long *)(param_1 + 0x30),
                 *(long *)(param_1 + 0x38) - *(long *)(param_1 + 0x30) >> 2);
    }
    FUN_008741a0(param_1,puVar7,*(undefined4 *)(param_1 + 0x20),param_4,param_5);
    *(undefined4 *)(param_1 + 0x20) = 0xffffffff;
    *(long *)(param_1 + 0x28) =
         *(long *)(param_1 + 0x28) + (*(long *)(param_1 + 0x38) - *(long *)(param_1 + 0x30) >> 2);
    FUN_00873f3c(param_1);
    if (*(long *)(lVar1 + 0x28) == local_48) {
      return;
    }
  }
  else if (*(long *)(lVar1 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

