
undefined8 FUN_006eaefc(ulong param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  ulong uVar1;
  uint uVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  ulong uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  ulong uVar9;
  long unaff_x20;
  uint unaff_w21;
  long unaff_x22;
  int unaff_w23;
  ulong uVar10;
  double dVar11;
  ulong in_stack_00000000;
  ulong in_stack_00000008;
  ulong uStack_d0;
  long lStack_c8;
  ulong uStack_80;
  long lStack_78;
  undefined8 uStack_70;
  ulong uStack_68;
  long lStack_60;
  undefined8 uStack_58;
  undefined1 *puStack_50;
  undefined *puStack_48;
  ulong uStack_38;
  undefined1 auStack_6 [6];
  
  if ((param_1 <= in_stack_00000000) && (param_4 + (ulong)unaff_w21 <= in_stack_00000008)) {
    _memmove(unaff_x20 + (int)unaff_w21,unaff_x22 + unaff_w23);
    return 0;
  }
  uVar4 = func_0x006e644c();
  uStack_38 = 0;
  lVar5 = func_0x006e6914(uVar4,1,&uStack_38);
  uVar6 = func_0x006e6bc0(uVar4,2);
  uVar7 = func_0x006e6c78(uVar4,3);
  uVar2 = func_0x006e6c08(uVar4,4,(int)uStack_38 - (int)uVar6);
  if (-1 < (int)uVar2) {
    if ((ulong)uVar2 + (uVar6 & 0xffffffff) <= uStack_38) {
      _memset(lVar5 + (int)uVar6,uVar7);
      return 0;
    }
  }
  uVar8 = func_0x006e644c(uVar4,"buffer access out of bounds");
  puStack_48 = &DAT_006eaffc;
  lStack_78 = 0;
  uStack_70 = uVar7;
  uStack_68 = uVar6;
  lStack_60 = lVar5;
  uStack_58 = uVar4;
  puStack_50 = auStack_6 + -10;
  lVar5 = func_0x006e6914(uVar8,1,&lStack_78);
  dVar11 = (double)func_0x006e6a4c(uVar8,2);
  uVar6 = (ulong)dVar11;
  uVar2 = func_0x006e6bc0(uVar8,3);
  if ((long)uVar6 < 0) {
code_r0x006eb0bc:
    func_0x006e644c(uVar8,"buffer access out of bounds");
  }
  else if (uVar2 < 0x21) {
    uVar9 = uVar2 + uVar6;
    if (uVar9 <= (ulong)(lStack_78 * 8)) {
      uStack_80 = 0;
      _memcpy(&uStack_80,lVar5 + (uVar6 >> 3 & 0xffffffff),(int)(uVar9 + 7 >> 3) - (int)(uVar6 >> 3)
             );
      func_0x006e3894(uVar8,(uint)(uStack_80 >> (uVar6 & 7)) &
                            ((uint)(-1L << ((ulong)uVar2 & 0x3f)) ^ 0xffffffff));
      return 1;
    }
    goto code_r0x006eb0bc;
  }
  uVar4 = func_0x006e644c(uVar8,"bit count is out of range of [0; 32]");
  lStack_c8 = 0;
  lVar5 = func_0x006e6914(uVar4,1,&lStack_c8);
  dVar11 = (double)func_0x006e6a4c(uVar4,2);
  uVar10 = (ulong)dVar11;
  uVar6 = func_0x006e6bc0(uVar4,3);
  uVar9 = func_0x006e6c78(uVar4,4);
  if (-1 < (long)uVar10) {
    if (0x20 < (uint)uVar6) goto code_r0x006eb1f0;
    uVar1 = (uVar6 & 0xffffffff) + uVar10;
    if (uVar1 <= (ulong)(lStack_c8 * 8)) {
      uStack_d0 = 0;
      lVar5 = lVar5 + (uVar10 >> 3 & 0xffffffff);
      iVar3 = (int)(uVar1 + 7 >> 3) - (int)(uVar10 >> 3);
      _memcpy(&uStack_d0,lVar5,iVar3);
      uVar6 = -1L << (uVar6 & 0x3f);
      uStack_d0 = uStack_d0 & (~uVar6 << (uVar10 & 7) ^ 0xffffffffffffffff) |
                  (uVar9 & 0xffffffff & (uVar6 ^ 0xffffffffffffffff)) << (uVar10 & 7);
      _memcpy(lVar5,&uStack_d0,iVar3);
      return 0;
    }
  }
  func_0x006e644c(uVar4,"buffer access out of bounds");
code_r0x006eb1f0:
  uVar4 = func_0x006e644c(uVar4,"bit count is out of range of [0; 32]");
  if (((bRam0000000000a278d0 & 1) != 0) || (uVar4 = ___cxa_guard_acquire(0xa278d0), (int)uVar4 == 0)
     ) {
    return uVar4;
  }
  if (((bRam0000000000a28b60 & 1) == 0) && (iVar3 = ___cxa_guard_acquire(0xa28b60), iVar3 != 0)) {
    lRam0000000000a28b58 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b60);
  }
  lRam0000000000a278c8 = lRam0000000000a28b58 + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar4 = (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
  return uVar4;
}

