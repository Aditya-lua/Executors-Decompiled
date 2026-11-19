/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087fcd8
 */

void FUN_0087fcd8(undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 local_e0;
  undefined8 uStack_d8;
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined1 *local_90;
  undefined8 *puStack_88;
  undefined8 *puStack_80;
  undefined8 uStack_78;
  byte local_70;
  undefined7 uStack_6f;
  undefined8 uStack_68;
  undefined8 local_60;
  
  puStack_80 = &local_e0;
  lVar1 = tpidr_el0;
  lVar6 = *(long *)(lVar1 + 0x28);
  puStack_88 = &local_b0;
  uStack_78 = 0xffffff80ffffffd0;
  local_e0 = param_3;
  uStack_d8 = param_4;
  local_d0 = param_5;
  uStack_c8 = param_6;
  local_c0 = param_7;
  uStack_b8 = param_8;
  local_90 = (undefined1 *)register0x00000008;
  FUN_008aa1ac(&local_70,param_2,&local_90);
  puVar5 = (undefined8 *)__cxa_allocate_exception(0x30);
  if ((local_70 & 1) == 0) {
    local_b0 = CONCAT71(uStack_6f,local_70);
    uStack_a8 = uStack_68;
    local_a0 = local_60;
  }
  else {
                    /* try { // try from 0087fd88 to 0087fd8f has its CatchHandler @ 0087fde4 */
    FUN_007ff40c(&local_b0,local_60,uStack_68);
  }
  uVar4 = local_a0;
  uVar3 = uStack_a8;
  uVar2 = local_b0;
  *puVar5 = &PTR_LAB_00c4a9b8;
  uVar7 = *param_1;
  puVar5[2] = param_1[1];
  puVar5[1] = uVar7;
  uStack_a8 = 0;
  local_a0 = 0;
  local_b0 = 0;
  puVar5[4] = uVar3;
  puVar5[3] = uVar2;
  puVar5[5] = uVar4;
  if (*(long *)(lVar1 + 0x28) == lVar6) {
                    /* try { // try from 0087fdcc to 0087fde3 has its CatchHandler @ 0087fdf4 */
                    /* WARNING: Subroutine does not return */
    __cxa_throw(puVar5,&PTR_PTR_00c4a9d0,&LAB_0087fc28);
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

