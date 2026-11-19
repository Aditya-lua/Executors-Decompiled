/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008583f0
 */

void FUN_008583f0(undefined2 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined2 *param_6)

{
  undefined8 *puVar1;
  undefined2 uVar2;
  long lVar3;
  void *pvVar4;
  long lVar5;
  undefined8 uVar6;
  long lVar7;
  void *pvVar8;
  ulong local_98 [2];
  undefined4 local_88;
  undefined4 local_84;
  undefined4 uStack_80;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  uVar2 = *param_6;
  *(undefined1 *)(param_1 + 4) = 0;
  *(undefined1 *)(param_1 + 0x30) = 0;
  *param_1 = uVar2;
  if (*(char *)(param_6 + 0x30) == '\x01') {
                    /* try { // try from 00858458 to 00858463 has its CatchHandler @ 00858850 */
    FUN_0086f524(param_1 + 4,param_6 + 4);
    *(undefined1 *)(param_1 + 0x30) = 1;
  }
  param_1[0x34] = param_6[0x34];
  uVar6 = *(undefined8 *)(param_6 + 0x2c);
  if (*(char *)(param_6 + 0x30) == '\0') {
    uVar6 = 0;
  }
                    /* try { // try from 00858484 to 0085849b has its CatchHandler @ 00858878 */
  FUN_008533d4(param_1 + 0x38,param_2,param_3,param_4,uVar6);
  local_98[0] = 0;
  local_98[1] = 0;
  *(undefined8 *)(param_1 + 0x7c) = 0;
  *(undefined8 *)(param_1 + 0x78) = 0;
  *(undefined8 *)(param_1 + 0x74) = param_5;
  *(undefined8 *)(param_1 + 0x84) = 0;
  *(undefined8 *)(param_1 + 0x80) = 0;
  *(undefined8 *)(param_1 + 0x8c) = 0;
  *(undefined8 *)(param_1 + 0x88) = 0;
  *(undefined1 *)(param_1 + 0x90) = 1;
  *(undefined8 *)(param_1 + 0x96) = 0;
  *(undefined8 *)(param_1 + 0x92) = 0;
  *(undefined8 *)(param_1 + 0x9e) = 0;
  *(undefined8 *)(param_1 + 0x9a) = 0;
  *(undefined4 *)(param_1 + 0xa2) = 0;
                    /* try { // try from 008584c8 to 008584d7 has its CatchHandler @ 00858870 */
  FUN_008521dc(&local_88,local_98,0);
  puVar1 = (undefined8 *)(param_1 + 0xdc);
  *(undefined4 *)(param_1 + 0xa4) = local_88;
  *(undefined1 *)(param_1 + 0xbc) = 0;
  *(ulong *)(param_1 + 0xa6) = CONCAT44(uStack_80,local_84);
  *(undefined8 *)(param_1 + 0xb0) = 0;
  *(undefined8 *)(param_1 + 0xac) = 0;
  *(undefined8 *)(param_1 + 0xb8) = 0;
  *(undefined8 *)(param_1 + 0xb4) = 0;
  *(undefined8 *)(param_1 + 0xc4) = 0;
  *(undefined8 *)(param_1 + 0xc0) = 0;
  *(undefined8 *)(param_1 + 0xcc) = 0;
  *(undefined8 *)(param_1 + 200) = 0;
  *(undefined8 *)(param_1 + 0xd4) = 0;
  *(undefined8 *)(param_1 + 0xd0) = 0;
  *(undefined1 *)(param_1 + 0xd8) = 0x40;
  *(undefined8 *)(param_1 + 0xe0) = 0;
  *puVar1 = 0;
  *(undefined8 *)(param_1 + 0xe8) = 0;
  *(undefined8 *)(param_1 + 0xe4) = 0;
  *(undefined8 *)(param_1 + 0xf0) = 0;
  *(undefined8 *)(param_1 + 0xec) = 0;
  *(undefined8 *)(param_1 + 0xf8) = 0;
  *(undefined8 *)(param_1 + 0xf4) = 0;
  *(undefined8 *)(param_1 + 0x100) = 0;
  *(undefined8 *)(param_1 + 0xfc) = 0;
  *(undefined8 *)(param_1 + 0x108) = 0;
  *(undefined8 *)(param_1 + 0x104) = 0;
  *(undefined8 *)(param_1 + 0x110) = 0;
  *(undefined8 *)(param_1 + 0x10c) = 0;
  *(undefined8 *)(param_1 + 0x114) = 0;
  *(undefined1 *)(param_1 + 0x118) = 0x40;
  *(undefined1 *)(param_1 + 0x11c) = 0;
  memset(param_1 + 0x120,0,0x2a0);
  lVar5 = *(long *)(param_1 + 0xb4);
  pvVar8 = *(void **)(param_1 + 0xac);
  *(undefined1 *)(param_1 + 0x270) = 0x40;
  local_84 = 0;
  local_88 = CONCAT31(local_88._1_3_,1);
  if ((ulong)(lVar5 - (long)pvVar8) < 0x40) {
    lVar7 = *(long *)(param_1 + 0xb0);
                    /* try { // try from 00858568 to 0085856f has its CatchHandler @ 00858880 */
    pvVar4 = operator_new(0x40);
    memcpy(pvVar4,pvVar8,lVar7 - (long)pvVar8);
    *(void **)(param_1 + 0xac) = pvVar4;
    *(long *)(param_1 + 0xb0) = (long)pvVar4 + (lVar7 - (long)pvVar8);
    *(long *)(param_1 + 0xb4) = (long)pvVar4 + 0x40;
    if (pvVar8 != (void *)0x0) {
      operator_delete(pvVar8,lVar5 - (long)pvVar8);
    }
  }
                    /* try { // try from 008585a0 to 008585ab has its CatchHandler @ 00858880 */
  FUN_00858c6c(param_1 + 0xac,&local_88);
                    /* try { // try from 008585ac to 008585bb has its CatchHandler @ 0085886c */
  uVar6 = FUN_00853198(param_4,&DAT_0029d412);
  *(undefined8 *)(param_1 + 0x94) = uVar6;
                    /* try { // try from 008585c0 to 008585cf has its CatchHandler @ 00858868 */
  uVar6 = FUN_00853198(param_4,"number");
  *(undefined8 *)(param_1 + 0x98) = uVar6;
                    /* try { // try from 008585d4 to 008585e3 has its CatchHandler @ 00858864 */
  uVar6 = FUN_00853198(param_4,"%error-id%");
  *(undefined8 *)(param_1 + 0x9c) = uVar6;
                    /* try { // try from 008585e8 to 008585f7 has its CatchHandler @ 00858860 */
  uVar6 = FUN_00853198(param_4,&DAT_0029d3c1);
  *(undefined8 *)(param_1 + 0xa0) = uVar6;
  local_98[0] = local_98[0] & 0xffffffff00000000;
                    /* try { // try from 00858600 to 0085860f has its CatchHandler @ 0085885c */
  FUN_00858d50(param_1 + 0xf4,0x138,local_98);
  **(undefined4 **)(param_1 + 0xf4) = 1;
                    /* try { // try from 0085861c to 00858653 has its CatchHandler @ 00858880 */
  FUN_0085341c(param_1 + 0x38,1);
  FUN_00858f2c(param_1);
  lVar5 = *(long *)(param_1 + 0xe4);
  pvVar8 = *(void **)(param_1 + 0xdc);
  *(undefined1 *)(param_1 + 0x90) = 0;
  if ((ulong)(lVar5 - (long)pvVar8) < 0x80) {
    lVar7 = *(long *)(param_1 + 0xe0);
    pvVar4 = operator_new(0x80);
    memcpy(pvVar4,pvVar8,lVar7 - (long)pvVar8);
    *(void **)(param_1 + 0xdc) = pvVar4;
    *(long *)(param_1 + 0xe0) = (long)pvVar4 + (lVar7 - (long)pvVar8);
    *(long *)(param_1 + 0xe4) = (long)pvVar4 + 0x80;
    if (pvVar8 != (void *)0x0) {
      operator_delete(pvVar8,lVar5 - (long)pvVar8);
    }
  }
  lVar5 = *(long *)(param_1 + 0x134);
  pvVar8 = *(void **)(param_1 + 300);
  if ((ulong)(lVar5 - (long)pvVar8) < 0x80) {
    lVar7 = *(long *)(param_1 + 0x130);
                    /* try { // try from 0085869c to 008586a3 has its CatchHandler @ 00858880 */
    pvVar4 = operator_new(0x80);
    memcpy(pvVar4,pvVar8,lVar7 - (long)pvVar8);
    *(void **)(param_1 + 300) = pvVar4;
    *(long *)(param_1 + 0x130) = (long)pvVar4 + (lVar7 - (long)pvVar8);
    *(long *)(param_1 + 0x134) = (long)pvVar4 + 0x80;
    if (pvVar8 != (void *)0x0) {
      operator_delete(pvVar8,lVar5 - (long)pvVar8);
    }
  }
  lVar5 = *(long *)(param_1 + 0x158);
  pvVar8 = *(void **)(param_1 + 0x150);
  if ((ulong)(lVar5 - (long)pvVar8) < 0x80) {
    lVar7 = *(long *)(param_1 + 0x154);
                    /* try { // try from 008586f0 to 008586f7 has its CatchHandler @ 00858880 */
    pvVar4 = operator_new(0x80);
    memcpy(pvVar4,pvVar8,lVar7 - (long)pvVar8);
    *(void **)(param_1 + 0x150) = pvVar4;
    *(long *)(param_1 + 0x154) = (long)pvVar4 + (lVar7 - (long)pvVar8);
    *(long *)(param_1 + 0x158) = (long)pvVar4 + 0x80;
    if (pvVar8 != (void *)0x0) {
      operator_delete(pvVar8,lVar5 - (long)pvVar8);
    }
  }
  lVar5 = *(long *)(param_1 + 0x194);
  pvVar8 = *(void **)(param_1 + 0x18c);
  if ((ulong)(lVar5 - (long)pvVar8) < 0x80) {
    lVar7 = *(long *)(param_1 + 400);
                    /* try { // try from 00858744 to 0085874b has its CatchHandler @ 00858880 */
    pvVar4 = operator_new(0x80);
    memcpy(pvVar4,pvVar8,lVar7 - (long)pvVar8);
    *(void **)(param_1 + 0x18c) = pvVar4;
    *(long *)(param_1 + 400) = (long)pvVar4 + (lVar7 - (long)pvVar8);
    *(long *)(param_1 + 0x194) = (long)pvVar4 + 0x80;
    if (pvVar8 != (void *)0x0) {
      operator_delete(pvVar8,lVar5 - (long)pvVar8);
    }
  }
  lVar5 = *(long *)(param_1 + 0x188);
  pvVar8 = *(void **)(param_1 + 0x180);
  if ((ulong)((lVar5 - (long)pvVar8 >> 4) * -0x5555555555555555) < 0x10) {
    lVar7 = *(long *)(param_1 + 0x184);
                    /* try { // try from 008587a8 to 008587af has its CatchHandler @ 00858880 */
    pvVar4 = operator_new(0x300);
    memcpy(pvVar4,pvVar8,lVar7 - (long)pvVar8);
    *(void **)(param_1 + 0x180) = pvVar4;
    *(long *)(param_1 + 0x184) = (long)pvVar4 + (lVar7 - (long)pvVar8);
    *(long *)(param_1 + 0x188) = (long)pvVar4 + 0x300;
    if (pvVar8 != (void *)0x0) {
      operator_delete(pvVar8,lVar5 - (long)pvVar8);
    }
  }
                    /* try { // try from 008587f0 to 0085881b has its CatchHandler @ 00858880 */
  if ((*(char *)(param_6 + 0x30) == '\x01') &&
     (FUN_0086f804(param_1 + 0xc0,param_6 + 4), puVar1 != (undefined8 *)(param_6 + 0x20))) {
    FUN_0086f920(puVar1,*(long *)(param_6 + 0x20),*(long *)(param_6 + 0x24),
                 *(long *)(param_6 + 0x24) - *(long *)(param_6 + 0x20) >> 3);
  }
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

