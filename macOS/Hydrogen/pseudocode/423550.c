
undefined *
FUN_00423550(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  bool bVar1;
  undefined1 *puVar2;
  long lVar3;
  long lVar4;
  ulong *puVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 unaff_x19;
  undefined *puVar8;
  undefined *unaff_x20;
  long *plVar9;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  long lStack_90;
  undefined8 uStack_88;
  uint uStack_78;
  int iStack_74;
  int iStack_70;
  int iStack_6c;
  undefined1 auStack_68 [24];
  undefined1 auStack_50 [16];
  
  lVar4 = func_0x00187bd0();
  if (lVar4 != 0) {
    _memcpy(lVar4,param_2);
    if ((*(long *)(unaff_x20 + 0xb8) != 0) && (*(long *)(unaff_x20 + 0xc0) != 0)) {
      func_0x00187bd4(*(long *)(unaff_x20 + 0xb8),*(long *)(unaff_x20 + 0xc0) << 2,4);
    }
    *(long *)(unaff_x20 + 0xb8) = lVar4;
    *(undefined8 *)(unaff_x20 + 0xc0) = unaff_x19;
    return unaff_x20;
  }
  lVar4 = func_0x007a1f00(4);
  func_0x0043507c(&lStack_a8,lVar4);
  if ((*(byte *)(lVar4 + 200) & 1) == 0) {
    func_0x00435af0(&uStack_78,lVar4,0,param_4,1);
    if (uStack_78 == 1) {
      puVar8 = (undefined *)CONCAT44(iStack_6c,iStack_70);
    }
    else {
      auStack_50 = func_0x0042eea4();
      puVar5 = auStack_50._8_8_;
      plVar9 = (long *)0x0;
      if (lStack_a8 != -0x8000000000000000) {
        plVar9 = &lStack_a8;
      }
      puVar8 = (undefined *)func_0x004370ac(lVar4,auStack_68,plVar9);
      uVar6 = *puVar5;
      do {
        while (((uint)uVar6 >> 1 & 1) != 0) {
          if (((uint)uVar6 >> 3 & 1) == 0) {
            func_0x007a1a98(puVar5);
            goto LAB_00423740;
          }
          uVar7 = uVar6 & 0xfffffffffffffff6;
          bVar1 = *puVar5 == uVar6;
          uVar6 = *puVar5;
          if (bVar1) {
            *puVar5 = uVar7;
            goto LAB_00423740;
          }
        }
        uVar7 = 0;
        if (uVar6 - 0x11 != 0) {
          uVar7 = uVar6 - 0x11 | 1;
        }
        bVar1 = *puVar5 != uVar6;
        uVar6 = *puVar5;
      } while (bVar1);
      *puVar5 = uVar7;
LAB_00423740:
      if ((uStack_78 & 1) == 0) {
        if (iStack_74 != -1) {
          _close();
        }
        if (iStack_70 != -1) {
          _close();
        }
        if (iStack_6c != -1) {
          _close();
        }
      }
    }
    if (lStack_a8 == -0x8000000000000000) {
      return puVar8;
    }
    if (lStack_98 != 0) {
      plVar9 = (long *)(lStack_a0 + 8);
      lVar4 = lStack_98;
      do {
        puVar2 = (undefined1 *)plVar9[-1];
        lVar3 = *plVar9;
        *puVar2 = 0;
        if (lVar3 != 0) {
          func_0x00187bd4(puVar2,lVar3,1);
        }
        plVar9 = plVar9 + 2;
        lVar4 = lVar4 + -1;
      } while (lVar4 != 0);
    }
    if (lStack_a8 != 0) {
      func_0x00187bd4(lStack_a0,lStack_a8 << 4,8);
    }
  }
  else {
    if (lStack_a8 == -0x8000000000000000) {
      return &UNK_009dc110;
    }
    if (lStack_98 != 0) {
      plVar9 = (long *)(lStack_a0 + 8);
      lVar4 = lStack_98;
      do {
        puVar2 = (undefined1 *)plVar9[-1];
        lVar3 = *plVar9;
        *puVar2 = 0;
        if (lVar3 != 0) {
          func_0x00187bd4(puVar2,lVar3,1);
        }
        plVar9 = plVar9 + 2;
        lVar4 = lVar4 + -1;
      } while (lVar4 != 0);
    }
    if (lStack_a8 != 0) {
      func_0x00187bd4(lStack_a0,lStack_a8 << 4,8);
    }
    puVar8 = &UNK_009dc110;
  }
  if (lStack_90 != 0) {
    func_0x00187bd4(uStack_88,lStack_90 << 3,8);
  }
  return puVar8;
}

