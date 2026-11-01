
void FUN_002ea368(undefined1 param_1 [16],undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],long param_5,long param_6,long param_7)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  
  *(long *)(param_5 + 0x88) = param_1._8_8_;
  *(long *)(param_5 + 0x80) = param_1._0_8_;
  *(long *)(param_5 + 0x98) = param_2._8_8_;
  *(long *)(param_5 + 0x90) = param_2._0_8_;
  *(long *)(param_5 + 0xa8) = param_3._8_8_;
  *(long *)(param_5 + 0xa0) = param_3._0_8_;
  *(long *)(param_5 + 0xb8) = param_4._8_8_;
  *(long *)(param_5 + 0xb0) = param_4._0_8_;
  uVar2 = *(undefined8 *)(param_6 + 200);
  uVar1 = *(undefined8 *)(param_6 + 0xc0);
  uVar4 = *(undefined8 *)(param_6 + 0xd8);
  uVar3 = *(undefined8 *)(param_6 + 0xd0);
  uVar6 = *(undefined8 *)(param_6 + 0xe8);
  uVar5 = *(undefined8 *)(param_6 + 0xe0);
  uVar8 = *(undefined8 *)(param_6 + 0xf8);
  uVar7 = *(undefined8 *)(param_6 + 0xf0);
  uVar10 = *(undefined8 *)(param_7 + 200);
  uVar9 = *(undefined8 *)(param_7 + 0xc0);
  uVar12 = *(undefined8 *)(param_7 + 0xd8);
  uVar11 = *(undefined8 *)(param_7 + 0xd0);
  uVar14 = *(undefined8 *)(param_7 + 0xe8);
  uVar13 = *(undefined8 *)(param_7 + 0xe0);
  uVar16 = *(undefined8 *)(param_7 + 0xf8);
  uVar15 = *(undefined8 *)(param_7 + 0xf0);
  *(ulong *)(param_5 + 200) =
       CONCAT26((short)((ulong)uVar2 >> 0x30) - (short)((ulong)uVar10 >> 0x30),
                CONCAT24((short)((ulong)uVar2 >> 0x20) - (short)((ulong)uVar10 >> 0x20),
                         CONCAT22((short)((ulong)uVar2 >> 0x10) - (short)((ulong)uVar10 >> 0x10),
                                  (short)uVar2 - (short)uVar10)));
  *(ulong *)(param_5 + 0xc0) =
       CONCAT26((short)((ulong)uVar1 >> 0x30) - (short)((ulong)uVar9 >> 0x30),
                CONCAT24((short)((ulong)uVar1 >> 0x20) - (short)((ulong)uVar9 >> 0x20),
                         CONCAT22((short)((ulong)uVar1 >> 0x10) - (short)((ulong)uVar9 >> 0x10),
                                  (short)uVar1 - (short)uVar9)));
  *(ulong *)(param_5 + 0xd8) =
       CONCAT26((short)((ulong)uVar4 >> 0x30) - (short)((ulong)uVar12 >> 0x30),
                CONCAT24((short)((ulong)uVar4 >> 0x20) - (short)((ulong)uVar12 >> 0x20),
                         CONCAT22((short)((ulong)uVar4 >> 0x10) - (short)((ulong)uVar12 >> 0x10),
                                  (short)uVar4 - (short)uVar12)));
  *(ulong *)(param_5 + 0xd0) =
       CONCAT26((short)((ulong)uVar3 >> 0x30) - (short)((ulong)uVar11 >> 0x30),
                CONCAT24((short)((ulong)uVar3 >> 0x20) - (short)((ulong)uVar11 >> 0x20),
                         CONCAT22((short)((ulong)uVar3 >> 0x10) - (short)((ulong)uVar11 >> 0x10),
                                  (short)uVar3 - (short)uVar11)));
  *(ulong *)(param_5 + 0xe8) =
       CONCAT26((short)((ulong)uVar6 >> 0x30) - (short)((ulong)uVar14 >> 0x30),
                CONCAT24((short)((ulong)uVar6 >> 0x20) - (short)((ulong)uVar14 >> 0x20),
                         CONCAT22((short)((ulong)uVar6 >> 0x10) - (short)((ulong)uVar14 >> 0x10),
                                  (short)uVar6 - (short)uVar14)));
  *(ulong *)(param_5 + 0xe0) =
       CONCAT26((short)((ulong)uVar5 >> 0x30) - (short)((ulong)uVar13 >> 0x30),
                CONCAT24((short)((ulong)uVar5 >> 0x20) - (short)((ulong)uVar13 >> 0x20),
                         CONCAT22((short)((ulong)uVar5 >> 0x10) - (short)((ulong)uVar13 >> 0x10),
                                  (short)uVar5 - (short)uVar13)));
  *(ulong *)(param_5 + 0xf8) =
       CONCAT26((short)((ulong)uVar8 >> 0x30) - (short)((ulong)uVar16 >> 0x30),
                CONCAT24((short)((ulong)uVar8 >> 0x20) - (short)((ulong)uVar16 >> 0x20),
                         CONCAT22((short)((ulong)uVar8 >> 0x10) - (short)((ulong)uVar16 >> 0x10),
                                  (short)uVar8 - (short)uVar16)));
  *(ulong *)(param_5 + 0xf0) =
       CONCAT26((short)((ulong)uVar7 >> 0x30) - (short)((ulong)uVar15 >> 0x30),
                CONCAT24((short)((ulong)uVar7 >> 0x20) - (short)((ulong)uVar15 >> 0x20),
                         CONCAT22((short)((ulong)uVar7 >> 0x10) - (short)((ulong)uVar15 >> 0x10),
                                  (short)uVar7 - (short)uVar15)));
  uVar2 = *(undefined8 *)(param_6 + 0x108);
  uVar1 = *(undefined8 *)(param_6 + 0x100);
  uVar4 = *(undefined8 *)(param_6 + 0x118);
  uVar3 = *(undefined8 *)(param_6 + 0x110);
  uVar6 = *(undefined8 *)(param_6 + 0x128);
  uVar5 = *(undefined8 *)(param_6 + 0x120);
  uVar8 = *(undefined8 *)(param_6 + 0x138);
  uVar7 = *(undefined8 *)(param_6 + 0x130);
  uVar10 = *(undefined8 *)(param_7 + 0x108);
  uVar9 = *(undefined8 *)(param_7 + 0x100);
  uVar12 = *(undefined8 *)(param_7 + 0x118);
  uVar11 = *(undefined8 *)(param_7 + 0x110);
  uVar14 = *(undefined8 *)(param_7 + 0x128);
  uVar13 = *(undefined8 *)(param_7 + 0x120);
  uVar16 = *(undefined8 *)(param_7 + 0x138);
  uVar15 = *(undefined8 *)(param_7 + 0x130);
  *(ulong *)(param_5 + 0x108) =
       CONCAT26((short)((ulong)uVar2 >> 0x30) - (short)((ulong)uVar10 >> 0x30),
                CONCAT24((short)((ulong)uVar2 >> 0x20) - (short)((ulong)uVar10 >> 0x20),
                         CONCAT22((short)((ulong)uVar2 >> 0x10) - (short)((ulong)uVar10 >> 0x10),
                                  (short)uVar2 - (short)uVar10)));
  *(ulong *)(param_5 + 0x100) =
       CONCAT26((short)((ulong)uVar1 >> 0x30) - (short)((ulong)uVar9 >> 0x30),
                CONCAT24((short)((ulong)uVar1 >> 0x20) - (short)((ulong)uVar9 >> 0x20),
                         CONCAT22((short)((ulong)uVar1 >> 0x10) - (short)((ulong)uVar9 >> 0x10),
                                  (short)uVar1 - (short)uVar9)));
  *(ulong *)(param_5 + 0x118) =
       CONCAT26((short)((ulong)uVar4 >> 0x30) - (short)((ulong)uVar12 >> 0x30),
                CONCAT24((short)((ulong)uVar4 >> 0x20) - (short)((ulong)uVar12 >> 0x20),
                         CONCAT22((short)((ulong)uVar4 >> 0x10) - (short)((ulong)uVar12 >> 0x10),
                                  (short)uVar4 - (short)uVar12)));
  *(ulong *)(param_5 + 0x110) =
       CONCAT26((short)((ulong)uVar3 >> 0x30) - (short)((ulong)uVar11 >> 0x30),
                CONCAT24((short)((ulong)uVar3 >> 0x20) - (short)((ulong)uVar11 >> 0x20),
                         CONCAT22((short)((ulong)uVar3 >> 0x10) - (short)((ulong)uVar11 >> 0x10),
                                  (short)uVar3 - (short)uVar11)));
  *(ulong *)(param_5 + 0x128) =
       CONCAT26((short)((ulong)uVar6 >> 0x30) - (short)((ulong)uVar14 >> 0x30),
                CONCAT24((short)((ulong)uVar6 >> 0x20) - (short)((ulong)uVar14 >> 0x20),
                         CONCAT22((short)((ulong)uVar6 >> 0x10) - (short)((ulong)uVar14 >> 0x10),
                                  (short)uVar6 - (short)uVar14)));
  *(ulong *)(param_5 + 0x120) =
       CONCAT26((short)((ulong)uVar5 >> 0x30) - (short)((ulong)uVar13 >> 0x30),
                CONCAT24((short)((ulong)uVar5 >> 0x20) - (short)((ulong)uVar13 >> 0x20),
                         CONCAT22((short)((ulong)uVar5 >> 0x10) - (short)((ulong)uVar13 >> 0x10),
                                  (short)uVar5 - (short)uVar13)));
  *(ulong *)(param_5 + 0x138) =
       CONCAT26((short)((ulong)uVar8 >> 0x30) - (short)((ulong)uVar16 >> 0x30),
                CONCAT24((short)((ulong)uVar8 >> 0x20) - (short)((ulong)uVar16 >> 0x20),
                         CONCAT22((short)((ulong)uVar8 >> 0x10) - (short)((ulong)uVar16 >> 0x10),
                                  (short)uVar8 - (short)uVar16)));
  *(ulong *)(param_5 + 0x130) =
       CONCAT26((short)((ulong)uVar7 >> 0x30) - (short)((ulong)uVar15 >> 0x30),
                CONCAT24((short)((ulong)uVar7 >> 0x20) - (short)((ulong)uVar15 >> 0x20),
                         CONCAT22((short)((ulong)uVar7 >> 0x10) - (short)((ulong)uVar15 >> 0x10),
                                  (short)uVar7 - (short)uVar15)));
  uVar2 = *(undefined8 *)(param_6 + 0x148);
  uVar1 = *(undefined8 *)(param_6 + 0x140);
  uVar4 = *(undefined8 *)(param_6 + 0x158);
  uVar3 = *(undefined8 *)(param_6 + 0x150);
  uVar6 = *(undefined8 *)(param_6 + 0x168);
  uVar5 = *(undefined8 *)(param_6 + 0x160);
  uVar8 = *(undefined8 *)(param_6 + 0x178);
  uVar7 = *(undefined8 *)(param_6 + 0x170);
  uVar10 = *(undefined8 *)(param_7 + 0x148);
  uVar9 = *(undefined8 *)(param_7 + 0x140);
  uVar12 = *(undefined8 *)(param_7 + 0x158);
  uVar11 = *(undefined8 *)(param_7 + 0x150);
  uVar14 = *(undefined8 *)(param_7 + 0x168);
  uVar13 = *(undefined8 *)(param_7 + 0x160);
  uVar16 = *(undefined8 *)(param_7 + 0x178);
  uVar15 = *(undefined8 *)(param_7 + 0x170);
  *(ulong *)(param_5 + 0x148) =
       CONCAT26((short)((ulong)uVar2 >> 0x30) - (short)((ulong)uVar10 >> 0x30),
                CONCAT24((short)((ulong)uVar2 >> 0x20) - (short)((ulong)uVar10 >> 0x20),
                         CONCAT22((short)((ulong)uVar2 >> 0x10) - (short)((ulong)uVar10 >> 0x10),
                                  (short)uVar2 - (short)uVar10)));
  *(ulong *)(param_5 + 0x140) =
       CONCAT26((short)((ulong)uVar1 >> 0x30) - (short)((ulong)uVar9 >> 0x30),
                CONCAT24((short)((ulong)uVar1 >> 0x20) - (short)((ulong)uVar9 >> 0x20),
                         CONCAT22((short)((ulong)uVar1 >> 0x10) - (short)((ulong)uVar9 >> 0x10),
                                  (short)uVar1 - (short)uVar9)));
  *(ulong *)(param_5 + 0x158) =
       CONCAT26((short)((ulong)uVar4 >> 0x30) - (short)((ulong)uVar12 >> 0x30),
                CONCAT24((short)((ulong)uVar4 >> 0x20) - (short)((ulong)uVar12 >> 0x20),
                         CONCAT22((short)((ulong)uVar4 >> 0x10) - (short)((ulong)uVar12 >> 0x10),
                                  (short)uVar4 - (short)uVar12)));
  *(ulong *)(param_5 + 0x150) =
       CONCAT26((short)((ulong)uVar3 >> 0x30) - (short)((ulong)uVar11 >> 0x30),
                CONCAT24((short)((ulong)uVar3 >> 0x20) - (short)((ulong)uVar11 >> 0x20),
                         CONCAT22((short)((ulong)uVar3 >> 0x10) - (short)((ulong)uVar11 >> 0x10),
                                  (short)uVar3 - (short)uVar11)));
  *(ulong *)(param_5 + 0x168) =
       CONCAT26((short)((ulong)uVar6 >> 0x30) - (short)((ulong)uVar14 >> 0x30),
                CONCAT24((short)((ulong)uVar6 >> 0x20) - (short)((ulong)uVar14 >> 0x20),
                         CONCAT22((short)((ulong)uVar6 >> 0x10) - (short)((ulong)uVar14 >> 0x10),
                                  (short)uVar6 - (short)uVar14)));
  *(ulong *)(param_5 + 0x160) =
       CONCAT26((short)((ulong)uVar5 >> 0x30) - (short)((ulong)uVar13 >> 0x30),
                CONCAT24((short)((ulong)uVar5 >> 0x20) - (short)((ulong)uVar13 >> 0x20),
                         CONCAT22((short)((ulong)uVar5 >> 0x10) - (short)((ulong)uVar13 >> 0x10),
                                  (short)uVar5 - (short)uVar13)));
  *(ulong *)(param_5 + 0x178) =
       CONCAT26((short)((ulong)uVar8 >> 0x30) - (short)((ulong)uVar16 >> 0x30),
                CONCAT24((short)((ulong)uVar8 >> 0x20) - (short)((ulong)uVar16 >> 0x20),
                         CONCAT22((short)((ulong)uVar8 >> 0x10) - (short)((ulong)uVar16 >> 0x10),
                                  (short)uVar8 - (short)uVar16)));
  *(ulong *)(param_5 + 0x170) =
       CONCAT26((short)((ulong)uVar7 >> 0x30) - (short)((ulong)uVar15 >> 0x30),
                CONCAT24((short)((ulong)uVar7 >> 0x20) - (short)((ulong)uVar15 >> 0x20),
                         CONCAT22((short)((ulong)uVar7 >> 0x10) - (short)((ulong)uVar15 >> 0x10),
                                  (short)uVar7 - (short)uVar15)));
  uVar2 = *(undefined8 *)(param_6 + 0x188);
  uVar1 = *(undefined8 *)(param_6 + 0x180);
  uVar4 = *(undefined8 *)(param_6 + 0x198);
  uVar3 = *(undefined8 *)(param_6 + 400);
  uVar6 = *(undefined8 *)(param_6 + 0x1a8);
  uVar5 = *(undefined8 *)(param_6 + 0x1a0);
  uVar8 = *(undefined8 *)(param_6 + 0x1b8);
  uVar7 = *(undefined8 *)(param_6 + 0x1b0);
  uVar10 = *(undefined8 *)(param_7 + 0x188);
  uVar9 = *(undefined8 *)(param_7 + 0x180);
  uVar12 = *(undefined8 *)(param_7 + 0x198);
  uVar11 = *(undefined8 *)(param_7 + 400);
  uVar14 = *(undefined8 *)(param_7 + 0x1a8);
  uVar13 = *(undefined8 *)(param_7 + 0x1a0);
  uVar16 = *(undefined8 *)(param_7 + 0x1b8);
  uVar15 = *(undefined8 *)(param_7 + 0x1b0);
  *(ulong *)(param_5 + 0x188) =
       CONCAT26((short)((ulong)uVar2 >> 0x30) - (short)((ulong)uVar10 >> 0x30),
                CONCAT24((short)((ulong)uVar2 >> 0x20) - (short)((ulong)uVar10 >> 0x20),
                         CONCAT22((short)((ulong)uVar2 >> 0x10) - (short)((ulong)uVar10 >> 0x10),
                                  (short)uVar2 - (short)uVar10)));
  *(ulong *)(param_5 + 0x180) =
       CONCAT26((short)((ulong)uVar1 >> 0x30) - (short)((ulong)uVar9 >> 0x30),
                CONCAT24((short)((ulong)uVar1 >> 0x20) - (short)((ulong)uVar9 >> 0x20),
                         CONCAT22((short)((ulong)uVar1 >> 0x10) - (short)((ulong)uVar9 >> 0x10),
                                  (short)uVar1 - (short)uVar9)));
  *(ulong *)(param_5 + 0x198) =
       CONCAT26((short)((ulong)uVar4 >> 0x30) - (short)((ulong)uVar12 >> 0x30),
                CONCAT24((short)((ulong)uVar4 >> 0x20) - (short)((ulong)uVar12 >> 0x20),
                         CONCAT22((short)((ulong)uVar4 >> 0x10) - (short)((ulong)uVar12 >> 0x10),
                                  (short)uVar4 - (short)uVar12)));
  *(ulong *)(param_5 + 400) =
       CONCAT26((short)((ulong)uVar3 >> 0x30) - (short)((ulong)uVar11 >> 0x30),
                CONCAT24((short)((ulong)uVar3 >> 0x20) - (short)((ulong)uVar11 >> 0x20),
                         CONCAT22((short)((ulong)uVar3 >> 0x10) - (short)((ulong)uVar11 >> 0x10),
                                  (short)uVar3 - (short)uVar11)));
  *(ulong *)(param_5 + 0x1a8) =
       CONCAT26((short)((ulong)uVar6 >> 0x30) - (short)((ulong)uVar14 >> 0x30),
                CONCAT24((short)((ulong)uVar6 >> 0x20) - (short)((ulong)uVar14 >> 0x20),
                         CONCAT22((short)((ulong)uVar6 >> 0x10) - (short)((ulong)uVar14 >> 0x10),
                                  (short)uVar6 - (short)uVar14)));
  *(ulong *)(param_5 + 0x1a0) =
       CONCAT26((short)((ulong)uVar5 >> 0x30) - (short)((ulong)uVar13 >> 0x30),
                CONCAT24((short)((ulong)uVar5 >> 0x20) - (short)((ulong)uVar13 >> 0x20),
                         CONCAT22((short)((ulong)uVar5 >> 0x10) - (short)((ulong)uVar13 >> 0x10),
                                  (short)uVar5 - (short)uVar13)));
  *(ulong *)(param_5 + 0x1b8) =
       CONCAT26((short)((ulong)uVar8 >> 0x30) - (short)((ulong)uVar16 >> 0x30),
                CONCAT24((short)((ulong)uVar8 >> 0x20) - (short)((ulong)uVar16 >> 0x20),
                         CONCAT22((short)((ulong)uVar8 >> 0x10) - (short)((ulong)uVar16 >> 0x10),
                                  (short)uVar8 - (short)uVar16)));
  *(ulong *)(param_5 + 0x1b0) =
       CONCAT26((short)((ulong)uVar7 >> 0x30) - (short)((ulong)uVar15 >> 0x30),
                CONCAT24((short)((ulong)uVar7 >> 0x20) - (short)((ulong)uVar15 >> 0x20),
                         CONCAT22((short)((ulong)uVar7 >> 0x10) - (short)((ulong)uVar15 >> 0x10),
                                  (short)uVar7 - (short)uVar15)));
  uVar2 = *(undefined8 *)(param_6 + 0x1c8);
  uVar1 = *(undefined8 *)(param_6 + 0x1c0);
  uVar4 = *(undefined8 *)(param_6 + 0x1d8);
  uVar3 = *(undefined8 *)(param_6 + 0x1d0);
  uVar6 = *(undefined8 *)(param_6 + 0x1e8);
  uVar5 = *(undefined8 *)(param_6 + 0x1e0);
  uVar8 = *(undefined8 *)(param_6 + 0x1f8);
  uVar7 = *(undefined8 *)(param_6 + 0x1f0);
  uVar10 = *(undefined8 *)(param_7 + 0x1c8);
  uVar9 = *(undefined8 *)(param_7 + 0x1c0);
  uVar12 = *(undefined8 *)(param_7 + 0x1d8);
  uVar11 = *(undefined8 *)(param_7 + 0x1d0);
  uVar14 = *(undefined8 *)(param_7 + 0x1e8);
  uVar13 = *(undefined8 *)(param_7 + 0x1e0);
  uVar16 = *(undefined8 *)(param_7 + 0x1f8);
  uVar15 = *(undefined8 *)(param_7 + 0x1f0);
  *(ulong *)(param_5 + 0x1c8) =
       CONCAT26((short)((ulong)uVar2 >> 0x30) - (short)((ulong)uVar10 >> 0x30),
                CONCAT24((short)((ulong)uVar2 >> 0x20) - (short)((ulong)uVar10 >> 0x20),
                         CONCAT22((short)((ulong)uVar2 >> 0x10) - (short)((ulong)uVar10 >> 0x10),
                                  (short)uVar2 - (short)uVar10)));
  *(ulong *)(param_5 + 0x1c0) =
       CONCAT26((short)((ulong)uVar1 >> 0x30) - (short)((ulong)uVar9 >> 0x30),
                CONCAT24((short)((ulong)uVar1 >> 0x20) - (short)((ulong)uVar9 >> 0x20),
                         CONCAT22((short)((ulong)uVar1 >> 0x10) - (short)((ulong)uVar9 >> 0x10),
                                  (short)uVar1 - (short)uVar9)));
  *(ulong *)(param_5 + 0x1d8) =
       CONCAT26((short)((ulong)uVar4 >> 0x30) - (short)((ulong)uVar12 >> 0x30),
                CONCAT24((short)((ulong)uVar4 >> 0x20) - (short)((ulong)uVar12 >> 0x20),
                         CONCAT22((short)((ulong)uVar4 >> 0x10) - (short)((ulong)uVar12 >> 0x10),
                                  (short)uVar4 - (short)uVar12)));
  *(ulong *)(param_5 + 0x1d0) =
       CONCAT26((short)((ulong)uVar3 >> 0x30) - (short)((ulong)uVar11 >> 0x30),
                CONCAT24((short)((ulong)uVar3 >> 0x20) - (short)((ulong)uVar11 >> 0x20),
                         CONCAT22((short)((ulong)uVar3 >> 0x10) - (short)((ulong)uVar11 >> 0x10),
                                  (short)uVar3 - (short)uVar11)));
  *(ulong *)(param_5 + 0x1e8) =
       CONCAT26((short)((ulong)uVar6 >> 0x30) - (short)((ulong)uVar14 >> 0x30),
                CONCAT24((short)((ulong)uVar6 >> 0x20) - (short)((ulong)uVar14 >> 0x20),
                         CONCAT22((short)((ulong)uVar6 >> 0x10) - (short)((ulong)uVar14 >> 0x10),
                                  (short)uVar6 - (short)uVar14)));
  *(ulong *)(param_5 + 0x1e0) =
       CONCAT26((short)((ulong)uVar5 >> 0x30) - (short)((ulong)uVar13 >> 0x30),
                CONCAT24((short)((ulong)uVar5 >> 0x20) - (short)((ulong)uVar13 >> 0x20),
                         CONCAT22((short)((ulong)uVar5 >> 0x10) - (short)((ulong)uVar13 >> 0x10),
                                  (short)uVar5 - (short)uVar13)));
  *(ulong *)(param_5 + 0x1f8) =
       CONCAT26((short)((ulong)uVar8 >> 0x30) - (short)((ulong)uVar16 >> 0x30),
                CONCAT24((short)((ulong)uVar8 >> 0x20) - (short)((ulong)uVar16 >> 0x20),
                         CONCAT22((short)((ulong)uVar8 >> 0x10) - (short)((ulong)uVar16 >> 0x10),
                                  (short)uVar8 - (short)uVar16)));
  *(ulong *)(param_5 + 0x1f0) =
       CONCAT26((short)((ulong)uVar7 >> 0x30) - (short)((ulong)uVar15 >> 0x30),
                CONCAT24((short)((ulong)uVar7 >> 0x20) - (short)((ulong)uVar15 >> 0x20),
                         CONCAT22((short)((ulong)uVar7 >> 0x10) - (short)((ulong)uVar15 >> 0x10),
                                  (short)uVar7 - (short)uVar15)));
  return;
}

