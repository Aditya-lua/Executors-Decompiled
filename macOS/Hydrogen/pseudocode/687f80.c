
/* WARNING: Possible PIC construction at 0x00688194: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00688258: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006883e4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0068825c) */
/* WARNING: Removing unreachable block (ram,0x006882e0) */
/* WARNING: Removing unreachable block (ram,0x006882f0) */
/* WARNING: Removing unreachable block (ram,0x0068831c) */
/* WARNING: Removing unreachable block (ram,0x00688388) */
/* WARNING: Removing unreachable block (ram,0x006883b8) */
/* WARNING: Removing unreachable block (ram,0x0068839c) */
/* WARNING: Removing unreachable block (ram,0x00688330) */
/* WARNING: Removing unreachable block (ram,0x006883d8) */
/* WARNING: Removing unreachable block (ram,0x0068833c) */
/* WARNING: Removing unreachable block (ram,0x00688354) */
/* WARNING: Removing unreachable block (ram,0x006882e8) */
/* WARNING: Removing unreachable block (ram,0x006882c0) */
/* WARNING: Removing unreachable block (ram,0x0068836c) */
/* WARNING: Removing unreachable block (ram,0x00688198) */
/* WARNING: Removing unreachable block (ram,0x006881dc) */
/* WARNING: Removing unreachable block (ram,0x0068824c) */
/* WARNING: Removing unreachable block (ram,0x00688210) */
/* WARNING: Removing unreachable block (ram,0x006883e8) */

undefined8 * FUN_00687f80(long param_1)

{
  ulong uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  int iVar4;
  ulong uVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 *puVar8;
  char *pcVar9;
  long unaff_x19;
  int unaff_w20;
  long *unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  long *plVar10;
  ulong unaff_x25;
  long unaff_x28;
  undefined8 uStack0000000000000008;
  
  iVar4 = (**(code **)(param_1 + 0xe0))();
  if ((iVar4 == 0) || (uVar5 = (**(code **)(*unaff_x21 + 0x98))(), unaff_x23 <= uVar5)) {
    if (unaff_x23 != 0) {
      do {
        iVar4 = (**(code **)(*unaff_x21 + 0xa0))();
        if (iVar4 == 0) break;
        uStack0000000000000008 = unaff_x23;
        uVar6 = func_0x00699e44(unaff_x19 + (unaff_x25 & 0xffffffff) * 200 + 0x80,
                                &uStack0000000000000008);
        uVar5 = (**(code **)(*unaff_x21 + 0x98))();
        if (uStack0000000000000008 <= uVar5) {
          uVar5 = uStack0000000000000008;
        }
        uVar1 = unaff_x23;
        if (uVar5 <= unaff_x23) {
          uVar1 = uVar5;
        }
        uStack0000000000000008 = uVar1;
        iVar4 = _memcmp(unaff_x22,uVar6,uVar1);
        if (iVar4 != 0) goto LAB_006880b4;
        unaff_x22 = unaff_x22 + uVar1;
        unaff_x23 = unaff_x23 - uVar1;
        (**(code **)(*unaff_x21 + 200))();
      } while (unaff_x23 != 0);
    }
    plVar10 = (long *)(unaff_x28 + (unaff_x24 & 0xffffffff) * 200);
    (**(code **)(*plVar10 + 0x38))(plVar10,unaff_x22,unaff_x23,0,1);
    if (unaff_w20 == 0) {
      return (undefined8 *)0x0;
    }
    uVar5 = (**(code **)(*unaff_x21 + 0xa0))();
    if ((uVar5 & 1) == 0) {
      iVar4 = (**(code **)(*unaff_x21 + 0xe0))();
      if (iVar4 != 0) {
        (**(code **)(*unaff_x21 + 0xe8))();
        return (undefined8 *)0x0;
      }
      iVar4 = (**(code **)(*unaff_x21 + 0x110))();
      if (iVar4 == 0) {
        (**(code **)(*plVar10 + 0x38))(plVar10,0,0,0xffffffff,1);
        return (undefined8 *)0x0;
      }
    }
  }
LAB_006880b4:
  *(undefined1 *)(unaff_x19 + 0x2d) = 1;
  if (*(char *)(unaff_x19 + 0x2c) == '\0') {
    uStack0000000000000008 = uStack0000000000000008 & 0xffffffffffffff00;
    lVar7 = func_0x0066ad70();
    return (undefined8 *)(ulong)(lVar7 != 0);
  }
  puVar8 = (undefined8 *)___cxa_allocate_exception(0x28);
  pcVar9 = (char *)__Znwm(0x48);
  uVar3 = s_EqualityComparisonFilter__did_no_008e968d._48_8_;
  uVar2 = s_EqualityComparisonFilter__did_no_008e968d._32_8_;
  uVar6 = CONCAT17(s_EqualityComparisonFilter__did_no_008e968d[0x3f],
                   s_EqualityComparisonFilter__did_no_008e968d._56_7_);
  *(undefined8 *)(pcVar9 + 0x28) = s_EqualityComparisonFilter__did_no_008e968d._40_8_;
  *(undefined8 *)(pcVar9 + 0x20) = uVar2;
  *(undefined8 *)(pcVar9 + 0x38) = uVar6;
  *(undefined8 *)(pcVar9 + 0x30) = uVar3;
  *(ulong *)(pcVar9 + 0x3f) =
       CONCAT71(s_EqualityComparisonFilter__did_no_008e968d._64_7_,
                s_EqualityComparisonFilter__did_no_008e968d[0x3f]);
  uVar3 = s_EqualityComparisonFilter__did_no_008e968d._24_8_;
  uVar2 = s_EqualityComparisonFilter__did_no_008e968d._16_8_;
  uVar6 = s_EqualityComparisonFilter__did_no_008e968d._0_8_;
  *(undefined8 *)(pcVar9 + 8) = s_EqualityComparisonFilter__did_no_008e968d._8_8_;
  *(undefined8 *)pcVar9 = uVar6;
  *(undefined8 *)(pcVar9 + 0x18) = uVar3;
  *(undefined8 *)(pcVar9 + 0x10) = uVar2;
  pcVar9[0x47] = '\0';
  *puVar8 = &UNK_009b2ec8;
  *(undefined4 *)(puVar8 + 1) = 3;
  func_0x00017634(puVar8 + 2,pcVar9,0x47);
  __ZdlPv(pcVar9);
  *puVar8 = &UNK_00a140f0;
  return puVar8;
}

