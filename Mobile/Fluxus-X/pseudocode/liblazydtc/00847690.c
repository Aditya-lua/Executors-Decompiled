/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00847690
 */

byte * FUN_00847690(long param_1,byte *param_2,byte *param_3,long param_4)

{
  uint uVar1;
  ulong uVar2;
  long lVar3;
  undefined2 uVar4;
  bool bVar5;
  ushort uVar6;
  short sVar7;
  byte *pbVar8;
  undefined8 uVar9;
  byte bVar10;
  ulong uVar11;
  byte *pbVar12;
  byte *pbVar13;
  ulong local_b0;
  undefined8 uStack_a8;
  void *local_a0;
  ulong local_90;
  ulong uStack_88;
  byte *local_80;
  ulong local_78;
  undefined8 uStack_70;
  void *local_68;
  undefined8 local_60;
  ulong uStack_58;
  byte *local_50;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  if ((param_2 != param_3) && (*param_2 != 0x5d)) {
    uVar11 = 0;
    local_60 = 0;
    uStack_58 = 0;
    local_50 = (byte *)0x0;
    if ((param_2 + 1 != param_3) && (*param_2 == 0x5b)) {
      bVar10 = param_2[1];
      if (bVar10 == 0x2e) {
        param_2 = (byte *)FUN_00847f74(param_1,param_2 + 2,param_3,&local_60);
        uVar11 = local_60 & 0xff;
        goto LAB_008477a8;
      }
      if (bVar10 == 0x3a) {
        pbVar13 = param_2 + 2;
        if (1 < (long)param_3 - (long)pbVar13) {
          pbVar12 = param_3 + (-4 - (long)param_2);
          for (pbVar8 = pbVar13; (*pbVar8 != 0x3a || (pbVar8[1] != 0x5d)); pbVar8 = pbVar8 + 1) {
            if (pbVar12 == (byte *)0x0) goto LAB_00847b80;
            pbVar12 = pbVar12 + -1;
          }
          if (pbVar8 != param_3) {
                    /* try { // try from 00847800 to 0084780f has its CatchHandler @ 00847c58 */
            uVar6 = FUN_008491c8(param_1,pbVar13,pbVar8,*(uint *)(param_1 + 0x18) & 1,0);
            if (uVar6 == 0) goto LAB_00847b94;
            *(ushort *)(param_4 + 0xa0) = *(ushort *)(param_4 + 0xa0) | uVar6;
            param_2 = pbVar8 + 2;
            goto joined_r0x0084782c;
          }
        }
LAB_00847b80:
        if (*(long *)(lVar3 + 0x28) == *(long *)(lVar3 + 0x28)) {
                    /* try { // try from 00847b90 to 00847ba7 has its CatchHandler @ 00847c58 */
          FUN_00847644();
LAB_00847b94:
          if (*(long *)(lVar3 + 0x28) == local_48) {
            uVar9 = FUN_0084917c();
                    /* catch() { ... } // from try @ 00847a00 with catch @ 00847ba8
                       catch() { ... } // from try @ 00847a58 with catch @ 00847ba8
                       catch() { ... } // from try @ 00847ac4 with catch @ 00847ba8 */
            if ((local_78 & 1) != 0) {
              operator_delete(local_68,local_78 & 0xfffffffffffffffe);
            }
            if ((local_60 & 1) != 0) {
              operator_delete(local_50,local_60 & 0xfffffffffffffffe);
            }
            if (*(long *)(lVar3 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
              FUN_00c2c090(uVar9);
            }
          }
        }
        goto LAB_00847c04;
      }
      if (bVar10 != 0x3d) {
        uVar11 = 0;
        goto LAB_008477a8;
      }
                    /* try { // try from 00847710 to 00847787 has its CatchHandler @ 00847c58 */
      param_2 = (byte *)FUN_00847c68(param_1,param_2 + 2,param_3,param_4);
      goto joined_r0x0084782c;
    }
LAB_008477a8:
    uVar2 = uVar11 >> 1;
    if ((uVar11 & 1) != 0) {
      uVar2 = uStack_58;
    }
    uVar1 = *(uint *)(param_1 + 0x18) & 0x1f0;
    if (uVar2 == 0) {
      if ((uVar1 | 0x40) != 0x40) {
        bVar10 = *param_2;
LAB_00847838:
        if ((uVar11 & 1) == 0) {
          local_60 = CONCAT71(local_60._1_7_,2);
          pbVar13 = (byte *)((ulong)&local_60 | 1);
        }
        else {
          uStack_58 = 1;
          pbVar13 = local_50;
        }
        param_2 = param_2 + 1;
        *pbVar13 = bVar10;
        pbVar13[1] = 0;
        goto LAB_00847868;
      }
      bVar10 = *param_2;
      if (bVar10 != 0x5c) goto LAB_00847838;
      if (uVar1 == 0) {
        param_2 = (byte *)FUN_00848088(param_1,param_2 + 1,param_3,&local_60,param_4);
      }
      else {
                    /* try { // try from 008477dc to 008477ef has its CatchHandler @ 00847c54 */
        param_2 = (byte *)FUN_008481f4(param_1,param_2 + 1,param_3,&local_60);
      }
      if (param_2 != param_3) goto LAB_00847870;
LAB_0084787c:
      bVar5 = (local_60 & 1) == 0;
      uVar11 = local_60 >> 1 & 0x7f;
      if (!bVar5) {
        uVar11 = uStack_58;
      }
      if (uVar11 != 0) {
        if (uVar11 == 1) {
LAB_00847950:
          pbVar13 = local_50;
          if (bVar5) {
            pbVar13 = (byte *)((long)&local_60 + 1);
          }
          FUN_0084612c(param_4,*pbVar13);
        }
        else {
          pbVar13 = (byte *)((ulong)&local_60 | 2);
          if ((local_60 & 1) == 0) {
            pbVar8 = (byte *)((long)&local_60 + 1);
          }
          else {
            pbVar13 = local_50 + 1;
            pbVar8 = local_50;
          }
          bVar10 = *pbVar13;
          if (*(char *)(param_4 + 0xa5) == '\x01') {
                    /* try { // try from 008478d8 to 008479cf has its CatchHandler @ 00847c54 */
            uVar6 = (**(code **)(**(long **)(param_4 + 0x18) + 0x28))();
            sVar7 = (**(code **)(**(long **)(param_4 + 0x18) + 0x28))
                              (*(long **)(param_4 + 0x18),bVar10);
            local_78 = CONCAT62(local_78._2_6_,uVar6 & 0xff | sVar7 << 8);
            FUN_008497f0(param_4 + 0x70,&local_78);
          }
          else {
            uVar4 = CONCAT11(bVar10,*pbVar8);
            if (*(char *)(param_4 + 0xa6) == '\x01') {
              local_78 = CONCAT62(local_78._2_6_,uVar4);
              FUN_008497f0(param_4 + 0x70,&local_78);
            }
            else {
              local_78 = CONCAT62(local_78._2_6_,uVar4);
                    /* try { // try from 00847a6c to 00847a93 has its CatchHandler @ 00847c54 */
              FUN_008497f0(param_4 + 0x70,&local_78);
            }
          }
        }
      }
    }
    else {
LAB_00847868:
      if (param_2 == param_3) goto LAB_0084787c;
LAB_00847870:
      if (*param_2 == 0x5d) goto LAB_0084787c;
      pbVar13 = param_2 + 1;
      if (((pbVar13 == param_3) || (*param_2 != 0x2d)) || (*pbVar13 == 0x5d)) {
        bVar5 = (local_60 & 1) == 0;
        uVar11 = local_60 >> 1 & 0x7f;
        if (!bVar5) {
          uVar11 = uStack_58;
        }
        if (uVar11 == 0) goto joined_r0x0084782c;
        if (uVar11 != 1) {
          pbVar13 = (byte *)((ulong)&local_60 | 2);
          if ((local_60 & 1) == 0) {
            pbVar8 = (byte *)((long)&local_60 + 1);
          }
          else {
            pbVar13 = local_50 + 1;
            pbVar8 = local_50;
          }
                    /* try { // try from 00847a30 to 00847a37 has its CatchHandler @ 00847c54 */
          FUN_0084898c(param_4,*pbVar8,*pbVar13);
          goto joined_r0x0084782c;
        }
        goto LAB_00847950;
      }
      pbVar8 = param_2 + 2;
      local_78 = 0;
      uStack_70 = 0;
      local_68 = (void *)0x0;
      if (((pbVar8 == param_3) || (*pbVar13 != 0x5b)) || (*pbVar8 != 0x2e)) {
        if ((uVar1 | 0x40) == 0x40) {
          bVar10 = *pbVar13;
          if (bVar10 == 0x5c) {
            if (uVar1 == 0) {
                    /* try { // try from 00847ac4 to 00847ad3 has its CatchHandler @ 00847ba8 */
              pbVar8 = (byte *)FUN_00848088(param_1,pbVar8,param_3,&local_78,param_4);
            }
            else {
                    /* try { // try from 00847a58 to 00847a63 has its CatchHandler @ 00847ba8 */
              pbVar8 = (byte *)FUN_008481f4(param_1,pbVar8,param_3,&local_78);
            }
            goto LAB_00847ad8;
          }
        }
        else {
          bVar10 = *pbVar13;
        }
        local_78 = CONCAT71((uint7)bVar10,2);
      }
      else {
                    /* try { // try from 00847a00 to 00847a0b has its CatchHandler @ 00847ba8 */
        pbVar8 = (byte *)FUN_00847f74(param_1,param_2 + 3,param_3,&local_78);
      }
LAB_00847ad8:
      local_80 = local_50;
      uStack_88 = uStack_58;
      uStack_58 = 0;
      local_50 = (byte *)0x0;
      local_90 = local_60;
      local_60 = 0;
      uStack_a8 = uStack_70;
      local_b0 = local_78;
      local_a0 = local_68;
      uStack_70 = 0;
      local_68 = (void *)0x0;
      local_78 = 0;
                    /* try { // try from 00847b04 to 00847b13 has its CatchHandler @ 00847bb8 */
      FUN_00848520(param_4,&local_90,&local_b0);
      if ((local_b0 & 1) != 0) {
        operator_delete(local_a0,local_b0 & 0xfffffffffffffffe);
      }
      if ((local_90 & 1) != 0) {
        operator_delete(local_80,local_90 & 0xfffffffffffffffe);
      }
      param_2 = pbVar8;
      if ((local_78 & 1) != 0) {
        operator_delete(local_68,local_78 & 0xfffffffffffffffe);
      }
    }
joined_r0x0084782c:
    if ((local_60 & 1) != 0) {
      operator_delete(local_50,local_60 & 0xfffffffffffffffe);
    }
  }
  if (*(long *)(lVar3 + 0x28) == local_48) {
    return param_2;
  }
LAB_00847c04:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

