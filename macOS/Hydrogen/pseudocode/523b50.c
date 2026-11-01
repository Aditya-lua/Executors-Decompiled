
void FUN_00523b50(long param_1,undefined8 param_2)

{
  ulong uVar1;
  ulong uVar2;
  code *pcVar3;
  int iVar4;
  undefined8 *puVar5;
  ulong uVar6;
  long lVar7;
  undefined8 *puVar8;
  ulong uVar9;
  ulong *puVar10;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long *plVar11;
  long unaff_x24;
  long lVar12;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  long in_stack_00000000;
  long *in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  ulong *in_stack_00000020;
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  long in_stack_00000038;
  
  do {
    iVar4 = _memcmp(param_1,param_2,unaff_x24);
    param_1 = unaff_x25;
    if (iVar4 == 0) goto LAB_00523b2c;
    do {
      if (unaff_x20 == uStack0000000000000028) {
        func_0x0050c0c0(&uStack0000000000000028,&UNK_009ea588);
      }
      plVar11 = (long *)(in_stack_00000030 + unaff_x20 * 0x10);
      *plVar11 = param_1;
      plVar11[1] = unaff_x24;
      unaff_x20 = unaff_x20 + 1;
      in_stack_00000038 = unaff_x20;
LAB_00523b2c:
      unaff_x19 = unaff_x19 + 2;
      unaff_x27 = unaff_x27 + -0x10;
      if (unaff_x27 == 0) {
        while (unaff_x23 != in_stack_00000010) {
          lVar7 = unaff_x23;
          while( true ) {
            unaff_x23 = lVar7 + 0x60;
            if (*(long *)(lVar7 + 0x10) != 0) break;
code_r0x005239ec:
            lVar7 = unaff_x23;
            if (unaff_x23 == in_stack_00000010) goto code_r0x00523bec;
          }
          plVar11 = (long *)(*(long *)(lVar7 + 8) + 8);
          lVar12 = *(long *)(lVar7 + 0x10) << 4;
code_r0x00523a20:
          if ((*plVar11 != unaff_x22) || (iVar4 = _memcmp(plVar11[-1]), iVar4 != 0))
          goto code_r0x00523a14;
          uVar13 = *(undefined8 *)(lVar7 + 0x48);
          uVar1 = *(ulong *)(lVar7 + 0x50);
          puVar10 = in_stack_00000020;
          lVar7 = in_stack_00000018;
          while ((puVar10[3] != uVar1 || (iVar4 = _memcmp(puVar10[2],uVar13,uVar1), iVar4 != 0))) {
            puVar10 = puVar10 + 0xc;
            lVar7 = lVar7 + -0x60;
            if (lVar7 == 0) {
              func_0x007a23d8(&UNK_008a791f,99,&UNK_009ea570);
                    /* WARNING: Does not return */
              pcVar3 = (code *)SoftwareBreakpoint(1,0x523dac);
              (*pcVar3)();
            }
          }
          uVar1 = *puVar10;
          uVar2 = puVar10[1];
          if ((ulong)(uStack0000000000000028 - unaff_x20) < uVar2) {
            func_0x007a5594(&uStack0000000000000028,unaff_x20,uVar2,8,0x10);
            unaff_x20 = in_stack_00000038;
            if (uVar2 < 4) {
code_r0x00523abc:
              uVar6 = 0;
            }
            else {
code_r0x00523a9c:
              uVar9 = in_stack_00000030 + in_stack_00000038 * 0x10;
              if ((uVar9 < uVar1 + uVar2 * 0x10) &&
                 (unaff_x20 = in_stack_00000038, uVar1 < uVar9 + uVar2 * 0x10))
              goto code_r0x00523abc;
              uVar6 = uVar2 & 0xfffffffffffffffc;
              unaff_x20 = in_stack_00000038 + uVar6;
              puVar5 = (undefined8 *)(uVar1 + 0x20);
              puVar8 = (undefined8 *)(uVar9 + 0x20);
              uVar9 = uVar6;
              do {
                uVar14 = puVar5[-3];
                uVar13 = puVar5[-2];
                uVar15 = puVar5[-1];
                uVar16 = *puVar5;
                uVar18 = puVar5[1];
                uVar17 = puVar5[2];
                uVar19 = puVar5[3];
                puVar8[-4] = puVar5[-4];
                puVar8[-3] = uVar14;
                puVar8[-2] = uVar13;
                puVar8[-1] = uVar15;
                *puVar8 = uVar16;
                puVar8[1] = uVar18;
                puVar8[2] = uVar17;
                puVar8[3] = uVar19;
                puVar5 = puVar5 + 8;
                puVar8 = puVar8 + 8;
                uVar9 = uVar9 - 4;
              } while (uVar9 != 0);
              if (uVar2 == uVar6) goto code_r0x00523af4;
            }
            puVar5 = (undefined8 *)(in_stack_00000030 + unaff_x20 * 0x10 + 8);
            lVar7 = uVar2 - uVar6;
            puVar8 = (undefined8 *)(uVar1 + uVar6 * 0x10 + 8);
            unaff_x20 = (unaff_x20 + uVar2) - uVar6;
            do {
              uVar13 = *puVar8;
              puVar5[-1] = puVar8[-1];
              *puVar5 = uVar13;
              puVar5 = puVar5 + 2;
              puVar8 = puVar8 + 2;
              lVar7 = lVar7 + -1;
            } while (lVar7 != 0);
          }
          else if (uVar2 != 0) {
            in_stack_00000038 = unaff_x20;
            if (3 < uVar2) goto code_r0x00523a9c;
            goto code_r0x00523abc;
          }
code_r0x00523af4:
          in_stack_00000038 = unaff_x20;
          if (((*(byte *)((long)puVar10 + 0x21) & 1) == 0) && (puVar10[-5] != 0)) {
            unaff_x19 = (long *)(puVar10[-6] + 8);
            unaff_x27 = puVar10[-5] << 4;
            goto code_r0x00523b38;
          }
        }
code_r0x00523bec:
        uVar1 = *(ulong *)(in_stack_00000000 + unaff_x26 + 0x88);
        uVar2 = *(ulong *)(in_stack_00000000 + unaff_x26 + 0x90);
        if ((ulong)(uStack0000000000000028 - unaff_x20) < uVar2) {
          func_0x007a5594(&uStack0000000000000028,unaff_x20,uVar2,8,0x10);
          unaff_x20 = in_stack_00000038;
        }
        else if (uVar2 == 0) goto code_r0x00523d64;
        if ((uVar2 < 6) ||
           (uVar9 = in_stack_00000030 + unaff_x20 * 0x10,
           uVar9 < uVar1 + uVar2 * 0x10 && uVar1 < uVar9 + uVar2 * 0x10)) {
          uVar6 = 0;
          goto code_r0x00523d2c;
        }
        uVar6 = uVar2 & 0xfffffffffffffffc;
        unaff_x20 = unaff_x20 + uVar6;
        puVar5 = (undefined8 *)(uVar1 + 0x20);
        puVar8 = (undefined8 *)(uVar9 + 0x20);
        uVar9 = uVar6;
        do {
          uVar14 = puVar5[-3];
          uVar13 = puVar5[-2];
          uVar15 = puVar5[-1];
          uVar16 = *puVar5;
          uVar18 = puVar5[1];
          uVar17 = puVar5[2];
          uVar19 = puVar5[3];
          puVar8[-4] = puVar5[-4];
          puVar8[-3] = uVar14;
          puVar8[-2] = uVar13;
          puVar8[-1] = uVar15;
          *puVar8 = uVar16;
          puVar8[1] = uVar18;
          puVar8[2] = uVar17;
          puVar8[3] = uVar19;
          puVar5 = puVar5 + 8;
          puVar8 = puVar8 + 8;
          uVar9 = uVar9 - 4;
        } while (uVar9 != 0);
        if (uVar2 != uVar6) {
code_r0x00523d2c:
          puVar5 = (undefined8 *)(in_stack_00000030 + unaff_x20 * 0x10 + 8);
          lVar7 = uVar2 - uVar6;
          puVar8 = (undefined8 *)(uVar1 + uVar6 * 0x10 + 8);
          unaff_x20 = (unaff_x20 + uVar2) - uVar6;
          do {
            uVar13 = *puVar8;
            puVar5[-1] = puVar8[-1];
            *puVar5 = uVar13;
            puVar5 = puVar5 + 2;
            puVar8 = puVar8 + 2;
            lVar7 = lVar7 + -1;
          } while (lVar7 != 0);
        }
code_r0x00523d64:
        *in_stack_00000008 = uStack0000000000000028;
        in_stack_00000008[1] = in_stack_00000030;
        in_stack_00000008[2] = unaff_x20;
        return;
      }
code_r0x00523b38:
      param_1 = unaff_x19[-1];
      unaff_x24 = *unaff_x19;
    } while (unaff_x24 != *(long *)(unaff_x28 + 0x220));
    param_2 = *(undefined8 *)(unaff_x28 + 0x218);
    unaff_x25 = param_1;
  } while( true );
code_r0x00523a14:
  plVar11 = plVar11 + 2;
  lVar12 = lVar12 + -0x10;
  if (lVar12 == 0) goto code_r0x005239ec;
  goto code_r0x00523a20;
}

