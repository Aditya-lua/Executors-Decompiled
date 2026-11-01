
void FUN_0017f2f4(void)

{
  code *pcVar1;
  long lVar2;
  long *plVar3;
  long *unaff_x19;
  undefined8 *unaff_x20;
  long *unaff_x22;
  ulong uVar4;
  undefined8 uVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 unaff_x28;
  long lVar8;
  long lVar9;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  
  uStack0000000000000008 = 0;
  _memcpy(8);
  uVar7 = *(ulong *)(*unaff_x22 + 0x38);
  uVar4 = uVar7 * 0x10;
  if (uVar7 >> 0x3c != 0 || 0x7ffffffffffffff8 < uVar4) {
    uStack0000000000000000 = 0;
LAB_0017f448:
    func_0x007a1f00(uStack0000000000000000,uVar4,&UNK_009bdb28);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x17f460);
    (*pcVar1)();
  }
  uVar5 = *(undefined8 *)(*unaff_x22 + 0x30);
  if (uVar4 == 0) {
    uVar6 = 0;
    lVar2 = 8;
  }
  else {
    uStack0000000000000000 = 8;
    lVar2 = func_0x00187bd0(uVar4,8);
    if (lVar2 == 0) goto LAB_0017f448;
    uVar6 = uVar7;
  }
  _memcpy(lVar2,uVar5,uVar4);
  plVar3 = (long *)*unaff_x22;
  *unaff_x20 = uStack0000000000000008;
  unaff_x20[1] = 8;
  unaff_x20[2] = unaff_x28;
  unaff_x20[3] = uVar6;
  unaff_x20[4] = lVar2;
  unaff_x20[5] = uVar7;
  lVar2 = plVar3[8];
  lVar9 = plVar3[0xb];
  lVar8 = plVar3[10];
  unaff_x20[7] = plVar3[9];
  unaff_x20[6] = lVar2;
  unaff_x20[9] = lVar9;
  unaff_x20[8] = lVar8;
  lVar2 = plVar3[0xc];
  lVar9 = plVar3[0xf];
  lVar8 = plVar3[0xe];
  unaff_x20[0xb] = plVar3[0xd];
  unaff_x20[10] = lVar2;
  unaff_x20[0xd] = lVar9;
  unaff_x20[0xc] = lVar8;
  lVar2 = *plVar3;
  *plVar3 = lVar2 + -1;
  LORelease();
  if (lVar2 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9f08();
  }
  if (*unaff_x19 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(unaff_x19[1],*unaff_x19 << 4,8);
  return;
}

