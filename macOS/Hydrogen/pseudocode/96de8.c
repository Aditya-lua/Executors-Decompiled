
int FUN_00096de8(long param_1)

{
  int *piVar1;
  char *pcVar2;
  uint *puVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  int iVar7;
  int iVar8;
  int iVar9;
  undefined8 uVar10;
  int iVar11;
  long lVar12;
  undefined8 *puVar13;
  long lVar14;
  uint *puVar15;
  undefined8 uVar16;
  undefined8 *unaff_x19;
  long *unaff_x20;
  uint unaff_w21;
  int *piVar17;
  long lVar18;
  uint unaff_w23;
  ulong unaff_x24;
  ulong uVar19;
  undefined8 *unaff_x25;
  long unaff_x26;
  int unaff_w27;
  long lVar20;
  long *plVar21;
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
  undefined1 uStack0000000000000128;
  undefined4 in_stack_00000138;
  undefined1 uStack0000000000000170;
  long in_stack_00000378;
  
code_r0x00096de8:
  lVar18 = unaff_x24 - *(long *)(param_1 + 0x18);
  lVar12 = unaff_x19[0x62];
  if (lVar12 != 0) {
    lVar14 = (*(long *)(unaff_x19[0x61] + 0x18) + lVar18) - *(long *)(unaff_x19[0x61] + 0x28);
    unaff_x19[0x68] = lVar14 + (ulong)*(uint *)(lVar12 + 8);
    unaff_x19[0x69] = lVar14 + (ulong)*(uint *)(lVar12 + 0x10);
  }
  *unaff_x20 = 0;
  uVar19 = (ulong)*(uint *)(lVar12 + 0xc);
  if (*(uint *)(lVar12 + 0xc) == 0) goto LAB_00096ea0;
  lVar12 = unaff_x19[0x69];
  plVar21 = (long *)(unaff_x19[0x68] + 8);
  do {
    lVar14 = *plVar21;
    if (lVar14 != 0) {
      pcVar2 = (char *)(lVar12 + (ulong)*(uint *)(plVar21 + -1));
      iVar9 = _strcmp(in_stack_00000080,pcVar2);
      if ((iVar9 == 0) ||
         ((*pcVar2 == '_' && (iVar9 = _strcmp(in_stack_00000080,pcVar2 + 1), iVar9 == 0)))) {
        iVar9 = 0;
        *unaff_x20 = lVar14 + lVar18;
        goto code_r0x00096ec4;
      }
    }
    plVar21 = plVar21 + 2;
    uVar19 = uVar19 - 1;
  } while (uVar19 != 0);
  iVar9 = 0x12;
code_r0x00096ec4:
  unaff_x19 = &uStack0000000000000090;
  unaff_w27 = -0x7fffffde;
  unaff_w23 = unaff_w23 + 1;
  unaff_w21 = in_stack_00000038._4_4_;
  if (unaff_w23 < in_stack_00000038._4_4_) {
    while( true ) {
      if (iVar9 != 0x12) goto code_r0x00097088;
      lVar12 = __dyld_get_image_name(unaff_w23);
      if ((lVar12 != 0) &&
         (((unaff_x26 == 0 || (lVar12 = _strnstr(), lVar12 != 0)) &&
          (unaff_x24 = __dyld_get_image_header(unaff_w23), unaff_x24 != 0)))) break;
LAB_00096ea0:
      iVar9 = 0x12;
      unaff_w23 = unaff_w23 + 1;
      if (unaff_w21 <= unaff_w23) goto code_r0x00097088;
    }
    uStack0000000000000090 = 0;
    unaff_x19[0x13] = 0;
    unaff_x19[0x14] = 0;
    in_stack_00000138 = 0;
    uStack0000000000000088._4_4_ = 5;
    ___shared_region_check_np(&uStack0000000000000090);
    lVar12 = uStack0000000000000090;
    if (uStack0000000000000090 == 0) {
      iVar9 = _task_info(*(undefined4 *)PTR__mach_task_self__009b0440,0x11,&uStack0000000000000128,
                         (long)&uStack0000000000000088 + 4);
      if (iVar9 == 0) {
        lVar12 = *(long *)(unaff_x19[0x13] + 0xb0);
        goto code_r0x00096b48;
      }
    }
    else {
code_r0x00096b48:
      lVar14 = *(long *)(lVar12 + (ulong)*(uint *)(lVar12 + 0x10));
      _bzero(&uStack0000000000000128,0x400);
      lVar18 = _dyld_shared_cache_file_path();
      if (lVar18 != 0) {
        ___strncat_chk(&uStack0000000000000128,lVar18,0x400,0x400);
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
        uVar10 = in_stack_000000f0;
        if ((iVar9 == 0) && (uVar16 = _open(&uStack0000000000000128,0), -1 < (int)uVar16)) {
          lVar20 = _mmap(0,uVar10,3,2,uVar16,0);
          _close(uVar16);
          if (lVar20 == -1) goto code_r0x00096bc4;
          lVar18 = *(long *)(lVar20 + 0x48);
joined_r0x00096f3c:
          unaff_w27 = -0x7fffffde;
          if (lVar12 != 0) {
            unaff_w27 = -0x7fffffde;
            lVar14 = lVar12 - lVar14;
            uVar19 = *(long *)(lVar12 + 0xe0) + lVar14;
            if ((uVar19 <= unaff_x24) && (unaff_x24 < uVar19 + *(long *)(lVar12 + 0xe8))) {
              puVar3 = (uint *)(lVar20 + lVar18);
              uVar19 = (ulong)puVar3[5];
              if (puVar3[5] != 0) {
                uVar4 = *puVar3;
                uVar5 = puVar3[2];
                puVar15 = (uint *)(lVar20 + lVar18 + (ulong)puVar3[4] + 0xc);
                do {
                  if (*(long *)(puVar15 + -3) == unaff_x24 - lVar12) {
                    uVar19 = (ulong)*puVar15;
                    if (*puVar15 != 0) {
                      lStack0000000000000008 = 0;
                      lVar12 = 0;
                      uVar6 = puVar15[-1];
                      *unaff_x20 = 0;
                      plVar21 = (long *)(lVar20 + lVar18 + (ulong)uVar6 * 0x10 + (ulong)uVar4 + 8);
                      iStack0000000000000014 = 0x12;
                      goto LAB_00097008;
                    }
                    break;
                  }
                  puVar15 = puVar15 + 4;
                  uVar19 = uVar19 - 1;
                } while (uVar19 != 0);
              }
            }
          }
          goto code_r0x00096c5c;
        }
code_r0x00096bc4:
        lVar20 = *(long *)(lVar12 + 0x50);
        if (lVar20 != 0) {
          uVar16 = *(undefined8 *)(lVar12 + 0x48);
          uVar10 = _open(lVar18,0);
          if (-1 < (int)uVar10) {
            lVar20 = _mmap(0,lVar20,3,2,uVar10,uVar16);
            _close(uVar10);
            if (lVar20 != -1) {
              lVar18 = *(long *)(lVar12 + 0x48);
              lVar20 = lVar20 - lVar18;
              goto joined_r0x00096f3c;
            }
          }
        }
      }
      unaff_w27 = -0x7fffffde;
    }
    goto code_r0x00096c5c;
  }
  goto code_r0x00097088;
  while( true ) {
    lVar12 = *plVar21;
    if (lVar12 != 0) {
      pcVar2 = (char *)((long)puVar3 + (ulong)*(uint *)(plVar21 + -1) + (ulong)uVar5);
      iVar9 = _strcmp(in_stack_00000080,pcVar2);
      if ((iVar9 == 0) ||
         ((*pcVar2 == '_' && (iVar9 = _strcmp(in_stack_00000080,pcVar2 + 1), iVar9 == 0)))) {
        iStack0000000000000014 = 0;
        *unaff_x20 = lVar12;
        lStack0000000000000008 = lVar12;
      }
      else {
        lVar12 = 0;
      }
    }
    plVar21 = plVar21 + 2;
    uVar19 = uVar19 - 1;
    if (uVar19 == 0) break;
LAB_00097008:
    if (lVar12 != 0) break;
  }
  unaff_w27 = -0x7fffffde;
  if (iStack0000000000000014 == 0) {
    iVar9 = 0;
    *unaff_x20 = lStack0000000000000008 + lVar14;
code_r0x00097088:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
      return iVar9;
    }
    ___stack_chk_fail(iVar9);
    return 11000;
  }
