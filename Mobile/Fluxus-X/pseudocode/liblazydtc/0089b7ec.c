/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089b7ec
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_140(void)

{
  int iVar1;
  undefined4 *puVar2;
  undefined1 *puVar3;
  
  DAT_00d1ef70 = "LuauCompileLoopUnrollThreshold";
  DAT_00d1ef78 = DAT_00d1eec8;
  DAT_00d1ef6c = 0;
  DAT_00d1ef68 = 0x19;
  DAT_00d1ef80 = 0;
  DAT_00d1ef90 = "LuauCompileLoopUnrollThresholdMaxBoost";
  DAT_00d1ef98 = &DAT_00d1ef68;
  DAT_00d1efa8 = 0x19;
  DAT_00d1efb0 = "LuauCompileInlineThreshold";
  DAT_00d1efb8 = &DAT_00d1ef88;
  DAT_00d1ef88 = 300;
  puVar3 = &DAT_00d1f0c8;
  DAT_00d1efc8 = 300;
  DAT_00d1efac = 0;
  DAT_00d1efc0 = 0;
  DAT_00d1efd0 = "LuauCompileInlineThresholdMaxBoost";
  DAT_00d1efd8 = &DAT_00d1efa8;
  DAT_00d1efcc = 0;
  DAT_00d1efe8 = 5;
  DAT_00d1efe0 = 0;
  DAT_00d1eff0 = "LuauCompileInlineDepth";
  DAT_00d1eff8 = &DAT_00d1efc8;
  DAT_00d1eec8 = &DAT_00d1efe8;
  _DAT_00d1f008 = 0;
  DAT_00d1f010 = "LuauCompileRemoveStatLocalLoop";
  DAT_00d1f018 = DAT_00d1eec0;
  DAT_00d1f020 = 0;
  DAT_00d1f030 = "LuauCompileMoveElisionFix";
  DAT_00d1f038 = &DAT_00d1f008;
  DAT_00d1f028 = 0;
  DAT_00d1f040 = 0;
  DAT_00d1f050 = "LuauCompileNoDebugConst";
  DAT_00d1f058 = &DAT_00d1f028;
  _DAT_00d1f048 = 0;
  DAT_00d1f060 = 0;
  DAT_00d1f070 = "LuauCompileConcatTargetTop";
  DAT_00d1f078 = &DAT_00d1f048;
  _DAT_00d1f068 = 0;
  DAT_00d1f080 = 0;
  DAT_00d1f090 = "LuauCompileReuseLowersLimit";
  DAT_00d1f098 = &DAT_00d1f068;
  DAT_00d1ef8c = 0;
  DAT_00d1efa0 = 0;
  DAT_00d1efec = 0;
  DAT_00d1f000 = 0;
  _DAT_00d1f088 = 0;
  DAT_00d1f0a0 = 0;
  _DAT_00d1f0a8 = 0;
  DAT_00d1f0b0 = "LuauOptimizeExportTable";
  DAT_00d1f0b8 = &DAT_00d1f088;
  DAT_00d1f0c0 = 0;
  _DAT_00d1f0c8 = 0;
  DAT_00d1f0d0 = "LuauExportedTypesParticipateInScc";
  DAT_00d1f0d8 = &DAT_00d1f0a8;
  DAT_00d1f0e0 = 0;
  DAT_00d1eec0 = &DAT_00d1f0c8;
  do {
    iVar1 = strcmp(*(char **)(puVar3 + 8),"LuauExportedTypesParticipateInScc");
    if (iVar1 == 0) {
      *(undefined4 *)(puVar3 + 0x18) = 3;
    }
    puVar3 = *(undefined1 **)(puVar3 + 0x10);
  } while (puVar3 != (undefined1 *)0x0);
  puVar2 = &DAT_00d1efe8;
  do {
    iVar1 = strcmp(*(char **)(puVar2 + 2),"LuauExportedTypesParticipateInScc");
    if (iVar1 == 0) {
      puVar2[6] = 3;
    }
    puVar2 = *(undefined4 **)(puVar2 + 4);
  } while (puVar2 != (undefined4 *)0x0);
  DAT_00d1f0f0 = "LuauCompileReuseLocalRegs";
  DAT_00d1f0f8 = &DAT_00d1f0c8;
  _DAT_00d1f0e8 = 0;
  DAT_00d1f100 = 0;
  DAT_00d1f110 = "LuauCompileRequireNoInline";
  DAT_00d1f118 = &DAT_00d1f0e8;
  _DAT_00d1f108 = 0;
  DAT_00d1f120 = 0;
  _DAT_00d1f128 = 0;
  DAT_00d1f130 = "LuauCompileLoopUnrollNegativeZero";
  DAT_00d1f138 = &DAT_00d1f108;
  DAT_00d1f140 = 0;
  DAT_00d1eec0 = &DAT_00d1f128;
  return;
}

