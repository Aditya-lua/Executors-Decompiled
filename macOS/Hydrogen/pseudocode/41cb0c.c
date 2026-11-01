
undefined * FUN_0041cb0c(ulong param_1,long param_2)

{
  ulong uVar1;
  ulong uVar2;
  code *pcVar3;
  bool bVar4;
  undefined *puVar5;
  uint *puVar6;
  ulong uVar7;
  ulong unaff_x19;
  long unaff_x20;
  long lVar8;
  ulong uVar9;
  long unaff_x25;
  
  if ((param_1 & 1) == 0) {
    lVar8 = *(long *)(unaff_x25 + 0x30);
    if ((lVar8 != 0) && (*(char *)(*(long *)(unaff_x25 + 0x28) + lVar8 + -1) == '\n')) {
      puVar5 = (undefined *)func_0x004182bc(unaff_x25 + 0x20);
      if (puVar5 != (undefined *)0x0) goto LAB_0041cbc4;
      lVar8 = *(long *)(unaff_x25 + 0x30);
    }
    if (unaff_x19 < (ulong)(*(long *)(unaff_x25 + 0x20) - lVar8)) goto LAB_0041cba4;
  }
  else {
    uVar1 = param_2 + 1;
    bVar4 = unaff_x19 < uVar1;
    unaff_x19 = unaff_x19 - uVar1;
    if (bVar4) {
      func_0x007a2420();
LAB_0041ccf4:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x41ccf8);
      (*pcVar3)();
    }
    lVar8 = *(long *)(unaff_x25 + 0x30);
    if (lVar8 == 0) {
      if (uVar1 != 0) {
        puVar5 = &UNK_009da470;
        lVar8 = unaff_x20;
        uVar9 = uVar1;
        do {
          while( true ) {
            uVar7 = uVar9;
            if (0x7ffffffd < uVar9) {
              uVar7 = 0x7ffffffe;
            }
            uVar7 = _write(1,lVar8,uVar7);
            if (uVar7 == 0xffffffffffffffff) break;
            if (uVar7 == 0) {
LAB_0041cc6c:
              if ((puVar5 != (undefined *)0x0) &&
                 (((ulong)puVar5 & 0xffffffff00000003) != 0x900000002)) goto LAB_0041cbc4;
              goto LAB_0041cc84;
            }
            uVar2 = uVar9 - uVar7;
            if (uVar9 < uVar7) {
              func_0x007a28a4(uVar7,uVar9,&UNK_009da7a0);
              goto LAB_0041ccf4;
            }
            lVar8 = lVar8 + uVar7;
            uVar9 = uVar2;
            if (uVar2 == 0) goto LAB_0041cc84;
          }
          puVar6 = (uint *)___error();
          if (*puVar6 != 4) {
            puVar5 = (undefined *)((ulong)*puVar6 << 0x20 | 2);
            goto LAB_0041cc6c;
          }
        } while (uVar9 != 0);
      }
    }
    else {
      if (uVar1 < (ulong)(*(long *)(unaff_x25 + 0x20) - lVar8)) {
        _memcpy(*(long *)(unaff_x25 + 0x28) + lVar8);
        *(ulong *)(unaff_x25 + 0x30) = lVar8 + uVar1;
      }
      else {
        puVar5 = (undefined *)func_0x007a04a8(unaff_x25 + 0x20);
        if (puVar5 != (undefined *)0x0) goto LAB_0041cbc4;
      }
      puVar5 = (undefined *)func_0x004182bc(unaff_x25 + 0x20);
      if (puVar5 != (undefined *)0x0) goto LAB_0041cbc4;
    }
LAB_0041cc84:
    unaff_x20 = unaff_x20 + uVar1;
    lVar8 = *(long *)(unaff_x25 + 0x30);
    if (unaff_x19 < (ulong)(*(long *)(unaff_x25 + 0x20) - lVar8)) {
LAB_0041cba4:
      _memcpy(*(long *)(unaff_x25 + 0x28) + lVar8,unaff_x20,unaff_x19);
      puVar5 = (undefined *)0x0;
      *(ulong *)(unaff_x25 + 0x30) = lVar8 + unaff_x19;
      goto LAB_0041cbc4;
    }
  }
  puVar5 = (undefined *)func_0x007a04a8(unaff_x25 + 0x20,unaff_x20,unaff_x19);
LAB_0041cbc4:
  *(long *)(unaff_x25 + 0x18) = *(long *)(unaff_x25 + 0x18) + 1;
  return puVar5;
}

