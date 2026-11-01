
long * FUN_0063be80(long *param_1)

{
  int iVar1;
  undefined8 uVar2;
  code *unaff_x20;
  ulong unaff_x21;
  long *plVar3;
  long lVar4;
  long lVar5;
  
  if (*(char *)((long)param_1 + 0x21) != '\0') {
    lVar5 = param_1[3];
    _strlen();
    uVar2 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm(lVar5);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm(uVar2,";",1);
  }
  if (((char)param_1[4] != '\0') || (iVar1 = _strcmp(), iVar1 != 0)) {
    return param_1;
  }
  func_0x0003eef0();
  if ((unaff_x21 & 1) != 0) {
    unaff_x20 = *(code **)(*(long *)(*param_1 + ((long)unaff_x21 >> 1)) +
                          ((ulong)unaff_x20 & 0xffffffff));
  }
  lVar5 = (*unaff_x20)();
  lVar4 = param_1[3];
  plVar3 = *(long **)(lVar4 + 0x10);
  uVar2 = 0;
  if (*(long **)(lVar5 + 0x10) != (long *)0x0) {
    uVar2 = (**(code **)(**(long **)(lVar5 + 0x10) + 0xc0))();
  }
  *(undefined8 *)(lVar4 + 0x10) = uVar2;
  if (plVar3 != (long *)0x0) {
    (**(code **)(*plVar3 + 8))(plVar3);
  }
  func_0x00677180(lVar4 + 0x18,lVar5 + 0x18);
  func_0x00677180(lVar4 + 0x38,lVar5 + 0x38);
  func_0x00677180(lVar4 + 0x60,lVar5 + 0x60);
  func_0x00677180(lVar4 + 0x80,lVar5 + 0x80);
  *(undefined1 *)(lVar4 + 0xa0) = *(undefined1 *)(lVar5 + 0xa0);
  *(undefined1 *)(param_1 + 4) = 1;
  return param_1;
}

