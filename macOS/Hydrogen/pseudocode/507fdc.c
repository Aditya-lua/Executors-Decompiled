
undefined8 FUN_00507fdc(ulong *param_1,ulong *param_2,undefined8 param_3)

{
  char cVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ushort uVar6;
  int iVar7;
  undefined8 uVar8;
  ulong uVar9;
  ulong *puVar10;
  long lVar11;
  ulong uVar12;
  ulong uVar13;
  ulong *unaff_x25;
  ulong *puVar14;
  ulong uVar15;
  undefined8 uStack0000000000000020;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  ulong *in_stack_00000040;
  ulong in_stack_00000048;
  undefined8 in_stack_00000050;
  ulong *in_stack_00000058;
  undefined1 uStack0000000000000060;
  
  uVar12 = *param_1;
  if (uVar12 != 0) {
    uVar15 = param_1[1];
    uVar13 = *param_2;
    uVar3 = param_2[2];
    uVar4 = param_2[3];
    do {
      uVar6 = *(ushort *)(uVar12 + 0x1c2);
      puVar10 = (ulong *)(uVar12 + 0x18);
      lVar11 = (long)(ulong)uVar6 << 5;
      puVar14 = (ulong *)0xffffffffffffffff;
      do {
        if (lVar11 == 0) {
          puVar14 = (ulong *)(ulong)uVar6;
          goto LAB_00508078;
        }
        uVar9 = puVar10[-3];
        cVar1 = uVar9 < uVar13;
        if (uVar13 < uVar9) {
          cVar1 = -1;
        }
        if (uVar13 == uVar9) {
          uVar5 = *puVar10;
          uVar9 = uVar4;
          if (uVar5 <= uVar4) {
            uVar9 = uVar5;
          }
          iVar7 = _memcmp(uVar3,puVar10[-1],uVar9);
          lVar2 = uVar4 - uVar5;
          if (iVar7 != 0) {
            lVar2 = (long)iVar7;
          }
          cVar1 = 0 < lVar2;
          if (lVar2 < 0) {
            cVar1 = -1;
          }
        }
        puVar10 = puVar10 + 4;
        lVar11 = lVar11 + -0x20;
        puVar14 = (ulong *)((long)puVar14 + 1);
      } while (cVar1 == '\x01');
      if (cVar1 == '\0') {
        if (param_2[1] != 0) {
          func_0x00187bd4(uVar3,param_2[1],1);
        }
        goto LAB_005080c8;
      }
LAB_00508078:
      if (uVar15 == 0) goto LAB_005080d8;
      uVar12 = *(ulong *)(uVar12 + (long)puVar14 * 8 + 0x1c8);
      uVar15 = uVar15 - 1;
    } while( true );
  }
  in_stack_00000028 = param_2[1];
  in_stack_00000048 = uVar12;
  uStack0000000000000020 = *param_2;
  uVar12 = param_2[2];
  in_stack_00000058 = unaff_x25;
joined_r0x005080c0:
  if (in_stack_00000028 == 0x8000000000000000) {
    puVar14 = param_1;
LAB_005080c8:
    lVar11 = uVar12 + (long)puVar14 * 8;
    uVar8 = *(undefined8 *)(lVar11 + 0x168);
    *(undefined8 *)(lVar11 + 0x168) = param_3;
  }
  else {
    in_stack_00000038 = param_2[3];
    in_stack_00000050 = 0;
    in_stack_00000030 = uVar12;
    in_stack_00000040 = param_1;
    func_0x00513e80(&uStack0000000000000060,&uStack0000000000000020,param_3);
    uVar8 = 0;
  }
  return uVar8;
LAB_005080d8:
  in_stack_00000028 = param_2[1];
  in_stack_00000048 = uVar12;
  uStack0000000000000020 = uVar13;
  uVar12 = uVar3;
  in_stack_00000058 = puVar14;
  goto joined_r0x005080c0;
}

