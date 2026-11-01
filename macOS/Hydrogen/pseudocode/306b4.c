
/* WARNING: Possible PIC construction at 0x00030dc8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00030dcc) */
/* WARNING: Removing unreachable block (ram,0x00030db0) */
/* WARNING: Removing unreachable block (ram,0x00030dc4) */
/* WARNING: Type propagation algorithm not settling */

char * FUN_000306b4(undefined8 param_1,undefined8 param_2,long param_3,char *param_4)

{
  ulong uVar1;
  byte bVar2;
  code *pcVar3;
  undefined1 *puVar4;
  uint uVar5;
  char *pcVar6;
  char *******pppppppcVar7;
  long *plVar8;
  char *pcVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  long lVar12;
  char *pcVar13;
  char cVar14;
  undefined8 *extraout_x8;
  char *pcVar15;
  ulong uVar16;
  undefined8 *puVar17;
  char *pcVar18;
  undefined8 *unaff_x19;
  bool bVar19;
  long unaff_x21;
  char *pcVar20;
  char *unaff_x23;
  uint uVar21;
  undefined8 unaff_x24;
  undefined1 *puVar22;
  undefined *puVar23;
  undefined1 auVar24 [16];
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  undefined1 auStack_70 [8];
  char *******pppppppcStack_68;
  char *pcStack_60;
  undefined8 uStack_58;
  undefined1 auStack_6 [6];
  
  pcVar6 = (char *)func_0x0001748c();
  if (*(char *)((long)unaff_x19 + 0x17) < '\0') goto LAB_000306dc;
  while (-1 < in_stack_00000028) {
    __Unwind_Resume(pcVar6);
LAB_000306dc:
    __ZdlPv(*unaff_x19);
  }
  __ZdlPv(in_stack_00000018);
  auVar24 = __Unwind_Resume(pcVar6);
  lVar12 = auVar24._8_8_;
  puVar22 = auStack_6 + -10;
  pcVar20 = (char *)(param_3 - lVar12);
  if (pcVar20 < (char *)0x7ffffffffffffff8) {
    if ((char *)((long)&MACH_HEADER.sizeofcmds + 2) < pcVar20) {
      uVar1 = ((ulong)pcVar20 & 0xfffffffffffffff8) + 8;
      if (((ulong)pcVar20 | 7) != 0x17) {
        uVar1 = (ulong)pcVar20 | 7;
      }
      pppppppcVar7 = (char *******)__Znwm(uVar1 + 1);
      uStack_58 = uVar1 + 1 | 0x8000000000000000;
      pcStack_60 = pcVar20;
      pppppppcStack_68 = pppppppcVar7;
    }
    else {
      uStack_58 = CONCAT17((char)pcVar20,(undefined7)uStack_58);
      pppppppcVar7 = (char *******)&pppppppcStack_68;
    }
    if (lVar12 != param_3) {
      _memcpy(pppppppcVar7,lVar12,pcVar20);
      pppppppcVar7 = (char *******)((long)pppppppcVar7 + (long)pcVar20);
    }
    *(char *)pppppppcVar7 = '\0';
    plVar8 = *(long **)(auVar24._0_8_ + 0x10);
    pcVar6 = pcStack_60;
    pppppppcVar7 = pppppppcStack_68;
    if (-1 < (long)uStack_58) {
      pcVar6 = (char *)(uStack_58 >> 0x38);
      pppppppcVar7 = (char *******)&pppppppcStack_68;
    }
    pcVar6 = (char *)(**(code **)(*plVar8 + 0x20))
                               (extraout_x8,plVar8,pppppppcVar7,
                                (char *)((long)pppppppcVar7 + (long)pcVar6));
    bVar2 = *(byte *)((long)extraout_x8 + 0x17);
    uVar1 = extraout_x8[1];
    if (-1 < (char)bVar2) {
      uVar1 = (ulong)bVar2;
    }
    if (uVar1 != 1) {
      if (uVar1 == 0xc) {
        puVar17 = (undefined8 *)*extraout_x8;
        if (-1 < (char)bVar2) {
          puVar17 = extraout_x8;
        }
        *(undefined1 *)((long)puVar17 + 0xb) = *(undefined1 *)((long)puVar17 + 3);
      }
      else if ((char)bVar2 < '\0') {
        *(undefined1 *)*extraout_x8 = 0;
        extraout_x8[1] = 0;
      }
      else {
        *(undefined1 *)extraout_x8 = 0;
        *(undefined1 *)((long)extraout_x8 + 0x17) = 0;
      }
    }
    if ((long)uStack_58 < 0) {
      pcVar6 = (char *)__ZdlPv(pppppppcStack_68);
    }
    return pcVar6;
  }
  pcVar9 = (char *)func_0x0001748c(&pppppppcStack_68);
  if ((long)uStack_58 < 0) {
    __ZdlPv(pppppppcStack_68);
  }
  puVar23 = &SUB_00030890;
  __Unwind_Resume(pcVar9);
  puVar4 = auStack_70;
  while( true ) {
    *(char **)(puVar4 + -0x20) = pcVar6;
    *(char **)(puVar4 + -0x18) = pcVar9;
    *(undefined1 **)(puVar4 + -0x10) = puVar22;
    *(undefined **)(puVar4 + -8) = puVar23;
    uVar10 = ___cxa_allocate_exception(0x18);
    __ZNSt3__111regex_errorC1ENS_15regex_constants10error_typeE(uVar10,5);
    pcVar13 = PTR___ZNSt3__111regex_errorD1Ev_009b0070;
    uVar11 = ___cxa_throw(uVar10,PTR___ZTINSt3__111regex_errorE_009b00f0);
    ___cxa_free_exception(uVar10);
    auVar24 = __Unwind_Resume(uVar11);
    pcVar6 = auVar24._8_8_;
    lVar12 = auVar24._0_8_;
    *(undefined8 *)(puVar4 + -0x60) = unaff_x24;
    *(char **)(puVar4 + -0x58) = unaff_x23;
    *(char **)(puVar4 + -0x50) = pcVar20;
    *(long *)(puVar4 + -0x48) = unaff_x21;
    *(undefined8 *)(puVar4 + -0x40) = uVar11;
    *(undefined8 *)(puVar4 + -0x38) = uVar10;
    *(undefined1 **)(puVar4 + -0x30) = puVar4 + -0x10;
    *(undefined **)(puVar4 + -0x28) = &DAT_000308dc;
    puVar22 = puVar4 + -0x30;
    if (pcVar6 == pcVar13) {
      return pcVar6;
    }
    cVar14 = *pcVar6;
    if (cVar14 == ']') {
      return pcVar6;
    }
    *(undefined8 *)(puVar4 + -0x90) = 0;
    *(undefined8 *)(puVar4 + -0x88) = 0;
    *(undefined8 *)(puVar4 + -0x80) = 0;
    if ((pcVar6 + 1 == pcVar13) || (cVar14 != '[')) break;
    cVar14 = pcVar6[1];
    if (cVar14 == '.') {
      pcVar20 = pcVar6 + 2;
      if (1 < (long)pcVar13 - (long)pcVar20) {
        pcVar15 = pcVar13 + (-4 - (long)pcVar6);
        pcVar9 = pcVar6 + 3;
        pcVar6 = pcVar20;
        if (*pcVar20 == '.') goto code_r0x00030a64;
        do {
          do {
            pcVar18 = pcVar9;
            if (pcVar15 == (char *)0x0) goto code_r0x00030dc8;
            pcVar15 = pcVar15 + -1;
            pcVar9 = pcVar18 + 1;
            pcVar6 = pcVar18;
          } while (*pcVar18 != '.');
code_r0x00030a64:
        } while (*pcVar9 != ']');
        if (pcVar6 != pcVar13) {
          func_0x000320f0(puVar4 + -0x78,lVar12,pcVar20,pcVar6,0);
          if ((char)puVar4[-0x79] < '\0') {
            __ZdlPv(*(undefined8 *)(puVar4 + -0x90));
          }
          uVar16 = *(ulong *)(puVar4 + -0x68);
          *(ulong *)(puVar4 + -0x80) = uVar16;
          *(undefined8 *)(puVar4 + -0x88) = *(undefined8 *)(puVar4 + -0x70);
          *(undefined8 *)(puVar4 + -0x90) = *(undefined8 *)(puVar4 + -0x78);
          uVar5 = (uint)(char)(uVar16 >> 0x38);
          uVar1 = *(ulong *)(puVar4 + -0x88);
          if (-1 < (int)uVar5) {
            uVar1 = uVar16 >> 0x38;
          }
          if (1 < uVar1 - 1) {
            func_0x000320a4();
code_r0x00030ddc:
                    /* WARNING: Does not return */
            pcVar3 = (code *)SoftwareBreakpoint(1,0x30de0);
            (*pcVar3)();
          }
          pcVar6 = pcVar6 + 2;
          uVar21 = *(uint *)(lVar12 + 0x18) & 0x1f0;
          uVar1 = *(ulong *)(puVar4 + -0x88);
          if (-1 < (int)uVar5) {
            uVar1 = (ulong)uVar5 & 0xff;
          }
          if (uVar1 == 0) goto code_r0x00030ae8;
          goto joined_r0x00030c94;
        }
      }
    }
    else {
      if (cVar14 != ':') {
        if (cVar14 == '=') {
          param_4 = (char *)func_0x00030e70(lVar12,pcVar6 + 2,pcVar13,param_4);
          bVar19 = false;
          cVar14 = puVar4[-0x79];
          goto joined_r0x00030d88;
        }
        break;
      }
      if (1 < (long)pcVar13 - (long)(pcVar6 + 2)) {
        unaff_x23 = (char *)0x0;
        pcVar20 = pcVar6;
        if (pcVar6[2] == ':') goto code_r0x000309c8;
        do {
          do {
            if (pcVar13 + (-4 - (long)pcVar6) == unaff_x23) goto code_r0x00030dc8;
            unaff_x23 = unaff_x23 + 1;
            pcVar20 = pcVar6 + (long)unaff_x23;
          } while (pcVar20[2] != ':');
code_r0x000309c8:
        } while (pcVar20[3] != ']');
        if (pcVar6 + (long)(unaff_x23 + 2) != pcVar13) {
          uVar5 = func_0x00032798(lVar12,pcVar6 + 2,pcVar6 + (long)(unaff_x23 + 2),
                                  *(uint *)(lVar12 + 0x18) & 1,0);
          if (uVar5 == 0) {
            func_0x0003274c();
            goto code_r0x00030ddc;
          }
          bVar19 = false;
          *(uint *)(param_4 + 0xa0) = *(uint *)(param_4 + 0xa0) | uVar5;
          param_4 = pcVar6 + (long)(unaff_x23 + 4);
          cVar14 = puVar4[-0x79];
          goto joined_r0x00030d88;
        }
      }
    }
code_r0x00030dc8:
    puVar23 = &UNK_00030dcc;
    puVar4 = puVar4 + -0xd0;
    pcVar9 = param_4;
    unaff_x21 = lVar12;
    pcVar20 = pcVar13;
  }
  uVar5 = 0;
  uVar21 = *(uint *)(lVar12 + 0x18) & 0x1f0;
code_r0x00030ae8:
  if ((uVar21 | 0x40) == 0x40) {
    cVar14 = *pcVar6;
    if (cVar14 != '\\') goto code_r0x00030c00;
    if (uVar21 == 0) {
      pcVar6 = (char *)func_0x000311d8(lVar12,pcVar6 + 1,pcVar13,puVar4 + -0x90,param_4);
    }
    else {
      pcVar6 = (char *)func_0x00031394(lVar12,pcVar6 + 1,pcVar13,puVar4 + -0x90);
    }
  }
  else {
    cVar14 = *pcVar6;
code_r0x00030c00:
    if ((int)uVar5 < 0) {
      pcVar20 = *(char **)(puVar4 + -0x90);
      *(undefined8 *)(puVar4 + -0x88) = 1;
      *pcVar20 = cVar14;
      pcVar20[1] = '\0';
    }
    else {
      puVar4[-0x79] = 1;
      puVar4[-0x90] = cVar14;
      puVar4[-0x8f] = 0;
    }
    pcVar6 = pcVar6 + 1;
  }
joined_r0x00030c94:
  if ((((pcVar6 == pcVar13) || (*pcVar6 == ']')) || (pcVar20 = pcVar6 + 1, pcVar20 == pcVar13)) ||
     ((*pcVar6 != '-' || (*pcVar20 == ']')))) {
    cVar14 = puVar4[-0x79];
    if (cVar14 < '\0') {
      if (*(long *)(puVar4 + -0x88) != 0) {
        if (*(long *)(puVar4 + -0x88) == 1) {
          pcVar20 = *(char **)(puVar4 + -0x90);
          goto code_r0x00030b88;
        }
        pcVar20 = *(char **)(puVar4 + -0x90);
code_r0x00030c2c:
        func_0x00031cc4(param_4,(long)*pcVar20,(long)pcVar20[1]);
      }
    }
    else if (cVar14 != '\0') {
      pcVar20 = puVar4 + -0x90;
      if (cVar14 != '\x01') goto code_r0x00030c2c;
code_r0x00030b88:
      func_0x0002f0ac(param_4,(long)*pcVar20);
    }
    bVar19 = true;
    cVar14 = puVar4[-0x79];
    goto joined_r0x00030d88;
  }
  *(undefined8 *)(puVar4 + -0x78) = 0;
  *(undefined8 *)(puVar4 + -0x70) = 0;
  *(undefined8 *)(puVar4 + -0x68) = 0;
  pcVar9 = pcVar6 + 2;
  if (((pcVar9 == pcVar13) || (*pcVar20 != '[')) || (*pcVar9 != '.')) {
    if ((uVar21 | 0x40) == 0x40) {
      cVar14 = *pcVar20;
      if (cVar14 == '\\') {
        if (uVar21 == 0) {
          pcVar9 = (char *)func_0x000311d8(lVar12,pcVar9,pcVar13,puVar4 + -0x78,param_4);
        }
        else {
          pcVar9 = (char *)func_0x00031394(lVar12,pcVar9,pcVar13,puVar4 + -0x78);
        }
        goto code_r0x00030d28;
      }
    }
    else {
      cVar14 = *pcVar20;
    }
    puVar4[-0x61] = 1;
    puVar4[-0x78] = cVar14;
    puVar4[-0x77] = 0;
  }
  else {
    pcVar9 = (char *)func_0x000310dc(lVar12,pcVar6 + 3,pcVar13,puVar4 + -0x78);
  }
code_r0x00030d28:
  *(undefined8 *)(puVar4 + -0xa8) = *(undefined8 *)(puVar4 + -0x88);
  *(undefined8 *)(puVar4 + -0xb0) = *(undefined8 *)(puVar4 + -0x90);
  *(undefined8 *)(puVar4 + -0xa0) = *(undefined8 *)(puVar4 + -0x80);
  *(undefined8 *)(puVar4 + -0x88) = 0;
  *(undefined8 *)(puVar4 + -0x80) = 0;
  *(undefined8 *)(puVar4 + -0x90) = 0;
  *(undefined8 *)(puVar4 + -200) = *(undefined8 *)(puVar4 + -0x70);
  *(undefined8 *)(puVar4 + -0xd0) = *(undefined8 *)(puVar4 + -0x78);
  *(undefined8 *)(puVar4 + -0xc0) = *(undefined8 *)(puVar4 + -0x68);
  *(undefined8 *)(puVar4 + -0x78) = 0;
  *(undefined8 *)(puVar4 + -0x70) = 0;
  *(undefined8 *)(puVar4 + -0x68) = 0;
  func_0x00031798(param_4,puVar4 + -0xb0,puVar4 + -0xd0);
  if ((char)puVar4[-0xb9] < '\0') {
    __ZdlPv(*(undefined8 *)(puVar4 + -0xd0));
    cVar14 = puVar4[-0x99];
  }
  else {
    cVar14 = puVar4[-0x99];
  }
  if (cVar14 < '\0') {
    __ZdlPv(*(undefined8 *)(puVar4 + -0xb0));
  }
  bVar19 = true;
  cVar14 = puVar4[-0x79];
  pcVar6 = pcVar9;
joined_r0x00030d88:
  if (cVar14 < '\0') {
    __ZdlPv(*(undefined8 *)(puVar4 + -0x90));
  }
  if (!bVar19) {
    return param_4;
  }
  return pcVar6;
}

