
void FUN_0026ea80(long *param_1,undefined8 *param_2,long param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 *param_6,long *param_7,undefined8 param_8,
                 undefined8 param_9,long param_10,long param_11,undefined8 param_12,
                 undefined8 param_13,long param_14,long param_15,long param_16,long param_17)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  int iVar9;
  long lVar10;
  bool bVar11;
  undefined8 *puVar12;
  undefined1 auVar13 [16];
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  long in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  undefined8 uStack0000000000000090;
  undefined8 in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined1 in_stack_000000a8;
  
  if (*param_7 == 0) {
    lVar10 = -0x7fffffffffffffe9;
  }
  else {
    *param_7 = *param_7 + -1;
    if (param_3 != 0) {
      bVar11 = false;
      uVar2 = param_6[2];
      lVar10 = param_6[3];
      uStack0000000000000040 = 0x800000000000001c;
      puVar1 = param_2 + param_3 * 2;
      uStack0000000000000048 = param_4;
      uStack0000000000000050 = param_5;
      do {
        while( true ) {
          while( true ) {
            puVar12 = param_2 + 2;
            uVar3 = *param_2;
            lVar4 = param_2[1];
            auVar13 = (**(code **)(lVar4 + 0x30))(uVar3);
            param_2 = puVar12;
            if ((auVar13._8_8_ == lVar10) &&
               (iVar9 = _memcmp(auVar13._0_8_,uVar2,lVar10), iVar9 == 0)) break;
            if (puVar12 == puVar1) {
              if (!bVar11) goto LAB_0026ebe4;
              goto code_r0x0026ebdc;
            }
          }
          uStack0000000000000090 = uStack0000000000000048;
          in_stack_00000098 = uStack0000000000000050;
          in_stack_000000a8 = 0x11;
          uStack00000000000000a0 = uStack0000000000000040;
          func_0x0025dfe8(&uStack0000000000000058,&uStack0000000000000090,&uStack00000000000000a0);
          lVar8 = in_stack_00000078;
          lVar7 = in_stack_00000070;
          lVar6 = in_stack_00000068;
          lVar5 = in_stack_00000060;
          if (uStack0000000000000058 != -0x7fffffffffffffd4) break;
          auVar13 = (**(code **)(lVar4 + 0x28))(uVar3);
          if ((auVar13._8_8_ == lVar6) && (iVar9 = _memcmp(auVar13._0_8_,lVar5,lVar6), iVar9 == 0))
          {
            iVar9 = (**(code **)(lVar4 + 0x20))
                              (uVar3,lVar7,lVar8,*param_6,param_6[1],param_6[4],param_6[5]);
            uStack0000000000000058 = -0x7ffffffffffffff1;
            if (iVar9 == 0) {
              uStack0000000000000058 = -0x7fffffffffffffd4;
            }
code_r0x0026ec54:
            *param_1 = uStack0000000000000058;
            param_1[1] = param_17;
            param_1[2] = param_16;
            param_1[3] = param_14;
            param_1[4] = param_15;
            param_1[5] = param_11;
            param_1[6] = param_10;
            return;
          }
          bVar11 = true;
          if (puVar12 == puVar1) goto code_r0x0026ebdc;
        }
        if (uStack0000000000000058 != -0x7fffffffffffffd5) {
          param_11 = in_stack_00000080;
          param_17 = in_stack_00000060;
          param_10 = in_stack_00000088;
          param_15 = in_stack_00000078;
          param_14 = in_stack_00000070;
          param_16 = in_stack_00000068;
          goto code_r0x0026ec54;
        }
        param_10 = in_stack_00000088;
        param_11 = in_stack_00000080;
        bVar11 = true;
        param_16 = in_stack_00000068;
        param_17 = in_stack_00000060;
        param_14 = in_stack_00000070;
        param_15 = in_stack_00000078;
      } while (puVar12 != puVar1);
code_r0x0026ebdc:
      *param_1 = -0x7fffffffffffffd5;
      return;
    }
LAB_0026ebe4:
    lVar10 = -0x7fffffffffffffd7;
  }
  *param_1 = lVar10;
  return;
}

