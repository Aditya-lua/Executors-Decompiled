
void FUN_0023ec18(long param_1,undefined8 param_2,undefined8 *param_3)

{
  ushort uVar1;
  ushort uVar2;
  code *pcVar3;
  long *plVar4;
  undefined8 *puVar5;
  undefined *puVar6;
  undefined8 *puVar7;
  undefined8 *unaff_x19;
  ulong uVar8;
  long *plVar9;
  long lVar10;
  undefined1 unaff_w22;
  long lVar11;
  ulong uVar12;
  ulong uVar13;
  long lVar14;
  long *unaff_x27;
  ulong uVar15;
  undefined1 uVar16;
  long lStack0000000000000010;
  long *plVar17;
  undefined8 uStack0000000000000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  long in_stack_00000040;
  long *in_stack_00000048;
  long in_stack_00000050;
  undefined1 in_stack_00000058;
  
  lVar14 = *(long *)(param_1 + 8);
  uVar12 = *(ulong *)(param_1 + 0x10);
  plVar4 = (long *)func_0x00187bd0(0x18,8);
  if (plVar4 == (long *)0x0) {
LAB_0023f0c8:
    func_0x007a1f18(8,0x18);
code_r0x0023f0d4:
    func_0x007a23bc(&UNK_009c99b8);
  }
  else {
    *plVar4 = 0;
    *(undefined2 *)((long)plVar4 + 10) = 0;
    if (uVar12 < 5) {
      puVar6 = (undefined *)((ulong)*(ushort *)((long)unaff_x27 + 10) - 5);
      *(short *)((long)plVar4 + 10) = (short)puVar6;
      if (puVar6 < (undefined *)0xc) {
        uVar16 = (undefined1)unaff_x27[2];
        _memcpy((long)plVar4 + 0xc,(long)unaff_x27 + 0x11);
        uVar8 = 4;
        *(undefined2 *)((long)unaff_x27 + 10) = 4;
        goto LAB_0023ecfc;
      }
LAB_0023f108:
      func_0x007a28b0(puVar6,0xb,&UNK_009c9a18);
      goto LAB_0023f174;
    }
    if (uVar12 == 5) {
      uVar12 = (ulong)*(ushort *)((long)unaff_x27 + 10) - 6;
      *(short *)((long)plVar4 + 10) = (short)uVar12;
      if (0xb < uVar12) {
        func_0x007a28b0(uVar12,0xb,&UNK_009c9a18);
        goto LAB_0023f174;
      }
      uVar16 = *(undefined1 *)((long)unaff_x27 + 0x11);
      _memcpy((long)plVar4 + 0xc,(long)unaff_x27 + 0x12);
      uVar12 = 5;
      *(undefined2 *)((long)unaff_x27 + 10) = 5;
      uVar8 = 5;
LAB_0023ecfc:
      lVar11 = (long)unaff_x27 + 0xc;
      lVar10 = uVar8 - uVar12;
      lStack0000000000000010 = lVar14;
      plVar17 = unaff_x27;
      if (uVar12 <= uVar8 && lVar10 != 0) goto code_r0x0023ed10;
    }
    else {
      if (uVar12 == 6) {
        uVar8 = (ulong)*(ushort *)((long)unaff_x27 + 10) - 6;
        *(short *)((long)plVar4 + 10) = (short)uVar8;
        if (0xb < uVar8) {
          func_0x007a28b0(uVar8,0xb,&UNK_009c9a18);
          goto LAB_0023f174;
        }
        uVar16 = *(undefined1 *)((long)unaff_x27 + 0x11);
        _memcpy((long)plVar4 + 0xc,(long)unaff_x27 + 0x12);
        uVar12 = 0;
        *(undefined2 *)((long)unaff_x27 + 10) = 5;
      }
      else {
        uVar8 = (ulong)*(ushort *)((long)unaff_x27 + 10) - 7;
        *(short *)((long)plVar4 + 10) = (short)uVar8;
        if (0xb < uVar8) {
          func_0x007a28b0(uVar8,0xb,&UNK_009c9a18);
          goto LAB_0023f174;
        }
        uVar16 = *(undefined1 *)((long)unaff_x27 + 0x12);
        _memcpy((long)plVar4 + 0xc,(long)unaff_x27 + 0x13);
        *(undefined2 *)((long)unaff_x27 + 10) = 6;
        uVar12 = uVar12 - 7;
      }
      lStack0000000000000010 = 0;
      uVar8 = uVar8 & 0xffff;
      lVar11 = (long)plVar4 + 0xc;
      lVar10 = uVar8 - uVar12;
      plVar17 = plVar4;
      if (uVar12 <= uVar8 && lVar10 != 0) {
code_r0x0023ed10:
        _memmove(lVar11 + uVar12 + 1,lVar11 + uVar12,lVar10);
      }
    }
    *(undefined1 *)(lVar11 + uVar12) = unaff_w22;
    *(short *)((long)plVar17 + 10) = (short)uVar8 + 1;
    lVar11 = *unaff_x27;
    if (lVar11 == 0) {
      lVar10 = 0;
    }
    else {
      lVar10 = 0;
      do {
        if (lVar10 != lVar14) {
          func_0x007a247c(&UNK_00829837,0x35,&UNK_009c9a48);
          goto LAB_0023f0c8;
        }
        uVar1 = *(ushort *)(unaff_x27 + 1);
        uVar15 = (ulong)uVar1;
        uVar2 = *(ushort *)(lVar11 + 10);
        uVar8 = (ulong)uVar2;
        if (uVar2 < 0xb) {
          lVar14 = lVar11 + 0xc;
          uVar13 = uVar15 + 1;
          if (uVar1 < uVar2) {
            _memmove(lVar14 + uVar13,lVar14 + uVar15,uVar8 - uVar15);
            _memmove(lVar11 + 0x18 + uVar15 * 8 + 0x10,lVar11 + 0x18 + uVar13 * 8,
                     (uVar8 - uVar15) * 8);
          }
          *(undefined1 *)(lVar14 + uVar15) = uVar16;
          *(long **)(lVar11 + uVar13 * 8 + 0x18) = plVar4;
          *(ushort *)(lVar11 + 10) = uVar2 + 1;
          if (uVar13 < uVar8 + 2) {
            lVar14 = uVar15 + 4;
            do {
              plVar4 = *(long **)(lVar11 + lVar14 * 8);
              *plVar4 = lVar11;
              *(short *)(plVar4 + 1) = (short)lVar14 + -3;
              lVar14 = lVar14 + 1;
            } while (~uVar8 + lVar14 != 4);
          }
          goto code_r0x0023f034;
        }
        in_stack_00000028 = lVar14 + 1;
        uStack0000000000000020 = lVar11;
        if (uVar1 < 5) {
          in_stack_00000030 = 4;
          func_0x0023f1b8(&uStack0000000000000038,&uStack0000000000000020);
          uVar13 = (ulong)*(ushort *)((long)uStack0000000000000038 + 10);
          lVar14 = (long)uStack0000000000000038 + 0xc;
          uVar8 = uVar15 + 1;
          lVar11 = uVar13 - uVar15;
          plVar9 = uStack0000000000000038;
          if (uVar13 < uVar15 || lVar11 == 0) {
code_r0x0023ee90:
            *(undefined1 *)(lVar14 + uVar15) = uVar16;
          }
          else {
code_r0x0023edac:
            _memmove(lVar14 + uVar8,lVar14 + uVar15,lVar11);
            *(undefined1 *)(lVar14 + uVar15) = uVar16;
            _memmove(plVar9 + uVar15 + 5,plVar9 + uVar8 + 3,lVar11 << 3);
          }
          plVar9[uVar8 + 3] = (long)plVar4;
          *(short *)((long)plVar9 + 10) = (short)uVar13 + 1;
          if (uVar8 < uVar13 + 2) {
            lVar14 = uVar15 + 4;
            do {
              puVar7 = (undefined8 *)plVar9[lVar14];
              *puVar7 = plVar9;
              *(short *)(puVar7 + 1) = (short)lVar14 + -3;
              lVar14 = lVar14 + 1;
            } while (~uVar13 + lVar14 != 4);
          }
          unaff_x27 = uStack0000000000000038;
          if (uStack0000000000000038 == (long *)0x0) goto code_r0x0023f034;
        }
        else {
          if (uVar1 != 5) {
            if (uVar1 == 6) {
              in_stack_00000030 = 5;
              func_0x0023f1b8(&uStack0000000000000038,&uStack0000000000000020);
              uVar15 = 0;
            }
            else {
              in_stack_00000030 = 6;
              func_0x0023f1b8(&uStack0000000000000038,&uStack0000000000000020);
              uVar15 = uVar15 - 7;
            }
            uVar13 = (ulong)*(ushort *)((long)in_stack_00000048 + 10);
            lVar14 = (long)in_stack_00000048 + 0xc;
            uVar8 = uVar15 + 1;
            lVar11 = uVar13 - uVar15;
            plVar9 = in_stack_00000048;
            if (uVar13 < uVar15 || lVar11 == 0) goto code_r0x0023ee90;
            goto code_r0x0023edac;
          }
          in_stack_00000030 = 5;
          func_0x0023f1b8(&uStack0000000000000038,&uStack0000000000000020);
          unaff_x27 = uStack0000000000000038;
          uVar1 = *(ushort *)((long)uStack0000000000000038 + 10);
          uVar8 = (ulong)uVar1;
          if (uVar8 < 6) {
            *(undefined1 *)((long)uStack0000000000000038 + 0x11) = uVar16;
            uStack0000000000000038[9] = (long)plVar4;
            *(ushort *)((long)uStack0000000000000038 + 10) = uVar1 + 1;
            if (uVar1 != 5) goto code_r0x0023ed44;
          }
          else {
            _memmove((long)uStack0000000000000038 + 0x12,(long)uStack0000000000000038 + 0x11,
                     uVar8 - 5);
            *(undefined1 *)((long)unaff_x27 + 0x11) = uVar16;
            _memmove(unaff_x27 + 10,unaff_x27 + 9,uVar8 * 8 + -0x28);
            unaff_x27[9] = (long)plVar4;
            *(ushort *)((long)unaff_x27 + 10) = uVar1 + 1;
          }
          lVar14 = 9;
          do {
            puVar7 = (undefined8 *)unaff_x27[lVar14];
            *puVar7 = unaff_x27;
            *(short *)(puVar7 + 1) = (short)lVar14 + -3;
            lVar14 = lVar14 + 1;
          } while ((4 - uVar8) + lVar14 != 9);
        }
code_r0x0023ed44:
        lVar11 = *unaff_x27;
        plVar4 = in_stack_00000048;
        lVar10 = in_stack_00000050;
        lVar14 = in_stack_00000040;
        uVar16 = in_stack_00000058;
      } while (lVar11 != 0);
    }
    param_3 = (undefined8 *)*param_3;
    puVar7 = (undefined8 *)*param_3;
    if (puVar7 == (undefined8 *)0x0) goto code_r0x0023f0d4;
    lVar14 = param_3[1];
    puVar5 = (undefined8 *)func_0x00187bd0(0x78,8);
    if (puVar5 != (undefined8 *)0x0) {
      *puVar5 = 0;
      *(undefined2 *)((long)puVar5 + 10) = 0;
      puVar5[3] = puVar7;
      *puVar7 = puVar5;
      *(undefined2 *)(puVar7 + 1) = 0;
      *param_3 = puVar5;
      param_3[1] = lVar14 + 1;
      if (lVar10 == lVar14) {
        *(undefined2 *)((long)puVar5 + 10) = 1;
        *(undefined1 *)((long)puVar5 + 0xc) = uVar16;
        puVar5[4] = plVar4;
        *plVar4 = (long)puVar5;
        *(undefined2 *)(plVar4 + 1) = 1;
code_r0x0023f034:
        *unaff_x19 = plVar17;
        unaff_x19[1] = lStack0000000000000010;
        unaff_x19[2] = uVar12;
        return;
      }
      puVar6 = &UNK_009c99e8;
      func_0x007a247c(&UNK_008297df,0x30,&UNK_009c99e8);
      goto LAB_0023f108;
    }
  }
  func_0x007a1f18(8,0x78);
LAB_0023f174:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x23f178);
  (*pcVar3)();
}

