
undefined1  [16] FUN_0042ae90(void)

{
  uint uVar1;
  undefined4 uVar2;
  int iVar3;
  uint *puVar4;
  long lVar5;
  undefined8 uVar6;
  undefined4 uVar7;
  ulong in_x10;
  ulong unaff_x19;
  long unaff_x23;
  ulong uVar8;
  long unaff_x24;
  undefined8 unaff_x25;
  long unaff_x29;
  undefined1 auVar9 [16];
  undefined8 in_stack_00000000;
  undefined8 uStack0000000000000020;
  ulong in_stack_00000028;
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
  
  if (((uint)in_x10 < 0x2e) && ((1L << (in_x10 & 0x3f) & 0x200000060000U) != 0)) {
    *(undefined4 *)(unaff_x29 + -0x58) = 0;
    *(undefined4 *)(unaff_x24 + 6) = 0;
    *(undefined2 *)(unaff_x29 + -0x4e) = 0;
    *(short *)(unaff_x29 + -0x54) = (short)((ulong)unaff_x25 >> 0x20);
    *(undefined1 *)(unaff_x29 + -0x51) = 1;
    *(undefined1 *)(unaff_x29 + -0x4e) = 1;
    *(undefined1 *)(unaff_x29 + -0x4f) = 1;
    func_0x00416de4(&uStack0000000000000020,unaff_x29 + -0x58);
    unaff_x19 = in_stack_00000028;
    if ((int)uStack0000000000000020 != 1) {
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
      in_stack_00000028 = 0;
      uStack0000000000000020 = 0;
      iVar3 = _fstat(uVar2,&uStack0000000000000020);
      if (iVar3 == -1) {
        puVar4 = (uint *)___error();
        unaff_x19 = (ulong)*puVar4 << 0x20 | 2;
      }
      else {
        uVar8 = uStack0000000000000020 & 0xf00000000000;
        if (uVar8 == 0x800000000000) {
          do {
            iVar3 = _fchmod(uVar2,(uint)((ulong)unaff_x25 >> 0x20) & 0xffff);
            if (iVar3 != -1) goto LAB_0042af74;
            puVar4 = (uint *)___error();
          } while (*puVar4 == 4);
          unaff_x19 = (ulong)*puVar4 << 0x20 | 2;
        }
        else {
LAB_0042af74:
          lVar5 = _copyfile_state_alloc();
          if (lVar5 == 0) {
            puVar4 = (uint *)___error();
            uVar1 = *puVar4;
          }
          else {
            uVar7 = 0xf;
            if (uVar8 != 0x800000000000) {
              uVar7 = 8;
            }
            iVar3 = _fcopyfile(in_stack_00000000._4_4_,uVar2,lVar5,uVar7);
            if (iVar3 != -1) {
              uStack0000000000000020 = 0;
              iVar3 = _copyfile_state_get(lVar5,8,&uStack0000000000000020);
              unaff_x19 = uStack0000000000000020;
              if (iVar3 != -1) {
                _copyfile_state_free(lVar5);
                _close(uVar2);
                _close(in_stack_00000000._4_4_);
                uVar6 = 0;
                goto code_r0x0042b068;
              }
            }
            puVar4 = (uint *)___error();
            uVar1 = *puVar4;
            _copyfile_state_free(lVar5);
          }
          unaff_x19 = (ulong)uVar1 << 0x20 | 2;
        }
      }
      _close(uVar2);
    }
  }
  _close(in_stack_00000000._4_4_);
  uVar6 = 1;
code_r0x0042b068:
  auVar9._8_8_ = unaff_x19;
  auVar9._0_8_ = uVar6;
  return auVar9;
}

