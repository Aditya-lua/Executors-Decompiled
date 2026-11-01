
int FUN_00096b20(ulong param_1)

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
  long lVar10;
  undefined8 uVar11;
  int iVar12;
  long lVar13;
  undefined8 *puVar14;
  uint *puVar15;
  undefined1 *unaff_x19;
  undefined8 uVar16;
  long *unaff_x20;
  uint unaff_w21;
  int *piVar17;
  long lVar18;
  uint unaff_w23;
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
  undefined1 uStack000000000000008c;
  undefined1 uStack0000000000000090;
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
  undefined4 uStack0000000000000138;
  undefined1 uStack0000000000000170;
  long in_stack_00000378;
  long in_stack_00000398;
  long in_stack_000003a0;
  long in_stack_000003d0;
  long in_stack_000003d8;
  
code_r0x00096b20:
  _uStack0000000000000090 = 0;
  *(undefined8 *)(unaff_x19 + 0x98) = 0;
  *(undefined8 *)(unaff_x19 + 0xa0) = 0;
  uStack0000000000000138 = 0;
  _uStack000000000000008c = 5;
  ___shared_region_check_np(&uStack0000000000000090);
  lVar18 = _uStack0000000000000090;
  if (_uStack0000000000000090 == 0) {
    iVar7 = _task_info(*(undefined4 *)PTR__mach_task_self__009b0440,0x11,&uStack0000000000000128,
                       &uStack000000000000008c);
    if (iVar7 == 0) {
      lVar18 = *(long *)(*(long *)(unaff_x19 + 0x98) + 0xb0);
      goto code_r0x00096b48;
    }
  }
  else {
code_r0x00096b48:
    lVar13 = *(long *)(lVar18 + (ulong)*(uint *)(lVar18 + 0x10));
    _bzero(&uStack0000000000000128,0x400);
    lVar10 = _dyld_shared_cache_file_path();
    if (lVar10 != 0) {
      ___strncat_chk(&uStack0000000000000128,lVar10,0x400,0x400);
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
      _uStack0000000000000090 = 0;
      in_stack_000000a8 = 0;
      in_stack_000000a0 = 0;
      iVar7 = _stat(&uStack0000000000000128,&uStack0000000000000090);
      uVar11 = in_stack_000000f0;
      if ((iVar7 == 0) && (uVar16 = _open(&uStack0000000000000128,0), -1 < (int)uVar16)) {
        lVar20 = _mmap(0,uVar11,3,2,uVar16,0);
        _close(uVar16);
        if (lVar20 == -1) goto code_r0x00096bc4;
        lVar10 = *(long *)(lVar20 + 0x48);
joined_r0x00096f3c:
        unaff_w27 = -0x7fffffde;
        if (lVar18 != 0) {
          unaff_w27 = -0x7fffffde;
          lVar13 = lVar18 - lVar13;
          uVar19 = *(long *)(lVar18 + 0xe0) + lVar13;
          if ((uVar19 <= param_1) && (param_1 < uVar19 + *(long *)(lVar18 + 0xe8))) {
            puVar3 = (uint *)(lVar20 + lVar10);
            uVar19 = (ulong)puVar3[5];
            if (puVar3[5] != 0) {
              uVar4 = *puVar3;
              uVar5 = puVar3[2];
              puVar15 = (uint *)(lVar20 + lVar10 + (ulong)puVar3[4] + 0xc);
              do {
                if (*(long *)(puVar15 + -3) == param_1 - lVar18) {
                  uVar19 = (ulong)*puVar15;
                  if (*puVar15 != 0) {
                    lStack0000000000000008 = 0;
                    lVar18 = 0;
                    uVar6 = puVar15[-1];
                    *unaff_x20 = 0;
                    plVar21 = (long *)(lVar20 + lVar10 + (ulong)uVar6 * 0x10 + (ulong)uVar4 + 8);
                    iStack0000000000000014 = 0x12;
                    goto code_r0x00097008;
                  }
                  break;
                }
                puVar15 = puVar15 + 4;
                uVar19 = uVar19 - 1;
              } while (uVar19 != 0);
            }
          }
        }
        goto LAB_00096c5c;
      }
code_r0x00096bc4:
      lVar20 = *(long *)(lVar18 + 0x50);
      if (lVar20 != 0) {
        uVar16 = *(undefined8 *)(lVar18 + 0x48);
        uVar11 = _open(lVar10,0);
        if (-1 < (int)uVar11) {
          lVar20 = _mmap(0,lVar20,3,2,uVar11,uVar16);
          _close(uVar11);
          if (lVar20 != -1) {
            lVar10 = *(long *)(lVar18 + 0x48);
            lVar20 = lVar20 - lVar10;
            goto joined_r0x00096f3c;
          }
        }
      }
    }
    unaff_w27 = -0x7fffffde;
  }
  goto LAB_00096c5c;
  while( true ) {
    lVar18 = *plVar21;
    if (lVar18 != 0) {
      pcVar2 = (char *)((long)puVar3 + (ulong)*(uint *)(plVar21 + -1) + (ulong)uVar5);
      iVar7 = _strcmp(in_stack_00000080,pcVar2);
      if ((iVar7 == 0) ||
         ((*pcVar2 == '_' && (iVar7 = _strcmp(in_stack_00000080,pcVar2 + 1), iVar7 == 0)))) {
        iStack0000000000000014 = 0;
        *unaff_x20 = lVar18;
        lStack0000000000000008 = lVar18;
      }
      else {
        lVar18 = 0;
      }
    }
    plVar21 = plVar21 + 2;
    uVar19 = uVar19 - 1;
    if (uVar19 == 0) break;
code_r0x00097008:
    if (lVar18 != 0) break;
  }
  unaff_w27 = -0x7fffffde;
  if (iStack0000000000000014 == 0) {
    iVar7 = 0;
    *unaff_x20 = lStack0000000000000008 + lVar13;
code_r0x00097088:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
      return iVar7;
    }
    ___stack_chk_fail(iVar7);
    return 11000;
  }
