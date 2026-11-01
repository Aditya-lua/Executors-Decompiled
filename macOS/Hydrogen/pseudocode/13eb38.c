
/* WARNING: Possible PIC construction at 0x0013ec1c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0013ec20) */
/* WARNING: Removing unreachable block (ram,0x0013ec58) */
/* WARNING: Removing unreachable block (ram,0x0013ec4c) */
/* WARNING: Removing unreachable block (ram,0x0013ec54) */
/* WARNING: Removing unreachable block (ram,0x0013ec68) */

void FUN_0013eb38(long param_1)

{
  char *pcVar1;
  char *pcVar2;
  int iVar3;
  undefined1 *puVar4;
  long *plVar5;
  char *pcVar6;
  long unaff_x19;
  int *unaff_x20;
  long lVar7;
  long unaff_x29;
  undefined8 unaff_x30;
  char acStack_f1 [41];
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  long lStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  
  pcVar2 = acStack_f1 + 0x21;
  lVar7 = (long)register0x00000008 + -0x10;
  if (*(char *)(param_1 + 0x59) == '\0') {
    unaff_x20 = (int *)(param_1 + 0x20);
    if (*(int *)(param_1 + 0x28) == *unaff_x20) {
      if (*(int *)(param_1 + 0x2c) <= *(int *)(param_1 + 0x24)) {
        return;
      }
    }
    else if (*(int *)(param_1 + 0x28) <= *unaff_x20) {
      return;
    }
    uStack_38 = 0;
    uStack_40 = 0;
    uStack_88 = 0;
    uStack_90 = 0;
    lStack_78 = 0;
    uStack_80 = 0;
    uStack_a8 = 0;
    uStack_b0 = 0;
    uStack_98 = 0;
    uStack_a0 = 0;
    uStack_58 = *(undefined8 *)(param_1 + 0x28);
    uStack_60 = *(undefined8 *)unaff_x20;
    uStack_68 = 0;
    uStack_70 = 0;
    uStack_48 = 0;
    uStack_50 = *(undefined8 *)(param_1 + 0x30);
    func_0x001377f0(&uStack_c8,param_1,unaff_x20);
    if (lStack_78 < 0) {
      __ZdlPv(uStack_88);
    }
    uStack_80 = uStack_c0;
    uStack_88 = uStack_c8;
    lStack_78 = uStack_b8;
    uStack_68 = *(undefined8 *)(param_1 + 0x28);
    uStack_70 = *(undefined8 *)(param_1 + 0x20);
    unaff_x30 = 0x13ec20;
    unaff_x19 = param_1;
  }
  else {
    pcVar2 = (char *)register0x00000008;
    lVar7 = unaff_x29;
  }
  *(int **)(pcVar2 + -0x20) = unaff_x20;
  *(long *)(pcVar2 + -0x18) = unaff_x19;
  *(long *)(pcVar2 + -0x10) = lVar7;
  *(undefined8 *)(pcVar2 + -8) = unaff_x30;
  if (*(int *)(param_1 + 0x28) == *(int *)(param_1 + 0x20)) {
    if (*(int *)(param_1 + 0x2c) <= *(int *)(param_1 + 0x24)) goto code_r0x0013e8b4;
  }
  else if (*(int *)(param_1 + 0x28) <= *(int *)(param_1 + 0x20)) {
code_r0x0013e8b4:
    lVar7 = *(long *)(param_1 + 8);
    if (lVar7 == *(long *)(param_1 + 0x10)) {
      return;
    }
    *(undefined8 *)(pcVar2 + -0x38) = 0;
    *(undefined8 *)(pcVar2 + -0x30) = 0;
    *(undefined8 *)(pcVar2 + -0x28) = 0;
    iVar3 = func_0x00137dcc(param_1,param_1 + 0x30);
    plVar5 = (long *)(lVar7 + (long)iVar3 * 0x18);
    pcVar6 = (char *)*plVar5;
    pcVar1 = (char *)plVar5[1];
    if (pcVar6 == pcVar1) {
      puVar4 = pcVar2 + -0x38;
    }
    else {
      do {
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
                  (pcVar2 + -0x38,(long)*pcVar6);
        pcVar6 = pcVar6 + 0xc;
      } while (pcVar6 != pcVar1);
      puVar4 = *(undefined1 **)(pcVar2 + -0x38);
      if (-1 < pcVar2[-0x21]) {
        puVar4 = pcVar2 + -0x38;
      }
    }
    func_0x000c2d8c(puVar4);
    goto code_r0x0013e944;
  }
  func_0x001377f0(pcVar2 + -0x38);
  puVar4 = *(undefined1 **)(pcVar2 + -0x38);
  if (-1 < pcVar2[-0x21]) {
    puVar4 = pcVar2 + -0x38;
  }
  func_0x000c2d8c(puVar4);
code_r0x0013e944:
  if (pcVar2[-0x21] < '\0') {
    __ZdlPv(*(undefined8 *)(pcVar2 + -0x38));
    return;
  }
  return;
}

