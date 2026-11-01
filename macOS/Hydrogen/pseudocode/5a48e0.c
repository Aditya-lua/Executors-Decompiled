
void FUN_005a48e0(void)

{
  undefined1 auVar1 [16];
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  bool bVar5;
  int in_w8;
  ulong uVar6;
  ulong uVar7;
  ulong *puVar8;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x24;
  long unaff_x29;
  undefined1 uVar9;
  undefined1 uVar10;
  undefined1 uVar11;
  undefined1 uVar12;
  undefined1 uVar13;
  undefined1 uVar14;
  long lVar15;
  undefined1 auVar16 [16];
  long lVar17;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined4 uStack0000000000000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000040;
  long in_stack_00000048;
  long in_stack_00000050;
  long in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  uint in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined1 uStack0000000000000088;
  undefined7 uStack0000000000000089;
  long in_stack_000000c0;
  long in_stack_000000c8;
  
  do {
    uVar9 = (undefined1)((uint7)uStack0000000000000089 >> 8);
    uVar10 = (undefined1)((uint7)uStack0000000000000089 >> 0x10);
    uVar11 = (undefined1)((uint7)uStack0000000000000089 >> 0x18);
    uVar12 = (undefined1)((uint7)uStack0000000000000089 >> 0x20);
    uVar13 = (undefined1)((uint7)uStack0000000000000089 >> 0x28);
    uVar14 = (undefined1)((uint7)uStack0000000000000089 >> 0x30);
    if (in_w8 == 1) {
      uVar7 = 0;
      if (in_stack_00000028 != 0) {
        uVar7 = (ulong)(in_stack_00000040 - in_stack_00000030) >> 3;
      }
      uVar6 = 0;
      if (in_stack_00000048 != 0) {
        uVar6 = (ulong)(in_stack_00000060 - in_stack_00000050) >> 3;
      }
      uVar6 = uVar6 + uVar7;
      bVar5 = in_stack_00000068 == 0 || in_stack_00000070 == in_stack_00000068;
      if ((in_stack_00000078 & 1) == 0) {
LAB_005a49c8:
        uVar7 = (ulong)bVar5;
        puVar8 = (ulong *)(unaff_x29 + -0x58);
      }
      else {
        auVar1[8] = uStack0000000000000088;
        auVar1._0_8_ = in_stack_00000080;
        auVar1[9] = (char)uStack0000000000000089;
        auVar1[10] = uVar9;
        auVar1[0xb] = uVar10;
        auVar1[0xc] = uVar11;
        auVar1[0xd] = uVar12;
        auVar1[0xe] = uVar13;
        auVar1[0xf] = uVar14;
        auVar16 = NEON_ext(*(undefined1 (*) [16])(unaff_x22 + 0x78),auVar1,8,1);
        lVar15 = -(ulong)(auVar16._0_8_ == 0);
        lVar17 = -(ulong)(auVar16._8_8_ == 0);
        uVar7 = *(long *)(unaff_x24 + 0x98) - *(long *)(unaff_x24 + 0x88);
        uVar3 = *(long *)*(undefined1 (*) [16])(unaff_x22 + 0x78) -
                CONCAT71(uStack0000000000000089,uStack0000000000000088);
        uVar2 = uVar7 >> 3;
        uVar4 = uVar3 >> 3;
        uVar6 = CONCAT17((byte)(uVar7 >> 0x3b) & ~(byte)((ulong)lVar15 >> 0x38),
                         CONCAT16((byte)(uVar2 >> 0x30) & ~(byte)((ulong)lVar15 >> 0x30),
                                  CONCAT15((byte)(uVar2 >> 0x28) & ~(byte)((ulong)lVar15 >> 0x28),
                                           CONCAT14((byte)(uVar2 >> 0x20) &
                                                    ~(byte)((ulong)lVar15 >> 0x20),
                                                    CONCAT13((byte)(uVar2 >> 0x18) &
                                                             ~(byte)((ulong)lVar15 >> 0x18),
                                                             CONCAT12((byte)(uVar2 >> 0x10) &
                                                                      ~(byte)((ulong)lVar15 >> 0x10)
                                                                      ,CONCAT11((byte)(uVar2 >> 8) &
                                                                                ~(byte)((ulong)
                                                  lVar15 >> 8),(byte)uVar2 & ~(byte)lVar15))))))) +
                CONCAT17((byte)(uVar3 >> 0x3b) & ~(byte)((ulong)lVar17 >> 0x38),
                         CONCAT16((byte)(uVar4 >> 0x30) & ~(byte)((ulong)lVar17 >> 0x30),
                                  CONCAT15((byte)(uVar4 >> 0x28) & ~(byte)((ulong)lVar17 >> 0x28),
                                           CONCAT14((byte)(uVar4 >> 0x20) &
                                                    ~(byte)((ulong)lVar17 >> 0x20),
                                                    CONCAT13((byte)(uVar4 >> 0x18) &
                                                             ~(byte)((ulong)lVar17 >> 0x18),
                                                             CONCAT12((byte)(uVar4 >> 0x10) &
                                                                      ~(byte)((ulong)lVar17 >> 0x10)
                                                                      ,CONCAT11((byte)(uVar4 >> 8) &
                                                                                ~(byte)((ulong)
                                                  lVar17 >> 8),(byte)uVar4 & ~(byte)lVar17))))))) +
                uVar6;
        puVar8 = (ulong *)(unaff_x29 + -0x60);
        uVar7 = uVar6;
      }
    }
    else {
      if ((in_stack_00000078 & 1) != 0) {
        auVar16[8] = uStack0000000000000088;
        auVar16._0_8_ = in_stack_00000080;
        auVar16[9] = (char)uStack0000000000000089;
        auVar16[10] = uVar9;
        auVar16[0xb] = uVar10;
        auVar16[0xc] = uVar11;
        auVar16[0xd] = uVar12;
        auVar16[0xe] = uVar13;
        auVar16[0xf] = uVar14;
        auVar16 = NEON_ext(*(undefined1 (*) [16])(unaff_x22 + 0x78),auVar16,8,1);
        lVar15 = -(ulong)(auVar16._0_8_ == 0);
        lVar17 = -(ulong)(auVar16._8_8_ == 0);
        uVar6 = *(long *)(unaff_x24 + 0x98) - *(long *)(unaff_x24 + 0x88);
        uVar2 = *(long *)*(undefined1 (*) [16])(unaff_x22 + 0x78) -
                CONCAT71(uStack0000000000000089,uStack0000000000000088);
        uVar7 = uVar6 >> 3;
        uVar3 = uVar2 >> 3;
        uVar6 = CONCAT17((byte)(uVar6 >> 0x3b) & ~(byte)((ulong)lVar15 >> 0x38),
                         CONCAT16((byte)(uVar7 >> 0x30) & ~(byte)((ulong)lVar15 >> 0x30),
                                  CONCAT15((byte)(uVar7 >> 0x28) & ~(byte)((ulong)lVar15 >> 0x28),
                                           CONCAT14((byte)(uVar7 >> 0x20) &
                                                    ~(byte)((ulong)lVar15 >> 0x20),
                                                    CONCAT13((byte)(uVar7 >> 0x18) &
                                                             ~(byte)((ulong)lVar15 >> 0x18),
                                                             CONCAT12((byte)(uVar7 >> 0x10) &
                                                                      ~(byte)((ulong)lVar15 >> 0x10)
                                                                      ,CONCAT11((byte)(uVar7 >> 8) &
                                                                                ~(byte)((ulong)
                                                  lVar15 >> 8),(byte)uVar7 & ~(byte)lVar15))))))) +
                CONCAT17((byte)(uVar2 >> 0x3b) & ~(byte)((ulong)lVar17 >> 0x38),
                         CONCAT16((byte)(uVar3 >> 0x30) & ~(byte)((ulong)lVar17 >> 0x30),
                                  CONCAT15((byte)(uVar3 >> 0x28) & ~(byte)((ulong)lVar17 >> 0x28),
                                           CONCAT14((byte)(uVar3 >> 0x20) &
                                                    ~(byte)((ulong)lVar17 >> 0x20),
                                                    CONCAT13((byte)(uVar3 >> 0x18) &
                                                             ~(byte)((ulong)lVar17 >> 0x18),
                                                             CONCAT12((byte)(uVar3 >> 0x10) &
                                                                      ~(byte)((ulong)lVar17 >> 0x10)
                                                                      ,CONCAT11((byte)(uVar3 >> 8) &
                                                                                ~(byte)((ulong)
                                                  lVar17 >> 8),(byte)uVar3 & ~(byte)lVar17)))))));
        bVar5 = in_stack_000000c0 == 0 || in_stack_000000c8 == in_stack_000000c0;
        goto LAB_005a49c8;
      }
      uVar6 = 0;
      uVar7 = 0;
      puVar8 = (ulong *)(unaff_x29 + -0x60);
    }
    *puVar8 = uVar7;
    func_0x007af5a0(&uStack0000000000000008,unaff_x21,uVar6 + 1,8,8);
    lVar15 = in_stack_00000010;
    do {
      *(long *)(lVar15 + unaff_x21 * 8) = unaff_x20;
      unaff_x21 = unaff_x21 + 1;
      in_stack_00000018 = unaff_x21;
      unaff_x20 = func_0x0059c000(&uStack0000000000000020);
      if (unaff_x20 == 0) {
        func_0x0059e05c(&uStack0000000000000020);
        unaff_x19[1] = in_stack_00000010;
        *unaff_x19 = uStack0000000000000008;
        unaff_x19[2] = in_stack_00000018;
        return;
      }
    } while (unaff_x21 != uStack0000000000000008);
    in_w8 = uStack0000000000000020;
  } while( true );
}

