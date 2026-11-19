/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00806e50
 */

void FUN_00806e50(ulong *param_1,byte *param_2)

{
  long lVar1;
  undefined8 *puVar2;
  undefined1 *puVar3;
  byte *__src;
  byte *pbVar4;
  undefined8 uVar5;
  byte *pbVar7;
  byte *pbVar6;
  undefined1 *puVar8;
  ulong uVar9;
  undefined1 *puVar11;
  undefined1 *puVar10;
  byte *pbVar12;
  undefined8 *puVar13;
  undefined8 *puVar14;
  void *unaff_x19;
  undefined1 *puVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  long unaff_x27;
  byte *pbVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined1 *local_80;
  undefined1 *local_78;
  long local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  uVar16 = *(ulong *)(param_2 + 8);
  pbVar19 = *(byte **)(param_2 + 0x10);
  if ((*param_2 & 1) == 0) {
    pbVar19 = param_2 + 1;
    uVar16 = (ulong)(*param_2 >> 1);
  }
  if (uVar16 == 0) {
    pbVar19 = (byte *)0x0;
    pbVar4 = (byte *)0x0;
    __src = (byte *)0x0;
  }
  else {
    if ((long)uVar16 < 0) {
      if (*(long *)(lVar1 + 0x28) == local_68) {
        uVar5 = FUN_0080734c();
                    /* catch() { ... } // from try @ 00806f78 with catch @ 00807140 */
        if (unaff_x19 != (void *)0x0) {
          operator_delete(unaff_x19,unaff_x27 - (long)unaff_x19);
        }
        if (*(long *)(lVar1 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
          FUN_00c2c090(uVar5);
        }
      }
      goto LAB_00807198;
    }
    __src = operator_new(uVar16);
    pbVar7 = pbVar19;
    pbVar4 = __src;
    if ((uVar16 < 0x20) || ((ulong)((long)__src - (long)pbVar19) < 0x20)) {
LAB_00806f1c:
      pbVar12 = pbVar4;
      do {
        pbVar6 = pbVar7 + 1;
        pbVar4 = pbVar12 + 1;
        *pbVar12 = *pbVar7;
        pbVar7 = pbVar6;
        pbVar12 = pbVar4;
      } while (pbVar6 != pbVar19 + uVar16);
    }
    else {
      uVar9 = uVar16 & 0x7fffffffffffffe0;
      pbVar7 = __src + 0x10;
      pbVar12 = pbVar19 + 0x10;
      pbVar4 = __src + uVar9;
      uVar18 = uVar9;
      do {
        pbVar6 = pbVar12 + -8;
        uVar5 = *(undefined8 *)(pbVar12 + -0x10);
        uVar21 = *(undefined8 *)(pbVar12 + 8);
        uVar20 = *(undefined8 *)pbVar12;
        uVar18 = uVar18 - 0x20;
        pbVar12 = pbVar12 + 0x20;
        *(undefined8 *)(pbVar7 + -8) = *(undefined8 *)pbVar6;
        *(undefined8 *)(pbVar7 + -0x10) = uVar5;
        *(undefined8 *)(pbVar7 + 8) = uVar21;
        *(undefined8 *)pbVar7 = uVar20;
        pbVar7 = pbVar7 + 0x20;
      } while (uVar18 != 0);
      pbVar7 = pbVar19 + uVar9;
      if (uVar16 != uVar9) goto LAB_00806f1c;
    }
    pbVar19 = __src + uVar16;
  }
  uVar16 = (long)pbVar4 - (long)__src;
  pbVar7 = pbVar4;
  if (uVar16 < 0x400) {
    uVar18 = 0x400 - uVar16;
    if ((ulong)((long)pbVar19 - (long)pbVar4) < uVar18) {
      uVar17 = (long)pbVar19 - (long)__src;
      uVar9 = uVar17 * 2;
      if (uVar9 < 0x401) {
        uVar9 = 0x400;
      }
      if (0x3ffffffffffffffe < uVar17) {
        uVar9 = 0x7fffffffffffffff;
      }
                    /* try { // try from 00806f78 to 00806f7f has its CatchHandler @ 00807140 */
      pbVar4 = operator_new(uVar9);
      pbVar19 = pbVar4 + uVar9;
      memset(pbVar4 + uVar16,0,uVar18);
      pbVar7 = pbVar4 + 0x400;
      memcpy(pbVar4,__src,uVar16);
      if (__src != (byte *)0x0) {
        operator_delete(__src,uVar17);
      }
      __src = pbVar4;
    }
    else {
      pbVar7 = pbVar4 + uVar18;
      memset(pbVar4,0,uVar18);
    }
  }
                    /* try { // try from 00806fe0 to 00806ff3 has its CatchHandler @ 00807148 */
  FUN_008ddcdc(&local_80,&DAT_00d1b340,__src,(long)pbVar7 - (long)__src);
  puVar3 = local_78;
  puVar11 = local_80;
  uVar16 = (long)local_78 - (long)local_80;
  if (0xfffffffffffffff7 < uVar16) {
    if (*(long *)(lVar1 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe124();
    }
    goto LAB_00807198;
  }
  if (uVar16 < 0x17) {
    puVar15 = (undefined1 *)((long)param_1 + 1);
    *(char *)param_1 = (char)((int)uVar16 << 1);
    puVar8 = puVar15;
    if (local_80 != local_78) goto LAB_0080701c;
  }
  else {
    uVar18 = 0x1a;
    if ((uVar16 | 7) != 0x17) {
      uVar18 = (uVar16 | 7) + 1;
    }
                    /* try { // try from 0080707c to 0080712b has its CatchHandler @ 00807150 */
    puVar15 = operator_new(uVar18);
    param_1[1] = uVar16;
    param_1[2] = (ulong)puVar15;
    *param_1 = uVar18 | 1;
    puVar8 = puVar15;
    if (puVar11 != puVar3) {
LAB_0080701c:
      if ((0x1f < uVar16) && (0x1f < (ulong)((long)puVar8 - (long)puVar11))) {
        uVar9 = uVar16 & 0xffffffffffffffe0;
        puVar13 = (undefined8 *)(puVar11 + 0x10);
        puVar14 = (undefined8 *)(puVar8 + 0x10);
        puVar15 = puVar8 + uVar9;
        uVar18 = uVar9;
        do {
          puVar2 = puVar13 + -1;
          uVar5 = puVar13[-2];
          uVar21 = puVar13[1];
          uVar20 = *puVar13;
          uVar18 = uVar18 - 0x20;
          puVar13 = puVar13 + 4;
          puVar14[-1] = *puVar2;
          puVar14[-2] = uVar5;
          puVar14[1] = uVar21;
          *puVar14 = uVar20;
          puVar14 = puVar14 + 4;
        } while (uVar18 != 0);
        puVar8 = puVar15;
        puVar11 = puVar11 + uVar9;
        if (uVar16 == uVar9) goto LAB_008070bc;
      }
      do {
        puVar10 = puVar11 + 1;
        puVar15 = puVar8 + 1;
        *puVar8 = *puVar11;
        puVar8 = puVar15;
        puVar11 = puVar10;
      } while (puVar10 != puVar3);
    }
  }
LAB_008070bc:
  *puVar15 = 0;
  if (local_80 != (undefined1 *)0x0) {
    local_78 = local_80;
    operator_delete(local_80,local_70 - (long)local_80);
  }
  if (__src != (byte *)0x0) {
    operator_delete(__src,(long)pbVar19 - (long)__src);
  }
  if (*(long *)(lVar1 + 0x28) == local_68) {
    return;
  }
LAB_00807198:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

