
/* WARNING: Possible PIC construction at 0x006e6448: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006e6504: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006e652c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006e655c: Changing call to branch */

void FUN_006e643c(void)

{
  undefined1 *puVar1;
  int iVar2;
  undefined8 uVar3;
  char *pcVar4;
  undefined8 uVar5;
  long lVar6;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  undefined1 *unaff_x29;
  undefined *puVar7;
  undefined1 auVar8 [16];
  
  auVar8._8_8_ = unaff_x20;
  auVar8._0_8_ = unaff_x19;
  pcVar4 = "invalid argument #%d to \'%s\' (%s)";
  puVar7 = (undefined *)0x6e644c;
  puVar1 = (undefined1 *)register0x00000008;
  do {
    while( true ) {
      uVar3 = auVar8._0_8_;
      *(long *)(puVar1 + -0x20) = auVar8._8_8_;
      *(undefined8 *)(puVar1 + -0x18) = uVar3;
      *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
      *(undefined **)(puVar1 + -8) = puVar7;
      *(undefined1 **)(puVar1 + -0x28) = puVar1;
      func_0x006e6594();
      uVar5 = *(undefined8 *)(puVar1 + -0x28);
      func_0x006e3a18(uVar3,pcVar4);
      func_0x006e5524(uVar3,2);
      auVar8 = func_0x006e52d0(uVar3);
      auVar8._8_8_ = auVar8._8_8_;
      auVar8._0_8_ = auVar8._0_8_;
      *(long *)(puVar1 + -0x60) = unaff_x22;
      *(undefined8 *)(puVar1 + -0x58) = unaff_x21;
      *(undefined8 *)(puVar1 + -0x50) = uVar3;
      *(char **)(puVar1 + -0x48) = pcVar4;
      *(undefined1 **)(puVar1 + -0x40) = puVar1 + -0x10;
      *(undefined **)(puVar1 + -0x38) = &DAT_006e6498;
      unaff_x29 = puVar1 + -0x40;
      if (((*(ulong *)(auVar8._0_8_ + 0x40) < *(ulong *)(auVar8._0_8_ + 0x20)) &&
          (lVar6 = **(long **)(*(ulong *)(auVar8._0_8_ + 0x20) + 8), lVar6 != 0)) &&
         (*(char *)(lVar6 + 3) != '\0')) {
        unaff_x22 = (lVar6 + 0x28) - *(long *)(lVar6 + 0x28);
        if ((unaff_x22 != 0) && (iVar2 = _strcmp(unaff_x22,"__namecall"), iVar2 == 0)) {
          unaff_x22 = 0;
          if (*(long *)(auVar8._0_8_ + 0x70) != 0) {
            unaff_x22 = *(long *)(auVar8._0_8_ + 0x70) + 0x18;
          }
        }
      }
      else {
        unaff_x22 = 0;
      }
      lVar6 = func_0x006e1710(auVar8._0_8_,auVar8._8_8_);
      unaff_x21 = uVar5;
      if (lVar6 != 0) break;
      if (unaff_x22 == 0) {
        *(undefined8 *)(puVar1 + -0x80) = auVar8._8_8_;
        *(undefined8 *)(puVar1 + -0x78) = uVar5;
        pcVar4 = "missing argument #%d (%s expected)";
        puVar7 = (undefined *)0x6e6508;
        puVar1 = puVar1 + -0x80;
      }
      else {
        *(long *)(puVar1 + -0x78) = unaff_x22;
        *(undefined8 *)(puVar1 + -0x70) = uVar5;
        *(undefined8 *)(puVar1 + -0x80) = auVar8._8_8_;
        uVar3 = func_0x006e644c(auVar8._0_8_,"missing argument #%d to \'%s\' (%s expected)");
code_r0x006e6548:
        *(undefined8 *)(puVar1 + -0x70) = uVar5;
        *(undefined8 *)(puVar1 + -0x68) = uVar3;
        *(undefined8 *)(puVar1 + -0x80) = auVar8._8_8_;
        *(long *)(puVar1 + -0x78) = unaff_x22;
        pcVar4 = "invalid argument #%d to \'%s\' (%s expected, got %s)";
        puVar7 = &LAB_006e6560;
        puVar1 = puVar1 + -0x80;
      }
    }
    uVar3 = func_0x006fe8d4(auVar8._0_8_,lVar6);
    if (unaff_x22 != 0) goto code_r0x006e6548;
    *(undefined8 *)(puVar1 + -0x78) = uVar5;
    *(undefined8 *)(puVar1 + -0x70) = uVar3;
    *(undefined8 *)(puVar1 + -0x80) = auVar8._8_8_;
    pcVar4 = "invalid argument #%d (%s expected, got %s)";
    puVar7 = &LAB_006e6530;
    puVar1 = puVar1 + -0x80;
  } while( true );
}

