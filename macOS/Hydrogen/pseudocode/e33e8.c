
/* WARNING: Removing unreachable block (ram,0x000e396c) */
/* WARNING: Removing unreachable block (ram,0x000e3984) */
/* WARNING: Removing unreachable block (ram,0x000e398c) */
/* WARNING: Removing unreachable block (ram,0x000e3994) */
/* WARNING: Removing unreachable block (ram,0x000e3998) */
/* WARNING: Removing unreachable block (ram,0x000e39a4) */
/* WARNING: Removing unreachable block (ram,0x000e39b4) */
/* WARNING: Removing unreachable block (ram,0x000e39bc) */
/* WARNING: Removing unreachable block (ram,0x000e39c4) */
/* WARNING: Removing unreachable block (ram,0x000e39d0) */
/* WARNING: Removing unreachable block (ram,0x000e39d8) */
/* WARNING: Removing unreachable block (ram,0x000e39e4) */
/* WARNING: Removing unreachable block (ram,0x000e39ec) */
/* WARNING: Removing unreachable block (ram,0x000e39f4) */
/* WARNING: Removing unreachable block (ram,0x000e3a00) */
/* WARNING: Removing unreachable block (ram,0x000e3a0c) */
/* WARNING: Removing unreachable block (ram,0x000e3a18) */
/* WARNING: Removing unreachable block (ram,0x000e3a20) */
/* WARNING: Removing unreachable block (ram,0x000e3a24) */
/* WARNING: Removing unreachable block (ram,0x000e3a28) */
/* WARNING: Removing unreachable block (ram,0x000e3a34) */
/* WARNING: Removing unreachable block (ram,0x000e3a38) */
/* WARNING: Removing unreachable block (ram,0x000e3a40) */
/* WARNING: Removing unreachable block (ram,0x000e3a48) */
/* WARNING: Removing unreachable block (ram,0x000e3a54) */
/* WARNING: Removing unreachable block (ram,0x000e3a94) */
/* WARNING: Removing unreachable block (ram,0x000e3ab4) */
/* WARNING: Removing unreachable block (ram,0x000e3ae8) */
/* WARNING: Removing unreachable block (ram,0x000e3ad8) */
/* WARNING: Removing unreachable block (ram,0x000e3b28) */
/* WARNING: Removing unreachable block (ram,0x000e3b3c) */
/* WARNING: Removing unreachable block (ram,0x000e3a80) */
/* WARNING: Removing unreachable block (ram,0x000e3b8c) */
/* WARNING: Removing unreachable block (ram,0x000e3a90) */
/* WARNING: Removing unreachable block (ram,0x000e3bd4) */
/* WARNING: Removing unreachable block (ram,0x000e3c14) */
/* WARNING: Removing unreachable block (ram,0x000e3c1c) */
/* WARNING: Removing unreachable block (ram,0x000e3c20) */
/* WARNING: Removing unreachable block (ram,0x000e3c24) */
/* WARNING: Removing unreachable block (ram,0x000e3c4c) */

void FUN_000e33e8(undefined8 param_1)

