
/* WARNING: Removing unreachable block (ram,0x0062f6bc) */

void FUN_0062f63c(void)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  undefined1 in_w8;
  ulong uVar4;
  long unaff_x19;
  long *unaff_x20;
  uint uVar5;
  uint uVar6;
  int unaff_w25;
  int iVar7;
  uint unaff_w27;
  ulong uVar8;
  int unaff_w28;
  ulong in_stack_00000010;
  int in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  uint in_stack_00000038;
  ulong in_stack_00000040;
  undefined8 *in_stack_00000048;
  undefined8 *in_stack_00000050;
  
  do {
    *(undefined1 *)(unaff_x19 + 0x48) = in_w8;
    unaff_w25 = unaff_w25 + -1;
    while (unaff_w25 == 0) {
      if (unaff_w27 != 0) {
        (**(code **)(*unaff_x20 + 0x48))();
      }
      for (; unaff_w28 != 0; unaff_w28 = unaff_w28 + -1) {
        lVar3 = (**(code **)(*unaff_x20 + 0x38))();
        func_0x00677180();
        func_0x00677180();
        *(undefined1 *)(unaff_x19 + 0x48) = *(undefined1 *)(lVar3 + 0x48);
      }
      uVar5 = 0;
      uVar6 = 0;
      iVar7 = (int)in_stack_00000040;
      uVar8 = in_stack_00000040;
      do {
        uVar4 = in_stack_00000010;
        in_stack_00000018 = in_stack_00000018 + 1;
        if ((long)uVar8 < 1) {
          if (in_stack_00000048 != (undefined8 *)0x0) {
            while (in_stack_00000050 != in_stack_00000048) {
              in_stack_00000050 = in_stack_00000050 + -10;
              (**(code **)*in_stack_00000050)(in_stack_00000050);
            }
            __ZdlPv(in_stack_00000048);
          }
          return;
        }
        uVar1 = func_0x005ffe3c(in_stack_00000040,in_stack_00000028,uVar4);
        uVar2 = func_0x005ffe3c(in_stack_00000020,uVar4);
        uVar5 = uVar1 | uVar5 << 1;
        uVar6 = uVar2 | uVar6 << 1;
        in_stack_00000010 = uVar4 - 1;
      } while ((uVar4 != 0) &&
              (in_stack_00000040 = (ulong)(uVar5 << 1), uVar8 = uVar4,
              uVar5 << 1 < in_stack_00000038 && uVar6 << 1 < in_stack_00000038));
      unaff_w27 = (uint)(uVar5 != 0 || uVar6 != 0);
      if (uVar5 == 0 && uVar6 == 0) {
        uVar1 = 1;
      }
      unaff_w28 = 0;
      in_stack_00000040 = uVar4;
      if (((uVar1 | uVar2) & 1) == 0) {
        do {
          unaff_w28 = unaff_w28 + 1;
          unaff_w27 = (uint)(1 < uVar5 || 1 < uVar6);
          if (((uVar5 >> 1 & 1) != 0) || (unaff_w27 == 0)) break;
          uVar1 = uVar6 >> 1;
          uVar5 = uVar5 >> 1;
          uVar6 = uVar6 >> 1;
        } while ((uVar1 & 1) == 0);
        unaff_w25 = (iVar7 + in_stack_00000018) - unaff_w28;
      }
      else {
        unaff_w25 = iVar7 - (int)uVar4;
      }
    }
    lVar3 = (**(code **)(*unaff_x20 + 0x38))();
    func_0x00677180();
    func_0x00677180();
    in_w8 = *(undefined1 *)(lVar3 + 0x48);
  } while( true );
}

