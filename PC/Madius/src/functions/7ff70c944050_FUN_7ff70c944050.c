/* 7ff70c944050 FUN_7ff70c944050 */

undefined8 FUN_7ff70c944050(longlong *param_1,longlong param_2,longlong *param_3,ulonglong param_4)

{
  longlong lVar1;
  longlong lVar2;
  
  lVar1 = param_1[3];
  if ((*(char *)(lVar1 + 0x2cb) == '\x01') && (*param_1 == 0x7ff70cbec850)) {
    lVar2 = 0x612;
  }
  else {
    lVar2 = 0x611;
  }
  if (param_4 == 0 || param_3 == (longlong *)0x0) {
    *(undefined1 *)(lVar1 + lVar2) = 0;
    if ((param_2 != 0) && (*(char *)(param_2 + 0xa37) == '\x01')) {
      FUN_7ff70c941400(param_2,&UNK_7ff70cb8c3aa);
    }
    goto LAB_7ff70c944135;
  }
  if (param_4 == 8) {
    if (*param_3 == 0x312e312f70747468) {
      *(undefined1 *)(lVar1 + lVar2) = 2;
    }
    else {
      if (*param_3 != 0x302e312f70747468) goto LAB_7ff70c9440b5;
      *(undefined1 *)(lVar1 + lVar2) = 1;
    }
    if ((param_2 != 0) && (*(char *)(param_2 + 0xa37) == '\x01')) {
      FUN_7ff70c941400(param_2,&UNK_7ff70cb82333,8,param_3);
    }
  }
  else {
LAB_7ff70c9440b5:
    *(undefined1 *)(lVar1 + lVar2) = 0;
    FUN_7ff70c9412d0(param_2,&UNK_7ff70cb8f7c8,param_4 & 0xffffffff,param_3);
  }
LAB_7ff70c944135:
  if (*param_1 != 0x7ff70cbec850) {
    FUN_7ff70c94ef70(param_2,0xffffffff);
  }
  return 0;
}


