
/* WARNING: Removing unreachable block (ram,0x002d2260) */
/* WARNING: Removing unreachable block (ram,0x002d23c4) */
/* WARNING: Removing unreachable block (ram,0x002d23c8) */
/* WARNING: Removing unreachable block (ram,0x002d2324) */
/* WARNING: Removing unreachable block (ram,0x002d2328) */

void FUN_002d22bc(void)

{
  char cVar1;
  uint uVar2;
  uint uVar3;
  undefined1 *puVar4;
  ulong uVar5;
  uint uVar6;
  ulong uVar7;
  long lVar8;
  int in_w8;
  uint uVar9;
  ulong uVar10;
  uint uVar11;
  uint uVar12;
  ulong unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  long unaff_x22;
  long lVar13;
  long unaff_x28;
  long unaff_x29;
  undefined1 auVar14 [16];
  undefined1 uStack0000000000000020;
  char acStack_7ffffffe [2147483566];
  
  do {
    if (in_w8 < 0) {
      (**(code **)(unaff_x22 + 0x30))(&uStack0000000000000020);
    }
    uVar5 = unaff_x19;
    uVar7 = unaff_x21;
    lVar8 = unaff_x20;
    (**(code **)(unaff_x22 + 0x50))();
    cVar1 = acStack_7ffffffe[unaff_x28 + 0x8000006a];
    lVar13 = unaff_x28;
    while( true ) {
      if (cVar1 != '\0') {
        if (cVar1 < '\0') {
          (**(code **)(unaff_x22 + 0x30))(&uStack0000000000000020);
        }
        uVar5 = unaff_x19;
        uVar7 = unaff_x21;
        lVar8 = unaff_x20;
        (**(code **)(unaff_x22 + 0x50))();
      }
      unaff_x28 = lVar13 + -1;
      if (lVar13 < 1) {
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
          return;
        }
        auVar14 = ___stack_chk_fail();
        puVar4 = auVar14._0_8_;
        uVar6 = (uint)uVar7;
        if (uVar6 - 8 < 0xfffffff9) goto LAB_002d2570;
        if (uVar5 == 0) goto LAB_002d2574;
        uVar2 = 2 << (ulong)(uVar6 & 0x1f);
        uVar9 = uVar2 - 1 & *auVar14._8_8_;
        if (uVar5 == 0xffffffffffffffff) goto LAB_002d254c;
        uVar3 = 1 << (ulong)(uVar6 & 0x1f);
        uVar10 = uVar7 & 0xffffffff;
        lVar13 = uVar5 + 1;
        goto code_r0x002d24a4;
      }
      uVar5 = unaff_x19;
      uVar7 = unaff_x21;
      lVar8 = unaff_x20;
      (**(code **)(unaff_x22 + 0x48))();
      if (acStack_7ffffffe[lVar13 + 0x80000273] != '\0') break;
      cVar1 = acStack_7ffffffe[lVar13 + 0x80000069];
      lVar13 = unaff_x28;
    }
    in_w8 = (int)acStack_7ffffffe[lVar13 + 0x80000273];
  } while( true );
code_r0x002d24a4:
  do {
    uVar10 = uVar10 + 1;
    if (((int)uVar9 < 0) || ((int)uVar2 < (int)uVar9)) {
      func_0x0079e928();
code_r0x002d255c:
      func_0x0079e950();
code_r0x002d2560:
      func_0x0079e9ec();
code_r0x002d2564:
      func_0x0079e974();
code_r0x002d2568:
      func_0x0079e99c();
code_r0x002d256c:
      func_0x0079e9c4();
LAB_002d2570:
      func_0x0079e8b0();
LAB_002d2574:
      func_0x0079e8d8();
      goto code_r0x002d2578;
    }
    if ((uVar9 & 1) != 0) {
      if ((int)uVar2 <= (int)uVar9) goto code_r0x002d2560;
      uVar12 = uVar9 - uVar2;
      if (uVar5 <= uVar10) {
        uVar12 = uVar9 & uVar2 - 1 >> 1;
      }
      uVar11 = uVar9;
      if ((uVar9 & uVar3) != 0) {
        uVar11 = uVar12;
      }
      uVar9 = uVar9 - uVar11;
      if (((uVar9 == 0) || (uVar9 == uVar2)) || (uVar9 == uVar3)) {
        if (((int)uVar11 <= (int)-uVar3) || ((int)uVar3 <= (int)uVar11)) goto code_r0x002d2564;
        if ((uVar11 & 1) != 0) goto code_r0x002d2504;
        goto code_r0x002d2568;
      }
      goto code_r0x002d256c;
    }
    uVar11 = 0;
code_r0x002d2504:
    *puVar4 = (char)uVar11;
    if (uVar10 >> 6 < uVar5 + 0x3f >> 6) {
      uVar12 = (uint)(*(ulong *)(auVar14._8_8_ + (uVar10 >> 6) * 2) >> (uVar10 & 0x3f)) & 1;
    }
    else {
      uVar12 = 0;
    }
    uVar9 = (uVar12 << (ulong)(uVar6 & 0x1f)) + ((int)uVar9 >> 1);
    if ((int)uVar2 < (int)uVar9) goto code_r0x002d255c;
    puVar4 = puVar4 + 1;
    lVar13 = lVar13 + -1;
  } while (lVar13 != 0);
LAB_002d254c:
  if (uVar9 == 0) {
    return;
  }
code_r0x002d2578:
  auVar14 = func_0x0079e900();
  lVar13 = lVar8 << 3;
  if (lVar13 == 0) {
    return;
  }
  _memcpy(auVar14._0_8_,uVar7,lVar13);
  _memcpy(auVar14._8_8_,uVar7 + lVar8 * 8,lVar13);
                    /* WARNING: Could not recover jumptable at 0x007b382c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__memcpy_00a250b8)(uVar5,uVar7 + lVar8 * 0x10,lVar13);
  return;
}

