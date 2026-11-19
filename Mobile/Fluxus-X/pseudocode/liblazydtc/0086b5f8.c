/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086b5f8
 */

void FUN_0086b5f8(long param_1,undefined4 param_2,undefined4 *param_3,undefined1 *param_4)

{
  undefined1 *puVar1;
  void *pvVar2;
  undefined7 *puVar3;
  undefined7 *puVar4;
  int iVar5;
  long lVar6;
  ulong uVar7;
  byte bVar8;
  int *piVar9;
  undefined8 local_c8;
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  void *local_a8;
  byte local_a0;
  undefined7 uStack_9f;
  undefined7 *local_90;
  byte local_80;
  undefined7 uStack_7f;
  undefined7 *local_70;
  long local_68;
  
  lVar6 = tpidr_el0;
  local_68 = *(long *)(lVar6 + 0x28);
  local_b8 = 0;
  uStack_b0 = 0;
  FUN_008521dc(&local_a0,&local_b8,param_2);
  FUN_008521fc(&local_80,&local_a0);
  local_c8 = 0;
  uStack_c0 = 0;
                    /* try { // try from 0086b658 to 0086b66f has its CatchHandler @ 0086b878 */
  FUN_008521dc(&local_a0,&local_c8,*param_3);
  FUN_008521fc(&local_b8,&local_a0);
  puVar3 = local_70;
  bVar8 = local_80;
  pvVar2 = local_a8;
  uVar7 = local_b8;
  iVar5 = param_3[1];
  piVar9 = (int *)(param_1 + 0x94);
  if (*piVar9 == iVar5) {
    iVar5 = param_3[2];
                    /* try { // try from 0086b69c to 0086b6a7 has its CatchHandler @ 0086b850 */
    FUN_008521fc(&local_a0,param_1 + 0x90);
    if ((uVar7 & 1) == 0) {
      pvVar2 = (void *)((long)&local_b8 + 1);
    }
    if ((bVar8 & 1) == 0) {
      puVar3 = &uStack_7f;
    }
    puVar4 = local_90;
    if ((local_a0 & 1) == 0) {
      puVar4 = &uStack_9f;
    }
    puVar1 = &DAT_002ab32c;
    if (param_4 != (undefined1 *)0x0) {
      puVar1 = param_4;
    }
                    /* try { // try from 0086b6e0 to 0086b6f7 has its CatchHandler @ 0086b7e8 */
    FUN_00860ecc(param_1,piVar9,"Expected %s (to close %s at column %d), got %s%s",puVar3,pvVar2,
                 iVar5 + 1,puVar4,puVar1);
  }
  else {
                    /* try { // try from 0086b6fc to 0086b707 has its CatchHandler @ 0086b84c */
    FUN_008521fc(&local_a0,param_1 + 0x90);
    if ((uVar7 & 1) == 0) {
      pvVar2 = (void *)((long)&local_b8 + 1);
    }
    if ((bVar8 & 1) == 0) {
      puVar3 = &uStack_7f;
    }
    puVar4 = local_90;
    if ((local_a0 & 1) == 0) {
      puVar4 = &uStack_9f;
    }
    puVar1 = &DAT_002ab32c;
    if (param_4 != (undefined1 *)0x0) {
      puVar1 = param_4;
    }
                    /* try { // try from 0086b740 to 0086b757 has its CatchHandler @ 0086b7e4 */
    FUN_00860ecc(param_1,piVar9,"Expected %s (to close %s at line %d), got %s%s",puVar3,pvVar2,
                 iVar5 + 1,puVar4,puVar1);
  }
  if ((local_a0 & 1) != 0) {
    operator_delete(local_90,CONCAT71(uStack_9f,local_a0) & 0xfffffffffffffffe);
  }
  if ((local_b8 & 1) != 0) {
    operator_delete(local_a8,local_b8 & 0xfffffffffffffffe);
  }
  if ((local_80 & 1) != 0) {
    operator_delete(local_70,CONCAT71(uStack_7f,local_80) & 0xfffffffffffffffe);
  }
  if (*(long *)(lVar6 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

