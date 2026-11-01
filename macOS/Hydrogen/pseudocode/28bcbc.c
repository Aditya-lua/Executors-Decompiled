
undefined8
FUN_0028bcbc(undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4,ulong param_5,
            undefined8 param_6)

{
  undefined8 *puVar1;
  uint uVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  
  _uStack0000000000000010 = 0;
  uStack0000000000000018 = (undefined8 *)func_0x0036e31c(0x10);
  if ((((uStack0000000000000018 == (undefined8 *)0x0) ||
       (uStack0000000000000008 = param_4,
       lVar4 = func_0x0028ca3c(&uStack0000000000000018,&uStack0000000000000008,param_5), lVar4 == 0)
       ) || (uStack0000000000000008 != param_4 + param_5)) ||
     ((uVar2 = func_0x0028cac8(uStack0000000000000018,&uStack0000000000000010), (int)uVar2 < 0 ||
      (uVar2 != param_5)))) {
    func_0x0036e3d8(_uStack0000000000000010);
  }
  else {
    if ((param_5 == 0) || (iVar3 = _memcmp(param_4,_uStack0000000000000010,param_5), iVar3 == 0)) {
      uVar5 = func_0x0028b9c4(param_1,param_2,param_3,uStack0000000000000018,param_6);
      func_0x0036e3d8(_uStack0000000000000010);
      puVar1 = uStack0000000000000018;
      goto joined_r0x0028bdd8;
    }
    func_0x0036e3d8(_uStack0000000000000010);
  }
  uVar5 = 0;
  puVar1 = uStack0000000000000018;
joined_r0x0028bdd8:
  if (puVar1 != (undefined8 *)0x0) {
    uStack0000000000000018 = puVar1;
    func_0x0029bc0c(*puVar1);
    func_0x0029bc0c(puVar1[1]);
    func_0x0036e3d8(puVar1);
  }
  return uVar5;
}

