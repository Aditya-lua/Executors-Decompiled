/* 7ff70c93e770 FUN_7ff70c93e770 */

undefined8 FUN_7ff70c93e770(undefined8 param_1)

{
  int iVar1;
  longlong lVar2;
  undefined1 **ppuVar3;
  undefined *puVar4;
  undefined1 *puStack_258;
  undefined8 auStack_250 [2];
  short asStack_23a [9];
  undefined auStack_228 [536];
  
  puVar4 = auStack_228;
  auStack_250[0] = 0x7ff70c93e791;
  FUN_7ff70cb12b80(puVar4,0,0x20a);
  puStack_258 = (undefined *)0x7ff70c93e79f;
  auStack_250[0] = param_1;
  iVar1 = func_0x7ff70d8594c4(0x105,puVar4);
  if (iVar1 - 0x106U < 0xfffffefb) {
    puVar4 = &UNK_7ff70cb92910;
    ppuVar3 = (undefined1 **)auStack_250;
  }
  else {
    puStack_258 = puVar4;
    lVar2 = func_0x7ff70d9af272(puVar4);
    ppuVar3 = &puStack_258;
    if (asStack_23a[lVar2] == 0x5c) {
      asStack_23a[lVar2] = 0;
      ppuVar3 = &puStack_258;
    }
  }
  *(undefined8 *)((longlong)ppuVar3 + -8) = 0x7ff70c93e7d7;
  FUN_7ff70c93cdb0(param_1,puVar4);
  return param_1;
}


