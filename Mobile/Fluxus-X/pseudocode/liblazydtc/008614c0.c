/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008614c0
 */

/* WARNING: Removing unreachable block (ram,0x00861710) */

void FUN_008614c0(undefined1 *param_1,long param_2,undefined8 *param_3,ulong param_4,long *param_5,
                 long param_6,undefined8 *param_7,uint param_8)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  ulong uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 local_a0;
  undefined8 uStack_98;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  uVar14 = 0;
  lVar12 = *(long *)(param_2 + 0x458);
  lVar13 = *(long *)(param_2 + 0x450);
  lVar5 = lVar12 - lVar13;
  if ((param_5 != (long *)0x0) && (param_6 != 0)) {
                    /* try { // try from 00861528 to 00861533 has its CatchHandler @ 008617d8 */
    FUN_00870ce4(param_2 + 0x450,param_6);
    uVar14 = 1;
  }
  do {
    if (((param_4 & 1) != 0) && (*(int *)(param_2 + 0x90) == 0x106)) {
      uStack_98 = *(undefined8 *)(param_2 + 0x9c);
      local_a0 = *(undefined8 *)(param_2 + 0x94);
                    /* try { // try from 008615a8 to 008615af has its CatchHandler @ 008617e0 */
      FUN_00858f2c(param_2);
      if (*(int *)(param_2 + 0x90) == 0x3a) {
        if (param_7 != (undefined8 *)0x0) {
          *param_7 = *(undefined8 *)(param_2 + 0x94);
        }
                    /* try { // try from 008615c8 to 008615d7 has its CatchHandler @ 008617dc */
        FUN_00858f2c(param_2);
        uVar3 = FUN_00865f98(param_2);
      }
      else {
        uVar3 = 0;
      }
      if (param_5 == (long *)0x0) goto LAB_008616b8;
      if (uVar14 == 0) {
        lVar4 = 0;
        goto LAB_008616b4;
      }
      lVar11 = *(long *)(param_2 + 0x450);
                    /* try { // try from 00861660 to 00861663 has its CatchHandler @ 008617d4 */
      lVar4 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),uVar14 << 3);
      if ((uVar14 < 8) || ((ulong)((lVar13 + lVar4) - (lVar11 + lVar12)) < 0x20)) {
        uVar8 = 0;
        goto LAB_00861684;
      }
      uVar8 = uVar14 & 0xfffffffffffffffc;
      puVar9 = (undefined8 *)(lVar4 + 0x10);
      puVar10 = (undefined8 *)(lVar5 + lVar11 + 0x10);
      uVar6 = uVar8;
      do {
        puVar2 = puVar10 + -1;
        uVar15 = puVar10[-2];
        uVar17 = puVar10[1];
        uVar16 = *puVar10;
        uVar6 = uVar6 - 4;
        puVar10 = puVar10 + 4;
        puVar9[-1] = *puVar2;
        puVar9[-2] = uVar15;
        puVar9[1] = uVar17;
        *puVar9 = uVar16;
        puVar9 = puVar9 + 4;
      } while (uVar6 != 0);
      if (uVar14 != uVar8) {
LAB_00861684:
        lVar7 = uVar14 - uVar8;
        puVar9 = (undefined8 *)(lVar11 + ((lVar12 + uVar8 * 8) - lVar13));
        puVar10 = (undefined8 *)(lVar4 + uVar8 * 8);
        do {
          lVar7 = lVar7 + -1;
          *puVar10 = *puVar9;
          puVar9 = puVar9 + 1;
          puVar10 = puVar10 + 1;
        } while (lVar7 != 0);
      }
LAB_008616b4:
      *param_5 = lVar4;
      param_5[1] = uVar14;
LAB_008616b8:
      *(undefined8 *)(param_1 + 0x18) = uVar3;
      *param_1 = 1;
      *(undefined8 *)(param_1 + 0xc) = uStack_98;
      *(undefined8 *)(param_1 + 4) = local_a0;
      goto LAB_008616e8;
    }
                    /* try { // try from 00861558 to 00861573 has its CatchHandler @ 008617e8 */
    FUN_00860d94(&local_a0,param_2,param_8 & 1);
    FUN_00870aa0(*param_3,&local_a0);
    param_3[2] = param_3[2] + 1;
    if (*(int *)(param_2 + 0x90) != 0x2c) break;
    if (param_5 != (long *)0x0) {
                    /* try { // try from 00861590 to 0086159b has its CatchHandler @ 008617e4 */
      FUN_00870ce4(param_2 + 0x450,param_2 + 0x94);
      uVar14 = uVar14 + 1;
    }
                    /* try { // try from 00861540 to 00861547 has its CatchHandler @ 008617e4 */
    FUN_00858f2c(param_2);
  } while( true );
  if (param_5 == (long *)0x0) goto LAB_008616d8;
  if (uVar14 == 0) {
    lVar4 = 0;
  }
  else {
    lVar11 = *(long *)(param_2 + 0x450);
                    /* try { // try from 008615f8 to 008615fb has its CatchHandler @ 008617d0 */
    lVar4 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),uVar14 << 3);
    if ((uVar14 < 8) || ((ulong)((lVar13 + lVar4) - (lVar11 + lVar12)) < 0x20)) {
      uVar6 = 0;
    }
    else {
      uVar6 = uVar14 & 0xfffffffffffffffc;
      puVar9 = (undefined8 *)(lVar4 + 0x10);
      puVar10 = (undefined8 *)(lVar5 + lVar11 + 0x10);
      uVar8 = uVar6;
      do {
        puVar2 = puVar10 + -1;
        uVar3 = puVar10[-2];
        uVar16 = puVar10[1];
        uVar15 = *puVar10;
        uVar8 = uVar8 - 4;
        puVar10 = puVar10 + 4;
        puVar9[-1] = *puVar2;
        puVar9[-2] = uVar3;
        puVar9[1] = uVar16;
        *puVar9 = uVar15;
        puVar9 = puVar9 + 4;
      } while (uVar8 != 0);
      if (uVar14 == uVar6) goto LAB_008616d4;
    }
    lVar7 = uVar14 - uVar6;
    puVar9 = (undefined8 *)(lVar11 + ((lVar12 + uVar6 * 8) - lVar13));
    puVar10 = (undefined8 *)(lVar4 + uVar6 * 8);
    do {
      lVar7 = lVar7 + -1;
      *puVar10 = *puVar9;
      puVar9 = puVar9 + 1;
      puVar10 = puVar10 + 1;
    } while (lVar7 != 0);
  }
LAB_008616d4:
  *param_5 = lVar4;
  param_5[1] = uVar14;
LAB_008616d8:
  *(undefined8 *)(param_1 + 0xc) = 0;
  *(undefined8 *)(param_1 + 4) = 0;
  *param_1 = 0;
  *(undefined8 *)(param_1 + 0x18) = 0;
LAB_008616e8:
  lVar5 = lVar5 + *(long *)(param_2 + 0x450);
  if (lVar5 != *(long *)(param_2 + 0x458)) {
    *(long *)(param_2 + 0x458) = lVar5;
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

