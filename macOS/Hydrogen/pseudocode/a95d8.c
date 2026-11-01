
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long FUN_000a95d8(void)

{
  int *piVar1;
  undefined1 *puVar2;
  int iVar3;
  undefined1 extraout_var;
  byte *pbVar4;
  long lVar5;
  undefined4 *unaff_x19;
  undefined8 *unaff_x20;
  int *piVar6;
  ulong unaff_x21;
  long unaff_x22;
  undefined1 *unaff_x23;
  long unaff_x24;
  undefined8 uVar7;
  undefined8 unaff_x25;
  
  if ((code *)*unaff_x20 == (code *)0x0) {
    lVar5 = _malloc();
    unaff_x20[0xf] = lVar5;
  }
  else {
    lVar5 = (*(code *)*unaff_x20)(unaff_x20[3]);
    unaff_x20[0xf] = lVar5;
  }
  if (lVar5 == 0) {
    lVar5 = -9;
  }
  else {
    unaff_x20[0xe] = unaff_x25;
    unaff_x20[0x10] = lVar5;
    unaff_x20[0x11] = 0;
    func_0x000b55d4(unaff_x20 + 0x13,0);
    unaff_x20[0xc] = unaff_x24;
    if (*(int *)((long)unaff_x20 + 0x24) == 0) {
      uVar7 = unaff_x20[0x19];
      if (*(int *)(unaff_x20 + 8) < 2) {
        func_0x0009bd18();
        if (unaff_x24 != 0) {
          func_0x0009c3a0(uVar7,*(undefined8 *)(unaff_x24 + 0x28));
        }
      }
      else {
        func_0x000ab82c(uVar7);
        if (unaff_x24 != 0) {
          func_0x000ac1a4(uVar7,*(undefined8 *)(unaff_x24 + 0x30));
        }
      }
    }
    puVar2 = (undefined1 *)register0x00000008;
    if (unaff_x23 != (undefined1 *)0x0) {
      puVar2 = unaff_x23;
    }
    if (1 < *(int *)(puVar2 + 0x20)) {
      puVar2 = (undefined1 *)register0x00000008;
      if (unaff_x23 != (undefined1 *)0x0) {
        puVar2 = unaff_x23;
      }
      func_0x000abe6c(unaff_x20[0x19],*(undefined4 *)(puVar2 + 0x28));
    }
    if (unaff_x22 != 0) {
      if (unaff_x21 >> 0x1f != 0) {
        return -4;
      }
      if (*(short *)((long)unaff_x20 + 0xd2) == 1) {
        func_0x0009bfd8();
      }
      else {
        func_0x000abe84(unaff_x20[0x19]);
      }
    }
    *unaff_x19 = (int)_UNK_0080bf58;
    pbVar4 = (byte *)(unaff_x19 + 1);
    *pbVar4 = (byte)((*(uint *)((long)unaff_x20 + 0x24) & 1) << 5) |
              (byte)((*(uint *)((long)unaff_x20 + 0x3c) & 1) << 4) | (unaff_x20[6] != 0) << 3 |
              (byte)((*(uint *)(unaff_x20 + 5) & 1) << 2) | *(int *)(unaff_x20 + 7) != 0 | 0x40;
    *(byte *)((long)unaff_x19 + 5) = (*(byte *)(unaff_x20 + 4) & 7) << 4;
    if (unaff_x20[6] == 0) {
      piVar1 = (int *)((long)unaff_x19 + 6);
      iVar3 = *(int *)(unaff_x20 + 7);
    }
    else {
      *(undefined8 *)((long)unaff_x19 + 6) = unaff_x20[6];
      piVar1 = (int *)((long)unaff_x19 + 0xe);
      unaff_x20[0x12] = 0;
      iVar3 = *(int *)(unaff_x20 + 7);
    }
    piVar6 = piVar1;
    if (iVar3 != 0) {
      piVar6 = piVar1 + 1;
      *piVar1 = iVar3;
    }
    func_0x000b5468(pbVar4,(long)piVar6 - (long)pbVar4,0);
    *(undefined1 *)piVar6 = extraout_var;
    *(undefined4 *)((long)unaff_x20 + 0x5c) = 1;
    lVar5 = (long)piVar6 + (1 - (long)unaff_x19);
  }
  return lVar5;
}

