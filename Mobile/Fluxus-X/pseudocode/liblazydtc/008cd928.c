/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cd928
 */

void FUN_008cd928(long param_1,int param_2,uint param_3)

{
  short sVar1;
  undefined8 uVar2;
  uint uVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  long lVar6;
  long lVar7;
  undefined1 auVar8 [16];
  
  sVar1 = *(short *)(param_1 + 0x28);
  *(short *)(param_1 + 0x28) = sVar1 + 1;
  if (199 < (ushort)(sVar1 + 1U)) {
    FUN_008b42d8(param_1);
  }
  lVar7 = *(long *)(param_1 + 0x68);
  if (*(long *)(param_1 + 0x48) - lVar7 < 0x141) {
    FUN_008b41e4(param_1,0x14);
    lVar7 = *(long *)(param_1 + 0x68);
  }
  lVar6 = lVar7 + (long)param_2 * -0x10;
  if (*(long *)(param_1 + 0x50) == *(long *)(param_1 + 0x18)) {
    puVar4 = (undefined8 *)FUN_008b4200(param_1);
  }
  else {
    puVar4 = (undefined8 *)(*(long *)(param_1 + 0x50) + 0x30);
    *(undefined8 **)(param_1 + 0x50) = puVar4;
  }
  *puVar4 = 0;
  puVar4[1] = lVar6 + -0x10;
  puVar4[2] = lVar6;
  puVar4[3] = lVar7 + 0x140;
  puVar4[4] = 0;
  *(long *)(param_1 + 0x70) = lVar6;
  *(uint *)(puVar4 + 5) = ~param_3 >> 0x1f;
  *(undefined4 *)((long)puVar4 + 0x2c) = 0;
  uVar3 = (**(code **)(*(long *)(lVar6 + -0x10) + 0x28))(param_1);
  lVar7 = *(long *)(param_1 + 0x50);
  if (-1 < (int)param_3) {
    if ((int)uVar3 < 1) {
      *(undefined4 *)(*(long *)(lVar7 + -0x20) + (ulong)param_3 * 0x10 + 0xc) = 0;
    }
    else {
      puVar5 = (undefined8 *)(*(long *)(param_1 + 0x68) + (ulong)uVar3 * -0x10);
      uVar2 = *puVar5;
      puVar4 = (undefined8 *)(*(long *)(lVar7 + -0x20) + (ulong)param_3 * 0x10);
      puVar4[1] = puVar5[1];
      *puVar4 = uVar2;
    }
  }
  auVar8 = *(undefined1 (*) [16])(lVar7 + -0x20);
  *(long *)(param_1 + 0x50) = lVar7 + -0x30;
  auVar8 = NEON_ext(auVar8,auVar8,8,1);
  *(long *)(param_1 + 0x70) = auVar8._8_8_;
  *(long *)(param_1 + 0x68) = auVar8._0_8_;
  *(short *)(param_1 + 0x28) = *(short *)(param_1 + 0x28) + -1;
  return;
}

