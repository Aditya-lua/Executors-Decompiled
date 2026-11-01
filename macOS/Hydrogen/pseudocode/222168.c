
/* WARNING: Possible PIC construction at 0x0022221c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00222260: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00222294: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002222bc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0022330c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00222264) */

void FUN_00222168(void)

{
  undefined8 *puVar1;
  undefined1 *puVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  undefined8 uVar6;
  long *unaff_x19;
  long *plVar7;
  undefined1 *puVar8;
  undefined1 *unaff_x29;
  undefined1 auStack_c0 [128];
  undefined8 uStack_8;
  
  func_0x001cbba4();
  if (*unaff_x19 != -0x8000000000000000) {
    func_0x00222b5c();
  }
  func_0x00209524(unaff_x19 + 0x19);
  func_0x00221a70(unaff_x19 + 0x12);
  __Unwind_Resume();
  plVar4 = (long *)func_0x007a2668();
  uStack_8 = (undefined *)0x2221a8;
  puVar8 = auStack_c0 + 0xb0;
  lVar3 = *(long *)plVar4[0x32];
  *(long *)plVar4[0x32] = lVar3 + -1;
  LORelease();
  if (lVar3 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9b44(plVar4 + 0x32);
  }
  if (plVar4[0xd] != -0x8000000000000000) {
    func_0x00222b5c();
  }
  if (((*(byte *)(plVar4 + 0x2e) & 1) == 0) &&
     (lVar3 = plVar4[0x2f], lVar3 != -0x8000000000000000 && lVar3 != 0)) {
    lVar5 = plVar4[0x30];
    uVar6 = 1;
    uStack_8 = &UNK_00222220;
    puVar2 = auStack_c0 + 0x80;
  }
  else {
    func_0x00221a70(plVar4 + 0x1f);
    lVar5 = plVar4[2];
    if (lVar5 != 0) {
      plVar7 = (long *)(plVar4[1] + 8);
      do {
        lVar3 = plVar7[-1];
        if (lVar3 != -0x8000000000000000 && lVar3 != 0) {
          lVar5 = *plVar7;
          uVar6 = 1;
          uStack_8 = &UNK_00222264;
          puVar2 = auStack_c0 + 0x80;
          goto code_r0x00187bd4;
        }
        plVar7 = plVar7 + 3;
        lVar5 = lVar5 + -1;
      } while (lVar5 != 0);
    }
    if (*plVar4 != 0) {
      func_0x00187bd4(plVar4[1],*plVar4 * 0x18,8);
    }
    lVar3 = plVar4[3];
    if (lVar3 == 0) {
      if (plVar4[6] != 0) {
        func_0x00187bd4(plVar4[7],plVar4[6],1);
      }
      lVar3 = plVar4[9];
      if (lVar3 == 0) {
        plVar7 = plVar4 + 0x26;
        puVar2 = auStack_c0 + 0x90;
        puVar8 = auStack_c0 + 0xb0;
        if (*plVar7 != -0x7ffffffffffffffe) {
          if (*plVar7 == -0x7fffffffffffffff) {
            plVar7 = plVar4 + 0x27;
            lVar3 = *plVar7;
          }
          else {
            lVar3 = *(long *)plVar4[0x29];
            *(long *)plVar4[0x29] = lVar3 + -1;
            LORelease();
            if (lVar3 == 1) {
              DataMemoryBarrier(2,1);
              func_0x001f9f8c();
            }
            lVar5 = plVar4[0x2a];
            puVar1 = (undefined8 *)plVar4[0x2b];
            if ((code *)*puVar1 != (code *)0x0) {
              (*(code *)*puVar1)(lVar5);
            }
            lVar3 = puVar1[1];
            if (lVar3 != 0) {
              uVar6 = puVar1[2];
              uStack_8 = (undefined *)0x223310;
              goto code_r0x00187bd4;
            }
            lVar3 = *plVar7;
          }
          if ((lVar3 != -0x8000000000000000) && (lVar3 != 0)) {
            lVar5 = plVar7[1];
            uVar6 = 1;
            puVar2 = (undefined1 *)register0x00000008;
            puVar8 = unaff_x29;
            goto code_r0x00187bd4;
          }
        }
        return;
      }
      lVar5 = plVar4[10];
      uVar6 = 1;
      uStack_8 = &UNK_002222c0;
      puVar2 = auStack_c0 + 0x80;
    }
    else {
      lVar5 = plVar4[4];
      uVar6 = 1;
      uStack_8 = &UNK_00222298;
      puVar2 = auStack_c0 + 0x80;
    }
  }
code_r0x00187bd4:
  *(undefined1 **)(puVar2 + -0x10) = puVar8;
  *(undefined **)(puVar2 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar5,lVar3,uVar6);
  return;
}

