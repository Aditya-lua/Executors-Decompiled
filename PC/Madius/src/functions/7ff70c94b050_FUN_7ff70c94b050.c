/* 7ff70c94b050 FUN_7ff70c94b050 */

void FUN_7ff70c94b050(longlong param_1)

{
  longlong lVar1;
  int iVar2;
  
  lVar1 = *(longlong *)(param_1 + 0xd8);
  if ((lVar1 != 0) && ((*(longlong *)(param_1 + 0xdb8) != 0 || (*(int *)(param_1 + 0xdc0) != 0)))) {
    iVar2 = FUN_7ff70c9933f0(*(undefined8 *)(lVar1 + 0xd0),param_1 + 0xdc8,lVar1 + 0xd0);
    if ((iVar2 != 0) && (*(char *)(param_1 + 0xa37) == '\x01')) {
      FUN_7ff70c941400(param_1,&UNK_7ff70cb88e0d,iVar2);
    }
    if (*(longlong *)(param_1 + 0xe18) != 0) {
      do {
        FUN_7ff70c991030(param_1 + 0xe00,*(undefined8 *)(param_1 + 0xe08),0);
      } while (*(longlong *)(param_1 + 0xe18) != 0);
    }
    *(undefined8 *)(param_1 + 0xdb8) = 0;
    *(undefined4 *)(param_1 + 0xdc0) = 0;
  }
  return;
}


