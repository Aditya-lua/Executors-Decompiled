
ulong FUN_00715504(long param_1,undefined8 *param_2,undefined8 param_3,undefined8 param_4)

{
  long lVar1;
  undefined4 uVar2;
  long lVar3;
  ulong uVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  undefined8 uVar15;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined4 uStack0000000000000050;
  undefined4 uStack0000000000000054;
  undefined4 in_stack_00000058;
  undefined4 uStack000000000000005c;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  
  if (*(int *)(param_1 + 0x80) != 299) {
    if (*(int *)(param_1 + 0x80) == 0x119) {
      uVar15 = *(undefined8 *)(param_1 + 0x98);
      uStack0000000000000048 = *(undefined8 *)(param_1 + 0x84);
      uStack0000000000000050 = (undefined4)*(undefined8 *)(param_1 + 0x8c);
      uStack0000000000000054 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x8c) >> 0x20);
      func_0x00710d48(param_1);
      uStack0000000000000040 = uVar15;
    }
    else {
      func_0x0072415c(param_1,"type name");
      uStack0000000000000040 = *(undefined8 *)(param_1 + 0x128);
      uStack0000000000000048 = *(undefined8 *)(param_1 + 0x84);
      uStack0000000000000050 = (undefined4)*(undefined8 *)(param_1 + 0x8c);
      uStack0000000000000054 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x8c) >> 0x20);
    }
    in_stack_00000058 = CONCAT31(in_stack_00000058._1_3_,1);
    uStack0000000000000038 = 0;
    uStack0000000000000028 = 0;
    uStack0000000000000030 = 0;
    uStack0000000000000020 = 0;
    if (*(char *)(param_1 + 0x58) == '\0') {
      puVar6 = (undefined8 *)0x0;
      puVar7 = (undefined8 *)0x0;
      puVar8 = (undefined8 *)0x0;
    }
    else {
      puVar6 = &uStack0000000000000038;
      puVar7 = &uStack0000000000000028;
      puVar8 = &uStack0000000000000020;
    }
    func_0x00719504(param_1,1,puVar6,puVar7,puVar8);
    uVar15 = *(undefined8 *)(param_1 + 0x84);
    if (*(int *)(param_1 + 0x80) == 0x3d) {
      func_0x00710d48(param_1);
    }
    else {
      func_0x0072447c(param_1,0x3d,"type alias");
    }
    uVar5 = 0;
    uVar2 = *(undefined4 *)(param_1 + 0x114);
    in_stack_00000068 = *(undefined8 *)(param_1 + 0x8c);
    uStack0000000000000060 = *(undefined8 *)(param_1 + 0x84);
    if ((*(int *)(param_1 + 0x80) != 0x26) && (*(int *)(param_1 + 0x80) != 0x7c)) {
      uVar5 = func_0x0071f5c8(param_1,0,0);
      *(undefined4 *)(param_1 + 0x114) = uVar2;
    }
    lVar9 = func_0x0071cf0c(param_1,uVar5,&uStack0000000000000060);
    *(undefined4 *)(param_1 + 0x114) = uVar2;
    uStack0000000000000060 = *param_2;
    in_stack_00000068 = *(undefined8 *)(lVar9 + 0x14);
    uVar4 = func_0x00704c24(*(undefined8 *)(param_1 + 0xd8),0x68);
    func_0x00707768(uVar4,&uStack0000000000000060,&uStack0000000000000040,&uStack0000000000000048);
    if (*(char *)(param_1 + 0x58) != '\0') {
      uVar5 = func_0x00704c24(*(undefined8 *)(param_1 + 0xd8),0x38);
      func_0x00709684(uVar5,param_4,uStack0000000000000038,uStack0000000000000028,
                      uStack0000000000000030,uStack0000000000000020,uVar15);
      lVar9 = *(long *)(param_1 + 0x420);
      if ((ulong)(lVar9 * 3) >> 2 <= *(ulong *)(param_1 + 0x428)) {
        if ((*(ulong *)(param_1 + 0x428) != 0) && (uVar4 != *(ulong *)(param_1 + 0x430))) {
          uVar11 = 0;
          uVar13 = uVar4 >> 4 ^ uVar4 >> 9;
          do {
            uVar13 = uVar13 & lVar9 - 1U;
            uVar14 = *(ulong *)(*(long *)(param_1 + 0x418) + uVar13 * 0x10);
            if (uVar14 == uVar4) goto code_r0x00715760;
            uVar11 = uVar11 + 1;
            uVar13 = uVar11 + uVar13;
          } while (uVar14 != *(ulong *)(param_1 + 0x430) && uVar11 <= lVar9 - 1U);
        }
        func_0x006db93c();
        lVar9 = *(long *)(param_1 + 0x420);
      }
code_r0x00715760:
      lVar10 = *(long *)(param_1 + 0x418);
      uVar11 = (uVar4 >> 4 ^ uVar4 >> 9) & lVar9 - 1U;
      uVar13 = *(ulong *)(lVar10 + uVar11 * 0x10);
      if (uVar13 != *(ulong *)(param_1 + 0x430)) {
        lVar12 = 1;
        do {
          if (uVar13 == uVar4) goto LAB_007157c0;
          uVar11 = uVar11 + lVar12 & lVar9 - 1U;
          uVar13 = *(ulong *)(lVar10 + uVar11 * 0x10);
          lVar12 = lVar12 + 1;
        } while (uVar13 != *(ulong *)(param_1 + 0x430));
      }
      *(ulong *)(lVar10 + uVar11 * 0x10) = uVar4;
      *(long *)(param_1 + 0x428) = *(long *)(param_1 + 0x428) + 1;
LAB_007157c0:
      *(undefined8 *)(lVar10 + uVar11 * 0x10 + 8) = uVar5;
    }
    return uVar4;
  }
  in_stack_00000068 = *(undefined8 *)(param_1 + 0x98);
  uStack0000000000000060 = *(undefined8 *)(param_1 + 0x90);
  in_stack_00000058 = (undefined4)*(undefined8 *)(param_1 + 0x88);
  uStack000000000000005c = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x88) >> 0x20);
  uStack0000000000000050 = (undefined4)*(undefined8 *)(param_1 + 0x80);
  uStack0000000000000054 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x80) >> 0x20);
  func_0x00710d48();
  lVar9 = *(long *)(param_1 + 0x1a8);
  lVar10 = *(long *)(param_1 + 0x1b0);
  if (*(int *)(param_1 + 0x80) == 0x119) {
    uVar15 = *(undefined8 *)(param_1 + 0x98);
    uStack0000000000000040 = *(undefined8 *)(param_1 + 0x8c);
    uStack0000000000000038 = *(undefined8 *)(param_1 + 0x84);
    func_0x00710d48(param_1);
    uStack0000000000000030 = uVar15;
  }
  else {
    func_0x0072415c(param_1,"type function name");
    uStack0000000000000030 = *(undefined8 *)(param_1 + 0x128);
    uStack0000000000000040 = *(undefined8 *)(param_1 + 0x8c);
    uStack0000000000000038 = *(undefined8 *)(param_1 + 0x84);
  }
  uStack0000000000000048 = CONCAT71(uStack0000000000000048._1_7_,1);
  *(int *)(*(long *)(param_1 + 0x1c0) + 0x4a0) = *(int *)(*(long *)(param_1 + 0x1c0) + 0x4a0) + 1;
  uVar15 = *(undefined8 *)(param_1 + 0x160);
  *(long *)(param_1 + 0x160) = *(long *)(param_1 + 0x150) - *(long *)(param_1 + 0x148) >> 3;
  uStack0000000000000020 = 0;
  uStack0000000000000028 = 0;
  lVar3 = func_0x00718a2c(param_1,0,&uStack0000000000000050,&uStack0000000000000030,0,
                          &uStack0000000000000020);
  *(undefined8 *)(param_1 + 0x160) = uVar15;
  *(int *)(*(long *)(param_1 + 0x1c0) + 0x4a0) = *(int *)(*(long *)(param_1 + 0x1c0) + 0x4a0) + -1;
  lVar12 = *(long *)(param_1 + 0x1a8);
  lVar1 = *(long *)(param_1 + 0x1b0);
  uStack0000000000000020 = *param_2;
  uStack0000000000000028 = *(undefined8 *)(lVar3 + 0x14);
  uVar4 = func_0x00704c24(*(undefined8 *)(param_1 + 0xd8),0x48);
  func_0x0070787c(uVar4,&uStack0000000000000020,&uStack0000000000000030,&uStack0000000000000038,
                  lVar3,param_3,
                  (ulong)((lVar10 - lVar9 >> 4) * -0x5555555555555555) <
                  (ulong)((lVar1 - lVar12 >> 4) * -0x5555555555555555));
  if (*(char *)(param_1 + 0x58) != '\0') {
    uVar15 = func_0x00704c24(*(undefined8 *)(param_1 + 0xd8),0x14);
    func_0x007096a4(uVar15,param_4,CONCAT44(in_stack_00000058,uStack0000000000000054));
    lVar9 = *(long *)(param_1 + 0x420);
    if ((ulong)(lVar9 * 3) >> 2 <= *(ulong *)(param_1 + 0x428)) {
      if ((*(ulong *)(param_1 + 0x428) != 0) && (uVar4 != *(ulong *)(param_1 + 0x430))) {
        uVar11 = 0;
        uVar13 = uVar4 >> 4 ^ uVar4 >> 9;
        do {
          uVar13 = uVar13 & lVar9 - 1U;
          uVar14 = *(ulong *)(*(long *)(param_1 + 0x418) + uVar13 * 0x10);
          if (uVar14 == uVar4) goto code_r0x00719408;
          uVar11 = uVar11 + 1;
          uVar13 = uVar11 + uVar13;
        } while (uVar14 != *(ulong *)(param_1 + 0x430) && uVar11 <= lVar9 - 1U);
      }
      func_0x006db93c();
      lVar9 = *(long *)(param_1 + 0x420);
    }
code_r0x00719408:
    lVar10 = *(long *)(param_1 + 0x418);
    uVar11 = (uVar4 >> 4 ^ uVar4 >> 9) & lVar9 - 1U;
    uVar13 = *(ulong *)(lVar10 + uVar11 * 0x10);
    if (uVar13 != *(ulong *)(param_1 + 0x430)) {
      lVar12 = 1;
      do {
        if (uVar13 == uVar4) goto code_r0x00719468;
        uVar11 = uVar11 + lVar12 & lVar9 - 1U;
        uVar13 = *(ulong *)(lVar10 + uVar11 * 0x10);
        lVar12 = lVar12 + 1;
      } while (uVar13 != *(ulong *)(param_1 + 0x430));
    }
    *(ulong *)(lVar10 + uVar11 * 0x10) = uVar4;
    *(long *)(param_1 + 0x428) = *(long *)(param_1 + 0x428) + 1;
code_r0x00719468:
    *(undefined8 *)(lVar10 + uVar11 * 0x10 + 8) = uVar15;
  }
  return uVar4;
}

