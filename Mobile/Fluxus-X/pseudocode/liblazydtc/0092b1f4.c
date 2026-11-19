/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092b1f4
 */

undefined4 FUN_0092b1f4(long param_1)

{
  byte bVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  undefined4 uVar6;
  long lVar7;
  code *pcVar8;
  undefined1 auVar9 [16];
  
  if (*(long *)(param_1 + 0x200) == 0) {
    return 0;
  }
  if ((*(byte *)(param_1 + 0x231) >> 4 & 1) != 0) {
    return 0;
  }
  if (*(long *)(param_1 + 0xd0) == 0) {
LAB_0092b288:
    if ((*(long *)(param_1 + 0x210) == 0) && (*(int *)(param_1 + 0x218) == 0)) {
      return 0;
    }
    *(undefined8 *)(param_1 + 0x210) = 0;
    *(undefined8 *)(param_1 + 0x218) = 0;
    bVar1 = *(byte *)(param_1 + 0x231);
    pcVar8 = *(code **)(param_1 + 0x200);
    uVar5 = *(undefined8 *)(param_1 + 0x208);
    lVar4 = -1;
  }
  else {
    auVar9 = FUN_00941cb8();
    lVar4 = auVar9._0_8_;
    lVar3 = FUN_00941308(0,0,*(undefined8 *)(param_1 + 0xd0));
    *(long *)(param_1 + 0xd0) = lVar3;
    lVar7 = *(long *)(lVar3 + 0x20);
    if ((lVar7 < lVar4) || ((lVar7 <= lVar4 && (*(int *)(lVar3 + 0x28) <= auVar9._8_4_)))) {
      lVar4 = 0;
    }
    else {
      lVar4 = FUN_00941dc4(lVar7,*(undefined8 *)(lVar3 + 0x28),lVar4,auVar9._8_8_);
      if (lVar4 < 0) goto LAB_0092b288;
      lVar3 = *(long *)(param_1 + 0xd0);
      lVar7 = *(long *)(lVar3 + 0x20);
    }
    if ((lVar7 == *(long *)(param_1 + 0x210)) &&
       (*(int *)(lVar3 + 0x28) == *(int *)(param_1 + 0x218))) {
      return 0;
    }
    uVar5 = *(undefined8 *)(lVar3 + 0x20);
    *(undefined8 *)(param_1 + 0x218) = *(undefined8 *)(lVar3 + 0x28);
    *(undefined8 *)(param_1 + 0x210) = uVar5;
    bVar1 = *(byte *)(param_1 + 0x231);
    pcVar8 = *(code **)(param_1 + 0x200);
    uVar5 = *(undefined8 *)(param_1 + 0x208);
  }
  *(byte *)(param_1 + 0x231) = bVar1 | 4;
  iVar2 = (*pcVar8)(param_1,lVar4,uVar5);
  uVar6 = 0;
  bVar1 = *(byte *)(param_1 + 0x231) & 0xfb;
  *(byte *)(param_1 + 0x231) = bVar1;
  if (iVar2 == -1) {
    *(byte *)(param_1 + 0x231) = bVar1 | 0x10;
    uVar6 = 0xb;
  }
  return uVar6;
}

