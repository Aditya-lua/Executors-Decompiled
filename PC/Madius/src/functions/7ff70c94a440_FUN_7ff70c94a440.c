/* 7ff70c94a440 FUN_7ff70c94a440 */

undefined8 FUN_7ff70c94a440(int *param_1,int *param_2)

{
  longlong lVar1;
  undefined8 uVar2;
  int *piVar3;
  
  uVar2 = 1;
  if (((((param_1 != (int *)0x0) && (*param_1 == 0xbab1e)) && (uVar2 = 2, param_2 != (int *)0x0)) &&
      ((*param_2 == -0x3f212453 && (uVar2 = 7, *(longlong *)(param_2 + 0x36) == 0)))) &&
     (uVar2 = 8, *(char *)((longlong)param_1 + 0x1b3) == '\0')) {
    if ((char)param_1[0x6d] == '\x01') {
      if (param_1[7] != 0) {
        return 0xb;
      }
      *(undefined1 *)(param_1 + 0x6d) = 0;
    }
    FUN_7ff70c990fa0(param_2 + 0x380,0);
    if (*(undefined1 **)(param_2 + 0x7a) != (undefined1 *)0x0) {
      **(undefined1 **)(param_2 + 0x7a) = 0;
    }
    *(int **)(param_2 + 0x36) = param_1;
    FUN_7ff70c94a660(param_2,0,8);
    *(undefined1 (*) [16])(param_1 + 100) = (undefined1  [16])0x0;
    uVar2 = FUN_7ff70c94a8f0(param_1);
    if ((int)uVar2 == 0) {
      if (param_2[0x16] != 0) {
        param_2[0x16] = 0;
      }
      if ((*(longlong *)(param_2 + 0x32) == 0) || (param_2[0x34] == 0)) {
        *(int **)(param_2 + 0x32) = param_1 + 0x28;
        param_2[0x34] = 1;
      }
      lVar1 = *(longlong *)(param_2 + 0x3a);
      if ((lVar1 == 0) || ((*(byte *)(lVar1 + 4) & 0x20) == 0)) {
        piVar3 = param_1 + 0x44;
      }
      else {
        piVar3 = (int *)(lVar1 + 0x28);
      }
      *(int **)(param_2 + 0x2fe) = piVar3;
      param_2[0x304] = -1;
      param_2[0x305] = -1;
      param_2[4] = 0;
      param_2[5] = 0;
      if (*(longlong *)(param_1 + 2) == 0) {
        param_2[6] = 0;
        param_2[7] = 0;
        *(int **)(param_1 + 2) = param_2;
      }
      else {
        lVar1 = *(longlong *)(param_1 + 4);
        *(int **)(lVar1 + 0x10) = param_2;
        *(longlong *)(param_2 + 6) = lVar1;
      }
      *(int **)(param_1 + 4) = param_2;
      *(ulonglong *)(param_1 + 6) =
           CONCAT44((int)((ulonglong)*(undefined8 *)(param_1 + 6) >> 0x20) + 1,
                    (int)*(undefined8 *)(param_1 + 6) + 1);
      if (*(longlong *)(param_2 + 0x3a) != 0) {
        FUN_7ff70c959850(param_2,5,2);
      }
      *(int *)(*(longlong *)(*(longlong *)(param_2 + 0x2fe) + 0x58) + 0x300) = param_2[0xc0];
      *(int *)(*(longlong *)(*(longlong *)(param_2 + 0x2fe) + 0x58) + 0x30c) = param_2[0xc3];
      *(undefined1 *)(*(longlong *)(*(longlong *)(param_2 + 0x2fe) + 0x58) + 0xa3b) =
           *(undefined1 *)((longlong)param_2 + 0xa3b);
      lVar1 = *(longlong *)(*(longlong *)(param_2 + 0x2fe) + 0x40);
      *(longlong *)(*(longlong *)(param_2 + 0x2fe) + 0x40) = lVar1 + 1;
      *(longlong *)(param_2 + 2) = lVar1;
      if (*(longlong *)(*(longlong *)(param_2 + 0x2fe) + 0x40) < 1) {
        *(undefined8 *)(*(longlong *)(param_2 + 0x2fe) + 0x40) = 0;
      }
      uVar2 = 0;
      if (*(longlong *)(param_2 + 0x3a) != 0) {
        FUN_7ff70c959890(param_2,5);
        return 0;
      }
    }
  }
  return uVar2;
}


