
void FUN_00133914(void)

{
  int iVar1;
  int *piVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  short sVar8;
  uint uVar9;
  int iVar10;
  long lVar11;
  ulong extraout_x1;
  long lVar12;
  int *piVar13;
  undefined4 uVar14;
  ulong uVar15;
  ulong unaff_x20;
  ulong unaff_x23;
  char *pcVar16;
  char *unaff_x24;
  long unaff_x26;
  int unaff_w28;
  float fVar17;
  float fVar18;
  float unaff_s8;
  float unaff_s11;
  float unaff_s12;
  float unaff_s14;
  float unaff_s15;
  undefined4 uStack0000000000000008;
  undefined4 uStack000000000000000c;
  float in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000050;
  float fStack0000000000000058;
  float fStack000000000000005c;
  long in_stack_00000090;
  
code_r0x00133914:
  pcVar16 = unaff_x24 + 0x50c;
  fVar17 = *(float *)(unaff_x26 + 0x88);
  do {
    fVar18 = 0.0;
    if (0.0 <= unaff_s8) {
      fVar18 = *(float *)(unaff_x26 + 0xc0);
    }
    fStack0000000000000058 =
         *(float *)(in_stack_00000020 + 0x248) + in_stack_00000010 + fVar17 * unaff_s15 + fVar18;
    uStack0000000000000050 = *(undefined8 *)(in_stack_00000020 + 0x248);
    fStack000000000000005c = unaff_s14 + fVar17 + *(float *)(in_stack_00000020 + 0x24c);
    func_0x000bc968(0xbf800000,pcVar16,0,1);
    func_0x000bcb14(fStack0000000000000058,fStack0000000000000058);
    func_0x000f7254(uStack000000000000000c,uStack0000000000000008);
    while( true ) {
      do {
        do {
          unaff_x20 = unaff_x20 + 1;
          if ((long)*(int *)(unaff_x26 + 0x6c) <= (long)unaff_x20) {
            do {
              if ((unaff_x23 & 1) == 0) {
                func_0x000cdeec();
                func_0x000cdeec();
                fVar18 = unaff_s11 -
                         *(float *)(*(long *)(unaff_x26 + 0x18) +
                                    (long)(int)*(short *)(unaff_x26 + 0x21e) * 0x70 + 0xc);
                fVar17 = 0.0;
                if (0.0 < fVar18) {
                  fVar17 = fVar18;
                }
                *(float *)(*(long *)(unaff_x26 + 0x10) + 8) = fVar17;
                if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000090) {
                  return;
                }
                iVar10 = ___stack_chk_fail();
                lVar12 = lRam0000000000a334c0;
                piVar2 = (int *)(&UNK_00005f90 + lRam0000000000a334c0);
                iVar3 = (int)extraout_x1 * 0x10 + 0x18;
                iVar6 = *piVar2;
                iVar7 = *(int *)(&UNK_00005f94 + lRam0000000000a334c0);
                iVar1 = iVar6 + iVar3;
                if (iVar7 < iVar1) {
                  iVar4 = iVar7;
                  if (iVar7 < 0) {
                    iVar4 = iVar7 + 1;
                  }
                  iVar5 = 8;
                  if (iVar7 != 0) {
                    iVar5 = iVar7 + (iVar4 >> 1);
                  }
                  if (iVar5 <= iVar1) {
                    iVar5 = iVar1;
                  }
                  lVar11 = func_0x000b810c((long)iVar5);
                  if (*(long *)(&UNK_00005f98 + lVar12) != 0) {
                    _memcpy(lVar11,*(long *)(&UNK_00005f98 + lVar12),(long)*piVar2);
                    func_0x000b83d4(*(undefined8 *)(&UNK_00005f98 + lVar12));
                  }
                  *(long *)(&UNK_00005f98 + lVar12) = lVar11;
                  *(int *)(&UNK_00005f94 + lVar12) = iVar5;
                }
                else {
                  lVar11 = *(long *)(&UNK_00005f98 + lRam0000000000a334c0);
                }
                *piVar2 = iVar1;
                piVar2 = (int *)(lVar11 + iVar6);
                *piVar2 = iVar3;
                piVar2[1] = 0;
                piVar2[2] = 0;
                piVar2[3] = 0;
                piVar2[4] = 0;
                piVar2[5] = 0;
                if (0 < (int)extraout_x1) {
                  piVar13 = piVar2 + 6;
                  uVar15 = extraout_x1;
                  do {
                    piVar13[0] = 0;
                    piVar13[1] = 0;
                    piVar13[2] = -1;
                    *(undefined2 *)(piVar13 + 3) = 0xffff;
                    *(byte *)((long)piVar13 + 0xe) = *(byte *)((long)piVar13 + 0xe) & 0xf0 | 4;
                    piVar13 = piVar13 + 4;
                    uVar9 = (int)uVar15 - 1;
                    uVar15 = (ulong)uVar9;
                  } while (uVar9 != 0);
                }
                piVar2[1] = iVar10;
                *(short *)(piVar2 + 4) = (short)extraout_x1;
                *(short *)((long)piVar2 + 0x12) = (short)extraout_x1;
                *(undefined1 *)(piVar2 + 5) = 1;
                return;
              }
              unaff_x23 = 0;
            } while (*(int *)(unaff_x26 + 0x6c) < 1);
            unaff_x20 = 0;
          }
        } while ((*(uint *)(*(long *)(unaff_x26 + 0x48) + (unaff_x20 >> 5 & 0x7ffffff) * 4) >>
                  (ulong)((uint)unaff_x20 & 0x1f) & 1) == 0);
        sVar8 = *(short *)(*(long *)(unaff_x26 + 0x28) + unaff_x20 * 2);
      } while ((*(byte *)(*(long *)(unaff_x26 + 0x18) + (long)(int)sVar8 * (long)unaff_w28 + 2) >> 2
               & 1) == 0);
      fVar17 = unaff_s12 +
               *(float *)(*(long *)(unaff_x26 + 0x18) + (long)(int)sVar8 * (long)unaff_w28 + 0xc);
      if ((unaff_x23 & 1) != 0) break;
      if (*(short *)(unaff_x26 + 0x212) == sVar8) {
        uVar14 = 0x1c;
        if (*(short *)(unaff_x26 + 0x7a) == *(short *)(unaff_x26 + 0x78)) {
          uVar14 = 0x1d;
        }
        else if (*(short *)(unaff_x26 + 0x20c) != sVar8) goto code_r0x001338f8;
code_r0x001338d4:
        func_0x000bba44(0x3f800000,uVar14);
      }
      else if (*(short *)(unaff_x26 + 0x20c) == sVar8) {
        uVar14 = 0x1c;
        goto code_r0x001338d4;
      }
code_r0x001338f8:
      func_0x000f397c(0x3f800000);
    }
    func_0x000bba44(0x3f800000,0x2a);
    func_0x000f40b8();
    if (in_stack_00000018._4_4_ == sVar8) {
      func_0x000bba44(0x3f800000,0x18);
      func_0x000f40b8();
    }
    if (unaff_s11 < fVar17) {
      unaff_s11 = fVar17;
    }
    if ((*(char *)(unaff_x26 + 0x236) != '\0') ||
       (pcVar16 = "", sVar8 < *(short *)(unaff_x26 + 0x206))) {
      lVar12 = (long)*(short *)(*(long *)(unaff_x26 + 0x18) + (long)(int)sVar8 * (long)unaff_w28 +
                               0x50);
      if (lVar12 == -1) break;
      pcVar16 = (char *)(*(long *)(unaff_x26 + 0x198) + lVar12);
    }
    fVar17 = *(float *)(unaff_x26 + 0x88);
  } while( true );
  unaff_x24 = "t use \'...\' outside of a vararg function";
  goto code_r0x00133914;
}

