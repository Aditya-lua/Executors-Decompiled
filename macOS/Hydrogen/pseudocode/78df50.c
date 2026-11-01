
undefined8 FUN_0078df50(code *param_1)

{
  undefined1 *puVar1;
  long lVar2;
  undefined8 uVar3;
  long unaff_x23;
  long unaff_x25;
  long unaff_x27;
  long unaff_x28;
  
  lVar2 = (*param_1)(unaff_x27 + 3);
  if (lVar2 == 0) {
    uVar3 = 0x1b;
  }
  else {
    if (unaff_x25 != 0) {
      _memcpy(lVar2);
    }
    puVar1 = (undefined1 *)(lVar2 + unaff_x25);
    *puVar1 = 0;
    _memcpy(puVar1 + 1);
    *(undefined1 *)(unaff_x28 + lVar2 + 1) = 0;
    _memcpy(puVar1 + unaff_x23 + 2);
    *(undefined1 *)(lVar2 + unaff_x27 + 2) = 0;
    func_0x0072a784();
    uVar3 = 0;
  }
  return uVar3;
}

