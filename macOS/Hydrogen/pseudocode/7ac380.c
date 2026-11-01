
/* WARNING: Removing unreachable block (ram,0x007ac564) */

undefined8 FUN_007ac380(long *param_1)

{
  ulong uVar1;
  ulong *puVar2;
  byte bVar3;
  code *pcVar4;
  bool bVar5;
  long lVar6;
  ulong uVar7;
  undefined8 uVar8;
  undefined8 in_x4;
  long lVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  ulong unaff_x21;
  long unaff_x22;
  ulong unaff_x24;
  ulong unaff_x25;
  long in_stack_00000008;
  ulong in_stack_00000010;
  
  uVar1 = unaff_x24 + 8;
  if (CARRY8(unaff_x25,uVar1)) {
    uVar8 = func_0x005e3258(in_x4);
    return uVar8;
  }
  lVar6 = func_0x00187bd0(unaff_x25 + uVar1,8);
  if (lVar6 == 0) {
    uVar8 = func_0x005e329c(in_x4,8,unaff_x25 + uVar1);
    return uVar8;
  }
  puVar2 = (ulong *)(lVar6 + unaff_x25);
  _memset(puVar2,0xff,uVar1);
  uVar10 = unaff_x24 - 1;
  uVar1 = uVar10;
  if (8 < unaff_x24) {
    uVar1 = (unaff_x24 >> 3) * 7;
  }
  if (unaff_x21 == 0xffffffffffffffff) {
    lVar6 = *param_1;
    lVar13 = -1;
    *param_1 = (long)puVar2;
    param_1[1] = uVar10;
    param_1[2] = uVar1 - unaff_x22;
    param_1[3] = unaff_x22;
  }
  else {
    lVar6 = *param_1;
    uVar11 = 0;
    do {
      if (-1 < *(char *)(lVar6 + uVar11)) {
        uVar7 = *(ulong *)(lVar6 + uVar11 * -8 + -8);
        if (in_stack_00000010 <= uVar7) {
          func_0x007a2570(uVar7,in_stack_00000010,&UNK_009f1438);
                    /* WARNING: Does not return */
          pcVar4 = (code *)SoftwareBreakpoint(1,0x7ac584);
          (*pcVar4)();
        }
        uVar12 = *(ulong *)(in_stack_00000008 + uVar7 * 0x18 + 0x10);
        uVar14 = uVar10 & uVar12;
        uVar7 = *(ulong *)((long)puVar2 + uVar14) & 0x8080808080808080;
        if (uVar7 == 0) {
          lVar6 = 8;
          do {
            uVar14 = uVar14 + lVar6 & uVar10;
            lVar6 = lVar6 + 8;
            uVar7 = *(ulong *)((long)puVar2 + uVar14) & 0x8080808080808080;
          } while (uVar7 == 0);
        }
        uVar7 = (uVar7 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
        uVar7 = uVar14 + ((ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3) & uVar10;
        if (-1 < *(char *)((long)puVar2 + uVar7)) {
          uVar7 = (*puVar2 & 0x8080808080808080) >> 7;
          uVar7 = (uVar7 & 0xff00ff00ff00ff00) >> 8 | (uVar7 & 0xff00ff00ff00ff) << 8;
          uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
          uVar7 = (ulong)LZCOUNT(uVar7 >> 0x20 | uVar7 << 0x20) >> 3;
        }
        bVar3 = (byte)(uVar12 >> 0x38);
        *(byte *)((long)puVar2 + uVar7) = bVar3 >> 1;
        *(byte *)((long)puVar2 + (uVar7 - 8 & uVar10) + 8) = bVar3 >> 1;
        lVar6 = *param_1;
        puVar2[-1 - uVar7] = *(ulong *)(lVar6 + ~uVar11 * 8);
      }
      bVar5 = uVar11 != unaff_x21;
      uVar11 = uVar11 + 1;
    } while (bVar5);
    lVar13 = param_1[1];
    *param_1 = (long)puVar2;
    param_1[1] = uVar10;
    param_1[2] = uVar1 - unaff_x22;
    param_1[3] = unaff_x22;
    if (lVar13 == 0) {
      return 0x8000000000000001;
    }
  }
  lVar9 = lVar13 * 8 + 8;
  func_0x00187bd4(lVar6 - lVar9,lVar13 + lVar9 + 9);
  return 0x8000000000000001;
}

