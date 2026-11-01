
/* WARNING: Removing unreachable block (ram,0x0041fe0c) */
/* WARNING: Removing unreachable block (ram,0x0041fe10) */

void FUN_0041fc2c(undefined8 param_1,long param_2)

{
  dword *pdVar1;
  long lVar2;
  long lVar3;
  ushort uVar4;
  undefined2 uVar5;
  code *pcVar6;
  dword *pdVar7;
  undefined8 uVar8;
  undefined *puVar9;
  long lVar10;
  long in_x9;
  undefined2 uVar11;
  int iVar12;
  undefined8 unaff_x19;
  undefined8 *unaff_x20;
  dword unaff_w21;
  long lVar13;
  undefined *puVar14;
  ushort unaff_w23;
  ushort uVar15;
  dword unaff_w24;
  short sVar16;
  ushort uVar17;
  dword dStack0000000000000008;
  dword dStack000000000000000c;
  undefined8 uStack0000000000000018;
  dword *in_stack_00000020;
  long in_stack_00000028;
  
  if (in_x9 == 0) {
LAB_0041fc54:
    _freeaddrinfo();
    lVar13 = 0;
    uStack0000000000000018 = 0;
    in_stack_00000020 = &MACH_HEADER.cputype;
  }
  else {
    uVar4 = *(ushort *)(param_2 + 0x10);
    while( true ) {
      lVar13 = *(long *)(in_x9 + 0x20);
      lVar3 = *(long *)(in_x9 + 0x28);
      if (*(char *)(lVar13 + 1) == '\x1e') break;
      if (*(char *)(lVar13 + 1) == '\x02') {
        if (*(uint *)(in_x9 + 0x10) < 0x10) {
          puVar9 = &UNK_009dbbe8;
          uVar8 = 0x34;
          puVar14 = &UNK_008874bb;
          goto code_r0x0041fedc;
        }
        sVar16 = 0;
        iVar12 = *(int *)(lVar13 + 4);
        uVar17 = *(ushort *)(lVar13 + 2) >> 8 | *(ushort *)(lVar13 + 2) << 8;
        puVar14 = &UNK_009dbc18;
        goto code_r0x0041fccc;
      }
      in_x9 = lVar3;
      if (lVar3 == 0) goto LAB_0041fc54;
    }
    if (*(uint *)(in_x9 + 0x10) < 0x1c) {
      puVar9 = &UNK_009dbc00;
      uVar8 = 0x35;
      puVar14 = &UNK_0088751b;
code_r0x0041fedc:
      func_0x007a247c(puVar14,uVar8,puVar9);
      goto code_r0x0041fef8;
    }
    unaff_w23 = *(ushort *)(lVar13 + 2) >> 8 | *(ushort *)(lVar13 + 2) << 8;
    dStack000000000000000c = *(dword *)(lVar13 + 4);
    iVar12 = *(int *)(lVar13 + 8) << 0x10;
    puVar14 = *(undefined **)(lVar13 + 0xc);
    unaff_w21 = *(dword *)(lVar13 + 0x14);
    unaff_w24 = *(dword *)(lVar13 + 0x18);
    uVar17 = (ushort)((uint)*(int *)(lVar13 + 8) >> 0x10);
    sVar16 = 1;
code_r0x0041fccc:
    pdVar7 = (dword *)func_0x00187bd0(0x80,4);
    if (pdVar7 == (dword *)0x0) {
      func_0x007a1f00(4,0x80,&UNK_009d92e8);
      goto code_r0x0041fef8;
    }
    *(short *)pdVar7 = sVar16;
    uVar15 = uVar4;
    if (sVar16 == 0) {
      uVar17 = uVar4;
      uVar15 = unaff_w23;
    }
    *(int *)((long)pdVar7 + 2) = iVar12;
    *(ushort *)((long)pdVar7 + 6) = uVar17;
    *(undefined **)(pdVar7 + 2) = puVar14;
    pdVar7[4] = unaff_w21;
    pdVar7[5] = dStack000000000000000c;
    pdVar7[6] = unaff_w24;
    *(ushort *)(pdVar7 + 7) = uVar15;
    uStack0000000000000018 = 4;
    in_stack_00000028 = 1;
    in_stack_00000020 = pdVar7;
    lVar13 = in_stack_00000028;
    while (in_stack_00000028 = lVar13, lVar3 != 0) {
      lVar10 = lVar3;
      while( true ) {
        lVar2 = *(long *)(lVar10 + 0x20);
        lVar3 = *(long *)(lVar10 + 0x28);
        if (*(char *)(lVar2 + 1) == '\x1e') break;
        if (*(char *)(lVar2 + 1) == '\x02') {
          if (*(uint *)(lVar10 + 0x10) < 0x10) {
            puVar9 = &UNK_009dbbe8;
            puVar14 = &UNK_008874bb;
            uVar8 = 0x34;
            goto code_r0x0041fea4;
          }
          iVar12 = *(int *)(lVar2 + 4);
          uVar17 = *(ushort *)(lVar2 + 2);
          puVar14 = &UNK_009dbc18;
          uVar11 = 0;
          uVar15 = uVar4;
          uVar5 = 0;
          if (lVar13 != uStack0000000000000018) goto LAB_0041fd30;
          goto code_r0x0041fe20;
        }
        lVar10 = lVar3;
        if (lVar3 == 0) goto code_r0x0041fe40;
      }
      if (*(uint *)(lVar10 + 0x10) < 0x1c) {
        puVar14 = &UNK_0088751b;
        uVar8 = 0x35;
        puVar9 = &UNK_009dbc00;
code_r0x0041fea4:
        func_0x007a247c(puVar14,uVar8,puVar9);
code_r0x0041fef8:
                    /* WARNING: Does not return */
        pcVar6 = (code *)SoftwareBreakpoint(1,0x41fefc);
        (*pcVar6)();
      }
      dStack000000000000000c = *(dword *)(lVar2 + 4);
      iVar12 = *(int *)(lVar2 + 8) << 0x10;
      puVar14 = *(undefined **)(lVar2 + 0xc);
      unaff_w24 = *(dword *)(lVar2 + 0x14);
      dStack0000000000000008 = *(dword *)(lVar2 + 0x18);
      uVar15 = (ushort)((uint)*(int *)(lVar2 + 8) >> 0x10);
      uVar11 = 1;
      uVar17 = uVar4;
      uVar5 = 1;
      if (lVar13 == uStack0000000000000018) {
code_r0x0041fe20:
        uVar11 = uVar5;
        func_0x007a0000(&uStack0000000000000018,lVar13,1,4,0x20);
        pdVar7 = in_stack_00000020;
      }
LAB_0041fd30:
      pdVar1 = pdVar7 + lVar13 * 8;
      *(undefined2 *)pdVar1 = uVar11;
      *(int *)((long)pdVar1 + 2) = iVar12;
      *(ushort *)((long)pdVar1 + 6) = uVar15;
      *(undefined **)(pdVar1 + 2) = puVar14;
      pdVar1[4] = unaff_w24;
      pdVar1[5] = dStack000000000000000c;
      pdVar1[6] = dStack0000000000000008;
      *(ushort *)(pdVar1 + 7) = uVar17;
      lVar13 = lVar13 + 1;
    }
code_r0x0041fe40:
    _freeaddrinfo(unaff_x19);
  }
  *unaff_x20 = in_stack_00000020;
  unaff_x20[1] = in_stack_00000020;
  unaff_x20[2] = uStack0000000000000018;
  unaff_x20[3] = in_stack_00000020 + lVar13 * 8;
  return;
}

