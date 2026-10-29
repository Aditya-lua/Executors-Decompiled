/* 7ff70c7b5780 FUN_7ff70c7b5780 */

undefined8 * FUN_7ff70c7b5780(undefined8 *param_1,longlong param_2)

{
  int iVar1;
  longlong lVar2;
  int iVar3;
  int iVar4;
  
  param_1[6] = 0;
  param_1[7] = 0;
  param_1[0x1a] = 0;
  param_1[0x1b] = 0;
  param_1[0x18] = 0;
  param_1[0x19] = 0;
  param_1[0x16] = 0;
  param_1[0x17] = 0;
  param_1[0x14] = 0;
  param_1[0x15] = 0;
  param_1[0x12] = 0;
  param_1[0x13] = 0;
  param_1[0x10] = 0;
  param_1[0x11] = 0;
  param_1[0xe] = 0;
  param_1[0xf] = 0;
  param_1[0xc] = 0;
  param_1[0xd] = 0;
  param_1[10] = 0;
  param_1[0xb] = 0;
  param_1[8] = 0;
  param_1[9] = 0;
  param_1[4] = 0;
  param_1[5] = 0;
  param_1[2] = 0;
  param_1[3] = 0;
  *param_1 = 0;
  param_1[1] = 0;
  param_1[7] = param_2;
  if (param_2 != 0) {
    iVar1 = *(int *)(param_2 + 0x58);
    if (iVar1 == *(int *)(param_2 + 0x5c)) {
      if (iVar1 == 0) {
        iVar3 = 8;
      }
      else {
        iVar3 = iVar1 / 2 + iVar1;
      }
      iVar4 = iVar1 + 1;
      if (iVar1 + 1 < iVar3) {
        iVar4 = iVar3;
      }
      lVar2 = FUN_7ff70c802100((longlong)iVar4 << 3);
      if (*(longlong *)(param_2 + 0x60) != 0) {
        FUN_7ff70cb12b60(lVar2,*(longlong *)(param_2 + 0x60),(longlong)*(int *)(param_2 + 0x58) << 3
                        );
        FUN_7ff70c802510(*(undefined8 *)(param_2 + 0x60));
      }
      *(longlong *)(param_2 + 0x60) = lVar2;
      *(int *)(param_2 + 0x5c) = iVar4;
      iVar1 = *(int *)(param_2 + 0x58);
    }
    else {
      lVar2 = *(longlong *)(param_2 + 0x60);
    }
    *(undefined8 **)(lVar2 + (longlong)iVar1 * 8) = param_1;
    *(int *)(param_2 + 0x58) = *(int *)(param_2 + 0x58) + 1;
  }
  return param_1;
}


