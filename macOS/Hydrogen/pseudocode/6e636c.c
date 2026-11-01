
/* WARNING: Possible PIC construction at 0x006e642c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006e6504: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006e652c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006e655c: Changing call to branch */

void FUN_006e636c(undefined8 param_1,undefined8 param_2,long param_3)

{
  undefined8 *puVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  long unaff_x22;
  undefined1 *puVar8;
  undefined *puVar9;
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined8 uStack_50;
  long lStack_48;
  long lStack_40;
  undefined1 auStack_38 [8];
  
  ___cxa_guard_abort(0xa28b90);
  uVar3 = __Unwind_Resume();
  ___cxa_guard_abort(0xa28b80);
  uVar3 = __Unwind_Resume(uVar3);
  ___cxa_guard_abort(0xa28b70);
  auVar10 = __Unwind_Resume(uVar3);
  uStack_50 = auVar10._8_8_;
  lVar4 = auVar10._0_8_;
  puVar8 = auStack_38 + 0x28;
  if ((((*(ulong *)(lVar4 + 0x40) < *(ulong *)(lVar4 + 0x20)) &&
       (lVar6 = **(long **)(*(ulong *)(lVar4 + 0x20) + 8), lVar6 != 0)) &&
      (*(char *)(lVar6 + 3) != '\0')) &&
     (unaff_x22 = (lVar6 + 0x28) - *(long *)(lVar6 + 0x28), unaff_x22 != 0)) {
    iVar2 = _strcmp(unaff_x22,"__namecall");
    if (iVar2 == 0) {
      if (*(long *)(lVar4 + 0x70) == 0) goto code_r0x006e641c;
      unaff_x22 = *(long *)(lVar4 + 0x70) + 0x18;
    }
    puVar9 = &SUB_006e644c;
    lStack_48 = unaff_x22;
    lStack_40 = param_3;
    auVar11 = func_0x006e644c(lVar4,"invalid argument #%d to \'%s\' (%s)");
    puVar1 = &uStack_50;
  }
  else {
code_r0x006e641c:
    auVar11._8_8_ = "invalid argument #%d (%s)";
    auVar11._0_8_ = lVar4;
    puVar9 = (undefined *)0x6e6430;
    puVar1 = &uStack_50;
    lStack_48 = param_3;
  }
  do {
    while( true ) {
      uVar3 = auVar11._0_8_;
      *(long *)((long)puVar1 + -0x20) = auVar10._8_8_;
      *(long *)((long)puVar1 + -0x18) = auVar10._0_8_;
      *(undefined1 **)((long)puVar1 + -0x10) = puVar8;
      *(undefined **)((long)puVar1 + -8) = puVar9;
      *(undefined8 **)((long)puVar1 + -0x28) = puVar1;
      func_0x006e6594(uVar3,1);
      lVar6 = *(long *)((long)puVar1 + -0x28);
      func_0x006e3a18(uVar3,auVar11._8_8_);
      func_0x006e5524(uVar3,2);
      auVar10 = func_0x006e52d0(uVar3);
      uVar3 = auVar10._8_8_;
      lVar4 = auVar10._0_8_;
      *(long *)((long)puVar1 + -0x60) = unaff_x22;
      *(long *)((long)puVar1 + -0x58) = param_3;
      *(undefined1 (*) [16])((long)puVar1 + -0x50) = auVar11;
      *(undefined1 **)((long)puVar1 + -0x40) = (undefined1 *)((long)puVar1 + -0x10);
      *(undefined **)((long)puVar1 + -0x38) = &SUB_006e6498;
      puVar8 = (undefined1 *)((long)puVar1 + -0x40);
      if (((*(ulong *)(lVar4 + 0x40) < *(ulong *)(lVar4 + 0x20)) &&
          (lVar7 = **(long **)(*(ulong *)(lVar4 + 0x20) + 8), lVar7 != 0)) &&
         (*(char *)(lVar7 + 3) != '\0')) {
        unaff_x22 = (lVar7 + 0x28) - *(long *)(lVar7 + 0x28);
        if ((unaff_x22 != 0) && (iVar2 = _strcmp(unaff_x22,"__namecall"), iVar2 == 0)) {
          unaff_x22 = 0;
          if (*(long *)(lVar4 + 0x70) != 0) {
            unaff_x22 = *(long *)(lVar4 + 0x70) + 0x18;
          }
        }
      }
      else {
        unaff_x22 = 0;
      }
      lVar7 = func_0x006e1710(lVar4,uVar3);
      param_3 = lVar6;
      if (lVar7 != 0) break;
      if (unaff_x22 == 0) {
        *(undefined8 *)((long)puVar1 + -0x80) = uVar3;
        *(long *)((long)puVar1 + -0x78) = lVar6;
        auVar11._8_8_ = "missing argument #%d (%s expected)";
        auVar11._0_8_ = lVar4;
        puVar9 = &UNK_006e6508;
        puVar1 = (undefined8 *)((long)puVar1 + -0x80);
      }
      else {
        *(long *)((long)puVar1 + -0x78) = unaff_x22;
        *(long *)((long)puVar1 + -0x70) = lVar6;
        *(undefined8 *)((long)puVar1 + -0x80) = uVar3;
        uVar5 = func_0x006e644c(lVar4,"missing argument #%d to \'%s\' (%s expected)");
LAB_006e6548:
        *(long *)((long)puVar1 + -0x70) = lVar6;
        *(undefined8 *)((long)puVar1 + -0x68) = uVar5;
        *(undefined8 *)((long)puVar1 + -0x80) = uVar3;
        *(long *)((long)puVar1 + -0x78) = unaff_x22;
        auVar11._8_8_ = "invalid argument #%d to \'%s\' (%s expected, got %s)";
        auVar11._0_8_ = lVar4;
        puVar9 = (undefined *)0x6e6560;
        puVar1 = (undefined8 *)((long)puVar1 + -0x80);
      }
    }
    uVar5 = func_0x006fe8d4(lVar4,lVar7);
    if (unaff_x22 != 0) goto LAB_006e6548;
    *(long *)((long)puVar1 + -0x78) = lVar6;
    *(undefined8 *)((long)puVar1 + -0x70) = uVar5;
    *(undefined8 *)((long)puVar1 + -0x80) = uVar3;
    auVar11._8_8_ = "invalid argument #%d (%s expected, got %s)";
    auVar11._0_8_ = lVar4;
    puVar9 = (undefined *)0x6e6530;
    puVar1 = (undefined8 *)((long)puVar1 + -0x80);
  } while( true );
}