code_r0x00096c5c:
  _bzero(&uStack0000000000000128,0x2c0);
  iVar7 = 0;
  iVar9 = *(int *)(unaff_x24 + 0x10);
  piVar17 = (int *)(unaff_x24 + 0x20);
  do {
    iVar8 = *piVar17;
    iVar11 = iVar7;
    if (iVar8 < 2) {
      if (iVar8 == unaff_w27) goto code_r0x00096c80;
      if (iVar8 == -0x7fffffcd) {
        puVar13 = in_stack_00000058;
      }
      else {
        puVar13 = in_stack_00000070;
        if (iVar8 != -0x7fffffcc) goto code_r0x00096c88;
      }
      goto code_r0x00096c84;
    }
    puVar13 = unaff_x25;
    switch(iVar8) {
    case 2:
      break;
    default:
      goto code_r0x00096c88;
    case 0xb:
      puVar13 = in_stack_00000060;
      break;
    case 0x19:
      iVar11 = iVar7 + 1;
      *(int **)(&uStack0000000000000170 + (long)iVar7 * 8) = piVar17;
      piVar1 = piVar17 + 2;
      iVar7 = _strcmp(piVar1,"__LINKEDIT");
      if (iVar7 == 0) {
        puVar13 = in_stack_00000050;
      }
      else {
        iVar7 = _strcmp(piVar1,"__DATA");
        if (iVar7 == 0) {
          puVar13 = in_stack_00000048;
        }
        else {
          iVar7 = _strcmp(piVar1,"__DATA_CONST");
          if (iVar7 == 0) {
            puVar13 = in_stack_00000028;
          }
          else {
            iVar7 = _strcmp(piVar1,"__TEXT");
            if (iVar7 != 0) {
              iVar8 = _strcmp(piVar1,"__TEXT_EXEC");
              unaff_w27 = -0x7fffffde;
              puVar13 = in_stack_00000030;
              iVar7 = iVar11;
              if (iVar8 == 0) break;
              goto code_r0x00096c88;
            }
            puVar13 = in_stack_00000020;
          }
        }
      }
      unaff_w27 = -0x7fffffde;
      break;
    case 0x1d:
      puVar13 = in_stack_00000068;
      break;
    case 0x22:
code_r0x00096c80:
      puVar13 = in_stack_00000078;
    }
code_r0x00096c84:
    *puVar13 = piVar17;
    iVar7 = iVar11;
code_r0x00096c88:
    piVar17 = (int *)((long)piVar17 + (ulong)(uint)piVar17[1]);
    iVar9 = iVar9 + -1;
  } while (iVar9 != 0);
  unaff_x19 = &uStack0000000000000090;
  param_1 = in_stack_00000378;
  goto code_r0x00096de8;
}

