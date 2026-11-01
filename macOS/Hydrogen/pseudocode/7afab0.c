
/* WARNING: Removing unreachable block (ram,0x007afc64) */

undefined8 FUN_007afab0(long param_1)

{
  ulong *puVar1;
  ulong uVar2;
  byte bVar3;
  code *pcVar4;
  bool bVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  long lVar12;
  ulong uVar13;
  ulong unaff_x21;
  long unaff_x22;
  long *unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  long in_stack_00000008;
  ulong in_stack_00000010;
  
  puVar1 = (ulong *)(param_1 + unaff_x25);
  _memset(puVar1,0xff);
  uVar8 = unaff_x24 - 1;
  uVar2 = uVar8;
  if (8 < unaff_x24) {
    uVar2 = (unaff_x24 >> 3) * 7;
  }
  if (unaff_x21 == 0xffffffffffffffff) {
    lVar10 = *unaff_x23;
    lVar12 = -1;
    *unaff_x23 = (long)puVar1;
    unaff_x23[1] = uVar8;
    unaff_x23[2] = uVar2 - unaff_x22;
    unaff_x23[3] = unaff_x22;
  }
  else {
    lVar10 = *unaff_x23;
    uVar9 = 0;
    do {
      if (-1 < *(char *)(lVar10 + uVar9)) {
        uVar6 = *(ulong *)(lVar10 + uVar9 * -8 + -8);
        if (in_stack_00000010 <= uVar6) {
          func_0x007a2570(uVar6,in_stack_00000010,&UNK_009f22d0);
                    /* WARNING: Does not return */
          pcVar4 = (code *)SoftwareBreakpoint(1,0x7afc84);
          (*pcVar4)();
        }
        uVar11 = *(ulong *)(in_stack_00000008 + uVar6 * 0x30 + 0x28);
        uVar13 = uVar8 & uVar11;
        uVar6 = *(ulong *)((long)puVar1 + uVar13) & 0x8080808080808080;
        if (uVar6 == 0) {
          lVar10 = 8;
          do {
            uVar13 = uVar13 + lVar10 & uVar8;
            lVar10 = lVar10 + 8;
            uVar6 = *(ulong *)((long)puVar1 + uVar13) & 0x8080808080808080;
          } while (uVar6 == 0);
        }
        uVar6 = (uVar6 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar6 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
        uVar6 = uVar13 + ((ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3) & uVar8;
        if (-1 < *(char *)((long)puVar1 + uVar6)) {
          uVar6 = (*puVar1 & 0x8080808080808080) >> 7;
          uVar6 = (uVar6 & 0xff00ff00ff00ff00) >> 8 | (uVar6 & 0xff00ff00ff00ff) << 8;
          uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
          uVar6 = (ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3;
        }
        bVar3 = (byte)(uVar11 >> 0x38);
        *(byte *)((long)puVar1 + uVar6) = bVar3 >> 1;
        *(byte *)((long)puVar1 + (uVar6 - 8 & uVar8) + 8) = bVar3 >> 1;
        lVar10 = *unaff_x23;
        puVar1[-1 - uVar6] = *(ulong *)(lVar10 + ~uVar9 * 8);
      }
      bVar5 = uVar9 != unaff_x21;
      uVar9 = uVar9 + 1;
    } while (bVar5);
    lVar12 = unaff_x23[1];
    *unaff_x23 = (long)puVar1;
    unaff_x23[1] = uVar8;
    unaff_x23[2] = uVar2 - unaff_x22;
    unaff_x23[3] = unaff_x22;
    if (lVar12 == 0) {
      return 0x8000000000000001;
    }
  }
  lVar7 = lVar12 * 8 + 8;
  func_0x00187bd4(lVar10 - lVar7,lVar12 + lVar7 + 9);
  return 0x8000000000000001;
}

