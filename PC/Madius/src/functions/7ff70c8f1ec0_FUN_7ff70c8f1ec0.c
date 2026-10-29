/* 7ff70c8f1ec0 FUN_7ff70c8f1ec0 */

int FUN_7ff70c8f1ec0(longlong param_1)

{
  char cVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  int iVar5;
  bool bVar6;
  
  if (param_1 == 0) {
    iVar5 = 0x2b;
  }
  else {
    if (*(undefined1 **)(param_1 + 0x1e8) != (undefined1 *)0x0) {
      **(undefined1 **)(param_1 + 0x1e8) = 0;
    }
    if (*(longlong *)(param_1 + 0xd8) == 0) {
      lVar3 = *(longlong *)(param_1 + 0xe0);
      if (lVar3 == 0) {
        lVar3 = FUN_7ff70c94a2d0(1,3,7);
        if (lVar3 == 0) {
          return 0x1b;
        }
        *(longlong *)(param_1 + 0xe0) = lVar3;
        cVar1 = *(char *)(lVar3 + 0x1b3);
      }
      else {
        cVar1 = *(char *)(lVar3 + 0x1b3);
      }
      iVar5 = 0x5d;
      if (cVar1 == '\0') {
        FUN_7ff70c94e790(lVar3,6,*(undefined8 *)(param_1 + 0x9d0));
        iVar2 = FUN_7ff70c94a440(lVar3,param_1);
        if (iVar2 == 0) {
          iVar5 = 0;
          do {
            iVar2 = FUN_7ff70c94c890(lVar3,0,0,1000,0);
            if (iVar2 != 0) {
              iVar5 = (uint)(iVar2 != 3) * 0x10 + 0x1b;
              goto LAB_7ff70c8f2069;
            }
            iVar2 = FUN_7ff70c94ca00();
            if (iVar2 == 0) {
              lVar4 = FUN_7ff70c94e5f0(lVar3);
              bVar6 = lVar4 != 0;
              if (bVar6) {
                iVar5 = *(int *)(lVar4 + 0x10);
              }
            }
            else {
              bVar6 = false;
            }
          } while ((iVar2 == 0) && (!bVar6));
          if (iVar2 != 0) {
            iVar5 = (uint)(iVar2 != 3) * 0x10 + 0x1b;
          }
LAB_7ff70c8f2069:
          FUN_7ff70c94aa60(lVar3,param_1);
        }
        else {
          FUN_7ff70c94e3e0(lVar3);
          *(undefined8 *)(param_1 + 0xe0) = 0;
          iVar5 = 2;
          if (iVar2 == 3) {
            iVar5 = 0x1b;
          }
        }
      }
    }
    else {
      FUN_7ff70c9412d0(param_1,&UNK_7ff70cb86f63);
      iVar5 = 2;
    }
  }
  return iVar5;
}


