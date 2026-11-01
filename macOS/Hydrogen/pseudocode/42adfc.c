
undefined1  [16] FUN_0042adfc(ulong param_1)

{
  uint uVar1;
  undefined4 uVar2;
  int iVar3;
  uint *puVar4;
  long lVar5;
  bool bVar6;
  undefined4 uVar7;
  undefined8 uVar8;
  undefined *unaff_x19;
  long unaff_x23;
  ulong uVar9;
  long unaff_x24;
  undefined8 unaff_x25;
  long unaff_x29;
  undefined1 auVar10 [16];
  undefined8 in_stack_00000000;
  undefined *in_stack_00000010;
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
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  
  if ((param_1 & 1) == 0) {
    iVar3 = _fclonefileat(in_stack_00000000._4_4_,0xfffffffe,*(undefined8 *)(unaff_x24 + 8),0);
    bVar6 = false;
    if (iVar3 == -1) {
      puVar4 = (uint *)___error();
      in_stack_00000010 = (undefined *)((ulong)*puVar4 << 0x20 | 2);
      goto LAB_0042ae68;
    }
  }
  else {
    in_stack_00000010 = &UNK_009dae48;
LAB_0042ae68:
    bVar6 = true;
  }
  if (bVar6) {
    if (((ulong)in_stack_00000010 & 3) == 2) {
      uVar8 = 1;
      if ((0x2d < (uint)((ulong)in_stack_00000010 >> 0x20)) ||
         ((1L << ((ulong)in_stack_00000010 >> 0x20 & 0x3f) & 0x200000060000U) == 0))
      goto code_r0x0042b058;
      *(undefined4 *)(unaff_x29 + -0x58) = 0;
      *(undefined4 *)(unaff_x24 + 6) = 0;
      *(undefined2 *)(unaff_x29 + -0x4e) = 0;
      *(short *)(unaff_x29 + -0x54) = (short)((ulong)unaff_x25 >> 0x20);
      *(undefined1 *)(unaff_x29 + -0x51) = 1;
      *(undefined1 *)(unaff_x29 + -0x4e) = 1;
      *(undefined1 *)(unaff_x29 + -0x4f) = 1;
      func_0x00416de4(&uStack0000000000000020,unaff_x29 + -0x58);
      if ((int)uStack0000000000000020 == 1) {
        in_stack_00000010 = in_stack_00000028;
      }
      else {
        uVar2 = uStack0000000000000020._4_4_;
        *(undefined8 *)(unaff_x23 + 0x78) = 0;
        *(undefined8 *)(unaff_x23 + 0x70) = 0;
        *(undefined8 *)(unaff_x23 + 0x88) = 0;
        *(undefined8 *)(unaff_x23 + 0x80) = 0;
        in_stack_00000078 = 0;
        in_stack_00000070 = 0;
        in_stack_00000088 = 0;
        in_stack_00000080 = 0;
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
        iVar3 = _fstat(uVar2,&uStack0000000000000020);
        if (iVar3 == -1) {
          puVar4 = (uint *)___error();
          in_stack_00000010 = (undefined *)((ulong)*puVar4 << 0x20 | 2);
        }
        else {
          uVar9 = (ulong)uStack0000000000000020 & 0xf00000000000;
          if (uVar9 == 0x800000000000) {
            do {
              iVar3 = _fchmod(uVar2,(uint)((ulong)unaff_x25 >> 0x20) & 0xffff);
              if (iVar3 != -1) goto code_r0x0042af74;
              puVar4 = (uint *)___error();
            } while (*puVar4 == 4);
            in_stack_00000010 = (undefined *)((ulong)*puVar4 << 0x20 | 2);
          }
          else {
code_r0x0042af74:
            lVar5 = _copyfile_state_alloc();
            if (lVar5 == 0) {
              puVar4 = (uint *)___error();
              uVar1 = *puVar4;
            }
            else {
              uVar7 = 0xf;
              if (uVar9 != 0x800000000000) {
                uVar7 = 8;
              }
              iVar3 = _fcopyfile(in_stack_00000000._4_4_,uVar2,lVar5,uVar7);
              if (iVar3 != -1) {
                uStack0000000000000020 = (undefined *)0x0;
                iVar3 = _copyfile_state_get(lVar5,8,&uStack0000000000000020);
                in_stack_00000010 = uStack0000000000000020;
                if (iVar3 != -1) {
                  _copyfile_state_free(lVar5);
                  _close(uVar2);
                  _close(in_stack_00000000._4_4_);
                  uVar8 = 0;
                  goto code_r0x0042b068;
                }
              }
              puVar4 = (uint *)___error();
              uVar1 = *puVar4;
              _copyfile_state_free(lVar5);
            }
            in_stack_00000010 = (undefined *)((ulong)uVar1 << 0x20 | 2);
          }
        }
        _close(uVar2);
      }
    }
    uVar8 = 1;
  }
  else {
    uVar8 = 0;
    in_stack_00000010 = unaff_x19;
  }
code_r0x0042b058:
  _close(in_stack_00000000._4_4_);
code_r0x0042b068:
  auVar10._8_8_ = in_stack_00000010;
  auVar10._0_8_ = uVar8;
  return auVar10;
}

