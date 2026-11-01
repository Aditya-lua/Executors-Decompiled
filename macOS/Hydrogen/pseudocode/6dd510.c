
undefined8 FUN_006dd510(long param_1)

{
  int iVar1;
  long lVar2;
  long in_x9;
  ulong in_x10;
  long in_x11;
  ulong in_x12;
  long lVar3;
  ulong in_x13;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  ulong unaff_x19;
  long unaff_x20;
  long *plVar8;
  undefined8 uVar9;
  undefined8 uStack0000000000000008;
  
  do {
    uVar4 = in_x13 & in_x12;
    lVar6 = *(long *)(in_x11 + uVar4 * 0x10);
    if (lVar6 == param_1) {
      if (((*(int *)(in_x11 + uVar4 * 0x10 + 8) == 8) &&
          (lVar6 = *(long *)(unaff_x19 + 0x28), lVar6 != 0)) &&
         ((iVar1 = _strcmp(lVar6,"X"), iVar1 == 0 ||
          ((iVar1 = _strcmp(lVar6,"Y"), iVar1 == 0 || (iVar1 = _strcmp(lVar6,"Z"), iVar1 == 0))))))
      goto LAB_006dd5cc;
      break;
    }
    in_x10 = in_x10 + 1;
    in_x13 = in_x10 + uVar4;
  } while (lVar6 != in_x9 && in_x10 <= in_x12);
  uVar9 = *(undefined8 *)(unaff_x20 + 0x40);
  uVar4 = func_0x006deea8(uVar9);
  if (((uVar4 & 1) == 0) && (iVar1 = func_0x006deea8(uVar9), iVar1 == 0)) {
    if (((*(code **)(unaff_x20 + 0x48) != (code *)0x0) &&
        (lVar6 = *(long *)(unaff_x19 + 0x20), lVar6 != 0)) &&
       (*(int *)(lVar6 + 8) == iRam0000000000a27aa8)) {
      iVar1 = (**(code **)(unaff_x20 + 0x48))
                        (*(undefined8 *)(lVar6 + 0x20),*(undefined8 *)(unaff_x19 + 0x28));
      if (iVar1 - 1U < 0xf) {
        switch(iVar1) {
        case 1:
          lVar6 = *(long *)(unaff_x20 + 0x30);
          break;
        case 2:
          lVar6 = *(long *)(unaff_x20 + 0x30) + 0x70;
          break;
        case 3:
          lVar6 = *(long *)(unaff_x20 + 0x30) + 0xe0;
          break;
        default:
          goto LAB_006dd698;
        case 8:
          lVar6 = *(long *)(unaff_x20 + 0x30) + 0x150;
          break;
        case 0xf:
          goto LAB_006dd5d8;
        }
        uStack0000000000000008 = unaff_x19;
        plVar8 = (long *)func_0x006db828(unaff_x20 + 0xc0,&uStack0000000000000008);
        *plVar8 = lVar6;
      }
LAB_006dd698:
      plVar8 = *(long **)(unaff_x20 + 0x18);
      lVar6 = plVar8[1];
      if ((ulong)(lVar6 * 3) >> 2 <= (ulong)plVar8[2]) {
        if ((plVar8[2] != 0) && (plVar8[3] != unaff_x19)) {
          uVar4 = 0;
          uVar5 = unaff_x19 >> 4 ^ unaff_x19 >> 9;
          do {
            uVar5 = uVar5 & lVar6 - 1U;
            uVar7 = *(ulong *)(*plVar8 + uVar5 * 0x10);
            if (uVar7 == unaff_x19) goto code_r0x006dd704;
            uVar4 = uVar4 + 1;
            uVar5 = uVar4 + uVar5;
          } while (uVar7 != plVar8[3] && uVar4 <= lVar6 - 1U);
        }
        func_0x006d3810(plVar8);
        lVar6 = plVar8[1];
      }
code_r0x006dd704:
      lVar2 = *plVar8;
      uVar4 = (unaff_x19 >> 4 ^ unaff_x19 >> 9) & lVar6 - 1U;
      uVar5 = *(ulong *)(lVar2 + uVar4 * 0x10);
      if (uVar5 != plVar8[3]) {
        lVar3 = 1;
        do {
          if (uVar5 == unaff_x19) goto code_r0x006dd764;
          uVar4 = uVar4 + lVar3 & lVar6 - 1U;
          uVar5 = *(ulong *)(lVar2 + uVar4 * 0x10);
          lVar3 = lVar3 + 1;
        } while (uVar5 != plVar8[3]);
      }
      *(ulong *)(lVar2 + uVar4 * 0x10) = unaff_x19;
      plVar8[2] = plVar8[2] + 1;
code_r0x006dd764:
      *(int *)(lVar2 + uVar4 * 0x10 + 8) = iVar1;
      return 0;
    }
  }
  else {
LAB_006dd5cc:
    func_0x006de830();
  }
LAB_006dd5d8:
  return 0;
}