LAB_00096c5c:
  _bzero(&uStack0000000000000128,0x2c0);
  iVar8 = 0;
  iVar7 = *(int *)(param_1 + 0x10);
  piVar17 = (int *)(param_1 + 0x20);
  do {
    iVar9 = *piVar17;
    iVar12 = iVar8;
    if (iVar9 < 2) {
      if (iVar9 == unaff_w27) goto LAB_00096c80;
      if (iVar9 == -0x7fffffcd) {
        puVar14 = in_stack_00000058;
      }
      else {
        puVar14 = in_stack_00000070;
        if (iVar9 != -0x7fffffcc) goto LAB_00096c88;
      }
      goto LAB_00096c84;
    }
    puVar14 = unaff_x25;
    switch(iVar9) {
    case 2:
      break;
    default:
      goto LAB_00096c88;
    case 0xb:
      puVar14 = in_stack_00000060;
      break;
    case 0x19:
      iVar12 = iVar8 + 1;
      *(int **)(&uStack0000000000000170 + (long)iVar8 * 8) = piVar17;
      piVar1 = piVar17 + 2;
      iVar8 = _strcmp(piVar1,"__LINKEDIT");
      if (iVar8 == 0) {
        puVar14 = in_stack_00000050;
      }
      else {
        iVar8 = _strcmp(piVar1,"__DATA");
        if (iVar8 == 0) {
          puVar14 = in_stack_00000048;
        }
        else {
          iVar8 = _strcmp(piVar1,"__DATA_CONST");
          if (iVar8 == 0) {
            puVar14 = in_stack_00000028;
          }
          else {
            iVar8 = _strcmp(piVar1,"__TEXT");
            if (iVar8 != 0) {
              iVar9 = _strcmp(piVar1,"__TEXT_EXEC");
              unaff_w27 = -0x7fffffde;
              puVar14 = in_stack_00000030;
              iVar8 = iVar12;
              if (iVar9 == 0) break;
              goto LAB_00096c88;
            }
            puVar14 = in_stack_00000020;
          }
        }
      }
      unaff_w27 = -0x7fffffde;
      break;
    case 0x1d:
      puVar14 = in_stack_00000068;
      break;
    case 0x22:
LAB_00096c80:
      puVar14 = in_stack_00000078;
    }
LAB_00096c84:
    *puVar14 = piVar17;
    iVar8 = iVar12;
LAB_00096c88:
    piVar17 = (int *)((long)piVar17 + (ulong)(uint)piVar17[1]);
    iVar7 = iVar7 + -1;
  } while (iVar7 != 0);
  lVar18 = param_1 - *(long *)(in_stack_00000378 + 0x18);
  if (in_stack_000003a0 != 0) {
    lVar10 = (*(long *)(in_stack_00000398 + 0x18) + lVar18) - *(long *)(in_stack_00000398 + 0x28);
    in_stack_000003d0 = lVar10 + (ulong)*(uint *)(in_stack_000003a0 + 8);
    in_stack_000003d8 = lVar10 + (ulong)*(uint *)(in_stack_000003a0 + 0x10);
  }
  *unaff_x20 = 0;
  uVar19 = (ulong)*(uint *)(in_stack_000003a0 + 0xc);
  if (*(uint *)(in_stack_000003a0 + 0xc) == 0) goto code_r0x00096ea0;
  plVar21 = (long *)(in_stack_000003d0 + 8);
  do {
    lVar10 = *plVar21;
    if (lVar10 != 0) {
      pcVar2 = (char *)(in_stack_000003d8 + (ulong)*(uint *)(plVar21 + -1));
      iVar7 = _strcmp(in_stack_00000080,pcVar2);
      if ((iVar7 == 0) ||
         ((*pcVar2 == '_' && (iVar7 = _strcmp(in_stack_00000080,pcVar2 + 1), iVar7 == 0)))) {
        iVar7 = 0;
        *unaff_x20 = lVar10 + lVar18;
        goto code_r0x00096ec4;
      }
    }
    plVar21 = plVar21 + 2;
    uVar19 = uVar19 - 1;
  } while (uVar19 != 0);
  iVar7 = 0x12;
code_r0x00096ec4:
  unaff_w27 = -0x7fffffde;
  unaff_w23 = unaff_w23 + 1;
  unaff_w21 = in_stack_00000038._4_4_;
  if (in_stack_00000038._4_4_ <= unaff_w23) goto code_r0x00097088;
  while( true ) {
    unaff_x19 = &uStack0000000000000090;
    if (iVar7 != 0x12) goto code_r0x00097088;
    lVar18 = __dyld_get_image_name(unaff_w23);
    if ((lVar18 != 0) &&
       (((unaff_x26 == 0 || (lVar18 = _strnstr(), lVar18 != 0)) &&
        (param_1 = __dyld_get_image_header(unaff_w23), param_1 != 0)))) break;
code_r0x00096ea0:
    iVar7 = 0x12;
    unaff_w23 = unaff_w23 + 1;
    if (unaff_w21 <= unaff_w23) goto code_r0x00097088;
  }
  goto code_r0x00096b20;
}

