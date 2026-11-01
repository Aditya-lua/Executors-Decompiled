
void FUN_000e594c(void)

{
  float *pfVar1;
  int *piVar2;
  uint *puVar3;
  int iVar4;
  int iVar5;
  uint uVar6;
  int iVar7;
  long lVar8;
  int in_w8;
  long lVar9;
  uint uVar10;
  int *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x22;
  long unaff_x23;
  long unaff_x24;
  undefined4 unaff_w25;
  undefined8 unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long unaff_x29;
  float unaff_s8;
  
  do {
    *(undefined4 *)(*(long *)(unaff_x24 + 0x108) + (long)in_w8 * 4) = unaff_w25;
    *(int *)(unaff_x24 + 0x100) = *(int *)(unaff_x24 + 0x100) + 1;
    iVar7 = func_0x0010beb8(unaff_x26);
    if (iVar7 == 0) {
      lVar9 = *(long *)(*(long *)(unaff_x27 + 0x4c0) + 0x4000);
      if (*(char *)(lVar9 + 0xc3) == '\0') goto LAB_000e59b0;
LAB_000e5980:
      iVar7 = func_0x0010beb8(unaff_x22);
    }
    else {
      func_0x00127ff4(unaff_x19,unaff_x23,0xffffffff);
      lVar9 = *(long *)(*(long *)(unaff_x27 + 0x4c0) + 0x4000);
      if (*(char *)(lVar9 + 0xc3) != '\0') goto LAB_000e5980;
LAB_000e59b0:
      *(float *)(lVar9 + 0x110) = *(float *)(lVar9 + 0x118) + unaff_s8;
      *(undefined4 *)(lVar9 + 0x114) = *(undefined4 *)(lVar9 + 0x11c);
      *(undefined8 *)(lVar9 + 0x138) = *(undefined8 *)(lVar9 + 0x140);
      *(undefined4 *)(lVar9 + 0x148) = *(undefined4 *)(lVar9 + 0x14c);
      *(undefined1 *)(lVar9 + 0x150) = 1;
      iVar7 = func_0x0010beb8(unaff_x22);
    }
    if (iVar7 != 0) {
      func_0x00127ff4(unaff_x19,unaff_x23,1);
    }
    lVar9 = *(long *)(*(long *)(unaff_x27 + 0x4c0) + 0x4000);
    if (*(char *)(lVar9 + 0xc3) == '\0') {
      *(float *)(lVar9 + 0x110) =
           *(float *)(&UNK_00003934 + *(long *)(unaff_x27 + 0x4c0)) + *(float *)(lVar9 + 0x118);
      *(undefined4 *)(lVar9 + 0x114) = *(undefined4 *)(lVar9 + 0x11c);
      *(undefined8 *)(lVar9 + 0x138) = *(undefined8 *)(lVar9 + 0x140);
      *(undefined4 *)(lVar9 + 0x148) = *(undefined4 *)(lVar9 + 0x14c);
      *(undefined1 *)(lVar9 + 0x150) = 1;
    }
    func_0x00127ea0(unaff_x19,unaff_x23);
    func_0x0010adc0("%02d%c Tab 0x%08X \'%s\' Offset: %.2f, Width: %.2f/%.2f");
    unaff_x24 = *(long *)(*(long *)(unaff_x27 + 0x4c0) + 0x4000);
    *(int *)(unaff_x24 + 0x100) = *(int *)(unaff_x24 + 0x100) + -1;
    unaff_x20 = unaff_x20 + 1;
    unaff_x28 = unaff_x28 + 0x2c;
    if (*unaff_x19 <= unaff_x20) {
      func_0x00123710();
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
        return;
      }
      lVar8 = ___stack_chk_fail();
      lVar9 = lRam0000000000a334c0;
      if (*(char *)(lVar8 + 0xf) != '\0') {
        piVar2 = (int *)(&UNK_00004ab0 + lRam0000000000a334c0);
        puVar3 = (uint *)(&UNK_0000497c + lRam0000000000a334c0);
        uVar10 = *puVar3;
        if ((uVar10 >> 2 & 1) == 0) {
          pfVar1 = (float *)(&UNK_000038e8 + lRam0000000000a334c0);
          *(float *)(&UNK_00005ea0 + lRam0000000000a334c0) = *pfVar1;
          *(float *)(&UNK_000038e8 + lVar9) = *pfVar1 * *(float *)(&UNK_000038ec + lVar9);
        }
        uVar10 = uVar10 | 4;
        *puVar3 = uVar10;
        iVar7 = *piVar2;
        if (iVar7 == *(int *)(&UNK_00004ab4 + lVar9)) {
          iVar4 = iVar7;
          if (iVar7 < 0) {
            iVar4 = iVar7 + 1;
          }
          iVar5 = 8;
          if (iVar7 != 0) {
            iVar5 = iVar7 + (iVar4 >> 1);
          }
          if (iVar5 <= iVar7 + 1) {
            iVar5 = iVar7 + 1;
          }
          func_0x000eb9f0(piVar2,iVar5);
          iVar7 = *piVar2;
          uVar10 = *puVar3;
        }
        *(uint *)(*(long *)(&UNK_00004ab8 + lVar9) + (long)iVar7 * 4) = uVar10;
        *piVar2 = *piVar2 + 1;
        *(short *)(&UNK_00005ea4 + lVar9) = *(short *)(&UNK_00005ea4 + lVar9) + 1;
      }
      func_0x0010adc0("0x%08X \"%s\" Pos (%d,%d) Size (%d,%d) Collapsed=%d");
      lVar9 = lRam0000000000a334c0;
      if (*(char *)(lVar8 + 0xf) != '\0') {
        piVar2 = (int *)(&UNK_00004ab0 + lRam0000000000a334c0);
        *(short *)(&UNK_00005ea4 + lRam0000000000a334c0) =
             *(short *)(&UNK_00005ea4 + lRam0000000000a334c0) + -1;
        uVar10 = *(uint *)(&UNK_0000497c + lVar9);
        iVar7 = *piVar2;
        *piVar2 = iVar7 + -1;
        uVar6 = *(uint *)(*(long *)(&UNK_00004ab8 + lVar9) + (long)(iVar7 + -2) * 4);
        *(uint *)(&UNK_0000497c + lVar9) = uVar6;
        if (((uVar10 >> 2 & 1) != 0) && ((uVar6 >> 2 & 1) == 0)) {
          *(undefined4 *)(&UNK_000038e8 + lVar9) = *(undefined4 *)(&UNK_00005ea0 + lVar9);
        }
      }
      return;
    }
    unaff_x23 = *(long *)(unaff_x19 + 2) + unaff_x28;
    unaff_w25 = func_0x000c1858(unaff_x24,unaff_x23);
    in_w8 = *(int *)(unaff_x24 + 0x100);
    if (in_w8 == *(int *)(unaff_x24 + 0x104)) {
      iVar7 = in_w8;
      if (in_w8 < 0) {
        iVar7 = in_w8 + 1;
      }
      iVar4 = 8;
      if (in_w8 != 0) {
        iVar4 = in_w8 + (iVar7 >> 1);
      }
      if (iVar4 <= in_w8 + 1) {
        iVar4 = in_w8 + 1;
      }
      func_0x000eb9f0((int *)(unaff_x24 + 0x100),iVar4);
      in_w8 = *(int *)(unaff_x24 + 0x100);
    }
  } while( true );
}

