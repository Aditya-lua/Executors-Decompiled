
/* WARNING: Possible PIC construction at 0x006e642c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006e6504: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006e652c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006e655c: Changing call to branch */

void FUN_006e6408(void)

{
  undefined1 *puVar1;
  int iVar2;
  undefined8 uVar3;
  char *pcVar4;
  long lVar5;
  long lVar6;
  long unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined1 *unaff_x29;
  undefined *puVar7;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined8 in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  
  auVar9._8_8_ = unaff_x20;
  auVar9._0_8_ = unaff_x19;
  auVar8._8_8_ = unaff_x20;
  auVar8._0_8_ = unaff_x19;
  iVar2 = _strcmp();
  puVar1 = (undefined1 *)register0x00000008;
  if (iVar2 == 0) {
    if (*(long *)(unaff_x19 + 0x70) == 0) {
      pcVar4 = "invalid argument #%d (%s)";
      puVar7 = (undefined *)0x6e6430;
      in_stack_00000008 = unaff_x21;
      auVar9 = auVar8;
      goto code_r0x006e644c;
    }
    unaff_x22 = *(long *)(unaff_x19 + 0x70) + 0x18;
  }
  puVar7 = &SUB_006e644c;
  in_stack_00000008 = unaff_x22;
  in_stack_00000010 = unaff_x21;
  auVar8 = func_0x006e644c();
  pcVar4 = auVar8._8_8_;
  unaff_x19 = auVar8._0_8_;
code_r0x006e644c:
  do {
    while( true ) {
      *(long *)(puVar1 + -0x20) = auVar9._8_8_;
      *(long *)(puVar1 + -0x18) = auVar9._0_8_;
      *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
      *(undefined **)(puVar1 + -8) = puVar7;
      *(undefined1 **)(puVar1 + -0x28) = puVar1;
      func_0x006e6594();
      lVar5 = *(long *)(puVar1 + -0x28);
      func_0x006e3a18(unaff_x19,pcVar4);
      func_0x006e5524(unaff_x19,2);
      auVar9 = func_0x006e52d0(unaff_x19);
      auVar9._8_8_ = auVar9._8_8_;
      auVar9._0_8_ = auVar9._0_8_;
      *(long *)(puVar1 + -0x60) = unaff_x22;
      *(long *)(puVar1 + -0x58) = unaff_x21;
      *(long *)(puVar1 + -0x50) = unaff_x19;
      *(char **)(puVar1 + -0x48) = pcVar4;
      *(undefined1 **)(puVar1 + -0x40) = puVar1 + -0x10;
      *(undefined **)(puVar1 + -0x38) = &SUB_006e6498;
      unaff_x29 = puVar1 + -0x40;
      if (((*(ulong *)(auVar9._0_8_ + 0x40) < *(ulong *)(auVar9._0_8_ + 0x20)) &&
          (lVar6 = **(long **)(*(ulong *)(auVar9._0_8_ + 0x20) + 8), lVar6 != 0)) &&
         (*(char *)(lVar6 + 3) != '\0')) {
        unaff_x22 = (lVar6 + 0x28) - *(long *)(lVar6 + 0x28);
        if ((unaff_x22 != 0) && (iVar2 = _strcmp(unaff_x22,"__namecall"), iVar2 == 0)) {
          unaff_x22 = 0;
          if (*(long *)(auVar9._0_8_ + 0x70) != 0) {
            unaff_x22 = *(long *)(auVar9._0_8_ + 0x70) + 0x18;
          }
        }
      }
      else {
        unaff_x22 = 0;
      }
      lVar6 = func_0x006e1710(auVar9._0_8_,auVar9._8_8_);
      unaff_x19 = auVar9._0_8_;
      unaff_x21 = lVar5;
      if (lVar6 != 0) break;
      if (unaff_x22 == 0) {
        *(undefined8 *)(puVar1 + -0x80) = auVar9._8_8_;
        *(long *)(puVar1 + -0x78) = lVar5;
        pcVar4 = "missing argument #%d (%s expected)";
        puVar7 = &UNK_006e6508;
        puVar1 = puVar1 + -0x80;
      }
      else {
        *(long *)(puVar1 + -0x78) = unaff_x22;
        *(long *)(puVar1 + -0x70) = lVar5;
        *(undefined8 *)(puVar1 + -0x80) = auVar9._8_8_;
        uVar3 = func_0x006e644c(auVar9._0_8_,"missing argument #%d to \'%s\' (%s expected)");
LAB_006e6548:
        *(long *)(puVar1 + -0x70) = lVar5;
        *(undefined8 *)(puVar1 + -0x68) = uVar3;
        *(undefined8 *)(puVar1 + -0x80) = auVar9._8_8_;
        *(long *)(puVar1 + -0x78) = unaff_x22;
        pcVar4 = "invalid argument #%d to \'%s\' (%s expected, got %s)";
        puVar7 = (undefined *)0x6e6560;
        puVar1 = puVar1 + -0x80;
      }
    }
    uVar3 = func_0x006fe8d4(auVar9._0_8_,lVar6);
    if (unaff_x22 != 0) goto LAB_006e6548;
    *(long *)(puVar1 + -0x78) = lVar5;
    *(undefined8 *)(puVar1 + -0x70) = uVar3;
    *(undefined8 *)(puVar1 + -0x80) = auVar9._8_8_;
    pcVar4 = "invalid argument #%d (%s expected, got %s)";
    puVar7 = (undefined *)0x6e6530;
    puVar1 = puVar1 + -0x80;
  } while( true );
}

