
int FUN_00096e70(void)

{
  int *piVar1;
  uint *puVar2;
  char *pcVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  int iVar7;
  int iVar8;
  int iVar9;
  long lVar10;
  ulong uVar11;
  long lVar12;
  undefined8 uVar13;
  int iVar14;
  long lVar15;
  undefined8 *puVar16;
  ulong uVar17;
  uint *puVar18;
  undefined8 uVar19;
  char *unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  int *piVar20;
  long unaff_x22;
  uint unaff_w23;
  ulong unaff_x24;
  undefined8 *unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long lVar21;
  long *unaff_x28;
  long *plVar22;
  long unaff_x29;
  long lStack0000000000000008;
  int iStack0000000000000014;
  undefined8 *in_stack_00000020;
  undefined8 *in_stack_00000028;
  undefined8 *in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 *in_stack_00000048;
  undefined8 *in_stack_00000050;
  undefined8 *in_stack_00000058;
  undefined8 *in_stack_00000060;
  undefined8 *in_stack_00000068;
  undefined8 *in_stack_00000070;
  undefined8 *in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 uStack0000000000000088;
  undefined8 uStack0000000000000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined8 uStack0000000000000128;
  undefined8 in_stack_00000130;
  undefined4 in_stack_00000138;
  undefined1 uStack0000000000000170;
  long in_stack_00000378;
  long in_stack_00000398;
  long in_stack_000003a0;
  long in_stack_000003d0;
  long in_stack_000003d8;
  
code_r0x00096e70:
  if (*unaff_x19 != '_') goto LAB_00096e44;
  iVar9 = _strcmp(in_stack_00000080,unaff_x19 + 1);
  if (iVar9 != 0) goto LAB_00096e44;
code_r0x00096e8c:
  iVar9 = 0;
  *unaff_x21 = unaff_x20 + unaff_x22;
  unaff_x27 = in_stack_000003d8;
joined_r0x00096edc:
  unaff_w23 = unaff_w23 + 1;
  if ((in_stack_00000038._4_4_ <= unaff_w23) || (iVar9 != 0x12)) goto LAB_00097088;
  lVar10 = __dyld_get_image_name(unaff_w23);
  if ((lVar10 != 0) &&
     (((unaff_x26 == 0 || (lVar10 = _strnstr(), lVar10 != 0)) &&
      (uVar11 = __dyld_get_image_header(unaff_w23), uVar11 != 0)))) {
    uStack0000000000000090 = 0;
    uStack0000000000000128 = 0;
    in_stack_00000130 = 0;
    in_stack_00000138 = 0;
    uStack0000000000000088._4_4_ = 5;
    ___shared_region_check_np(&uStack0000000000000090);
    lVar10 = uStack0000000000000090;
    if (uStack0000000000000090 == 0) {
      iVar9 = _task_info(*(undefined4 *)PTR__mach_task_self__009b0440,0x11,&uStack0000000000000128,
                         (long)&uStack0000000000000088 + 4);
      if (iVar9 == 0) {
        lVar10 = *(long *)(uStack0000000000000128 + 0xb0);
        goto code_r0x00096b48;
      }
    }
    else {
code_r0x00096b48:
      lVar15 = *(long *)(lVar10 + (ulong)*(uint *)(lVar10 + 0x10));
      _bzero(&uStack0000000000000128,0x400);
      lVar12 = _dyld_shared_cache_file_path();
      if (lVar12 != 0) {
        ___strncat_chk(&uStack0000000000000128,lVar12,0x400,0x400);
        ___strncat_chk(&uStack0000000000000128,".symbols",9,0x400);
        in_stack_00000118 = 0;
        in_stack_00000110 = 0;
        in_stack_000000f8 = 0;
        in_stack_000000f0 = 0;
        in_stack_00000108 = 0;
        in_stack_00000100 = 0;
        in_stack_000000d8 = 0;
        in_stack_000000d0 = 0;
        in_stack_000000e8 = 0;
        in_stack_000000e0 = 0;
        in_stack_000000b8 = 0;
        in_stack_000000b0 = 0;
        in_stack_000000c8 = 0;
        in_stack_000000c0 = 0;
        in_stack_00000098 = 0;
        uStack0000000000000090 = 0;
        in_stack_000000a8 = 0;
        in_stack_000000a0 = 0;
        iVar9 = _stat(&uStack0000000000000128,&uStack0000000000000090);
        uVar13 = in_stack_000000f0;
        if ((iVar9 == 0) && (uVar19 = _open(&uStack0000000000000128,0), -1 < (int)uVar19)) {
          lVar21 = _mmap(0,uVar13,3,2,uVar19,0);
          _close(uVar19);
          if (lVar21 == -1) goto code_r0x00096bc4;
          lVar12 = *(long *)(lVar21 + 0x48);
          if (lVar10 == 0) goto code_r0x00096c5c;
code_r0x00096f40:
          lVar15 = lVar10 - lVar15;
          uVar17 = *(long *)(lVar10 + 0xe0) + lVar15;
          if ((uVar17 <= uVar11) && (uVar11 < uVar17 + *(long *)(lVar10 + 0xe8))) {
            puVar2 = (uint *)(lVar21 + lVar12);
            uVar17 = (ulong)puVar2[5];
            if (puVar2[5] != 0) {
              uVar4 = *puVar2;
              uVar5 = puVar2[2];
              puVar18 = (uint *)(lVar21 + lVar12 + (ulong)puVar2[4] + 0xc);
              do {
                if (*(long *)(puVar18 + -3) == uVar11 - lVar10) {
                  uVar17 = (ulong)*puVar18;
                  if (*puVar18 != 0) {
                    lStack0000000000000008 = 0;
                    lVar10 = 0;
                    uVar6 = puVar18[-1];
                    *unaff_x21 = 0;
                    plVar22 = (long *)(lVar21 + lVar12 + (ulong)uVar6 * 0x10 + (ulong)uVar4 + 8);
                    iStack0000000000000014 = 0x12;
                    goto code_r0x00097008;
                  }
                  break;
                }
                puVar18 = puVar18 + 4;
                uVar17 = uVar17 - 1;
              } while (uVar17 != 0);
            }
          }
        }
        else {
code_r0x00096bc4:
          lVar21 = *(long *)(lVar10 + 0x50);
          if (lVar21 != 0) {
            uVar19 = *(undefined8 *)(lVar10 + 0x48);
            uVar13 = _open(lVar12,0);
            if (-1 < (int)uVar13) {
              lVar21 = _mmap(0,lVar21,3,2,uVar13,uVar19);
              _close(uVar13);
              if (lVar21 != -1) {
                lVar12 = *(long *)(lVar10 + 0x48);
                lVar21 = lVar21 - lVar12;
                if (lVar10 != 0) goto code_r0x00096f40;
              }
            }
          }
        }
      }
    }
    goto code_r0x00096c5c;
  }
  goto code_r0x00096ea0;
  while( true ) {
    lVar10 = *plVar22;
    if (lVar10 != 0) {
      pcVar3 = (char *)((long)puVar2 + (ulong)*(uint *)(plVar22 + -1) + (ulong)uVar5);
      iVar9 = _strcmp(in_stack_00000080,pcVar3);
      if ((iVar9 == 0) ||
         ((*pcVar3 == '_' && (iVar9 = _strcmp(in_stack_00000080,pcVar3 + 1), iVar9 == 0)))) {
        iStack0000000000000014 = 0;
        *unaff_x21 = lVar10;
        lStack0000000000000008 = lVar10;
      }
      else {
        lVar10 = 0;
      }
    }
    plVar22 = plVar22 + 2;
    uVar17 = uVar17 - 1;
    if (uVar17 == 0) break;
code_r0x00097008:
    if (lVar10 != 0) break;
  }
  if (iStack0000000000000014 == 0) {
    iVar9 = 0;
    *unaff_x21 = lStack0000000000000008 + lVar15;
LAB_00097088:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
      return iVar9;
    }
    ___stack_chk_fail(iVar9);
    return 11000;
  }
