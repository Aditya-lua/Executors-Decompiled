/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008563ac
 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_135(void)

{
  ulong uVar1;
  int iVar2;
  size_t sVar3;
  long lVar4;
  void *pvVar5;
  undefined4 *puVar6;
  undefined1 *puVar7;
  undefined8 *local_220 [2];
  long local_210;
  ulong local_208;
  size_t local_200;
  void *local_1f8;
  undefined8 local_1f0;
  size_t local_1e8;
  void *local_1e0;
  undefined8 local_1d8;
  size_t local_1d0;
  void *local_1c8;
  undefined8 local_1c0;
  size_t local_1b8;
  void *local_1b0;
  undefined8 local_1a8;
  size_t local_1a0;
  void *local_198;
  undefined8 local_190;
  size_t local_188;
  void *pvStack_180;
  undefined8 local_178;
  size_t local_170;
  void *pvStack_168;
  undefined8 local_160;
  size_t local_158;
  void *pvStack_150;
  undefined8 local_148;
  size_t local_140;
  void *pvStack_138;
  undefined8 local_130;
  size_t local_128;
  void *pvStack_120;
  undefined8 local_118;
  size_t local_110;
  void *pvStack_108;
  undefined8 local_100;
  size_t local_f8;
  void *pvStack_f0;
  undefined8 local_e8;
  size_t local_e0;
  void *pvStack_d8;
  undefined8 local_d0;
  size_t local_c8;
  void *pvStack_c0;
  undefined8 local_b8;
  size_t local_b0;
  void *pvStack_a8;
  undefined8 local_a0;
  size_t local_98;
  void *pvStack_90;
  undefined8 local_88;
  size_t local_80;
  void *local_78;
  long local_70;
  
  local_210 = tpidr_el0;
  local_70 = *(long *)(local_210 + 0x28);
  DAT_00d1eba0 = 1000;
  DAT_00d1ebc0 = 1000;
  DAT_00d1eba4 = 0;
  puVar7 = &DAT_00d1ec40;
  DAT_00d1eba8 = "LuauRecursionLimit";
  DAT_00d1ebb0 = DAT_00d1eec8;
  DAT_00d1ebb8 = 0;
  DAT_00d1ebc8 = "LuauTypeLengthLimit";
  DAT_00d1ebd0 = &DAT_00d1eba0;
  DAT_00d1ebc4 = 0;
  DAT_00d1ebe0 = 100;
  DAT_00d1ebe4 = 0;
  DAT_00d1ebe8 = "LuauParseErrorLimit";
  DAT_00d1ebf0 = &DAT_00d1ebc0;
  DAT_00d1ebf8 = 0;
  DAT_00d1eec8 = &DAT_00d1ebe0;
  DAT_00d1ebd8 = 0;
  DAT_00d1ec08 = "LuauSolverV2";
  DAT_00d1ec10 = DAT_00d1eec0;
  DAT_00d1ec00 = 0;
  _DAT_00d1ec20 = 0x100;
  DAT_00d1ec18 = 0;
  DAT_00d1ec28 = "DebugLuauReportReturnTypeVariadicWithTypeSuffix";
  DAT_00d1ec30 = &DAT_00d1ec00;
  DAT_00d1ec38 = 0;
  _DAT_00d1ec40 = 0;
  DAT_00d1ec48 = "LuauExportValueSyntax";
  DAT_00d1ec50 = &DAT_00d1ec20;
  DAT_00d1ec58 = 0;
  DAT_00d1eec0 = (undefined2 *)&DAT_00d1ec40;
  do {
    iVar2 = strcmp(*(char **)(puVar7 + 8),"LuauExportValueSyntax");
    if (iVar2 == 0) {
      *(undefined4 *)(puVar7 + 0x18) = 5;
    }
    puVar7 = *(undefined1 **)(puVar7 + 0x10);
  } while (puVar7 != (undefined1 *)0x0);
  puVar6 = &DAT_00d1ebe0;
  do {
    iVar2 = strcmp(*(char **)(puVar6 + 2),"LuauExportValueSyntax");
    if (iVar2 == 0) {
      puVar6[6] = 5;
    }
    puVar6 = *(undefined4 **)(puVar6 + 4);
  } while (puVar6 != (undefined4 *)0x0);
  DAT_00d1ec68 = "DebugLuauNoInline";
  DAT_00d1ec70 = &DAT_00d1ec40;
  DAT_00d1ec60 = 0;
  DAT_00d1ec78 = 0;
  DAT_00d1ec88 = "DebugLuauUserDefinedClasses";
  DAT_00d1ec90 = &DAT_00d1ec60;
  _DAT_00d1ec80 = 0;
  DAT_00d1ec98 = 0;
  puVar7 = &DAT_00d1ece0;
  DAT_00d1eca8 = "LuauAllowGlobalDeclarationToBeCalledClass";
  DAT_00d1ecb0 = &DAT_00d1ec80;
  DAT_00d1eca0 = 0;
  DAT_00d1ecb8 = 0;
  _DAT_00d1ecc0 = 0;
  DAT_00d1ecc8 = "LuauSingleTypeOptionalPackReturnsAttributeParens";
  DAT_00d1ecd0 = &DAT_00d1eca0;
  DAT_00d1ecd8 = 0;
  _DAT_00d1ece0 = 0;
  DAT_00d1ece8 = "LuauExperimentalIfLocalSyntax";
  DAT_00d1ecf0 = &DAT_00d1ecc0;
  DAT_00d1ecf8 = 0;
  DAT_00d1eec0 = (undefined2 *)&DAT_00d1ece0;
  do {
    iVar2 = strcmp(*(char **)(puVar7 + 8),"LuauExperimentalIfLocalSyntax");
    if (iVar2 == 0) {
      *(undefined4 *)(puVar7 + 0x18) = 2;
    }
    puVar7 = *(undefined1 **)(puVar7 + 0x10);
  } while (puVar7 != (undefined1 *)0x0);
  puVar6 = &DAT_00d1ebe0;
  do {
    iVar2 = strcmp(*(char **)(puVar6 + 2),"LuauExperimentalIfLocalSyntax");
    if (iVar2 == 0) {
      puVar6[6] = 2;
    }
    puVar6 = *(undefined4 **)(puVar6 + 4);
  } while (puVar6 != (undefined4 *)0x0);
  DAT_00d1ed00 = 0;
  DAT_00d1ed08 = "LuauExperimentalWhileLocalSyntax";
  DAT_00d1ed10 = &DAT_00d1ece0;
  DAT_00d1ed18 = 0;
  DAT_00d1eec0 = &DAT_00d1ed00;
  __cxa_atexit(FUN_00856140,0,&PTR_LOOP_00c48880);
  DAT_00d1edd0 = "deprecated";
  DAT_00d1ed30 = "checked";
  DAT_00d1edd8 = 2;
  DAT_00d1ed80 = "native";
  DAT_00d1ede0 = &PTR_LAB_00c4a638;
  DAT_00d1ed38 = 0;
  DAT_00d1ed40 = 0;
  DAT_00d1ed70 = 0;
  DAT_00d1ed88 = 1;
  DAT_00d1ed90 = 0;
  DAT_00d1edc0 = 0;
  DAT_00d1ede8 = &LAB_008558b8;
  DAT_00d1ee00 = &DAT_00d1ede0;
  DAT_00d1ee10 = 1;
  DAT_00d1ee20 = 0;
  DAT_00d1ee28 = 0;
  DAT_00d1ee30 = 0;
  DAT_00d1ee60 = 0;
  __cxa_atexit(FUN_00856254,0,&PTR_LOOP_00c48880);
  __cxa_atexit(&LAB_00856368,0,&PTR_LOOP_00c48880);
  sVar3 = strlen("__init");
  if (sVar3 < 0xfffffffffffffff8) {
    if (sVar3 < 0x17) {
      pvVar5 = (void *)((ulong)&local_208 | 1);
      local_208 = CONCAT71(local_208._1_7_,(char)((int)sVar3 << 1));
      if (sVar3 != 0) goto LAB_00856754;
    }
    else {
      uVar1 = 0x1a;
      if ((sVar3 | 7) != 0x17) {
        uVar1 = (sVar3 | 7) + 1;
      }
      pvVar5 = operator_new(uVar1);
      local_208 = uVar1 | 1;
      local_200 = sVar3;
      local_1f8 = pvVar5;
LAB_00856754:
      memcpy(pvVar5,"__init",sVar3);
    }
    *(undefined1 *)((long)pvVar5 + sVar3) = 0;
    sVar3 = strlen("__call");
    if (0xfffffffffffffff7 < sVar3) {
      if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0085756c to 008576ef has its CatchHandler @ 008578a0 */
        FUN_007fe124();
      }
      goto LAB_00857824;
    }
    local_220[1] = &local_1f0;
    if (sVar3 < 0x17) {
      pvVar5 = (void *)((long)&local_1f0 + 1);
      local_1f0 = CONCAT71(local_1f0._1_7_,(char)((int)sVar3 << 1));
      if (sVar3 != 0) goto LAB_008567d8;
    }
    else {
      uVar1 = 0x1a;
      if ((sVar3 | 7) != 0x17) {
        uVar1 = (sVar3 | 7) + 1;
      }
                    /* try { // try from 008567c0 to 008567c7 has its CatchHandler @ 008578a0 */
      pvVar5 = operator_new(uVar1);
      local_1f0 = uVar1 | 1;
      local_1e8 = sVar3;
      local_1e0 = pvVar5;
LAB_008567d8:
      memcpy(pvVar5,"__call",sVar3);
    }
    *(undefined1 *)((long)pvVar5 + sVar3) = 0;
    sVar3 = strlen("__concat");
    if (0xfffffffffffffff7 < sVar3) {
      if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_00857824;
    }
    local_220[0] = &local_1d8;
    if (sVar3 < 0x17) {
      pvVar5 = (void *)((long)&local_1d8 + 1);
      local_1d8 = CONCAT71(local_1d8._1_7_,(char)((int)sVar3 << 1));
      if (sVar3 != 0) goto LAB_0085685c;
    }
    else {
      uVar1 = 0x1a;
      if ((sVar3 | 7) != 0x17) {
        uVar1 = (sVar3 | 7) + 1;
      }
                    /* try { // try from 00856844 to 0085684b has its CatchHandler @ 008578a0 */
      pvVar5 = operator_new(uVar1);
      local_1d8 = uVar1 | 1;
      local_1d0 = sVar3;
      local_1c8 = pvVar5;
LAB_0085685c:
      memcpy(pvVar5,"__concat",sVar3);
    }
    *(undefined1 *)((long)pvVar5 + sVar3) = 0;
    sVar3 = strlen("__unm");
    if (0xfffffffffffffff7 < sVar3) {
      if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_00857824;
    }
    if (sVar3 < 0x17) {
      pvVar5 = (void *)((long)&local_1c0 + 1);
      local_1c0 = CONCAT71(local_1c0._1_7_,(char)((int)sVar3 << 1));
      if (sVar3 != 0) goto LAB_008568e0;
    }
    else {
      uVar1 = 0x1a;
      if ((sVar3 | 7) != 0x17) {
        uVar1 = (sVar3 | 7) + 1;
      }
                    /* try { // try from 008568c8 to 008568cf has its CatchHandler @ 008578a0 */
      pvVar5 = operator_new(uVar1);
      local_1c0 = uVar1 | 1;
      local_1b8 = sVar3;
      local_1b0 = pvVar5;
LAB_008568e0:
      memcpy(pvVar5,"__unm",sVar3);
    }
    *(undefined1 *)((long)pvVar5 + sVar3) = 0;
    sVar3 = strlen("__add");
    if (0xfffffffffffffff7 < sVar3) {
      if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_00857824;
    }
    if (sVar3 < 0x17) {
      pvVar5 = (void *)((long)&local_1a8 + 1);
      local_1a8 = CONCAT71(local_1a8._1_7_,(char)((int)sVar3 << 1));
      if (sVar3 != 0) goto LAB_00856964;
    }
    else {
      uVar1 = 0x1a;
      if ((sVar3 | 7) != 0x17) {
        uVar1 = (sVar3 | 7) + 1;
      }
                    /* try { // try from 0085694c to 00856953 has its CatchHandler @ 008578a0 */
      pvVar5 = operator_new(uVar1);
      local_1a8 = uVar1 | 1;
      local_1a0 = sVar3;
      local_198 = pvVar5;
LAB_00856964:
      memcpy(pvVar5,"__add",sVar3);
    }
    *(undefined1 *)((long)pvVar5 + sVar3) = 0;
    sVar3 = strlen("__sub");
    if (0xfffffffffffffff7 < sVar3) {
      if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_00857824;
    }
    if (sVar3 < 0x17) {
      pvVar5 = (void *)((long)&local_190 + 1);
      local_190 = CONCAT71(local_190._1_7_,(char)((int)sVar3 << 1));
      if (sVar3 != 0) goto LAB_008569e8;
    }
    else {
      uVar1 = 0x1a;
      if ((sVar3 | 7) != 0x17) {
        uVar1 = (sVar3 | 7) + 1;
      }
                    /* try { // try from 008569d0 to 008569d7 has its CatchHandler @ 008578a0 */
      pvVar5 = operator_new(uVar1);
      local_190 = uVar1 | 1;
      local_188 = sVar3;
      pvStack_180 = pvVar5;
LAB_008569e8:
      memcpy(pvVar5,"__sub",sVar3);
    }
    *(undefined1 *)((long)pvVar5 + sVar3) = 0;
    sVar3 = strlen("__mul");
    if (0xfffffffffffffff7 < sVar3) {
      if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_00857824;
    }
    if (sVar3 < 0x17) {
      pvVar5 = (void *)((long)&local_178 + 1);
      local_178 = CONCAT71(local_178._1_7_,(char)((int)sVar3 << 1));
      if (sVar3 != 0) goto LAB_00856a6c;
    }
    else {
      uVar1 = 0x1a;
      if ((sVar3 | 7) != 0x17) {
        uVar1 = (sVar3 | 7) + 1;
      }
                    /* try { // try from 00856a54 to 00856a5b has its CatchHandler @ 008578a0 */
      pvVar5 = operator_new(uVar1);
      local_178 = uVar1 | 1;
      local_170 = sVar3;
      pvStack_168 = pvVar5;
LAB_00856a6c:
      memcpy(pvVar5,"__mul",sVar3);
    }
    *(undefined1 *)((long)pvVar5 + sVar3) = 0;
    sVar3 = strlen("__div");
    if (0xfffffffffffffff7 < sVar3) {
      if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_00857824;
    }
    if (sVar3 < 0x17) {
      pvVar5 = (void *)((long)&local_160 + 1);
      local_160 = CONCAT71(local_160._1_7_,(char)((int)sVar3 << 1));
      if (sVar3 != 0) goto LAB_00856af0;
    }
    else {
      uVar1 = 0x1a;
      if ((sVar3 | 7) != 0x17) {
        uVar1 = (sVar3 | 7) + 1;
      }
                    /* try { // try from 00856ad8 to 00856adf has its CatchHandler @ 008578a0 */
      pvVar5 = operator_new(uVar1);
      local_160 = uVar1 | 1;
      local_158 = sVar3;
      pvStack_150 = pvVar5;
LAB_00856af0:
      memcpy(pvVar5,"__div",sVar3);
    }
    *(undefined1 *)((long)pvVar5 + sVar3) = 0;
    sVar3 = strlen("__mod");
    if (0xfffffffffffffff7 < sVar3) {
      if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_00857824;
    }
    if (sVar3 < 0x17) {
      pvVar5 = (void *)((long)&local_148 + 1);
      local_148 = CONCAT71(local_148._1_7_,(char)((int)sVar3 << 1));
      if (sVar3 != 0) goto LAB_00856b74;
    }
    else {
      uVar1 = 0x1a;
      if ((sVar3 | 7) != 0x17) {
        uVar1 = (sVar3 | 7) + 1;
      }
                    /* try { // try from 00856b5c to 00856b63 has its CatchHandler @ 008578a0 */
      pvVar5 = operator_new(uVar1);
      local_148 = uVar1 | 1;
      local_140 = sVar3;
      pvStack_138 = pvVar5;
LAB_00856b74:
      memcpy(pvVar5,"__mod",sVar3);
    }
    *(undefined1 *)((long)pvVar5 + sVar3) = 0;
    sVar3 = strlen("__pow");
    if (0xfffffffffffffff7 < sVar3) {
      if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_00857824;
    }
    if (sVar3 < 0x17) {
      pvVar5 = (void *)((long)&local_130 + 1);
      local_130 = CONCAT71(local_130._1_7_,(char)((int)sVar3 << 1));
      if (sVar3 != 0) goto LAB_00856bf8;
    }
    else {
      uVar1 = 0x1a;
      if ((sVar3 | 7) != 0x17) {
        uVar1 = (sVar3 | 7) + 1;
      }
                    /* try { // try from 00856be0 to 00856be7 has its CatchHandler @ 008578a0 */
      pvVar5 = operator_new(uVar1);
      local_130 = uVar1 | 1;
      local_128 = sVar3;
      pvStack_120 = pvVar5;
LAB_00856bf8:
      memcpy(pvVar5,"__pow",sVar3);
    }
    *(undefined1 *)((long)pvVar5 + sVar3) = 0;
    sVar3 = strlen("__tostring");
    if (0xfffffffffffffff7 < sVar3) {
      if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_00857824;
    }
    if (sVar3 < 0x17) {
      pvVar5 = (void *)((long)&local_118 + 1);
      local_118 = CONCAT71(local_118._1_7_,(char)((int)sVar3 << 1));
      if (sVar3 != 0) goto LAB_00856c7c;
    }
    else {
      uVar1 = 0x1a;
      if ((sVar3 | 7) != 0x17) {
        uVar1 = (sVar3 | 7) + 1;
      }
                    /* try { // try from 00856c60 to 00856c6b has its CatchHandler @ 008578a0 */
      pvVar5 = operator_new(uVar1);
      local_118 = uVar1 | 1;
      local_110 = sVar3;
      pvStack_108 = pvVar5;
LAB_00856c7c:
      memcpy(pvVar5,"__tostring",sVar3);
    }
    *(undefined1 *)((long)pvVar5 + sVar3) = 0;
    sVar3 = strlen("__eq");
    if (0xfffffffffffffff7 < sVar3) {
      if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_00857824;
    }
    if (sVar3 < 0x17) {
      pvVar5 = (void *)((long)&local_100 + 1);
      local_100 = CONCAT71(local_100._1_7_,(char)((int)sVar3 << 1));
      if (sVar3 != 0) goto LAB_00856d00;
    }
    else {
      uVar1 = 0x1a;
      if ((sVar3 | 7) != 0x17) {
        uVar1 = (sVar3 | 7) + 1;
      }
                    /* try { // try from 00856ce4 to 00856cef has its CatchHandler @ 008578a0 */
      pvVar5 = operator_new(uVar1);
      local_100 = uVar1 | 1;
      local_f8 = sVar3;
      pvStack_f0 = pvVar5;
LAB_00856d00:
      memcpy(pvVar5,&DAT_002ace0d,sVar3);
    }
    *(undefined1 *)((long)pvVar5 + sVar3) = 0;
    sVar3 = strlen("__lt");
    if (0xfffffffffffffff7 < sVar3) {
      if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_00857824;
    }
    if (sVar3 < 0x17) {
      pvVar5 = (void *)((long)&local_e8 + 1);
      local_e8 = CONCAT71(local_e8._1_7_,(char)((int)sVar3 << 1));
      if (sVar3 != 0) goto LAB_00856d84;
    }
    else {
      uVar1 = 0x1a;
      if ((sVar3 | 7) != 0x17) {
        uVar1 = (sVar3 | 7) + 1;
      }
                    /* try { // try from 00856d68 to 00856d73 has its CatchHandler @ 008578a0 */
      pvVar5 = operator_new(uVar1);
      local_e8 = uVar1 | 1;
      local_e0 = sVar3;
      pvStack_d8 = pvVar5;
LAB_00856d84:
      memcpy(pvVar5,&DAT_002bcc35,sVar3);
    }
    *(undefined1 *)((long)pvVar5 + sVar3) = 0;
    sVar3 = strlen("__le");
    if (0xfffffffffffffff7 < sVar3) {
      if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_00857824;
    }
    if (sVar3 < 0x17) {
      pvVar5 = (void *)((long)&local_d0 + 1);
      local_d0 = CONCAT71(local_d0._1_7_,(char)((int)sVar3 << 1));
      if (sVar3 != 0) goto LAB_00856e08;
    }
    else {
      uVar1 = 0x1a;
      if ((sVar3 | 7) != 0x17) {
        uVar1 = (sVar3 | 7) + 1;
      }
                    /* try { // try from 00856dec to 00856df7 has its CatchHandler @ 008578a0 */
      pvVar5 = operator_new(uVar1);
      local_d0 = uVar1 | 1;
      local_c8 = sVar3;
      pvStack_c0 = pvVar5;
LAB_00856e08:
      memcpy(pvVar5,&DAT_002a1519,sVar3);
    }
    *(undefined1 *)((long)pvVar5 + sVar3) = 0;
    sVar3 = strlen("__iter");
    if (0xfffffffffffffff7 < sVar3) {
      if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_00857824;
    }
    if (sVar3 < 0x17) {
      pvVar5 = (void *)((long)&local_b8 + 1);
      local_b8 = CONCAT71(local_b8._1_7_,(char)((int)sVar3 << 1));
      if (sVar3 != 0) goto LAB_00856e8c;
    }
    else {
      uVar1 = 0x1a;
      if ((sVar3 | 7) != 0x17) {
        uVar1 = (sVar3 | 7) + 1;
      }
                    /* try { // try from 00856e70 to 00856e7b has its CatchHandler @ 008578a0 */
      pvVar5 = operator_new(uVar1);
      local_b8 = uVar1 | 1;
      local_b0 = sVar3;
      pvStack_a8 = pvVar5;
LAB_00856e8c:
      memcpy(pvVar5,"__iter",sVar3);
    }
    *(undefined1 *)((long)pvVar5 + sVar3) = 0;
    sVar3 = strlen("__len");
    if (0xfffffffffffffff7 < sVar3) {
      if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_00857824;
    }
    if (sVar3 < 0x17) {
      pvVar5 = (void *)((long)&local_a0 + 1);
      local_a0 = CONCAT71(local_a0._1_7_,(char)((int)sVar3 << 1));
      if (sVar3 != 0) goto LAB_00856f10;
    }
    else {
      uVar1 = 0x1a;
      if ((sVar3 | 7) != 0x17) {
        uVar1 = (sVar3 | 7) + 1;
      }
                    /* try { // try from 00856ef4 to 00856eff has its CatchHandler @ 008578a0 */
      pvVar5 = operator_new(uVar1);
      local_a0 = uVar1 | 1;
      local_98 = sVar3;
      pvStack_90 = pvVar5;
LAB_00856f10:
      memcpy(pvVar5,"__len",sVar3);
    }
    *(undefined1 *)((long)pvVar5 + sVar3) = 0;
    sVar3 = strlen("__idiv");
    if (0xfffffffffffffff7 < sVar3) {
      if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
        FUN_007fe124();
      }
      goto LAB_00857824;
    }
    if (sVar3 < 0x17) {
      pvVar5 = (void *)((long)&local_88 + 1);
      local_88 = CONCAT71(local_88._1_7_,(char)((int)sVar3 << 1));
      if (sVar3 != 0) goto LAB_00856f90;
    }
    else {
      uVar1 = 0x1a;
      if ((sVar3 | 7) != 0x17) {
        uVar1 = (sVar3 | 7) + 1;
      }
                    /* try { // try from 00856f78 to 00856f7f has its CatchHandler @ 008578a0 */
      pvVar5 = operator_new(uVar1);
      local_88 = uVar1 | 1;
      local_80 = sVar3;
      local_78 = pvVar5;
LAB_00856f90:
      memcpy(pvVar5,"__idiv",sVar3);
    }
    *(undefined1 *)((long)pvVar5 + sVar3) = 0;
    DAT_00d1ee90 = 0x3f800000;
    uRam0000000000d1ee78 = 0;
    _DAT_00d1ee70 = 0;
    uRam0000000000d1ee88 = 0;
    _DAT_00d1ee80 = 0;
                    /* try { // try from 00856fc0 to 0085710b has its CatchHandler @ 00857860 */
    FUN_00870f58(&DAT_00d1ee70,&local_208,&local_208);
    FUN_00870f58(&DAT_00d1ee70,local_220[1],local_220[1]);
    FUN_00870f58(&DAT_00d1ee70,local_220[0],local_220[0]);
    FUN_00870f58(&DAT_00d1ee70,&local_1c0,&local_1c0);
    FUN_00870f58(&DAT_00d1ee70,&local_1a8,&local_1a8);
    FUN_00870f58(&DAT_00d1ee70,&local_190,&local_190);
    FUN_00870f58(&DAT_00d1ee70,&local_178,&local_178);
    FUN_00870f58(&DAT_00d1ee70,&local_160,&local_160);
    FUN_00870f58(&DAT_00d1ee70,&local_148,&local_148);
    FUN_00870f58(&DAT_00d1ee70,&local_130,&local_130);
    FUN_00870f58(&DAT_00d1ee70,&local_118,&local_118);
    FUN_00870f58(&DAT_00d1ee70,&local_100,&local_100);
    FUN_00870f58(&DAT_00d1ee70,&local_e8,&local_e8);
    FUN_00870f58(&DAT_00d1ee70,&local_d0,&local_d0);
    FUN_00870f58(&DAT_00d1ee70,&local_b8,&local_b8);
    FUN_00870f58(&DAT_00d1ee70,&local_a0,&local_a0);
    FUN_00870f58(&DAT_00d1ee70,&local_88,&local_88);
    lVar4 = 0x198;
    do {
      if ((*(byte *)((long)local_220 + lVar4) & 1) != 0) {
        operator_delete(*(void **)((long)local_220 + lVar4 + 0x10),
                        *(ulong *)((long)local_220 + lVar4) & 0xfffffffffffffffe);
      }
      lVar4 = lVar4 + -0x18;
    } while (lVar4 != 0);
    __cxa_atexit(FUN_008645cc,&DAT_00d1ee70,&PTR_LOOP_00c48880);
    sVar3 = strlen("__index");
    if (sVar3 < 0xfffffffffffffff8) {
      if (sVar3 < 0x17) {
        pvVar5 = (void *)((ulong)&local_208 | 1);
        local_208 = CONCAT71(local_208._1_7_,(char)((int)sVar3 << 1));
        if (sVar3 != 0) goto LAB_008571bc;
      }
      else {
        uVar1 = 0x1a;
        if ((sVar3 | 7) != 0x17) {
          uVar1 = (sVar3 | 7) + 1;
        }
        pvVar5 = operator_new(uVar1);
        local_208 = uVar1 | 1;
        local_200 = sVar3;
        local_1f8 = pvVar5;
LAB_008571bc:
        memcpy(pvVar5,"__index",sVar3);
      }
      *(undefined1 *)((long)pvVar5 + sVar3) = 0;
      sVar3 = strlen("__newindex");
      if (0xfffffffffffffff7 < sVar3) {
        if (*(long *)(local_210 + 0x28) == local_70) {
                    /* try { // try from 00857704 to 0085775b has its CatchHandler @ 00857828 */
                    /* WARNING: Subroutine does not return */
          FUN_007fe124();
        }
        goto LAB_00857824;
      }
      if (sVar3 < 0x17) {
        pvVar5 = (void *)((long)&local_1f0 + 1);
        local_1f0 = CONCAT71(local_1f0._1_7_,(char)((int)sVar3 << 1));
        if (sVar3 != 0) goto LAB_00857240;
      }
      else {
        uVar1 = 0x1a;
        if ((sVar3 | 7) != 0x17) {
          uVar1 = (sVar3 | 7) + 1;
        }
                    /* try { // try from 00857224 to 0085722f has its CatchHandler @ 00857828 */
        pvVar5 = operator_new(uVar1);
        local_1f0 = uVar1 | 1;
        local_1e8 = sVar3;
        local_1e0 = pvVar5;
LAB_00857240:
        memcpy(pvVar5,"__newindex",sVar3);
      }
      *(undefined1 *)((long)pvVar5 + sVar3) = 0;
      sVar3 = strlen("__mode");
      if (0xfffffffffffffff7 < sVar3) {
        if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
          FUN_007fe124();
        }
        goto LAB_00857824;
      }
      if (sVar3 < 0x17) {
        pvVar5 = (void *)((long)&local_1d8 + 1);
        local_1d8 = CONCAT71(local_1d8._1_7_,(char)((int)sVar3 << 1));
        if (sVar3 != 0) goto LAB_008572c4;
      }
      else {
        uVar1 = 0x1a;
        if ((sVar3 | 7) != 0x17) {
          uVar1 = (sVar3 | 7) + 1;
        }
                    /* try { // try from 008572a8 to 008572b3 has its CatchHandler @ 00857828 */
        pvVar5 = operator_new(uVar1);
        local_1d8 = uVar1 | 1;
        local_1d0 = sVar3;
        local_1c8 = pvVar5;
LAB_008572c4:
        memcpy(pvVar5,"__mode",sVar3);
      }
      *(undefined1 *)((long)pvVar5 + sVar3) = 0;
      sVar3 = strlen("__metatable");
      if (0xfffffffffffffff7 < sVar3) {
        if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
          FUN_007fe124();
        }
        goto LAB_00857824;
      }
      if (sVar3 < 0x17) {
        pvVar5 = (void *)((long)&local_1c0 + 1);
        local_1c0 = CONCAT71(local_1c0._1_7_,(char)((int)sVar3 << 1));
        if (sVar3 != 0) goto LAB_00857348;
      }
      else {
        uVar1 = 0x1a;
        if ((sVar3 | 7) != 0x17) {
          uVar1 = (sVar3 | 7) + 1;
        }
                    /* try { // try from 0085732c to 00857337 has its CatchHandler @ 00857828 */
        pvVar5 = operator_new(uVar1);
        local_1c0 = uVar1 | 1;
        local_1b8 = sVar3;
        local_1b0 = pvVar5;
LAB_00857348:
        memcpy(pvVar5,"__metatable",sVar3);
      }
      *(undefined1 *)((long)pvVar5 + sVar3) = 0;
      sVar3 = strlen("__type");
      if (0xfffffffffffffff7 < sVar3) {
        if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
          FUN_007fe124();
        }
        goto LAB_00857824;
      }
      if (sVar3 < 0x17) {
        pvVar5 = (void *)((long)&local_1a8 + 1);
        local_1a8 = CONCAT71(local_1a8._1_7_,(char)((int)sVar3 << 1));
        if (sVar3 != 0) goto LAB_008573c8;
      }
      else {
        uVar1 = 0x1a;
        if ((sVar3 | 7) != 0x17) {
          uVar1 = (sVar3 | 7) + 1;
        }
                    /* try { // try from 008573b0 to 008573b7 has its CatchHandler @ 00857828 */
        pvVar5 = operator_new(uVar1);
        local_1a8 = uVar1 | 1;
        local_1a0 = sVar3;
        local_198 = pvVar5;
LAB_008573c8:
        memcpy(pvVar5,"__type",sVar3);
      }
      *(undefined1 *)((long)pvVar5 + sVar3) = 0;
      DAT_00d1eeb8 = 0x3f800000;
      uRam0000000000d1eea0 = 0;
      _DAT_00d1ee98 = 0;
      uRam0000000000d1eeb0 = 0;
      _DAT_00d1eea8 = 0;
                    /* try { // try from 008573f8 to 00857453 has its CatchHandler @ 0085775c */
      FUN_00870f58(&DAT_00d1ee98,&local_208,&local_208);
      FUN_00870f58(&DAT_00d1ee98,&local_1f0,&local_1f0);
      FUN_00870f58(&DAT_00d1ee98,&local_1d8,&local_1d8);
      FUN_00870f58(&DAT_00d1ee98,&local_1c0,&local_1c0);
      FUN_00870f58(&DAT_00d1ee98,&local_1a8,&local_1a8);
      if ((local_1a8 & 1) != 0) {
        operator_delete(local_198,local_1a8 & 0xfffffffffffffffe);
      }
      if ((local_1c0 & 1) != 0) {
        operator_delete(local_1b0,local_1c0 & 0xfffffffffffffffe);
      }
      if ((local_1d8 & 1) != 0) {
        operator_delete(local_1c8,local_1d8 & 0xfffffffffffffffe);
      }
      if ((local_1f0 & 1) != 0) {
        operator_delete(local_1e0,local_1f0 & 0xfffffffffffffffe);
      }
      if ((local_208 & 1) != 0) {
        operator_delete(local_1f8,local_208 & 0xfffffffffffffffe);
      }
      __cxa_atexit(FUN_008645cc,&DAT_00d1ee98,&PTR_LOOP_00c48880);
      if (*(long *)(local_210 + 0x28) == local_70) {
        return;
      }
      goto LAB_00857824;
    }
  }
  if (*(long *)(local_210 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
LAB_00857824:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

