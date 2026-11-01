
undefined8 FUN_004bf804(undefined8 param_1)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  byte bVar7;
  ulong uVar8;
  long unaff_x23;
  byte bVar9;
  undefined8 uVar10;
  undefined1 auVar11 [16];
  long in_stack_00000010;
  
  if (unaff_x23 != 0) {
    func_0x00187bd4();
    param_1 = __Unwind_Resume(param_1);
    if (in_stack_00000010 != 0) goto LAB_004bf8b4;
  }
  __Unwind_Resume(param_1);
LAB_004bf8b4:
  func_0x00187bd4();
  __Unwind_Resume(param_1);
  auVar11 = func_0x007a2668();
  lVar5 = auVar11._0_8_;
  if (*(long *)(lVar5 + 0xa8) != 0) {
    lVar6 = 0;
    uVar8 = (auVar11._8_8_ & 0xffffffff) * 0x517cc1b727220a95;
    lVar1 = *(long *)(lVar5 + 0x90);
    uVar2 = *(ulong *)(lVar5 + 0x98);
    bVar7 = (byte)(uVar8 >> 0x39);
    uVar8 = uVar8 & uVar2;
    uVar10 = *(undefined8 *)(lVar1 + uVar8);
    uVar4 = CONCAT17(-((byte)((ulong)uVar10 >> 0x38) == bVar7),
                     CONCAT16(-((byte)((ulong)uVar10 >> 0x30) == bVar7),
                              CONCAT15(-((byte)((ulong)uVar10 >> 0x28) == bVar7),
                                       CONCAT14(-((byte)((ulong)uVar10 >> 0x20) == bVar7),
                                                CONCAT13(-((byte)((ulong)uVar10 >> 0x18) == bVar7),
                                                         CONCAT12(-((byte)((ulong)uVar10 >> 0x10) ==
                                                                   bVar7),CONCAT11(-((byte)((ulong)
                                                  uVar10 >> 8) == bVar7),-((byte)uVar10 == bVar7))))
                                               ))));
    while( true ) {
      for (uVar4 = uVar4 & 0x8080808080808080; uVar4 != 0; uVar4 = uVar4 - 1 & uVar4) {
        uVar3 = (uVar4 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar4 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
        if (auVar11._8_4_ ==
            *(int *)(lVar1 + -4 +
                    (uVar8 + ((ulong)LZCOUNT(uVar3 >> 0x20 | uVar3 << 0x20) >> 3) & uVar2) * -4)) {
          return 1;
        }
      }
      bVar9 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar10 >> 0x38) == -1),
                                  CONCAT16(-((char)((ulong)uVar10 >> 0x30) == -1),
                                           CONCAT15(-((char)((ulong)uVar10 >> 0x28) == -1),
                                                    CONCAT14(-((char)((ulong)uVar10 >> 0x20) == -1),
                                                             CONCAT13(-((char)((ulong)uVar10 >> 0x18
                                                                              ) == -1),
                                                                      CONCAT12(-((char)((ulong)
                                                  uVar10 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar10 >> 8) == -1),
                                                           -((char)uVar10 == -1)))))))),1);
      if ((bVar9 & 1) != 0) break;
      lVar6 = lVar6 + 8;
      uVar8 = uVar8 + lVar6 & uVar2;
      uVar10 = *(undefined8 *)(lVar1 + uVar8);
      uVar4 = CONCAT17(-((byte)((ulong)uVar10 >> 0x38) == bVar7),
                       CONCAT16(-((byte)((ulong)uVar10 >> 0x30) == bVar7),
                                CONCAT15(-((byte)((ulong)uVar10 >> 0x28) == bVar7),
                                         CONCAT14(-((byte)((ulong)uVar10 >> 0x20) == bVar7),
                                                  CONCAT13(-((byte)((ulong)uVar10 >> 0x18) == bVar7)
                                                           ,CONCAT12(-((byte)((ulong)uVar10 >> 0x10)
                                                                      == bVar7),
                                                                     CONCAT11(-((byte)((ulong)uVar10
                                                                                      >> 8) == bVar7
                                                                               ),-((byte)uVar10 ==
                                                                                  bVar7))))))));
    }
  }
  return 0;
}

