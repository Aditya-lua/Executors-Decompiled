
void FUN_0023e6ec(void)

{
  ushort uVar1;
  ushort uVar2;
  code *pcVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  undefined2 *puVar6;
  undefined8 *puVar7;
  long *plVar8;
  undefined8 *unaff_x19;
  long *unaff_x20;
  long lVar9;
  undefined2 unaff_w22;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  ulong unaff_x24;
  long unaff_x25;
  long lVar13;
  undefined2 unaff_w26;
  long *unaff_x28;
  ulong uVar14;
  undefined8 *in_stack_00000008;
  undefined8 uStack0000000000000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  long in_stack_00000040;
  long *in_stack_00000048;
  long in_stack_00000050;
  undefined2 in_stack_00000058;
  
  *(short *)((long)unaff_x28 + 10) = (short)unaff_x24;
  lVar11 = (unaff_x24 & 0xffff) - unaff_x24;
  if (unaff_x24 <= (unaff_x24 & 0xffff) && lVar11 != 0) {
    lVar9 = (long)unaff_x28 + unaff_x24 * 2 + 0xc;
    _memmove(lVar9 + 2,lVar9,lVar11 * 2);
  }
  *(undefined2 *)((long)unaff_x28 + unaff_x24 * 2 + 0xc) = unaff_w22;
  *(short *)((long)unaff_x28 + 10) = (short)unaff_x24 + 1;
  lVar11 = *unaff_x28;
  if (lVar11 == 0) {
    lVar9 = 0;
  }
  else {
    lVar9 = 0;
    lVar13 = unaff_x25;
    plVar8 = unaff_x28;
    do {
      if (lVar9 != lVar13) {
        func_0x007a247c(&UNK_00829837,0x35,&UNK_009c9a48);
        func_0x007a1f18(8,0x28);
        goto code_r0x0023eae0;
      }
      uVar1 = *(ushort *)(plVar8 + 1);
      uVar14 = (ulong)uVar1;
      uVar2 = *(ushort *)(lVar11 + 10);
      uVar10 = (ulong)uVar2;
      if (uVar2 < 0xb) {
        uVar12 = uVar14 + 1;
        puVar6 = (undefined2 *)(lVar11 + 0xc + uVar14 * 2);
        if (uVar1 < uVar2) {
          _memmove(lVar11 + 0xc + uVar12 * 2,puVar6,(uVar10 - uVar14) * 2);
          _memmove(lVar11 + 0x28 + uVar14 * 8 + 0x10,lVar11 + 0x28 + uVar12 * 8,
                   (uVar10 - uVar14) * 8);
        }
        *puVar6 = unaff_w26;
        *(long **)(lVar11 + uVar12 * 8 + 0x28) = unaff_x20;
        *(ushort *)(lVar11 + 10) = uVar2 + 1;
        if (uVar12 < uVar10 + 2) {
          lVar9 = uVar14 + 6;
          do {
            plVar8 = *(long **)(lVar11 + lVar9 * 8);
            *plVar8 = lVar11;
            *(short *)(plVar8 + 1) = (short)lVar9 + -5;
            lVar9 = lVar9 + 1;
          } while (lVar9 - uVar10 != 7);
        }
        goto code_r0x0023ea40;
      }
      in_stack_00000028 = lVar13 + 1;
      uStack0000000000000020 = lVar11;
      if (uVar1 < 5) {
        in_stack_00000030 = 4;
        func_0x0023f364(&uStack0000000000000038,&uStack0000000000000020);
        uVar12 = (ulong)*(ushort *)((long)uStack0000000000000038 + 10);
        lVar11 = (long)uStack0000000000000038 + 0xc;
        uVar10 = uVar14 + 1;
        puVar6 = (undefined2 *)(lVar11 + uVar14 * 2);
        lVar9 = uVar12 - uVar14;
        plVar8 = uStack0000000000000038;
        if (uVar12 < uVar14 || lVar9 == 0) {
LAB_0023e89c:
          *puVar6 = unaff_w26;
        }
        else {
code_r0x0023e7b4:
          _memmove(lVar11 + uVar10 * 2,puVar6,lVar9 << 1);
          *(undefined2 *)(lVar11 + uVar14 * 2) = unaff_w26;
          _memmove(plVar8 + uVar14 + 7,plVar8 + uVar10 + 5,lVar9 << 3);
        }
        plVar8[uVar10 + 5] = (long)unaff_x20;
        *(short *)((long)plVar8 + 10) = (short)uVar12 + 1;
        if (uVar10 < uVar12 + 2) {
          lVar11 = uVar14 + 6;
          do {
            puVar7 = (undefined8 *)plVar8[lVar11];
            *puVar7 = plVar8;
            *(short *)(puVar7 + 1) = (short)lVar11 + -5;
            lVar11 = lVar11 + 1;
          } while (lVar11 - uVar12 != 7);
        }
        plVar8 = uStack0000000000000038;
        if (uStack0000000000000038 == (long *)0x0) goto code_r0x0023ea40;
      }
      else {
        if (uVar1 != 5) {
          if (uVar1 == 6) {
            in_stack_00000030 = 5;
            func_0x0023f364(&uStack0000000000000038,&uStack0000000000000020);
            uVar14 = 0;
          }
          else {
            in_stack_00000030 = 6;
            func_0x0023f364(&uStack0000000000000038,&uStack0000000000000020);
            uVar14 = uVar14 - 7;
          }
          uVar12 = (ulong)*(ushort *)((long)in_stack_00000048 + 10);
          lVar11 = (long)in_stack_00000048 + 0xc;
          uVar10 = uVar14 + 1;
          puVar6 = (undefined2 *)(lVar11 + uVar14 * 2);
          lVar9 = uVar12 - uVar14;
          plVar8 = in_stack_00000048;
          if (uVar12 < uVar14 || lVar9 == 0) goto LAB_0023e89c;
          goto code_r0x0023e7b4;
        }
        in_stack_00000030 = 5;
        func_0x0023f364(&uStack0000000000000038,&uStack0000000000000020);
        plVar8 = uStack0000000000000038;
        uVar1 = *(ushort *)((long)uStack0000000000000038 + 10);
        uVar10 = (ulong)uVar1;
        if (uVar10 < 6) {
          *(undefined2 *)((long)uStack0000000000000038 + 0x16) = unaff_w26;
          uStack0000000000000038[0xb] = (long)unaff_x20;
          *(ushort *)((long)uStack0000000000000038 + 10) = uVar1 + 1;
          if (uVar1 != 5) goto code_r0x0023e748;
        }
        else {
          _memmove(uStack0000000000000038 + 3,(long)uStack0000000000000038 + 0x16,uVar10 * 2 + -10);
          *(undefined2 *)((long)plVar8 + 0x16) = unaff_w26;
          _memmove(plVar8 + 0xc,plVar8 + 0xb,uVar10 * 8 + -0x28);
          plVar8[0xb] = (long)unaff_x20;
          *(ushort *)((long)plVar8 + 10) = uVar1 + 1;
        }
        lVar11 = 0xb;
        do {
          puVar7 = (undefined8 *)plVar8[lVar11];
          *puVar7 = plVar8;
          *(short *)(puVar7 + 1) = (short)lVar11 + -5;
          lVar11 = lVar11 + 1;
        } while ((4 - uVar10) + lVar11 != 0xb);
      }
code_r0x0023e748:
      lVar11 = *plVar8;
      unaff_x20 = in_stack_00000048;
      lVar9 = in_stack_00000050;
      lVar13 = in_stack_00000040;
      unaff_w26 = in_stack_00000058;
    } while (lVar11 != 0);
  }
  in_stack_00000008 = (undefined8 *)*in_stack_00000008;
  puVar7 = (undefined8 *)*in_stack_00000008;
  if (puVar7 == (undefined8 *)0x0) {
code_r0x0023eae0:
    func_0x007a23bc(&UNK_009c99b8);
  }
  else {
    lVar11 = in_stack_00000008[1];
    puVar4 = (undefined8 *)func_0x00187bd0(0x88,8);
    if (puVar4 != (undefined8 *)0x0) {
      *puVar4 = 0;
      *(undefined2 *)((long)puVar4 + 10) = 0;
      puVar4[5] = puVar7;
      *puVar7 = puVar4;
      *(undefined2 *)(puVar7 + 1) = 0;
      *in_stack_00000008 = puVar4;
      in_stack_00000008[1] = lVar11 + 1;
      if (lVar9 == lVar11) {
        *(undefined2 *)((long)puVar4 + 10) = 1;
        *(undefined2 *)((long)puVar4 + 0xc) = unaff_w26;
        puVar4[6] = unaff_x20;
        *unaff_x20 = (long)puVar4;
        *(undefined2 *)(unaff_x20 + 1) = 1;
code_r0x0023ea40:
        *unaff_x19 = unaff_x28;
        unaff_x19[1] = unaff_x25;
        unaff_x19[2] = unaff_x24;
        return;
      }
      uVar5 = func_0x007a247c(&UNK_008297df,0x30,&UNK_009c99e8);
      func_0x007a28b0(uVar5,0xb,&UNK_009c9a18);
      goto code_r0x0023eb68;
    }
  }
  func_0x007a1f18(8,0x88);
code_r0x0023eb68:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x23eb6c);
  (*pcVar3)();
}

