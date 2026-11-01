
/* WARNING: Removing unreachable block (ram,0x0062af4c) */

void FUN_0062af7c(void)

{
  bool bVar1;
  uint uVar2;
  uint uVar3;
  ulong uVar4;
  long *unaff_x20;
  uint uVar5;
  int iVar6;
  long lVar7;
  long unaff_x23;
  long lVar8;
  int unaff_w24;
  int unaff_w25;
  long unaff_x26;
  uint uVar9;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  uint in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  
  do {
    (**(code **)(*unaff_x20 + 0x48))();
    lVar8 = unaff_x23;
    do {
      iVar6 = unaff_w24 + 1;
      while (iVar6 = iVar6 + -1, iVar6 != 0) {
        (**(code **)(*unaff_x20 + 0x38))();
        func_0x00677180();
      }
      uVar9 = 0;
      uVar5 = 0;
      lVar7 = lVar8;
      do {
        unaff_x23 = unaff_x26;
        unaff_w25 = unaff_w25 + 1;
        if (lVar7 < 1) {
          if (in_stack_00000038 != 0) {
            for (; in_stack_00000040 != in_stack_00000038;
                in_stack_00000040 = in_stack_00000040 + -0x20) {
              lVar8 = *(long *)(in_stack_00000040 + -8);
              uVar4 = *(ulong *)(in_stack_00000040 + -0x18);
              if (*(ulong *)(in_stack_00000040 + -0x10) <= *(ulong *)(in_stack_00000040 + -0x18)) {
                uVar4 = *(ulong *)(in_stack_00000040 + -0x10);
              }
              if (lVar8 != 0) {
                if (uVar4 != 0) {
                  do {
                    *(undefined8 *)(lVar8 + -8 + uVar4 * 8) = 0;
                    uVar4 = uVar4 - 1;
                  } while (uVar4 != 0);
                }
                func_0x00611644();
              }
            }
            __ZdlPv(in_stack_00000038);
          }
          return;
        }
        uVar2 = func_0x005ffe3c(in_stack_00000028,unaff_x23);
        uVar3 = func_0x005ffe3c(in_stack_00000020,unaff_x23);
        uVar9 = uVar2 | uVar9 << 1;
        uVar5 = uVar3 | uVar5 << 1;
        unaff_x26 = unaff_x23 + -1;
      } while ((unaff_x23 != 0) &&
              (lVar7 = unaff_x23, uVar9 << 1 < in_stack_00000030 && uVar5 << 1 < in_stack_00000030))
      ;
      bVar1 = uVar9 != 0 || uVar5 != 0;
      if (uVar9 == 0 && uVar5 == 0) {
        uVar2 = 1;
      }
      unaff_w24 = 0;
      if (((uVar2 | uVar3) & 1) == 0) {
        do {
          unaff_w24 = unaff_w24 + 1;
          bVar1 = 1 < uVar9 || 1 < uVar5;
          if (((uVar9 >> 1 & 1) != 0) || (1 >= uVar9 && 1 >= uVar5)) break;
          uVar2 = uVar5 >> 1;
          uVar9 = uVar9 >> 1;
          uVar5 = uVar5 >> 1;
        } while ((uVar2 & 1) == 0);
        iVar6 = ((int)lVar8 + unaff_w25) - unaff_w24;
      }
      else {
        iVar6 = (int)lVar8 - (int)unaff_x23;
      }
      iVar6 = iVar6 + 1;
      while (iVar6 = iVar6 + -1, iVar6 != 0) {
        (**(code **)(*unaff_x20 + 0x38))();
        func_0x00677180();
      }
      lVar8 = unaff_x23;
    } while (!bVar1);
  } while( true );
}

