/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00910208
 */

long FUN_00910208(long param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long *plVar10;
  undefined1 auVar11 [16];
  undefined1 auStack_80 [24];
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  lVar5 = *(long *)(param_1 + 0xc38);
  auVar11 = FUN_00941cb8();
  if (*(long *)(param_1 + 0xd0) != 0) {
    FUN_0093f628(param_1,5,2);
  }
  FUN_00916a74(lVar5,auStack_80);
  lVar3 = FUN_00916a80(auStack_80);
  if (lVar3 == 0) {
    lVar6 = 0;
    lVar5 = *(long *)(param_1 + 0xd0);
  }
  else {
    lVar8 = 0;
    lVar6 = 0;
    lVar9 = -1;
    do {
      lVar3 = *(long *)(lVar3 + 0x18);
      for (plVar10 = *(long **)(lVar3 + 0x10); plVar10 != (long *)0x0; plVar10 = (long *)plVar10[2])
      {
        while (((lVar7 = *plVar10, *(long *)(lVar7 + 1000) != 0 ||
                ((*(byte *)(lVar7 + 0x3a0) >> 6 & 1) != 0)) || (*(char *)(lVar7 + 0x575) != '\0')))
        {
          plVar10 = (long *)plVar10[2];
          if (plVar10 == (long *)0x0) goto LAB_009102e8;
        }
        lVar4 = FUN_00941d54(auVar11._0_8_,auVar11._8_8_,*(undefined8 *)(lVar7 + 0x210),
                             *(undefined8 *)(lVar7 + 0x218));
        lVar2 = lVar3;
        if (lVar4 <= lVar9) {
          lVar4 = lVar9;
          lVar2 = lVar8;
          lVar7 = lVar6;
        }
        lVar6 = lVar7;
        lVar8 = lVar2;
        lVar9 = lVar4;
      }
LAB_009102e8:
      lVar3 = FUN_00916a80(auStack_80);
    } while (lVar3 != 0);
    if (lVar6 == 0) {
      lVar5 = *(long *)(param_1 + 0xd0);
    }
    else {
      for (plVar10 = *(long **)(lVar8 + 0x10); plVar10 != (long *)0x0; plVar10 = (long *)plVar10[2])
      {
        if (*plVar10 == lVar6) {
          FUN_00925d80((long *)(lVar8 + 0x10),plVar10,0);
          *(long *)(lVar8 + 8) = *(long *)(lVar8 + 8) + -1;
          *(undefined8 *)(lVar6 + 0x540) = 0;
          break;
        }
      }
      *(long *)(lVar5 + 0x30) = *(long *)(lVar5 + 0x30) + -1;
      lVar5 = *(long *)(param_1 + 0xd0);
    }
  }
  if (lVar5 != 0) {
    FUN_0093f680(param_1,5);
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return lVar6;
}

