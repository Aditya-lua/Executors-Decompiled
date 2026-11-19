/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd75d8
 */

void FUN_00bd75d8(long *param_1,long param_2)

{
  undefined1 *puVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  byte *pbVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  undefined8 uVar10;
  long lVar11;
  locale alStack_70 [8];
  locale alStack_68 [8];
  
  pbVar6 = (byte *)(param_2 + 0x40);
  lVar2 = *(long *)(param_2 + 0x50);
  if ((*pbVar6 & 1) == 0) {
    lVar2 = param_2 + 0x41;
  }
  if (*(long *)(param_2 + 0x10) == 0) {
    lVar8 = -1;
    lVar9 = -1;
    lVar5 = -1;
  }
  else {
    lVar5 = *(long *)(param_2 + 0x10) - lVar2;
    lVar9 = *(long *)(param_2 + 0x18) - lVar2;
    lVar8 = *(long *)(param_2 + 0x20) - lVar2;
  }
  if (*(long *)(param_2 + 0x28) == 0) {
    lVar7 = -1;
    lVar4 = -1;
    lVar3 = -1;
  }
  else {
    lVar7 = *(long *)(param_2 + 0x28) - lVar2;
    lVar4 = *(long *)(param_2 + 0x30) - lVar2;
    lVar3 = *(long *)(param_2 + 0x38) - lVar2;
  }
  lVar2 = *(long *)(param_2 + 0x58) - lVar2;
  if (*(long *)(param_2 + 0x58) == 0) {
    lVar2 = -1;
  }
  if ((*(byte *)(param_1 + 8) & 1) != 0) {
    operator_delete((void *)param_1[10],param_1[8] & 0xfffffffffffffffe);
  }
  lVar11 = *(long *)(param_2 + 0x48);
  uVar10 = *(undefined8 *)pbVar6;
  param_1[10] = *(long *)(param_2 + 0x50);
  param_1[9] = lVar11;
  param_1[8] = uVar10;
  *pbVar6 = 0;
  *(undefined1 *)(param_2 + 0x41) = 0;
  lVar11 = (long)param_1 + 0x41;
  if ((*(byte *)(param_1 + 8) & 1) != 0) {
    lVar11 = param_1[10];
  }
  if (lVar5 != -1) {
    param_1[2] = lVar11 + lVar5;
    param_1[3] = lVar11 + lVar9;
    param_1[4] = lVar11 + lVar8;
  }
  if (lVar7 != -1) {
    param_1[7] = lVar11 + lVar3;
    param_1[5] = lVar11 + lVar7;
    param_1[6] = lVar11 + lVar7 + lVar4;
  }
  lVar5 = 0;
  if (lVar2 != -1) {
    lVar5 = lVar11 + lVar2;
  }
  param_1[0xb] = lVar5;
  puVar1 = (undefined1 *)(param_2 + 0x41);
  if ((*(byte *)(param_2 + 0x40) & 1) != 0) {
    puVar1 = *(undefined1 **)(param_2 + 0x50);
  }
  *(undefined1 **)(param_2 + 0x10) = puVar1;
  *(undefined1 **)(param_2 + 0x18) = puVar1;
  *(undefined1 **)(param_2 + 0x20) = puVar1;
  *(undefined1 **)(param_2 + 0x28) = puVar1;
  *(undefined1 **)(param_2 + 0x30) = puVar1;
  *(undefined1 **)(param_2 + 0x38) = puVar1;
  *(undefined1 **)(param_2 + 0x58) = puVar1;
  std::__ndk1::locale::locale(alStack_70,(locale *)(param_2 + 8));
                    /* try { // try from 00bd7748 to 00bd7753 has its CatchHandler @ 00bd77a0 */
  (**(code **)(*param_1 + 0x10))(param_1,alStack_70);
  std::__ndk1::locale::locale(alStack_68,(locale *)(param_1 + 1));
  std::__ndk1::locale::operator=((locale *)(param_1 + 1),alStack_70);
  std::__ndk1::locale::~locale(alStack_68);
  std::__ndk1::locale::~locale(alStack_70);
  return;
}

