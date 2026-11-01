
/* WARNING: Removing unreachable block (ram,0x000d952c) */

void FUN_0013294c(long param_1,undefined1 param_2 [16],float param_3)

{
  int *piVar1;
  int iVar2;
  int iVar3;
  undefined8 *puVar4;
  int iVar5;
  int iVar6;
  bool bVar7;
  bool bVar8;
  int iVar9;
  int iVar10;
  ulong uVar11;
  int iVar12;
  int *piVar13;
  undefined4 *puVar14;
  long lVar15;
  ulong unaff_x19;
  long lVar16;
  long *unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  long unaff_x24;
  undefined8 uVar17;
  undefined8 uVar18;
  float fVar19;
  float unaff_s8;
  float unaff_s10;
  undefined8 uStack0000000000000008;
  
  do {
    lVar16 = unaff_x24;
    if (((*(char *)(param_1 + 0x236) != '\0') ||
        ((long)unaff_x19 < (long)*(short *)(param_1 + 0x206))) &&
       (lVar15 = (long)*(short *)(*(long *)(param_1 + 0x18) + unaff_x23), lVar15 != -1)) {
      lVar16 = *(long *)(param_1 + 0x198) + lVar15;
    }
    do {
      while( true ) {
        func_0x000d505c(unaff_x19);
        func_0x00132ad0(lVar16);
        func_0x000d53d0();
        do {
          unaff_x19 = unaff_x19 + 1;
          unaff_x23 = unaff_x23 + 0x70;
          if (unaff_x22 == unaff_x19) {
            func_0x000d726c();
            fVar19 = param_3;
            uVar11 = func_0x000d6f58(1);
            if ((uVar11 & 1) == 0) {
              return;
            }
            puVar14 = *(undefined4 **)(&UNK_00004e18 + *unaff_x21);
            iVar9 = (int)unaff_x22;
            if (puVar14 == (undefined4 *)0x0) {
              if (iVar9 != -1) {
                return;
              }
            }
            else if (*(short *)((long)puVar14 + 0x20a) != iVar9) {
              return;
            }
            if (param_3 < unaff_s8) {
              return;
            }
            if (unaff_s10 + unaff_s8 <= param_3) {
              return;
            }
            if (iVar9 == -1) {
              unaff_x22 = (ulong)(uint)puVar14[0x1d];
            }
            if ((*(byte *)(puVar14 + 1) & 7) == 0) {
              return;
            }
            *(undefined1 *)((long)puVar14 + 0x23b) = 1;
            iVar9 = (int)unaff_x22;
            if (iVar9 == puVar14[0x1b]) {
              iVar9 = -1;
            }
            *(short *)(puVar14 + 0x89) = (short)iVar9;
            *(undefined2 *)((long)puVar14 + 0x7a) = *(undefined2 *)(puVar14 + 0x1e);
            iVar10 = func_0x000b89a8("##ContextMenu",0,*puVar14);
            lVar16 = lRam0000000000a334c0;
            piVar1 = (int *)(&UNK_00004ad0 + lRam0000000000a334c0);
            iVar9 = *(int *)(&UNK_00004ae0 + lRam0000000000a334c0);
            uVar17 = *(undefined8 *)(&UNK_00004b18 + lRam0000000000a334c0);
            iVar5 = *(int *)(&UNK_00003f58 + lRam0000000000a334c0);
            iVar6 = *(int *)(*(long *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x108) +
                             (long)*(int *)(*(long *)(lRam0000000000a334c0 + 0x4000) + 0x100) * 4 +
                            -4);
            uStack0000000000000008._0_4_ = func_0x000d96e8();
            uStack0000000000000008._4_4_ = fVar19;
            bVar7 = true;
            bVar8 = false;
            if (-256000.0 <= *(float *)(lVar16 + 0xe44)) {
              bVar7 = false;
              bVar8 = true;
              if (!NAN(*(float *)(lVar16 + 0xe40))) {
                bVar7 = *(float *)(lVar16 + 0xe40) < -256000.0;
                bVar8 = false;
              }
            }
            puVar4 = (undefined8 *)(lVar16 + 0xe40);
            if (bVar7 != bVar8) {
              puVar4 = &uStack0000000000000008;
            }
            uVar18 = *puVar4;
            if (((byte)(&UNK_0000603c)[lVar16] >> 2 & 1) != 0) {
              func_0x000bae48("[popup] OpenPopupEx(0x%08X)\n");
            }
            lVar15 = lRam0000000000a334c0;
            iVar12 = *piVar1;
            if (iVar9 < iVar12) {
              if ((*(int *)(*(long *)(&UNK_00004ad8 + lVar16) + (long)iVar9 * 0x38) == iVar10) &&
                 (piVar13 = (int *)(*(long *)(&UNK_00004ad8 + lVar16) + (long)iVar9 * 0x38 + 0x1c),
                 *piVar13 == *(int *)(&UNK_00003f58 + lVar16) + -1)) {
                *piVar13 = iVar5;
                return;
              }
              piVar13 = (int *)(&UNK_00004ad0 + lRam0000000000a334c0);
              if (((byte)(&UNK_0000603c)[lRam0000000000a334c0] >> 2 & 1) != 0) {
                func_0x000bae48(
                               "[popup] ClosePopupToLevel(%d), restore_focus_to_window_under_popup=%d\n"
                               );
              }
              iVar12 = *(int *)(&UNK_00004ad4 + lVar15);
              if (iVar12 < iVar9) {
                iVar2 = iVar12;
                if (iVar12 < 0) {
                  iVar2 = iVar12 + 1;
                }
                iVar3 = 8;
                if (iVar12 != 0) {
                  iVar3 = iVar12 + (iVar2 >> 1);
                }
                if (iVar3 <= iVar9) {
                  iVar3 = iVar9;
                }
                func_0x000eadcc(piVar13,iVar3);
              }
              *piVar13 = iVar9;
              iVar12 = *piVar1;
            }
            if (iVar12 == *(int *)(&UNK_00004ad4 + lVar16)) {
              iVar9 = iVar12;
              if (iVar12 < 0) {
                iVar9 = iVar12 + 1;
              }
              iVar2 = 8;
              if (iVar12 != 0) {
                iVar2 = iVar12 + (iVar9 >> 1);
              }
              if (iVar2 <= iVar12 + 1) {
                iVar2 = iVar12 + 1;
              }
              func_0x000eadcc(piVar1,iVar2);
              iVar12 = *piVar1;
            }
            piVar13 = (int *)(*(long *)(&UNK_00004ad8 + lVar16) + (long)iVar12 * 0x38);
            *piVar13 = iVar10;
            piVar13[1] = 0;
            piVar13[2] = 0;
            piVar13[3] = 0;
            *(undefined8 *)(piVar13 + 4) = uVar17;
            piVar13[6] = -1;
            piVar13[7] = iVar5;
            piVar13[8] = iVar6;
            *(ulong *)(piVar13 + 9) =
                 CONCAT44(uStack0000000000000008._4_4_,(undefined4)uStack0000000000000008);
            *(undefined8 *)(piVar13 + 0xb) = uVar18;
            piVar13[0xd] = 0;
            *piVar1 = *piVar1 + 1;
            return;
          }
          iVar9 = func_0x00131a08(unaff_x19);
        } while (iVar9 == 0);
        param_1 = *(long *)(&UNK_00004e18 + *unaff_x21);
        if (param_1 != 0) break;
        lVar16 = 0;
      }
    } while ((unaff_x19 != *(uint *)(param_1 + 0x6c)) &&
            (lVar16 = unaff_x24,
            (*(uint *)(*(long *)(param_1 + 0x18) + unaff_x23 + -0x50) >> 0xc & 1) != 0));
  } while( true );
}

