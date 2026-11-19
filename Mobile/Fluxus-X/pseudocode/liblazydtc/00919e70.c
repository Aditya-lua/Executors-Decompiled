/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00919e70
 */

void FUN_00919e70(long param_1,long param_2)

{
  char *pcVar1;
  bool bVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  undefined *puVar6;
  uint uVar7;
  long lVar8;
  
  lVar8 = *(long *)(param_1 + 0xf0);
  lVar3 = FUN_00935f5c();
  uVar5 = lVar3 - lVar8;
  if (lVar3 < 0) {
    uVar5 = 0xffffffffffffffff;
  }
  uVar4 = FUN_00935c98(param_1);
  uVar7 = *(uint *)(param_1 + 0x1b1);
  if ((uVar4 & 1) != 0) {
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"Need to rewind upload for next request");
    }
    FUN_00935430(param_1,1);
  }
  if (((1999 < uVar5) && ((uVar7 >> 7 & 1) == 0)) &&
     (((uint)*(undefined8 *)(param_2 + 0x3a0) >> 6 & 1) == 0)) {
    if ((*(long *)(param_1 + 0xd78) == 8) ||
       (puVar6 = (undefined *)0x0, *(long *)(param_1 + 0xd58) == 8)) {
      if (*(int *)(param_2 + 0x3f0) != 0) {
        return;
      }
      if (*(int *)(param_2 + 0x3f4) != 0) {
        return;
      }
      puVar6 = &DAT_002a734c;
    }
    uVar7 = (uint)*(undefined8 *)(param_1 + 0xa82);
    if ((long)uVar5 < 0) {
      if (((uVar7 >> 0x1c & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        bVar2 = puVar6 == (undefined *)0x0;
        if (bVar2) {
          puVar6 = &DAT_002ab32c;
        }
        pcVar1 = " send, ";
        if (bVar2) {
          pcVar1 = "";
        }
        FUN_00904c98(param_1,"%s%sclose instead of sending unknown amount of more bytes",puVar6,
                     pcVar1);
      }
    }
    else if (((uVar7 >> 0x1c & 1) != 0) &&
            ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
    {
      bVar2 = puVar6 == (undefined *)0x0;
      if (bVar2) {
        puVar6 = &DAT_002ab32c;
      }
      pcVar1 = " send, ";
      if (bVar2) {
        pcVar1 = "";
      }
      FUN_00904c98(param_1,"%s%sclose instead of sending %ld more bytes",puVar6,pcVar1,uVar5);
    }
    FUN_00908c4c(param_2,2);
    *(undefined8 *)(param_1 + 0xd8) = 0;
  }
  return;
}