{
  long lVar1;
  char *pcVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  int iVar6;
  long lVar7;
  long lVar8;
  long *plVar9;
  long lVar10;
  short sVar11;
  long lVar12;
  long lVar13;
  long unaff_x19;
  char *pcVar14;
  char *pcVar15;
  char *pcVar16;
  long unaff_x25;
  long unaff_x26;
  float *unaff_x27;
  int *unaff_x28;
  float fVar17;
  float fVar18;
  float fVar19;
  float fVar20;
  float fVar21;
  uint uStack000000000000000c;
  uint *in_stack_00000018;
  undefined8 uStack0000000000000040;
  int iStack0000000000000048;
  int iStack000000000000004c;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  
  (**(code **)(unaff_x19 + 0xda8))(param_1,uRam0000000000a33a18);
  *(undefined8 *)(&UNK_00006048 + unaff_x26) = 0;
  lVar7 = *(long *)(&UNK_00006058 + unaff_x26);
  if (lVar7 != 0) {
    *(undefined8 *)(&UNK_00006050 + unaff_x26) = 0;
    lVar8 = *(long *)(unaff_x25 + 0x4c0);
    if (lVar8 != 0) {
      lVar10 = (long)*(short *)(&UNK_000060d8 + lVar8);
      lVar1 = lVar8 + lVar10 * 8;
      if (*(int *)(&UNK_000060dc + lVar1) == *(int *)(&UNK_00003f58 + lVar8)) {
        sVar11 = *(short *)(&UNK_000060e2 + lVar1) + 1;
      }
      else {
        iVar6 = (*(short *)(&UNK_000060d8 + lVar8) + 1) % 6;
        *(short *)(&UNK_000060d8 + lVar8) = (short)iVar6;
        lVar10 = (long)iVar6;
        lVar1 = lVar8 + (long)iVar6 * 8;
        *(int *)(&UNK_000060dc + lVar1) = *(int *)(&UNK_00003f58 + lVar8);
        *(undefined4 *)(&UNK_000060e0 + lVar1) = 0;
        sVar11 = 1;
      }
      *(short *)(&UNK_000060e2 + lVar8 + lVar10 * 8) = sVar11;
      *(int *)(&UNK_000060d4 + lVar8) = *(int *)(&UNK_000060d4 + lVar8) + 1;
    }
    (**(code **)(unaff_x19 + 0xda8))(lVar7,uRam0000000000a33a18);
    *(undefined8 *)(&UNK_00006058 + unaff_x26) = 0;
  }
  unaff_x28[4] = 0;
  lVar7 = *(long *)(*(long *)(unaff_x25 + 0x4c0) + 0x4000);
  if (*(char *)(lVar7 + 0xc3) == '\0') {
    *(float *)(lVar7 + 0x110) =
         *(float *)(&UNK_00003934 + *(long *)(unaff_x25 + 0x4c0)) + *(float *)(lVar7 + 0x118);
    *(undefined4 *)(lVar7 + 0x114) = *(undefined4 *)(lVar7 + 0x11c);
    *(undefined8 *)(lVar7 + 0x138) = *(undefined8 *)(lVar7 + 0x140);
    *(undefined4 *)(lVar7 + 0x148) = *(undefined4 *)(lVar7 + 0x14c);
    *(undefined1 *)(lVar7 + 0x150) = 1;
    iVar6 = func_0x0010beb8("Copy");
    lVar7 = *(long *)(unaff_x25 + 0x4c0);
  }
  else {
    iVar6 = func_0x0010beb8("Copy");
    lVar7 = *(long *)(unaff_x25 + 0x4c0);
  }
  if ((iVar6 != 0) && (*(code **)(lVar7 + 0xb0) != (code *)0x0)) {
    lVar8 = 0xa334c8;
    if (*(long *)(&UNK_00006048 + unaff_x26) != 0) {
      lVar8 = *(long *)(&UNK_00006048 + unaff_x26);
    }
    (**(code **)(lVar7 + 0xb0))(*(undefined8 *)(lVar7 + 0xb8),lVar8);
    lVar7 = *(long *)(unaff_x25 + 0x4c0);
  }
  uStack0000000000000040 = 0;
  plVar9 = *(long **)(lVar7 + 0x4000);
  *(undefined1 *)(plVar9 + 0x18) = 1;
  uVar5 = *(uint *)(plVar9[0x21] + (long)(int)plVar9[0x20] * 4 + -4);
  uVar5 = *(uint *)(&UNK_0080c404 + ((ulong)uVar5 & 0xff ^ 0xdc) * 4) ^ ~uVar5 >> 8;
  uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ 0x23) * 4) ^ uVar5 >> 8;
  uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ 0x6c) * 4) ^ uVar5 >> 8;
  uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ 0x6f) * 4) ^ uVar5 >> 8;
  uVar5 = *(uint *)(&UNK_0080c404 + (ulong)(uVar5 & 0xff ^ 0x67) * 4) ^ uVar5 >> 8 ^ 0xffffffff;
  if (*(uint *)(&UNK_0000404c + *plVar9) == uVar5) {
    func_0x000c167c(uVar5,0xb,"##log",0);
  }
  func_0x000d01b4("##log",uVar5,&uStack0000000000000040,1,0xc000);
  uStack000000000000000c = *in_stack_00000018;
  *in_stack_00000018 = uStack000000000000000c & 0xffffffef;
  in_stack_00000060 = 0;
  _iStack0000000000000048 = 0;
  uStack0000000000000040 = 0;
  in_stack_00000058 = 0;
  in_stack_00000050 = 0;
  func_0x000bab98(0xbf800000,&uStack0000000000000040,*unaff_x28);
  NEON_fmov(0xc0400000,4);
  NEON_fmov(0x40400000,4);
  do {
    do {
      iVar6 = func_0x000bb10c(&uStack0000000000000040);
      if (iVar6 == 0) {
        *in_stack_00000018 = uStack000000000000000c;
        lVar7 = *(long *)(*(long *)(unaff_x25 + 0x4c0) + 0x4000);
        if (*(float *)(lVar7 + 0x98) <= *(float *)(lVar7 + 0x90)) {
          fVar21 = *(float *)(lVar7 + 0x5c);
          fVar20 = fVar21;
          if (fVar21 < *(float *)(&UNK_00003938 + *(long *)(unaff_x25 + 0x4c0))) {
            fVar20 = *(float *)(&UNK_00003938 + *(long *)(unaff_x25 + 0x4c0));
          }
          fVar17 = *(float *)(lVar7 + 0x11c) - fVar20;
          *(float *)(lVar7 + 0xa0) =
               (float)(int)(*(float *)(lVar7 + 0x90) +
                           ((((fVar17 + ((fVar20 + *(float *)(lVar7 + 0x11c) +
                                                   *(float *)(lVar7 + 0x144)) - fVar17)) -
                             *(float *)(lVar7 + 0x2c)) - *(float *)(lVar7 + 0x6c)) -
                           *(float *)(lVar7 + 0x7c)));
          *(undefined4 *)(lVar7 + 0xa8) = 0x3f800000;
          fVar17 = 0.0;
          if (0.0 < fVar21 - fVar20) {
            fVar17 = fVar21 - fVar20;
          }
          *(float *)(lVar7 + 0xb0) = fVar17;
        }
        func_0x000d0b80();
        func_0x000cea90();
        func_0x000ba9f0(&uStack0000000000000040);
        return;
      }
      lVar7 = (long)iStack0000000000000048;
    } while (iStack000000000000004c <= iStack0000000000000048);
    do {
      lVar8 = 0xa334c8;
      if (*(long *)(&UNK_00006048 + unaff_x26) != 0) {
        lVar8 = *(long *)(&UNK_00006048 + unaff_x26);
      }
      lVar1 = lVar7 + 1;
      if (lVar1 < *unaff_x28) {
        iVar6 = *(int *)(*(long *)(&UNK_00006058 + unaff_x26) + lVar1 * 4) + -1;
      }
      else {
        iVar6 = unaff_x28[4];
      }
      pcVar2 = (char *)(lVar8 + *(int *)(*(long *)(&UNK_00006058 + unaff_x26) + lVar7 * 4));
      func_0x0010adb8(pcVar2,lVar8 + iVar6);
      fVar20 = *unaff_x27;
      fVar21 = unaff_x27[1];
      lVar10 = *(long *)(unaff_x25 + 0x4c0);
      lVar7 = *(long *)(lVar10 + 0x4000);
      if (((&UNK_00004b7b)[lVar10] == '\0') || ((&UNK_00004b7a)[lVar10] != '\0')) {
        if (((*(uint *)(&UNK_000049b0 + lVar10) & 1) != 0) &&
           (((*(uint *)(&UNK_000049b0 + lVar10) >> 7 & 1) != 0 ||
            (*(long *)(&UNK_00004008 + lVar10) == lVar7)))) {
          iVar3 = *(int *)(&UNK_000049a8 + lVar10);
          iVar4 = *(int *)(&UNK_00004064 + lVar10);
          if ((iVar4 == 0 || iVar4 == iVar3) ||
             (((&UNK_00004071)[lVar10] != '\0' || (iVar4 == *(int *)(lVar7 + 0x84))))) {
            if (((*(long *)(&UNK_00004b18 + lVar10) != 0) &&
                (((lVar12 = *(long *)(*(long *)(&UNK_00004b18 + lVar10) + 0x388), lVar12 != 0 &&
                  (*(char *)(lVar12 + 0xbf) != '\0')) &&
                 (lVar13 = *(long *)(lVar7 + 0x388), lVar12 != lVar13)))) &&
               (((*(byte *)(lVar12 + 0x17) & 0xc) != 0 && (*(long *)(lVar13 + 0x388) != lVar12)))) {
              do {
                if (lVar13 == lVar12) goto code_r0x000e3794;
                lVar13 = *(long *)(lVar13 + 0x380);
              } while (lVar13 != 0);
              if (((&UNK_000049ad)[lVar10] & 1) == 0) goto code_r0x000e3678;
            }
code_r0x000e3794:
            if ((((*(uint *)(&UNK_000049ac + lVar10) >> 2 & 1) == 0) &&
                ((iVar3 != *(int *)(lVar7 + 0x84) || (*(char *)(lVar7 + 0xc0) == '\0')))) &&
               (((*(uint *)(&UNK_000049ac + lVar10) >> 9 & 1) == 0 ||
                ((iVar3 == 0 || (*(int *)(&UNK_00004054 + lVar10) == iVar3))))))
            goto code_r0x000e37dc;
          }
        }
      }
      else if ((((byte)(&UNK_000049ac)[lVar10] >> 2 & 1) == 0) &&
              (*(int *)(&UNK_00004b20 + lVar10) != 0 &&
               *(int *)(&UNK_00004b20 + lVar10) == *(int *)(&UNK_000049a8 + lVar10))) {
code_r0x000e37dc:
        pcVar14 = (char *)(lVar8 + iVar6 + -10);
        if (pcVar2 <= pcVar14) {
          pcVar16 = pcVar2;
          do {
            if (((*pcVar16 == '0') && ((byte)(pcVar16[1] | 0x20U) == 0x78)) &&
               (iVar6 = _sscanf(pcVar16 + 2,"%X"), iVar6 == 1)) {
              if (pcVar16 == pcVar2) {
                fVar17 = 0.0;
              }
              else {
                fVar17 = (float)func_0x00106300(*(undefined4 *)
                                                 (&UNK_00003d38 + *(long *)(unaff_x25 + 0x4c0)),
                                                0x7f7fffff,0xbf800000,
                                                *(undefined8 *)
                                                 (&UNK_00003d30 + *(long *)(unaff_x25 + 0x4c0)),
                                                pcVar2,pcVar16,0);
                fVar17 = (float)(int)(fVar17 + 0.99999);
              }
              pcVar15 = pcVar16 + 10;
              fVar19 = 3.4028235e+38;
              fVar18 = (float)func_0x00106300(*(undefined4 *)
                                               (&UNK_00003d38 + *(long *)(unaff_x25 + 0x4c0)),
                                              0x7f7fffff,0xbf800000,
                                              *(undefined8 *)
                                               (&UNK_00003d30 + *(long *)(unaff_x25 + 0x4c0)),
                                              pcVar16,pcVar15,0);
              *unaff_x27 = fVar20 + fVar17;
              unaff_x27[1] = fVar21 + 0.0;
              unaff_x27[2] = fVar20 + fVar17 + (float)(int)(fVar18 + 0.99999);
              unaff_x27[3] = fVar21 + fVar19;
            }
            else {
              pcVar15 = pcVar16;
            }
            pcVar16 = pcVar15 + 1;
          } while (pcVar16 <= pcVar14);
        }
      }
code_r0x000e3678:
      lVar7 = lVar1;
    } while (lVar1 < iStack000000000000004c);
  } while( true );
}

