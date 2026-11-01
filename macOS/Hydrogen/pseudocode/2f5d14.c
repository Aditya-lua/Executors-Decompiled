
/* WARNING: Possible PIC construction at 0x002f5d18: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002f604c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002f6174: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002f6050) */
/* WARNING: Removing unreachable block (ram,0x002f5d1c) */
/* WARNING: Removing unreachable block (ram,0x002f5d20) */
/* WARNING: Removing unreachable block (ram,0x002f5d28) */
/* WARNING: Removing unreachable block (ram,0x002f5d50) */
/* WARNING: Removing unreachable block (ram,0x002f5d40) */
/* WARNING: Removing unreachable block (ram,0x002f6178) */
/* WARNING: Removing unreachable block (ram,0x002f617c) */

void FUN_002f5d14(segment_command *param_1,segment_command *param_2,undefined8 param_3,
                 segment_command *param_4,segment_command *param_5)

{
  uint uVar1;
  undefined1 auVar2 [16];
  undefined1 *puVar3;
  segment_command *psVar4;
  segment_command *psVar5;
  char *pcVar6;
  undefined *puVar7;
  ulong uVar8;
  long lVar9;
  undefined *puVar10;
  undefined8 *puVar11;
  byte *pbVar12;
  undefined8 unaff_x19;
  segment_command *unaff_x20;
  segment_command *unaff_x21;
  segment_command *unaff_x22;
  segment_command *psVar13;
  undefined8 unaff_x23;
  qword *unaff_x24;
  segment_command *unaff_x25;
  segment_command *unaff_x26;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  undefined1 *unaff_x29;
  undefined8 uVar14;
  undefined4 uVar15;
  undefined4 uVar16;
  qword qVar17;
  qword qVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined1 auVar21 [16];
  
  auVar21._8_8_ = unaff_x23;
  auVar21._0_8_ = unaff_x19;
  psVar4 = (segment_command *)(segment_command_00000020.segname + 8);
  uVar14 = 0x2f5d1c;
  puVar3 = (undefined1 *)register0x00000008;
  do {
    auVar2._8_8_ = psVar4;
    auVar2._0_8_ = param_1;
    *(qword **)(puVar3 + -0x40) = unaff_x24;
    *(long *)(puVar3 + -0x38) = auVar21._8_8_;
    *(segment_command **)(puVar3 + -0x30) = unaff_x22;
    *(segment_command **)(puVar3 + -0x28) = unaff_x21;
    *(segment_command **)(puVar3 + -0x20) = unaff_x20;
    *(long *)(puVar3 + -0x18) = auVar21._0_8_;
    *(undefined1 **)(puVar3 + -0x10) = unaff_x29;
    *(undefined8 *)(puVar3 + -8) = uVar14;
    *(undefined8 *)(puVar3 + -0x48) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    if (psVar4 < (segment_command *)(segment_command_00000020.segname + 9)) {
      unaff_x20 = (segment_command *)&param_1[3].filesize;
      uVar1 = (param_1[3].initprot & 0xff00ff00) >> 8 | (param_1[3].initprot & 0xff00ff) << 8;
      uVar1 = (uVar1 >> 0x10 | uVar1 << 0x10) + 1;
      uVar1 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
      param_1[3].initprot = uVar1 >> 0x10 | uVar1 << 0x10;
      (*(code *)param_1[3].vmsize)(unaff_x20,puVar3 + -0x80,param_1);
      uVar1 = (param_1[3].initprot & 0xff00ff00) >> 8 | (param_1[3].initprot & 0xff00ff) << 8;
      uVar1 = (uVar1 >> 0x10 | uVar1 << 0x10) + 1;
      uVar1 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
      param_1[3].initprot = uVar1 >> 0x10 | uVar1 << 0x10;
      (*(code *)param_1[3].vmsize)(unaff_x20,puVar3 + -0x70,param_1);
      uVar1 = (param_1[3].initprot & 0xff00ff00) >> 8 | (param_1[3].initprot & 0xff00ff) << 8;
      uVar1 = (uVar1 >> 0x10 | uVar1 << 0x10) + 1;
      uVar1 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
      param_1[3].initprot = uVar1 >> 0x10 | uVar1 << 0x10;
      unaff_x21 = (segment_command *)(puVar3 + -0x60);
      (*(code *)param_1[3].vmsize)(unaff_x20,unaff_x21,param_1);
      if (psVar4 != (segment_command *)0x0) {
        if ((segment_command *)((long)&MACH_HEADER.cputype + 3) < psVar4) {
          if ((segment_command *)((long)&MACH_HEADER.filetype + 3) < psVar4) {
            psVar13 = (segment_command *)((ulong)psVar4 & 0xfffffffffffffff0);
            uVar14 = *(undefined8 *)param_2->segname;
            uVar15 = param_2->cmd;
            uVar16 = param_2->cmdsize;
            uVar20 = *(undefined8 *)(puVar3 + -0x78);
            uVar19 = *(undefined8 *)(puVar3 + -0x80);
            *(ulong *)(puVar3 + -0x78) =
                 CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                          CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)((ulong)uVar14 >> 0x30),
                                   CONCAT15((byte)((ulong)uVar20 >> 0x28) ^
                                            (byte)((ulong)uVar14 >> 0x28),
                                            CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                     (byte)((ulong)uVar14 >> 0x20),
                                                     CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                              (byte)((ulong)uVar14 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar20 >> 0x10)
                                                                       ^ (byte)((ulong)uVar14 >>
                                                                               0x10),
                                                                       CONCAT11((byte)((ulong)uVar20
                                                                                      >> 8) ^
                                                                                (byte)((ulong)uVar14
                                                                                      >> 8),
                                                                                (byte)uVar20 ^
                                                                                (byte)uVar14)))))));
            *(ulong *)(puVar3 + -0x80) =
                 CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((uint)uVar16 >> 0x18),
                          CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((uint)uVar16 >> 0x10),
                                   CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                            (byte)((uint)uVar16 >> 8),
                                            CONCAT14((byte)((ulong)uVar19 >> 0x20) ^ (byte)uVar16,
                                                     CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                              (byte)((uint)uVar15 >> 0x18),
                                                              CONCAT12((byte)((ulong)uVar19 >> 0x10)
                                                                       ^ (byte)((uint)uVar15 >> 0x10
                                                                               ),
                                                                       CONCAT11((byte)((ulong)uVar19
                                                                                      >> 8) ^
                                                                                (byte)((uint)uVar15
                                                                                      >> 8),
                                                                                (byte)uVar19 ^
                                                                                (byte)uVar15)))))));
            if (psVar13 != (segment_command *)&MACH_HEADER.ncmds) {
              qVar17 = param_2->vmaddr;
              uVar14 = *(undefined8 *)(param_2->segname + 8);
              uVar20 = *(undefined8 *)(puVar3 + -0x68);
              uVar19 = *(undefined8 *)(puVar3 + -0x70);
              *(ulong *)(puVar3 + -0x68) =
                   CONCAT17((byte)((ulong)uVar20 >> 0x38) ^ (byte)(qVar17 >> 0x38),
                            CONCAT16((byte)((ulong)uVar20 >> 0x30) ^ (byte)(qVar17 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar20 >> 0x28) ^ (byte)(qVar17 >> 0x28)
                                              ,CONCAT14((byte)((ulong)uVar20 >> 0x20) ^
                                                        (byte)(qVar17 >> 0x20),
                                                        CONCAT13((byte)((ulong)uVar20 >> 0x18) ^
                                                                 (byte)(qVar17 >> 0x18),
                                                                 CONCAT12((byte)((ulong)uVar20 >>
                                                                                0x10) ^
                                                                          (byte)(qVar17 >> 0x10),
                                                                          CONCAT11((byte)((ulong)
                                                  uVar20 >> 8) ^ (byte)(qVar17 >> 8),
                                                  (byte)uVar20 ^ (byte)qVar17)))))));
              *(ulong *)(puVar3 + -0x70) =
                   CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                            CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((ulong)uVar14 >> 0x30),
                                     CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                              (byte)((ulong)uVar14 >> 0x28),
                                              CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                       (byte)((ulong)uVar14 >> 0x20),
                                                       CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                                (byte)((ulong)uVar14 >> 0x18),
                                                                CONCAT12((byte)((ulong)uVar19 >>
                                                                               0x10) ^
                                                                         (byte)((ulong)uVar14 >>
                                                                               0x10),
                                                                         CONCAT11((byte)((ulong)
                                                  uVar19 >> 8) ^ (byte)((ulong)uVar14 >> 8),
                                                  (byte)uVar19 ^ (byte)uVar14)))))));
              if (psVar13 != &segment_command_00000020) {
                qVar18 = param_2->fileoff;
                qVar17 = param_2->vmsize;
                uVar19 = *(undefined8 *)(puVar3 + -0x58);
                uVar14 = *(undefined8 *)(puVar3 + -0x60);
                *(ulong *)(puVar3 + -0x58) =
                     CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)(qVar18 >> 0x38),
                              CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)(qVar18 >> 0x30),
                                       CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                                (byte)(qVar18 >> 0x28),
                                                CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                         (byte)(qVar18 >> 0x20),
                                                         CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                                  (byte)(qVar18 >> 0x18),
                                                                  CONCAT12((byte)((ulong)uVar19 >>
                                                                                 0x10) ^
                                                                           (byte)(qVar18 >> 0x10),
                                                                           CONCAT11((byte)((ulong)
                                                  uVar19 >> 8) ^ (byte)(qVar18 >> 8),
                                                  (byte)uVar19 ^ (byte)qVar18)))))));
                *(ulong *)(puVar3 + -0x60) =
                     CONCAT17((byte)((ulong)uVar14 >> 0x38) ^ (byte)(qVar17 >> 0x38),
                              CONCAT16((byte)((ulong)uVar14 >> 0x30) ^ (byte)(qVar17 >> 0x30),
                                       CONCAT15((byte)((ulong)uVar14 >> 0x28) ^
                                                (byte)(qVar17 >> 0x28),
                                                CONCAT14((byte)((ulong)uVar14 >> 0x20) ^
                                                         (byte)(qVar17 >> 0x20),
                                                         CONCAT13((byte)((ulong)uVar14 >> 0x18) ^
                                                                  (byte)(qVar17 >> 0x18),
                                                                  CONCAT12((byte)((ulong)uVar14 >>
                                                                                 0x10) ^
                                                                           (byte)(qVar17 >> 0x10),
                                                                           CONCAT11((byte)((ulong)
                                                  uVar14 >> 8) ^ (byte)(qVar17 >> 8),
                                                  (byte)uVar14 ^ (byte)qVar17)))))));
              }
            }
            if (psVar13 == psVar4) goto LAB_002f5ef0;
            psVar5 = psVar13;
            if (((uint)psVar4 >> 3 & 1) == 0) goto LAB_002f5ec8;
          }
          else {
            psVar5 = (segment_command *)0x0;
          }
          psVar13 = (segment_command *)((ulong)psVar4 & 0xfffffffffffffff8);
          lVar9 = (long)psVar5 - (long)psVar13;
          pcVar6 = psVar5->segname + (long)(param_2->segname + -0x10);
          puVar11 = (undefined8 *)(puVar3 + -0x80 + (long)psVar5);
          do {
            uVar14 = *(undefined8 *)pcVar6;
            uVar19 = *puVar11;
            *puVar11 = CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                                CONCAT16((byte)((ulong)uVar19 >> 0x30) ^
                                         (byte)((ulong)uVar14 >> 0x30),
                                         CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                                  (byte)((ulong)uVar14 >> 0x28),
                                                  CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                           (byte)((ulong)uVar14 >> 0x20),
                                                           CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                                    (byte)((ulong)uVar14 >> 0x18),
                                                                    CONCAT12((byte)((ulong)uVar19 >>
                                                                                   0x10) ^
                                                                             (byte)((ulong)uVar14 >>
                                                                                   0x10),
                                                                             CONCAT11((byte)((ulong)
                                                  uVar19 >> 8) ^ (byte)((ulong)uVar14 >> 8),
                                                  (byte)uVar19 ^ (byte)uVar14)))))));
            lVar9 = lVar9 + 8;
            pcVar6 = pcVar6 + 8;
            puVar11 = puVar11 + 1;
          } while (lVar9 != 0);
          if (psVar13 == psVar4) goto LAB_002f5ef0;
        }
        else {
          psVar13 = (segment_command *)0x0;
        }
