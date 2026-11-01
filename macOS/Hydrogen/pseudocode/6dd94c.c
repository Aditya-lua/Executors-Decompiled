
/* WARNING: Removing unreachable block (ram,0x006dd9a4) */
/* WARNING: Removing unreachable block (ram,0x006dd9b4) */
/* WARNING: Removing unreachable block (ram,0x006dd9bc) */
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_006dd94c(int param_1)

{
  char cVar1;
  ulong uVar2;
  ulong uVar3;
  undefined4 uVar4;
  undefined1 uVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  ulong uVar10;
  ulong unaff_x19;
  long unaff_x20;
  long *plVar11;
  ulong *puVar12;
  long *unaff_x27;
  long unaff_x28;
  undefined3 uStack0000000000000004;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  undefined4 uStack0000000000000018;
  undefined3 uStack000000000000001c;
  byte bStack000000000000001f;
  
  while( true ) {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
              (&uStack0000000000000008,(int)(char)param_1);
    uVar4 = uStack0000000000000018;
    uVar3 = in_stack_00000010;
    uVar2 = uStack0000000000000008;
    unaff_x27 = unaff_x27 + 1;
    unaff_x28 = unaff_x28 + -8;
    if (unaff_x28 == 0) break;
    if ((*(long *)(*unaff_x27 + 0x30) == 0) || (param_1 = func_0x006deab4(), param_1 == 0xf)) {
      param_1 = 0xf;
    }
  }
  uVar5 = uStack0000000000000018._3_1_;
  uStack0000000000000004 = uStack000000000000001c;
  uVar7 = in_stack_00000010;
  if (-1 < (char)bStack000000000000001f) {
    uVar7 = (ulong)bStack000000000000001f;
  }
  if (uVar7 == 0) {
    if ((char)bStack000000000000001f < '\0') {
      __ZdlPv(0,uStack0000000000000008);
    }
  }
  else {
    plVar11 = *(long **)(unaff_x20 + 8);
    lVar6 = plVar11[1];
    if ((ulong)(lVar6 * 3) >> 2 <= (ulong)plVar11[2]) {
      if ((plVar11[2] != 0) && (plVar11[3] != unaff_x19)) {
        uVar7 = 0;
        uVar9 = unaff_x19 >> 4 ^ unaff_x19 >> 9;
        do {
          uVar9 = uVar9 & lVar6 - 1U;
          uVar10 = *(ulong *)(*plVar11 + uVar9 * 0x20);
          if (uVar10 == unaff_x19) goto LAB_006dda40;
          uVar7 = uVar7 + 1;
          uVar9 = uVar7 + uVar9;
        } while (uVar10 != plVar11[3] && uVar7 <= lVar6 - 1U);
      }
      func_0x006df034(plVar11);
      lVar6 = plVar11[1];
    }
LAB_006dda40:
    uVar7 = 0;
    uVar9 = unaff_x19 >> 4 ^ unaff_x19 >> 9;
    lVar8 = *plVar11;
    do {
      uVar9 = uVar9 & lVar6 - 1U;
      uVar10 = *(ulong *)(lVar8 + uVar9 * 0x20);
      if (uVar10 == plVar11[3]) {
        puVar12 = (ulong *)(lVar8 + uVar9 * 0x20);
        *puVar12 = unaff_x19;
        plVar11[2] = plVar11[2] + 1;
        cVar1 = *(char *)((long)puVar12 + 0x1f);
        goto joined_r0x006ddaf8;
      }
      if (uVar10 == unaff_x19) {
        puVar12 = (ulong *)(lVar8 + uVar9 * 0x20);
        cVar1 = *(char *)((long)puVar12 + 0x1f);
        goto joined_r0x006ddaf8;
      }
      uVar7 = uVar7 + 1;
      uVar9 = uVar7 + uVar9;
    } while (uVar7 <= lVar6 - 1U);
    puVar12 = (ulong *)0x0;
    cVar1 = MACH_HEADER.reserved._3_1_;
joined_r0x006ddaf8:
    if (cVar1 < '\0') {
      __ZdlPv(puVar12[1]);
    }
    puVar12[1] = uVar2;
    puVar12[2] = uVar3;
    *(undefined4 *)(puVar12 + 3) = uVar4;
    *(uint *)((long)puVar12 + 0x1b) = CONCAT31(uStack0000000000000004,uVar5);
    *(byte *)((long)puVar12 + 0x1f) = bStack000000000000001f;
  }
  return 1;
}

