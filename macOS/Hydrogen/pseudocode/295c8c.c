
undefined8 FUN_00295c8c(undefined8 param_1,long param_2)

{
  int iVar1;
  undefined8 uVar2;
  int unaff_w22;
  char *pcVar3;
  
  if (*(long *)(param_2 + 8) == 0) {
    uVar2 = func_0x0027f658(param_1);
    iVar1 = (int)uVar2;
  }
  else {
    func_0x0029bf0c();
    uVar2 = func_0x0027f658(param_1);
    iVar1 = (int)uVar2;
  }
  if (iVar1 != 0) {
    if ((unaff_w22 == 0) || (*(long *)(param_2 + 0x18) == 0)) {
      iVar1 = func_0x00280490(param_1,"Public-Key: (%d bit)\n");
      if (iVar1 < 1) {
        return 0;
      }
      pcVar3 = "Exponent:";
      uVar2 = func_0x00295e78(param_1,"Modulus:",*(undefined8 *)(param_2 + 8));
      iVar1 = (int)uVar2;
    }
    else {
      iVar1 = func_0x00280490(param_1,"Private-Key: (%d bit)\n");
      if (iVar1 < 1) {
        return 0;
      }
      pcVar3 = "publicExponent:";
      uVar2 = func_0x00295e78(param_1,"modulus:",*(undefined8 *)(param_2 + 8));
      iVar1 = (int)uVar2;
    }
    if (((iVar1 != 0) &&
        (uVar2 = func_0x00295e78(param_1,pcVar3,*(undefined8 *)(param_2 + 0x10)), (int)uVar2 != 0))
       && ((unaff_w22 == 0 ||
           ((((uVar2 = func_0x00295e78(param_1,"privateExponent:",*(undefined8 *)(param_2 + 0x18)),
              (int)uVar2 != 0 &&
              (uVar2 = func_0x00295e78(param_1,"prime1:",*(undefined8 *)(param_2 + 0x20)),
              (int)uVar2 != 0)) &&
             (uVar2 = func_0x00295e78(param_1,"prime2:",*(undefined8 *)(param_2 + 0x28)),
             (int)uVar2 != 0)) &&
            (((uVar2 = func_0x00295e78(param_1,"exponent1:",*(undefined8 *)(param_2 + 0x30)),
              (int)uVar2 != 0 &&
              (uVar2 = func_0x00295e78(param_1,"exponent2:",*(undefined8 *)(param_2 + 0x38)),
              (int)uVar2 != 0)) &&
             (uVar2 = func_0x00295e78(param_1,"coefficient:",*(undefined8 *)(param_2 + 0x40)),
             (int)uVar2 != 0)))))))) {
      return 1;
    }
  }
  return uVar2;
}

