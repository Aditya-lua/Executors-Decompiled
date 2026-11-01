
/* WARNING: Possible PIC construction at 0x007590cc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x007590d0) */
/* WARNING: Removing unreachable block (ram,0x007590d4) */
/* WARNING: Removing unreachable block (ram,0x007590dc) */
/* WARNING: Removing unreachable block (ram,0x007590f0) */
/* WARNING: Removing unreachable block (ram,0x007590f8) */
/* WARNING: Removing unreachable block (ram,0x0075910c) */

undefined8 FUN_00759014(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined *param_4)

{
  byte bVar1;
  long lVar2;
  bool bVar3;
  undefined1 uVar4;
  undefined8 uVar5;
  uint uVar6;
  undefined8 unaff_x19;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined1 (*pauVar7) [16];
  byte *pbVar8;
  long unaff_x29;
  undefined1 auVar9 [16];
  undefined8 uStack0000000000000000;
  undefined1 auStack0000000000000008 [16];
  undefined2 uStack_68;
  char cStack_66;
  undefined2 uStack_64;
  undefined1 uStack_62;
  
  *unaff_x23 = param_1;
  if ((uint)unaff_x22 == 0x3f) {
    func_0x0073c9e4();
    uVar5 = 3;
  }
  else {
    param_4 = &DAT_00759330;
    pauVar7 = &auStack0000000000000008;
    param_3 = 0x10;
    _qsort(auStack0000000000000008,unaff_x22 + 1,0x10);
    uVar6 = 0;
    do {
      uStack0000000000000000._7_1_ = 0;
      auVar9 = *pauVar7;
      if (*(long *)(*pauVar7 + 8) != 0) {
        param_4 = (undefined *)((long)&uStack0000000000000000 + 7);
        goto SUB_00759114;
      }
      uVar5 = 0;
      pauVar7 = pauVar7 + 1;
      bVar3 = uVar6 < (uint)unaff_x22;
      uVar6 = uVar6 + 1;
    } while (bVar3);
  }
  unaff_x19 = param_3;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return uVar5;
  }
  auVar9 = ___stack_chk_fail(uVar5);
SUB_00759114:
  if (auVar9._8_8_ == 0) {
    return 0;
  }
  do {
    pbVar8 = auVar9._0_8_;
    bVar1 = *pbVar8;
    if ((int)(char)bVar1 - 0x30U < 10 || (((int)(char)bVar1 & 0xffffffdfU) - 0x41 & 0xff) < 0x1a) {
LAB_00759254:
      uVar5 = func_0x0074075c(unaff_x19,pbVar8,1);
joined_r0x007592e8:
      lVar2 = auVar9._8_8_ + -1;
    }
    else {
      if ('^' < (char)bVar1) {
        if ((bVar1 == 0x7e) || (bVar1 == 0x5f)) goto LAB_00759254;
LAB_00759278:
        cStack_66 = '\0';
        uStack_68 = 0x25;
        bVar1 = *pbVar8;
        if (param_4 == (undefined *)0x0) {
          if (bVar1 == 0x2f) goto LAB_00759254;
        }
        else if (bVar1 == 0x3d) {
          uVar5 = func_0x0074075c(unaff_x19,pbVar8,1);
          *param_4 = 1;
          goto joined_r0x007592e8;
        }
        uStack_68 = CONCAT11("0123456789ABCDEF"[bVar1 >> 4],0x25);
        cStack_66 = "0123456789ABCDEF"[(ulong)*pbVar8 & 0xf];
        uVar5 = func_0x0074075c(unaff_x19,&uStack_68,3);
        goto joined_r0x007592e8;
      }
      if ((int)(char)bVar1 - 0x2dU < 2) goto LAB_00759254;
      if ((char)bVar1 != 0x25) goto LAB_00759278;
      if ((9 < (pbVar8[1] - 0x30 & 0xff)) &&
         ((uVar6 = pbVar8[1] - 0x41, 0x25 < uVar6 ||
          ((1L << ((ulong)uVar6 & 0x3f) & 0x3f0000003fU) == 0)))) {
LAB_007592f0:
        uVar5 = func_0x0074075c(unaff_x19,"%25",3);
        goto joined_r0x007592e8;
      }
      uVar6 = (uint)pbVar8[2];
      if ((9 < (uVar6 - 0x30 & 0xff)) &&
         ((uVar6 = uVar6 - 0x41, 0x25 < uVar6 ||
          ((1L << ((ulong)uVar6 & 0x3f) & 0x3f0000003fU) == 0)))) goto LAB_007592f0;
      uStack_62 = 0;
      uStack_64 = 0x25;
      uVar4 = func_0x0077e6d0((long)(char)pbVar8[1]);
      uStack_64 = CONCAT11(uVar4,(undefined1)uStack_64);
      uStack_62 = func_0x0077e6d0((long)(char)pbVar8[2]);
      uVar5 = func_0x0074075c(unaff_x19,&uStack_64,3);
      lVar2 = auVar9._8_8_ + -3;
      pbVar8 = pbVar8 + 2;
    }
    if ((lVar2 == 0) || (auVar9._8_8_ = lVar2, auVar9._0_8_ = pbVar8 + 1, (int)uVar5 != 0)) {
      return uVar5;
    }
  } while( true );
}

