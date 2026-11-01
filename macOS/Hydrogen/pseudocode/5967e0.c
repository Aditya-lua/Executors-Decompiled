
void FUN_005967e0(void)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  long *extraout_x10;
  long *plVar5;
  long extraout_x11;
  ulong uVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  undefined8 *puVar11;
  long lVar12;
  undefined1 auVar13 [16];
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  long *plStack_a0;
  long lStack_98;
  long *plStack_90;
  ulong uStack_88;
  long *plStack_80;
  long lStack_78;
  ulong uStack_70;
  long lStack_68;
  
  auVar13 = __Unwind_Resume();
  puVar11 = auVar13._8_8_;
  plVar5 = auVar13._0_8_;
  lVar8 = *plVar5;
  plVar1 = (long *)*puVar11;
  lVar9 = puVar11[1];
  if (lVar8 != plVar5[1]) {
    lVar2 = plVar5[2];
    lVar3 = plVar5[3];
    uVar10 = (ulong)(plVar5[1] - lVar8) >> 2;
    puVar11 = (undefined8 *)(puVar11[2] + lVar9 * 0x18);
    do {
      uVar4 = func_0x005763e4(lVar2 + 0x20,lVar8);
      func_0x00491a68(&uStack_a8,lVar2,uVar4,lVar8);
      if (plStack_a0 == (long *)0x0) {
        uStack_c0 = 0;
        uStack_b8 = 8;
        uStack_b0 = 0;
      }
      else {
        if (lStack_98 == 0) {
          uStack_a8 = 0;
          plVar5 = extraout_x10;
          lVar7 = extraout_x11;
        }
        else {
          uVar6 = lStack_98 * 4 + 0xbU & 0xfffffffffffffff8;
          plVar5 = (long *)(lStack_98 + uVar6 + 9);
          lVar7 = (long)plStack_a0 - uVar6;
          uStack_a8 = 8;
        }
        lVar12 = *plStack_a0;
        plStack_80 = plStack_a0 + 1;
        lStack_78 = (long)plStack_a0 + lStack_98 + 1;
        uStack_70 = uStack_88;
        plStack_90 = plStack_a0;
        plStack_a0 = plVar5;
        lStack_98 = lVar7;
        uStack_88 = CONCAT17(-(-1 < lVar12),
                             CONCAT16(-(-1 < (char)((ulong)lVar12 >> 0x30)),
                                      CONCAT15(-(-1 < (char)((ulong)lVar12 >> 0x28)),
                                               CONCAT14(-(-1 < (char)((ulong)lVar12 >> 0x20)),
                                                        CONCAT13(-(-1 < (char)((ulong)lVar12 >> 0x18
                                                                              )),
                                                                 CONCAT12(-(-1 < (char)((ulong)
                                                  lVar12 >> 0x10)),
                                                  CONCAT11(-(-1 < (char)((ulong)lVar12 >> 8)),
                                                           -(-1 < (char)lVar12)))))))) &
                    0x8080808080808080;
        lStack_68 = lVar3;
        func_0x0055a688(&uStack_c0,&uStack_a8,&UNK_009f16d8);
      }
      puVar11[1] = uStack_b8;
      *puVar11 = uStack_c0;
      puVar11[2] = uStack_b0;
      lVar9 = lVar9 + 1;
      puVar11 = puVar11 + 3;
      lVar8 = lVar8 + 4;
      uVar10 = uVar10 - 1;
    } while (uVar10 != 0);
  }
  *plVar1 = lVar9;
  return;
}

