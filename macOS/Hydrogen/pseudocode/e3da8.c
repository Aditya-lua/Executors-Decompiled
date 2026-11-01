
/* WARNING: Possible PIC construction at 0x000e42f4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x000e42f8) */
/* WARNING: Removing unreachable block (ram,0x000e4310) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000e3da8(uint *param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  uint uVar2;
  bool bVar3;
  bool bVar4;
  int iVar5;
  long *plVar6;
  long lVar7;
  char *pcVar8;
  code *pcVar9;
  undefined4 uVar10;
  char *pcVar11;
  char cVar12;
  undefined4 *puVar13;
  char *pcVar14;
  long lVar15;
  char *unaff_x21;
  long unaff_x22;
  long lVar16;
  long unaff_x23;
  char *unaff_x24;
  char *pcVar17;
  char *pcVar18;
  long unaff_x29;
  undefined *puVar19;
  float fVar20;
  float fVar21;
  float fVar22;
  ulong uVar23;
  int iVar26;
  undefined8 uVar24;
  undefined8 uVar25;
  float fVar27;
  ulong uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  float fVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  float fVar35;
  ulong in_stack_00000000;
  ulong in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  char *in_stack_00000170;
  long in_stack_00000178;
  long in_stack_00000180;
  uint *in_stack_00000188;
  char *in_stack_00000190;
  undefined4 *in_stack_00000198;
  long in_stack_000001a0;
  undefined *in_stack_000001a8;
  undefined1 uStack00000000000001b0;
  
  if ((*param_1 >> 1 & 1) == 0) {
    fVar20 = *(float *)(&UNK_00003d38 + unaff_x23);
    *param_1 = *param_1 | 2;
    param_1[8] = 0;
    param_1[9] = (uint)(fVar20 * 8.0);
    param_1[2] = 4;
  }
  iVar5 = func_0x000c9774("Dear ImGui ID Stack Tool",param_3,0);
  if ((iVar5 == 0) ||
     (lVar7 = *(long *)(*(long *)(unaff_x22 + 0x4c0) + 0x4000), *(undefined1 *)(lVar7 + 0xc0) = 1,
     1 < *(short *)(lVar7 + 0xcc))) {
    if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x90)) {
      ___stack_chk_fail();
      lVar7 = lRam0000000000a334c0;
      puVar13 = (undefined4 *)(&UNK_00004970 + lRam0000000000a334c0);
      *(undefined4 *)(lRam0000000000a334c0 + 0x3ffc) = 0;
      *(undefined4 *)(&UNK_00004e20 + lVar7) = 0;
      *puVar13 = 0;
      return;
    }
    register0x00000008 = (BADSPACEBASE *)&uStack00000000000001b0;
    puVar13 = in_stack_00000198;
    pcVar14 = in_stack_00000190;
    unaff_x21 = (char *)in_stack_00000188;
    unaff_x22 = in_stack_00000180;
    unaff_x23 = in_stack_00000178;
    unaff_x24 = in_stack_00000170;
    unaff_x29 = in_stack_000001a0;
    puVar19 = in_stack_000001a8;
    goto code_r0x000cea90;
  }
  puVar13 = (undefined4 *)(&UNK_000060a8 + unaff_x23);
  in_stack_00000000 = (ulong)*(uint *)(&UNK_00004054 + unaff_x23);
  in_stack_00000008 = (ulong)*(uint *)(&UNK_00004064 + unaff_x23);
  func_0x0010adc0("HoveredId: 0x%08X, ActiveId:  0x%08X");
  lVar7 = *(long *)(*(long *)(unaff_x22 + 0x4c0) + 0x4000);
  if (*(char *)(lVar7 + 0xc3) == '\0') {
    *(float *)(lVar7 + 0x110) =
         *(float *)(&UNK_00003934 + *(long *)(unaff_x22 + 0x4c0)) + *(float *)(lVar7 + 0x118);
    *(undefined4 *)(lVar7 + 0x114) = *(undefined4 *)(lVar7 + 0x11c);
    *(undefined8 *)(lVar7 + 0x138) = *(undefined8 *)(lVar7 + 0x140);
    *(undefined4 *)(lVar7 + 0x148) = *(undefined4 *)(lVar7 + 0x14c);
    *(undefined1 *)(lVar7 + 0x150) = 1;
  }
  func_0x000e44f8(
                 "Hover an item with the mouse to display elements of the ID Stack leading to the item\'s final ID.\nEach level of the stack correspond to a PushID() call.\nAll levels of the stack are hashed together to make the final ID of a widget (ID displayed at the bottom level of the stack).\nRead FAQ entry about the ID stack for details."
                 );
  fVar20 = (float)*(double *)(&UNK_00003f50 + unaff_x23) - *(float *)(&UNK_000060cc + unaff_x23);
  pcVar14 = &UNK_000060c8 + unaff_x23;
  func_0x0010d04c("Ctrl+C: copy path to clipboard",pcVar14);
  lVar7 = *(long *)(*(long *)(unaff_x22 + 0x4c0) + 0x4000);
  if (*(char *)(lVar7 + 0xc3) == '\0') {
    *(float *)(lVar7 + 0x110) =
         *(float *)(&UNK_00003934 + *(long *)(unaff_x22 + 0x4c0)) + *(float *)(lVar7 + 0x118);
    *(undefined4 *)(lVar7 + 0x114) = *(undefined4 *)(lVar7 + 0x11c);
    *(undefined8 *)(lVar7 + 0x138) = *(undefined8 *)(lVar7 + 0x140);
    *(undefined4 *)(lVar7 + 0x148) = *(undefined4 *)(lVar7 + 0x14c);
    *(undefined1 *)(lVar7 + 0x150) = 1;
  }
  fVar21 = (float)_fmodf(fVar20,0x3e800000);
  bVar3 = false;
  if ((0.0 <= fVar20) && (bVar3 = false, !NAN(fVar20))) {
    bVar3 = fVar20 < 0.75;
  }
  bVar4 = false;
  if ((bVar3) && (bVar4 = false, !NAN(fVar21))) {
    bVar4 = fVar21 < 0.125;
  }
  if (bVar4) {
    in_stack_00000018 = _UNK_0080c348;
    uStack0000000000000010 = _UNK_0080c340;
    func_0x0010ae94(&uStack0000000000000010,"*COPIED*");
    cVar12 = *pcVar14;
  }
  else {
    uStack0000000000000010 = 0;
    in_stack_00000018 = 0;
    func_0x0010ae94(&uStack0000000000000010,"*COPIED*");
    cVar12 = *pcVar14;
  }
  if (cVar12 != '\0') {
    lVar7 = *(long *)(unaff_x22 + 0x4c0);
    if ((((&UNK_000037c4)[lVar7] != '\0') && ((&UNK_000047e4)[lVar7] == '\0')) &&
       ((&UNK_000030a4)[lVar7] != '\0')) {
      fVar20 = *(float *)(&UNK_000030a8 + lVar7);
      if (0.0 <= fVar20) {
        if (fVar20 == 0.0) goto code_r0x000e4354;
        fVar21 = *(float *)(lVar7 + 0x70);
        if ((fVar21 < fVar20) && (fVar27 = fVar20 - *(float *)(lVar7 + 0x18), fVar27 < fVar20)) {
          fVar31 = *(float *)(lVar7 + 0x74);
          if (fVar31 <= 0.0) {
            if ((fVar21 <= fVar20) && (fVar27 < fVar21)) goto code_r0x000e4354;
          }
          else {
            if (fVar21 <= fVar27) {
              iVar5 = (int)((fVar27 - fVar21) / fVar31);
            }
            else {
              iVar5 = -1;
            }
            if (fVar21 <= fVar20) {
              iVar26 = (int)((fVar20 - fVar21) / fVar31);
            }
            else {
              iVar26 = -1;
            }
            if (iVar5 < iVar26) {
code_r0x000e4354:
              if ((&UNK_0000428c)[lVar7] == '\0') {
                *(float *)(&UNK_000060cc + unaff_x23) =
                     (float)*(double *)(&UNK_00003f50 + unaff_x23);
                pcVar17 = *(char **)(&UNK_00006220 + unaff_x23);
                if ((0 < *(int *)(&UNK_000060b8 + unaff_x23)) &&
                   (3 < *(int *)(&UNK_00006218 + unaff_x23))) {
                  pcVar14 = (char *)0x0;
                  unaff_x21 = pcVar17 + *(int *)(&UNK_00006218 + unaff_x23);
                  unaff_x24 = (char *)((long)&uStack0000000000000010 + 1);
                  pcVar18 = pcVar17;
                  do {
                    *pcVar18 = '/';
                    func_0x000e73a8(puVar13,pcVar14,0,&uStack0000000000000010,0x100);
                    pcVar17 = pcVar18 + 1;
                    pcVar11 = unaff_x24;
                    cVar12 = (char)uStack0000000000000010;
                    if ((char)uStack0000000000000010 != '\0' && pcVar18 + 3 < unaff_x21) {
                      do {
                        pcVar8 = pcVar17;
                        if (cVar12 == '/') {
                          *pcVar8 = '\\';
                          pcVar8 = pcVar18 + 2;
                          cVar12 = pcVar11[-1];
                        }
                        *pcVar8 = cVar12;
                        pcVar17 = pcVar8 + 1;
                        cVar12 = *pcVar11;
                        pcVar11 = pcVar11 + 1;
                        pcVar18 = pcVar8;
                      } while (cVar12 != '\0' && pcVar8 + 3 < unaff_x21);
                    }
                    uVar2 = (int)pcVar14 + 1;
                    pcVar14 = (char *)(ulong)uVar2;
                    pcVar18 = pcVar17;
                  } while ((int)uVar2 < *(int *)(&UNK_000060b8 + unaff_x23) &&
                           pcVar17 + 3 < unaff_x21);
                }
                *pcVar17 = '\0';
                pcVar9 = *(code **)(*(long *)(unaff_x22 + 0x4c0) + 0xb0);
                if (pcVar9 != (code *)0x0) {
                  (*pcVar9)(*(undefined8 *)(*(long *)(unaff_x22 + 0x4c0) + 0xb8),
                            *(undefined8 *)(&UNK_00006220 + unaff_x23));
                }
              }
            }
          }
        }
      }
    }
  }
  *puVar13 = *(undefined4 *)(&UNK_00003f58 + unaff_x23);
  if (0 < *(int *)(&UNK_000060b8 + unaff_x23)) {
    uStack0000000000000010 = 0;
    iVar5 = func_0x0012c108(0,"##table",3,0x780,&uStack0000000000000010);
    if (iVar5 != 0) {
      fVar20 = (float)func_0x00106300(*(undefined4 *)(&UNK_00003d38 + *(long *)(unaff_x22 + 0x4c0)),
                                      0x7f7fffff,0xbf800000,
                                      *(undefined8 *)(&UNK_00003d30 + *(long *)(unaff_x22 + 0x4c0)),
                                      "0xDDDDDDDD",0,0);
      func_0x00131154((float)(int)(fVar20 + 0.99999),"Seed",0x10,0);
      func_0x00131154(0,"PushID",8,0);
      func_0x00131154((float)(int)(fVar20 + 0.99999),"Result",0x10,0);
      func_0x0013275c();
      if (0 < *(int *)(&UNK_000060b8 + unaff_x23)) {
        unaff_x21 = *(char **)(&UNK_000060c0 + unaff_x23);
        func_0x00131cb4();
        in_stack_00000000 = 0;
        pcVar14 = "0x%08X";
        func_0x0010adc0("0x%08X");
        func_0x00131cb4();
        func_0x000e73a8(puVar13,0,1,*(undefined8 *)(&UNK_00006220 + unaff_x23),
                        (long)*(int *)(&UNK_00006218 + unaff_x23));
        func_0x0010adb8(*(undefined8 *)(&UNK_00006220 + unaff_x23),0);
        func_0x00131cb4();
        in_stack_00000000 = (ulong)*(uint *)unaff_x21;
        func_0x0010adc0("0x%08X");
        iVar5 = *(int *)(&UNK_000060b8 + unaff_x23);
        if (iVar5 == 1) {
          lVar7 = *(long *)(unaff_x22 + 0x4c0);
          fVar21 = *(float *)(&UNK_00003b4c + lVar7);
          fVar27 = *(float *)(&UNK_00003b50 + lVar7);
          fVar31 = *(float *)(&UNK_00003b58 + lVar7) * *(float *)(&UNK_000038e8 + lVar7);
          fVar20 = 1.0;
          if (fVar21 <= 1.0) {
            fVar20 = fVar21;
          }
          fVar35 = 0.0;
          if (0.0 <= fVar21) {
            fVar35 = fVar20;
          }
          fVar21 = *(float *)(&UNK_00003b54 + lVar7);
          fVar20 = 1.0;
          if (fVar27 <= 1.0) {
            fVar20 = fVar27;
          }
          fVar22 = 0.0;
          if (0.0 <= fVar27) {
            fVar22 = fVar20;
          }
          iVar5 = -(uint)(fVar21 < 0.0);
          iVar26 = -(uint)(fVar31 < 0.0);
          uVar23 = NEON_fmov(0x3f800000,4);
          uVar23 = uVar23 ^ (uVar23 ^ CONCAT44(fVar31,fVar21)) &
                            ~CONCAT44(-(uint)((float)(uVar23 >> 0x20) < fVar31),
                                      -(uint)((float)uVar23 < fVar21));
          fVar20 = (float)CONCAT13((byte)(uVar23 >> 0x18) & ~(byte)((uint)iVar5 >> 0x18),
                                   CONCAT12((byte)(uVar23 >> 0x10) & ~(byte)((uint)iVar5 >> 0x10),
                                            CONCAT11((byte)(uVar23 >> 8) & ~(byte)((uint)iVar5 >> 8)
                                                     ,(byte)uVar23 & ~(byte)iVar5)));
          uVar24 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar23 >> 0x38) &
                                                             ~(byte)((uint)iVar26 >> 0x18),
                                                             CONCAT16((byte)(uVar23 >> 0x30) &
                                                                      ~(byte)((uint)iVar26 >> 0x10),
                                                                      CONCAT15((byte)(uVar23 >> 0x28
                                                                                     ) & ~(byte)((
                                                  uint)iVar26 >> 8),
                                                  CONCAT14((byte)(uVar23 >> 0x20) & ~(byte)iVar26,
                                                           fVar20)))) >> 0x20) * 255.0 + 0.5),
                                      (int)(fVar20 * 255.0 + 0.5)),_UNK_0080c190,4);
          func_0x00131634(3,(int)(fVar35 * 255.0 + 0.5) | (int)(fVar22 * 255.0 + 0.5) << 8 |
                            (uint)uVar24 | (uint)((ulong)uVar24 >> 0x20),0xffffffff);
          iVar5 = *(int *)(&UNK_000060b8 + unaff_x23);
        }
        uVar24 = _UNK_0080c190;
        if (1 < iVar5) {
          unaff_x24 = (char *)0x0;
          pcVar14 = (char *)((long)&MACH_HEADER.magic + 1);
          unaff_x21 = "0x%08X";
          uVar23 = NEON_fmov(0x3f800000,4);
          do {
            lVar7 = *(long *)(&UNK_000060c0 + unaff_x23);
            func_0x00131cb4();
            in_stack_00000000 = (ulong)*(uint *)(unaff_x24 + *(long *)(&UNK_000060c0 + unaff_x23));
            func_0x0010adc0("0x%08X");
            func_0x00131cb4();
            func_0x000e73a8(puVar13,pcVar14,1,*(undefined8 *)(&UNK_00006220 + unaff_x23),
                            (long)*(int *)(&UNK_00006218 + unaff_x23));
            func_0x0010adb8(*(undefined8 *)(&UNK_00006220 + unaff_x23),0);
            func_0x00131cb4();
            in_stack_00000000 = (ulong)*(uint *)(unaff_x24 + lVar7 + 0x40);
            func_0x0010adc0("0x%08X");
            iVar5 = *(int *)(&UNK_000060b8 + unaff_x23);
            if (pcVar14 == (char *)(ulong)(iVar5 - 1)) {
              lVar7 = *(long *)(unaff_x22 + 0x4c0);
              fVar21 = *(float *)(&UNK_00003b4c + lVar7);
              fVar27 = *(float *)(&UNK_00003b50 + lVar7);
              fVar31 = *(float *)(&UNK_00003b54 + lVar7);
              fVar20 = 1.0;
              if (fVar21 <= 1.0) {
                fVar20 = fVar21;
              }
              fVar35 = 0.0;
              if (0.0 <= fVar21) {
                fVar35 = fVar20;
              }
              fVar21 = *(float *)(&UNK_00003b58 + lVar7) * *(float *)(&UNK_000038e8 + lVar7);
              fVar20 = 1.0;
              if (fVar27 <= 1.0) {
                fVar20 = fVar27;
              }
              fVar22 = 0.0;
              if (0.0 <= fVar27) {
                fVar22 = fVar20;
              }
              iVar5 = -(uint)(fVar31 < 0.0);
              iVar26 = -(uint)(fVar21 < 0.0);
              uVar28 = CONCAT44(fVar21,fVar31) ^
                       (CONCAT44(fVar21,fVar31) ^ uVar23) &
                       CONCAT44(-(uint)((float)(uVar23 >> 0x20) < fVar21),
                                -(uint)((float)uVar23 < fVar31));
              fVar20 = (float)CONCAT13((byte)(uVar28 >> 0x18) & ~(byte)((uint)iVar5 >> 0x18),
                                       CONCAT12((byte)(uVar28 >> 0x10) &
                                                ~(byte)((uint)iVar5 >> 0x10),
                                                CONCAT11((byte)(uVar28 >> 8) &
                                                         ~(byte)((uint)iVar5 >> 8),
                                                         (byte)uVar28 & ~(byte)iVar5)));
              uVar25 = NEON_ushl(CONCAT44((int)((float)(CONCAT17((byte)(uVar28 >> 0x38) &
                                                                 ~(byte)((uint)iVar26 >> 0x18),
                                                                 CONCAT16((byte)(uVar28 >> 0x30) &
                                                                          ~(byte)((uint)iVar26 >>
                                                                                 0x10),
                                                                          CONCAT15((byte)(uVar28 >>
                                                                                         0x28) &
                                                                                   ~(byte)((uint)
                                                  iVar26 >> 8),
                                                  CONCAT14((byte)(uVar28 >> 0x20) & ~(byte)iVar26,
                                                           fVar20)))) >> 0x20) * 255.0 + 0.5),
                                          (int)(fVar20 * 255.0 + 0.5)),uVar24,4);
              func_0x00131634(3,(int)(fVar35 * 255.0 + 0.5) | (int)(fVar22 * 255.0 + 0.5) << 8 |
                                (uint)uVar25 | (uint)((ulong)uVar25 >> 0x20),0xffffffff);
              iVar5 = *(int *)(&UNK_000060b8 + unaff_x23);
            }
            pcVar14 = pcVar14 + 1;
            unaff_x24 = unaff_x24 + 0x40;
          } while ((long)pcVar14 < (long)iVar5);
        }
      }
      func_0x0012f400();
    }
  }
  puVar19 = &UNK_000e42f8;
code_r0x000cea90:
  lVar7 = lRam0000000000a334c0;
  *(char **)((long)register0x00000008 + -0x40) = unaff_x24;
  *(long *)((long)register0x00000008 + -0x38) = unaff_x23;
  *(long *)((long)register0x00000008 + -0x30) = unaff_x22;
  *(char **)((long)register0x00000008 + -0x28) = unaff_x21;
  *(char **)((long)register0x00000008 + -0x20) = pcVar14;
  *(undefined4 **)((long)register0x00000008 + -0x18) = puVar13;
  *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar19;
  lVar15 = *(long *)(lRam0000000000a334c0 + 0x4000);
  if ((*(int *)(&UNK_00003fd0 + lRam0000000000a334c0) < 2) &&
     ((&UNK_00003f65)[lRam0000000000a334c0] != '\0')) {
    return;
  }
  lVar16 = lVar15;
  if (*(long *)(lVar15 + 0x1b8) != 0) {
    func_0x00135d60();
    lVar16 = *(long *)(lRam0000000000a334c0 + 0x4000);
  }
  *(undefined1 *)(lVar16 + 0xc0) = 1;
  func_0x000f0b24(*(undefined8 *)(lVar16 + 0x2a8));
  lVar1 = *(long *)(*(long *)(lVar16 + 0x2a8) + 0x60) +
          (long)*(int *)(*(long *)(lVar16 + 0x2a8) + 0x58) * 0x10;
  uVar24 = *(undefined8 *)(lVar1 + -0x10);
  *(undefined8 *)(lVar16 + 0x250) = *(undefined8 *)(lVar1 + -8);
  *(undefined8 *)(lVar16 + 0x248) = uVar24;
  lVar16 = lRam0000000000a334c0;
  iVar5 = *(int *)(&UNK_00004aa0 + lRam0000000000a334c0);
  if (iVar5 != 0) {
    puVar13 = (undefined4 *)(&UNK_00004978 + lRam0000000000a334c0);
    *(int *)(&UNK_00004aa0 + lRam0000000000a334c0) = iVar5 + -1;
    if (iVar5 + -1 == 0) {
      uVar10 = 0;
    }
    else {
      uVar10 = *(undefined4 *)
                (*(long *)(&UNK_00004aa8 + lVar16) +
                (-(ulong)(iVar5 - 2U >> 0x1f) & 0xfffffff800000000 | (ulong)(iVar5 - 2U) << 3));
    }
    *puVar13 = uVar10;
  }
  if ((*(byte *)(lVar15 + 0x17) & 1) == 0) {
    func_0x000d2c88();
  }
  if (*(char *)(lVar15 + 0x151) != '\0') {
    lVar16 = *(long *)(lRam0000000000a334c0 + 0x4000);
    *(undefined1 *)(lVar16 + 0x151) = 0;
    uVar23 = *(ulong *)(lVar16 + 0x128);
    uVar28 = *(ulong *)(lVar16 + 0x110);
    *(ulong *)(lVar16 + 0x128) =
         uVar23 ^ (uVar23 ^ uVar28) &
                  ~CONCAT44(-(uint)((float)(uVar28 >> 0x20) <= (float)(uVar23 >> 0x20)),
                            -(uint)((float)uVar28 <= (float)uVar23));
  }
  iVar5 = *(int *)(&UNK_00003fd0 + lVar7);
  iVar26 = iVar5 + -1;
  lVar16 = *(long *)(&UNK_00003fd8 + lVar7) + (long)iVar26 * 0x68;
  uVar24 = *(undefined8 *)(lVar16 + 8);
  *(undefined8 *)(&UNK_000049b0 + lVar7) = *(undefined8 *)(lVar16 + 0x10);
  *(undefined8 *)(&UNK_000049a8 + lVar7) = uVar24;
  uVar25 = *(undefined8 *)(lVar16 + 0x30);
  uVar24 = *(undefined8 *)(lVar16 + 0x28);
  uVar30 = *(undefined8 *)(lVar16 + 0x40);
  uVar29 = *(undefined8 *)(lVar16 + 0x38);
  uVar32 = *(undefined8 *)(lVar16 + 0x44);
  uVar34 = *(undefined8 *)(lVar16 + 0x20);
  uVar33 = *(undefined8 *)(lVar16 + 0x18);
  *(undefined8 *)(&UNK_000049ec + lVar7) = *(undefined8 *)(lVar16 + 0x4c);
  *(undefined8 *)(&UNK_000049e4 + lVar7) = uVar32;
  *(undefined8 *)(&UNK_000049d0 + lVar7) = uVar25;
  *(undefined8 *)(&UNK_000049c8 + lVar7) = uVar24;
  *(undefined8 *)(&UNK_000049e0 + lVar7) = uVar30;
  *(undefined8 *)(&UNK_000049d8 + lVar7) = uVar29;
  *(undefined8 *)(&UNK_000049c0 + lVar7) = uVar34;
  *(undefined8 *)(&UNK_000049b8 + lVar7) = uVar33;
  uVar2 = *(uint *)(lVar15 + 0x14);
  if ((uVar2 >> 0x1c & 1) != 0) {
    *(int *)(&UNK_00004b00 + lVar7) = *(int *)(&UNK_00004b00 + lVar7) + -1;
  }
  if ((uVar2 >> 0x1a & 1) == 0) {
    *(int *)(&UNK_00003fd0 + lVar7) = iVar26;
    lVar15 = lRam0000000000a334c0;
  }
  else {
    *(int *)(&UNK_00004ae0 + lVar7) = *(int *)(&UNK_00004ae0 + lVar7) + -1;
    *(int *)(&UNK_00003fd0 + lVar7) = iVar26;
    lVar15 = lRam0000000000a334c0;
  }
  lRam0000000000a334c0 = lVar15;
  if (iVar26 == 0) {
    *(undefined8 *)(lVar15 + 0x4000) = 0;
  }
  else {
    plVar6 = *(long **)(*(long *)(&UNK_00003fd8 + lVar7) + (long)(iVar5 + -2) * 0x68);
    *(long **)(lVar15 + 0x4000) = plVar6;
    if (plVar6 != (long *)0x0) {
      if ((int)plVar6[0x38] == -1) {
        lVar7 = 0;
      }
      else {
        lVar7 = *(long *)(&UNK_00004e40 + lVar15) + (long)(int)plVar6[0x38] * 0x250;
      }
      *(long *)(&UNK_00004e18 + lVar15) = lVar7;
      fVar20 = *(float *)(&UNK_00003d3c + *plVar6) * *(float *)(plVar6 + 0x54);
      if (plVar6[0x6f] != 0) {
        fVar20 = fVar20 * *(float *)(plVar6[0x6f] + 0x2a0);
      }
      *(float *)(&UNK_00003d50 + lVar15) = fVar20;
      *(float *)(&UNK_00003d38 + lVar15) = fVar20;
      if (lVar7 == 0) {
        *(bool *)(plVar6 + 0x2e) = plVar6[0x37] == 0;
        return;
      }
      *(undefined1 *)(plVar6 + 0x2e) = 0;
      return;
    }
  }
  *(undefined8 *)(&UNK_00004e18 + lVar15) = 0;
  return;
}

