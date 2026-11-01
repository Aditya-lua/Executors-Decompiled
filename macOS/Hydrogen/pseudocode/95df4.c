
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_00095df4(void)

{
  uint uVar1;
  undefined4 uVar2;
  int iVar3;
  long lVar4;
  ulong uVar5;
  undefined8 *unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  uint *unaff_x23;
  long lVar6;
  long unaff_x25;
  undefined8 uVar7;
  long unaff_x28;
  undefined8 unaff_d9;
  long in_stack_00000000;
  uint in_stack_00000018;
  undefined8 uStack0000000000000040;
  undefined4 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined4 in_stack_00000058;
  undefined8 in_stack_00000060;
  
  do {
    uVar7 = 0x14;
LAB_00095d78:
    unaff_x23 = unaff_x23 + 1;
    uVar5 = (long)unaff_x23 - *(long *)(unaff_x25 + 0x10);
    if ((*(ulong *)(unaff_x25 + 0x18) <= uVar5) || ((int)uVar7 != 0)) {
      if ((int)uVar7 == 0) {
        *(ulong *)(unaff_x25 + 0x18) = uVar5;
        uVar7 = func_0x000956ac();
        if (((int)uVar7 != 0) || (uVar7 = func_0x00094e4c(), (int)uVar7 != 0))
        goto code_r0x00095e80;
        uStack0000000000000040._0_4_ = 0;
        uStack0000000000000040._4_4_ = 0;
        if (in_stack_00000000 == 0) {
          uVar7 = func_0x000963a4(&uStack0000000000000040,0xa33a08,in_stack_00000018);
          if ((int)uVar7 == 0) {
            in_stack_00000000 =
                 *(long *)CONCAT44(uStack0000000000000040._4_4_,(uint)uStack0000000000000040);
            uVar7 = func_0x00096190();
            if ((int)uVar7 == 0) goto code_r0x00095ee8;
          }
code_r0x00095f9c:
          func_0x000957d0();
        }
        else {
          uVar7 = func_0x00096190();
          if ((int)uVar7 != 0) goto code_r0x00095f9c;
code_r0x00095ee8:
          *(long *)(unaff_x25 + 0x20) = in_stack_00000000;
          *(ulong *)(unaff_x25 + 0x28) = (ulong)in_stack_00000018;
          func_0x000957d0();
          lVar6 = *unaff_x20;
          uVar7 = unaff_x22;
          if (*(long *)(lVar6 + 0x28) != 0) {
            uVar7 = *(undefined8 *)(lVar6 + 8);
            uVar2 = *(undefined4 *)(lVar6 + 0x18);
            lVar4 = _malloc(uVar2);
            *(long *)(lVar6 + 0x38) = lVar4;
            if (lVar4 == 0) {
              uVar7 = 0x100;
            }
            else {
              _memcpy(lVar4,uVar7,uVar2);
              uVar7 = func_0x00096190();
              if ((int)uVar7 == 0) goto code_r0x00095eb0;
              if (*(long *)(*unaff_x20 + 0x38) != 0) {
                _free();
              }
            }
          }
        }
      }
      else {
code_r0x00095e80:
        func_0x000957d0();
      }
      if ((*(long *)unaff_x20[1] == 0) || (_free(*(long *)unaff_x20[1]), unaff_x20[1] != 0)) {
        _free();
      }
      if ((int)uVar7 != 0) {
        _free();
        if (*(long *)(unaff_x28 + 0x10) == unaff_x28) {
          return uVar7;
        }
        func_0x00095fb8();
        return uVar7;
      }
code_r0x00095eb0:
      *(long **)(unaff_x21 + 0x30) = unaff_x20;
      if (unaff_x19 != (undefined8 *)0x0) {
        *unaff_x19 = *(undefined8 *)(unaff_x21 + 0x20);
      }
      return 0;
    }
    uVar1 = *unaff_x23;
    if ((uVar1 & 0x7c000000) == 0x14000000) break;
    if ((uVar1 & 0x3b000000) != 0x18000000) {
      if (((uVar1 & 0x9f000000) == 0x90000000) || ((uVar1 & 0x9f000000) == 0x10000000)) {
        uStack0000000000000040._0_4_ = uVar1 & 0x1f;
        uStack0000000000000040._4_4_ = (undefined4)unaff_d9;
        in_stack_00000048 = (undefined4)((ulong)unaff_d9 >> 0x20);
        uRam0000000000a334b8 = uVar1;
        uVar7 = func_0x00095298();
      }
      else if (uVar1 >> 0x19 == 0x2a) {
        uStack0000000000000040._0_4_ = 0;
        uStack0000000000000040._4_4_ = 0;
        uVar7 = func_0x00094d24(&uStack0000000000000040);
        iVar3 = (int)uVar7;
joined_r0x00095e2c:
        if ((iVar3 == 0) && (uVar7 = func_0x00094fac(), (int)uVar7 == 0)) {
          uVar7 = func_0x00095564();
          iVar3 = (int)uVar7;
          goto joined_r0x00095ba0;
        }
      }
      else {
        if ((uVar1 & 0x7e000000) != 0x36000000) {
          if ((uVar1 & 0x7e000000) == 0x34000000) {
            uStack0000000000000040._0_4_ = 0;
            uStack0000000000000040._4_4_ = 0;
            if (uVar1 != 0) {
              uVar7 = func_0x00094d24(&uStack0000000000000040);
              iVar3 = (int)uVar7;
              goto joined_r0x00095e2c;
            }
            goto code_r0x00095e4c;
          }
          goto code_r0x00095bc0;
        }
        uStack0000000000000040._0_4_ = 0;
        uStack0000000000000040._4_4_ = 0;
        if (uVar1 != 0) {
          uVar7 = func_0x00094d24(&uStack0000000000000040);
          iVar3 = (int)uVar7;
          goto joined_r0x00095e2c;
        }
code_r0x00095e4c:
        uStack0000000000000040._4_4_ = 0;
        uStack0000000000000040._0_4_ = 0;
        uVar7 = 0x11;
      }
      goto LAB_00095d78;
    }
    uVar7 = func_0x00095298();
    if ((int)uVar7 != 0) goto LAB_00095d78;
    if ((uVar1 >> 0x1e == 0) || (uVar1 >> 0x1e == 1)) {
      uStack0000000000000040._0_4_ = 0x11;
      uStack0000000000000040._4_4_ = 0x40;
      in_stack_00000048 = 1;
      in_stack_00000050 = 0;
      in_stack_00000058 = 0;
      in_stack_00000060._4_4_ = uVar1 & 0x1f;
      uVar7 = func_0x00095050();
      goto LAB_00095d78;
    }
  } while( true );
  uStack0000000000000040._0_4_ = 0;
  uStack0000000000000040._4_4_ = 0;
  uVar7 = func_0x00094d24(&uStack0000000000000040);
  if ((int)uVar7 == 0) {
    uVar7 = func_0x00095564();
    iVar3 = (int)uVar7;
joined_r0x00095ba0:
    if (iVar3 == 0) {
code_r0x00095bc0:
      uVar7 = func_0x00094fac();
    }
  }
  goto LAB_00095d78;
}

