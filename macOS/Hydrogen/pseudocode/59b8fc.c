
void FUN_0059b8fc(long param_1,undefined1 param_2 [16],undefined8 param_3,ulong param_4)

{
  ulong uVar1;
  long in_x9;
  ulong in_x10;
  byte bVar2;
  long in_x11;
  ulong in_x12;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long *unaff_x22;
  int unaff_w23;
  bool bVar3;
  int unaff_w25;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  byte bVar7;
  byte bVar8;
  byte bVar9;
  byte bVar10;
  byte bVar11;
  long in_stack_00000000;
  long in_stack_00000008;
  undefined8 uStack0000000000000018;
  
  bVar10 = param_2[7];
  bVar9 = param_2[6];
  bVar8 = param_2[5];
  bVar7 = param_2[4];
  bVar6 = param_2[3];
  bVar5 = param_2[2];
  bVar4 = param_2[1];
  bVar2 = param_2[0];
  do {
    param_4 = param_4 & 0x8080808080808080;
    if (param_4 != 0) goto LAB_0059b8a8;
LAB_0059b8d4:
    bVar11 = NEON_umaxv(CONCAT17(-((char)((ulong)param_3 >> 0x38) == -1),
                                 CONCAT16(-((char)((ulong)param_3 >> 0x30) == -1),
                                          CONCAT15(-((char)((ulong)param_3 >> 0x28) == -1),
                                                   CONCAT14(-((char)((ulong)param_3 >> 0x20) == -1),
                                                            CONCAT13(-((char)((ulong)param_3 >> 0x18
                                                                             ) == -1),
                                                                     CONCAT12(-((char)((ulong)
                                                  param_3 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)param_3 >> 8) == -1),
                                                           -((char)param_3 == -1)))))))),1);
    if ((bVar11 & 1) != 0) {
      do {
        bVar3 = false;
        while( true ) {
          if (unaff_x20 == in_stack_00000000) {
            func_0x007af5a0();
            unaff_x21 = in_stack_00000008;
          }
          *(int *)(unaff_x21 + unaff_x20 * 4) = unaff_w23;
          unaff_x20 = unaff_x20 + 1;
          if (!bVar3) {
            *unaff_x19 = in_stack_00000000;
            unaff_x19[1] = in_stack_00000008;
            unaff_x19[2] = unaff_x20;
            return;
          }
          unaff_w23 = unaff_w25;
          uStack0000000000000018._4_4_ = unaff_w25;
          if (unaff_w25 == (int)unaff_x22[6] || unaff_x22[3] == 0) break;
          uVar1 = func_0x005763e4(unaff_x22 + 4,(long)&uStack0000000000000018 + 4);
          param_1 = 0;
          in_x9 = *unaff_x22;
          in_x10 = unaff_x22[1];
          bVar2 = (byte)(uVar1 >> 0x39);
          in_x11 = in_x9 + -8;
          in_x12 = uVar1 & in_x10;
          param_3 = *(undefined8 *)(in_x9 + in_x12);
          param_4 = CONCAT17(-((byte)((ulong)param_3 >> 0x38) == bVar2),
                             CONCAT16(-((byte)((ulong)param_3 >> 0x30) == bVar2),
                                      CONCAT15(-((byte)((ulong)param_3 >> 0x28) == bVar2),
                                               CONCAT14(-((byte)((ulong)param_3 >> 0x20) == bVar2),
                                                        CONCAT13(-((byte)((ulong)param_3 >> 0x18) ==
                                                                  bVar2),CONCAT12(-((byte)((ulong)
                                                  param_3 >> 0x10) == bVar2),
                                                  CONCAT11(-((byte)((ulong)param_3 >> 8) == bVar2),
                                                           -((byte)param_3 == bVar2)))))))) &
                    0x8080808080808080;
          bVar4 = bVar2;
          bVar5 = bVar2;
          bVar6 = bVar2;
          bVar7 = bVar2;
          bVar8 = bVar2;
          bVar9 = bVar2;
          bVar10 = bVar2;
          while( true ) {
            if (param_4 == 0) goto LAB_0059b8d4;
LAB_0059b8a8:
            uVar1 = (param_4 >> 7 & 0xff00ff00ff00ff00) >> 8 |
                    (param_4 >> 7 & 0xff00ff00ff00ff) << 8;
            uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
            uVar1 = in_x12 + ((ulong)LZCOUNT(uVar1 >> 0x20 | uVar1 << 0x20) >> 3) & in_x10;
            if (unaff_w23 == *(int *)(in_x11 + uVar1 * -8)) break;
            param_4 = param_4 - 1 & param_4;
          }
          unaff_w25 = *(int *)(in_x9 + uVar1 * -8 + -4);
          bVar3 = true;
        }
      } while( true );
    }
    param_1 = param_1 + 8;
    in_x12 = in_x12 + param_1 & in_x10;
    param_3 = *(undefined8 *)(in_x9 + in_x12);
    param_4 = CONCAT17(-((byte)((ulong)param_3 >> 0x38) == bVar10),
                       CONCAT16(-((byte)((ulong)param_3 >> 0x30) == bVar9),
                                CONCAT15(-((byte)((ulong)param_3 >> 0x28) == bVar8),
                                         CONCAT14(-((byte)((ulong)param_3 >> 0x20) == bVar7),
                                                  CONCAT13(-((byte)((ulong)param_3 >> 0x18) == bVar6
                                                            ),CONCAT12(-((byte)((ulong)param_3 >>
                                                                               0x10) == bVar5),
                                                                       CONCAT11(-((byte)((ulong)
                                                  param_3 >> 8) == bVar4),-((byte)param_3 == bVar2))
                                                  ))))));
  } while( true );
}

