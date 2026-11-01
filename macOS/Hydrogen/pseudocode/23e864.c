
void thunk_FUN_0023e900(void)

{
  ushort uVar1;
  ushort uVar2;
  undefined2 uVar3;
  code *pcVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined2 *puVar7;
  long lVar8;
  undefined8 *puVar9;
  long *plVar10;
  undefined8 unaff_x19;
  ulong unaff_x21;
  long *plVar11;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  undefined8 unaff_x24;
  undefined8 unaff_x27;
  ulong uVar15;
  long *unaff_x28;
  undefined8 *in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 *in_stack_00000018;
  undefined8 uStack0000000000000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  long in_stack_00000040;
  long *in_stack_00000048;
  long in_stack_00000050;
  undefined2 in_stack_00000058;
  
  do {
    lVar8 = 0xb;
    do {
      puVar9 = (undefined8 *)unaff_x28[lVar8];
      *puVar9 = unaff_x28;
      *(short *)(puVar9 + 1) = (short)lVar8 + -5;
      lVar8 = lVar8 + 1;
    } while ((4 - unaff_x21) + lVar8 != 0xb);
LAB_0023e748:
    do {
      uVar3 = in_stack_00000058;
      lVar8 = in_stack_00000050;
      plVar10 = in_stack_00000048;
      lVar13 = *unaff_x28;
      if (lVar13 == 0) {
        in_stack_00000008 = (undefined8 *)*in_stack_00000008;
        puVar9 = (undefined8 *)*in_stack_00000008;
        if (puVar9 == (undefined8 *)0x0) goto code_r0x0023eae0;
        lVar13 = in_stack_00000008[1];
        puVar5 = (undefined8 *)func_0x00187bd0(0x88,8);
        if (puVar5 == (undefined8 *)0x0) {
code_r0x0023eaec:
          func_0x007a1f18(8,0x88);
LAB_0023eb68:
                    /* WARNING: Does not return */
          pcVar4 = (code *)SoftwareBreakpoint(1,0x23eb6c);
          (*pcVar4)();
        }
        *puVar5 = 0;
        *(undefined2 *)((long)puVar5 + 10) = 0;
        puVar5[5] = puVar9;
        *puVar9 = puVar5;
        *(undefined2 *)(puVar9 + 1) = 0;
        *in_stack_00000008 = puVar5;
        in_stack_00000008[1] = lVar13 + 1;
        if (lVar8 != lVar13) {
          uVar6 = func_0x007a247c(&UNK_008297df,0x30,&UNK_009c99e8);
          func_0x007a28b0(uVar6,0xb,&UNK_009c9a18);
          goto LAB_0023eb68;
        }
        *(undefined2 *)((long)puVar5 + 10) = 1;
        *(undefined2 *)((long)puVar5 + 0xc) = uVar3;
        puVar5[6] = plVar10;
        *plVar10 = (long)puVar5;
        *(undefined2 *)(plVar10 + 1) = 1;
        goto code_r0x0023ea40;
      }
      if (in_stack_00000050 != in_stack_00000040) {
        func_0x007a247c(&UNK_00829837,0x35,&UNK_009c9a48);
        func_0x007a1f18(8,0x28);
code_r0x0023eae0:
        func_0x007a23bc(&UNK_009c99b8);
        goto code_r0x0023eaec;
      }
      uVar1 = *(ushort *)(unaff_x28 + 1);
      uVar15 = (ulong)uVar1;
      uVar2 = *(ushort *)(lVar13 + 10);
      uVar12 = (ulong)uVar2;
      if (uVar2 < 0xb) {
        uVar14 = uVar15 + 1;
        puVar7 = (undefined2 *)(lVar13 + 0xc + uVar15 * 2);
        if (uVar1 < uVar2) {
          _memmove(lVar13 + 0xc + uVar14 * 2,puVar7,(uVar12 - uVar15) * 2);
          _memmove(lVar13 + 0x28 + uVar15 * 8 + 0x10,lVar13 + 0x28 + uVar14 * 8,
                   (uVar12 - uVar15) * 8);
          unaff_x27 = unaff_x19;
        }
        *puVar7 = uVar3;
        *(long **)(lVar13 + uVar14 * 8 + 0x28) = plVar10;
        *(ushort *)(lVar13 + 10) = uVar2 + 1;
        if (uVar14 < uVar12 + 2) {
          lVar8 = uVar15 + 6;
          do {
            plVar10 = *(long **)(lVar13 + lVar8 * 8);
            *plVar10 = lVar13;
            *(short *)(plVar10 + 1) = (short)lVar8 + -5;
            lVar8 = lVar8 + 1;
          } while (lVar8 - uVar12 != 7);
        }
        goto code_r0x0023ea40;
      }
      in_stack_00000028 = in_stack_00000040 + 1;
      uStack0000000000000020 = lVar13;
      if (uVar1 < 5) {
        in_stack_00000030 = 4;
        func_0x0023f364(&uStack0000000000000038,&uStack0000000000000020);
        uVar14 = (ulong)*(ushort *)((long)uStack0000000000000038 + 10);
        lVar8 = (long)uStack0000000000000038 + 0xc;
        uVar12 = uVar15 + 1;
        puVar7 = (undefined2 *)(lVar8 + uVar15 * 2);
        lVar13 = uVar14 - uVar15;
        plVar11 = uStack0000000000000038;
        if (uVar15 <= uVar14 && lVar13 != 0) goto code_r0x0023e7b4;
code_r0x0023e89c:
        *puVar7 = uVar3;
code_r0x0023e8a0:
        plVar11[uVar12 + 5] = (long)plVar10;
        *(short *)((long)plVar11 + 10) = (short)uVar14 + 1;
        if (uVar12 < uVar14 + 2) {
          lVar8 = uVar15 + 6;
          do {
            puVar9 = (undefined8 *)plVar11[lVar8];
            *puVar9 = plVar11;
            *(short *)(puVar9 + 1) = (short)lVar8 + -5;
            lVar8 = lVar8 + 1;
          } while (lVar8 - uVar14 != 7);
        }
        unaff_x27 = unaff_x19;
        unaff_x28 = uStack0000000000000038;
        if (uStack0000000000000038 == (long *)0x0) {
code_r0x0023ea40:
          *in_stack_00000018 = unaff_x27;
          in_stack_00000018[1] = in_stack_00000010;
          in_stack_00000018[2] = unaff_x24;
          return;
        }
        goto LAB_0023e748;
      }
      if (uVar1 != 5) {
        if (uVar1 == 6) {
          in_stack_00000030 = 5;
          func_0x0023f364(&uStack0000000000000038,&uStack0000000000000020);
          uVar15 = 0;
        }
        else {
          in_stack_00000030 = 6;
          func_0x0023f364(&uStack0000000000000038,&uStack0000000000000020);
          uVar15 = uVar15 - 7;
        }
        uVar14 = (ulong)*(ushort *)((long)in_stack_00000048 + 10);
        lVar8 = (long)in_stack_00000048 + 0xc;
        uVar12 = uVar15 + 1;
        puVar7 = (undefined2 *)(lVar8 + uVar15 * 2);
        lVar13 = uVar14 - uVar15;
        plVar11 = in_stack_00000048;
        if (uVar14 < uVar15 || lVar13 == 0) goto code_r0x0023e89c;
code_r0x0023e7b4:
        _memmove(lVar8 + uVar12 * 2,puVar7,lVar13 << 1);
        *(undefined2 *)(lVar8 + uVar15 * 2) = uVar3;
        _memmove(plVar11 + uVar15 + 7,plVar11 + uVar12 + 5,lVar13 << 3);
        goto code_r0x0023e8a0;
      }
      in_stack_00000030 = 5;
      func_0x0023f364(&uStack0000000000000038,&uStack0000000000000020);
      unaff_x28 = uStack0000000000000038;
      uVar1 = *(ushort *)((long)uStack0000000000000038 + 10);
      unaff_x21 = (ulong)uVar1;
      if (5 < unaff_x21) {
        _memmove(uStack0000000000000038 + 3,(long)uStack0000000000000038 + 0x16,unaff_x21 * 2 + -10)
        ;
        *(undefined2 *)((long)unaff_x28 + 0x16) = uVar3;
        _memmove(unaff_x28 + 0xc,unaff_x28 + 0xb,unaff_x21 * 8 + -0x28);
        unaff_x28[0xb] = (long)plVar10;
        *(ushort *)((long)unaff_x28 + 10) = uVar1 + 1;
        break;
      }
      *(undefined2 *)((long)uStack0000000000000038 + 0x16) = uVar3;
      uStack0000000000000038[0xb] = (long)plVar10;
      *(ushort *)((long)uStack0000000000000038 + 10) = uVar1 + 1;
    } while (uVar1 != 5);
  } while( true );
}

