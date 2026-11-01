
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long FUN_0073a7c0(undefined8 param_1,uint param_2)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined1 uVar4;
  undefined8 uStack_44;
  undefined8 uStack_3c;
  undefined4 uStack_34;
  
  iVar1 = _inet_pton(2,param_1,&uStack_34);
  if (iVar1 < 1) {
    iVar1 = _inet_pton(0x1e,param_1,&uStack_44);
    if (iVar1 < 1) {
      return 0;
    }
    lVar2 = _strlen(param_1);
    lVar3 = (*pcRam0000000000a2b608)(1,lVar2 + 0x4d);
    if (lVar3 == 0) {
      return 0;
    }
    *(long *)(lVar3 + 0x18) = lVar3 + 0x4c;
    *(long *)(lVar3 + 0x20) = lVar3 + 0x30;
    _memcpy(lVar3 + 0x4c,param_1,lVar2 + 1);
    *(undefined8 *)(lVar3 + 4) = _UNK_008ccdb8;
    *(undefined4 *)(lVar3 + 0x10) = 0x1c;
    *(undefined8 *)(lVar3 + 0x40) = uStack_3c;
    *(undefined8 *)(lVar3 + 0x38) = uStack_44;
    uVar4 = 0x1e;
  }
  else {
    lVar2 = _strlen(param_1);
    lVar3 = (*pcRam0000000000a2b608)(1,lVar2 + 0x41);
    if (lVar3 == 0) {
      return 0;
    }
    *(long *)(lVar3 + 0x18) = lVar3 + 0x40;
    *(long *)(lVar3 + 0x20) = lVar3 + 0x30;
    _memcpy(lVar3 + 0x40,param_1,lVar2 + 1);
    *(undefined8 *)(lVar3 + 4) = _UNK_0080c170;
    *(undefined4 *)(lVar3 + 0x10) = 0x10;
    *(undefined4 *)(lVar3 + 0x34) = uStack_34;
    uVar4 = 2;
  }
  *(undefined1 *)(lVar3 + 0x31) = uVar4;
  *(ushort *)(lVar3 + 0x32) = (ushort)(param_2 >> 8) & 0xff | (ushort)((param_2 & 0xff00ff) << 8);
  return lVar3;
}

