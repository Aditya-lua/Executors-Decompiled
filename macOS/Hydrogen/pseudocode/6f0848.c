
long FUN_006f0848(long param_1)

{
  long lVar1;
  undefined8 *puVar2;
  byte bVar3;
  byte bVar4;
  int iVar5;
  long *plVar6;
  long lVar7;
  long lVar8;
  uint uVar9;
  int iVar10;
  long lVar11;
  char *pcVar12;
  int in_w15;
  int in_w16;
  long unaff_x19;
  long unaff_x20;
  int unaff_w21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  uint unaff_w28;
  double dVar13;
  double dVar14;
  double unaff_d8;
  
LAB_006f07a0:
  do {
    lVar8 = param_1 + -0x20;
    if (param_1 == 0) {
      lVar8 = *(long *)(unaff_x27 + 0x10);
      if ((lVar8 != 0) && ((*(byte *)(lVar8 + 3) >> 2 & 1) == 0)) {
        plVar6 = (long *)func_0x006fe740(lVar8,2,*(undefined8 *)(*(long *)(unaff_x19 + 0x18) + 1000)
                                        );
        in_w16 = -1;
        in_w15 = 1;
        if ((plVar6 != (long *)0x0) && (*(int *)((long)plVar6 + 0xc) == 5)) {
          lVar8 = _strchr(*plVar6 + 0x18,0x73);
          in_w16 = -1;
          in_w15 = 1;
          if (lVar8 != 0) {
            iVar5 = 3 << (ulong)(*(byte *)(unaff_x27 + 6) & 0x1f);
            iVar10 = iVar5 + 7;
            if (-1 < iVar5) {
              iVar10 = iVar5;
            }
            if (unaff_w21 < iVar10 >> 3) {
              (*pcRam0000000000a40208)();
              in_w16 = -1;
              in_w15 = 1;
            }
          }
        }
      }
      unaff_x27 = *(long *)(unaff_x27 + 0x28);
      if (unaff_x27 == 0) break;
      lVar8 = (long)*(int *)(unaff_x27 + 8);
      lVar7 = lVar8 * 0x10;
      bVar3 = *(byte *)(unaff_x27 + 6);
      bVar4 = bVar3;
      if (*(int *)(unaff_x27 + 8) != 0) {
        lVar11 = lVar7;
        do {
          lVar8 = lVar8 + -1;
          lVar1 = *(long *)(unaff_x27 + 0x18) + lVar11;
          if (4 < *(int *)(lVar1 + -4)) {
            pcVar12 = *(char **)(lVar1 + -0x10);
            if (*pcVar12 == '\x05') {
              pcVar12[1] = pcVar12[1] & 0xfc;
            }
            else if ((pcVar12[1] & 3U) != 0) {
              *(undefined4 *)(lVar1 + -4) = 0;
            }
          }
          lVar11 = lVar11 + -0x10;
        } while ((int)lVar8 != 0);
        bVar4 = *(byte *)(unaff_x27 + 6);
      }
      unaff_w21 = 0;
      unaff_x26 = unaff_x26 + lVar7 + (long)(in_w15 << (ulong)(bVar3 & 0x1f)) * 0x20 + 0x30;
      lVar8 = (ulong)(uint)~(in_w16 << (ulong)(bVar4 & 0x1f)) << 5;
    }
    puVar2 = (undefined8 *)(*(long *)(unaff_x27 + 0x20) + lVar8);
    iVar10 = *(int *)((long)puVar2 + 0xc);
    param_1 = lVar8;
    if (iVar10 != 0) {
      uVar9 = *(uint *)((long)puVar2 + 0x1c);
      if (4 < (uVar9 & 0xf)) {
        pcVar12 = *(char **)(*(long *)(unaff_x27 + 0x20) + lVar8 + 0x10);
        if (*pcVar12 == '\x05') {
          pcVar12[1] = pcVar12[1] & 0xfc;
          iVar10 = *(int *)((long)puVar2 + 0xc);
          goto code_r0x006f0808;
        }
        if ((pcVar12[1] & 3U) == 0) goto code_r0x006f0808;
        *(undefined4 *)((long)puVar2 + 0xc) = 0;
code_r0x006f0840:
        *(uint *)((long)puVar2 + 0x1c) = uVar9 & 0xfffffff0 | unaff_w28 & 0xf;
        goto LAB_006f07a0;
      }
code_r0x006f0808:
      if (4 < iVar10) {
        pcVar12 = (char *)*puVar2;
        if (*pcVar12 == '\x05') {
          pcVar12[1] = pcVar12[1] & 0xfc;
        }
        else if ((pcVar12[1] & 3U) != 0) {
          uVar9 = *(uint *)((long)puVar2 + 0x1c);
          *(undefined4 *)((long)puVar2 + 0xc) = 0;
          if (4 < (uVar9 & 0xf)) goto code_r0x006f0840;
          goto LAB_006f07a0;
        }
      }
      unaff_w21 = unaff_w21 + 1;
    }
  } while( true );
  *(undefined8 *)(unaff_x20 + 0x38) = 0;
  dVar13 = (double)func_0x006f5d58();
  *(double *)(&UNK_00001b88 + unaff_x20) =
       *(double *)(&UNK_00001b88 + unaff_x20) + (dVar13 - unaff_d8);
  lVar8 = *(long *)(unaff_x19 + 0x18) + 0x300;
  lVar7 = *(long *)(*(long *)(unaff_x19 + 0x18) + 0x318);
  if (lVar7 == lVar8) {
    lVar11 = 0;
  }
  else {
    lVar11 = 0;
    do {
      while (*(char *)(lVar7 + 3) == '\0') {
        lVar7 = *(long *)(lVar7 + 0x18);
        func_0x006ef9ec();
        lVar11 = lVar11 + 0x28;
        if (lVar7 == lVar8) goto code_r0x006f0978;
      }
      *(undefined1 *)(lVar7 + 3) = 0;
      lVar7 = *(long *)(lVar7 + 0x18);
      lVar11 = lVar11 + 0x28;
    } while (lVar7 != lVar8);
  }
code_r0x006f0978:
  dVar14 = (double)func_0x006f5d58();
  *(double *)(&UNK_00001b70 + unaff_x20) =
       *(double *)(&UNK_00001b70 + unaff_x20) + (dVar14 - dVar13);
  *(byte *)(unaff_x20 + 0x20) = *(byte *)(unaff_x20 + 0x20) ^ 3;
  *(undefined8 *)(unaff_x20 + 0x2f0) = *(undefined8 *)(unaff_x20 + 0x2e8);
  *(undefined1 *)(unaff_x20 + 0x21) = 4;
  return unaff_x23 + unaff_x22 + unaff_x24 + unaff_x25 + unaff_x26 + lVar11;
}

