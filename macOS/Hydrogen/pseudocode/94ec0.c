
undefined8 FUN_00094ec0(ulong param_1)

{
  uint uVar1;
  uint uVar2;
  byte bVar3;
  long in_x9;
  long lVar4;
  long *plVar5;
  long lVar6;
  long unaff_x19;
  uint uVar7;
  ulong unaff_x22;
  long *unaff_x23;
  
  do {
    if (in_x9 != 0) {
      lVar4 = *(long *)(unaff_x19 + 0x10);
      plVar5 = (long *)(unaff_x23[1] + 8);
      do {
        while (lVar6 = *plVar5, (int)plVar5[-1] == 0) {
          plVar5 = plVar5 + 2;
          *(uint *)(lVar4 + lVar6) =
               *(uint *)(lVar4 + lVar6) & 0xff000000 |
               *(uint *)(lVar4 + lVar6) & 0x1f |
               ((uint)((int)param_1 - (int)lVar6) >> 2 & 0x7ffff) << 5;
          in_x9 = in_x9 + -1;
          if (in_x9 == 0) goto LAB_00094f14;
        }
        plVar5 = plVar5 + 2;
        *(undefined4 *)(lVar4 + lVar6) = 0;
        in_x9 = in_x9 + -1;
      } while (in_x9 != 0);
    }
LAB_00094f14:
    do {
      bVar3 = *(byte *)(unaff_x23 + 4);
      if (bVar3 == 0) {
        return 0x11;
      }
      uVar2 = *(uint *)(unaff_x19 + 0x18);
      uVar7 = *(uint *)(unaff_x19 + 0x1c);
      uVar1 = uVar2 + bVar3;
      if (uVar7 < uVar1) {
        do {
          uVar7 = uVar7 << 1;
        } while (uVar7 < uVar1);
        lVar4 = _realloc(*(undefined8 *)(unaff_x19 + 0x10),uVar7);
        *(long *)(unaff_x19 + 0x10) = lVar4;
        if (lVar4 == 0) {
          *(undefined4 *)(unaff_x19 + 0x18) = 0;
          return 0x100;
        }
        *(uint *)(unaff_x19 + 0x1c) = uVar7;
        uVar2 = *(uint *)(unaff_x19 + 0x18);
      }
      else {
        lVar4 = *(long *)(unaff_x19 + 0x10);
      }
      _memcpy(lVar4 + (ulong)uVar2,unaff_x23 + 3,bVar3);
      *(uint *)(unaff_x19 + 0x18) = *(int *)(unaff_x19 + 0x18) + (uint)bVar3;
      unaff_x22 = unaff_x22 + 1;
      if (*(ulong *)(unaff_x19 + 0x28) <= unaff_x22) {
        return 0;
      }
      unaff_x23 = *(long **)(*(long *)(unaff_x19 + 0x20) + unaff_x22 * 8);
    } while (unaff_x23 == (long *)0x0);
    param_1 = (ulong)*(uint *)(unaff_x19 + 0x18);
    unaff_x23[2] = param_1;
    in_x9 = *unaff_x23;
  } while( true );
}

