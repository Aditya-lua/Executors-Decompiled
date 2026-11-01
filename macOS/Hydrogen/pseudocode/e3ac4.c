
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
/* WARNING: Removing unreachable block (ram,0x000e3a80) */
/* WARNING: Removing unreachable block (ram,0x000e3a90) */

void FUN_000e3ac4(long param_1,undefined8 *param_2)

{
  int *piVar1;
  long lVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  long lVar6;
  int *in_x9;
  long in_x10;
  short sVar7;
  int in_w11;
  long lVar8;
  long lVar9;
  long lVar10;
  long unaff_x19;
  long unaff_x20;
  char *unaff_x21;
  char *unaff_x22;
  char *unaff_x23;
  char *pcVar11;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  float *unaff_x27;
  int *unaff_x28;
  float fVar12;
  float fVar13;
  undefined8 uVar14;
  float fVar15;
  float unaff_s8;
  undefined8 unaff_d9;
  undefined8 unaff_d10;
  float unaff_s11;
  float unaff_s12;
  float unaff_s13;
  float unaff_s14;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  undefined4 *in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000030;
  undefined1 uStack0000000000000040;
  int iStack0000000000000048;
  int iStack000000000000004c;
  undefined8 uStack0000000000000068;
  undefined8 uStack0000000000000070;
  
  lVar6 = param_1 + in_x10 * 8;
  if (*(int *)(&UNK_000060dc + lVar6) == in_w11) {
    sVar7 = *(short *)(&UNK_000060e0 + lVar6) + 1;
  }
  else {
    iVar5 = ((int)in_x10 + 1) % 6;
    *(short *)(in_x9 + 2) = (short)iVar5;
    in_x10 = (long)iVar5;
    lVar6 = param_1 + (long)iVar5 * 8;
    *(int *)(&UNK_000060dc + lVar6) = in_w11;
    *(undefined4 *)(&UNK_000060e0 + lVar6) = 0;
    sVar7 = 1;
  }
  *(short *)(&UNK_000060e0 + param_1 + in_x10 * 8) = sVar7;
  *in_x9 = *in_x9 + 1;
  param_2[0x18] = 0;
  param_2[0x15] = 0;
  param_2[0x14] = 0;
  param_2[0x17] = 0;
  param_2[0x16] = 0;
  param_2[0x11] = 0;
  param_2[0x10] = 0;
  param_2[0x13] = 0;
  param_2[0x12] = 0;
  param_2[0xd] = 0;
  param_2[0xc] = 0;
  param_2[0xf] = 0;
  param_2[0xe] = 0;
  param_2[9] = 0;
  param_2[8] = 0;
  param_2[0xb] = 0;
  param_2[10] = 0;
  param_2[5] = 0;
  param_2[4] = 0;
  param_2[7] = 0;
  param_2[6] = 0;
  param_2[1] = 0;
  *param_2 = 0;
  param_2[3] = 0;
  param_2[2] = 0;
  param_2[7] = &UNK_00003d40 + unaff_x24;
  param_2[8] = "##Foreground";
  *(undefined8 **)(in_stack_00000020 + 0x40) = param_2;
  if (*(int *)(in_stack_00000020 + 0x34) != *(int *)(&UNK_00003f58 + unaff_x24)) {
    func_0x000ef410();
    func_0x000f0b5c(param_2,*(undefined8 *)(*(long *)(unaff_x24 + 0x38) + 8));
    uVar14 = *(undefined8 *)(in_stack_00000020 + 4);
    uStack0000000000000070 =
         CONCAT44((float)((ulong)uVar14 >> 0x20) +
                  (float)((ulong)*(undefined8 *)(in_stack_00000020 + 0xc) >> 0x20),
                  (float)uVar14 + (float)*(undefined8 *)(in_stack_00000020 + 0xc));
    func_0x000f0930(param_2,(undefined8 *)(in_stack_00000020 + 4),&uStack0000000000000070,0);
    *(undefined4 *)(in_stack_00000020 + 0x34) = *(undefined4 *)(&UNK_00003f58 + unaff_x24);
  }
  uStack0000000000000070 =
       CONCAT44((float)((ulong)*(undefined8 *)(in_stack_00000030 + 0xc) >> 0x20) +
                (float)((ulong)unaff_d9 >> 0x20),
                (float)*(undefined8 *)(in_stack_00000030 + 0xc) + (float)unaff_d9);
  uStack0000000000000068 =
       CONCAT44((float)((ulong)*(undefined8 *)(in_stack_00000030 + 0x14) >> 0x20) +
                (float)((ulong)unaff_d10 >> 0x20),
                (float)*(undefined8 *)(in_stack_00000030 + 0x14) + (float)unaff_d10);
  func_0x000f3af4(0,0x3f800000,param_2,&uStack0000000000000070,&uStack0000000000000068,0xff00ff00,0)
  ;
  if ((*(char *)(unaff_x24 + 0x78) != '\0') && (unaff_s11 < *(float *)(in_stack_00000030 + 0x544)))
  {
    func_0x000e6248(0,"in ItemAdd()");
    iVar5 = func_0x000d7798(*(undefined4 *)(in_stack_00000010 + 3),0,0);
    if (iVar5 != 0) {
      *(undefined1 *)(in_stack_00000010 + 1) = 1;
    }
  }
  do {
    pcVar11 = unaff_x23 + 1;
    if (unaff_x21 < unaff_x23 + 1) {
code_r0x000e3678:
      do {
        lVar6 = unaff_x20;
        if (iStack000000000000004c <= unaff_x20) {
          do {
            iVar5 = func_0x000bb10c(&uStack0000000000000040);
            if (iVar5 == 0) {
              *in_stack_00000018 = in_stack_00000008._4_4_;
              lVar6 = *(long *)(*(long *)(unaff_x25 + 0x4c0) + 0x4000);
              if (*(float *)(lVar6 + 0x98) <= *(float *)(lVar6 + 0x90)) {
                fVar13 = *(float *)(lVar6 + 0x5c);
                fVar12 = fVar13;
                if (fVar13 < *(float *)(&UNK_00003938 + *(long *)(unaff_x25 + 0x4c0))) {
                  fVar12 = *(float *)(&UNK_00003938 + *(long *)(unaff_x25 + 0x4c0));
                }
                fVar15 = *(float *)(lVar6 + 0x11c) - fVar12;
                *(float *)(lVar6 + 0xa0) =
                     (float)(int)(*(float *)(lVar6 + 0x90) +
                                 ((((fVar15 + ((fVar12 + *(float *)(lVar6 + 0x11c) +
                                                         *(float *)(lVar6 + 0x144)) - fVar15)) -
                                   *(float *)(lVar6 + 0x2c)) - *(float *)(lVar6 + 0x6c)) -
                                 *(float *)(lVar6 + 0x7c)));
                *(undefined4 *)(lVar6 + 0xa8) = 0x3f800000;
                fVar15 = 0.0;
                if (0.0 < fVar13 - fVar12) {
                  fVar15 = fVar13 - fVar12;
                }
                *(float *)(lVar6 + 0xb0) = fVar15;
              }
              func_0x000d0b80();
              func_0x000cea90();
              func_0x000ba9f0(&uStack0000000000000040);
              return;
            }
            lVar6 = (long)iStack0000000000000048;
          } while (iStack000000000000004c <= iStack0000000000000048);
        }
        lVar2 = 0xa334c8;
        if (*(long *)(&UNK_00006048 + unaff_x26) != 0) {
          lVar2 = *(long *)(&UNK_00006048 + unaff_x26);
        }
        unaff_x20 = lVar6 + 1;
        if (unaff_x20 < *unaff_x28) {
          iVar5 = *(int *)(*(long *)(&UNK_00006058 + unaff_x26) + unaff_x20 * 4) + -1;
        }
        else {
          iVar5 = unaff_x28[4];
        }
        unaff_x22 = (char *)(lVar2 + *(int *)(*(long *)(&UNK_00006058 + unaff_x26) + lVar6 * 4));
        func_0x0010adb8(unaff_x22,lVar2 + iVar5);
        unaff_s12 = *unaff_x27;
        unaff_s13 = unaff_x27[1];
        lVar8 = *(long *)(unaff_x25 + 0x4c0);
        piVar1 = (int *)(lVar8 + unaff_x19);
        lVar6 = *(long *)(lVar8 + 0x4000);
        if ((*(char *)((long)piVar1 + 0x1d3) == '\0') || (*(char *)((long)piVar1 + 0x1d2) != '\0'))
        {
          if (((piVar1[2] & 1U) == 0) ||
             ((((uint)piVar1[2] >> 7 & 1) == 0 && (*(long *)(&UNK_00004008 + lVar8) != lVar6))))
          goto code_r0x000e3678;
          iVar3 = *piVar1;
          iVar4 = *(int *)(&UNK_00004064 + lVar8);
          if ((iVar4 != 0 && iVar4 != iVar3) &&
             (((&UNK_00004071)[lVar8] == '\0' && (iVar4 != *(int *)(lVar6 + 0x84)))))
          goto code_r0x000e3678;
          if (((*(long *)(&UNK_00004b18 + lVar8) != 0) &&
              (((lVar9 = *(long *)(*(long *)(&UNK_00004b18 + lVar8) + 0x388), lVar9 != 0 &&
                (*(char *)(lVar9 + 0xbf) != '\0')) &&
               (lVar10 = *(long *)(lVar6 + 0x388), lVar9 != lVar10)))) &&
             (((*(byte *)(lVar9 + 0x17) & 0xc) != 0 && (*(long *)(lVar10 + 0x388) != lVar9)))) {
            do {
              if (lVar10 == lVar9) goto code_r0x000e3794;
              lVar10 = *(long *)(lVar10 + 0x380);
            } while (lVar10 != 0);
            if ((*(byte *)((long)piVar1 + 5) & 1) == 0) goto code_r0x000e3678;
          }
code_r0x000e3794:
          if (((((uint)piVar1[1] >> 2 & 1) != 0) ||
              ((iVar3 == *(int *)(lVar6 + 0x84) && (*(char *)(lVar6 + 0xc0) != '\0')))) ||
             ((((uint)piVar1[1] >> 9 & 1) != 0 &&
              ((iVar3 != 0 && (*(int *)(&UNK_00004054 + lVar8) != iVar3)))))) goto code_r0x000e3678;
        }
        else if (((*(byte *)(piVar1 + 1) >> 2 & 1) != 0) ||
                (piVar1[0x5e] == 0 || piVar1[0x5e] != *piVar1)) goto code_r0x000e3678;
        unaff_x21 = (char *)(lVar2 + iVar5 + -10);
      } while (unaff_x21 < unaff_x22);
      unaff_s14 = unaff_s13 + unaff_s8;
      pcVar11 = unaff_x22;
    }
    if (((*pcVar11 == '0') && ((byte)(pcVar11[1] | 0x20U) == 0x78)) &&
       (iVar5 = _sscanf(pcVar11 + 2,"%X"), iVar5 == 1)) {
      if (pcVar11 == unaff_x22) {
        fVar12 = 0.0;
      }
      else {
        fVar12 = (float)func_0x00106300(*(undefined4 *)
                                         (&UNK_00003d38 + *(long *)(unaff_x25 + 0x4c0)),0x7f7fffff,
                                        0xbf800000,
                                        *(undefined8 *)
                                         (&UNK_00003d30 + *(long *)(unaff_x25 + 0x4c0)),unaff_x22,
                                        pcVar11,0);
        fVar12 = (float)(int)(fVar12 + 0.99999);
      }
      unaff_x23 = pcVar11 + 10;
      fVar15 = 3.4028235e+38;
      fVar13 = (float)func_0x00106300(*(undefined4 *)(&UNK_00003d38 + *(long *)(unaff_x25 + 0x4c0)),
                                      0x7f7fffff,0xbf800000,
                                      *(undefined8 *)(&UNK_00003d30 + *(long *)(unaff_x25 + 0x4c0)),
                                      pcVar11,unaff_x23,0);
      *unaff_x27 = unaff_s12 + fVar12;
      unaff_x27[1] = unaff_s14;
      unaff_x27[2] = unaff_s12 + fVar12 + (float)(int)(fVar13 + 0.99999);
      unaff_x27[3] = unaff_s13 + fVar15;
    }
    else {
      unaff_x23 = pcVar11;
    }
  } while( true );
}

