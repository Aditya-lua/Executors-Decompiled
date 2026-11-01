
void FUN_005673c0(long param_1)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  long *plVar4;
  long *plVar5;
  long in_x9;
  long lVar6;
  long in_x10;
  ulong uVar7;
  byte bVar8;
  ulong uVar9;
  long *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x23;
  byte bVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  
  if (in_x10 == 0) {
    if (in_x9 == 0) {
LAB_005674bc:
      func_0x00566040(&uStack0000000000000078);
      unaff_x20[1] = in_stack_00000080;
      *unaff_x20 = uStack0000000000000078;
      unaff_x20[3] = in_stack_00000090;
      unaff_x20[2] = in_stack_00000088;
      uVar11 = *(undefined8 *)(unaff_x23 + 0x20);
      uVar13 = *(undefined8 *)(unaff_x23 + 0x38);
      uVar12 = *(undefined8 *)(unaff_x23 + 0x30);
      unaff_x20[5] = *(undefined8 *)(unaff_x23 + 0x28);
      unaff_x20[4] = uVar11;
      unaff_x20[7] = uVar13;
      unaff_x20[6] = uVar12;
      *(undefined1 *)(unaff_x20 + 8) = 0;
      goto LAB_0056750c;
    }
  }
  else {
    plVar4 = *(long **)(param_1 + 8);
    lVar1 = *unaff_x19;
    uVar2 = unaff_x19[1];
    plVar5 = plVar4;
    do {
      if (plVar5 == plVar4 + in_x9 * 9) goto LAB_005674bc;
      lVar6 = 0;
      uVar7 = (*plVar5 + 8) * 0x517cc1b727220a95;
      bVar8 = (byte)(uVar7 >> 0x39);
      uVar7 = uVar7 & uVar2;
      uVar11 = *(undefined8 *)(lVar1 + uVar7);
      uVar3 = CONCAT17(-((byte)((ulong)uVar11 >> 0x38) == bVar8),
                       CONCAT16(-((byte)((ulong)uVar11 >> 0x30) == bVar8),
                                CONCAT15(-((byte)((ulong)uVar11 >> 0x28) == bVar8),
                                         CONCAT14(-((byte)((ulong)uVar11 >> 0x20) == bVar8),
                                                  CONCAT13(-((byte)((ulong)uVar11 >> 0x18) == bVar8)
                                                           ,CONCAT12(-((byte)((ulong)uVar11 >> 0x10)
                                                                      == bVar8),
                                                                     CONCAT11(-((byte)((ulong)uVar11
                                                                                      >> 8) == bVar8
                                                                               ),-((byte)uVar11 ==
                                                                                  bVar8)))))))) &
              0x8080808080808080;
      while( true ) {
        while (uVar3 == 0) {
          bVar10 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar11 >> 0x38) == -1),
                                       CONCAT16(-((char)((ulong)uVar11 >> 0x30) == -1),
                                                CONCAT15(-((char)((ulong)uVar11 >> 0x28) == -1),
                                                         CONCAT14(-((char)((ulong)uVar11 >> 0x20) ==
                                                                   -1),CONCAT13(-((char)((ulong)
                                                  uVar11 >> 0x18) == -1),
                                                  CONCAT12(-((char)((ulong)uVar11 >> 0x10) == -1),
                                                           CONCAT11(-((char)((ulong)uVar11 >> 8) ==
                                                                     -1),-((char)uVar11 == -1)))))))
                                      ),1);
          if ((bVar10 & 1) != 0) goto LAB_00567504;
          lVar6 = lVar6 + 8;
          uVar7 = uVar7 + lVar6 & uVar2;
          uVar11 = *(undefined8 *)(lVar1 + uVar7);
          uVar3 = CONCAT17(-((byte)((ulong)uVar11 >> 0x38) == bVar8),
                           CONCAT16(-((byte)((ulong)uVar11 >> 0x30) == bVar8),
                                    CONCAT15(-((byte)((ulong)uVar11 >> 0x28) == bVar8),
                                             CONCAT14(-((byte)((ulong)uVar11 >> 0x20) == bVar8),
                                                      CONCAT13(-((byte)((ulong)uVar11 >> 0x18) ==
                                                                bVar8),CONCAT12(-((byte)((ulong)
                                                  uVar11 >> 0x10) == bVar8),
                                                  CONCAT11(-((byte)((ulong)uVar11 >> 8) == bVar8),
                                                           -((byte)uVar11 == bVar8)))))))) &
                  0x8080808080808080;
        }
        uVar9 = (uVar3 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar3 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
        uVar9 = uVar7 + ((ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3) & uVar2;
        if (*plVar5 == *(long *)(lVar1 + -0x48 + uVar9 * -0x48)) break;
        uVar3 = uVar3 - 1 & uVar3;
      }
      uVar3 = func_0x00566a14(lVar1 + -0x40 + uVar9 * -0x48,plVar5 + 1);
      plVar5 = plVar5 + 9;
    } while ((uVar3 & 1) != 0);
  }
LAB_00567504:
  *unaff_x20 = 0xc;
LAB_0056750c:
  if (in_stack_00000010 != 0) {
    func_0x00187bd4(in_stack_00000018,in_stack_00000010 * 0x18,8);
  }
  func_0x0053a8e0();
  return;
}

