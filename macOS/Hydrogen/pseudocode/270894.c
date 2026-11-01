
/* WARNING: Possible PIC construction at 0x00270900: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0027094c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002c6524: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002c64f0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002c64c0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x002c6490: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002c64c4) */
/* WARNING: Removing unreachable block (ram,0x002c64f4) */
/* WARNING: Removing unreachable block (ram,0x002c6528) */
/* WARNING: Removing unreachable block (ram,0x00270950) */
/* WARNING: Removing unreachable block (ram,0x00270954) */
/* WARNING: Removing unreachable block (ram,0x002709b8) */
/* WARNING: Removing unreachable block (ram,0x0027095c) */
/* WARNING: Removing unreachable block (ram,0x00270904) */
/* WARNING: Removing unreachable block (ram,0x002c6494) */

void FUN_00270894(void)

{
  uint uVar1;
  undefined1 *puVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 *unaff_x19;
  long *plVar6;
  undefined8 unaff_x20;
  undefined8 uVar7;
  int unaff_w23;
  undefined8 unaff_x29;
  undefined1 *puVar8;
  undefined8 uVar9;
  undefined *puVar10;
  undefined1 auVar11 [16];
  undefined8 *in_stack_00000000;
  long in_stack_00000008;
  undefined8 in_stack_00000030;
  undefined8 *in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  if (unaff_w23 == 2) {
    puVar3 = (undefined8 *)func_0x002c6894(0x2cc);
    if (puVar3 != (undefined8 *)0x0) {
      lVar4 = func_0x0029c764();
      if (lVar4 == 0) {
        unaff_x19[1] = &UNK_0082ca29;
        unaff_x19[2] = 0xf;
        *unaff_x19 = 1;
        register0x00000008 = (BADSPACEBASE *)&uStack0000000000000050;
        unaff_x19 = in_stack_00000038;
        uVar7 = in_stack_00000030;
        unaff_x29 = in_stack_00000040;
        uVar9 = in_stack_00000048;
      }
      else {
        in_stack_00000000 = puVar3;
        in_stack_00000008 = lVar4;
        auVar11 = func_0x00270298();
        uVar7 = auVar11._8_8_;
        if ((auVar11._0_8_ & 1) == 0) {
          func_0x0029bc0c(lVar4);
          uVar9 = 0x270950;
        }
        else {
          unaff_x19[1] = &UNK_0082ca1a;
          unaff_x19[2] = 0xf;
          *unaff_x19 = 1;
          func_0x0029bc0c(lVar4);
          uVar7 = unaff_x20;
          uVar9 = 0x270904;
        }
      }
      puVar2 = (undefined1 *)((long)register0x00000008 + -0x20);
      *(undefined8 *)((long)register0x00000008 + -0x20) = uVar7;
      *(undefined8 **)((long)register0x00000008 + -0x18) = unaff_x19;
      *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
      *(undefined8 *)((long)register0x00000008 + -8) = uVar9;
      puVar8 = (undefined1 *)((long)register0x00000008 + -0x10);
      if ((puVar3 == (undefined8 *)0x0) ||
         ((*(int *)(puVar3 + 0x44) == 0 && (*(int *)(puVar3 + 0x40) != 0)))) {
        return;
      }
      uVar1 = *(uint *)((long)puVar3 + 0xfc);
      if ((uVar1 >> 1 & 1) == 0) {
        func_0x0036e3d8(puVar3[0x1d]);
        uVar1 = *(uint *)((long)puVar3 + 0xfc);
      }
      puVar5 = puVar3 + 0x1d;
      if ((uVar1 & 1) == 0) {
        *puVar5 = 0;
        uVar1 = *(uint *)((long)puVar3 + 0x114);
        if ((uVar1 >> 1 & 1) == 0) {
          func_0x0036e3d8(puVar3[0x20]);
          uVar1 = *(uint *)((long)puVar3 + 0x114);
        }
        puVar5 = puVar3 + 0x20;
        if ((uVar1 & 1) == 0) {
          *puVar5 = 0;
          uVar1 = *(uint *)((long)puVar3 + 0x13c);
          if ((uVar1 >> 1 & 1) == 0) {
            func_0x0036e3d8(puVar3[0x25]);
            uVar1 = *(uint *)((long)puVar3 + 0x13c);
          }
          puVar5 = puVar3 + 0x25;
          if ((uVar1 & 1) == 0) {
            *puVar5 = 0;
            uVar1 = *(uint *)((long)puVar3 + 0x154);
            if ((uVar1 >> 1 & 1) == 0) {
              func_0x0036e3d8(puVar3[0x28]);
              uVar1 = *(uint *)((long)puVar3 + 0x154);
            }
            puVar5 = puVar3 + 0x28;
            if ((uVar1 & 1) == 0) {
              *puVar5 = 0;
              puVar8 = *(undefined1 **)((long)register0x00000008 + -0x10);
              puVar10 = *(undefined **)((long)register0x00000008 + -8);
              uVar7 = *(undefined8 *)((long)register0x00000008 + -0x20);
              puVar2 = (undefined1 *)register0x00000008;
              puVar5 = puVar3;
              puVar3 = *(undefined8 **)((long)register0x00000008 + -0x18);
            }
            else {
              puVar10 = &UNK_002c6528;
              puVar2 = (undefined1 *)((long)register0x00000008 + -0x20);
            }
          }
          else {
            puVar10 = &UNK_002c64f4;
            puVar2 = (undefined1 *)((long)register0x00000008 + -0x20);
          }
        }
        else {
          puVar10 = &UNK_002c64c4;
          puVar2 = (undefined1 *)((long)register0x00000008 + -0x20);
        }
      }
      else {
        puVar10 = &UNK_002c6494;
      }
      *(undefined8 *)(puVar2 + -0x20) = uVar7;
      *(undefined8 **)(puVar2 + -0x18) = puVar3;
      *(undefined1 **)(puVar2 + -0x10) = puVar8;
      *(undefined **)(puVar2 + -8) = puVar10;
      if (puVar5 == (undefined8 *)0x0) {
        return;
      }
      if (pcRam0000000000a3bef0 == (code *)0x0) {
        plVar6 = puVar5 + -1;
        if (*plVar6 + 8 != 0) {
          _bzero(plVar6,*plVar6 + 8);
        }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)(plVar6);
        return;
      }
      if (lRam0000000000a3bee0 == 0) {
        func_0x0079fc6c();
      }
      else if (lRam0000000000a3bee8 != 0) {
                    /* WARNING: Could not recover jumptable at 0x0036e428. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*pcRam0000000000a3bef0)(puVar5,"",0);
        return;
      }
      auVar11 = func_0x0079fc90();
      *(undefined8 *)(puVar2 + -0x40) = uVar7;
      *(undefined8 **)(puVar2 + -0x38) = puVar5;
      *(undefined1 **)(puVar2 + -0x30) = puVar2 + -0x10;
      *(undefined **)(puVar2 + -0x28) = &_aws_lc_0_24_0_OPENSSL_cleanse;
      if (auVar11._8_8_ != 0) {
        _bzero(auVar11._0_8_);
      }
      return;
    }
  }
  else {
    lVar4 = func_0x002d9bd4(0x3b4,0);
    if (lVar4 != 0) {
      unaff_x19[1] = 3;
      unaff_x19[2] = lVar4;
      *unaff_x19 = 0;
      return;
    }
  }
  unaff_x19[1] = &UNK_0082ca29;
  unaff_x19[2] = 0xf;
  *unaff_x19 = 1;
  return;
}

