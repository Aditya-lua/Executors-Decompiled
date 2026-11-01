
/* WARNING: Possible PIC construction at 0x00248ecc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00249010: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00249084: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002490c8: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00249014) */
/* WARNING: Removing unreachable block (ram,0x0024906c) */
/* WARNING: Removing unreachable block (ram,0x00249074) */
/* WARNING: Removing unreachable block (ram,0x00249088) */
/* WARNING: Removing unreachable block (ram,0x00249094) */
/* WARNING: Removing unreachable block (ram,0x002490b0) */
/* WARNING: Removing unreachable block (ram,0x002490b8) */
/* WARNING: Removing unreachable block (ram,0x002490cc) */
/* WARNING: Removing unreachable block (ram,0x002490c0) */
/* WARNING: Removing unreachable block (ram,0x0024907c) */

void FUN_00248eb8(long param_1,undefined8 param_2,long param_3)

{
  ulong uVar1;
  undefined1 *puVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  long *plVar7;
  ulong uVar8;
  long lVar9;
  undefined8 uVar10;
  undefined1 *puVar11;
  undefined1 *unaff_x29;
  undefined1 auVar12 [16];
  long in_stack_00000000;
  undefined1 auStack_78 [56];
  undefined8 uStack_8;
  
  if (param_1 != -0x8000000000000000) {
    uStack_8 = 0x248ed0;
    puVar2 = (undefined1 *)register0x00000008;
    lVar3 = in_stack_00000000;
    puVar11 = unaff_x29;
    goto code_r0x00187bd4;
  }
  auVar12 = __Unwind_Resume();
  plVar7 = auVar12._8_8_;
  lVar4 = auVar12._0_8_;
  puVar2 = auStack_78 + 0x38;
  uStack_8 = 0x248ed8;
  puVar11 = auStack_78 + 0x68;
  param_3 = *plVar7;
  lVar3 = plVar7[1];
  lVar9 = plVar7[2];
  if (param_3 == -0x8000000000000000) {
    if (lVar9 < 0) {
      uVar10 = 0;
LAB_00248fe8:
      func_0x007a1f00(uVar10,lVar9,&UNK_009c6fd0);
      uStack_8 = 0x249014;
      goto code_r0x00187bd4;
    }
    if (lVar9 == 0) {
      lVar5 = 1;
    }
    else {
      uVar10 = 1;
      lVar5 = func_0x00187bd0(lVar9,1);
      if (lVar5 == 0) goto LAB_00248fe8;
    }
    _memcpy(lVar5,lVar3,lVar9);
    lVar3 = lVar5;
    param_3 = lVar9;
  }
  if (lVar9 == 0) {
    if (param_3 != 0) {
      puVar2 = (undefined1 *)register0x00000008;
      puVar11 = unaff_x29;
code_r0x00187bd4:
      *(undefined1 **)(puVar2 + -0x10) = puVar11;
      *(undefined8 *)(puVar2 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lVar3,param_3,1);
      return;
    }
  }
  else {
    uVar6 = *(ulong *)(lVar4 + 0x60);
    uVar8 = *(ulong *)(lVar4 + 0x78);
    if (uVar8 == uVar6) {
      func_0x00242e68((ulong *)(lVar4 + 0x60),&UNK_009c2c40);
      uVar8 = *(ulong *)(lVar4 + 0x78);
      uVar6 = *(ulong *)(lVar4 + 0x60);
    }
    uVar8 = *(long *)(lVar4 + 0x70) + uVar8;
    uVar1 = 0;
    if (uVar6 <= uVar8) {
      uVar1 = uVar6;
    }
    plVar7 = (long *)(*(long *)(lVar4 + 0x68) + (uVar8 - uVar1) * 0x18);
    *plVar7 = param_3;
    plVar7[1] = lVar3;
    plVar7[2] = lVar9;
    *(long *)(lVar4 + 0x78) = *(long *)(lVar4 + 0x78) + 1;
  }
  return;
}