code_r0x00096c5c:
  _bzero(&uStack0000000000000128,0x2c0);
  iVar7 = 0;
  iVar9 = *(int *)(uVar11 + 0x10);
  piVar20 = (int *)(uVar11 + 0x20);
  do {
    iVar8 = *piVar20;
    iVar14 = iVar7;
    if (iVar8 < 2) {
      if (iVar8 == -0x7fffffde) goto code_r0x00096c80;
      if (iVar8 == -0x7fffffcd) {
        puVar16 = in_stack_00000058;
      }
      else {
        puVar16 = in_stack_00000070;
        if (iVar8 != -0x7fffffcc) goto code_r0x00096c88;
      }
      goto code_r0x00096c84;
    }
    puVar16 = unaff_x25;
    switch(iVar8) {
    case 2:
      break;
    default:
      goto code_r0x00096c88;
    case 0xb:
      puVar16 = in_stack_00000060;
      break;
    case 0x19:
      iVar14 = iVar7 + 1;
      *(int **)(&uStack0000000000000170 + (long)iVar7 * 8) = piVar20;
      piVar1 = piVar20 + 2;
      iVar7 = _strcmp(piVar1,"__LINKEDIT");
      if (iVar7 == 0) {
        puVar16 = in_stack_00000050;
      }
      else {
        iVar7 = _strcmp(piVar1,"__DATA");
        if (iVar7 == 0) {
          puVar16 = in_stack_00000048;
        }
        else {
          iVar7 = _strcmp(piVar1,"__DATA_CONST");
          if (iVar7 == 0) {
            puVar16 = in_stack_00000028;
          }
          else {
            iVar7 = _strcmp(piVar1,"__TEXT");
            if (iVar7 != 0) {
              iVar8 = _strcmp(piVar1,"__TEXT_EXEC");
              puVar16 = in_stack_00000030;
              iVar7 = iVar14;
              if (iVar8 == 0) break;
              goto code_r0x00096c88;
            }
            puVar16 = in_stack_00000020;
          }
        }
      }
      break;
    case 0x1d:
      puVar16 = in_stack_00000068;
      break;
    case 0x22:
code_r0x00096c80:
      puVar16 = in_stack_00000078;
    }
code_r0x00096c84:
    *puVar16 = piVar20;
    iVar7 = iVar14;
code_r0x00096c88:
    piVar20 = (int *)((long)piVar20 + (ulong)(uint)piVar20[1]);
    iVar9 = iVar9 + -1;
  } while (iVar9 != 0);
  unaff_x22 = uVar11 - *(long *)(in_stack_00000378 + 0x18);
  if (in_stack_000003a0 != 0) {
    lVar10 = (*(long *)(in_stack_00000398 + 0x18) + unaff_x22) - *(long *)(in_stack_00000398 + 0x28)
    ;
    in_stack_000003d0 = lVar10 + (ulong)*(uint *)(in_stack_000003a0 + 8);
    unaff_x27 = lVar10 + (ulong)*(uint *)(in_stack_000003a0 + 0x10);
  }
  *unaff_x21 = 0;
  unaff_x24 = (ulong)*(uint *)(in_stack_000003a0 + 0xc);
  if (*(uint *)(in_stack_000003a0 + 0xc) == 0) {
code_r0x00096ea0:
    iVar9 = 0x12;
  }
  else {
    unaff_x28 = (long *)(in_stack_000003d0 + 8);
    in_stack_000003d8 = unaff_x27;
    do {
      unaff_x20 = *unaff_x28;
      if (unaff_x20 != 0) {
        unaff_x19 = (char *)(unaff_x27 + (ulong)*(uint *)(unaff_x28 + -1));
        iVar9 = _strcmp(in_stack_00000080,unaff_x19);
        if (iVar9 == 0) goto code_r0x00096e8c;
        goto code_r0x00096e70;
      }
LAB_00096e44:
      unaff_x28 = unaff_x28 + 2;
      unaff_x24 = unaff_x24 - 1;
    } while (unaff_x24 != 0);
    iVar9 = 0x12;
    unaff_x27 = in_stack_000003d8;
  }
  goto joined_r0x00096edc;
}

