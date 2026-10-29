/* 7ff70c956670 FUN_7ff70c956670 */

undefined8 FUN_7ff70c956670(longlong param_1,longlong *param_2)

{
  longlong lVar1;
  undefined8 uVar2;
  longlong lVar3;
  longlong lStack_20;
  longlong lStack_18;
  
  lStack_20 = *(longlong *)(param_1 + 0xc10);
  uVar2 = 0xffffffffffffffff;
  if ((lStack_20 != -1) &&
     ((lVar3 = *(longlong *)(param_1 + 0xe0), lVar3 != 0 || (*(longlong *)(param_1 + 0xd8) != 0))))
  {
    lStack_18 = 0;
    lVar1 = *(longlong *)(param_1 + 0xe8);
    if ((lVar1 == 0) || ((*(byte *)(lVar1 + 4) & 0x20) == 0)) {
      if (lVar3 == 0) {
        lVar3 = *(longlong *)(param_1 + 0xd8) + 0x110;
      }
      else {
        lVar3 = lVar3 + 0x110;
      }
    }
    else {
      lVar3 = lVar1 + 0x28;
    }
    FUN_7ff70c958c70(param_1,lVar3,&lStack_20,&UNK_7ff70c956740);
    if (lStack_18 == 0) {
      *(undefined8 *)(param_1 + 0xc10) = 0xffffffffffffffff;
      return 0xffffffffffffffff;
    }
    if (param_2 != (longlong *)0x0) {
      *param_2 = lStack_18;
    }
    uVar2 = *(undefined8 *)(lStack_18 + 0x1a8);
  }
  return uVar2;
}


