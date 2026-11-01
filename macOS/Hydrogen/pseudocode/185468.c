
/* WARNING: Possible PIC construction at 0x00185528: Changing call to branch */
/* WARNING: Possible PIC construction at 0x001854f0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0018552c) */
/* WARNING: Removing unreachable block (ram,0x001854f4) */
/* WARNING: Removing unreachable block (ram,0x001854fc) */
/* WARNING: Removing unreachable block (ram,0x00185500) */

void FUN_00185468(void)

{
  undefined1 *puVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  long lVar6;
  undefined8 *puVar7;
  undefined1 *unaff_x29;
  undefined1 *puVar8;
  undefined1 auStack_c0 [128];
  undefined8 uStack_8;
  
  func_0x0016b144();
  lVar2 = __Unwind_Resume();
  puVar1 = auStack_c0 + 0x80;
  uStack_8 = (undefined *)0x185474;
  puVar8 = auStack_c0 + 0xb0;
  lVar3 = *(long *)(lVar2 + 0x18);
  lVar6 = *(long *)(lVar2 + 0x20);
  if (lVar6 != 0) {
    puVar7 = (undefined8 *)(lVar3 + 0x20);
    do {
      lVar4 = puVar7[-4];
      if (lVar4 != -0x8000000000000000 && lVar4 != 0) {
        lVar3 = puVar7[-3];
        uVar5 = 1;
        uStack_8 = (undefined *)0x1854f4;
        goto code_r0x00187bd4;
      }
      lVar4 = puVar7[-1];
      if (lVar4 == -0x8000000000000000 || lVar4 == 0) {
        lVar4 = puVar7[2];
        if (-0x7fffffffffffffff < lVar4 && lVar4 != 0) {
LAB_00185520:
          lVar3 = puVar7[3];
          uVar5 = 1;
          uStack_8 = &UNK_0018552c;
          puVar1 = auStack_c0 + 0x80;
          goto code_r0x00187bd4;
        }
      }
      else {
        func_0x00187bd4(*puVar7,lVar4,1);
        lVar4 = puVar7[2];
        if (-0x7fffffffffffffff < lVar4 && lVar4 != 0) goto LAB_00185520;
      }
      puVar7 = puVar7 + 9;
      lVar6 = lVar6 + -1;
    } while (lVar6 != 0);
  }
  if (*(long *)(lVar2 + 0x10) == 0) {
    return;
  }
  lVar4 = *(long *)(lVar2 + 0x10) * 0x48;
  uVar5 = 8;
  puVar1 = (undefined1 *)register0x00000008;
  puVar8 = unaff_x29;
code_r0x00187bd4:
  *(undefined1 **)(puVar1 + -0x10) = puVar8;
  *(undefined **)(puVar1 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar3,lVar4,uVar5);
  return;
}

