
void FUN_00057310(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  byte bVar4;
  code *pcVar5;
  bool bVar6;
  long *plVar7;
  undefined8 *puVar8;
  undefined8 uVar9;
  char *pcVar10;
  long *plVar11;
  long lVar12;
  long *plVar13;
  long lVar14;
  long unaff_x22;
  long unaff_x23;
  undefined8 unaff_x24;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  undefined8 uStack0000000000000040;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  
  func_0x007795c4();
  func_0x007795c4();
  plVar13 = (long *)*(long *)(unaff_x22 + 0x18);
  uVar3 = *(ulong *)(unaff_x22 + 0x20);
  if (-1 < (char)*(byte *)(unaff_x22 + 0x2f)) {
    plVar13 = (long *)(unaff_x22 + 0x18);
    uVar3 = (ulong)*(byte *)(unaff_x22 + 0x2f);
  }
  if ((uVar3 != 3) || ((short)*plVar13 != 0x4547 || *(char *)((long)plVar13 + 2) != 'T')) {
    func_0x007795c4();
  }
  if (*(char *)(unaff_x22 + 0x47) < '\0') {
    if (*(long *)(unaff_x22 + 0x38) != 0) goto LAB_000573b8;
  }
  else if (*(char *)(unaff_x22 + 0x47) != '\0') {
LAB_000573b8:
    func_0x007795c4();
    func_0x007795c4();
  }
  if (*(long **)(unaff_x22 + 0x48) == (long *)(unaff_x22 + 0x50)) {
    lVar14 = 0;
  }
  else {
    lVar14 = 0;
    plVar13 = *(long **)(unaff_x22 + 0x48);
    do {
      bVar4 = *(byte *)((long)plVar13 + 0x37);
      uVar3 = plVar13[5];
      if (-1 < (char)bVar4) {
        uVar3 = (ulong)bVar4;
      }
      uVar1 = uVar3 + 2;
      if (0x7ffffffffffffff7 < uVar1) {
        func_0x0001748c(&uStack0000000000000040);
        goto LAB_00057884;
      }
      if (uVar1 < 0x17) {
        in_stack_00000048 = 0;
        uStack0000000000000040 = (undefined8 *)0x0;
        puVar8 = &uStack0000000000000040;
        in_stack_00000050 = uVar1 << 0x38;
        if (uVar3 != 0) goto LAB_000574a0;
      }
      else {
        uVar2 = (uVar1 & 0xfffffffffffffff8) + 8;
        if ((uVar1 | 7) != 0x17) {
          uVar2 = uVar1 | 7;
        }
        puVar8 = (undefined8 *)__Znwm(uVar2 + 1);
        in_stack_00000050 = uVar2 + 1 | 0x8000000000000000;
        uStack0000000000000040 = puVar8;
        in_stack_00000048 = uVar1;
LAB_000574a0:
        plVar7 = (long *)plVar13[4];
        if (-1 < (char)bVar4) {
          plVar7 = plVar13 + 4;
        }
        _memmove(puVar8,plVar7,uVar3);
      }
      *(undefined2 *)((long)puVar8 + uVar3) = 0x203a;
      *(undefined1 *)((undefined2 *)((long)puVar8 + uVar3) + 1) = 0;
      uVar3 = plVar13[8];
      plVar7 = (long *)plVar13[7];
      if (-1 < (char)*(byte *)((long)plVar13 + 0x4f)) {
        uVar3 = (ulong)*(byte *)((long)plVar13 + 0x4f);
        plVar7 = plVar13 + 7;
      }
      plVar7 = (long *)__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                                 (&uStack0000000000000040,plVar7,uVar3);
      in_stack_00000068 = plVar7[1];
      uStack0000000000000060 = (undefined8 *)*plVar7;
      in_stack_00000070 = plVar7[2];
      plVar7[1] = 0;
      plVar7[2] = 0;
      *plVar7 = 0;
      puVar8 = uStack0000000000000060;
      if (-1 < (long)in_stack_00000070) {
        puVar8 = &uStack0000000000000060;
      }
      lVar14 = func_0x00779dfc(lVar14,puVar8);
      if ((long)in_stack_00000070 < 0) {
        __ZdlPv(uStack0000000000000060);
        if (-1 < (long)in_stack_00000050) goto LAB_00057530;
LAB_0005754c:
        __ZdlPv(uStack0000000000000040);
        plVar7 = (long *)plVar13[1];
        if ((long *)plVar13[1] == (long *)0x0) goto LAB_0005756c;
LAB_0005755c:
        do {
          plVar11 = plVar7;
          plVar7 = (long *)*plVar11;
        } while ((long *)*plVar11 != (long *)0x0);
      }
      else {
        if ((long)in_stack_00000050 < 0) goto LAB_0005754c;
LAB_00057530:
        plVar7 = (long *)plVar13[1];
        if ((long *)plVar13[1] != (long *)0x0) goto LAB_0005755c;
LAB_0005756c:
        do {
          plVar11 = (long *)plVar13[2];
          bVar6 = (long *)*plVar11 != plVar13;
          plVar13 = plVar11;
        } while (bVar6);
      }
      plVar13 = plVar11;
    } while (plVar11 != (long *)(unaff_x22 + 0x50));
    if (lVar14 == 0) {
      lVar12 = *(long *)(unaff_x22 + 0x70);
      goto joined_r0x000575ac;
    }
    func_0x007795c4(unaff_x24,&UNK_00002727);
  }
  lVar12 = *(long *)(unaff_x22 + 0x70);
joined_r0x000575ac:
  if (lVar12 != 0) {
    uStack0000000000000060 = (undefined8 *)0x0;
    in_stack_00000068 = 0;
    in_stack_00000070 = 0;
    if (*(long **)(unaff_x22 + 0x60) != (long *)(unaff_x22 + 0x68)) {
      plVar13 = *(long **)(unaff_x22 + 0x60);
      do {
        uVar3 = in_stack_00000068;
        if (-1 < (long)in_stack_00000070) {
          uVar3 = in_stack_00000070 >> 0x38;
        }
        if (uVar3 != 0) {
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                    (&uStack0000000000000060,"; ",2);
        }
        bVar4 = *(byte *)((long)plVar13 + 0x37);
        uVar3 = plVar13[5];
        if (-1 < (char)bVar4) {
          uVar3 = (ulong)bVar4;
        }
        uVar1 = uVar3 + 1;
        if (0x7ffffffffffffff7 < uVar1) {
          func_0x0001748c(&uStack0000000000000028);
LAB_00057884:
                    /* WARNING: Does not return */
          pcVar5 = (code *)SoftwareBreakpoint(1,0x57888);
          (*pcVar5)();
        }
        if (uVar1 < 0x17) {
          in_stack_00000030 = 0;
          uStack0000000000000028 = (undefined8 *)0x0;
          puVar8 = &uStack0000000000000028;
          in_stack_00000038 = uVar1 << 0x38;
          if (uVar3 != 0) goto LAB_00057684;
        }
        else {
          uVar2 = (uVar1 & 0xfffffffffffffff8) + 8;
          if ((uVar1 | 7) != 0x17) {
            uVar2 = uVar1 | 7;
          }
          puVar8 = (undefined8 *)__Znwm(uVar2 + 1);
          in_stack_00000038 = uVar2 + 1 | 0x8000000000000000;
          uStack0000000000000028 = puVar8;
          in_stack_00000030 = uVar1;
LAB_00057684:
          plVar7 = (long *)plVar13[4];
          if (-1 < (char)bVar4) {
            plVar7 = plVar13 + 4;
          }
          _memmove(puVar8,plVar7,uVar3);
        }
        *(undefined2 *)((long)puVar8 + uVar3) = 0x3d;
        uVar3 = plVar13[8];
        plVar7 = (long *)plVar13[7];
        if (-1 < (char)*(byte *)((long)plVar13 + 0x4f)) {
          uVar3 = (ulong)*(byte *)((long)plVar13 + 0x4f);
          plVar7 = plVar13 + 7;
        }
        plVar7 = (long *)__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                                   (&uStack0000000000000028,plVar7,uVar3);
        in_stack_00000048 = plVar7[1];
        uStack0000000000000040 = (undefined8 *)*plVar7;
        in_stack_00000050 = plVar7[2];
        plVar7[1] = 0;
        plVar7[2] = 0;
        *plVar7 = 0;
        uVar3 = in_stack_00000048;
        puVar8 = uStack0000000000000040;
        if (-1 < (long)in_stack_00000050) {
          uVar3 = in_stack_00000050 >> 0x38;
          puVar8 = &uStack0000000000000040;
        }
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                  (&uStack0000000000000060,puVar8,uVar3);
        if ((long)in_stack_00000050 < 0) {
          __ZdlPv(uStack0000000000000040);
          if (-1 < (long)in_stack_00000038) goto LAB_00057710;
LAB_0005772c:
          __ZdlPv(uStack0000000000000028);
          plVar7 = (long *)plVar13[1];
          if ((long *)plVar13[1] == (long *)0x0) goto LAB_0005774c;
LAB_0005773c:
          do {
            plVar11 = plVar7;
            plVar7 = (long *)*plVar11;
          } while ((long *)*plVar11 != (long *)0x0);
        }
        else {
          if ((long)in_stack_00000038 < 0) goto LAB_0005772c;
LAB_00057710:
          plVar7 = (long *)plVar13[1];
          if ((long *)plVar13[1] != (long *)0x0) goto LAB_0005773c;
LAB_0005774c:
          do {
            plVar11 = (long *)plVar13[2];
            bVar6 = (long *)*plVar11 != plVar13;
            plVar13 = plVar11;
          } while (bVar6);
        }
        plVar13 = plVar11;
      } while (plVar11 != (long *)(unaff_x22 + 0x68));
    }
    func_0x007795c4(unaff_x24,&UNK_00002726);
    if ((long)in_stack_00000070 < 0) {
      __ZdlPv(uStack0000000000000060);
    }
  }
  func_0x007795c4(unaff_x24,0x34);
  func_0x007795c4(unaff_x24,0x40);
  uVar9 = func_0x00741600(unaff_x24);
  uStack0000000000000060 = (undefined8 *)0x0;
  func_0x0074186c(unaff_x24,&UNK_00200002);
  *(undefined8 **)(unaff_x23 + 0x18) = uStack0000000000000060;
  *(bool *)(unaff_x23 + 0x38) = (int)uVar9 == 0;
  if ((int)uVar9 == 0) {
    pcVar10 = "OK";
  }
  else {
    pcVar10 = (char *)func_0x0077e9f4(uVar9);
  }
  func_0x0002a730(unaff_x23 + 0x20,pcVar10);
  func_0x00779fa4(lVar14);
  func_0x00741830(unaff_x24);
  return;
}

