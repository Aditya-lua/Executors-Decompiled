
int FUN_00096d5c(int *param_1,char *param_2)

{
  char *pcVar1;
  uint *puVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  int iVar6;
  int iVar7;
  undefined8 uVar8;
  long lVar9;
  undefined8 *puVar10;
  long lVar11;
  uint *puVar12;
  int unaff_w19;
  undefined8 uVar13;
  long *unaff_x20;
  uint unaff_w21;
  int *unaff_x22;
  long lVar14;
  uint unaff_w23;
  ulong unaff_x24;
  ulong uVar15;
  undefined8 *unaff_x25;
  long unaff_x26;
  int *unaff_x27;
  int unaff_w28;
  long lVar16;
  long *plVar17;
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
  
code_r0x00096d5c:
  iVar6 = _strcmp(param_1,param_2 + 0x9fc);
  if (iVar6 == 0) {
    puVar10 = in_stack_00000020;
    goto code_r0x00096dcc;
  }
  iVar7 = _strcmp(unaff_x27,"__TEXT_EXEC");
  puVar10 = in_stack_00000030;
  iVar6 = unaff_w28;
  if (iVar7 != 0) goto code_r0x00096c88;
code_r0x00096c84:
  *puVar10 = unaff_x22;
code_r0x00096c88:
  unaff_x22 = (int *)((long)unaff_x22 + (ulong)(uint)unaff_x22[1]);
  unaff_w19 = unaff_w19 + -1;
  if (unaff_w19 == 0) {
    lVar14 = unaff_x24 - *(long *)(in_stack_00000378 + 0x18);
    if (in_stack_000003a0 != 0) {
      lVar11 = (*(long *)(in_stack_00000398 + 0x18) + lVar14) - *(long *)(in_stack_00000398 + 0x28);
      in_stack_000003d0 = lVar11 + (ulong)*(uint *)(in_stack_000003a0 + 8);
      in_stack_000003d8 = lVar11 + (ulong)*(uint *)(in_stack_000003a0 + 0x10);
    }
    *unaff_x20 = 0;
    uVar15 = (ulong)*(uint *)(in_stack_000003a0 + 0xc);
    if (*(uint *)(in_stack_000003a0 + 0xc) == 0) goto code_r0x00096ea0;
    plVar17 = (long *)(in_stack_000003d0 + 8);
    do {
      lVar11 = *plVar17;
      if (lVar11 != 0) {
        pcVar1 = (char *)(in_stack_000003d8 + (ulong)*(uint *)(plVar17 + -1));
        iVar6 = _strcmp(in_stack_00000080,pcVar1);
        if ((iVar6 == 0) ||
           ((*pcVar1 == '_' && (iVar6 = _strcmp(in_stack_00000080,pcVar1 + 1), iVar6 == 0)))) {
          iVar6 = 0;
          *unaff_x20 = lVar11 + lVar14;
          goto code_r0x00096ec4;
        }
      }
      plVar17 = plVar17 + 2;
      uVar15 = uVar15 - 1;
    } while (uVar15 != 0);
    iVar6 = 0x12;
code_r0x00096ec4:
    unaff_w23 = unaff_w23 + 1;
    unaff_w21 = in_stack_00000038._4_4_;
    if (in_stack_00000038._4_4_ <= unaff_w23) goto code_r0x00097088;
    while( true ) {
      if (iVar6 != 0x12) goto code_r0x00097088;
      lVar14 = __dyld_get_image_name(unaff_w23);
      if ((lVar14 != 0) &&
         (((unaff_x26 == 0 || (lVar14 = _strnstr(), lVar14 != 0)) &&
          (unaff_x24 = __dyld_get_image_header(unaff_w23), unaff_x24 != 0)))) break;
code_r0x00096ea0:
      iVar6 = 0x12;
      unaff_w23 = unaff_w23 + 1;
      if (unaff_w21 <= unaff_w23) goto code_r0x00097088;
    }
    uStack0000000000000090 = 0;
    uStack0000000000000128 = 0;
    in_stack_00000130 = 0;
    in_stack_00000138 = 0;
    uStack0000000000000088._4_4_ = 5;
    ___shared_region_check_np(&uStack0000000000000090);
    lVar14 = uStack0000000000000090;
    if (uStack0000000000000090 == 0) {
      iVar6 = _task_info(*(undefined4 *)PTR__mach_task_self__009b0440,0x11,&uStack0000000000000128,
                         (long)&uStack0000000000000088 + 4);
      if (iVar6 == 0) {
        lVar14 = *(long *)(uStack0000000000000128 + 0xb0);
        goto code_r0x00096b48;
      }
    }
    else {
code_r0x00096b48:
      lVar9 = *(long *)(lVar14 + (ulong)*(uint *)(lVar14 + 0x10));
      _bzero(&uStack0000000000000128,0x400);
      lVar11 = _dyld_shared_cache_file_path();
      if (lVar11 != 0) {
        ___strncat_chk(&uStack0000000000000128,lVar11,0x400,0x400);
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
        iVar6 = _stat(&uStack0000000000000128,&uStack0000000000000090);
        uVar8 = in_stack_000000f0;
        if ((iVar6 == 0) && (uVar13 = _open(&uStack0000000000000128,0), -1 < (int)uVar13)) {
          lVar16 = _mmap(0,uVar8,3,2,uVar13,0);
          _close(uVar13);
          if (lVar16 == -1) goto code_r0x00096bc4;
          lVar11 = *(long *)(lVar16 + 0x48);
          if (lVar14 == 0) goto code_r0x00096c5c;
code_r0x00096f40:
          lVar9 = lVar14 - lVar9;
          uVar15 = *(long *)(lVar14 + 0xe0) + lVar9;
          if ((uVar15 <= unaff_x24) && (unaff_x24 < uVar15 + *(long *)(lVar14 + 0xe8))) {
            puVar2 = (uint *)(lVar16 + lVar11);
            uVar15 = (ulong)puVar2[5];
            if (puVar2[5] != 0) {
              uVar3 = *puVar2;
              uVar4 = puVar2[2];
              puVar12 = (uint *)(lVar16 + lVar11 + (ulong)puVar2[4] + 0xc);
              do {
                if (*(long *)(puVar12 + -3) == unaff_x24 - lVar14) {
                  uVar15 = (ulong)*puVar12;
                  if (*puVar12 != 0) {
                    lStack0000000000000008 = 0;
                    lVar14 = 0;
                    uVar5 = puVar12[-1];
                    *unaff_x20 = 0;
                    plVar17 = (long *)(lVar16 + lVar11 + (ulong)uVar5 * 0x10 + (ulong)uVar3 + 8);
                    iStack0000000000000014 = 0x12;
                    goto code_r0x00097008;
                  }
                  break;
                }
                puVar12 = puVar12 + 4;
                uVar15 = uVar15 - 1;
              } while (uVar15 != 0);
            }
          }
        }
        else {
code_r0x00096bc4:
          lVar16 = *(long *)(lVar14 + 0x50);
          if (lVar16 != 0) {
            uVar13 = *(undefined8 *)(lVar14 + 0x48);
            uVar8 = _open(lVar11,0);
            if (-1 < (int)uVar8) {
              lVar16 = _mmap(0,lVar16,3,2,uVar8,uVar13);
              _close(uVar8);
              if (lVar16 != -1) {
                lVar11 = *(long *)(lVar14 + 0x48);
                lVar16 = lVar16 - lVar11;
                if (lVar14 != 0) goto code_r0x00096f40;
              }
            }
          }
        }
      }
    }
    goto code_r0x00096c5c;
  }
  goto code_r0x00096c98;
  while( true ) {
    lVar14 = *plVar17;
    if (lVar14 != 0) {
      pcVar1 = (char *)((long)puVar2 + (ulong)*(uint *)(plVar17 + -1) + (ulong)uVar4);
      iVar6 = _strcmp(in_stack_00000080,pcVar1);
      if ((iVar6 == 0) ||
         ((*pcVar1 == '_' && (iVar6 = _strcmp(in_stack_00000080,pcVar1 + 1), iVar6 == 0)))) {
        iStack0000000000000014 = 0;
        *unaff_x20 = lVar14;
        lStack0000000000000008 = lVar14;
      }
      else {
        lVar14 = 0;
      }
    }
    plVar17 = plVar17 + 2;
    uVar15 = uVar15 - 1;
    if (uVar15 == 0) break;
code_r0x00097008:
    if (lVar14 != 0) break;
  }
  if (iStack0000000000000014 == 0) {
    iVar6 = 0;
    *unaff_x20 = lStack0000000000000008 + lVar9;
code_r0x00097088:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
      return iVar6;
    }
    ___stack_chk_fail(iVar6);
    return 11000;
  }
