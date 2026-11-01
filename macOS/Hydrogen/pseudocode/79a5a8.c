
undefined8 FUN_0079a5a8(long *param_1,ulong param_2)

{
  char cVar1;
  ulong uVar2;
  byte bVar3;
  undefined8 uVar4;
  ulong in_x9;
  ulong in_x10;
  ulong uVar5;
  ulong in_x13;
  long *unaff_x19;
  ulong unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  ulong unaff_x26;
  undefined8 *unaff_x27;
  long unaff_x28;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  
code_r0x0079a5a8:
  uVar5 = in_x10;
  do {
    uVar2 = (in_x13 & 0xaaaaaaaaaaaaaaaa) >> 1 | (in_x13 & 0x5555555555555555) << 1;
    uVar2 = (uVar2 & 0xcccccccccccccccc) >> 2 | (uVar2 & 0x3333333333333333) << 2;
    uVar2 = (uVar2 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar2 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar2 = (uVar2 & 0xff00ff00ff00ff00) >> 8 | (uVar2 & 0xff00ff00ff00ff) << 8;
    uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
    uVar5 = uVar5 + ((ulong)LZCOUNT(uVar2 >> 0x20 | uVar2 << 0x20) >> 3) & in_x9;
    bVar3 = (byte)(param_2 >> 0x38);
    if (*(char *)((long)param_1 + uVar5) < '\0') {
      if (7 < ((uVar5 - in_x10 ^ unaff_x26 - in_x10) & in_x9)) goto LAB_0079a5dc;
LAB_0079a6c8:
      *(byte *)((long)param_1 + unaff_x26) = bVar3 >> 1;
      *(byte *)(*unaff_x19 + (in_x9 & unaff_x26 - 8) + 8) = bVar3 >> 1;
LAB_0079a6e4:
      do {
        unaff_x26 = unaff_x22;
        if (unaff_x21 <= unaff_x26) {
          uVar5 = unaff_x19[1];
          if (7 < uVar5) {
            uVar5 = (uVar5 + 1 >> 3) * 7;
          }
          unaff_x19[2] = uVar5 - unaff_x19[3];
          return 0x8000000000000001;
        }
        unaff_x22 = unaff_x26 + 1;
      } while (*(char *)(*unaff_x19 + unaff_x26) != -0x80);
      unaff_x28 = *unaff_x19 + unaff_x26 * unaff_x23;
      unaff_x27 = (undefined8 *)(unaff_x28 + -0x30);
    }
    else {
      lVar6 = *param_1;
      uVar5 = CONCAT17(-(lVar6 < 0),
                       CONCAT16(-((char)((ulong)lVar6 >> 0x30) < '\0'),
                                CONCAT15(-((char)((ulong)lVar6 >> 0x28) < '\0'),
                                         CONCAT14(-((char)((ulong)lVar6 >> 0x20) < '\0'),
                                                  CONCAT13(-((char)((ulong)lVar6 >> 0x18) < '\0'),
                                                           CONCAT12(-((char)((ulong)lVar6 >> 0x10) <
                                                                     '\0'),CONCAT11(-((char)((ulong)
                                                  lVar6 >> 8) < '\0'),-((char)lVar6 < '\0'))))))));
      uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
      uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
      uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
      uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
      uVar5 = (ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3;
      if (((uVar5 - in_x10 ^ unaff_x26 - in_x10) & in_x9) < 8) goto LAB_0079a6c8;
LAB_0079a5dc:
      lVar6 = uVar5 * unaff_x23;
      cVar1 = *(char *)((long)param_1 + uVar5);
      *(byte *)((long)param_1 + uVar5) = bVar3 >> 1;
      *(byte *)(*unaff_x19 + (uVar5 - 8 & in_x9) + 8) = bVar3 >> 1;
      if (cVar1 == -1) {
        uVar5 = unaff_x19[1];
        *(undefined1 *)(*unaff_x19 + unaff_x26) = 0xff;
        *(undefined1 *)(*unaff_x19 + (uVar5 & unaff_x26 - 8) + 8) = 0xff;
        uVar8 = unaff_x27[1];
        uVar4 = *unaff_x27;
        uVar9 = unaff_x27[2];
        uVar11 = unaff_x27[5];
        uVar10 = unaff_x27[4];
        *(undefined8 *)((long)param_1 + lVar6 + -0x18) = unaff_x27[3];
        *(undefined8 *)((long)param_1 + lVar6 + -0x20) = uVar9;
        *(undefined8 *)((long)param_1 + lVar6 + -8) = uVar11;
        *(undefined8 *)((long)param_1 + lVar6 + -0x10) = uVar10;
        *(undefined8 *)((long)param_1 + lVar6 + -0x28) = uVar8;
        *(undefined8 *)((long)param_1 + lVar6 + -0x30) = uVar4;
        goto LAB_0079a6e4;
      }
      uVar4 = *(undefined8 *)(unaff_x28 + -0x30);
      *(undefined8 *)(unaff_x28 + -0x30) = *(undefined8 *)((long)param_1 + lVar6 + -0x30);
      *(undefined8 *)((long)param_1 + lVar6 + -0x30) = uVar4;
      uVar4 = *(undefined8 *)(unaff_x28 + -0x28);
      *(undefined8 *)(unaff_x28 + -0x28) = *(undefined8 *)((long)param_1 + lVar6 + -0x28);
      *(undefined8 *)((long)param_1 + lVar6 + -0x28) = uVar4;
      uVar4 = *(undefined8 *)(unaff_x28 + -0x20);
      *(undefined8 *)(unaff_x28 + -0x20) = *(undefined8 *)((long)param_1 + lVar6 + -0x20);
      *(undefined8 *)((long)param_1 + lVar6 + -0x20) = uVar4;
      uVar4 = *(undefined8 *)(unaff_x28 + -0x18);
      *(undefined8 *)(unaff_x28 + -0x18) = *(undefined8 *)((long)param_1 + lVar6 + -0x18);
      *(undefined8 *)((long)param_1 + lVar6 + -0x18) = uVar4;
      uVar4 = *(undefined8 *)(unaff_x28 + -0x10);
      *(undefined8 *)(unaff_x28 + -0x10) = *(undefined8 *)((long)param_1 + lVar6 + -0x10);
      *(undefined8 *)((long)param_1 + lVar6 + -0x10) = uVar4;
      uVar4 = *(undefined8 *)(unaff_x28 + -8);
      *(undefined8 *)(unaff_x28 + -8) = *(undefined8 *)((long)param_1 + lVar6 + -8);
      *(undefined8 *)((long)param_1 + lVar6 + -8) = uVar4;
    }
    param_2 = func_0x00192570();
    param_1 = (long *)*unaff_x19;
    in_x9 = unaff_x19[1];
    in_x10 = in_x9 & param_2;
    lVar6 = *(long *)((long)param_1 + in_x10);
    in_x13 = CONCAT17(-(lVar6 < 0),
                      CONCAT16(-((char)((ulong)lVar6 >> 0x30) < '\0'),
                               CONCAT15(-((char)((ulong)lVar6 >> 0x28) < '\0'),
                                        CONCAT14(-((char)((ulong)lVar6 >> 0x20) < '\0'),
                                                 CONCAT13(-((char)((ulong)lVar6 >> 0x18) < '\0'),
                                                          CONCAT12(-((char)((ulong)lVar6 >> 0x10) <
                                                                    '\0'),CONCAT11(-((char)((ulong)
                                                  lVar6 >> 8) < '\0'),-((char)lVar6 < '\0'))))))));
    if (in_x13 != 0) goto code_r0x0079a5a8;
    lVar6 = 8;
    uVar5 = in_x10;
    do {
      uVar5 = uVar5 + lVar6 & in_x9;
      lVar7 = *(long *)((long)param_1 + uVar5);
      in_x13 = CONCAT17(-(lVar7 < 0),
                        CONCAT16(-((char)((ulong)lVar7 >> 0x30) < '\0'),
                                 CONCAT15(-((char)((ulong)lVar7 >> 0x28) < '\0'),
                                          CONCAT14(-((char)((ulong)lVar7 >> 0x20) < '\0'),
                                                   CONCAT13(-((char)((ulong)lVar7 >> 0x18) < '\0'),
                                                            CONCAT12(-((char)((ulong)lVar7 >> 0x10)
                                                                      < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar7 >> 8) < '\0'),-((char)lVar7 < '\0'))))
                                                  ))));
      lVar6 = lVar6 + 8;
    } while (in_x13 == 0);
  } while( true );
}

