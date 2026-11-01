
undefined1  [16] FUN_0052114c(void)

{
  char *pcVar1;
  undefined1 in_ZR;
  int iVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long *unaff_x19;
  undefined8 unaff_x20;
  long *plVar6;
  long unaff_x21;
  undefined8 *unaff_x22;
  undefined8 *unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long lVar7;
  long unaff_x27;
  undefined8 *unaff_x28;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  long *plStack_28;
  undefined8 uStack_20;
  
  do {
    lVar7 = unaff_x27;
    if ((bool)in_ZR) goto LAB_005210f8;
    while ((unaff_x28[1] == unaff_x21 &&
           (iVar2 = _memcmp(*unaff_x28,unaff_x20,unaff_x21), iVar2 == 0))) {
      lVar7 = unaff_x27;
      if ((*(byte *)(unaff_x28 + 7) >> 2 & 1) == 0) {
LAB_00521180:
        *unaff_x19 = (long)unaff_x22;
        auVar9._8_8_ = unaff_x21;
        auVar9._0_8_ = unaff_x20;
        return auVar9;
      }
LAB_005210f8:
      do {
        puVar3 = unaff_x22;
        if (puVar3 == unaff_x23) {
          unaff_x20 = 0;
          unaff_x22 = puVar3;
          goto LAB_00521180;
        }
        unaff_x22 = puVar3 + 2;
        if (lVar7 == unaff_x26) {
          *unaff_x19 = (long)unaff_x22;
          auVar8 = func_0x007a23bc(&UNK_009e9bf8);
          uVar4 = auVar8._8_8_;
          auVar8._0_8_ = auVar8._0_8_;
          if (*auVar8._0_8_ == 0) {
code_r0x00521240:
            puVar3 = (undefined8 *)auVar8._0_8_[10];
            if (puVar3 == (undefined8 *)0x0 || puVar3 == (undefined8 *)auVar8._0_8_[0xb]) {
              uVar5 = 0;
              goto code_r0x00521264;
            }
            auVar8._0_8_[10] = (long)(puVar3 + 2);
          }
          else {
            plVar6 = auVar8._0_8_ + 3;
            uStack_20 = unaff_x20;
            if (*plVar6 == 0) {
code_r0x005211fc:
              plStack_28 = auVar8._0_8_;
              auVar8._0_8_[3] = 0;
              if (auVar8._0_8_[7] != 0) {
                auVar9 = func_0x00520618(auVar8._0_8_ + 7,&plStack_28,plVar6);
                auVar8._8_8_ = auVar9._8_8_;
                auVar8._0_8_ = plStack_28;
                puVar3 = auVar9._0_8_;
                if (puVar3 != (undefined8 *)0x0) goto code_r0x00521260;
              }
              uVar4 = auVar8._8_8_;
              plStack_28 = auVar8._0_8_;
              auVar8._0_8_[3] = 0;
              if (auVar8._0_8_[5] != 0) {
                auVar9 = func_0x0051fe6c(auVar8._0_8_ + 5,&plStack_28);
                uVar4 = auVar9._8_8_;
                puVar3 = auVar9._0_8_;
                if (puVar3 != (undefined8 *)0x0) goto code_r0x00521260;
              }
              auVar8._0_8_[5] = 0;
              *auVar8._0_8_ = 0;
              goto code_r0x00521240;
            }
            plStack_28 = auVar8._0_8_;
            auVar9 = func_0x0051fe6c(plVar6,&plStack_28);
            auVar8._8_8_ = auVar9._8_8_;
            auVar8._0_8_ = plStack_28;
            puVar3 = auVar9._0_8_;
            if (puVar3 == (undefined8 *)0x0) goto code_r0x005211fc;
          }
code_r0x00521260:
          uVar5 = *puVar3;
          uVar4 = puVar3[1];
code_r0x00521264:
          auVar10._8_8_ = uVar4;
          auVar10._0_8_ = uVar5;
          return auVar10;
        }
        unaff_x27 = lVar7 + 0x68;
        unaff_x19[2] = unaff_x27;
        pcVar1 = (char *)(lVar7 + 0x61);
        lVar7 = unaff_x27;
      } while ((*pcVar1 == '\0') || (*(long *)(unaff_x24 + 0x90) == 0));
      unaff_x20 = *puVar3;
      unaff_x21 = puVar3[1];
      unaff_x28 = (undefined8 *)(*(long *)(unaff_x24 + 0x88) + 0x218);
      unaff_x25 = *(long *)(unaff_x24 + 0x90) * 600;
    }
    unaff_x28 = unaff_x28 + 0x4b;
    unaff_x25 = unaff_x25 + -600;
    in_ZR = unaff_x25 == 0;
  } while( true );
}

