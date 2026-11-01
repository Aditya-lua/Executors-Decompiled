
void FUN_0007aedc(void)

{
  long lVar1;
  uint uVar2;
  bool bVar3;
  undefined8 uVar4;
  ulong uVar5;
  byte bVar6;
  uint uVar7;
  undefined *puVar8;
  undefined2 *puVar9;
  undefined *puVar10;
  ulong uVar11;
  undefined8 *unaff_x19;
  long unaff_x21;
  byte *unaff_x22;
  
  bVar6 = *unaff_x22;
  if ((ulong)bVar6 == 0) {
    (*(code *)**(undefined8 **)*unaff_x19)((undefined8 *)*unaff_x19,0x30);
  }
  else {
    if (bVar6 < 10) {
      uVar4 = 1;
LAB_0007b450:
      bVar6 = bVar6 | 0x30;
    }
    else {
      if (99 < bVar6) {
        uVar7 = (uint)bVar6;
        uVar2 = uVar7 * 0x29 >> 0xc;
        bVar6 = (byte)uVar2;
        *(undefined2 *)((long)unaff_x19 + 0x11) =
             *(undefined2 *)(&UNK_0080abeb + ((ulong)(uVar7 + uVar2 * -100) & 0xff) * 2);
        uVar4 = 3;
        goto LAB_0007b450;
      }
      lVar1 = (ulong)bVar6 * 2;
      *(undefined *)((long)unaff_x19 + 0x11) = (&UNK_0080abec)[lVar1];
      bVar6 = (&UNK_0080abeb)[lVar1];
      uVar4 = 2;
    }
    *(byte *)(unaff_x19 + 2) = bVar6;
    (**(code **)(*(long *)*unaff_x19 + 8))((long *)*unaff_x19,unaff_x19 + 2,uVar4);
  }
  (**(code **)(*(long *)*unaff_x19 + 8))((long *)*unaff_x19,"],\"subtype\":",0xc);
  if (*(char *)(*(long *)(unaff_x21 + 8) + 0x20) == '\0') {
                    /* WARNING: Could not recover jumptable at 0x0007b4e4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*(long *)*unaff_x19 + 8))((long *)*unaff_x19,"null}",5);
    return;
  }
  puVar8 = *(undefined **)(*(long *)(unaff_x21 + 8) + 0x18);
  if (puVar8 == (undefined *)0x0) {
    (*(code *)**(undefined8 **)*unaff_x19)((undefined8 *)*unaff_x19,0x30);
    goto code_r0x0007b82c;
  }
  if (puVar8 < (undefined *)0xa) {
    puVar9 = (undefined2 *)((long)unaff_x19 + 0x11);
    uVar5 = 1;
code_r0x0007b744:
    *(char *)((long)puVar9 + -1) = (char)puVar8 + '0';
  }
  else {
    puVar10 = puVar8;
    uVar2 = 4;
    do {
      uVar7 = uVar2;
      if (puVar10 < (undefined *)0x64) {
        uVar7 = uVar7 - 2;
        goto code_r0x0007b6d0;
      }
      if (puVar10 < (undefined *)0x3e8) {
        uVar7 = uVar7 - 1;
        goto code_r0x0007b6d0;
      }
      if ((ulong)puVar10 >> 4 < 0x271) goto code_r0x0007b6d0;
      bVar3 = &UNK_0001869f < puVar10;
      puVar10 = (undefined *)((ulong)puVar10 / 10000);
      uVar2 = uVar7 + 4;
    } while (bVar3);
    uVar7 = uVar7 + 1;
code_r0x0007b6d0:
    uVar5 = (ulong)uVar7;
    puVar9 = (undefined2 *)((long)(unaff_x19 + 2) + uVar5);
    if (puVar8 < (undefined *)0x64) {
    }
    else {
      do {
        puVar10 = (undefined *)((ulong)puVar8 / 100);
        puVar9 = puVar9 + -1;
        *puVar9 = *(undefined2 *)(&UNK_0080acb3 + ((ulong)puVar8 % 100) * 2);
        uVar11 = (ulong)puVar8 >> 4;
        puVar8 = puVar10;
      } while (0x270 < uVar11);
    }
    if (puVar8 < (undefined *)0xa) goto code_r0x0007b744;
    puVar9[-1] = *(undefined2 *)(&UNK_0080acb3 + (long)puVar8 * 2);
  }
  (**(code **)(*(long *)*unaff_x19 + 8))((long *)*unaff_x19,unaff_x19 + 2,uVar5);
code_r0x0007b82c:
                    /* WARNING: Could not recover jumptable at 0x0007b858. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)**(undefined8 **)*unaff_x19)((undefined8 *)*unaff_x19,0x7d);
  return;
}

