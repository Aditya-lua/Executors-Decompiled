
void FUN_00420da4(undefined4 *param_1,undefined4 *param_2)

{
  uint uVar1;
  code *pcVar2;
  int iVar3;
  undefined8 uVar4;
  uint *puVar5;
  undefined *puVar6;
  undefined *puVar7;
  ushort uVar8;
  long lVar9;
  ulong uVar10;
  undefined4 extraout_w12;
  undefined8 extraout_x13;
  undefined4 extraout_w14;
  undefined4 uVar11;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined4 uStack0000000000000010;
  undefined8 uStack0000000000000014;
  undefined4 uStack000000000000001c;
  undefined4 in_stack_00000020;
  
  uVar11 = *param_2;
  *(undefined4 *)(unaff_x29 + -0x24) = 0x80;
  do {
    uVar4 = _accept(uVar11,&uStack0000000000000008,unaff_x29 + -0x24);
    if ((int)uVar4 != -1) {
      iVar3 = _ioctl(uVar4,0x20006601);
      if (iVar3 == -1) {
        puVar5 = (uint *)___error();
        puVar6 = (undefined *)((ulong)*puVar5 << 0x20 | 2);
        _close(uVar4);
        goto LAB_00420eb4;
      }
      if (uStack0000000000000008._1_1_ == '\x1e') {
        if (*(uint *)(unaff_x29 + -0x24) < 0x1c) {
          puVar7 = &UNK_009dbc00;
          uVar4 = 0x35;
          puVar6 = &UNK_0088751b;
code_r0x00420f00:
          func_0x007a247c(puVar6,uVar4,puVar7);
                    /* WARNING: Does not return */
          pcVar2 = (code *)SoftwareBreakpoint(1,0x420f08);
          (*pcVar2)();
        }
        uVar8 = uStack0000000000000008._2_2_ >> 8 | uStack0000000000000008._2_2_ << 8;
        lVar9 = (ulong)(uint)uStack0000000000000010 << 0x10;
        uVar10 = 1;
      }
      else {
        if (uStack0000000000000008._1_1_ != '\x02') {
          _close();
          puVar6 = &UNK_009dbc18;
          goto LAB_00420eb4;
        }
        if (*(uint *)(unaff_x29 + -0x24) < 0x10) {
          puVar7 = &UNK_009dbbe8;
          uVar4 = 0x34;
          puVar6 = &UNK_008874bb;
          goto code_r0x00420f00;
        }
        uVar10 = 0;
        uVar1 = (uint)(uStack0000000000000008._2_2_ >> 8) |
                (uStack0000000000000008._2_2_ & 0xff00ff) << 8;
        uVar8 = (ushort)uVar1;
        lVar9 = CONCAT44(uVar1,uStack0000000000000008._4_4_);
        uStack0000000000000014 = extraout_x13;
        uStack000000000000001c = extraout_w14;
        in_stack_00000020 = extraout_w12;
      }
      uVar11 = 0;
      param_1[1] = (int)uVar4;
      *(ulong *)(param_1 + 2) = uVar10 | lVar9 << 0x10;
      *(undefined8 *)(param_1 + 4) = uStack0000000000000014;
      param_1[6] = uStack000000000000001c;
      param_1[7] = uStack0000000000000008._4_4_;
      param_1[8] = in_stack_00000020;
      *(ushort *)(param_1 + 9) = uVar8;
      goto code_r0x00420ebc;
    }
    puVar5 = (uint *)___error();
  } while (*puVar5 == 4);
  puVar6 = (undefined *)((ulong)*puVar5 << 0x20 | 2);
LAB_00420eb4:
  *(undefined **)(param_1 + 2) = puVar6;
  uVar11 = 1;
code_r0x00420ebc:
  *param_1 = uVar11;
  return;
}

