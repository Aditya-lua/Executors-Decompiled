
undefined8 FUN_006cca90(long param_1)

{
  bool bVar1;
  undefined8 uVar2;
  long lVar3;
  ulong *puVar4;
  ulong in_x9;
  ulong in_x10;
  long lVar5;
  long lVar6;
  ulong uVar7;
  ulong in_x11;
  long lVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long *unaff_x22;
  ulong *unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  ulong unaff_x26;
  undefined8 unaff_d8;
  
code_r0x006cca90:
  uVar10 = unaff_x26 >> 4 ^ unaff_x26 >> 9;
  do {
    uVar12 = *(ulong *)(*unaff_x22 + (uVar10 & in_x11) * 0x20);
    if (uVar12 == unaff_x26) goto LAB_006ccad0;
    in_x10 = in_x10 + 1;
    uVar10 = in_x10 + (uVar10 & in_x11);
  } while (uVar12 != in_x9 && in_x10 <= in_x11);
code_r0x006ccac4:
  func_0x006ce510();
  param_1 = *(long *)(unaff_x20 + 0x130);
LAB_006ccad0:
  uVar10 = 0;
  uVar12 = unaff_x26 >> 4 ^ unaff_x26 >> 9;
  lVar5 = *(long *)(unaff_x20 + 0x128);
  do {
    uVar12 = uVar12 & param_1 - 1U;
    uVar11 = *(ulong *)(lVar5 + uVar12 * 0x20);
    if (uVar11 == *(ulong *)(unaff_x20 + 0x140)) {
      puVar4 = (ulong *)(lVar5 + uVar12 * 0x20);
      *puVar4 = unaff_x26;
      *(long *)(unaff_x20 + 0x138) = *(long *)(unaff_x20 + 0x138) + 1;
      goto LAB_006ccb38;
    }
    if (uVar11 == unaff_x26) {
      puVar4 = (ulong *)(lVar5 + uVar12 * 0x20);
      goto LAB_006ccb38;
    }
    uVar10 = uVar10 + 1;
    uVar12 = uVar10 + uVar12;
  } while (uVar10 <= param_1 - 1U);
  puVar4 = (ulong *)0x0;
LAB_006ccb38:
  uVar12 = unaff_x23[1];
  uVar10 = *unaff_x23;
  puVar4[3] = unaff_x23[2];
  puVar4[2] = uVar12;
  puVar4[1] = uVar10;
LAB_006cc880:
  do {
    uVar10 = *(ulong *)(unaff_x19 + 0x60);
    if (uVar10 <= unaff_x24) {
code_r0x006ccb4c:
      lVar5 = unaff_x20 + 0x100;
      func_0x006d621c(lVar5,unaff_x20 + 0xd8,unaff_x20 + 0x128,*(undefined8 *)(unaff_x20 + 0x478),
                      *(undefined1 *)(unaff_x20 + 0x480),*(undefined8 *)(unaff_x20 + 0x50),
                      *(undefined8 *)(unaff_x19 + 0x90),*(undefined8 *)(unaff_x20 + 0x470));
      uVar2 = func_0x006d8ebc(*(undefined8 *)(unaff_x19 + 0x90),*(undefined8 *)(unaff_x19 + 0x58),
                              *(undefined8 *)(unaff_x19 + 0x60),unaff_x20 + 0x178,lVar5);
      lVar3 = *(long *)(unaff_x19 + 0x60);
      if ((lVar3 == 0) || (*(long *)(unaff_x20 + 0x138) == 0)) goto code_r0x006ccc14;
      lVar8 = 0;
      lVar6 = *(long *)(unaff_x19 + 0x58);
      uVar10 = *(ulong *)(unaff_x20 + 0x140);
      break;
    }
    uVar12 = *(ulong *)(unaff_x21 + 0x40);
    if (unaff_x24 < uVar12) {
      uVar11 = *(ulong *)(*(long *)(unaff_x21 + 0x38) + unaff_x24 * 8);
      unaff_x26 = *(ulong *)(*(long *)(unaff_x19 + 0x58) + unaff_x24 * 8);
      bVar1 = unaff_x24 + 1 != uVar12;
      if ((!bVar1 && uVar12 <= uVar10) && (bVar1 || uVar10 != uVar12)) {
code_r0x006cc8d8:
        uVar10 = func_0x006ca314();
        if ((uVar10 & 1) != 0) goto code_r0x006ccb4c;
      }
    }
    else {
      uVar11 = 0;
      unaff_x26 = *(ulong *)(*(long *)(unaff_x19 + 0x58) + unaff_x24 * 8);
      if (unaff_x24 + 1 == uVar12 && uVar12 < uVar10) goto code_r0x006cc8d8;
    }
    unaff_x24 = unaff_x24 + 1;
    if ((*(long *)(unaff_x20 + 0xe8) != 0) && (unaff_x26 != *(ulong *)(unaff_x20 + 0xf0))) {
      uVar10 = 0;
      uVar7 = *(long *)(unaff_x20 + 0xe0) - 1;
      uVar12 = unaff_x26 >> 4 ^ unaff_x26 >> 9;
      do {
        uVar12 = uVar12 & uVar7;
        uVar9 = *(ulong *)(*(long *)(unaff_x20 + 0xd8) + uVar12 * unaff_x25);
        if (uVar9 == unaff_x26) {
          if (*(char *)(*(long *)(unaff_x20 + 0xd8) + uVar12 * unaff_x25 + 0x10) != '\0')
          goto LAB_006cc880;
          break;
        }
        uVar10 = uVar10 + 1;
        uVar12 = uVar10 + uVar12;
      } while (uVar9 != *(ulong *)(unaff_x20 + 0xf0) && uVar10 <= uVar7);
    }
    if (uVar11 == 0) {
      lVar5 = *(long *)(unaff_x20 + 0x130);
      if ((ulong)(lVar5 * 3) >> 2 <= *(ulong *)(unaff_x20 + 0x138)) {
        if ((*(ulong *)(unaff_x20 + 0x138) != 0) && (unaff_x26 != *(ulong *)(unaff_x20 + 0x140))) {
          uVar10 = 0;
          uVar12 = unaff_x26 >> 4 ^ unaff_x26 >> 9;
          do {
            uVar12 = uVar12 & lVar5 - 1U;
            uVar11 = *(ulong *)(*unaff_x22 + uVar12 * 0x20);
            if (uVar11 == unaff_x26) goto code_r0x006cc9f8;
            uVar10 = uVar10 + 1;
            uVar12 = uVar10 + uVar12;
          } while (uVar11 != *(ulong *)(unaff_x20 + 0x140) && uVar10 <= lVar5 - 1U);
        }
        func_0x006ce510();
        lVar5 = *(long *)(unaff_x20 + 0x130);
      }
code_r0x006cc9f8:
      lVar3 = *(long *)(unaff_x20 + 0x128);
      uVar10 = (unaff_x26 >> 4 ^ unaff_x26 >> 9) & lVar5 - 1U;
      uVar12 = *(ulong *)(lVar3 + uVar10 * 0x20);
      if (uVar12 != *(ulong *)(unaff_x20 + 0x140)) {
        lVar8 = 1;
        do {
          if (uVar12 == unaff_x26) goto code_r0x006cc874;
          uVar10 = uVar10 + lVar8 & lVar5 - 1U;
          uVar12 = *(ulong *)(lVar3 + uVar10 * 0x20);
          lVar8 = lVar8 + 1;
        } while (uVar12 != *(ulong *)(unaff_x20 + 0x140));
      }
      *(ulong *)(lVar3 + uVar10 * 0x20) = unaff_x26;
      *(long *)(unaff_x20 + 0x138) = *(long *)(unaff_x20 + 0x138) + 1;
code_r0x006cc874:
      lVar3 = lVar3 + uVar10 * 0x20;
      *(undefined8 *)(lVar3 + 8) = unaff_d8;
      *(undefined8 *)(lVar3 + 0x10) = 0;
    }
    else if ((*(long *)(unaff_x20 + 0x110) != 0) && (uVar11 != *(ulong *)(unaff_x20 + 0x118))) {
      uVar10 = 0;
      uVar7 = *(long *)(unaff_x20 + 0x108) - 1;
      uVar12 = uVar11 >> 4 ^ uVar11 >> 9;
      do {
        uVar12 = uVar12 & uVar7;
        uVar9 = *(ulong *)(*(long *)(unaff_x20 + 0x100) + uVar12 * 0x20);
        if (uVar9 == uVar11) {
          unaff_x23 = (ulong *)(*(long *)(unaff_x20 + 0x100) + uVar12 * 0x20 + 8);
          if (*(int *)unaff_x23 != 0) {
            param_1 = *(long *)(unaff_x20 + 0x130);
            if (*(ulong *)(unaff_x20 + 0x138) < (ulong)(param_1 * 3) >> 2) goto LAB_006ccad0;
            if ((*(ulong *)(unaff_x20 + 0x138) == 0) ||
               (in_x9 = *(ulong *)(unaff_x20 + 0x140), unaff_x26 == in_x9)) goto code_r0x006ccac4;
            in_x10 = 0;
            in_x11 = param_1 - 1;
            goto code_r0x006cca90;
          }
          break;
        }
        uVar10 = uVar10 + 1;
        uVar12 = uVar10 + uVar12;
      } while (uVar9 != *(ulong *)(unaff_x20 + 0x118) && uVar10 <= uVar7);
    }
  } while( true );
code_r0x006ccbc8:
  uVar12 = *(ulong *)(lVar6 + lVar8 * 8);
  if (uVar12 != uVar10) {
    uVar11 = 0;
    uVar9 = *(long *)(unaff_x20 + 0x130) - 1;
    uVar7 = uVar12 >> 4 ^ uVar12 >> 9;
    do {
      uVar7 = uVar7 & uVar9;
      uVar13 = *(ulong *)(*(long *)(unaff_x20 + 0x128) + uVar7 * 0x20);
      if (uVar13 == uVar12) {
        *(undefined4 *)(*(long *)(unaff_x20 + 0x128) + uVar7 * 0x20 + 8) = 0;
        break;
      }
      uVar11 = uVar11 + 1;
      uVar7 = uVar11 + uVar7;
    } while (uVar13 != uVar10 && uVar11 <= uVar9);
  }
  lVar8 = lVar8 + 1;
  if (lVar8 == lVar3) {
code_r0x006ccc14:
    func_0x006d621c(lVar5,unaff_x20 + 0xd8,unaff_x20 + 0x128,*(undefined8 *)(unaff_x20 + 0x478),
                    *(undefined1 *)(unaff_x20 + 0x480),*(undefined8 *)(unaff_x20 + 0x50),
                    *(undefined8 *)(unaff_x19 + 0x90),*(undefined8 *)(unaff_x20 + 0x470));
    return uVar2;
  }
  goto code_r0x006ccbc8;
}

