
void FUN_006866f4(long param_1,long param_2,ulong param_3)

{
  uint uVar1;
  long lVar2;
  uint in_w9;
  
  while( true ) {
    lVar2 = param_1 + -1;
    if (param_1 == 0) break;
    uVar1 = in_w9 + ((uint)(param_3 >> 8) & 0xff) + (uint)*(byte *)(*(long *)(param_2 + -8) + lVar2)
    ;
    *(char *)(*(long *)(param_2 + 0x20) + lVar2) = (char)uVar1;
    in_w9 = uVar1 >> 8;
    param_3 = param_3 >> 8;
    param_1 = lVar2;
  }
  return;
}

