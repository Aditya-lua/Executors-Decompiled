
undefined8 FUN_00413c6c(long param_1)

{
  ulong uVar1;
  undefined8 uVar2;
  long lVar3;
  long in_x9;
  undefined8 unaff_x19;
  undefined8 *puVar4;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  uint *unaff_x22;
  uint *puVar5;
  undefined8 *puVar6;
  undefined8 *unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  undefined8 *unaff_x28;
  long unaff_x29;
  undefined8 uVar7;
  undefined8 uVar8;
  uint *in_stack_00000000;
  undefined8 uStack0000000000000020;
  undefined8 *in_stack_00000028;
  undefined8 uStack0000000000000070;
  undefined1 uStack0000000000000080;
  undefined8 uStack00000000000000c0;
  undefined8 uStack00000000000000c8;
  undefined8 uStack00000000000000d0;
  undefined8 uStack0000000000000100;
  
code_r0x00413c6c:
  uVar2 = *(undefined8 *)(in_x9 + 0x28);
  unaff_x23[5] = *(undefined8 *)(in_x9 + 0x30);
  unaff_x23[4] = uVar2;
  uStack0000000000000100 = *(undefined8 *)(in_x9 + 0x38);
code_r0x00413c7c:
  uVar2 = *unaff_x23;
  uVar8 = unaff_x23[3];
  uVar7 = unaff_x23[2];
  *(undefined8 *)(unaff_x26 + 0x10) = unaff_x23[1];
  *(undefined8 *)(unaff_x26 + 8) = uVar2;
  *(undefined8 *)(unaff_x26 + 0x20) = uVar8;
  *(undefined8 *)(unaff_x26 + 0x18) = uVar7;
  uVar2 = unaff_x23[4];
  *(undefined8 *)(unaff_x26 + 0x30) = unaff_x23[5];
  *(undefined8 *)(unaff_x26 + 0x28) = uVar2;
  *(undefined8 *)(unaff_x26 + 0x38) = uStack0000000000000100;
  lVar3 = unaff_x28[-5];
  _uStack0000000000000080 = param_1;
  uStack00000000000000c0 = unaff_x20;
  uStack00000000000000c8 = unaff_x21;
  do {
    if (lVar3 != 2) {
      uVar2 = unaff_x28[-2];
      *(undefined8 *)(unaff_x29 + -0x98) = unaff_x28[-3];
      *(undefined8 *)(unaff_x29 + -0x90) = uVar2;
    }
    *(long *)(unaff_x29 + -0xa0) = lVar3;
    uVar1 = func_0x0042df10(&uStack0000000000000070,unaff_x19,&uStack0000000000000080,
                            unaff_x29 + -0xa0,*(undefined4 *)(unaff_x28 + 2),
                            *(undefined4 *)((long)unaff_x28 + 0x14),*(undefined4 *)(unaff_x28 + 3),
                            *(undefined4 *)((long)unaff_x28 + 0x1c));
    *(long *)(uStack0000000000000070 + 0x18) = *(long *)(uStack0000000000000070 + 0x18) + 1;
    if ((uVar1 & 1) != 0) {
code_r0x00413d38:
      if (uStack0000000000000020 == -0x8000000000000000) {
        if (((ulong)in_stack_00000028 & 3) != 1) {
          return 1;
        }
        puVar4 = (undefined8 *)((long)in_stack_00000028 + -1);
        uVar2 = *puVar4;
        puVar6 = *(undefined8 **)((long)in_stack_00000028 + 7);
        if ((code *)*puVar6 != (code *)0x0) {
          (*(code *)*puVar6)(uVar2);
        }
        if (puVar6[1] != 0) {
          func_0x00187bd4(uVar2,puVar6[1],puVar6[2]);
        }
        uVar2 = 8;
        lVar3 = 0x18;
      }
      else {
        if (uStack0000000000000020 == 0) {
          return 1;
        }
        uVar2 = 1;
        puVar4 = in_stack_00000028;
        lVar3 = uStack0000000000000020;
      }
      func_0x00187bd4(puVar4,lVar3,uVar2);
      return 1;
    }
    unaff_x28 = unaff_x28 + 9;
    unaff_x25 = unaff_x25 + -0x48;
    puVar5 = unaff_x22;
    if (unaff_x25 == 0) {
      while( true ) {
        unaff_x22 = puVar5 + 0xe;
        if (unaff_x22 == in_stack_00000000) {
          if (uStack0000000000000020 == -0x8000000000000000) {
            func_0x003f67e4((ulong)&uStack0000000000000020 | 8);
          }
          else if (uStack0000000000000020 != 0) {
            func_0x00187bd4(in_stack_00000028,uStack0000000000000020,1);
          }
          return 0;
        }
        if (*(long *)(puVar5 + 0x1a) != 0) break;
        uVar2 = *(undefined8 *)(puVar5 + 0x10);
        uStack00000000000000d0 = unaff_x27;
        if ((*unaff_x22 & 1) == 0) {
          uVar2 = __Unwind_GetIP(uVar2);
        }
        _uStack0000000000000080 = 3;
        *(undefined8 *)(unaff_x29 + -0xa0) = 2;
        uVar1 = func_0x0042df10(&uStack00000000000000d0,uVar2,&uStack0000000000000080,
                                unaff_x29 + -0xa0,0);
        *(long *)(uStack00000000000000d0 + 0x18) = *(long *)(uStack00000000000000d0 + 0x18) + 1;
        puVar5 = unaff_x22;
        if ((uVar1 & 1) != 0) goto code_r0x00413d38;
      }
      unaff_x25 = *(long *)(puVar5 + 0x1a) * 0x48;
      unaff_x28 = (undefined8 *)(*(long *)(puVar5 + 0x18) + 0x28);
    }
    unaff_x19 = *(undefined8 *)(unaff_x22 + 2);
    uStack0000000000000070 = unaff_x27;
    if ((*unaff_x22 & 1) == 0) {
      unaff_x19 = __Unwind_GetIP(unaff_x19);
    }
    if (unaff_x28[-1] != unaff_x24) break;
    _uStack0000000000000080 = 3;
    lVar3 = unaff_x28[-5];
  } while( true );
  unaff_x20 = *unaff_x28;
  unaff_x21 = unaff_x28[1];
  func_0x0046b8d0(unaff_x29 + -0xa0,unaff_x20,unaff_x21);
  if ((*(uint *)(unaff_x29 + -0xa0) & 1) != 0) {
    param_1 = 2;
    goto code_r0x00413c7c;
  }
  func_0x004581a8(unaff_x29 + -0xa0,*(undefined8 *)(unaff_x29 + -0x98),
                  *(undefined8 *)(unaff_x29 + -0x90));
  param_1 = *(long *)(unaff_x29 + -0xa0);
  if (param_1 != 2) goto code_r0x00413c5c;
  goto code_r0x00413c7c;
code_r0x00413c5c:
  in_x9 = unaff_x29 + -0xa0;
  uVar2 = *(undefined8 *)(unaff_x29 + -0x98);
  uVar8 = *(undefined8 *)(unaff_x29 + -0x80);
  uVar7 = *(undefined8 *)(unaff_x29 + -0x88);
  unaff_x23[1] = *(undefined8 *)(unaff_x29 + -0x90);
  *unaff_x23 = uVar2;
  unaff_x23[3] = uVar8;
  unaff_x23[2] = uVar7;
  goto code_r0x00413c6c;
}

