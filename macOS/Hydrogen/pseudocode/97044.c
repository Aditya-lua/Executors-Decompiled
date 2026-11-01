
int FUN_00097044(undefined8 param_1,char *param_2)

{
  int *piVar1;
  char *pcVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  undefined8 uVar8;
  int iVar9;
  undefined8 *puVar10;
  long lVar11;
  uint *puVar12;
  undefined8 uVar13;
  long *unaff_x20;
  uint unaff_w21;
  int *piVar14;
  long lVar15;
  ulong unaff_x22;
  uint unaff_w23;
  ulong uVar16;
  ulong unaff_x24;
  undefined8 *unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long lVar17;
  long *plVar18;
  long *unaff_x28;
  long unaff_x29;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  undefined8 *in_stack_00000020;
  undefined8 *in_stack_00000028;
  undefined8 *in_stack_00000030;
  undefined8 in_stack_00000038;
  long in_stack_00000040;
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
  
code_r0x00097044:
  iVar7 = _strcmp(param_1,param_2);
  if (iVar7 != 0) goto LAB_00096ff8;
  do {
    in_stack_00000010._4_4_ = 0;
    *unaff_x20 = unaff_x27;
    in_stack_00000008 = unaff_x27;
LAB_00096ffc:
    do {
      unaff_x28 = unaff_x28 + 2;
      unaff_x22 = unaff_x22 - 1;
      if (unaff_x22 == 0) goto code_r0x0009705c;
code_r0x00097008:
      if (unaff_x27 != 0) {
code_r0x0009705c:
        if (in_stack_00000010._4_4_ == 0) {
          iVar7 = 0;
          *unaff_x20 = in_stack_00000008 + in_stack_00000018;
code_r0x00097088:
          if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
            return iVar7;
          }
          ___stack_chk_fail(iVar7);
          return 11000;
        }
code_r0x00096c5c:
        do {
          _bzero(&uStack0000000000000128,0x2c0);
          iVar5 = 0;
          iVar7 = *(int *)(unaff_x24 + 0x10);
          piVar14 = (int *)(unaff_x24 + 0x20);
          do {
            iVar6 = *piVar14;
            iVar9 = iVar5;
            if (iVar6 < 2) {
              if (iVar6 == -0x7fffffde) goto code_r0x00096c80;
              if (iVar6 == -0x7fffffcd) {
                puVar10 = in_stack_00000058;
              }
              else {
                puVar10 = in_stack_00000070;
                if (iVar6 != -0x7fffffcc) goto code_r0x00096c88;
              }
              goto code_r0x00096c84;
            }
            puVar10 = unaff_x25;
            switch(iVar6) {
            case 2:
              break;
            default:
              goto code_r0x00096c88;
            case 0xb:
              puVar10 = in_stack_00000060;
              break;
            case 0x19:
              iVar9 = iVar5 + 1;
              *(int **)(&uStack0000000000000170 + (long)iVar5 * 8) = piVar14;
              piVar1 = piVar14 + 2;
              iVar5 = _strcmp(piVar1,"__LINKEDIT");
              if (iVar5 == 0) {
                puVar10 = in_stack_00000050;
              }
              else {
                iVar5 = _strcmp(piVar1,"__DATA");
                if (iVar5 == 0) {
                  puVar10 = in_stack_00000048;
                }
                else {
                  iVar5 = _strcmp(piVar1,"__DATA_CONST");
                  if (iVar5 == 0) {
                    puVar10 = in_stack_00000028;
                  }
                  else {
                    iVar5 = _strcmp(piVar1,"__TEXT");
                    if (iVar5 != 0) {
                      iVar6 = _strcmp(piVar1,"__TEXT_EXEC");
                      puVar10 = in_stack_00000030;
                      iVar5 = iVar9;
                      if (iVar6 == 0) break;
                      goto code_r0x00096c88;
                    }
                    puVar10 = in_stack_00000020;
                  }
                }
              }
              break;
            case 0x1d:
              puVar10 = in_stack_00000068;
              break;
            case 0x22:
code_r0x00096c80:
              puVar10 = in_stack_00000078;
            }
code_r0x00096c84:
            *puVar10 = piVar14;
            iVar5 = iVar9;
code_r0x00096c88:
            piVar14 = (int *)((long)piVar14 + (ulong)(uint)piVar14[1]);
            iVar7 = iVar7 + -1;
          } while (iVar7 != 0);
          lVar15 = unaff_x24 - *(long *)(in_stack_00000378 + 0x18);
          if (in_stack_000003a0 != 0) {
            lVar11 = (*(long *)(in_stack_00000398 + 0x18) + lVar15) -
                     *(long *)(in_stack_00000398 + 0x28);
            in_stack_000003d0 = lVar11 + (ulong)*(uint *)(in_stack_000003a0 + 8);
            in_stack_000003d8 = lVar11 + (ulong)*(uint *)(in_stack_000003a0 + 0x10);
          }
          *unaff_x20 = 0;
          uVar16 = (ulong)*(uint *)(in_stack_000003a0 + 0xc);
          if (*(uint *)(in_stack_000003a0 + 0xc) == 0) goto code_r0x00096ea0;
          plVar18 = (long *)(in_stack_000003d0 + 8);
          do {
            lVar11 = *plVar18;
            if (lVar11 != 0) {
              pcVar2 = (char *)(in_stack_000003d8 + (ulong)*(uint *)(plVar18 + -1));
              iVar7 = _strcmp(in_stack_00000080,pcVar2);
              if ((iVar7 == 0) ||
                 ((*pcVar2 == '_' && (iVar7 = _strcmp(in_stack_00000080,pcVar2 + 1), iVar7 == 0))))
              {
                iVar7 = 0;
                *unaff_x20 = lVar11 + lVar15;
                goto code_r0x00096ec4;
              }
            }
            plVar18 = plVar18 + 2;
            uVar16 = uVar16 - 1;
          } while (uVar16 != 0);
          iVar7 = 0x12;
code_r0x00096ec4:
          unaff_w23 = unaff_w23 + 1;
          unaff_w21 = in_stack_00000038._4_4_;
          if (in_stack_00000038._4_4_ <= unaff_w23) goto code_r0x00097088;
          while( true ) {
            if (iVar7 != 0x12) goto code_r0x00097088;
            lVar15 = __dyld_get_image_name(unaff_w23);
            if ((lVar15 != 0) &&
               (((unaff_x26 == 0 || (lVar15 = _strnstr(), lVar15 != 0)) &&
                (unaff_x24 = __dyld_get_image_header(unaff_w23), unaff_x24 != 0)))) break;
code_r0x00096ea0:
            iVar7 = 0x12;
            unaff_w23 = unaff_w23 + 1;
            if (unaff_w21 <= unaff_w23) goto code_r0x00097088;
          }
          uStack0000000000000090 = 0;
          uStack0000000000000128 = 0;
          in_stack_00000130 = 0;
          in_stack_00000138 = 0;
          uStack0000000000000088._4_4_ = 5;
          ___shared_region_check_np(&uStack0000000000000090);
          lVar15 = uStack0000000000000090;
          if (uStack0000000000000090 == 0) {
            iVar7 = _task_info(*(undefined4 *)PTR__mach_task_self__009b0440,0x11,
                               &uStack0000000000000128,(long)&uStack0000000000000088 + 4);
            if (iVar7 != 0) goto code_r0x00096c5c;
            lVar15 = *(long *)(uStack0000000000000128 + 0xb0);
          }
          in_stack_00000018 = *(long *)(lVar15 + (ulong)*(uint *)(lVar15 + 0x10));
          _bzero(&uStack0000000000000128,0x400);
          lVar11 = _dyld_shared_cache_file_path();
        } while (lVar11 == 0);
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
        iVar7 = _stat(&uStack0000000000000128,&uStack0000000000000090);
        uVar8 = in_stack_000000f0;
        if ((iVar7 == 0) && (uVar13 = _open(&uStack0000000000000128,0), -1 < (int)uVar13)) {
          lVar17 = _mmap(0,uVar8,3,2,uVar13,0);
          _close(uVar13);
          if (lVar17 == -1) goto code_r0x00096bc4;
          lVar11 = *(long *)(lVar17 + 0x48);
        }
        else {
code_r0x00096bc4:
          lVar17 = *(long *)(lVar15 + 0x50);
          if (lVar17 == 0) goto code_r0x00096c5c;
          uVar13 = *(undefined8 *)(lVar15 + 0x48);
          uVar8 = _open(lVar11,0);
          if ((int)uVar8 < 0) goto code_r0x00096c5c;
          lVar17 = _mmap(0,lVar17,3,2,uVar8,uVar13);
          _close(uVar8);
          if (lVar17 == -1) goto code_r0x00096c5c;
          lVar11 = *(long *)(lVar15 + 0x48);
          lVar17 = lVar17 - lVar11;
        }
        if (lVar15 != 0) {
          in_stack_00000018 = lVar15 - in_stack_00000018;
          uVar16 = *(long *)(lVar15 + 0xe0) + in_stack_00000018;
          if ((uVar16 <= unaff_x24) && (unaff_x24 < uVar16 + *(long *)(lVar15 + 0xe8))) {
            puVar12 = (uint *)(lVar17 + lVar11);
            uVar16 = (ulong)puVar12[5];
            if (puVar12[5] != 0) {
              uVar3 = *puVar12;
              in_stack_00000040 = (long)puVar12 + (ulong)puVar12[2];
              puVar12 = (uint *)(lVar17 + lVar11 + (ulong)puVar12[4] + 0xc);
              do {
                if (*(long *)(puVar12 + -3) == unaff_x24 - lVar15) {
                  unaff_x22 = (ulong)*puVar12;
                  if (*puVar12 != 0) {
                    in_stack_00000008 = 0;
                    unaff_x27 = 0;
                    uVar4 = puVar12[-1];
                    *unaff_x20 = 0;
                    unaff_x28 = (long *)(lVar17 + lVar11 + (ulong)uVar4 * 0x10 + (ulong)uVar3 + 8);
                    in_stack_00000010._4_4_ = 0x12;
                    goto code_r0x00097008;
                  }
                  break;
                }
                puVar12 = puVar12 + 4;
                uVar16 = uVar16 - 1;
              } while (uVar16 != 0);
            }
          }
        }
        goto code_r0x00096c5c;
      }
      unaff_x27 = *unaff_x28;
    } while (unaff_x27 == 0);
    param_2 = (char *)(in_stack_00000040 + (ulong)*(uint *)(unaff_x28 + -1));
    iVar7 = _strcmp(in_stack_00000080,param_2);
  } while (iVar7 == 0);
  if (*param_2 == '_') {
    param_2 = param_2 + 1;
    param_1 = in_stack_00000080;
    goto code_r0x00097044;
  }
LAB_00096ff8:
  unaff_x27 = 0;
  goto LAB_00096ffc;
}

