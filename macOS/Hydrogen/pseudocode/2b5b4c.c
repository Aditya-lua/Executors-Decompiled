
long FUN_002b5b4c(long *param_1,ulong *param_2,ulong *param_3)

{
  uint uVar1;
  long *plVar2;
  int iVar3;
  bool in_CY;
  long lVar4;
  long *plVar5;
  undefined8 *puVar6;
  ulong *puVar7;
  ulong *puVar8;
  uint uVar9;
  byte *pbVar10;
  ulong *puVar11;
  ulong uVar12;
  byte *pbVar13;
  long *plVar14;
  byte *pbVar15;
  ulong uVar16;
  undefined8 *puVar17;
  long *plVar18;
  ulong uVar19;
  ulong *unaff_x22;
  long lVar20;
  undefined1 auVar21 [16];
  undefined1 uStack0000000000000008;
  long in_stack_00000018;
  
  puVar7 = param_3;
  if (in_CY) {
LAB_002b5c8c:
    func_0x0079e408();
  }
  else {
    uVar9 = *(uint *)(param_1 + 0x19);
    puVar8 = param_3;
    if (uVar9 == 0) {
LAB_002b5bfc:
      for (; unaff_x22 < param_3; param_3 = (ulong *)((long)param_3 - (long)unaff_x22)) {
        if (*param_1 == 0) goto LAB_002b5c50;
        puVar8 = param_2;
        lVar4 = (**(code **)(*param_1 + 0x28))(param_1,&uStack0000000000000008);
        if ((int)lVar4 == 0) goto LAB_002b5c20;
        param_2 = (ulong *)((long)param_2 + (long)unaff_x22);
      }
      if (param_3 != (ulong *)0x0) {
        puVar8 = param_3;
        _memcpy(param_1 + 0x17,param_2);
      }
      *(int *)(param_1 + 0x19) = (int)param_3;
      puVar7 = puVar8;
LAB_002b5c1c:
      puVar8 = puVar7;
      lVar4 = 1;
LAB_002b5c20:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000018) {
        return lVar4;
      }
LAB_002b5c88:
      ___stack_chk_fail(lVar4);
      puVar7 = puVar8;
      goto LAB_002b5c8c;
    }
    puVar11 = (ulong *)((long)unaff_x22 - (ulong)uVar9);
    if (param_3 <= puVar11) {
      puVar11 = param_3;
    }
    puVar8 = (ulong *)(param_1 + 0x17);
    if (puVar11 != (ulong *)0x0) {
      puVar7 = puVar11;
      _memcpy((undefined1 *)((long)puVar8 + (ulong)uVar9),param_2);
      uVar9 = *(uint *)(param_1 + 0x19);
    }
    iVar3 = uVar9 + (int)puVar11;
    *(int *)(param_1 + 0x19) = iVar3;
    param_3 = (ulong *)((long)param_3 - (long)puVar11);
    if (param_3 == (ulong *)0x0) goto LAB_002b5c1c;
    if (iVar3 == (int)unaff_x22) {
      if (*param_1 != 0) {
        lVar4 = (**(code **)(*param_1 + 0x28))(param_1,&uStack0000000000000008);
        if ((int)lVar4 != 0) {
          param_2 = (ulong *)((long)param_2 + (long)puVar11);
          goto LAB_002b5bfc;
        }
        goto LAB_002b5c20;
      }
LAB_002b5c50:
      puVar8 = (ulong *)((long)&segment_command_00000020.vmsize + 3);
      func_0x0028f83c(0xe,0,0x43,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x22d);
      lVar4 = 0;
      if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000018) {
        return 0;
      }
      goto LAB_002b5c88;
    }
  }
  auVar21 = func_0x0079e42c();
  puVar6 = auVar21._8_8_;
  plVar5 = auVar21._0_8_;
  uVar9 = *(uint *)(*plVar5 + 4);
  uVar19 = (ulong)uVar9;
  if (0x10 < uVar9) {
    func_0x0079e454();
    lVar4 = func_0x0036e274();
    if (lVar4 != 0) {
      _bzero(lVar4,0xd0);
    }
    return lVar4;
  }
  *puVar7 = uVar19;
  if (puVar6 == (undefined8 *)0x0) {
    return 1;
  }
  if (*(uint *)(plVar5 + 0x19) == uVar9) {
    plVar2 = plVar5 + 0x13;
  }
  else {
    *(undefined1 *)((long)plVar5 + (ulong)*(uint *)(plVar5 + 0x19) + 0xb8) = 0x80;
    uVar1 = *(uint *)(plVar5 + 0x19) + 1;
    if (uVar9 != uVar1) {
      _bzero((long)plVar5 + (ulong)*(uint *)(plVar5 + 0x19) + 0xb9,uVar19 - uVar1);
    }
    plVar2 = plVar5 + 0x15;
  }
  if (uVar9 != 0) {
    if (uVar9 < 8) {
      uVar12 = 0;
    }
    else {
      uVar12 = 0;
      if ((0x3f < (ulong)((long)puVar6 - (long)plVar2)) &&
         (0x3f < (ulong)((long)puVar6 + (-0xb8 - (long)plVar5)))) {
        uVar12 = uVar19 & 0xfffffff8;
        plVar14 = plVar5 + 0x17;
        uVar16 = uVar12;
        puVar17 = puVar6;
        plVar18 = plVar2;
        do {
          lVar4 = *plVar14;
          lVar20 = *plVar18;
          *puVar17 = CONCAT17((byte)((ulong)lVar20 >> 0x38) ^ (byte)((ulong)lVar4 >> 0x38),
                              CONCAT16((byte)((ulong)lVar20 >> 0x30) ^ (byte)((ulong)lVar4 >> 0x30),
                                       CONCAT15((byte)((ulong)lVar20 >> 0x28) ^
                                                (byte)((ulong)lVar4 >> 0x28),
                                                CONCAT14((byte)((ulong)lVar20 >> 0x20) ^
                                                         (byte)((ulong)lVar4 >> 0x20),
                                                         CONCAT13((byte)((ulong)lVar20 >> 0x18) ^
                                                                  (byte)((ulong)lVar4 >> 0x18),
                                                                  CONCAT12((byte)((ulong)lVar20 >>
                                                                                 0x10) ^
                                                                           (byte)((ulong)lVar4 >>
                                                                                 0x10),
                                                                           CONCAT11((byte)((ulong)
                                                  lVar20 >> 8) ^ (byte)((ulong)lVar4 >> 8),
                                                  (byte)lVar20 ^ (byte)lVar4)))))));
          uVar16 = uVar16 - 8;
          plVar14 = plVar14 + 1;
          puVar17 = puVar17 + 1;
          plVar18 = plVar18 + 1;
        } while (uVar16 != 0);
        if (uVar12 == uVar19) goto LAB_002b5d5c;
      }
    }
    lVar4 = uVar19 - uVar12;
    pbVar10 = (byte *)((long)plVar2 + uVar12);
    pbVar13 = (byte *)((long)puVar6 + uVar12);
    pbVar15 = (byte *)((long)plVar5 + uVar12 + 0xb8);
    do {
      *pbVar13 = *pbVar10 ^ *pbVar15;
      lVar4 = lVar4 + -1;
      pbVar10 = pbVar10 + 1;
      pbVar13 = pbVar13 + 1;
      pbVar15 = pbVar15 + 1;
    } while (lVar4 != 0);
  }
LAB_002b5d5c:
  if (*plVar5 == 0) {
    func_0x0028f83c(0xe,0,0x43,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x22d);
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x002b5d84. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  lVar4 = (**(code **)(*plVar5 + 0x28))(plVar5,puVar6,puVar6,uVar19);
  return lVar4;
}

