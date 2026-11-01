
undefined8 FUN_006eb0d0(void)

{
  ulong uVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  double dVar8;
  ulong uStack_50;
  long lStack_48;
  
  uVar3 = func_0x006e644c();
  lStack_48 = 0;
  lVar4 = func_0x006e6914(uVar3,1,&lStack_48);
  dVar8 = (double)func_0x006e6a4c(uVar3,2);
  uVar7 = (ulong)dVar8;
  uVar5 = func_0x006e6bc0(uVar3,3);
  uVar6 = func_0x006e6c78(uVar3,4);
  if (-1 < (long)uVar7) {
    if (0x20 < (uint)uVar5) goto code_r0x006eb1f0;
    uVar1 = (uVar5 & 0xffffffff) + uVar7;
    if (uVar1 <= (ulong)(lStack_48 * 8)) {
      uStack_50 = 0;
      lVar4 = lVar4 + (uVar7 >> 3 & 0xffffffff);
      iVar2 = (int)(uVar1 + 7 >> 3) - (int)(uVar7 >> 3);
      _memcpy(&uStack_50,lVar4,iVar2);
      uVar5 = -1L << (uVar5 & 0x3f);
      uStack_50 = uStack_50 & (~uVar5 << (uVar7 & 7) ^ 0xffffffffffffffff) |
                  (uVar6 & 0xffffffff & (uVar5 ^ 0xffffffffffffffff)) << (uVar7 & 7);
      _memcpy(lVar4,&uStack_50,iVar2);
      return 0;
    }
  }
  func_0x006e644c(uVar3,"buffer access out of bounds");
code_r0x006eb1f0:
  uVar3 = func_0x006e644c(uVar3,"bit count is out of range of [0; 32]");
  if (((bRam0000000000a278d0 & 1) != 0) || (uVar3 = ___cxa_guard_acquire(0xa278d0), (int)uVar3 == 0)
     ) {
    return uVar3;
  }
  if (((bRam0000000000a28b60 & 1) == 0) && (iVar2 = ___cxa_guard_acquire(0xa28b60), iVar2 != 0)) {
    lRam0000000000a28b58 = __dyld_get_image_header(0);
    ___cxa_guard_release(0xa28b60);
  }
  lRam0000000000a278c8 = lRam0000000000a28b58 + 0x1560254;
                    /* WARNING: Could not recover jumptable at 0x007b2ff8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar3 = (*(code *)PTR____cxa_guard_release_00a24b40)(0xa278d0);
  return uVar3;
}

