
void FUN_00062c4c(undefined8 param_1)

{
  uint uVar1;
  code *pcVar2;
  byte *pbVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined1 *puVar7;
  undefined8 *extraout_x8;
  long lVar8;
  ulong uVar9;
  long *unaff_x21;
  long lVar10;
  undefined8 uStack_80;
  undefined8 uStack_78;
  long lStack_70;
  undefined1 uStack_61;
  
  if (unaff_x21 != (long *)0x0) {
    (**(code **)(*unaff_x21 + 8))();
  }
  __Unwind_Resume(param_1);
  pcVar2 = pcRam0000000000a2b9d0;
  pbVar3 = (byte *)(*pcRam0000000000a2b9d0)(0xa2b9d0);
  if ((*pbVar3 & 1) == 0) {
    uVar6 = (*pcRam0000000000a2b9b8)(0xa2b9b8);
    func_0x0006364c(uVar6,&uStack_61);
    puVar7 = (undefined1 *)(*pcVar2)(0xa2b9d0);
    *puVar7 = 1;
  }
  uStack_80 = 0;
  uStack_78 = 0;
  lStack_70 = 0;
  lVar4 = (*pcRam0000000000a2b9b8)(0xa2b9b8);
  lVar10 = 0x10;
  do {
    lVar8 = *(long *)(lVar4 + 0x9c0);
    uVar9 = (lVar8 + 1U) % 0x270;
    uVar1 = *(uint *)(lVar4 + uVar9 * 4);
    uVar1 = *(uint *)(lVar4 + ((lVar8 + 0x18dU) % 0x270) * 4) ^
            (uVar1 & 0x7ffffffe | *(uint *)(lVar4 + lVar8 * 4) & 0x80000000) >> 1 ^
            -(uVar1 & 1) & 0x9908b0df;
    *(uint *)(lVar4 + lVar8 * 4) = uVar1;
    uVar1 = uVar1 ^ uVar1 >> 0xb;
    *(ulong *)(lVar4 + 0x9c0) = uVar9;
    uVar1 = (uVar1 & 0x13a58ad) << 7 ^ uVar1;
    uVar1 = (uVar1 & 0x1df8c) << 0xf ^ uVar1;
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
              (&uStack_80,
               (long)"0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
                     [(uVar1 ^ uVar1 >> 0x12) % 0x3e]);
    lVar10 = lVar10 + -1;
  } while (lVar10 != 0);
  puVar5 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6insertEmPKcm
                     (&uStack_80,0,"--cpp-httplib-multipart-data-",0x1d);
  uVar6 = *puVar5;
  extraout_x8[1] = puVar5[1];
  *extraout_x8 = uVar6;
  extraout_x8[2] = puVar5[2];
  puVar5[1] = 0;
  puVar5[2] = 0;
  *puVar5 = 0;
  if (lStack_70 < 0) {
    __ZdlPv(uStack_80);
  }
  return;
}

