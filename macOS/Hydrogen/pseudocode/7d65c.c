
void FUN_0007d65c(long param_1,undefined8 param_2,long param_3)

{
  uint uVar1;
  undefined1 *puVar2;
  ulong in_x9;
  long lVar3;
  undefined8 *in_x10;
  ulong uVar4;
  undefined8 *in_x11;
  long in_x12;
  undefined8 *puVar5;
  undefined8 *puVar6;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined1 *puVar7;
  long unaff_x23;
  undefined1 *unaff_x26;
  undefined8 unaff_x27;
  ulong unaff_x28;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 in_stack_00000000;
  
  while( true ) {
    in_x12 = in_x12 + -0x40;
    if (in_x12 == 0) break;
    uVar9 = in_x10[-8];
    uVar8 = in_x10[-5];
    param_2 = in_x10[-6];
    uVar13 = in_x10[-0xb];
    uVar12 = in_x10[-0xc];
    uVar11 = in_x10[-9];
    uVar10 = in_x10[-10];
    in_x11[-7] = in_x10[-7];
    in_x11[-8] = uVar9;
    in_x11[-5] = uVar8;
    in_x11[-6] = param_2;
    in_x11[-0xb] = uVar13;
    in_x11[-0xc] = uVar12;
    in_x11[-9] = uVar11;
    in_x11[-10] = uVar10;
    in_x10 = in_x10 + -8;
    in_x11 = in_x11 + -8;
  }
  if (unaff_x28 != in_x9) {
    if ((unaff_x28 & 0x38) != 0) {
      uVar4 = unaff_x28 & 0xfffffffffffffff8;
      puVar6 = (undefined8 *)(unaff_x22 - in_x9);
      puVar5 = (undefined8 *)((long)puVar6 + (param_3 - (long)unaff_x26));
      lVar3 = in_x9 - uVar4;
      do {
        puVar6 = puVar6 + -1;
        puVar5 = puVar5 + -1;
        param_2 = *puVar6;
        *puVar5 = param_2;
        lVar3 = lVar3 + 8;
      } while (lVar3 != 0);
      in_x9 = uVar4;
      if (unaff_x28 == uVar4) goto LAB_0007d6dc;
    }
    puVar7 = (undefined1 *)(unaff_x22 - in_x9);
    puVar2 = (undefined1 *)(param_1 - in_x9);
    do {
      puVar2 = puVar2 + -1;
      puVar7 = puVar7 + -1;
      *puVar2 = *puVar7;
    } while (puVar7 != unaff_x26);
  }
LAB_0007d6dc:
  lVar3 = *unaff_x19;
  *(long *)(unaff_x20 + 0x38) = param_3;
  *(undefined8 *)(unaff_x20 + 0x40) = unaff_x27;
  *(long *)(unaff_x20 + 0x48) = param_3 + unaff_x21;
  if (lVar3 != 0) {
    param_2 = __ZdlPv(lVar3);
  }
  *(undefined8 *)(unaff_x20 + 0x40) = unaff_x27;
  uVar1 = *(int *)(unaff_x20 + 0x14) - 9;
  if (uVar1 < 0x18) {
                    /* WARNING: Could not recover jumptable at 0x0007d720. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&UNK_0007d52c + (ulong)*(byte *)(unaff_x23 + (ulong)uVar1) * 4))
              (param_2,in_stack_00000000);
    return;
  }
  return;
}

