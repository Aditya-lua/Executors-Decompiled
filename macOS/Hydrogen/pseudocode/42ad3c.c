
undefined1  [16] FUN_0042ad3c(void)

{
  uint uVar1;
  undefined *puVar2;
  undefined4 uVar3;
  int iVar4;
  undefined8 uVar5;
  uint *puVar6;
  long lVar7;
  bool bVar8;
  undefined4 uVar9;
  undefined *puVar10;
  ulong unaff_x20;
  ulong uVar11;
  long unaff_x24;
  long unaff_x29;
  undefined1 auVar12 [16];
  undefined1 uStack0000000000000004;
  undefined4 uStack0000000000000008;
  undefined *in_stack_00000010;
  undefined1 *in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined *in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined *in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  
  *(undefined4 *)(unaff_x24 + 6) = 0;
  *(undefined2 *)(unaff_x29 + -0x4e) = 0;
  *(undefined1 *)(unaff_x29 + -0x52) = 1;
  func_0x00416de4(&uStack0000000000000020,unaff_x29 + -0x58);
  if ((int)uStack0000000000000020 == 1) {
    uVar5 = 1;
    puVar10 = in_stack_00000028;
    goto LAB_0042b068;
  }
  uVar3 = uStack0000000000000020._4_4_;
  in_stack_00000098 = 0;
  in_stack_00000090 = 0;
  in_stack_000000a8 = 0;
  in_stack_000000a0 = 0;
  in_stack_00000078 = 0;
  in_stack_00000070 = 0;
  in_stack_00000088 = 0;
  in_stack_00000080 = (undefined *)0x0;
  in_stack_00000058 = 0;
  in_stack_00000050 = 0;
  in_stack_00000068 = 0;
  in_stack_00000060 = 0;
  in_stack_00000038 = 0;
  in_stack_00000030 = 0;
  in_stack_00000048 = 0;
  in_stack_00000040 = 0;
  in_stack_00000028 = (undefined *)0x0;
  uStack0000000000000020 = (undefined *)0x0;
  iVar4 = _fstat(uVar3,&uStack0000000000000020);
  puVar10 = in_stack_00000080;
  puVar2 = uStack0000000000000020;
  if (iVar4 == -1) {
    puVar6 = (uint *)___error();
    puVar10 = (undefined *)((ulong)*puVar6 << 0x20 | 2);
  }
  else {
    if (((ulong)uStack0000000000000020 & 0xf00000000000) == 0x800000000000) {
      _uStack0000000000000004 = uVar3;
      in_stack_00000018 = &uStack0000000000000004;
      if (unaff_x20 < 0x180) {
        _memcpy(&uStack0000000000000020);
        *(undefined1 *)((long)&uStack0000000000000020 + unaff_x20) = 0;
        func_0x00462a54(unaff_x29 + -0x58,&uStack0000000000000020,unaff_x20 + 1);
        if ((*(uint *)(unaff_x29 + -0x58) & 1) == 0) {
          iVar4 = _fclonefileat(_uStack0000000000000004,0xfffffffe,*(undefined8 *)(unaff_x24 + 8),0)
          ;
          bVar8 = false;
          if (iVar4 == -1) {
            puVar6 = (uint *)___error();
            in_stack_00000010 = (undefined *)((ulong)*puVar6 << 0x20 | 2);
            goto code_r0x0042ae68;
          }
        }
        else {
          in_stack_00000010 = &UNK_009dae48;
code_r0x0042ae68:
          bVar8 = true;
        }
        if (!bVar8) goto code_r0x0042b054;
code_r0x0042ae74:
        puVar10 = in_stack_00000010;
        if (((ulong)in_stack_00000010 & 3) == 2) {
          uVar5 = 1;
          if (((uint)((ulong)in_stack_00000010 >> 0x20) < 0x2e) &&
             ((1L << ((ulong)in_stack_00000010 >> 0x20 & 0x3f) & 0x200000060000U) != 0)) {
            *(undefined4 *)(unaff_x29 + -0x58) = 0;
            *(undefined4 *)(unaff_x24 + 6) = 0;
            *(undefined2 *)(unaff_x29 + -0x4e) = 0;
            *(short *)(unaff_x29 + -0x54) = (short)((ulong)puVar2 >> 0x20);
            *(undefined1 *)(unaff_x29 + -0x51) = 1;
            *(undefined1 *)(unaff_x29 + -0x4e) = 1;
            *(undefined1 *)(unaff_x29 + -0x4f) = 1;
            func_0x00416de4(&uStack0000000000000020,unaff_x29 + -0x58);
            if ((int)uStack0000000000000020 == 1) {
              puVar10 = in_stack_00000028;
            }
            else {
              uVar3 = uStack0000000000000020._4_4_;
              in_stack_00000098 = 0;
              in_stack_00000090 = 0;
              in_stack_000000a8 = 0;
              in_stack_000000a0 = 0;
              in_stack_00000078 = 0;
              in_stack_00000070 = 0;
              in_stack_00000088 = 0;
              in_stack_00000080 = (undefined *)0x0;
              in_stack_00000058 = 0;
              in_stack_00000050 = 0;
              in_stack_00000068 = 0;
              in_stack_00000060 = 0;
              in_stack_00000038 = 0;
              in_stack_00000030 = 0;
              in_stack_00000048 = 0;
              in_stack_00000040 = 0;
              in_stack_00000028 = (undefined *)0x0;
              uStack0000000000000020 = (undefined *)0x0;
              iVar4 = _fstat(uVar3,&uStack0000000000000020);
              if (iVar4 == -1) {
                puVar6 = (uint *)___error();
                puVar10 = (undefined *)((ulong)*puVar6 << 0x20 | 2);
              }
              else {
                uVar11 = (ulong)uStack0000000000000020 & 0xf00000000000;
                if (uVar11 == 0x800000000000) {
                  do {
                    iVar4 = _fchmod(uVar3,(uint)((ulong)puVar2 >> 0x20) & 0xffff);
                    if (iVar4 != -1) goto code_r0x0042af74;
                    puVar6 = (uint *)___error();
                  } while (*puVar6 == 4);
                  puVar10 = (undefined *)((ulong)*puVar6 << 0x20 | 2);
                }
                else {
code_r0x0042af74:
                  lVar7 = _copyfile_state_alloc();
                  if (lVar7 == 0) {
                    puVar6 = (uint *)___error();
                    uVar1 = *puVar6;
                  }
                  else {
                    uVar9 = 0xf;
                    if (uVar11 != 0x800000000000) {
                      uVar9 = 8;
                    }
                    iVar4 = _fcopyfile(_uStack0000000000000004,uVar3,lVar7,uVar9);
                    if (iVar4 != -1) {
                      uStack0000000000000020 = (undefined *)0x0;
                      iVar4 = _copyfile_state_get(lVar7,8,&uStack0000000000000020);
                      puVar10 = uStack0000000000000020;
                      if (iVar4 != -1) {
                        _copyfile_state_free(lVar7);
                        _close(uVar3);
                        _close(_uStack0000000000000004);
                        uVar5 = 0;
                        goto LAB_0042b068;
                      }
                    }
                    puVar6 = (uint *)___error();
                    uVar1 = *puVar6;
                    _copyfile_state_free(lVar7);
                  }
                  puVar10 = (undefined *)((ulong)uVar1 << 0x20 | 2);
                }
              }
              _close(uVar3);
            }
            goto code_r0x0042ae84;
          }
        }
        else {
code_r0x0042ae84:
          uVar5 = 1;
        }
      }
      else {
        func_0x007a0d28(&uStack0000000000000008);
        if ((uStack0000000000000008 & 1) != 0) goto code_r0x0042ae74;
code_r0x0042b054:
        uVar5 = 0;
      }
      _close(_uStack0000000000000004);
      goto LAB_0042b068;
    }
    puVar10 = &UNK_009dbbd0;
  }
  _close(uVar3);
  uVar5 = 1;
LAB_0042b068:
  auVar12._8_8_ = puVar10;
  auVar12._0_8_ = uVar5;
  return auVar12;
}