code_r0x00096c5c:
  _bzero(&uStack0000000000000128,0x2c0);
  iVar6 = 0;
  unaff_w19 = *(int *)(unaff_x24 + 0x10);
  unaff_x22 = (int *)(unaff_x24 + 0x20);
code_r0x00096c98:
  iVar7 = *unaff_x22;
  if (iVar7 < 2) {
    if (iVar7 != -0x7fffffde) {
      if (iVar7 == -0x7fffffcd) {
        puVar10 = in_stack_00000058;
        goto code_r0x00096c84;
      }
      puVar10 = in_stack_00000070;
      if (iVar7 == -0x7fffffcc) goto code_r0x00096c84;
      goto code_r0x00096c88;
    }
code_r0x00096c80:
    puVar10 = in_stack_00000078;
    goto code_r0x00096c84;
  }
  puVar10 = unaff_x25;
  switch(iVar7) {
  case 2:
    goto code_r0x00096c84;
  default:
    goto code_r0x00096c88;
  case 0xb:
    puVar10 = in_stack_00000060;
    goto code_r0x00096c84;
  case 0x19:
    unaff_w28 = iVar6 + 1;
    *(int **)(&uStack0000000000000170 + (long)iVar6 * 8) = unaff_x22;
    param_1 = unaff_x22 + 2;
    iVar6 = _strcmp(param_1,"__LINKEDIT");
    if (iVar6 == 0) {
      puVar10 = in_stack_00000050;
      goto code_r0x00096dcc;
    }
    iVar6 = _strcmp(param_1,"__DATA");
    if (iVar6 == 0) {
      puVar10 = in_stack_00000048;
      goto code_r0x00096dcc;
    }
    iVar6 = _strcmp(param_1,"__DATA_CONST");
    if (iVar6 != 0) {
      param_2 = "ped to \\u001F";
      unaff_x27 = param_1;
      goto code_r0x00096d5c;
    }
    puVar10 = in_stack_00000028;
code_r0x00096dcc:
    iVar6 = unaff_w28;
    goto code_r0x00096c84;
  case 0x1d:
    puVar10 = in_stack_00000068;
    goto code_r0x00096c84;
  case 0x22:
    goto code_r0x00096c80;
  }
}

