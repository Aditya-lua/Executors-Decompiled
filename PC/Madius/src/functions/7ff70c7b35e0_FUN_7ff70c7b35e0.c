/* 7ff70c7b35e0 FUN_7ff70c7b35e0 */

void FUN_7ff70c7b35e0(undefined8 *param_1)

{
  undefined8 *puVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  
  uVar2 = param_1[2];
  if (uVar2 != 0) {
    puVar1 = param_1;
    if (0xf < (ulonglong)param_1[3]) {
      puVar1 = (undefined8 *)*param_1;
    }
    uVar3 = uVar2;
    if ((uVar2 & 7) != 0) {
      uVar3 = 0;
      do {
        *(undefined1 *)((longlong)puVar1 + uVar3) = 0;
        uVar3 = uVar3 + 1;
      } while ((uVar2 & 7) != uVar3);
      puVar1 = (undefined8 *)((longlong)puVar1 + uVar3);
      uVar3 = uVar2 - uVar3;
    }
    if (7 < uVar2) {
      uVar2 = 0;
      do {
        *(undefined1 *)((longlong)puVar1 + uVar2) = 0;
        *(undefined1 *)((longlong)puVar1 + uVar2 + 1) = 0;
        *(undefined1 *)((longlong)puVar1 + uVar2 + 2) = 0;
        *(undefined1 *)((longlong)puVar1 + uVar2 + 3) = 0;
        *(undefined1 *)((longlong)puVar1 + uVar2 + 4) = 0;
        *(undefined1 *)((longlong)puVar1 + uVar2 + 5) = 0;
        *(undefined1 *)((longlong)puVar1 + uVar2 + 6) = 0;
        *(undefined1 *)((longlong)puVar1 + uVar2 + 7) = 0;
        uVar2 = uVar2 + 8;
      } while (uVar3 != uVar2);
    }
    param_1[2] = 0;
    if (0xf < (ulonglong)param_1[3]) {
      param_1 = (undefined8 *)*param_1;
    }
    *(undefined1 *)param_1 = 0;
  }
  return;
}


