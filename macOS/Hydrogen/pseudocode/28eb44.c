
undefined4 FUN_0028eb44(void)

{
  uint uVar1;
  undefined4 uVar2;
  int iVar3;
  long lVar4;
  undefined8 *puVar5;
  
  lVar4 = func_0x00373eb8(0);
  if (((lVar4 == 0) &&
      ((lVar4 = _calloc(1,400), lVar4 == 0 ||
       (iVar3 = func_0x00373f5c(0,lVar4,&DAT_00290080), iVar3 == 0)))) ||
     (*(int *)(lVar4 + 0x184) == *(int *)(lVar4 + 0x180))) {
    return 0;
  }
  uVar1 = *(int *)(lVar4 + 0x184) + 1U & 0xf;
  puVar5 = (undefined8 *)(lVar4 + (ulong)uVar1 * 0x18);
  uVar2 = *(undefined4 *)(puVar5 + 2);
  _free(puVar5[1]);
  *puVar5 = 0;
  puVar5[1] = 0;
  puVar5[2] = 0;
  *(uint *)(lVar4 + 0x184) = uVar1;
  return uVar2;
}

