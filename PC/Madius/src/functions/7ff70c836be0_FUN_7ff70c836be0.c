/* 7ff70c836be0 FUN_7ff70c836be0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_7ff70c836be0(undefined8 *param_1)

{
  longlong lVar1;
  code *pcVar2;
  undefined8 *puVar3;
  longlong lVar4;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  lVar1 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  lVar4 = 0x248;
  if ((*(longlong *)(lVar1 + 0x1c8) == 0) && (*(longlong *)(_DAT_7ff70cc1a3c0 + 0x2278) == 0)) {
    lVar4 = 0x278;
  }
  *param_1 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar1 + lVar4) >> 0x20) -
                      (float)((ulonglong)*(undefined8 *)(lVar1 + 0x118) >> 0x20),
                      (float)*(undefined8 *)(lVar1 + lVar4) - (float)*(undefined8 *)(lVar1 + 0x118))
  ;
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return param_1;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar2 = (code *)swi(3);
  puVar3 = (undefined8 *)(*pcVar2)();
  return puVar3;
}


