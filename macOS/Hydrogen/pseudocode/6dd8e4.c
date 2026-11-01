
undefined8 FUN_006dd8e4(void)

{
  char cVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  ulong unaff_x19;
  long unaff_x20;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  long unaff_x24;
  ulong *puVar9;
  bool bVar10;
  long *plVar11;
  long lVar12;
  undefined4 uStack0000000000000000;
  undefined3 uStack0000000000000004;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  undefined4 uStack0000000000000018;
  undefined3 uStack000000000000001c;
  char cStack000000000000001f;
  
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
  if (unaff_x24 != 0) {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
              (&uStack0000000000000008,4);
  }
  if (*(long *)(unaff_x19 + 0x60) == 0) {
LAB_006dd9a4:
    uStack0000000000000004 = 0;
    uStack0000000000000000 = 0;
    if (cStack000000000000001f < '\0') {
      __ZdlPv(uStack0000000000000008);
    }
    uVar7 = 0;
    uVar8 = 0;
    uVar6 = 0;
  }
  else {
    bVar10 = false;
    plVar11 = *(long **)(unaff_x19 + 0x58);
    lVar12 = *(long *)(unaff_x19 + 0x60) << 3;
    do {
      if ((*(long *)(*plVar11 + 0x30) == 0) ||
         (iVar2 = func_0x006deab4(*(long *)(*plVar11 + 0x30),unaff_x19 + 0x30,unaff_x20 + 0x58,1),
         iVar2 == 0xf)) {
        iVar2 = 0xf;
      }
      else {
        bVar10 = true;
      }
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                (&uStack0000000000000008,(int)(char)iVar2);
      plVar11 = plVar11 + 1;
      lVar12 = lVar12 + -8;
    } while (lVar12 != 0);
    if (!bVar10) goto LAB_006dd9a4;
    uStack0000000000000000 = uStack0000000000000018;
    uStack0000000000000004 = uStack000000000000001c;
    uVar7 = (ulong)cStack000000000000001f;
    iVar2 = (int)cStack000000000000001f;
    uVar6 = uStack0000000000000008;
    uVar8 = in_stack_00000010;
    uVar4 = in_stack_00000010;
    if (cStack000000000000001f < '\0') goto joined_r0x006dd9d0;
  }
  iVar2 = (int)uVar7;
  uVar4 = uVar7 & 0xff;
joined_r0x006dd9d0:
  if (uVar4 == 0) {
    if (iVar2 < 0) {
      __ZdlPv(0,uVar6);
    }
  }
  else {
    plVar11 = *(long **)(unaff_x20 + 8);
    lVar12 = plVar11[1];
    if ((ulong)(lVar12 * 3) >> 2 <= (ulong)plVar11[2]) {
      if ((plVar11[2] != 0) && (plVar11[3] != unaff_x19)) {
        uVar7 = 0;
        uVar4 = unaff_x19 >> 4 ^ unaff_x19 >> 9;
        do {
          uVar4 = uVar4 & lVar12 - 1U;
          uVar5 = *(ulong *)(*plVar11 + uVar4 * 0x20);
          if (uVar5 == unaff_x19) goto LAB_006dda40;
          uVar7 = uVar7 + 1;
          uVar4 = uVar7 + uVar4;
        } while (uVar5 != plVar11[3] && uVar7 <= lVar12 - 1U);
      }
      func_0x006df034(plVar11);
      lVar12 = plVar11[1];
    }
LAB_006dda40:
    uVar7 = 0;
    uVar4 = unaff_x19 >> 4 ^ unaff_x19 >> 9;
    lVar3 = *plVar11;
    do {
      uVar4 = uVar4 & lVar12 - 1U;
      uVar5 = *(ulong *)(lVar3 + uVar4 * 0x20);
      if (uVar5 == plVar11[3]) {
        puVar9 = (ulong *)(lVar3 + uVar4 * 0x20);
        *puVar9 = unaff_x19;
        plVar11[2] = plVar11[2] + 1;
        cVar1 = *(char *)((long)puVar9 + 0x1f);
        goto joined_r0x006ddaa8;
      }
      if (uVar5 == unaff_x19) {
        puVar9 = (ulong *)(lVar3 + uVar4 * 0x20);
        cVar1 = *(char *)((long)puVar9 + 0x1f);
        goto joined_r0x006ddaa8;
      }
      uVar7 = uVar7 + 1;
      uVar4 = uVar7 + uVar4;
    } while (uVar7 <= lVar12 - 1U);
    puVar9 = (ulong *)0x0;
    cVar1 = MACH_HEADER.reserved._3_1_;
joined_r0x006ddaa8:
    if (cVar1 < '\0') {
      __ZdlPv(puVar9[1]);
    }
    puVar9[1] = uVar6;
    puVar9[2] = uVar8;
    *(undefined4 *)(puVar9 + 3) = uStack0000000000000000;
    uStack0000000000000000._3_1_ = (undefined1)((uint)uStack0000000000000000 >> 0x18);
    *(uint *)((long)puVar9 + 0x1b) = CONCAT31(uStack0000000000000004,uStack0000000000000000._3_1_);
    *(char *)((long)puVar9 + 0x1f) = (char)iVar2;
  }
  return 1;
}

