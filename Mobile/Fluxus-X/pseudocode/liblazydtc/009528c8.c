/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009528c8
 */

undefined8 FUN_009528c8(long param_1)

{
  undefined8 uVar1;
  char *pcVar2;
  undefined *puVar3;
  uint uVar4;
  long lVar5;
  
  lVar5 = *(long *)(param_1 + 0x20);
  if (*(int *)(*(long *)(param_1 + 0x1a0) + 0x10) != 0) {
    if (((((ulong)*(byte *)(lVar5 + 0x536) != 0xd) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0))
        && ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
       && (0 < DAT_00cc46c0)) {
      FUN_00905258(param_1,"[%s] -> [%s]",(&PTR_DAT_00c508c0)[*(byte *)(lVar5 + 0x536)],
                   "RETR_PREQUOTE");
    }
    *(undefined1 *)(lVar5 + 0x536) = 0xd;
    uVar1 = FUN_0095102c(param_1,1,0xd);
    return uVar1;
  }
  uVar4 = (uint)*(undefined8 *)(param_1 + 0xa82);
  if ((uVar4 >> 0xc & 1) != 0) {
    uVar1 = FUN_00952adc(param_1,0);
    return uVar1;
  }
  if ((uVar4 >> 0xf & 1) == 0) {
    uVar1 = FUN_00951e08(param_1,lVar5);
    return uVar1;
  }
  puVar3 = *(undefined **)(lVar5 + 0x4e0);
  if (puVar3 == (undefined *)0x0) {
    puVar3 = *(undefined **)(param_1 + 0x818);
    if ((puVar3 == (undefined *)0x0) &&
       (puVar3 = &DAT_002ab6c8, (*(byte *)(param_1 + 0x131d) & 0x20) != 0)) {
      puVar3 = &DAT_002cd0f2;
    }
    pcVar2 = "PRET %s";
  }
  else if ((*(byte *)(param_1 + 0x131e) >> 1 & 1) == 0) {
    pcVar2 = "PRET RETR %s";
  }
  else {
    pcVar2 = "PRET STOR %s";
  }
  uVar1 = FUN_009453ec(param_1,lVar5 + 0x428,pcVar2,puVar3);
  if ((int)uVar1 == 0) {
    lVar5 = *(long *)(param_1 + 0x20);
    if (((((ulong)*(byte *)(lVar5 + 0x536) != 0x1d) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0))
        && ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
       && (0 < DAT_00cc46c0)) {
      if (lVar5 == 0) {
        puVar3 = &DAT_002c11b5;
      }
      else {
        puVar3 = (&PTR_DAT_00c508c0)[*(byte *)(lVar5 + 0x536)];
      }
      FUN_00905258(param_1,"[%s] -> [%s]",puVar3,&DAT_002b38a0);
    }
    uVar1 = 0;
    *(undefined1 *)(lVar5 + 0x536) = 0x1d;
  }
  return uVar1;
}

