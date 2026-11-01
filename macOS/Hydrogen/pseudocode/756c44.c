
undefined8 FUN_00756c44(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  ulong uVar4;
  long lVar5;
  long *unaff_x19;
  long unaff_x20;
  undefined8 uVar6;
  undefined8 *unaff_x24;
  long unaff_x29;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000020;
  long in_stack_00000040;
  
  iVar2 = func_0x00789530();
  if ((iVar2 == 0xb) || (iVar2 == 0)) {
    if (*(long *)(unaff_x29 + -0x38) != 0) {
      uVar6 = 3;
      iVar2 = func_0x00789530();
      if (((iVar2 != 0xc) && (iVar2 != 0)) ||
         ((*(long *)(unaff_x29 + -0x38) != 0 &&
          ((uVar6 = func_0x007408a0(&uStack0000000000000020), (int)uVar6 != 0 ||
           (((in_stack_00000040 != 0 &&
             (uVar6 = func_0x00740a18(&uStack0000000000000020,":%s"), (int)uVar6 != 0)) ||
            (uVar6 = func_0x007408a0(&uStack0000000000000020,"@"), (int)uVar6 != 0))))))))
      goto LAB_00756d58;
    }
    uVar6 = func_0x007408a0(&uStack0000000000000020,in_stack_00000018);
    if (((int)uVar6 == 0) &&
       ((in_stack_00000010 == 0 ||
        (uVar6 = func_0x00740a18(&uStack0000000000000020,":%s"), (int)uVar6 == 0)))) {
      pcVar1 = pcRam0000000000a2b600;
      func_0x00740a58(&uStack0000000000000020);
      uVar3 = (*pcVar1)();
      uVar6 = 0;
      *(undefined8 *)(unaff_x20 + 0x20) = uVar3;
    }
  }
  else {
    uVar6 = 3;
  }
LAB_00756d58:
  (*(code *)*unaff_x24)(*(undefined8 *)(unaff_x29 + -0x38));
  (*(code *)*unaff_x24)(in_stack_00000040);
  (*(code *)*unaff_x24)(in_stack_00000018);
  (*(code *)*unaff_x24)(in_stack_00000010);
  func_0x00740678(&uStack0000000000000020);
  if ((int)uVar6 == 0) {
    in_stack_00000040 = 0;
    *(undefined8 *)(unaff_x29 + -0x38) = 0;
    func_0x0074066c(&uStack0000000000000020,0x100000);
    iVar2 = func_0x00789530();
    if ((iVar2 != 0) || (uVar4 = func_0x00789530(), (uVar4 & 0xffffffef) != 0)) {
      uVar6 = 3;
      goto code_r0x00756de0;
    }
    lVar5 = *(long *)(unaff_x29 + -0x38);
    if (lVar5 == 0 && in_stack_00000040 == 0) {
      *(undefined8 *)(unaff_x20 + 0x28) = 0;
code_r0x00756eb4:
      uVar6 = 0;
    }
    else {
      if ((lVar5 != 0) && (in_stack_00000040 == 0)) {
        *(long *)(unaff_x20 + 0x28) = lVar5;
        *(undefined8 *)(unaff_x29 + -0x38) = 0;
        goto code_r0x00756eb4;
      }
      if (lVar5 == 0) {
        uVar6 = 3;
      }
      else {
        uVar6 = func_0x007408a0(&uStack0000000000000020);
        if ((int)uVar6 != 0) goto code_r0x00756de0;
      }
      if ((in_stack_00000040 == 0) ||
         (uVar6 = func_0x00740a18(&uStack0000000000000020,"?%s"), (int)uVar6 == 0)) {
        pcVar1 = pcRam0000000000a2b600;
        func_0x00740a58(&uStack0000000000000020);
        lVar5 = (*pcVar1)();
        *(long *)(unaff_x20 + 0x28) = lVar5;
        if (lVar5 != 0) goto code_r0x00756eb4;
      }
    }
code_r0x00756de0:
    (*(code *)*unaff_x24)(*(undefined8 *)(unaff_x29 + -0x38));
    (*(code *)*unaff_x24)(in_stack_00000040);
    func_0x00740678(&uStack0000000000000020);
    if ((int)uVar6 == 0) {
      func_0x00740aa4(unaff_x20 + 0x30,0,0x100000);
      func_0x00740aa4(unaff_x20 + 0x68,0,0x100000);
      goto code_r0x00756e48;
    }
  }
  (*(code *)*unaff_x24)(*(undefined8 *)(unaff_x20 + 0x18));
  (*(code *)*unaff_x24)(*(undefined8 *)(unaff_x20 + 0x20));
  (*(code *)*unaff_x24)(*(undefined8 *)(unaff_x20 + 0x28));
  func_0x00740ab8(unaff_x20 + 0x30);
  func_0x00740ab8(unaff_x20 + 0x68);
  (*(code *)*unaff_x24)();
  unaff_x20 = 0;
code_r0x00756e48:
  *unaff_x19 = unaff_x20;
  return uVar6;
}

