
/* WARNING: Removing unreachable block (ram,0x007abf64) */

undefined8 FUN_007abdb4(void)

{
  ulong uVar1;
  byte bVar2;
  code *pcVar3;
  bool bVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  long lVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  ulong *unaff_x19;
  ulong unaff_x21;
  long unaff_x22;
  long *unaff_x23;
  ulong unaff_x24;
  long in_stack_00000008;
  ulong in_stack_00000010;
  
  _memset();
  uVar7 = unaff_x24 - 1;
  uVar1 = uVar7;
  if (8 < unaff_x24) {
    uVar1 = (unaff_x24 >> 3) * 7;
  }
  if (unaff_x21 == 0xffffffffffffffff) {
    lVar9 = *unaff_x23;
    lVar11 = -1;
    *unaff_x23 = (long)unaff_x19;
    unaff_x23[1] = uVar7;
    unaff_x23[2] = uVar1 - unaff_x22;
    unaff_x23[3] = unaff_x22;
  }
  else {
    lVar9 = *unaff_x23;
    uVar8 = 0;
    do {
      if (-1 < *(char *)(lVar9 + uVar8)) {
        uVar5 = *(ulong *)(lVar9 + uVar8 * -8 + -8);
        if (in_stack_00000010 <= uVar5) {
          func_0x007a2570(uVar5,in_stack_00000010,&UNK_009f1438);
                    /* WARNING: Does not return */
          pcVar3 = (code *)SoftwareBreakpoint(1,0x7abf84);
          (*pcVar3)();
        }
        uVar10 = *(ulong *)(in_stack_00000008 + uVar5 * 0x30 + 0x28);
        uVar12 = uVar7 & uVar10;
        uVar5 = *(ulong *)((long)unaff_x19 + uVar12) & 0x8080808080808080;
        if (uVar5 == 0) {
          lVar9 = 8;
          do {
            uVar12 = uVar12 + lVar9 & uVar7;
            lVar9 = lVar9 + 8;
            uVar5 = *(ulong *)((long)unaff_x19 + uVar12) & 0x8080808080808080;
          } while (uVar5 == 0);
        }
        uVar5 = (uVar5 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar5 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
        uVar5 = uVar12 + ((ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3) & uVar7;
        if (-1 < *(char *)((long)unaff_x19 + uVar5)) {
          uVar5 = (*unaff_x19 & 0x8080808080808080) >> 7;
          uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
          uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
          uVar5 = (ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3;
        }
        bVar2 = (byte)(uVar10 >> 0x38);
        *(byte *)((long)unaff_x19 + uVar5) = bVar2 >> 1;
        *(byte *)((long)unaff_x19 + (uVar5 - 8 & uVar7) + 8) = bVar2 >> 1;
        lVar9 = *unaff_x23;
        unaff_x19[-1 - uVar5] = *(ulong *)(lVar9 + ~uVar8 * 8);
      }
      bVar4 = uVar8 != unaff_x21;
      uVar8 = uVar8 + 1;
    } while (bVar4);
    lVar11 = unaff_x23[1];
    *unaff_x23 = (long)unaff_x19;
    unaff_x23[1] = uVar7;
    unaff_x23[2] = uVar1 - unaff_x22;
    unaff_x23[3] = unaff_x22;
    if (lVar11 == 0) {
      return 0x8000000000000001;
    }
  }
  lVar6 = lVar11 * 8 + 8;
  func_0x00187bd4(lVar9 - lVar6,lVar11 + lVar6 + 9);
  return 0x8000000000000001;
}

