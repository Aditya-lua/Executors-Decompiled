
ulong FUN_007144c8(long *param_1,long param_2)

{
  undefined8 uVar1;
  long lVar2;
  ulong uVar3;
  undefined8 *puVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar10;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  undefined1 uStack000000000000003f;
  undefined4 uStack0000000000000040;
  undefined4 uStack0000000000000044;
  undefined4 uStack0000000000000048;
  undefined4 uStack000000000000004c;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  
  if (param_2 == 0) {
    puVar4 = (undefined8 *)(unaff_x19 + 0x84);
  }
  else {
    puVar4 = (undefined8 *)(*param_1 + 0xc);
  }
  uVar10 = *puVar4;
  uStack0000000000000058 = unaff_x20[3];
  uStack0000000000000050 = unaff_x20[2];
  uStack0000000000000048 = (undefined4)unaff_x20[1];
  uStack000000000000004c = (undefined4)((ulong)unaff_x20[1] >> 0x20);
  uStack0000000000000040 = (undefined4)*unaff_x20;
  uStack0000000000000044 = (undefined4)((ulong)*unaff_x20 >> 0x20);
  func_0x00710d48();
  uStack000000000000003f = 0;
  uVar1 = func_0x00717a90();
  *(int *)(*(long *)(unaff_x19 + 0x1c0) + 0x4a0) =
       *(int *)(*(long *)(unaff_x19 + 0x1c0) + 0x4a0) + 1;
  lVar2 = func_0x00718a2c();
  *(int *)(*(long *)(unaff_x19 + 0x1c0) + 0x4a0) =
       *(int *)(*(long *)(unaff_x19 + 0x1c0) + 0x4a0) + -1;
  in_stack_00000030 = *(undefined8 *)(lVar2 + 0x14);
  uStack0000000000000028 = uVar10;
  uVar3 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x30);
  func_0x0070763c(uVar3,&uStack0000000000000028,uVar1,lVar2);
  if (*(char *)(unaff_x19 + 0x58) != '\0') {
    uVar1 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0xc);
    func_0x00709624(uVar1,CONCAT44(uStack0000000000000048,uStack0000000000000044));
    lVar2 = *(long *)(unaff_x19 + 0x420);
    if ((ulong)(lVar2 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
      if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar3 != *(ulong *)(unaff_x19 + 0x430))) {
        uVar6 = 0;
        uVar8 = uVar3 >> 4 ^ uVar3 >> 9;
        do {
          uVar8 = uVar8 & lVar2 - 1U;
          uVar9 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar8 * 0x10);
          if (uVar9 == uVar3) goto code_r0x00714694;
          uVar6 = uVar6 + 1;
          uVar8 = uVar6 + uVar8;
        } while (uVar9 != *(ulong *)(unaff_x19 + 0x430) && uVar6 <= lVar2 - 1U);
      }
      func_0x006db93c();
      lVar2 = *(long *)(unaff_x19 + 0x420);
    }
code_r0x00714694:
    lVar5 = *(long *)(unaff_x19 + 0x418);
    uVar6 = (uVar3 >> 4 ^ uVar3 >> 9) & lVar2 - 1U;
    uVar8 = *(ulong *)(lVar5 + uVar6 * 0x10);
    if (uVar8 != *(ulong *)(unaff_x19 + 0x430)) {
      lVar7 = 1;
      do {
        if (uVar8 == uVar3) goto code_r0x007146f4;
        uVar6 = uVar6 + lVar7 & lVar2 - 1U;
        uVar8 = *(ulong *)(lVar5 + uVar6 * 0x10);
        lVar7 = lVar7 + 1;
      } while (uVar8 != *(ulong *)(unaff_x19 + 0x430));
    }
    *(ulong *)(lVar5 + uVar6 * 0x10) = uVar3;
    *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x007146f4:
    *(undefined8 *)(lVar5 + uVar6 * 0x10 + 8) = uVar1;
  }
  return uVar3;
}

