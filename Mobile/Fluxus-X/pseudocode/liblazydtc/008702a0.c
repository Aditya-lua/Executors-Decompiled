/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008702a0
 */

undefined8 * FUN_008702a0(long *param_1,undefined8 *param_2,byte *param_3)

{
  undefined8 *puVar1;
  long lVar2;
  void *pvVar3;
  undefined8 *puVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  long lVar8;
  ulong uVar9;
  undefined8 *puVar10;
  long lVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  puVar4 = (undefined8 *)*param_1;
  puVar10 = (undefined8 *)param_1[1];
  lVar11 = (long)puVar10 - (long)puVar4;
  uVar5 = (lVar11 >> 4) * -0x5555555555555555 + 1;
  if (uVar5 < 0x555555555555556) {
    lVar8 = param_1[2] - (long)puVar4 >> 4;
    uVar9 = lVar8 * 0x5555555555555556;
    if (uVar9 <= uVar5) {
      uVar9 = uVar5;
    }
    if (0x2aaaaaaaaaaaaa9 < (ulong)(lVar8 * -0x5555555555555555)) {
      uVar9 = 0x555555555555555;
    }
    if (uVar9 == 0) {
      pvVar3 = (void *)0x0;
    }
    else {
      if (0x555555555555555 < uVar9) goto LAB_008704a0;
      pvVar3 = operator_new(uVar9 * 0x30);
    }
    puVar1 = (undefined8 *)((long)pvVar3 + lVar11);
    if ((*param_3 & 1) == 0) {
      uStack_68 = *(undefined8 *)(param_3 + 8);
      local_70 = *(undefined8 *)param_3;
      local_60 = *(undefined8 *)(param_3 + 0x10);
    }
    else {
                    /* try { // try from 00870394 to 0087039b has its CatchHandler @ 008704b4 */
      FUN_007ff40c(&local_70,*(undefined8 *)(param_3 + 0x10),*(undefined8 *)(param_3 + 8));
      puVar4 = (undefined8 *)*param_1;
      puVar10 = (undefined8 *)param_1[1];
      lVar11 = (long)puVar10 - (long)puVar4;
    }
    uVar13 = param_2[1];
    uVar12 = *param_2;
    *puVar1 = &PTR_LAB_00c4a5f8;
    puVar1[2] = uVar13;
    puVar1[1] = uVar12;
    puVar1[4] = uStack_68;
    puVar1[3] = local_70;
    puVar1[5] = local_60;
    if (puVar4 != puVar10) {
      puVar6 = puVar4;
      puVar7 = (undefined8 *)((long)puVar1 - lVar11);
      do {
        *puVar7 = &PTR_LAB_00c4a5f8;
        uVar12 = puVar6[1];
        puVar7[2] = puVar6[2];
        puVar7[1] = uVar12;
        uVar13 = puVar6[4];
        uVar12 = puVar6[3];
        puVar7[5] = puVar6[5];
        puVar7[4] = uVar13;
        puVar7[3] = uVar12;
        puVar7 = puVar7 + 6;
        puVar6[4] = 0;
        puVar6[5] = 0;
        puVar6[3] = 0;
        puVar6 = puVar6 + 6;
      } while (puVar6 != puVar10);
      do {
        puVar7 = puVar4 + 6;
        (**(code **)*puVar4)(puVar4);
        puVar4 = puVar7;
      } while (puVar7 != puVar10);
      puVar4 = (undefined8 *)*param_1;
    }
    lVar8 = param_1[2];
    *param_1 = (long)puVar1 - lVar11;
    param_1[1] = (long)(puVar1 + 6);
    param_1[2] = (long)((long)pvVar3 + uVar9 * 0x30);
    if (puVar4 != (undefined8 *)0x0) {
      operator_delete(puVar4,lVar8 - (long)puVar4);
    }
    if (*(long *)(lVar2 + 0x28) == local_58) {
      return puVar1 + 6;
    }
  }
  else {
    if (*(long *)(lVar2 + 0x28) != local_58) goto LAB_008704d8;
    FUN_0086f2dc();
LAB_008704a0:
    if (*(long *)(lVar2 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
  }
LAB_008704d8:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