LAB_002f5ec8:
        lVar9 = (long)psVar4 - (long)psVar13;
        pcVar6 = psVar13->segname + (long)(param_2->segname + -0x10);
        pbVar12 = puVar3 + -0x80 + (long)psVar13;
        do {
          *pbVar12 = *pbVar12 ^ *pcVar6;
          lVar9 = lVar9 + -1;
          pcVar6 = pcVar6 + 1;
          pbVar12 = pbVar12 + 1;
        } while (lVar9 != 0);
      }
LAB_002f5ef0:
      psVar13 = param_1;
      if ((uRam0000000000a334f8 >> 2 & 1) == 0) {
        if ((uRam0000000000a334f8 & 1) == 0) {
          func_0x00296a94();
          puVar7 = &_aws_lc_0_24_0_aes_nohw_ctr32_encrypt_blocks;
          puVar10 = &_aws_lc_0_24_0_aes_nohw_encrypt;
        }
        else {
          func_0x0038a640(puVar3 + -0x80,0x100);
          puVar7 = &DAT_0038a7c0;
          puVar10 = &DAT_00389e90;
        }
      }
      else {
        func_0x003784e0(puVar3 + -0x80,0x100);
        puVar7 = &DAT_00378c40;
        puVar10 = &DAT_00378780;
      }
      param_1[3].vmsize = (qword)puVar10;
      param_1[3].fileoff = (qword)puVar7;
      uVar14 = *(undefined8 *)(puVar3 + -0x58);
      qVar17 = *(qword *)unaff_x21;
      param_1[3].maxprot = (int)uVar14;
      param_1[3].initprot = (int)((ulong)uVar14 >> 0x20);
      *(qword *)unaff_x20 = qVar17;
      uVar14 = 1;
      psVar4 = param_5;
      unaff_x22 = param_2;
    }
    else {
      uVar14 = 0;
      psVar13 = psVar4;
      psVar4 = param_5;
      auVar2 = auVar21;
    }
    param_2 = param_4;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar3 + -0x48)) {
      return;
    }
    auVar21 = ___stack_chk_fail(uVar14);
    pcVar6 = auVar21._8_8_;
    param_1 = auVar21._0_8_;
    *(undefined8 *)(puVar3 + -0xe0) = unaff_x28;
    *(undefined8 *)(puVar3 + -0xd8) = unaff_x27;
    *(segment_command **)(puVar3 + -0xd0) = unaff_x26;
    *(segment_command **)(puVar3 + -200) = unaff_x25;
    *(qword **)(puVar3 + -0xc0) = unaff_x24;
    *(long *)(puVar3 + -0xb8) = auVar2._8_8_;
    *(segment_command **)(puVar3 + -0xb0) = unaff_x22;
    *(segment_command **)(puVar3 + -0xa8) = unaff_x21;
    *(segment_command **)(puVar3 + -0xa0) = unaff_x20;
    *(segment_command **)(puVar3 + -0x98) = auVar2._0_8_;
    *(undefined1 **)(puVar3 + -0x90) = puVar3 + -0x10;
    *(undefined8 *)(puVar3 + -0x88) = 0x2f5fa4;
    unaff_x29 = puVar3 + -0x90;
    *(undefined8 *)(puVar3 + -0xe8) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
    psVar5 = auVar2._0_8_;
    if (((segment_command *)&UNK_00010000 < psVar13) ||
       (uVar8._0_4_ = param_1[3].nsects, uVar8._4_4_ = param_1[3].flags, psVar5 = param_1,
       0x1000000000000 < uVar8)) {
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar3 + -0xe8)) {
        return;
      }
      uVar14 = ___stack_chk_fail(0);
      *(segment_command **)(puVar3 + -0x120) = unaff_x20;
      *(segment_command **)(puVar3 + -0x118) = psVar5;
      *(undefined1 **)(puVar3 + -0x110) = unaff_x29;
      *(undefined8 *)(puVar3 + -0x108) = 0x2f6194;
      _bzero(uVar14);
      return;
    }
    param_4 = param_2;
    param_5 = psVar4;
    unaff_x20 = psVar4;
    unaff_x21 = param_2;
    if (psVar4 == (segment_command *)0x0) {
      if ((segment_command *)((long)&MACH_HEADER.filetype + 3) < psVar13) {
        unaff_x24 = &param_1[3].filesize;
        unaff_x27 = 0x2000;
        do {
          unaff_x26 = psVar13;
          if ((segment_command *)&UNK_00001fff < psVar13) {
            unaff_x26 = (segment_command *)&UNK_00002000;
          }
          unaff_x25 = (segment_command *)((ulong)unaff_x26 & 0x3ff0);
          if (param_1[3].fileoff == 0) {
            if (unaff_x25 != (segment_command *)0x0) {
              unaff_x26 = (segment_command *)0x0;
              do {
                uVar1 = (param_1[3].initprot & 0xff00ff00) >> 8 |
                        (param_1[3].initprot & 0xff00ff) << 8;
                uVar1 = (uVar1 >> 0x10 | uVar1 << 0x10) + 1;
                uVar1 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
                param_1[3].initprot = uVar1 >> 0x10 | uVar1 << 0x10;
                (*(code *)param_1[3].vmsize)
                          (unaff_x24,unaff_x26->segname + (long)(pcVar6 + -8),param_1);
                unaff_x26 = (segment_command *)(unaff_x26->segname + 8);
              } while (unaff_x26 < unaff_x25);
            }
          }
          else {
            if (unaff_x25 != (segment_command *)0x0) {
              _bzero(pcVar6,unaff_x25);
            }
            unaff_x26 = (segment_command *)((ulong)unaff_x26 >> 4);
            uVar1 = (param_1[3].initprot & 0xff00ff00) >> 8 | (param_1[3].initprot & 0xff00ff) << 8;
            uVar1 = (uVar1 >> 0x10 | uVar1 << 0x10) + 1;
            uVar1 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
            param_1[3].initprot = uVar1 >> 0x10 | uVar1 << 0x10;
            param_4 = param_1;
            param_5 = (segment_command *)unaff_x24;
            (*(code *)param_1[3].fileoff)(pcVar6,pcVar6,unaff_x26);
            uVar1 = (param_1[3].initprot & 0xff00ff00) >> 8 | (param_1[3].initprot & 0xff00ff) << 8;
            uVar1 = ((int)unaff_x26 + (uVar1 >> 0x10 | uVar1 << 0x10)) - 1;
            uVar1 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
            param_1[3].initprot = uVar1 >> 0x10 | uVar1 << 0x10;
          }
          pcVar6 = unaff_x25->segname + (long)(pcVar6 + -8);
          psVar13 = (segment_command *)((long)psVar13 - (long)unaff_x25);
        } while ((segment_command *)((long)&MACH_HEADER.filetype + 3) < psVar13);
      }
      auVar21._8_8_ = pcVar6;
      auVar21._0_8_ = param_1;
      if (psVar13 != (segment_command *)0x0) {
        uVar1 = (param_1[3].initprot & 0xff00ff00) >> 8 | (param_1[3].initprot & 0xff00ff) << 8;
        uVar1 = (uVar1 >> 0x10 | uVar1 << 0x10) + 1;
        uVar1 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
        param_1[3].initprot = uVar1 >> 0x10 | uVar1 << 0x10;
        (*(code *)param_1[3].vmsize)(&param_1[3].filesize,puVar3 + -0xf8,param_1);
        _memcpy(pcVar6,puVar3 + -0xf8,psVar13);
      }
      uVar14 = 0x2f6178;
      puVar3 = puVar3 + -0x100;
      unaff_x22 = psVar13;
    }
    else {
      uVar14 = 0x2f6050;
      puVar3 = puVar3 + -0x100;
      unaff_x22 = psVar13;
    }
  } while( true );
}

