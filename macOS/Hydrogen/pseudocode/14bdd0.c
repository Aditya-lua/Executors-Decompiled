
/* WARNING: Possible PIC construction at 0x0014be38: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0014be3c) */
/* WARNING: Removing unreachable block (ram,0x0014be50) */
/* WARNING: Removing unreachable block (ram,0x0014becc) */
/* WARNING: Removing unreachable block (ram,0x0014bf2c) */
/* WARNING: Removing unreachable block (ram,0x0014bf54) */
/* WARNING: Removing unreachable block (ram,0x0014bf80) */
/* WARNING: Removing unreachable block (ram,0x0014bfbc) */
/* WARNING: Removing unreachable block (ram,0x0014bfc8) */
/* WARNING: Removing unreachable block (ram,0x0014bff8) */
/* WARNING: Removing unreachable block (ram,0x0014c004) */
/* WARNING: Removing unreachable block (ram,0x0014bf64) */
/* WARNING: Removing unreachable block (ram,0x0014bf38) */
/* WARNING: Removing unreachable block (ram,0x0014bf6c) */
/* WARNING: Removing unreachable block (ram,0x0014c05c) */
/* WARNING: Removing unreachable block (ram,0x0014bf74) */
/* WARNING: Removing unreachable block (ram,0x0014c060) */
/* WARNING: Removing unreachable block (ram,0x0014bf40) */
/* WARNING: Removing unreachable block (ram,0x0014bea0) */
/* WARNING: Removing unreachable block (ram,0x0014c148) */
/* WARNING: Removing unreachable block (ram,0x0014c1cc) */
/* WARNING: Removing unreachable block (ram,0x0014c1a0) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0014bdd0(void)

{
  undefined8 uVar1;
  long lVar2;
  long unaff_x21;
  undefined8 *puVar3;
  float fVar4;
  float fVar5;
  float fVar6;
  float fVar7;
  undefined *puStack_100;
  undefined8 uStack_f8;
  undefined *puStack_f0;
  undefined *puStack_e8;
  undefined8 uStack_e0;
  undefined8 uStack_d8;
  undefined1 *puStack_d0;
  undefined *puStack_c8;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  double dStack_a8;
  double dStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  float fStack_88;
  undefined8 uStack_84;
  undefined8 uStack_7c;
  float fStack_74;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  long lStack_48;
  undefined1 auStack_6 [6];
  
  func_0x007b78e0();
  func_0x007b6900();
  uVar1 = func_0x007b68e0();
  func_0x007b6900();
  func_0x007b68e0();
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  lVar2 = func_0x000bae3c();
  if (lVar2 == 0) {
    puVar3 = (undefined8 *)0x0;
  }
  else {
    lVar2 = func_0x000c2db8();
    puVar3 = *(undefined8 **)(lVar2 + 0x90);
  }
  func_0x007b75e0();
  func_0x007b68c0(*puVar3);
  func_0x007b7680();
  uStack_b8 = 0;
  uStack_b0 = 0;
  dStack_a8 = (double)((float)*(undefined8 *)(unaff_x21 + 0x28) *
                      (float)*(undefined8 *)(unaff_x21 + 0x30));
  dStack_a0 = (double)((float)((ulong)*(undefined8 *)(unaff_x21 + 0x28) >> 0x20) *
                      (float)((ulong)*(undefined8 *)(unaff_x21 + 0x30) >> 0x20));
  uStack_90 = _UNK_00813828;
  uStack_98 = _UNK_00813820;
  func_0x007b7c80();
  uStack_7c = 0;
  uStack_84 = 0;
  uStack_70 = 0;
  uStack_68 = 0;
  fVar4 = (float)*(undefined8 *)(unaff_x21 + 0x20);
  fVar6 = fVar4 + (float)*(undefined8 *)(unaff_x21 + 0x28);
  fVar5 = (float)((ulong)*(undefined8 *)(unaff_x21 + 0x20) >> 0x20);
  fVar7 = fVar5 + (float)((ulong)*(undefined8 *)(unaff_x21 + 0x28) >> 0x20);
  fStack_88 = 2.0 / (fVar6 - fVar4);
  fStack_74 = 2.0 / (fVar5 - fVar7);
  uStack_58 = CONCAT44((fVar5 + fVar7) / (fVar7 - fVar5),(fVar4 + fVar6) / (fVar4 - fVar6));
  uStack_60 = _UNK_0080c198;
  uStack_50 = _UNK_0080c128;
  func_0x007b7be0();
  func_0x007b79a0();
  func_0x007b6400(uVar1);
  func_0x007b7ba0();
  func_0x007b7bc0();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
    return;
  }
  lVar2 = ___stack_chk_fail();
  puStack_c8 = &DAT_0014c354;
  puStack_100 = PTR___NSConcreteStackBlock_009b0030;
  uStack_f8 = _UNK_0080be50;
  puStack_f0 = &DAT_0014c3b0;
  puStack_e8 = &UNK_009bd808;
  uStack_d8 = *(undefined8 *)(lVar2 + 0x28);
  uStack_e0 = *(undefined8 *)(lVar2 + 0x20);
  puStack_d0 = auStack_6 + -10;
  _dispatch_async(PTR___dispatch_main_q_009b0208,&puStack_100);
  return;
}

