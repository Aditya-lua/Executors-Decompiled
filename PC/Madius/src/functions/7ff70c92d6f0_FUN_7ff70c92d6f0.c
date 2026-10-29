/* 7ff70c92d6f0 FUN_7ff70c92d6f0 */

void FUN_7ff70c92d6f0(longlong param_1,longlong param_2,longlong param_3,longlong param_4,
                     byte param_5)

{
  longlong lVar1;
  byte bVar2;
  
  if (param_2 != 0 && param_2 != param_3) {
    do {
      switch(*(undefined4 *)(param_2 + 8)) {
      case 7:
        if (param_4 == 0) {
code_r0x7ff70c92d7fc:
          param_4 = 0;
        }
        else if ((((*(longlong *)(param_2 + 0x20) != 0) &&
                  ((((*(longlong *)(param_2 + 0x28) != 0 || (*(longlong *)(param_2 + 0x30) != 0)) ||
                    (*(longlong *)(param_2 + 0x38) != 0)) ||
                   ((*(short *)(param_2 + 0x40) != 0 ||
                    (*(longlong *)(*(longlong *)(param_2 + 0x20) + 0x18) != 0)))))) ||
                 (*(longlong *)(param_2 + 0x48) != 0)) ||
                (((*(byte *)(param_1 + 0x69) & 8) != 0 &&
                 ((*(longlong *)(param_2 + 0x38) != 0 || ((*(byte *)(param_2 + 0xc) & 1) != 0))))))
        {
          *(undefined4 *)(param_4 + 0x34) = 0;
          goto code_r0x7ff70c92d83c;
        }
        break;
      case 10:
        if (param_4 != 0) {
          *(undefined4 *)(param_4 + 0x34) = 0;
          *(byte *)(param_4 + 0xd) = *(byte *)(param_4 + 0xd) & 0xef;
        }
      case 0xb:
        FUN_7ff70c92d6f0(param_1,*(undefined8 *)(param_2 + 0x20),0,0,1);
        break;
      case 0xf:
        if ((param_5 == 0) && (param_4 != 0)) {
code_r0x7ff70c92d83c:
          *(byte *)(param_4 + 0xd) = *(byte *)(param_4 + 0xd) & 0xef;
        }
        break;
      case 0x10:
        if (param_4 != 0) {
          *(undefined4 *)(param_4 + 0x34) = 0;
          *(byte *)(param_4 + 0xd) = *(byte *)(param_4 + 0xd) & 0xef;
        }
        for (lVar1 = *(longlong *)(param_2 + 0x28); lVar1 != 0; lVar1 = *(longlong *)(lVar1 + 0x28))
        {
          FUN_7ff70c92d6f0(param_1,*(undefined8 *)(lVar1 + 0x10),*(undefined8 *)(lVar1 + 0x20),
                           param_4,param_5);
        }
        break;
      case 0x12:
        if (param_4 == 0) {
          *(byte *)(param_2 + 0xd) = *(byte *)(param_2 + 0xd) | 0x10;
          param_4 = param_2;
        }
        else {
          *(undefined4 *)(param_4 + 0x34) = 0;
          *(byte *)(param_4 + 0xd) = *(byte *)(param_4 + 0xd) & 0xef;
          *(byte *)(param_2 + 0xd) = *(byte *)(param_2 + 0xd) | 0x10;
          bVar2 = *(uint *)(param_4 + 0x24) < 2 & param_5;
          if (bVar2 == 0) {
            *(undefined4 *)(param_2 + 0x34) = 0;
          }
          FUN_7ff70c92d6f0(param_1,*(undefined8 *)(param_2 + 0x10),
                           *(undefined8 *)(*(longlong *)(param_2 + 0x28) + 0x10),param_2,bVar2);
          param_2 = *(longlong *)(param_2 + 0x28);
        }
        break;
      case 0x13:
        if (param_4 == *(longlong *)(param_2 + 0x20)) {
          if (*(int *)(param_4 + 0x34) != -1) goto code_r0x7ff70c92d7fc;
          *(undefined4 *)(param_4 + 0x34) = 1;
          param_4 = 0;
        }
      }
      param_2 = *(longlong *)(param_2 + 0x10);
    } while ((param_2 != param_3) && (param_2 != 0));
  }
  return;
}


