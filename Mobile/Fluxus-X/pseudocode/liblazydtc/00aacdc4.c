/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aacdc4
 */

undefined8
CRYPTO_xts128_encrypt
          (undefined8 *param_1,ulong *param_2,ulong *param_3,ulong *param_4,ulong param_5,
          int param_6)

{
  undefined8 *puVar1;
  undefined1 uVar2;
  ulong extraout_x8;
  ulong uVar3;
  uint uVar4;
  ulong extraout_x9;
  ulong *puVar5;
  ulong *puVar6;
  ulong *puVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 uVar11;
  ulong uVar12;
  undefined8 uVar13;
  ulong uVar14;
  undefined8 uVar15;
  ulong uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  ulong uVar19;
  undefined8 uVar20;
  ulong uVar21;
  undefined8 uVar22;
  ulong local_60 [3];
  ulong uStack_48;
  int iStack_44;
  
  if (param_5 < 0x10) {
    return 0xffffffff;
  }
  uStack_48 = param_2[1];
  local_60[2] = *param_2;
  (*(code *)param_1[3])(local_60 + 2,local_60 + 2,param_1[1]);
  if ((param_5 & 0xf) != 0 && param_6 == 0) {
    param_5 = param_5 - 0x10;
  }
  uVar10 = extraout_x8;
  uVar8 = extraout_x9;
  uVar3 = local_60[0];
  uVar9 = local_60[1];
  if (0xf < param_5) {
    do {
      local_60[0] = local_60[2] ^ *param_3;
      local_60[1] = uStack_48 ^ param_3[1];
      (*(code *)param_1[2])(local_60,local_60,*param_1);
      param_5 = param_5 - 0x10;
      local_60[0] = local_60[0] ^ local_60[2];
      *param_4 = local_60[0];
      local_60[1] = local_60[1] ^ uStack_48;
      param_4[1] = local_60[1];
      if (param_5 == 0) {
        return 0;
      }
      param_4 = param_4 + 2;
      param_3 = param_3 + 2;
      uVar3 = local_60[2] >> 0x3f;
      local_60[2] = (ulong)(iStack_44 >> 0x1f & 0x87) ^ local_60[2] << 1;
      uStack_48 = uVar3 | uStack_48 << 1;
      uVar10 = local_60[0];
      uVar8 = local_60[1];
      uVar3 = local_60[0];
      uVar9 = local_60[1];
    } while (0xf < param_5);
  }
  local_60[1] = uVar8;
  local_60[0] = uVar10;
  if (param_6 != 0) {
    if (param_5 == 0) goto LAB_00aad0a0;
    local_60[0] = uVar3;
    local_60[1] = uVar9;
    if ((param_5 < 0x20) || ((int)(param_5 - 1) == -1)) {
LAB_00aad06c:
      uVar3 = 0;
      uVar4 = 0;
    }
    else {
      uVar3 = 0;
      uVar4 = 0;
      if (param_5 - 1 >> 0x20 == 0) {
        if ((param_4 < (ulong *)((long)local_60 + param_5) &&
             local_60 < (ulong *)((long)param_4 + param_5)) ||
           (param_4 < (ulong *)((long)param_3 + param_5) &&
            param_3 < (ulong *)((long)param_4 + param_5))) goto LAB_00aad06c;
        uVar3 = 0;
        uVar4 = 0;
        if (!(local_60 < (ulong *)((long)param_3 + param_5) &&
             param_3 < (ulong *)((long)local_60 + param_5))) {
          uVar3 = param_5 & 0xffffffffffffffe0;
          puVar5 = param_3 + 2;
          uVar4 = (uint)param_5 & 0xffffffe0;
          puVar6 = local_60 + 2;
          puVar7 = param_4 + 2;
          uVar9 = uVar3;
          do {
            uVar8 = puVar5[-1];
            uVar10 = puVar5[-2];
            uVar14 = puVar5[1];
            uVar12 = *puVar5;
            uVar16 = puVar6[-2];
            uVar21 = puVar6[1];
            uVar19 = *puVar6;
            puVar5 = puVar5 + 4;
            uVar9 = uVar9 - 0x20;
            puVar7[-1] = puVar6[-1];
            puVar7[-2] = uVar16;
            puVar7[1] = uVar21;
            *puVar7 = uVar19;
            puVar6[-1] = uVar8;
            puVar6[-2] = uVar10;
            puVar6[1] = uVar14;
            *puVar6 = uVar12;
            puVar6 = puVar6 + 4;
            puVar7 = puVar7 + 4;
          } while (uVar9 != 0);
          if (param_5 == uVar3) goto LAB_00aad0a0;
        }
      }
    }
    do {
      uVar4 = uVar4 + 1;
      uVar2 = *(undefined1 *)((long)param_3 + uVar3);
      *(undefined1 *)((long)param_4 + uVar3) = *(undefined1 *)((long)local_60 + uVar3);
      *(undefined1 *)((long)local_60 + uVar3) = uVar2;
      uVar3 = (ulong)uVar4;
    } while (uVar3 < param_5);
LAB_00aad0a0:
    local_60[0] = local_60[0] ^ local_60[2];
    local_60[1] = local_60[1] ^ uStack_48;
    (*(code *)param_1[2])(local_60,local_60,*param_1);
    param_4[-1] = local_60[1] ^ uStack_48;
    param_4[-2] = local_60[0] ^ local_60[2];
    return 0;
  }
  uVar3 = (ulong)((uint)((long)uStack_48 >> 0x3f) & 0x87) ^ local_60[2] << 1;
  local_60[0] = uVar3 ^ *param_3;
  uVar9 = local_60[2] >> 0x3f | uStack_48 << 1;
  local_60[1] = param_3[1] ^ uVar9;
  (*(code *)param_1[2])(local_60,local_60,*param_1);
  local_60[0] = local_60[0] ^ uVar3;
  local_60[1] = local_60[1] ^ uVar9;
  if (param_5 == 0) goto LAB_00aad02c;
  if (param_5 < 0x20) {
LAB_00aacff4:
    uVar3 = 0;
    uVar4 = 0;
  }
  else {
    uVar4 = (uint)(param_5 - 1);
    if (((uVar4 == 0xffffffff) || (param_5 - 1 >> 0x20 != 0)) || (0xffffffef < uVar4))
    goto LAB_00aacff4;
    puVar5 = (ulong *)((long)param_4 + param_5 + 0x10);
    puVar6 = (ulong *)((long)param_3 + param_5 + 0x10);
    if ((param_4 + 2 < (ulong *)((long)local_60 + param_5) && local_60 < puVar5) ||
       (param_4 + 2 < puVar6 && param_3 + 2 < puVar5)) goto LAB_00aacff4;
    uVar3 = 0;
    uVar4 = 0;
    if (!(local_60 < puVar6 && param_3 + 2 < (ulong *)((long)local_60 + param_5))) {
      uVar3 = param_5 & 0xffffffffffffffe0;
      uVar4 = (uint)param_5 & 0xffffffe0;
      uVar9 = 0;
      do {
        uVar8 = uVar9 & 0xffffffe0 | 0x10;
        puVar1 = (undefined8 *)((long)param_3 + uVar8);
        uVar11 = *(undefined8 *)((long)local_60 + uVar9);
        uVar15 = *(undefined8 *)((long)local_60 + uVar9 + 0x18);
        uVar13 = *(undefined8 *)((long)local_60 + uVar9 + 0x10);
        uVar18 = puVar1[1];
        uVar17 = *puVar1;
        uVar22 = puVar1[3];
        uVar20 = puVar1[2];
        uVar10 = uVar9 + 0x20;
        puVar1 = (undefined8 *)((long)param_4 + uVar8);
        puVar1[1] = *(undefined8 *)((long)local_60 + uVar9 + 8);
        *puVar1 = uVar11;
        puVar1[3] = uVar15;
        puVar1[2] = uVar13;
        *(undefined8 *)((long)local_60 + uVar9 + 8) = uVar18;
        *(undefined8 *)((long)local_60 + uVar9) = uVar17;
        *(undefined8 *)((long)local_60 + uVar9 + 0x18) = uVar22;
        *(undefined8 *)((long)local_60 + uVar9 + 0x10) = uVar20;
        uVar9 = uVar10;
      } while (uVar3 != uVar10);
      if (param_5 == uVar3) goto LAB_00aad02c;
    }
  }
  uVar4 = uVar4 + 0x10;
  do {
    uVar2 = *(undefined1 *)((long)param_3 + (ulong)uVar4);
    *(undefined1 *)((long)param_4 + (ulong)uVar4) = *(undefined1 *)((long)local_60 + uVar3);
    *(undefined1 *)((long)local_60 + uVar3) = uVar2;
    uVar3 = (ulong)(uVar4 - 0xf);
    uVar4 = uVar4 + 1;
  } while (uVar3 < param_5);
LAB_00aad02c:
  local_60[0] = local_60[0] ^ local_60[2];
  local_60[1] = local_60[1] ^ uStack_48;
  (*(code *)param_1[2])(local_60,local_60,*param_1);
  param_4[1] = CONCAT17((byte)(uStack_48 >> 0x38) ^ (byte)(local_60[1] >> 0x38),
                        CONCAT16((byte)(uStack_48 >> 0x30) ^ (byte)(local_60[1] >> 0x30),
                                 CONCAT15((byte)(uStack_48 >> 0x28) ^ (byte)(local_60[1] >> 0x28),
                                          CONCAT14((byte)(uStack_48 >> 0x20) ^
                                                   (byte)(local_60[1] >> 0x20),
                                                   CONCAT13((byte)(uStack_48 >> 0x18) ^
                                                            (byte)(local_60[1] >> 0x18),
                                                            CONCAT12((byte)(uStack_48 >> 0x10) ^
                                                                     (byte)(local_60[1] >> 0x10),
                                                                     CONCAT11((byte)(uStack_48 >> 8)
                                                                              ^ (byte)(local_60[1]
                                                                                      >> 8),
                                                                              (byte)uStack_48 ^
                                                                              (byte)local_60[1])))))
                                ));
  *param_4 = CONCAT17((byte)(local_60[2] >> 0x38) ^ (byte)(local_60[0] >> 0x38),
                      CONCAT16((byte)(local_60[2] >> 0x30) ^ (byte)(local_60[0] >> 0x30),
                               CONCAT15((byte)(local_60[2] >> 0x28) ^ (byte)(local_60[0] >> 0x28),
                                        CONCAT14((byte)(local_60[2] >> 0x20) ^
                                                 (byte)(local_60[0] >> 0x20),
                                                 CONCAT13((byte)(local_60[2] >> 0x18) ^
                                                          (byte)(local_60[0] >> 0x18),
                                                          CONCAT12((byte)(local_60[2] >> 0x10) ^
                                                                   (byte)(local_60[0] >> 0x10),
                                                                   CONCAT11((byte)(local_60[2] >> 8)
                                                                            ^ (byte)(local_60[0] >>
                                                                                    8),
                                                                            (byte)local_60[2] ^
                                                                            (byte)local_60[0])))))))
  ;
  return 0;
}

