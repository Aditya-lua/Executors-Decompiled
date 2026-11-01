
undefined8 FUN_0028b3c4(undefined8 *param_1)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  
  lVar2 = func_0x0029e1d8();
  if (lVar2 == 0) {
    lVar4 = 0;
    lVar3 = param_1[3];
  }
  else {
    lVar4 = param_1[4];
    if (((lVar4 != 0) || (lVar4 = func_0x0029bbb8(), lVar4 != 0)) &&
       (iVar1 = func_0x002a6c5c(lVar4,1,param_1[1]), iVar1 != 0)) {
      lVar5 = param_1[3];
      if (((lVar5 == 0) && (lVar5 = func_0x0029bbb8(), lVar5 == 0)) ||
         ((iVar1 = func_0x002aad18(param_1 + 0x1e,param_1 + 5,*param_1,lVar2), iVar1 == 0 ||
          (iVar1 = func_0x002a42a0(lVar5,param_1[2],lVar4,*param_1,lVar2,param_1[0x1e]), iVar1 == 0)
          ))) {
        uVar6 = 0;
        lVar3 = param_1[3];
      }
      else {
        param_1[3] = lVar5;
        param_1[4] = lVar4;
        uVar6 = 1;
        lVar3 = param_1[3];
      }
      goto joined_r0x0028b46c;
    }
    lVar3 = param_1[3];
  }
  lVar5 = 0;
  uVar6 = 0;
joined_r0x0028b46c:
  if (lVar3 == 0) {
    func_0x0029bc0c(lVar5);
  }
  if (param_1[4] == 0) {
    func_0x0029bc0c(lVar4);
  }
  func_0x0029e220(lVar2);
  return uVar6;
}

