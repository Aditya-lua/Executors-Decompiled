/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4c4c8
 */

void ossl_curve448_scalar_decode_long(ulong *param_1,long param_2,ulong param_3)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong *ptr;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong local_d0;
  ulong uStack_c8;
  ulong local_c0;
  ulong uStack_b8;
  ulong local_b0;
  ulong uStack_a8;
  ulong local_a0;
  ulong local_98;
  ulong uStack_90;
  ulong local_88;
  ulong uStack_80;
  ulong local_78;
  ulong uStack_70;
  ulong local_68;
  
  ptr = &local_d0;
  if (param_3 == 0) {
    param_1[6] = 0;
    param_1[3] = 0;
    param_1[2] = 0;
    param_1[5] = 0;
    param_1[4] = 0;
    param_1[1] = 0;
    *param_1 = 0;
  }
  else {
    uVar4 = (param_3 / 0x38) * 0x38;
    uVar13 = uVar4 - 0x38;
    if (param_3 != uVar4) {
      uVar13 = uVar4;
    }
    FUN_00a4c270(&local_98,param_2 + uVar13,param_3 - uVar13);
    if (param_3 == 0x38) {
      FUN_00a4bc44(param_1,&local_98,ossl_curve448_scalar_one);
      FUN_00a4bc44(param_1,param_1,&DAT_00765ef0);
      ptr = &local_98;
    }
    else {
      for (; uVar13 != 0; uVar13 = uVar13 - 0x38) {
        FUN_00a4bc44(&local_98,&local_98,&DAT_00765ef0);
        FUN_00a4c270(&local_d0,param_2 + uVar13 + -0x38,0x38);
        FUN_00a4bc44(&local_d0,&local_d0,ossl_curve448_scalar_one);
        FUN_00a4bc44(&local_d0,&local_d0,&DAT_00765ef0);
        uVar4 = CARRY8(local_d0,local_98) + uStack_90;
        uVar5 = uVar4 + uStack_c8;
        uVar6 = (ulong)CARRY8((ulong)CARRY8(local_d0,local_98),uStack_90) +
                (ulong)CARRY8(uVar4,uStack_c8);
        uVar4 = uVar6 + local_88;
        uVar12 = uVar4 + local_c0;
        uVar7 = (ulong)CARRY8(uVar6,local_88) + (ulong)CARRY8(uVar4,local_c0);
        uVar4 = uVar7 + uStack_80;
        uVar6 = uVar4 + uStack_b8;
        uVar9 = (ulong)CARRY8(uVar7,uStack_80) + (ulong)CARRY8(uVar4,uStack_b8);
        uVar4 = uVar9 + local_78;
        uVar7 = uVar4 + local_b0;
        uVar10 = (ulong)CARRY8(uVar9,local_78) + (ulong)CARRY8(uVar4,local_b0);
        uVar4 = uVar10 + uStack_70;
        uVar9 = uVar4 + uStack_a8;
        uVar8 = (ulong)CARRY8(uVar10,uStack_70) + (ulong)CARRY8(uVar4,uStack_a8);
        uVar4 = uVar8 + local_68;
        uVar10 = uVar4 + local_a0;
        uVar1 = local_d0 + local_98 + 0xdc873d6d54a7bb0d;
        uVar11 = (ulong)(0x2378c292ab5844f2 < local_d0 + local_98) - 1;
        uVar2 = uVar11 + uVar5;
        uVar3 = uVar2 + 0xde933d8d723a70ab;
        uVar11 = ((long)uVar11 >> 0x3f) + (ulong)CARRY8(uVar11,uVar5) + -1 +
                 (ulong)(0x216cc2728dc58f54 < uVar2);
        uVar5 = uVar12 + uVar11;
        uVar2 = uVar5 + 0x3bb124b65129c970;
        uVar12 = ((long)uVar11 >> 0x3f) + (ulong)CARRY8(uVar12,uVar11) + -1 +
                 (ulong)(0xc44edb49aed6368f < uVar5);
        uVar5 = uVar6 + uVar12;
        uVar11 = uVar5 + 0x8335dc17;
        uVar6 = ((long)uVar12 >> 0x3f) + (ulong)CARRY8(uVar6,uVar12) + -1 +
                (ulong)(0xffffffff7cca23e8 < uVar5);
        uVar12 = uVar7 + uVar6;
        uVar5 = uVar12 + 1;
        uVar7 = ((long)uVar6 >> 0x3f) + (ulong)CARRY8(uVar7,uVar6) + -1 +
                (ulong)(0xfffffffffffffffe < uVar12);
        uVar6 = uVar9 + uVar7;
        uVar12 = uVar6 + 1;
        uVar7 = ((long)uVar7 >> 0x3f) + (ulong)CARRY8(uVar9,uVar7) + -1 +
                (ulong)(0xfffffffffffffffe < uVar6);
        uVar6 = uVar10 + uVar7;
        uVar7 = ((long)uVar7 >> 0x3f) + (ulong)CARRY8(uVar10,uVar7) + -1 +
                (ulong)(0x3ffffffffffffffe < uVar6) +
                (ulong)CARRY8(uVar8,local_68) + (ulong)CARRY8(uVar4,local_a0);
        local_98 = uVar1 + (uVar7 & 0x2378c292ab5844f3);
        uVar4 = (ulong)CARRY8(uVar1,uVar7 & 0x2378c292ab5844f3);
        uVar9 = uVar3 + (uVar7 & 0x216cc2728dc58f55);
        uStack_90 = uVar9 + uVar4;
        uVar9 = (ulong)CARRY8(uVar3,uVar7 & 0x216cc2728dc58f55) + (ulong)CARRY8(uVar9,uVar4);
        uVar4 = uVar2 + (uVar7 & 0xc44edb49aed63690);
        local_88 = uVar4 + uVar9;
        uVar9 = (ulong)CARRY8(uVar2,uVar7 & 0xc44edb49aed63690) + (ulong)CARRY8(uVar4,uVar9);
        uVar4 = uVar11 + (uVar7 & 0xffffffff7cca23e9);
        uStack_80 = uVar4 + uVar9;
        uVar9 = (ulong)CARRY8(uVar11,uVar7 & 0xffffffff7cca23e9) + (ulong)CARRY8(uVar4,uVar9);
        uVar4 = uVar5 + uVar7;
        local_78 = uVar4 + uVar9;
        uVar5 = (ulong)CARRY8(uVar5,uVar7) + (ulong)CARRY8(uVar4,uVar9);
        uVar4 = uVar12 + uVar7;
        uStack_70 = uVar4 + uVar5;
        local_68 = (uVar7 & 0x3fffffffffffffff) +
                   (ulong)CARRY8(uVar12,uVar7) + (ulong)CARRY8(uVar4,uVar5) +
                   uVar6 + 0xc000000000000001;
      }
      param_1[6] = local_68;
      param_1[5] = uStack_70;
      param_1[4] = local_78;
      param_1[3] = uStack_80;
      param_1[2] = local_88;
      param_1[1] = uStack_90;
      *param_1 = local_98;
      OPENSSL_cleanse(&local_98,0x38);
    }
    OPENSSL_cleanse(ptr,0x38);
  }
  return;
}

