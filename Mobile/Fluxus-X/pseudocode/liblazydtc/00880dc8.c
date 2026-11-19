/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00880dc8
 */

undefined4 FUN_00880dc8(undefined8 *param_1,ulong param_2,byte *param_3)

{
  uint uVar1;
  uint uVar2;
  undefined4 uVar3;
  int iVar4;
  long lVar5;
  char cVar6;
  undefined4 uVar7;
  size_t sVar8;
  undefined4 *puVar9;
  undefined4 uVar10;
  long lVar11;
  byte bVar12;
  undefined1 uVar13;
  ulong uVar14;
  int iVar15;
  long lVar16;
  long lVar17;
  ulong uVar18;
  undefined8 *puVar19;
  undefined8 *puVar20;
  undefined8 uVar21;
  char *pcVar22;
  ulong *puVar23;
  ulong *puVar24;
  undefined8 *puVar25;
  undefined **local_d8;
  undefined8 *puStack_d0;
  ulong local_c8;
  undefined1 local_c0;
  undefined4 local_bc;
  long local_b8;
  ulong local_b0;
  undefined8 uStack_a8;
  void *local_a0;
  void *local_90;
  void *local_88;
  long local_80;
  byte local_74 [4];
  ulong local_70;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  local_70 = param_2;
  if ((((DAT_00d1ec40 == 1) && (param_1[0xcd] = param_2, param_2 != 0)) && ((DAT_00d1f0a8 & 1) != 0)
      ) && ((*(long *)(param_2 + 0x98) == 0 && param_1[0xce] == 0 &&
            (param_1[0xfa] == param_1[0xfb])))) {
    FUN_008845d4(param_1);
  }
  if ((DAT_00d1ec80 == '\x01') && (param_1[0x1a5] != 0)) {
    uVar14 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
    uVar14 = (param_2 >> 0x20 ^ uVar14 >> 0x2f ^ uVar14) * -0x622015f714c7d297;
    uVar14 = (uVar14 ^ uVar14 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 0x1a6) & 0x3f);
    if ((*(ulong *)(param_1[0x1a3] + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(param_1[0x1a0] + uVar14 * 0x20) == param_2) {
          lVar17 = param_1[0x1a0] + uVar14 * 0x20;
          FUN_008847e0(param_1 + 0xf4,param_1[0xf5],
                       *(long *)(lVar17 + 0x10) - *(long *)(lVar17 + 8) >> 3,&DAT_00d1f148);
          break;
        }
        uVar14 = uVar14 + 1 & param_1[0x1a4] - 1;
      } while ((*(ulong *)(param_1[0x1a3] + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0);
    }
  }
  lVar17 = *(long *)(param_2 + 0x50);
  iVar15 = *(int *)(param_2 + 0x60);
  uVar3 = *(undefined4 *)((long)param_1 + 0x64c);
  if (lVar17 != 0) {
    iVar15 = iVar15 + 1;
  }
                    /* try { // try from 00880f64 to 00880fbb has its CatchHandler @ 008819c8 */
  uVar7 = FUN_00873d04(*param_1,iVar15,*(undefined1 *)(param_2 + 0x70));
  if (0 < *(int *)((long)param_1 + 0xc)) {
    FUN_00876644(*param_1,*(int *)(local_70 + 0xc) + 1);
  }
  if (*(char *)(local_70 + 0x70) == '\x01') {
    FUN_00875b54(*param_1,0x41,*(int *)(local_70 + 0x60) + (uint)(lVar17 != 0),0,0);
  }
  lVar16 = *(long *)(local_70 + 0x60);
  iVar4 = *(int *)((long)param_1 + 0x64c);
  iVar15 = (int)lVar16;
  if (lVar17 != 0) {
    iVar15 = iVar15 + 1;
  }
  uVar1 = iVar15 + iVar4;
  if (0xff < uVar1) {
    if (*(long *)(lVar5 + 0x28) == local_68) {
                    /* try { // try from 0088194c to 0088195f has its CatchHandler @ 008819c0 */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(local_70 + 0xc,
                   "Out of registers when trying to allocate %d registers: exceeded limit %d",iVar15
                   ,0xff);
    }
    goto LAB_00881a0c;
  }
  lVar11 = *(long *)(local_70 + 0x50);
  *(uint *)((long)param_1 + 0x64c) = uVar1;
  uVar2 = *(uint *)(param_1 + 0xca);
  if (*(uint *)(param_1 + 0xca) <= uVar1) {
    uVar2 = uVar1;
  }
  *(uint *)(param_1 + 0xca) = uVar2;
  if (lVar11 != 0) {
                    /* try { // try from 00880ffc to 0088100b has its CatchHandler @ 008819c0 */
    FUN_00884b7c(param_1,lVar11,iVar4,0xffffffff);
    lVar16 = *(long *)(local_70 + 0x60);
  }
  if (lVar16 != 0) {
    uVar14 = 0;
    do {
                    /* try { // try from 00881028 to 00881037 has its CatchHandler @ 008819e0 */
      FUN_00884b7c(param_1,*(undefined8 *)(*(long *)(local_70 + 0x58) + uVar14 * 8),
                   iVar4 + (uint)(lVar17 != 0) + (int)uVar14,0xffffffff);
      uVar14 = uVar14 + 1;
    } while (uVar14 < *(ulong *)(local_70 + 0x60));
  }
  puVar20 = *(undefined8 **)(local_70 + 0x90);
  param_1[0xcd] = local_70;
  lVar17 = puVar20[5];
  param_1[0xcb] = (long)(param_1[0xd1] - param_1[0xd0]) >> 3;
  if (lVar17 == 0) {
    if (DAT_00d1ec40 == 1) {
      uVar14 = 0;
      goto LAB_008810f0;
    }
LAB_008811bc:
    if (0 < *(int *)((long)param_1 + 0xc)) {
      FUN_00876644(*param_1,*(int *)((long)puVar20 + 0x14) + 1);
    }
LAB_008811d8:
    FUN_008860c8(param_1,0);
    FUN_00875b54(*param_1,0x16,0,1,0);
  }
  else {
    uVar18 = 0;
    do {
      uVar21 = *(undefined8 *)(puVar20[4] + uVar18 * 8);
      if (DAT_00d1f0e8 == '\x01') {
                    /* try { // try from 00881090 to 008810bb has its CatchHandler @ 008819e4 */
        FUN_00884cbc(param_1,puVar20,uVar21,0);
      }
      FUN_0088506c(param_1,uVar21);
      uVar14 = FUN_0089acdc(param_1 + 0x29,uVar21);
    } while (((uVar14 & 1) == 0) && (uVar18 = uVar18 + 1, uVar18 < (ulong)puVar20[5]));
    if ((DAT_00d1ec40 & 1) == 0) {
      if ((uVar14 & 1) == 0) goto LAB_008811bc;
    }
    else {
LAB_008810f0:
      if (0 < *(int *)((long)param_1 + 0xc)) {
                    /* try { // try from 00881104 to 00881273 has its CatchHandler @ 008819d0 */
        uVar14 = uVar14 & 0xffffffff;
        FUN_00876644(*param_1,*(int *)((long)puVar20 + 0x14) + 1);
      }
      if (((((((*(byte *)((long)param_1 + 0xcfc) & 1) == 0) && (param_1[0x193] == 0)) &&
            (param_1[0x19a] == 0)) && (param_1[0x19c] == param_1[0x19d])) ||
          (((param_1[0xcd] == 0 || (*(long *)(param_1[0xcd] + 0x98) != 0 || param_1[0xce] != 0)) ||
           (param_1[0xfa] != param_1[0xfb])))) &&
         (((DAT_00d1f0c8 != '\x01' || (*(char *)((long)param_1 + 0xcfd) != '\x01')) ||
          (((*(byte *)((long)param_1 + 0xcfe) & 1) != 0 ||
           (((param_1[0xcd] == 0 || (*(long *)(param_1[0xcd] + 0x98) != 0 || param_1[0xce] != 0)) ||
            (param_1[0xfa] != param_1[0xfb])))))))) {
        if ((uVar14 & 1) == 0) goto LAB_008811d8;
      }
      else {
                    /* try { // try from 008817e0 to 008817e7 has its CatchHandler @ 008819d0 */
        FUN_008859f0(param_1);
      }
    }
  }
  if ((((DAT_00d1f048 & 1) == 0) && (0 < *(int *)(param_1 + 1))) &&
     (1 < *(int *)((long)param_1 + 0xc))) {
    FUN_008861e0(param_1);
  }
  FUN_00876628(*param_1,*(int *)(local_70 + 0xc) + 1);
  iVar15 = *(int *)((long)param_1 + 0xc);
  if (0 < iVar15) {
    pcVar22 = *(char **)(local_70 + 0xa0);
    if (pcVar22 != (char *)0x0) {
      uVar21 = *param_1;
      sVar8 = strlen(pcVar22);
      FUN_00876484(uVar21,pcVar22,sVar8);
      iVar15 = *(int *)((long)param_1 + 0xc);
    }
    if (1 < iVar15) {
      puVar25 = (undefined8 *)param_1[0xf4];
      puVar19 = (undefined8 *)param_1[0xf5];
      if (puVar25 != puVar19) {
        if (DAT_00d1ec80 == '\x01') {
          if (param_1[0x1a5] != 0) {
            uVar14 = ((ulong)(uint)((int)local_70 << 3) + 8 ^ local_70 >> 0x20) *
                     -0x622015f714c7d297;
            uVar14 = (local_70 >> 0x20 ^ uVar14 >> 0x2f ^ uVar14) * -0x622015f714c7d297;
            uVar14 = (uVar14 ^ uVar14 >> 0x2f) * -0x6b622cb0470b6a63 >>
                     ((ulong)*(byte *)(param_1 + 0x1a6) & 0x3f);
            if ((*(ulong *)(param_1[0x1a3] + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0) {
              do {
                if (*(ulong *)(param_1[0x1a0] + uVar14 * 0x20) == local_70) {
                  lVar17 = param_1[0x1a0] + uVar14 * 0x20;
                  goto LAB_00881334;
                }
                uVar14 = uVar14 + 1 & param_1[0x1a4] - 1;
              } while ((*(ulong *)(param_1[0x1a3] + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0)
              ;
            }
          }
          lVar17 = 0;
LAB_00881334:
          uVar14 = 0;
          do {
            uVar21 = *param_1;
            if ((undefined8 *)puVar25[uVar14] == DAT_00d1f148) {
                    /* try { // try from 00881360 to 0088137f has its CatchHandler @ 008819d4 */
              pcVar22 = (char *)FUN_008507d0(*(undefined8 *)(*(long *)(lVar17 + 8) + uVar14 * 8));
            }
            else {
              pcVar22 = *(char **)puVar25[uVar14];
            }
            sVar8 = strlen(pcVar22);
            FUN_00876818(uVar21,pcVar22,sVar8);
            puVar25 = (undefined8 *)param_1[0xf4];
            uVar14 = uVar14 + 1;
          } while (uVar14 < (ulong)(param_1[0xf5] - (long)puVar25 >> 3));
        }
        else {
          do {
            uVar21 = *param_1;
            pcVar22 = *(char **)*puVar25;
            sVar8 = strlen(pcVar22);
                    /* try { // try from 008813b4 to 008813bf has its CatchHandler @ 008819cc */
            FUN_00876818(uVar21,pcVar22,sVar8);
            puVar25 = puVar25 + 1;
          } while (puVar25 != puVar19);
        }
      }
    }
  }
  if (0 < *(int *)(param_1 + 2)) {
    puVar24 = (ulong *)param_1[0xf5];
    for (puVar23 = (ulong *)param_1[0xf4]; puVar23 != puVar24; puVar23 = puVar23 + 1) {
      if (param_1[0x5f] != 0) {
        uVar14 = *puVar23;
        uVar18 = ((ulong)(uint)((int)uVar14 << 3) + 8 ^ uVar14 >> 0x20) * -0x622015f714c7d297;
        uVar18 = (uVar14 >> 0x20 ^ uVar18 >> 0x2f ^ uVar18) * -0x622015f714c7d297;
        uVar18 = (uVar18 ^ uVar18 >> 0x2f) * -0x6b622cb0470b6a63 >>
                 ((ulong)*(byte *)(param_1 + 0x60) & 0x3f);
        if ((*(ulong *)(param_1[0x5d] + (uVar18 >> 6) * 8) >> (uVar18 & 0x3f) & 1) != 0) {
          do {
            if (*(ulong *)(param_1[0x5a] + uVar18 * 0x10) == uVar14) {
              uVar10 = *(undefined4 *)(param_1[0x5a] + uVar18 * 0x10 + 8);
              goto LAB_00881480;
            }
            uVar18 = uVar18 + 1 & param_1[0x5e] - 1;
          } while ((*(ulong *)(param_1[0x5d] + (uVar18 >> 6) * 8) >> (uVar18 & 0x3f) & 1) != 0);
        }
      }
      uVar10 = 0xf;
LAB_00881480:
                    /* try { // try from 00881484 to 00881487 has its CatchHandler @ 008819dc */
      FUN_00876228(*param_1,uVar10);
    }
  }
  if (0 < *(int *)(param_1 + 1)) {
                    /* try { // try from 008814b4 to 008814b7 has its CatchHandler @ 008819d0 */
    FUN_00877e3c(*param_1);
  }
  local_74[0] = 0;
                    /* try { // try from 008814c0 to 00881503 has its CatchHandler @ 008819d8 */
  FUN_00877ecc(&local_90,*param_1,local_74);
  if (local_90 != (void *)0x0) {
    local_88 = local_90;
    operator_delete(local_90,local_80 - (long)local_90);
  }
  if ((local_74[0] & 1) == 0) {
    FUN_008862e0(param_1,0);
    uVar14 = FUN_008769c0(*param_1);
    if (uVar14 < 0x3b9aca01) {
      if (param_1[0x58] != 0) {
        uVar14 = ((ulong)(uint)((int)local_70 << 3) + 8 ^ local_70 >> 0x20) * -0x622015f714c7d297;
        uVar14 = (local_70 >> 0x20 ^ uVar14 >> 0x2f ^ uVar14) * -0x622015f714c7d297;
        uVar14 = (uVar14 ^ uVar14 >> 0x2f) * -0x6b622cb0470b6a63 >>
                 ((ulong)*(byte *)(param_1 + 0x59) & 0x3f);
        if ((*(ulong *)(param_1[0x56] + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0) {
          do {
            if (*(ulong *)(param_1[0x53] + uVar14 * 0x20) == local_70) {
              lVar17 = param_1[0x53] + uVar14 * 0x20;
              uVar21 = *param_1;
              uStack_a8 = *(undefined8 *)(lVar17 + 0x10);
              local_b0 = *(ulong *)(lVar17 + 8);
              local_a0 = *(void **)(lVar17 + 0x18);
              *(undefined8 *)(lVar17 + 0x10) = 0;
              *(undefined8 *)(lVar17 + 0x18) = 0;
              *(undefined8 *)(lVar17 + 8) = 0;
                    /* try { // try from 008815bc to 008815c3 has its CatchHandler @ 0088199c */
              FUN_0087608c(uVar21,&local_b0);
              if ((local_b0 & 1) != 0) {
                operator_delete(local_a0,local_b0 & 0xfffffffffffffffe);
              }
              break;
            }
            uVar14 = uVar14 + 1 & param_1[0x57] - 1;
          } while ((*(ulong *)(param_1[0x56] + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0);
        }
      }
      if ((*(long *)(local_70 + 0x98) == 0) && ((*(byte *)(param_1 + 0xcc) & 1) == 0)) {
        *param_3 = *param_3 | 2;
      }
                    /* try { // try from 008815fc to 008815ff has its CatchHandler @ 008819d8 */
      uVar14 = FUN_0084f14c();
      if ((uVar14 & 1) != 0) {
        *param_3 = *param_3 | 4;
      }
      if ((DAT_00d1ec40 == 1) &&
         ((((((*(byte *)((long)param_1 + 0xcfc) & 1) != 0 || (param_1[0x193] != 0)) ||
            (param_1[0x19a] != 0)) || (param_1[0x19c] != param_1[0x19d])) &&
          (*(long *)(local_70 + 0x98) == 0)))) {
        *param_3 = *param_3 | 0x10;
      }
      if (((DAT_00d1f0c8 == '\x01') && (*(char *)((long)param_1 + 0xcfd) == '\x01')) &&
         (((*(byte *)((long)param_1 + 0xcfe) & 1) == 0 && (*(long *)(local_70 + 0x98) == 0)))) {
        *param_3 = *param_3 | 0x10;
        if ((*(byte *)((long)param_1 + 0x661) & 1) != 0) goto LAB_008816a8;
LAB_008816a0:
        if ((*(byte *)(param_1 + 0xcf) & 1) != 0) goto LAB_008816a8;
        bVar12 = *(byte *)((long)param_1 + 0x679) ^ 1;
      }
      else {
        if ((*(byte *)((long)param_1 + 0x661) & 1) == 0) goto LAB_008816a0;
LAB_008816a8:
        bVar12 = 0;
      }
      if (DAT_00d1f108 == '\x01') {
        bVar12 = (*(byte *)((long)param_1 + 0x662) ^ 1) & bVar12;
      }
      lVar17 = 0;
      if ((DAT_00d1eee8 == '\x01') && ((bVar12 & 1) != 0)) {
        if (param_1[0xf4] == param_1[0xf5]) {
          *param_3 = *param_3 | 8;
                    /* try { // try from 00881720 to 00881753 has its CatchHandler @ 008819bc */
          lVar17 = FUN_008a0ec8(*(undefined8 *)(local_70 + 0x90),*(undefined8 *)(local_70 + 0x58),
                                *(undefined8 *)(local_70 + 0x60),param_1 + 0x45,param_1 + 0x29);
        }
        else {
          lVar17 = 0;
        }
      }
      FUN_00873ff8(*param_1,*(undefined4 *)(param_1 + 0xca),
                   (ulong)(param_1[0xf5] - param_1[0xf4]) >> 3,*param_3,lVar17);
                    /* try { // try from 00881754 to 008817d3 has its CatchHandler @ 008819c4 */
      puVar9 = (undefined4 *)FUN_00886714(param_1 + 0xd,&local_70);
      *puVar9 = uVar7;
      if ((undefined8 *)(puVar9 + 2) != param_1 + 0xf4) {
        FUN_0086f920();
      }
      if ((((1 < *(int *)(param_1 + 1)) && ((*(byte *)(local_70 + 0x70) & 1) == 0)) &&
          (*(long *)(local_70 + 0x50) == 0)) &&
         (((*(byte *)(param_1 + 0xcf) & 1) == 0 && ((*(byte *)((long)param_1 + 0x679) & 1) == 0))))
      {
        if (((char)DAT_00d1ec60 == '\x01') && (uVar14 = FUN_0084f188(local_70,3), (uVar14 & 1) != 0)
           ) {
          uVar13 = 0;
        }
        else {
          uVar13 = 1;
        }
        uVar10 = *(undefined4 *)(param_1 + 0xca);
        *(undefined1 *)(puVar9 + 0xb) = uVar13;
        puVar9[10] = uVar10;
        if (lVar17 == 0) {
                    /* try { // try from 0088182c to 0088184f has its CatchHandler @ 008819c4 */
          lVar17 = FUN_008a0ec8(*(undefined8 *)(local_70 + 0x90),*(undefined8 *)(local_70 + 0x58),
                                *(undefined8 *)(local_70 + 0x60),param_1 + 0x45,param_1 + 0x29);
        }
        uVar21 = *(undefined8 *)(local_70 + 0x90);
        *(long *)(puVar9 + 8) = lVar17;
        uVar14 = FUN_0089acdc(param_1 + 0x29,uVar21);
        if ((uVar14 & 1) != 0) {
          local_d8 = &PTR_LAB_00c4b9a0;
          local_c8 = local_70;
          local_c0 = 1;
          local_bc = 0;
          local_b8 = 0;
                    /* try { // try from 00881880 to 0088188b has its CatchHandler @ 00881998 */
          puStack_d0 = param_1;
          (**(code **)*puVar20)(puVar20,&local_d8);
          *(long *)(puVar9 + 0xe) = local_b8;
          *(undefined1 *)((long)puVar9 + 0x2d) = local_c0;
          puVar9[0xc] = local_bc;
                    /* try { // try from 008818ac to 008818b3 has its CatchHandler @ 00881994 */
          if (((local_b8 != 0) && (lVar17 = FUN_00886830(param_1 + 0x14), lVar17 != 0)) &&
             (*(char *)(lVar17 + 2) == '\x01')) {
            *(undefined1 *)(puVar9 + 0x10) = 1;
          }
        }
      }
      cVar6 = DAT_00d1f0e8;
      *(undefined4 *)(param_1 + 0xca) = 0;
      param_1[0xf5] = param_1[0xf4];
      if (cVar6 == '\x01') {
        param_1[0x184] = param_1[0x183];
      }
      param_1[0xcb] = 0;
      *(undefined4 *)((long)param_1 + 0x65f) = 0;
      param_1[0xcd] = 0;
      *(undefined4 *)((long)param_1 + 0x64c) = uVar3;
      if (*(long *)(lVar5 + 0x28) == local_68) {
        return uVar7;
      }
      goto LAB_00881a0c;
    }
    pcVar22 = "Exceeded function instruction limit; split the function into parts to compile";
  }
  else {
    pcVar22 = "Exceeded jump distance limit; simplify the code to compile";
  }
  if (*(long *)(lVar5 + 0x28) == local_68) {
                    /* try { // try from 0088198c to 00881993 has its CatchHandler @ 008819d8 */
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8(local_70 + 0xc,pcVar22);
  }
LAB_00881a0c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

