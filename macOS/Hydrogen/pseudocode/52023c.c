
long * FUN_0052023c(undefined8 param_1,undefined8 param_2,dword *param_3)

{
  undefined8 uVar1;
  dword *pdVar2;
  long lVar3;
  int iVar4;
  undefined8 *puVar5;
  long *plVar6;
  long *plVar7;
  long *plVar8;
  long lVar9;
  undefined8 *puVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  undefined8 *unaff_x20;
  undefined8 *puVar14;
  long unaff_x23;
  long *plVar15;
  undefined8 *unaff_x24;
  long lVar16;
  long lVar17;
  long lVar18;
  long *plVar19;
  long unaff_x28;
  undefined1 auVar20 [16];
  long *in_stack_00000008;
  long *in_stack_00000010;
  undefined8 *in_stack_00000018;
  undefined8 *in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 *in_stack_00000038;
  long in_stack_00000040;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  long in_stack_00000058;
  
code_r0x0052023c:
  if (in_stack_00000020 == in_stack_00000018) {
    uStack0000000000000048 = -0x8000000000000000;
code_r0x00520368:
    *in_stack_00000008 = uStack0000000000000048;
    return in_stack_00000010;
  }
  *in_stack_00000010 = (long)(in_stack_00000020 + 2);
  if (*(long *)(in_stack_00000028 + 0xd8) != 0) {
    uVar1 = *in_stack_00000020;
    pdVar2 = (dword *)in_stack_00000020[1];
    puVar5 = (undefined8 *)(*(long *)(in_stack_00000028 + 0xd0) + 0x50);
    lVar13 = *(long *)(in_stack_00000028 + 0xd8) * 0x60;
    do {
      if (((dword *)*puVar5 == pdVar2) &&
         (param_3 = pdVar2, iVar4 = _memcmp(puVar5[-1],uVar1), iVar4 == 0)) {
        func_0x00505704(&uStack0000000000000030,in_stack_00000028,in_stack_00000020);
        lVar13 = uStack0000000000000030;
        puVar5 = in_stack_00000038;
        lVar18 = in_stack_00000040;
        if (unaff_x24 == (undefined8 *)0x0) goto LAB_00520318;
        goto LAB_00520304;
      }
      puVar5 = puVar5 + 0xc;
      lVar13 = lVar13 + -0x60;
    } while (lVar13 != 0);
  }
  puVar5 = (undefined8 *)func_0x00187bd0(0x10,8);
  if (puVar5 != (undefined8 *)0x0) {
    uVar1 = in_stack_00000020[1];
    *puVar5 = *in_stack_00000020;
    puVar5[1] = uVar1;
    lVar18 = 1;
    lVar13 = 1;
    if (unaff_x24 != (undefined8 *)0x0) {
LAB_00520304:
      if (unaff_x23 != 0) {
        param_3 = &MACH_HEADER.cpusubtype;
        func_0x00187bd4(unaff_x24,unaff_x23 << 4);
      }
    }
LAB_00520318:
    unaff_x24 = puVar5;
    unaff_x23 = lVar13;
    *unaff_x20 = unaff_x24;
    unaff_x20[1] = unaff_x24;
    unaff_x20[2] = unaff_x23;
    unaff_x20[3] = unaff_x24 + lVar18 * 2;
    if (lVar18 != 0) {
      puVar5 = unaff_x24;
      do {
        puVar14 = puVar5 + 2;
        param_3 = (dword *)puVar5[1];
        unaff_x20[1] = puVar14;
        plVar6 = (long *)func_0x00521640(&uStack0000000000000048);
        if (uStack0000000000000048 != unaff_x28) {
          in_stack_00000008[2] = in_stack_00000058;
          in_stack_00000008[1] = in_stack_00000050;
          in_stack_00000010 = plVar6;
          goto code_r0x00520368;
        }
        puVar5 = puVar14;
      } while (puVar14 != unaff_x24 + lVar18 * 2);
    }
    in_stack_00000020 = in_stack_00000020 + 2;
    goto code_r0x0052023c;
  }
  auVar20 = func_0x007a1f18(8,0x10);
  plVar7 = auVar20._0_8_;
  plVar6 = (long *)*plVar7;
  plVar8 = (long *)plVar7[1];
  if (plVar6 == plVar8) {
    plVar6 = (long *)0x0;
  }
  else {
    lVar9 = *auVar20._8_8_;
    lVar11 = *(long *)(param_3 + 2);
    lVar13 = plVar7[3];
    lVar18 = plVar7[2];
    if (lVar11 == 0) {
      while (plVar15 = plVar6 + 2, lVar18 != lVar13) {
        plVar7[2] = lVar18 + 0x68;
        if ((*(char *)(lVar18 + 0x61) != '\0') && (*(long *)(lVar9 + 0x90) != 0)) {
          lVar11 = *plVar6;
          lVar12 = plVar6[1];
          puVar5 = (undefined8 *)(*(long *)(lVar9 + 0x88) + 0x218);
          lVar16 = *(long *)(lVar9 + 0x90) * 600;
          do {
            if ((puVar5[1] == lVar12) && (iVar4 = _memcmp(*puVar5,lVar11,lVar12), iVar4 == 0)) {
              if ((*(byte *)(puVar5 + 7) >> 2 & 1) == 0) goto LAB_00520554;
              break;
            }
            puVar5 = puVar5 + 0x4b;
            lVar16 = lVar16 + -600;
          } while (lVar16 != 0);
        }
        lVar18 = lVar18 + 0x68;
        plVar6 = plVar15;
        if (plVar15 == plVar8) goto LAB_00520550;
      }
LAB_0052057c:
      *plVar7 = (long)plVar15;
      auVar20 = func_0x007a23bc(&UNK_009e9bf8);
      plVar6 = auVar20._0_8_;
      puVar5 = (undefined8 *)plVar6[1];
      if ((undefined8 *)*plVar6 == puVar5) {
        plVar8 = (long *)0x0;
      }
      else {
        uVar1 = *auVar20._8_8_;
        lVar13 = auVar20._8_8_[1];
        puVar14 = (undefined8 *)*plVar6;
        do {
          puVar10 = puVar14;
          if ((puVar10[1] == lVar13) && (iVar4 = _memcmp(*puVar10,uVar1,lVar13), iVar4 == 0)) {
            plVar8 = (long *)((long)&MACH_HEADER.magic + 1);
            goto LAB_005205f4;
          }
          puVar14 = puVar10 + 2;
        } while (puVar10 + 2 != puVar5);
        plVar8 = (long *)0x0;
LAB_005205f4:
        *plVar6 = (long)(puVar10 + 2);
      }
      return plVar8;
    }
    lVar12 = *(long *)param_3;
    do {
      plVar15 = plVar6 + 2;
      if (lVar18 == lVar13) goto LAB_0052057c;
      plVar7[2] = lVar18 + 0x68;
      if ((*(char *)(lVar18 + 0x61) != '\0') && (*(long *)(lVar9 + 0x90) != 0)) {
        lVar16 = *plVar6;
        lVar3 = plVar6[1];
        puVar5 = (undefined8 *)(*(long *)(lVar9 + 0x88) + 0x218);
        lVar17 = *(long *)(lVar9 + 0x90) * 600;
        do {
          if ((puVar5[1] == lVar3) && (iVar4 = _memcmp(*puVar5,lVar16,lVar3), iVar4 == 0)) {
            if ((*(byte *)(puVar5 + 7) >> 2 & 1) == 0) {
              lVar17 = lVar11 << 4;
              plVar19 = (long *)(lVar12 + 8);
              goto code_r0x00520524;
            }
            break;
          }
          puVar5 = puVar5 + 0x4b;
          lVar17 = lVar17 + -600;
        } while (lVar17 != 0);
      }
code_r0x00520488:
      lVar18 = lVar18 + 0x68;
      plVar6 = plVar15;
    } while (plVar15 != plVar8);
LAB_00520550:
    plVar6 = (long *)0x0;
LAB_00520554:
    *plVar7 = (long)plVar15;
  }
  return plVar6;
code_r0x00520524:
  if ((*plVar19 == lVar3) && (iVar4 = _memcmp(plVar19[-1],lVar16,lVar3), iVar4 == 0))
  goto code_r0x00520488;
  plVar19 = plVar19 + 2;
  lVar17 = lVar17 + -0x10;
  if (lVar17 == 0) goto LAB_00520554;
  goto code_r0x00520524;
}

