
undefined8 FUN_004133ac(void)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  undefined8 uStack0000000000000018;
  undefined8 *in_stack_00000020;
  
  func_0x00413e5c(&uStack0000000000000018);
  lVar2 = uStack0000000000000018;
  uVar1 = func_0x00429c6c();
  if (lVar2 == -0x8000000000000000) {
    if (((ulong)in_stack_00000020 & 3) != 1) {
      return uVar1;
    }
    puVar3 = (undefined8 *)((long)in_stack_00000020 + -1);
    uVar4 = *puVar3;
    puVar5 = *(undefined8 **)((long)in_stack_00000020 + 7);
    if ((code *)*puVar5 != (code *)0x0) {
      (*(code *)*puVar5)(uVar4);
    }
    if (puVar5[1] != 0) {
      func_0x00187bd4(uVar4,puVar5[1],puVar5[2]);
    }
    lVar2 = 0x18;
    uVar4 = 8;
  }
  else {
    if (lVar2 == 0) {
      return uVar1;
    }
    uVar4 = 1;
    puVar3 = in_stack_00000020;
  }
  func_0x00187bd4(puVar3,lVar2,uVar4);
  return uVar1;
}

