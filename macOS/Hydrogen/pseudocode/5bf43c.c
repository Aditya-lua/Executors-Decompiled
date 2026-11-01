
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long FUN_005bf43c(ulong *param_1,undefined8 param_2,undefined8 param_3)

{
  ulong uVar1;
  byte bVar2;
  undefined1 auVar3 [16];
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  code *pcVar7;
  undefined8 uVar8;
  undefined8 extraout_x1;
  ulong *puVar9;
  ulong in_x9;
  ulong in_x10;
  ulong uVar10;
  uint uVar11;
  long in_x12;
  ulong uVar12;
  long lVar13;
  ulong *unaff_x19;
  ulong uVar14;
  ulong unaff_x21;
  ulong unaff_x22;
  long unaff_x29;
  undefined8 uStack0000000000000028;
  
  do {
    in_x10 = in_x10 + in_x12 & in_x9;
    in_x12 = in_x12 + 8;
    uVar10 = *(ulong *)((long)param_1 + in_x10) & 0x8080808080808080;
  } while (uVar10 == 0);
  uVar14 = unaff_x19[2];
  uVar10 = uVar10 >> 7;
  uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
  uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
  uVar10 = in_x10 + ((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) & in_x9;
  bVar2 = *(byte *)((long)param_1 + uVar10);
  uVar11 = (uint)(char)bVar2;
  if ((int)uVar11 < 0) {
    uVar12 = unaff_x19[5];
  }
  else {
    uVar10 = (*param_1 & 0x8080808080808080) >> 7;
    uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
    uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
    uVar10 = (ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3;
    bVar2 = *(byte *)((long)param_1 + uVar10);
    uVar12 = unaff_x19[5];
    uVar11 = (uint)bVar2;
  }
  uVar11 = uVar11 & 1;
  if (uVar12 == 0) {
    if ((uVar11 == 0) && ((bVar2 & 1) == 0)) {
      uVar11 = 0;
    }
    else {
      func_0x007af998(param_2,1,unaff_x19[1],uVar14,1);
      param_1 = (ulong *)unaff_x19[3];
      in_x9 = unaff_x19[4];
      uVar12 = in_x9 & unaff_x22;
      uVar10 = *(ulong *)((long)param_1 + uVar12) & 0x8080808080808080;
      if (uVar10 == 0) {
        lVar13 = 8;
        do {
          uVar12 = uVar12 + lVar13 & in_x9;
          lVar13 = lVar13 + 8;
          uVar10 = *(ulong *)((long)param_1 + uVar12) & 0x8080808080808080;
        } while (uVar10 == 0);
      }
      uVar10 = (uVar10 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar10 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
      uVar10 = uVar12 + ((ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3) & in_x9;
      param_3 = extraout_x1;
      if (-1 < *(char *)((long)param_1 + uVar10)) {
        uVar10 = (*param_1 & 0x8080808080808080) >> 7;
        uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
        uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
        uVar10 = (ulong)LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) >> 3;
      }
    }
  }
  unaff_x19[5] = unaff_x19[5] - (ulong)uVar11;
  bVar2 = (byte)(unaff_x22 >> 0x38);
  *(byte *)((long)param_1 + uVar10) = bVar2 >> 1;
  *(byte *)(unaff_x19[3] + (uVar10 - 8 & in_x9) + 8) = bVar2 >> 1;
  unaff_x19[6] = unaff_x19[6] + 1;
  *(ulong *)(unaff_x19[3] + uVar10 * -8 + -8) = uVar14;
  uVar10 = unaff_x19[2];
  uVar12 = *unaff_x19;
  if (uVar14 == *unaff_x19) {
    uVar1 = unaff_x19[5] + unaff_x19[6];
    uVar12 = uVar14;
    if (uVar1 - uVar10 <= uVar14 - uVar10) goto LAB_005bf5ac;
    if (CARRY8(uVar10,uVar1 - uVar10)) {
      uVar8 = 0;
      goto LAB_005bf700;
    }
    uVar8 = 0;
    auVar3._8_8_ = 0;
    auVar3._0_8_ = uVar1;
    if ((SUB168(auVar3 * ZEXT816(0x30),8) != 0) || (0x7ffffffffffffff8 < uVar1 * 0x30))
    goto LAB_005bf700;
    if (uVar14 != 0) {
      uStack0000000000000028 = unaff_x19[1];
    }
    func_0x0079a108(unaff_x29 + -0x48,8,uVar1 * 0x30,&uStack0000000000000028);
    if (*(int *)(unaff_x29 + -0x48) != 1) {
      uVar10 = *(ulong *)(unaff_x29 + -0x40);
      *unaff_x19 = uVar1;
      unaff_x19[1] = uVar10;
      uVar10 = unaff_x19[2];
      uVar12 = uVar1;
      goto LAB_005bf5ac;
    }
  }
  else {
LAB_005bf5ac:
    uVar6 = _UNK_009f2300;
    uVar5 = _UNK_009f22f8;
    uVar4 = _UNK_009f22f0;
    uVar1 = _UNK_009f22e8;
    uStack0000000000000028 = unaff_x21;
    if (uVar10 == uVar12) {
      func_0x005bcfe0();
    }
    puVar9 = (ulong *)(unaff_x19[1] + uVar10 * 0x30);
    puVar9[3] = uVar5;
    puVar9[2] = uVar4;
    puVar9[5] = unaff_x22;
    puVar9[4] = uVar6;
    puVar9[1] = uVar1;
    *puVar9 = uStack0000000000000028;
    uVar10 = uVar10 + 1;
    unaff_x19[2] = uVar10;
    if (uVar14 < uVar10) {
      return unaff_x19[1] + uVar14 * 0x30 + 8;
    }
    func_0x007a2570(uVar14,uVar10,&UNK_009f2258);
  }
  uVar8 = *(undefined8 *)(unaff_x29 + -0x40);
  param_3 = *(undefined8 *)(unaff_x29 + -0x38);
LAB_005bf700:
  func_0x007a1f00(uVar8,param_3,&UNK_009f22a0);
                    /* WARNING: Does not return */
  pcVar7 = (code *)SoftwareBreakpoint(1,0x5bf724);
  (*pcVar7)();
}

