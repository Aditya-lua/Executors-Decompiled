
void FUN_0023e828(void)

{
  ushort uVar1;
  ushort uVar2;
  code *pcVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  undefined2 *puVar6;
  long lVar7;
  undefined8 *puVar8;
  long *plVar9;
  undefined8 unaff_x19;
  long *unaff_x20;
  ulong unaff_x21;
  short unaff_w22;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  undefined8 unaff_x24;
  undefined2 unaff_w26;
  undefined8 unaff_x27;
  ulong uVar13;
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
  
code_r0x0023e828:
  if (unaff_x21 < 6) {
    *(undefined2 *)((long)unaff_x28 + 0x16) = unaff_w26;
    unaff_x28[0xb] = (long)unaff_x20;
    *(short *)((long)unaff_x28 + 10) = unaff_w22;
    if ((int)unaff_x21 != 5) goto code_r0x0023e748;
  }
  else {
    _memmove(unaff_x28 + 3,(long)unaff_x28 + 0x16,unaff_x21 * 2 + -10);
    *(undefined2 *)((long)unaff_x28 + 0x16) = unaff_w26;
    _memmove(unaff_x28 + 0xc,unaff_x28 + 0xb,unaff_x21 * 8 + -0x28);
    unaff_x28[0xb] = (long)unaff_x20;
    *(short *)((long)unaff_x28 + 10) = unaff_w22;
  }
  lVar7 = 0xb;
  do {
    puVar8 = (undefined8 *)unaff_x28[lVar7];
    *puVar8 = unaff_x28;
    *(short *)(puVar8 + 1) = (short)lVar7 + -5;
    lVar7 = lVar7 + 1;
  } while ((4 - unaff_x21) + lVar7 != 0xb);
code_r0x0023e748:
  do {
    unaff_w26 = in_stack_00000058;
    lVar7 = in_stack_00000050;
    unaff_x20 = in_stack_00000048;
    lVar11 = *unaff_x28;
    if (lVar11 == 0) {
      in_stack_00000008 = (undefined8 *)*in_stack_00000008;
      puVar8 = (undefined8 *)*in_stack_00000008;
      if (puVar8 == (undefined8 *)0x0) goto code_r0x0023eae0;
      lVar11 = in_stack_00000008[1];
      puVar4 = (undefined8 *)func_0x00187bd0(0x88,8);
      if (puVar4 == (undefined8 *)0x0) {
code_r0x0023eaec:
        func_0x007a1f18(8,0x88);
code_r0x0023eb68:
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x23eb6c);
        (*pcVar3)();
      }
      *puVar4 = 0;
      *(undefined2 *)((long)puVar4 + 10) = 0;
      puVar4[5] = puVar8;
      *puVar8 = puVar4;
      *(undefined2 *)(puVar8 + 1) = 0;
      *in_stack_00000008 = puVar4;
      in_stack_00000008[1] = lVar11 + 1;
      if (lVar7 != lVar11) {
        uVar5 = func_0x007a247c(&UNK_008297df,0x30,&UNK_009c99e8);
        func_0x007a28b0(uVar5,0xb,&UNK_009c9a18);
        goto code_r0x0023eb68;
      }
      *(undefined2 *)((long)puVar4 + 10) = 1;
      *(undefined2 *)((long)puVar4 + 0xc) = unaff_w26;
      puVar4[6] = unaff_x20;
      *unaff_x20 = (long)puVar4;
      *(undefined2 *)(unaff_x20 + 1) = 1;
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
    uVar13 = (ulong)uVar1;
    uVar2 = *(ushort *)(lVar11 + 10);
    uVar10 = (ulong)uVar2;
    if (uVar2 < 0xb) {
      uVar12 = uVar13 + 1;
      puVar6 = (undefined2 *)(lVar11 + 0xc + uVar13 * 2);
      if (uVar1 < uVar2) {
        _memmove(lVar11 + 0xc + uVar12 * 2,puVar6,(uVar10 - uVar13) * 2);
        _memmove(lVar11 + 0x28 + uVar13 * 8 + 0x10,lVar11 + 0x28 + uVar12 * 8,(uVar10 - uVar13) * 8)
        ;
        unaff_x27 = unaff_x19;
      }
      *puVar6 = unaff_w26;
      *(long **)(lVar11 + uVar12 * 8 + 0x28) = unaff_x20;
      *(ushort *)(lVar11 + 10) = uVar2 + 1;
      if (uVar12 < uVar10 + 2) {
        lVar7 = uVar13 + 6;
        do {
          plVar9 = *(long **)(lVar11 + lVar7 * 8);
          *plVar9 = lVar11;
          *(short *)(plVar9 + 1) = (short)lVar7 + -5;
          lVar7 = lVar7 + 1;
        } while (lVar7 - uVar10 != 7);
      }
      goto code_r0x0023ea40;
    }
    in_stack_00000028 = in_stack_00000040 + 1;
    uStack0000000000000020 = lVar11;
    if (uVar1 < 5) {
      in_stack_00000030 = 4;
      func_0x0023f364(&uStack0000000000000038,&uStack0000000000000020);
      uVar12 = (ulong)*(ushort *)((long)uStack0000000000000038 + 10);
      lVar7 = (long)uStack0000000000000038 + 0xc;
      uVar10 = uVar13 + 1;
      puVar6 = (undefined2 *)(lVar7 + uVar13 * 2);
      lVar11 = uVar12 - uVar13;
      plVar9 = uStack0000000000000038;
      if (!(uVar12 < uVar13 || lVar11 == 0)) goto code_r0x0023e7b4;
code_r0x0023e89c:
      *puVar6 = unaff_w26;
    }
    else {
      if (uVar1 == 5) break;
      if (uVar1 == 6) {
        in_stack_00000030 = 5;
        func_0x0023f364(&uStack0000000000000038,&uStack0000000000000020);
        uVar13 = 0;
      }
      else {
        in_stack_00000030 = 6;
        func_0x0023f364(&uStack0000000000000038,&uStack0000000000000020);
        uVar13 = uVar13 - 7;
      }
      uVar12 = (ulong)*(ushort *)((long)in_stack_00000048 + 10);
      lVar7 = (long)in_stack_00000048 + 0xc;
      uVar10 = uVar13 + 1;
      puVar6 = (undefined2 *)(lVar7 + uVar13 * 2);
      lVar11 = uVar12 - uVar13;
      plVar9 = in_stack_00000048;
      if (!(uVar13 <= uVar12 && lVar11 != 0)) goto code_r0x0023e89c;
code_r0x0023e7b4:
      _memmove(lVar7 + uVar10 * 2,puVar6,lVar11 << 1);
      *(undefined2 *)(lVar7 + uVar13 * 2) = unaff_w26;
      _memmove(plVar9 + uVar13 + 7,plVar9 + uVar10 + 5,lVar11 << 3);
    }
    plVar9[uVar10 + 5] = (long)unaff_x20;
    *(short *)((long)plVar9 + 10) = (short)uVar12 + 1;
    if (uVar10 < uVar12 + 2) {
      lVar7 = uVar13 + 6;
      do {
        puVar8 = (undefined8 *)plVar9[lVar7];
        *puVar8 = plVar9;
        *(short *)(puVar8 + 1) = (short)lVar7 + -5;
        lVar7 = lVar7 + 1;
      } while (lVar7 - uVar12 != 7);
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
  } while( true );
  in_stack_00000030 = 5;
  func_0x0023f364(&uStack0000000000000038,&uStack0000000000000020);
  unaff_x21 = (ulong)*(ushort *)((long)uStack0000000000000038 + 10);
  unaff_w22 = *(ushort *)((long)uStack0000000000000038 + 10) + 1;
  unaff_x28 = uStack0000000000000038;
  goto code_r0x0023e828;
}

