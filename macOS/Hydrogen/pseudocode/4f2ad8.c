
undefined8 FUN_004f2ad8(long param_1,long param_2)

{
  undefined8 *puVar1;
  code *pcVar2;
  int iVar3;
  ulong *puVar4;
  long lVar5;
  ulong uVar6;
  long *plVar7;
  long *plVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  long *plVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  long lVar17;
  undefined8 uVar18;
  ulong uVar19;
  long lVar20;
  undefined8 uStack0000000000000010;
  long *plStack0000000000000018;
  long lStack0000000000000020;
  long *plStack0000000000000030;
  long lStack0000000000000038;
  long lStack0000000000000058;
  undefined8 uStack0000000000000060;
  ulong *in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined1 uStack0000000000000078;
  ulong in_stack_00000090;
  long lStack0000000000000098;
  undefined8 in_stack_000000a0;
  long in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  long lStack00000000000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 uStack00000000000000d8;
  long in_stack_000000e0;
  undefined8 in_stack_000000e8;
  long in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  long in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  
  lVar5 = *(long *)(*(long *)(param_1 + 0x10) + 0x90);
  if (lVar5 == 0) {
    return 0;
  }
  lVar11 = *(long *)(*(long *)(param_1 + 0x10) + 0x88);
  lStack0000000000000038 = lVar11 + lVar5 * 600;
  plStack0000000000000030 = &lStack0000000000000098;
  plStack0000000000000018 = &lStack00000000000000c0;
  uStack0000000000000010 = 1;
  lStack0000000000000020 = param_1;
  lStack0000000000000058 = param_2;
LAB_004f2b30:
  lVar5 = *(long *)(lVar11 + 0x198);
  if ((lVar5 != 0) && (*(long *)(lStack0000000000000058 + 0x50) != 0)) {
    lVar17 = *(long *)(lVar11 + 0x220);
    uVar18 = *(undefined8 *)(lVar11 + 0x218);
    plVar7 = (long *)(*(long *)(lStack0000000000000058 + 0x48) + 8);
    lVar10 = *(long *)(lStack0000000000000058 + 0x50) << 4;
    lVar12 = lVar10;
    plVar14 = plVar7;
    do {
      if ((*plVar14 == lVar17) && (iVar3 = _memcmp(plVar14[-1],uVar18,lVar17), iVar3 == 0))
      goto LAB_004f2b94;
      plVar14 = plVar14 + 2;
      lVar12 = lVar12 + -0x10;
    } while (lVar12 != 0);
    puVar15 = *(undefined8 **)(lVar11 + 400);
    lVar12 = *(long *)(lStack0000000000000058 + 0x60);
    uVar6 = *(ulong *)(lStack0000000000000058 + 0x68);
    puVar16 = puVar15;
    do {
      uVar19 = 0;
      puVar1 = puVar16 + 6;
      uVar18 = *puVar16;
      lVar17 = puVar16[1];
      plVar8 = (long *)(lVar12 + 0x58);
      lVar9 = lVar10;
      plVar14 = plVar7;
      do {
        if ((*plVar14 == lVar17) && (iVar3 = _memcmp(plVar14[-1],uVar18,lVar17), iVar3 == 0)) {
          if (uVar6 <= uVar19) goto code_r0x004f2f3c;
          uVar19 = puVar16[2];
          if (uVar19 == 0) goto code_r0x004f2dac;
          if (*plVar8 != 0) {
            lVar17 = plVar8[-1];
            lVar9 = lVar17 + *plVar8 * 0x18;
            do {
              if (*(long *)(lVar17 + 0x10) != 0) {
                lVar20 = puVar16[3];
                lVar13 = *(long *)(lVar17 + 0x10) * 0x18;
                plVar14 = (long *)(*(long *)(lVar17 + 8) + 0x10);
                do {
                  if ((lVar20 == *plVar14) &&
                     (iVar3 = _memcmp(uVar19,plVar14[-1],lVar20), iVar3 == 0))
                  goto code_r0x004f2dac;
                  lVar13 = lVar13 + -0x18;
                  plVar14 = plVar14 + 3;
                } while (lVar13 != 0);
              }
              lVar17 = lVar17 + 0x18;
            } while (lVar17 != lVar9);
          }
          break;
        }
        plVar14 = plVar14 + 2;
        plVar8 = plVar8 + 0xd;
        uVar19 = uVar19 + 1;
        lVar9 = lVar9 + -0x10;
      } while (lVar9 != 0);
      puVar16 = puVar1;
    } while (puVar1 != puVar15 + lVar5 * 6);
  }
LAB_004f2b94:
  lVar5 = *(long *)(lVar11 + 0x180);
  if (lVar5 != 0) {
    if (*(long *)(lStack0000000000000058 + 0x50) != 0) {
      lVar10 = *(long *)(lVar11 + 0x220);
      uVar18 = *(undefined8 *)(lVar11 + 0x218);
      plVar7 = (long *)(*(long *)(lStack0000000000000058 + 0x48) + 8);
      lVar12 = *(long *)(lStack0000000000000058 + 0x50) << 4;
      do {
        if ((*plVar7 == lVar10) && (iVar3 = _memcmp(plVar7[-1],uVar18,lVar10), iVar3 == 0))
        goto LAB_004f2b20;
        plVar7 = plVar7 + 2;
        lVar12 = lVar12 + -0x10;
      } while (lVar12 != 0);
    }
    func_0x004e8a1c(&uStack0000000000000078,*(long *)(lVar11 + 0x178),
                    *(long *)(lVar11 + 0x178) + lVar5 * 0x10,&UNK_009e8050);
    func_0x004f17d0(&uStack00000000000000d8,lStack0000000000000020,3,0,lVar11,
                    &uStack0000000000000078,0);
    if (uStack00000000000000d8 == 0x8000000000000009) {
      return in_stack_000000e0;
    }
    lStack0000000000000098 = in_stack_000000e0;
    in_stack_00000090 = uStack00000000000000d8;
    in_stack_000000a8 = in_stack_000000f0;
    in_stack_000000a0 = in_stack_000000e8;
    in_stack_000000b8 = in_stack_00000100;
    in_stack_000000b0 = in_stack_000000f8;
    in_stack_000000c8 = in_stack_00000110;
    lStack00000000000000c0 = in_stack_00000108;
    in_stack_000000d0 = in_stack_00000118;
    uVar6 = uStack00000000000000d8 ^ 0x8000000000000000;
    if (8 < uVar6) {
      uVar6 = 4;
    }
    plVar7 = plStack0000000000000030;
    if (1 < uVar6 - 6) {
      if (uVar6 == 4) goto LAB_004f2ebc;
      goto code_r0x004f2c98;
    }
    goto LAB_004f2eec;
  }
  goto LAB_004f2b20;
code_r0x004f2dac:
  if (puVar16[4] == 0) {
LAB_004f2b20:
    lVar11 = lVar11 + 600;
    if (lVar11 == lStack0000000000000038) {
      return 0;
    }
    goto LAB_004f2b30;
  }
  puVar4 = (ulong *)func_0x00187bd0(0x18,8);
  if (puVar4 == (ulong *)0x0) {
    func_0x007a1f18(8,0x18);
code_r0x004f2f3c:
    func_0x007a2570(uVar19,uVar6,&UNK_009e9b68);
  }
  else {
    uVar19 = puVar16[5];
    if (-1 < (long)uVar19) {
      uVar18 = puVar16[4];
      if (uVar19 == 0) {
        uVar6 = 1;
      }
      else {
        uVar6 = func_0x00187bd0(uVar19,1);
        if (uVar6 == 0) goto code_r0x004f2f54;
      }
      _memcpy(uVar6,uVar18,uVar19);
      *puVar4 = uVar19;
      puVar4[1] = uVar6;
      puVar4[2] = uVar19;
      uStack0000000000000060 = 1;
      in_stack_00000070 = 1;
      in_stack_00000068 = puVar4;
      func_0x004f17d0(&uStack00000000000000d8,lStack0000000000000020,3,0,lVar11,
                      &uStack0000000000000060,0);
      if (uStack00000000000000d8 == 0x8000000000000009) {
        return in_stack_000000e0;
      }
      lStack0000000000000098 = in_stack_000000e0;
      in_stack_00000090 = uStack00000000000000d8;
      in_stack_000000a8 = in_stack_000000f0;
      in_stack_000000a0 = in_stack_000000e8;
      in_stack_000000b8 = in_stack_00000100;
      in_stack_000000b0 = in_stack_000000f8;
      in_stack_000000c8 = in_stack_00000110;
      lStack00000000000000c0 = in_stack_00000108;
      in_stack_000000d0 = in_stack_00000118;
      uVar6 = uStack00000000000000d8 ^ 0x8000000000000000;
      if (8 < uVar6) {
        uVar6 = 4;
      }
      plVar7 = plStack0000000000000030;
      if (1 < uVar6 - 6) {
        if (uVar6 == 4) {
LAB_004f2ebc:
          in_stack_00000090 = uStack00000000000000d8;
          lStack0000000000000098 = in_stack_000000e0;
          in_stack_000000a0 = in_stack_000000e8;
          in_stack_000000a8 = in_stack_000000f0;
          in_stack_000000b0 = in_stack_000000f8;
          in_stack_000000b8 = in_stack_00000100;
          lStack00000000000000c0 = in_stack_00000108;
          in_stack_000000c8 = in_stack_00000110;
          in_stack_000000d0 = in_stack_00000118;
          if (uStack00000000000000d8 != 0) {
            func_0x00187bd4(in_stack_000000e0,uStack00000000000000d8,1);
          }
          plVar7 = plStack0000000000000018;
          if (in_stack_000000a8 != 0) {
            func_0x00187bd4(in_stack_000000b0,in_stack_000000a8 << 4,8);
            plVar7 = plStack0000000000000018;
          }
        }
        else {
code_r0x004f2c98:
          plVar7 = plStack0000000000000030;
          in_stack_00000090 = uStack00000000000000d8;
          lStack0000000000000098 = in_stack_000000e0;
          in_stack_000000a0 = in_stack_000000e8;
          in_stack_000000a8 = in_stack_000000f0;
          in_stack_000000b0 = in_stack_000000f8;
          in_stack_000000b8 = in_stack_00000100;
          lStack00000000000000c0 = in_stack_00000108;
          in_stack_000000c8 = in_stack_00000110;
          in_stack_000000d0 = in_stack_00000118;
          if (uVar6 != 0) goto LAB_004f2b20;
        }
      }
LAB_004f2eec:
      if (*plVar7 != 0) {
        func_0x00187bd4(plVar7[1],*plVar7,1);
      }
      goto LAB_004f2b20;
    }
  }
  uStack0000000000000010 = 0;
code_r0x004f2f54:
  func_0x007a1f00(uStack0000000000000010,uVar19,&UNK_009e8da8);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4f2f6c);
  (*pcVar2)();
}

