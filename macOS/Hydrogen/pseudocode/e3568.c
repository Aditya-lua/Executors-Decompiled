
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

void FUN_000e3568(long *param_1)

{
  long lVar1;
  char *pcVar2;
  long lVar3;
  uint uVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  long in_x9;
  uint in_w10;
  long in_x11;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  char *pcVar12;
  char *pcVar13;
  char *pcVar14;
  long unaff_x25;
  long unaff_x26;
  float *unaff_x27;
  int *unaff_x28;
  float fVar15;
  float fVar16;
  float fVar17;
  float fVar18;
  float fVar19;
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
  
  lVar11 = in_x11 + 0x404;
  uVar4 = *(uint *)(lVar11 + in_x9 * 4) ^ in_w10 >> 8;
  uVar4 = *(uint *)(lVar11 + (ulong)(uVar4 & 0xff ^ 0x23) * 4) ^ uVar4 >> 8;
  uVar4 = *(uint *)(lVar11 + (ulong)(uVar4 & 0xff ^ 0x6c) * 4) ^ uVar4 >> 8;
  uVar4 = *(uint *)(lVar11 + (ulong)(uVar4 & 0xff ^ 0x6f) * 4) ^ uVar4 >> 8;
  uVar4 = *(uint *)(lVar11 + (ulong)(uVar4 & 0xff ^ 0x67) * 4) ^ uVar4 >> 8 ^ 0xffffffff;
  if (*(uint *)(&UNK_0000404c + *param_1) == uVar4) {
    func_0x000c167c(uVar4,0xb,"##log",0);
  }
  func_0x000d01b4("##log",uVar4,&uStack0000000000000040,1,0xc000);
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
      iVar7 = func_0x000bb10c(&uStack0000000000000040);
      if (iVar7 == 0) {
        *in_stack_00000018 = uStack000000000000000c;
        lVar11 = *(long *)(*(long *)(unaff_x25 + 0x4c0) + 0x4000);
        if (*(float *)(lVar11 + 0x98) <= *(float *)(lVar11 + 0x90)) {
          fVar19 = *(float *)(lVar11 + 0x5c);
          fVar18 = fVar19;
          if (fVar19 < *(float *)(&UNK_00003938 + *(long *)(unaff_x25 + 0x4c0))) {
            fVar18 = *(float *)(&UNK_00003938 + *(long *)(unaff_x25 + 0x4c0));
          }
          fVar15 = *(float *)(lVar11 + 0x11c) - fVar18;
          *(float *)(lVar11 + 0xa0) =
               (float)(int)(*(float *)(lVar11 + 0x90) +
                           ((((fVar15 + ((fVar18 + *(float *)(lVar11 + 0x11c) +
                                                   *(float *)(lVar11 + 0x144)) - fVar15)) -
                             *(float *)(lVar11 + 0x2c)) - *(float *)(lVar11 + 0x6c)) -
                           *(float *)(lVar11 + 0x7c)));
          *(undefined4 *)(lVar11 + 0xa8) = 0x3f800000;
          fVar15 = 0.0;
          if (0.0 < fVar19 - fVar18) {
            fVar15 = fVar19 - fVar18;
          }
          *(float *)(lVar11 + 0xb0) = fVar15;
        }
        func_0x000d0b80();
        func_0x000cea90();
        func_0x000ba9f0(&uStack0000000000000040);
        return;
      }
      lVar11 = (long)iStack0000000000000048;
    } while (iStack000000000000004c <= iStack0000000000000048);
    do {
      lVar3 = 0xa334c8;
      if (*(long *)(&UNK_00006048 + unaff_x26) != 0) {
        lVar3 = *(long *)(&UNK_00006048 + unaff_x26);
      }
      lVar1 = lVar11 + 1;
      if (lVar1 < *unaff_x28) {
        iVar7 = *(int *)(*(long *)(&UNK_00006058 + unaff_x26) + lVar1 * 4) + -1;
      }
      else {
        iVar7 = unaff_x28[4];
      }
      pcVar2 = (char *)(lVar3 + *(int *)(*(long *)(&UNK_00006058 + unaff_x26) + lVar11 * 4));
      func_0x0010adb8(pcVar2,lVar3 + iVar7);
      fVar18 = *unaff_x27;
      fVar19 = unaff_x27[1];
      lVar8 = *(long *)(unaff_x25 + 0x4c0);
      lVar11 = *(long *)(lVar8 + 0x4000);
      if (((&UNK_00004b7b)[lVar8] == '\0') || ((&UNK_00004b7a)[lVar8] != '\0')) {
        if (((*(uint *)(&UNK_000049b0 + lVar8) & 1) != 0) &&
           (((*(uint *)(&UNK_000049b0 + lVar8) >> 7 & 1) != 0 ||
            (*(long *)(&UNK_00004008 + lVar8) == lVar11)))) {
          iVar5 = *(int *)(&UNK_000049a8 + lVar8);
          iVar6 = *(int *)(&UNK_00004064 + lVar8);
          if ((iVar6 == 0 || iVar6 == iVar5) ||
             (((&UNK_00004071)[lVar8] != '\0' || (iVar6 == *(int *)(lVar11 + 0x84))))) {
            if (((*(long *)(&UNK_00004b18 + lVar8) != 0) &&
                (((lVar9 = *(long *)(*(long *)(&UNK_00004b18 + lVar8) + 0x388), lVar9 != 0 &&
                  (*(char *)(lVar9 + 0xbf) != '\0')) &&
                 (lVar10 = *(long *)(lVar11 + 0x388), lVar9 != lVar10)))) &&
               (((*(byte *)(lVar9 + 0x17) & 0xc) != 0 && (*(long *)(lVar10 + 0x388) != lVar9)))) {
              do {
                if (lVar10 == lVar9) goto code_r0x000e3794;
                lVar10 = *(long *)(lVar10 + 0x380);
              } while (lVar10 != 0);
              if (((&UNK_000049ad)[lVar8] & 1) == 0) goto code_r0x000e3678;
            }
code_r0x000e3794:
            if ((((*(uint *)(&UNK_000049ac + lVar8) >> 2 & 1) == 0) &&
                ((iVar5 != *(int *)(lVar11 + 0x84) || (*(char *)(lVar11 + 0xc0) == '\0')))) &&
               (((*(uint *)(&UNK_000049ac + lVar8) >> 9 & 1) == 0 ||
                ((iVar5 == 0 || (*(int *)(&UNK_00004054 + lVar8) == iVar5))))))
            goto code_r0x000e37dc;
          }
        }
      }
      else if ((((byte)(&UNK_000049ac)[lVar8] >> 2 & 1) == 0) &&
              (*(int *)(&UNK_00004b20 + lVar8) != 0 &&
               *(int *)(&UNK_00004b20 + lVar8) == *(int *)(&UNK_000049a8 + lVar8))) {
code_r0x000e37dc:
        pcVar12 = (char *)(lVar3 + iVar7 + -10);
        if (pcVar2 <= pcVar12) {
          pcVar14 = pcVar2;
          do {
            if (((*pcVar14 == '0') && ((byte)(pcVar14[1] | 0x20U) == 0x78)) &&
               (iVar7 = _sscanf(pcVar14 + 2,"%X"), iVar7 == 1)) {
              if (pcVar14 == pcVar2) {
                fVar15 = 0.0;
              }
              else {
                fVar15 = (float)func_0x00106300(*(undefined4 *)
                                                 (&UNK_00003d38 + *(long *)(unaff_x25 + 0x4c0)),
                                                0x7f7fffff,0xbf800000,
                                                *(undefined8 *)
                                                 (&UNK_00003d30 + *(long *)(unaff_x25 + 0x4c0)),
                                                pcVar2,pcVar14,0);
                fVar15 = (float)(int)(fVar15 + 0.99999);
              }
              pcVar13 = pcVar14 + 10;
              fVar17 = 3.4028235e+38;
              fVar16 = (float)func_0x00106300(*(undefined4 *)
                                               (&UNK_00003d38 + *(long *)(unaff_x25 + 0x4c0)),
                                              0x7f7fffff,0xbf800000,
                                              *(undefined8 *)
                                               (&UNK_00003d30 + *(long *)(unaff_x25 + 0x4c0)),
                                              pcVar14,pcVar13,0);
              *unaff_x27 = fVar18 + fVar15;
              unaff_x27[1] = fVar19 + 0.0;
              unaff_x27[2] = fVar18 + fVar15 + (float)(int)(fVar16 + 0.99999);
              unaff_x27[3] = fVar19 + fVar17;
            }
            else {
              pcVar13 = pcVar14;
            }
            pcVar14 = pcVar13 + 1;
          } while (pcVar14 <= pcVar12);
        }
      }
code_r0x000e3678:
      lVar11 = lVar1;
    } while (lVar1 < iStack000000000000004c);
  } while( true );
}

