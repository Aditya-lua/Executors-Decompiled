
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0064e5bc(undefined8 param_1,long param_2,undefined8 param_3)

{
  ulong uVar1;
  byte bVar2;
  undefined1 uVar3;
  int iVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  long *unaff_x23;
  long unaff_x24;
  
  iVar4 = _strcmp(param_3,param_2 + 0x3df);
  if (iVar4 == 0) {
    *(undefined2 *)(unaff_x19 + 0x20) = 0x101;
    func_0x0003eef0();
    if (unaff_x23 != (long *)0x0) {
      (**(code **)(*unaff_x23 + 0x10))();
    }
    uVar1 = _UNK_00a10bc8;
    if ((_UNK_00a10bc8 != _UNK_00a0fc80) &&
       ((-1 < (long)(_UNK_00a0fc80 & _UNK_00a10bc8) ||
        (iVar4 = _strcmp(_UNK_00a10bc8 & 0x7fffffffffffffff,_UNK_00a0fc80 & 0x7fffffffffffffff),
        iVar4 != 0)))) {
      func_0x0067ecf4();
    }
    uVar5 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (*(undefined8 *)(unaff_x19 + 0x18),"ThisPointer:",0xc);
    uVar6 = _strlen(uVar1 & 0x7fffffffffffffff);
    uVar5 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (uVar5,uVar1 & 0x7fffffffffffffff,uVar6);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc(uVar5,0x3b);
    if (*(char *)(unaff_x19 + 0x20) != '\0') {
      return;
    }
    unaff_x24 = *(long *)(unaff_x19 + 8);
    iVar4 = _strncmp(unaff_x24,"ThisPointer:",0xc);
  }
  else {
    iVar4 = _strncmp();
  }
  if ((iVar4 == 0) &&
     (iVar4 = _strcmp(unaff_x24 + 0xc,_UNK_00a10bc8 & 0x7fffffffffffffff), iVar4 == 0)) {
    func_0x0003eef0(unaff_x24,&UNK_00a09890,*(undefined8 *)(unaff_x19 + 0x10));
    *unaff_x20 = unaff_x21;
    uVar3 = 1;
  }
  else {
    if (unaff_x23 != (long *)0x0) {
      bVar2 = (**(code **)(*unaff_x23 + 0x10))();
      *(byte *)(unaff_x19 + 0x20) = bVar2;
      if ((bVar2 & 1) != 0) {
        return;
      }
    }
    if (_UNK_00a10bc8 == _UNK_00a0fc80) {
      return;
    }
    if (((long)(_UNK_00a0fc80 & _UNK_00a10bc8) < 0) &&
       (iVar4 = _strcmp(_UNK_00a10bc8 & 0x7fffffffffffffff,_UNK_00a0fc80 & 0x7fffffffffffffff),
       iVar4 == 0)) {
      return;
    }
    uVar3 = func_0x0067ecf4();
  }
  *(undefined1 *)(unaff_x19 + 0x20) = uVar3;
  return;
}

