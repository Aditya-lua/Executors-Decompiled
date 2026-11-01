
undefined1  [16] FUN_004efa48(void)

{
  int iVar1;
  undefined8 uVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  ulong unaff_x22;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  ulong *puVar10;
  long lVar11;
  long unaff_x29;
  undefined1 auVar12 [16];
  
  uVar2 = __Unwind_Resume();
  func_0x0016b01c(unaff_x29 + -0x88);
  if (unaff_x22 == 0) {
    uVar3 = *(ulong *)(unaff_x29 + -0xa0);
  }
  else {
    func_0x00187bd4();
    uVar3 = *(ulong *)(unaff_x29 + -0xa0);
  }
  if ((uVar3 | 0x8000000000000000) == 0x8000000000000000) {
    __Unwind_Resume(uVar2);
  }
  uVar3 = 1;
  func_0x00187bd4();
  auVar12 = __Unwind_Resume(uVar2);
  auVar12._8_8_ = auVar12._8_8_;
  uVar2 = 0;
  if (*auVar12._8_8_ == 0) {
    uVar2 = *(undefined8 *)(auVar12._8_8_ + 2);
  }
  if ((*auVar12._8_8_ & 1) == 0) {
    uVar5 = *(ulong *)(auVar12._8_8_ + 4);
    lVar4 = *(long *)(auVar12._0_8_ + 0x10);
    if ((*(uint *)(lVar4 + 700) >> 0xd & 1) == 0) {
      if (((int)uVar3 == 0) || ((*(uint *)(lVar4 + 0x2c0) >> 0xd & 1) == 0)) {
code_r0x004efb88:
        if (((*(uint *)(lVar4 + 700) >> 8 & 1) == 0) && ((*(byte *)(lVar4 + 0x2c1) & 1) == 0)) {
          lVar6 = *(long *)(lVar4 + 0xb8);
          lVar8 = *(long *)(lVar4 + 0xc0);
        }
        else {
          lVar8 = *(long *)(lVar4 + 0xc0);
          if (lVar8 == 0) goto FUN_004efb3c;
          lVar6 = *(long *)(lVar4 + 0xb8);
          lVar7 = lVar6 + lVar8 * 0x2c8;
          lVar4 = lVar6;
          do {
            lVar9 = lVar4 + 0x2c8;
            unaff_x22 = *(ulong *)(lVar4 + 0x238);
            if (uVar5 <= unaff_x22) {
              uVar3 = *(ulong *)(lVar4 + 0x230);
              iVar1 = _memcmp(uVar2,uVar3,uVar5);
              if (iVar1 == 0) goto code_r0x004efc44;
            }
            if (*(long *)(lVar4 + 0x48) != 0) {
              lVar11 = *(long *)(lVar4 + 0x48) * 0x18;
              puVar10 = (ulong *)(*(long *)(lVar4 + 0x40) + 8);
              do {
                unaff_x22 = *puVar10;
                if (uVar5 <= unaff_x22) {
                  uVar3 = puVar10[-1];
                  iVar1 = _memcmp(uVar2,uVar3,uVar5);
                  if (iVar1 == 0) goto code_r0x004efc44;
                }
                lVar11 = lVar11 + -0x18;
                puVar10 = puVar10 + 3;
              } while (lVar11 != 0);
            }
            lVar4 = lVar9;
          } while (lVar9 != lVar7);
        }
code_r0x004efcb8:
        if (lVar8 != 0) {
          lVar4 = lVar6 + lVar8 * 0x2c8;
          do {
            uVar3 = *(ulong *)(lVar6 + 0x230);
            unaff_x22 = *(ulong *)(lVar6 + 0x238);
            if ((uVar5 == unaff_x22) && (iVar1 = _memcmp(uVar2,uVar3,uVar5), iVar1 == 0))
            goto code_r0x004efd4c;
            if (*(long *)(lVar6 + 0x48) != 0) {
              lVar8 = *(long *)(lVar6 + 0x48) * 0x18;
              puVar10 = (ulong *)(*(long *)(lVar6 + 0x40) + 8);
              do {
                if ((uVar5 == *puVar10) && (iVar1 = _memcmp(uVar2,puVar10[-1],uVar5), iVar1 == 0))
                goto code_r0x004efb40;
                lVar8 = lVar8 + -0x18;
                puVar10 = puVar10 + 3;
              } while (lVar8 != 0);
            }
            lVar6 = lVar6 + 0x2c8;
          } while (lVar6 != lVar4);
          uVar3 = 0;
code_r0x004efd4c:
          unaff_x22 = uVar5;
          goto code_r0x004efb40;
        }
      }
    }
    else if ((uVar3 & 1) == 0) goto code_r0x004efb88;
  }
FUN_004efb3c:
  uVar3 = 0;
code_r0x004efb40:
  auVar12._8_8_ = unaff_x22;
  auVar12._0_8_ = uVar3;
  return auVar12;
code_r0x004efc44:
  if (lVar9 == lVar7) goto code_r0x004efb40;
  if ((uVar5 <= *(ulong *)(lVar9 + 0x238)) &&
     (iVar1 = _memcmp(uVar2,*(undefined8 *)(lVar9 + 0x230),uVar5), iVar1 == 0))
  goto code_r0x004efcb8;
  if (*(long *)(lVar9 + 0x48) != 0) {
    lVar4 = *(long *)(lVar9 + 0x48) * 0x18;
    puVar10 = (ulong *)(*(long *)(lVar9 + 0x40) + 8);
    do {
      if ((uVar5 <= *puVar10) && (iVar1 = _memcmp(uVar2,puVar10[-1],uVar5), iVar1 == 0))
      goto code_r0x004efcb8;
      lVar4 = lVar4 + -0x18;
      puVar10 = puVar10 + 3;
    } while (lVar4 != 0);
  }
  lVar9 = lVar9 + 0x2c8;
  goto code_r0x004efc44;
}

