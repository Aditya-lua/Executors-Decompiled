/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0f940
 */

void * __cxa_demangle(byte *param_1,void *param_2,ulong *param_3,undefined4 *param_4)

{
  byte *pbVar1;
  void *pvVar2;
  long *plVar3;
  bool bVar4;
  size_t sVar5;
  long *plVar6;
  long *plVar7;
  undefined4 uVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  byte bVar12;
  byte *pbVar13;
  void *local_13d8;
  ulong local_13d0;
  size_t local_13c8;
  undefined8 local_13c0;
  undefined4 local_13b8;
  byte *local_13b0;
  byte *local_13a8;
  undefined8 *local_13a0;
  undefined8 *puStack_1398;
  undefined8 **local_1390;
  undefined8 local_1388;
  undefined8 uStack_1380;
  undefined8 local_1378;
  undefined8 uStack_1370;
  undefined8 local_1368;
  undefined8 uStack_1360;
  undefined8 local_1358;
  undefined8 uStack_1350;
  undefined8 local_1348;
  undefined8 uStack_1340;
  undefined8 local_1338;
  undefined8 uStack_1330;
  undefined8 local_1328;
  undefined8 uStack_1320;
  undefined8 local_1318;
  undefined8 uStack_1310;
  undefined8 local_1308;
  undefined8 uStack_1300;
  undefined8 local_12f8;
  undefined8 uStack_12f0;
  undefined8 local_12e8;
  undefined8 uStack_12e0;
  undefined8 local_12d8;
  undefined8 uStack_12d0;
  undefined8 local_12c8;
  undefined8 uStack_12c0;
  undefined8 local_12b8;
  undefined8 uStack_12b0;
  undefined8 local_12a8;
  undefined8 uStack_12a0;
  undefined8 uStack_1298;
  undefined8 uStack_1290;
  undefined8 *local_1288;
  undefined8 *puStack_1280;
  undefined8 **local_1278;
  undefined8 local_1270;
  undefined8 uStack_1268;
  undefined8 uStack_1260;
  undefined8 uStack_1258;
  undefined8 local_1250;
  undefined8 uStack_1248;
  undefined8 uStack_1240;
  undefined8 uStack_1238;
  undefined8 local_1230;
  undefined8 uStack_1228;
  undefined8 uStack_1220;
  undefined8 uStack_1218;
  undefined8 local_1210;
  undefined8 uStack_1208;
  undefined8 uStack_1200;
  undefined8 uStack_11f8;
  undefined8 local_11f0;
  undefined8 uStack_11e8;
  undefined8 uStack_11e0;
  undefined8 uStack_11d8;
  undefined8 local_11d0;
  undefined8 uStack_11c8;
  undefined8 uStack_11c0;
  undefined8 uStack_11b8;
  undefined8 local_11b0;
  undefined8 uStack_11a8;
  undefined8 uStack_11a0;
  undefined8 uStack_1198;
  undefined8 local_1190;
  undefined8 uStack_1188;
  undefined8 uStack_1180;
  undefined8 uStack_1178;
  undefined8 *local_1170;
  undefined8 *local_1168;
  undefined8 **local_1160;
  undefined8 local_1158;
  undefined8 uStack_1150;
  undefined8 uStack_1148;
  undefined8 uStack_1140;
  undefined8 local_1138;
  undefined8 uStack_1130;
  undefined8 uStack_1128;
  undefined8 uStack_1120;
  undefined8 *local_1118;
  undefined8 *local_1110;
  undefined8 **local_1108;
  undefined8 local_1100;
  undefined8 uStack_10f8;
  undefined8 uStack_10f0;
  undefined8 uStack_10e8;
  undefined8 *local_10e0;
  undefined8 *local_10d8;
  undefined2 *local_10d0;
  undefined8 local_10c8;
  undefined8 uStack_10c0;
  undefined8 uStack_10b8;
  undefined8 uStack_10b0;
  undefined2 local_10a8;
  undefined1 local_10a6;
  undefined8 local_10a0;
  undefined8 local_1098;
  undefined4 local_1090;
  long local_1080;
  undefined8 uStack_1078;
  long *local_80;
  
  if ((param_1 == (byte *)0x0) || ((param_2 != (void *)0x0 && (param_3 == (ulong *)0x0)))) {
    if (param_4 == (undefined4 *)0x0) {
      return (void *)0x0;
    }
    *param_4 = 0xfffffffd;
    return (void *)0x0;
  }
  sVar5 = strlen((char *)param_1);
  local_13a8 = param_1 + sVar5;
  local_1390 = &local_1288;
  local_1278 = &local_1170;
  local_1160 = &local_1118;
  local_1108 = &local_10e0;
  local_10d0 = &local_10a8;
  local_10a8 = 1;
  uStack_12a0 = 0;
  local_12a8 = 0;
  uStack_1290 = 0;
  uStack_1298 = 0;
  uStack_1380 = 0;
  local_1388 = 0;
  uStack_1370 = 0;
  local_1378 = 0;
  uStack_1360 = 0;
  local_1368 = 0;
  uStack_1350 = 0;
  local_1358 = 0;
  uStack_1340 = 0;
  local_1348 = 0;
  uStack_1330 = 0;
  local_1338 = 0;
  uStack_1320 = 0;
  local_1328 = 0;
  uStack_1310 = 0;
  local_1318 = 0;
  uStack_1300 = 0;
  local_1308 = 0;
  uStack_12f0 = 0;
  local_12f8 = 0;
  uStack_12e0 = 0;
  local_12e8 = 0;
  uStack_12d0 = 0;
  local_12d8 = 0;
  uStack_12c0 = 0;
  local_12c8 = 0;
  uStack_12b0 = 0;
  local_12b8 = 0;
  uStack_1268 = 0;
  local_1270 = 0;
  uStack_1258 = 0;
  uStack_1260 = 0;
  uStack_1248 = 0;
  local_1250 = 0;
  uStack_1238 = 0;
  uStack_1240 = 0;
  uStack_1228 = 0;
  local_1230 = 0;
  uStack_1218 = 0;
  uStack_1220 = 0;
  uStack_1208 = 0;
  local_1210 = 0;
  uStack_11f8 = 0;
  uStack_1200 = 0;
  uStack_11e8 = 0;
  local_11f0 = 0;
  uStack_11d8 = 0;
  uStack_11e0 = 0;
  uStack_11c8 = 0;
  local_11d0 = 0;
  uStack_11b8 = 0;
  uStack_11c0 = 0;
  uStack_11a8 = 0;
  local_11b0 = 0;
  uStack_1198 = 0;
  uStack_11a0 = 0;
  uStack_1188 = 0;
  local_1190 = 0;
  uStack_1178 = 0;
  uStack_1180 = 0;
  uStack_1150 = 0;
  local_1158 = 0;
  uStack_1140 = 0;
  uStack_1148 = 0;
  uStack_1130 = 0;
  local_1138 = 0;
  uStack_1120 = 0;
  uStack_1128 = 0;
  uStack_10f8 = 0;
  local_1100 = 0;
  uStack_10e8 = 0;
  uStack_10f0 = 0;
  uStack_10c0 = 0;
  local_10c8 = 0;
  uStack_10b0 = 0;
  uStack_10b8 = 0;
  local_10a6 = 0;
  local_10a0 = 0xffffffffffffffff;
  local_1090 = 0;
  local_1098 = 0;
  uStack_1078 = 0;
  local_1080 = 0;
  local_13a0 = &local_1388;
  puStack_1398 = &local_1388;
  local_1288 = &local_1270;
  puStack_1280 = &local_1270;
  local_1170 = &local_1158;
  local_1168 = &local_1158;
  local_1118 = &local_1100;
  local_1110 = &local_1100;
  local_10e0 = &local_10c8;
  local_10d8 = &local_10c8;
  local_80 = &local_1080;
  if (sVar5 < 2) {
LAB_00c0fb24:
                    /* try { // try from 00c0fb24 to 00c0fcdb has its CatchHandler @ 00c0fef4 */
    local_13b0 = param_1;
    plVar6 = (long *)FUN_00c10bfc(&local_13b0);
    if (local_13a8 == local_13b0) {
LAB_00c0fdf0:
      if (plVar6 != (long *)0x0) goto LAB_00c0fdf4;
    }
LAB_00c0fb38:
    uVar8 = 0xfffffffe;
    pvVar2 = (void *)0x0;
    uVar11 = local_13d0;
  }
  else {
    if (*(short *)param_1 != 0x5a5f) {
      if (sVar5 == 2) goto LAB_00c0fb24;
      if (*(short *)param_1 == 0x5f5f && param_1[2] == 0x5a) {
        lVar10 = 3;
        goto LAB_00c0fc08;
      }
      if (sVar5 < 4) goto LAB_00c0fb24;
      if (*(int *)param_1 == 0x5a5f5f5f) {
        lVar10 = 4;
      }
      else {
        if ((sVar5 == 4) || (*(int *)param_1 != 0x5f5f5f5f || param_1[4] != 0x5a))
        goto LAB_00c0fb24;
        lVar10 = 5;
      }
      local_13b0 = param_1 + lVar10;
      local_13d8 = (void *)FUN_00c10038(&local_13b0);
      plVar6 = (long *)0x0;
      if (local_13d8 != (void *)0x0) {
        if ((0xc < (ulong)((long)local_13a8 - (long)local_13b0)) &&
           (*(long *)local_13b0 == 0x695f6b636f6c625f &&
            *(long *)(local_13b0 + 5) == 0x656b6f766e695f6b)) {
          pbVar1 = local_13b0 + 0xd;
          if ((pbVar1 == local_13a8) || (*pbVar1 != 0x5f)) {
            bVar12 = 0;
            local_13b0 = pbVar1;
          }
          else {
            bVar12 = 1;
            local_13b0 = local_13b0 + 0xe;
          }
          pbVar1 = local_13b0;
          if ((local_13a8 == local_13b0) || (*local_13b0 - 0x3a < 0xfffffff6)) {
            bVar4 = true;
          }
          else {
            do {
              if (*local_13b0 - 0x3a < 0xfffffff6) {
                pbVar13 = local_13b0;
                goto LAB_00c0fda8;
              }
              local_13b0 = local_13b0 + 1;
            } while (local_13b0 != local_13a8);
            pbVar13 = local_13a8;
LAB_00c0fda8:
            bVar4 = pbVar13 == pbVar1;
          }
          if (!(bool)(bVar12 & bVar4)) {
            if (local_13a8 != local_13b0) {
              if (*local_13b0 != 0x2e) goto LAB_00c0fdec;
              local_13b0 = local_13a8;
            }
            plVar6 = (long *)FUN_00c10b48(&local_13b0,"invocation function for block in ",
                                          &local_13d8);
            goto LAB_00c0fdf0;
          }
        }
LAB_00c0fdec:
        plVar6 = (long *)0x0;
      }
      goto LAB_00c0fdf0;
    }
    lVar10 = 2;
LAB_00c0fc08:
    local_13b0 = param_1 + lVar10;
    plVar7 = (long *)FUN_00c10038(&local_13b0);
    plVar3 = local_80;
    pbVar1 = local_13b0;
    if (plVar7 == (long *)0x0) goto LAB_00c0fb38;
    lVar10 = (long)local_13a8 - (long)local_13b0;
    plVar6 = plVar7;
    if (lVar10 != 0) {
      if (*local_13b0 != 0x2e) goto LAB_00c0fb38;
      lVar9 = local_80[1];
      if (lVar9 - 0xfc0U < 0xfffffffffffff00f || lVar9 == -0x31) {
        plVar6 = malloc(0x1000);
        if (plVar6 == (long *)0x0) {
                    /* WARNING: Subroutine does not return */
          std::terminate();
        }
        lVar9 = 0;
        *plVar6 = (long)plVar3;
        plVar6[1] = 0;
        local_80 = plVar6;
      }
      local_80[1] = lVar9 + 0x30;
      plVar6 = (long *)((long)local_80 + lVar9 + 0x10);
      *plVar6 = (long)&PTR_LAB_00cb3890;
      *(long **)((long)local_80 + lVar9 + 0x20) = plVar7;
      *(byte **)((long)local_80 + lVar9 + 0x28) = pbVar1;
      *(undefined1 *)((long)local_80 + lVar9 + 0x18) = 1;
      *(long *)((long)local_80 + lVar9 + 0x30) = lVar10;
      *(ushort *)((long)local_80 + lVar9 + 0x19) =
           *(ushort *)((long)local_80 + lVar9 + 0x19) & 0xf000 | 0x540;
      local_13b0 = local_13a8;
    }
LAB_00c0fdf4:
    if (param_2 == (void *)0x0) {
      local_13c8 = 0;
    }
    else {
      local_13c8 = *param_3;
    }
    local_13d0 = 0;
    local_13b8 = 1;
    local_13c0 = 0xffffffffffffffff;
    local_13d8 = param_2;
    if (local_10e0 != local_10d8) {
                    /* try { // try from 00c0fec4 to 00c0fee3 has its CatchHandler @ 00c0feec */
                    /* WARNING: Subroutine does not return */
      FUN_00c0de94("%s:%d: %s","out/llvm-project/libcxxabi/src/cxa_demangle.cpp",0x18c,&DAT_002ab32c
                  );
    }
                    /* try { // try from 00c0fe34 to 00c0fe63 has its CatchHandler @ 00c0fef0 */
    (**(code **)(*plVar6 + 0x20))(plVar6,&local_13d8);
    if ((*(ushort *)((long)plVar6 + 9) & 0xc0) != 0x40) {
      (**(code **)(*plVar6 + 0x28))(plVar6,&local_13d8);
    }
    uVar11 = local_13d0 + 1;
    if (local_13c8 < uVar11) {
      local_13c8 = local_13c8 * 2;
      if (local_13c8 <= local_13d0 + 0x3e1) {
        local_13c8 = local_13d0 + 0x3e1;
      }
      local_13d8 = realloc(local_13d8,local_13c8);
      if (local_13d8 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      uVar11 = local_13d0 + 1;
    }
    *(undefined1 *)((long)local_13d8 + local_13d0) = 0;
    if (param_3 != (ulong *)0x0) {
      *param_3 = uVar11;
    }
    uVar8 = 0;
    pvVar2 = local_13d8;
  }
  local_13d0 = uVar11;
  plVar6 = local_80;
  if (param_4 != (undefined4 *)0x0) {
    *param_4 = uVar8;
  }
  while (local_80 = plVar6, local_80 != (long *)0x0) {
    while( true ) {
      plVar6 = (long *)*local_80;
      if (local_80 == &local_1080) break;
      plVar6 = local_80;
      local_80 = (long *)*local_80;
      free(plVar6);
      if (local_80 == (long *)0x0) goto LAB_00c0fb78;
    }
  }
LAB_00c0fb78:
  local_1080 = 0;
  uStack_1078 = 0;
  local_80 = &local_1080;
  if (local_10e0 != &local_10c8) {
    free(local_10e0);
  }
  if (local_1118 != &local_1100) {
    free(local_1118);
  }
  if (local_1170 != &local_1158) {
    free(local_1170);
  }
  if (local_1288 != &local_1270) {
    free(local_1288);
  }
  if (local_13a0 != &local_1388) {
    free(local_13a0);
  }
  return pvVar2;
}

