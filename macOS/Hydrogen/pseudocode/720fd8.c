
undefined1  [16] FUN_00720fd8(void)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  long extraout_x1;
  int iVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  long lVar7;
  undefined8 *unaff_x22;
  undefined4 uVar8;
  long lVar9;
  undefined8 unaff_x26;
  long unaff_x27;
  undefined1 auVar10 [16];
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined4 uStack0000000000000038;
  undefined4 uStack000000000000003c;
  
  do {
    func_0x00711dac();
    do {
      func_0x00710d48();
      iVar4 = *(int *)(unaff_x19 + 0x80);
      if (iVar4 != 0x106) {
        if (iVar4 == 0x119) {
          func_0x0070c3d0(&uStack0000000000000030);
          if ((int)uStack0000000000000030 == 0x106) goto code_r0x00720e28;
          iVar4 = *(int *)(unaff_x19 + 0x80);
        }
        if (iVar4 != 0x3e) {
          if (iVar4 == 0x28) {
            uStack0000000000000038 = (undefined4)unaff_x22[1];
            uStack000000000000003c = (undefined4)((ulong)unaff_x22[1] >> 0x20);
            uStack0000000000000030._0_4_ = (int)*unaff_x22;
            uStack0000000000000030._4_4_ = (undefined4)((ulong)*unaff_x22 >> 0x20);
            func_0x0071f5c8();
            if (extraout_x1 == 0) {
              uStack0000000000000008 = func_0x0071cf0c();
              in_stack_00000010 = 0;
              func_0x00724248(&uStack0000000000000018,&uStack0000000000000008);
            }
            else if ((((*(int *)(extraout_x1 + 8) == *(int *)(unaff_x27 + 0xd88)) &&
                      (*(long *)(extraout_x1 + 0x30) == 0)) && (*(long *)(extraout_x1 + 0x28) == 1))
                    && (((iVar4 = *(int *)(unaff_x19 + 0x80), iVar4 == 0x26 || (iVar4 == 0x7c)) ||
                        (iVar4 == 0x3f)))) {
              lVar9 = **(long **)(extraout_x1 + 0x20);
              uVar2 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x28);
              func_0x00708390(uVar2,lVar9 + 0xc,lVar9);
              uStack0000000000000008 = func_0x0071cf0c();
              in_stack_00000010 = 0;
              func_0x00724248(&uStack0000000000000018,&uStack0000000000000008);
            }
            else {
              uStack0000000000000008 = 0;
              in_stack_00000010 = extraout_x1;
              func_0x00724248(&uStack0000000000000018,&uStack0000000000000008);
            }
          }
          else {
            uVar8 = *(undefined4 *)(unaff_x19 + 0x114);
            uStack0000000000000038 = (undefined4)unaff_x22[1];
            uStack000000000000003c = (undefined4)((ulong)unaff_x22[1] >> 0x20);
            uStack0000000000000030._0_4_ = (int)*unaff_x22;
            uStack0000000000000030._4_4_ = (undefined4)((ulong)*unaff_x22 >> 0x20);
            if ((iVar4 != 0x26) && (iVar4 != 0x7c)) goto code_r0x00720f54;
code_r0x00720f6c:
            uStack0000000000000008 = func_0x0071cf0c();
            *(undefined4 *)(unaff_x19 + 0x114) = uVar8;
            in_stack_00000010 = 0;
            func_0x00724248(&uStack0000000000000018,&uStack0000000000000008);
          }
          goto code_r0x00720fc8;
        }
        if (in_stack_00000028 != 0) {
          uVar8 = *(undefined4 *)(unaff_x19 + 0x114);
          uStack0000000000000038 = (undefined4)unaff_x22[1];
          uStack000000000000003c = (undefined4)((ulong)unaff_x22[1] >> 0x20);
          uStack0000000000000030._0_4_ = (int)*unaff_x22;
          uStack0000000000000030._4_4_ = (undefined4)((ulong)*unaff_x22 >> 0x20);
code_r0x00720f54:
          func_0x0071f5c8();
          *(undefined4 *)(unaff_x19 + 0x114) = uVar8;
          goto code_r0x00720f6c;
        }
        iVar4 = 0x3e;
code_r0x00721008:
        if (unaff_x20 != (undefined8 *)0x0) {
          *unaff_x20 = *(undefined8 *)(unaff_x19 + 0x84);
          iVar4 = *(int *)(unaff_x19 + 0x80);
        }
        uStack0000000000000030._0_4_ = 0x3c;
        uStack0000000000000030._4_4_ = (undefined4)unaff_x26;
        uStack0000000000000038 = (undefined4)((ulong)unaff_x26 >> 0x20);
        if (iVar4 == 0x3e) {
          func_0x00710d48();
        }
        else {
          func_0x00721808();
          func_0x007244d4();
        }
        lVar1 = in_stack_00000028;
        lVar9 = in_stack_00000020;
        if (in_stack_00000028 == 0) {
          puVar3 = (undefined8 *)0x0;
          lVar9 = *uStack0000000000000018 + in_stack_00000020 * 0x10;
          if (lVar9 == uStack0000000000000018[1]) goto code_r0x007210b0;
          goto code_r0x007210a8;
        }
        lVar7 = *uStack0000000000000018;
        puVar3 = (undefined8 *)
                 func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),in_stack_00000028 << 4);
        puVar5 = (undefined8 *)(lVar7 + lVar9 * 0x10);
        puVar6 = puVar3;
        lVar9 = lVar1;
        do {
          uVar2 = *puVar5;
          puVar6[1] = puVar5[1];
          *puVar6 = uVar2;
          lVar9 = lVar9 + -1;
          puVar5 = puVar5 + 2;
          puVar6 = puVar6 + 2;
        } while (lVar9 != 0);
        lVar9 = *uStack0000000000000018 + in_stack_00000020 * 0x10;
        if (lVar9 != uStack0000000000000018[1]) {
code_r0x007210a8:
          uStack0000000000000018[1] = lVar9;
        }
code_r0x007210b0:
        auVar10._8_8_ = lVar1;
        auVar10._0_8_ = puVar3;
        return auVar10;
      }
code_r0x00720e28:
      uVar2 = func_0x0071bcec();
      uStack0000000000000030._0_4_ = 0;
      uStack0000000000000030._4_4_ = 0;
      uStack0000000000000038 = (undefined4)uVar2;
      uStack000000000000003c = (undefined4)((ulong)uVar2 >> 0x20);
      func_0x00724248(&uStack0000000000000018,&uStack0000000000000030);
code_r0x00720fc8:
      iVar4 = *(int *)(unaff_x19 + 0x80);
      if (iVar4 != 0x2c) goto code_r0x00721008;
    } while (unaff_x21 == 0);
  } while( true );
}

