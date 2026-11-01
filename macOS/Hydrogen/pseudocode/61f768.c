
void FUN_0061f768(undefined8 *param_1,long param_2)

{
  ulong *puVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 auStack_58 [2];
  char cStack_41;
  ulong uStack_40;
  ulong uStack_38;
  ulong uStack_30;
  
  lVar3 = *(long *)(param_2 + 0x10);
  if (lVar3 == 0) {
    uStack_30 = uStack_30 & 0xffffffffffffff;
    uStack_40 = uStack_40 & 0xffffffffffffff00;
  }
  else {
    (**(code **)(*(long *)(lVar3 + 8) + 0x18))(auStack_58);
    puVar1 = (ulong *)__ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                                (auStack_58,"/",1);
    uStack_38 = puVar1[1];
    uStack_40 = *puVar1;
    uStack_30 = puVar1[2];
    puVar1[1] = 0;
    puVar1[2] = 0;
    *puVar1 = 0;
  }
  puVar2 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     (&uStack_40,"CBC/CTS",7);
  uVar4 = *puVar2;
  param_1[1] = puVar2[1];
  *param_1 = uVar4;
  param_1[2] = puVar2[2];
  puVar2[1] = 0;
  puVar2[2] = 0;
  *puVar2 = 0;
  if ((long)uStack_30 < 0) {
    __ZdlPv(uStack_40);
  }
  if ((lVar3 == 0) || (-1 < cStack_41)) {
    return;
  }
  __ZdlPv(auStack_58[0]);
  return;
}

