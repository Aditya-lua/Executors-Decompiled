
undefined8 FUN_00081c40(void)

{
  undefined1 uVar1;
  byte bVar2;
  long *plVar3;
  code *pcVar4;
  bool bVar5;
  undefined8 uVar6;
  long lVar7;
  long *plVar8;
  ulong uVar9;
  char *pcVar10;
  undefined8 *puVar11;
  ulong uVar12;
  undefined8 *puVar13;
  undefined1 *puVar14;
  long lVar15;
  ulong uVar16;
  ulong uVar17;
  long lVar18;
  uint unaff_w20;
  undefined1 auVar19 [16];
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  undefined1 auStack_110 [8];
  undefined8 uStack_108;
  ulong uStack_100;
  undefined8 *puStack_f8;
  undefined1 uStack_e9;
  undefined8 uStack_e8;
  byte *pbStack_b0;
  long *plStack_a8;
  long lStack_a0;
  long lStack_98;
  char *pcStack_90;
  long lStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  long *plStack_68;
  long lStack_60;
  long lStack_58;
  undefined1 auStack_50 [8];
  undefined8 uStack_48;
  
  func_0x00056004();
  func_0x00017f90();
  func_0x00017f90();
  uVar6 = func_0x00017514();
  if (in_stack_00000028 < 0) {
    __ZdlPv(in_stack_00000018);
  }
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
    unaff_w20 = unaff_w20 & 1;
  }
  if (unaff_w20 != 0) {
    ___cxa_free_exception();
  }
  lVar7 = __Unwind_Resume(uVar6);
  if (*(long *)(*(long *)(lVar7 + 0x10) + -8) != 0) {
    uStack_70 = (byte *)CONCAT44(uStack_70._4_4_,
                                 (int)((ulong)(*(long *)(lVar7 + 0x10) - *(long *)(lVar7 + 8)) >> 3)
                                 + -1);
    pcStack_90 = (char *)CONCAT71(pcStack_90._1_7_,1);
    plVar8 = *(long **)(lVar7 + 0x78);
    if (plVar8 == (long *)0x0) {
      func_0x00056004();
      auVar19 = func_0x0001753c();
      puVar13 = auVar19._8_8_;
      lVar7 = auVar19._0_8_;
      puStack_f8 = (undefined8 *)0x0;
      uStack_100 = 3;
      puVar11 = (undefined8 *)__Znwm(0x18);
      if (*(char *)((long)puVar13 + 0x17) < '\0') {
        func_0x00017634(puVar11,*puVar13,puVar13[1]);
      }
      else {
        uVar6 = *puVar13;
        puVar11[1] = puVar13[1];
        *puVar11 = uVar6;
        puVar11[2] = puVar13[2];
      }
      uStack_e8 = (undefined8 *)
                  CONCAT44(uStack_e8._4_4_,
                           (int)((ulong)(*(long *)(lVar7 + 0x10) - *(long *)(lVar7 + 8)) >> 3));
      uStack_e9 = 4;
      plVar8 = *(long **)(lVar7 + 0x78);
      puStack_f8 = puVar11;
      if (plVar8 == (long *)0x0) {
        func_0x00056004();
code_r0x00082108:
                    /* WARNING: Does not return */
        pcVar4 = (code *)SoftwareBreakpoint(1,0x8210c);
        (*pcVar4)();
      }
      uVar12 = (**(code **)(*plVar8 + 0x30))(plVar8,&uStack_e8,&uStack_e9,&uStack_100);
      uVar9 = *(ulong *)(lVar7 + 0x40);
      if (uVar9 == *(long *)(lVar7 + 0x48) * 0x40) {
        if ((long)(uVar9 + 1) < 0) {
          func_0x00017f90(lVar7 + 0x38);
          goto code_r0x00082108;
        }
        uVar17 = *(long *)(lVar7 + 0x48) * 0x80;
        uVar16 = (uVar9 & 0xffffffffffffffc0) + 0x40;
        if (uVar17 <= uVar16) {
          uVar17 = uVar16;
        }
        uVar16 = 0x7fffffffffffffff;
        if (uVar9 < 0x3fffffffffffffff) {
          uVar16 = uVar17;
        }
        func_0x0008184c(lVar7 + 0x38,uVar16);
        uVar9 = *(ulong *)(lVar7 + 0x40);
      }
      *(ulong *)(lVar7 + 0x40) = uVar9 + 1;
      lVar18 = *(long *)(lVar7 + 0x38);
      uVar16 = 1L << (uVar9 & 0x3f);
      lVar15 = (uVar9 >> 6) * 8;
      if ((uVar12 & 1) == 0) {
        *(ulong *)(lVar18 + lVar15) = *(ulong *)(lVar18 + lVar15) & (uVar16 ^ 0xffffffffffffffff);
      }
      else {
        *(ulong *)(lVar18 + lVar15) = *(ulong *)(lVar18 + lVar15) | uVar16;
        if (*(long *)(*(long *)(lVar7 + 0x10) + -8) != 0) {
          func_0x000796dc(auStack_110,lVar7 + 0x88);
          uStack_e8 = puVar13;
          lVar18 = func_0x00083a6c(*(undefined8 *)(*(long *)(*(long *)(lVar7 + 0x10) + -8) + 8),
                                   puVar13,&UNK_0080364f,&uStack_e8,&uStack_e9);
          puVar14 = (undefined1 *)(lVar18 + 0x38);
          uVar1 = *puVar14;
          *puVar14 = auStack_110[0];
          uVar6 = *(undefined8 *)(lVar18 + 0x40);
          *(undefined8 *)(lVar18 + 0x40) = uStack_108;
          *(undefined1 **)(lVar7 + 0x50) = puVar14;
          auStack_110[0] = uVar1;
          uStack_108 = uVar6;
          func_0x00078220(&uStack_108);
        }
      }
      func_0x00078220(&puStack_f8,uStack_100 & 0xff);
      return 1;
    }
    uVar9 = (**(code **)(*plVar8 + 0x30))(plVar8,&uStack_70,&pcStack_90);
    if ((uVar9 & 1) == 0) {
      func_0x000796dc(auStack_50,lVar7 + 0x88);
      puVar14 = *(undefined1 **)(*(long *)(lVar7 + 0x10) + -8);
      uVar1 = *puVar14;
      *puVar14 = auStack_50[0];
      uVar6 = *(undefined8 *)(puVar14 + 8);
      *(undefined8 *)(puVar14 + 8) = uStack_48;
      auStack_50[0] = uVar1;
      uStack_48 = uVar6;
      func_0x00078220(&uStack_48);
    }
  }
  lVar18 = *(long *)(lVar7 + 0x10);
  lVar15 = lVar18 + -8;
  *(long *)(lVar7 + 0x10) = lVar15;
  *(long *)(lVar7 + 0x28) = *(long *)(lVar7 + 0x28) + -1;
  if ((*(long *)(lVar7 + 8) != lVar15) &&
     (uStack_70 = *(byte **)(lVar18 + -0x10), uStack_70 != (byte *)0x0)) {
    bVar2 = *uStack_70;
    if (bVar2 - 1 < 2) {
      plStack_68 = (long *)0x0;
      lStack_60 = 0;
      lStack_58 = -0x8000000000000000;
      if (bVar2 == 2) {
        lStack_60 = **(long **)(uStack_70 + 8);
      }
      else if (bVar2 == 1) {
        plStack_68 = (long *)**(long **)(uStack_70 + 8);
      }
      else {
        lStack_58 = 0;
      }
      while( true ) {
        pcStack_90 = *(char **)(lVar15 + -8);
        lStack_88 = 0;
        uStack_80 = 0;
        uStack_78 = 0x8000000000000000;
        if (*pcStack_90 == '\x02') {
          uStack_80 = *(undefined8 *)(*(long *)(pcStack_90 + 8) + 8);
          uVar9 = func_0x000833fc(&uStack_70,&pcStack_90);
        }
        else if (*pcStack_90 == '\x01') {
          lStack_88 = *(long *)(pcStack_90 + 8) + 8;
          uVar9 = func_0x000833fc(&uStack_70,&pcStack_90);
        }
        else {
          uStack_78 = 1;
          uVar9 = func_0x000833fc(&uStack_70,&pcStack_90);
        }
        if ((uVar9 & 1) != 0) {
          return 1;
        }
        pcVar10 = (char *)func_0x00082fd4(&uStack_70);
        if (*pcVar10 == '\t') break;
        if (*uStack_70 == 2) {
          lStack_60 = lStack_60 + 0x10;
          lVar15 = *(long *)(lVar7 + 0x10);
        }
        else if (*uStack_70 == 1) {
          plVar8 = plStack_68;
          plVar3 = (long *)plStack_68[1];
          if ((long *)plStack_68[1] == (long *)0x0) {
            do {
              plStack_68 = (long *)plVar8[2];
              bVar5 = (long *)*plStack_68 != plVar8;
              plVar8 = plStack_68;
            } while (bVar5);
          }
          else {
            do {
              plStack_68 = plVar3;
              plVar3 = (long *)*plStack_68;
            } while ((long *)*plStack_68 != (long *)0x0);
          }
          lVar15 = *(long *)(lVar7 + 0x10);
        }
        else {
          lStack_58 = lStack_58 + 1;
          lVar15 = *(long *)(lVar7 + 0x10);
        }
      }
      pbStack_b0 = uStack_70;
      lStack_a0 = lStack_60;
      plStack_a8 = plStack_68;
      lStack_98 = lStack_58;
      func_0x000830d4(&pcStack_90,*(undefined8 *)(*(long *)(lVar7 + 0x10) + -8),&pbStack_b0);
    }
  }
  return 1;
}

