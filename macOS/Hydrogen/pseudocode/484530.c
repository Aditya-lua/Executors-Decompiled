
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00484530(long param_1,undefined8 param_2,long param_3)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  undefined4 uVar4;
  uint uVar5;
  code *pcVar6;
  undefined8 *puVar7;
  long in_x9;
  long lVar8;
  int in_w10;
  byte bVar9;
  ulong uVar10;
  ulong uVar11;
  long *unaff_x21;
  long unaff_x23;
  byte bVar12;
  undefined8 uVar13;
  undefined8 uStack00000000000000e8;
  long in_stack_000000f0;
  long in_stack_000000f8;
  undefined8 uStack0000000000000100;
  undefined8 *in_stack_00000108;
  long in_stack_00000110;
  undefined8 uStack0000000000000118;
  undefined8 in_stack_00000380;
  uint7 in_stack_000003a1;
  undefined1 auStack_7ffffffe [2147483646];
  
  if (in_w10 == 1) {
    uVar5 = *(byte *)(in_x9 + 2) - 0x17;
    if (uVar5 < 0x3a && (1L << ((ulong)uVar5 & 0x3f) & 0x3e0005e000003ffU) != 0) goto LAB_0047e2c8;
  }
  else if (*(char *)(in_x9 + 1) == 'C') goto LAB_0047e2c8;
  param_1 = param_1 + 1;
  if (param_1 == param_3) {
    puVar7 = (undefined8 *)func_0x00187bd0(0x1e,1);
    lVar8 = in_stack_000000f8;
    uVar13 = _UNK_0089ead6;
    if (puVar7 != (undefined8 *)0x0) {
      puVar7[1] = CONCAT26(_UNK_0089eae4,_UNK_0089eade);
      *puVar7 = uVar13;
      uVar13 = CONCAT62(_UNK_0089eae6,_UNK_0089eae4);
      *(undefined8 *)((long)puVar7 + 0x16) = _UNK_0089eaec;
      *(undefined8 *)((long)puVar7 + 0xe) = uVar13;
      if (in_stack_000000f8 == uStack00000000000000e8) {
        func_0x005bd0a4(&uStack00000000000000e8,&UNK_009e1f38);
      }
      _memcpy(in_stack_000000f0 + lVar8 * 0x108,auStack_7ffffffe + 0x8000037e,0x108);
      in_stack_000000f8 = lVar8 + 1;
LAB_0047e2c8:
      unaff_x21[1] = in_stack_000000f0;
      *unaff_x21 = uStack00000000000000e8;
      unaff_x21[2] = in_stack_000000f8;
      unaff_x21[4] = (long)in_stack_00000108;
      unaff_x21[3] = uStack0000000000000100;
      unaff_x21[5] = in_stack_00000110;
      if (uStack0000000000000118 != 0xc) {
        func_0x0047a214(&uStack0000000000000118);
      }
      return;
    }
    func_0x007a1f00(1,0x1e,&UNK_009e10b0);
  }
  else {
    if (*(long *)(unaff_x23 + 0xd8) != 0) {
      lVar8 = 0;
      lVar2 = *(long *)(unaff_x23 + 0xc0);
      uVar3 = *(ulong *)(unaff_x23 + 200);
      bVar9 = (byte)((ulong)(param_1 * 0x517cc1b727220a95) >> 0x39);
      uVar10 = param_1 * 0x517cc1b727220a95 & uVar3;
      uVar13 = *(undefined8 *)(lVar2 + uVar10);
      uVar1 = CONCAT17(-((byte)((ulong)uVar13 >> 0x38) == bVar9),
                       CONCAT16(-((byte)((ulong)uVar13 >> 0x30) == bVar9),
                                CONCAT15(-((byte)((ulong)uVar13 >> 0x28) == bVar9),
                                         CONCAT14(-((byte)((ulong)uVar13 >> 0x20) == bVar9),
                                                  CONCAT13(-((byte)((ulong)uVar13 >> 0x18) == bVar9)
                                                           ,CONCAT12(-((byte)((ulong)uVar13 >> 0x10)
                                                                      == bVar9),
                                                                     CONCAT11(-((byte)((ulong)uVar13
                                                                                      >> 8) == bVar9
                                                                               ),-((byte)uVar13 ==
                                                                                  bVar9)))))))) &
              0x8080808080808080;
      while( true ) {
        for (; uVar1 != 0; uVar1 = uVar1 - 1 & uVar1) {
          uVar11 = (uVar1 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar1 >> 7 & 0xff00ff00ff00ff) << 8;
          uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
          uVar11 = uVar10 + ((ulong)LZCOUNT(uVar11 >> 0x20 | uVar11 << 0x20) >> 3) & uVar3;
          if (param_1 == *(long *)(lVar2 + -0x10 + uVar11 * -0x10)) {
            uVar4 = *(undefined4 *)(lVar2 + uVar11 * -0x10 + -8);
            if (uStack0000000000000100 == 0) {
              func_0x005832d0(&uStack0000000000000100,&UNK_009e1f20);
            }
            in_stack_00000108[1] = 0;
            *in_stack_00000108 = CONCAT44((int)((ulong)in_stack_00000380 >> 0x20),uVar4);
            in_stack_00000108[3] = 0;
            in_stack_00000108[2] = 8;
            in_stack_00000108[4] = (ulong)in_stack_000003a1 << 8;
            in_stack_00000110 = 1;
            goto LAB_0047e2c8;
          }
        }
        bVar12 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar13 >> 0x38) == -1),
                                     CONCAT16(-((char)((ulong)uVar13 >> 0x30) == -1),
                                              CONCAT15(-((char)((ulong)uVar13 >> 0x28) == -1),
                                                       CONCAT14(-((char)((ulong)uVar13 >> 0x20) ==
                                                                 -1),CONCAT13(-((char)((ulong)uVar13
                                                                                      >> 0x18) == -1
                                                                               ),CONCAT12(-((char)((
                                                  ulong)uVar13 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar13 >> 8) == -1),
                                                           -((char)uVar13 == -1)))))))),1);
        if ((bVar12 & 1) != 0) break;
        lVar8 = lVar8 + 8;
        uVar10 = uVar10 + lVar8 & uVar3;
        uVar13 = *(undefined8 *)(lVar2 + uVar10);
        uVar1 = CONCAT17(-((byte)((ulong)uVar13 >> 0x38) == bVar9),
                         CONCAT16(-((byte)((ulong)uVar13 >> 0x30) == bVar9),
                                  CONCAT15(-((byte)((ulong)uVar13 >> 0x28) == bVar9),
                                           CONCAT14(-((byte)((ulong)uVar13 >> 0x20) == bVar9),
                                                    CONCAT13(-((byte)((ulong)uVar13 >> 0x18) ==
                                                              bVar9),CONCAT12(-((byte)((ulong)uVar13
                                                                                      >> 0x10) ==
                                                                               bVar9),CONCAT11(-((
                                                  byte)((ulong)uVar13 >> 8) == bVar9),
                                                  -((byte)uVar13 == bVar9)))))))) &
                0x8080808080808080;
      }
    }
    func_0x007a23bc(&UNK_009e1fc8);
  }
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x4851b4);
  (*pcVar6)();
}

