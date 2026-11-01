
/* WARNING: Removing unreachable block (ram,0x006ddc00) */

undefined8 FUN_006ddb20(void)

{
  long *plVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  ulong uVar10;
  long *plVar11;
  ulong uVar12;
  undefined1 auVar13 [16];
  undefined8 in_stack_00000008;
  
  __ZdlPv(in_stack_00000008);
  auVar13 = __Unwind_Resume();
  lVar4 = auVar13._8_8_;
  lVar3 = auVar13._0_8_;
  (**(code **)**(undefined8 **)(lVar4 + 0x20))(*(undefined8 **)(lVar4 + 0x20),lVar3);
  iVar2 = *(int *)(lVar4 + 0x1c);
  if (iVar2 == 2) {
    lVar5 = *(long *)(lVar3 + 0x30) + 0x70;
  }
  else if (iVar2 == 1) {
    if (*(long *)(lVar3 + 0xd0) != 0) {
      uVar6 = *(ulong *)(lVar4 + 0x20);
      if (uVar6 != *(ulong *)(lVar3 + 0xd8)) {
        uVar7 = 0;
        uVar9 = *(long *)(lVar3 + 200) - 1;
        uVar10 = uVar6 >> 4 ^ uVar6 >> 9;
        do {
          uVar10 = uVar10 & uVar9;
          uVar12 = *(ulong *)(*(long *)(lVar3 + 0xc0) + uVar10 * 0x10);
          if (uVar12 == uVar6) {
            lVar5 = *(long *)(lVar3 + 0xc0) + uVar10 * 0x10;
            plVar1 = (long *)0x0;
            if (lVar5 != 0) {
              plVar1 = (long *)(lVar5 + 8);
            }
            plVar11 = *(long **)(lVar3 + 0x18);
            lVar8 = plVar11[2];
            goto joined_r0x006ddc78;
          }
          if (uVar12 == *(ulong *)(lVar3 + 0xd8)) break;
          uVar7 = uVar7 + 1;
          uVar10 = uVar7 + uVar10;
        } while (uVar7 <= uVar9);
      }
    }
    lVar5 = 0;
    plVar1 = (long *)0x0;
    plVar11 = *(long **)(lVar3 + 0x18);
    lVar8 = plVar11[2];
joined_r0x006ddc78:
    if (lVar8 == 0) {
      return 0;
    }
    uVar6 = *(ulong *)(lVar4 + 0x20);
    if (uVar6 == plVar11[3]) {
      return 0;
    }
    uVar7 = 0;
    uVar10 = uVar6 >> 4 ^ uVar6 >> 9;
    while( true ) {
      uVar10 = uVar10 & plVar11[1] - 1U;
      uVar9 = *(ulong *)(*plVar11 + uVar10 * 0x10);
      if (uVar9 == uVar6) break;
      uVar7 = uVar7 + 1;
      uVar10 = uVar7 + uVar10;
      if (uVar9 == plVar11[3] || plVar11[1] - 1U < uVar7) {
        return 0;
      }
    }
    if (lVar5 == 0) {
      return 0;
    }
    iVar2 = *(int *)(*plVar11 + uVar10 * 0x10 + 8);
    if ((iVar2 != 2) && (iVar2 != 8)) {
      return 0;
    }
    lVar5 = *plVar1;
  }
  else {
    if (iVar2 != 0) {
      return 0;
    }
    lVar5 = *(long *)(lVar3 + 0x30);
  }
  func_0x006de830(lVar3,lVar4,lVar5);
  return 0;
}

