/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00828c58
 */

undefined8 * FUN_00828c58(long *param_1,undefined8 param_2,undefined8 param_3,undefined4 *param_4)

{
  byte bVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  long *plVar5;
  long lVar6;
  undefined8 *puVar7;
  undefined8 uVar8;
  undefined1 auStack_70 [8];
  undefined8 local_68;
  undefined8 *local_60;
  long *plStack_58;
  undefined8 local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  puVar3 = (undefined8 *)FUN_00828d84(param_1,param_2,&local_68,auStack_70,param_3);
  puVar7 = (undefined8 *)*puVar3;
  if (puVar7 == (undefined8 *)0x0) {
    puVar7 = operator_new(0x40);
    bVar1 = *(byte *)(param_4 + 2);
    local_50 = 0;
    *(undefined4 *)(puVar7 + 4) = *param_4;
    local_60 = puVar7;
    plStack_58 = param_1 + 1;
    if ((bVar1 & 1) == 0) {
      uVar8 = *(undefined8 *)(param_4 + 2);
      uVar4 = *(undefined8 *)(param_4 + 6);
      puVar7[6] = *(undefined8 *)(param_4 + 4);
      puVar7[5] = uVar8;
      puVar7[7] = uVar4;
    }
    else {
                    /* try { // try from 00828cec to 00828cf3 has its CatchHandler @ 00828d5c */
      FUN_007ff40c(puVar7 + 5,*(undefined8 *)(param_4 + 6),*(undefined8 *)(param_4 + 4));
    }
    plVar5 = (long *)*param_1;
    *puVar7 = 0;
    puVar7[1] = 0;
    *puVar3 = puVar7;
    lVar6 = *plVar5;
    puVar7[2] = local_68;
    if (lVar6 != 0) {
      *param_1 = lVar6;
    }
    puVar3 = (undefined8 *)FUN_00825dfc(param_1[1],puVar7);
    uVar4 = 1;
    param_1[2] = param_1[2] + 1;
  }
  else {
    uVar4 = 0;
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(puVar3,uVar4);
  }
  return puVar7;
}

