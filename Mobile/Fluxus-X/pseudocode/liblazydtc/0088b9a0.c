/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088b9a0
 */

void FUN_0088b9a0(undefined8 *param_1,ulong param_2,undefined4 param_3,char param_4)

{
  uint uVar1;
  ulong *puVar2;
  undefined4 uVar3;
  int iVar4;
  long lVar5;
  short sVar6;
  uint uVar7;
  void *pvVar8;
  ulong uVar9;
  undefined8 uVar10;
  ulong uVar11;
  ulong *puVar12;
  ulong uVar13;
  ulong uVar14;
  long lVar15;
  ulong uVar16;
  ulong *puVar17;
  ulong *puVar18;
  ulong uVar19;
  ulong *puVar20;
  char *pcVar21;
  long lVar22;
  char *pcVar23;
  uint uVar24;
  void *pvVar25;
  uint local_70;
  char local_6c;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  if (param_1[0x12] != 0) {
    uVar11 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
    uVar11 = (param_2 >> 0x20 ^ uVar11 >> 0x2f ^ uVar11) * -0x622015f714c7d297;
    uVar11 = (uVar11 ^ uVar11 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 0x13) & 0x3f);
    if ((*(ulong *)(param_1[0x10] + (uVar11 >> 6) * 8) >> (uVar11 & 0x3f) & 1) != 0) {
      do {
        puVar17 = (ulong *)(param_1[0xd] + uVar11 * 0x50);
        if (*puVar17 == param_2) goto LAB_0088ba88;
        uVar11 = uVar11 + 1 & param_1[0x11] - 1;
      } while ((*(ulong *)(param_1[0x10] + (uVar11 >> 6) * 8) >> (uVar11 & 0x3f) & 1) != 0);
    }
  }
  puVar17 = (ulong *)0x0;
LAB_0088ba88:
  puVar2 = (ulong *)0x0;
  if (puVar17 != (ulong *)0x0) {
    puVar2 = puVar17 + 1;
  }
  uVar3 = *(undefined4 *)((long)param_1 + 0x64c);
                    /* try { // try from 0088baa4 to 0088badb has its CatchHandler @ 0088c2e0 */
  sVar6 = FUN_008756fc(*param_1,(int)*puVar2);
  uVar24 = (uint)sVar6;
  if ((int)uVar24 < 0) {
    if (*(long *)(lVar5 + 0x28) == local_68) {
                    /* try { // try from 0088c22c to 0088c23b has its CatchHandler @ 0088c2e0 */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,"Exceeded closure limit; simplify the code to compile");
    }
    goto LAB_0088c314;
  }
  pvVar25 = (void *)param_1[0x100];
  lVar15 = param_1[0x102];
  param_1[0x101] = pvVar25;
  uVar11 = puVar2[2] - puVar2[1];
  if ((ulong)(lVar15 - (long)pvVar25) < uVar11) {
    if (-1 < (long)uVar11) {
      pvVar8 = operator_new(uVar11);
      param_1[0x100] = pvVar8;
      param_1[0x101] = pvVar8;
      param_1[0x102] = (long)pvVar8 + uVar11;
      if (pvVar25 != (void *)0x0) {
        operator_delete(pvVar25,lVar15 - (long)pvVar25);
      }
      goto LAB_0088bafc;
    }
    if (*(long *)(lVar5 + 0x28) != local_68) goto LAB_0088c314;
                    /* try { // try from 0088c27c to 0088c27f has its CatchHandler @ 0088c2e0 */
    FUN_0089a058();
LAB_0088c280:
    if (*(long *)(lVar5 + 0x28) == local_68) {
                    /* try { // try from 0088c298 to 0088c2ab has its CatchHandler @ 0088c2b4 */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,
                   "Out of upvalue registers when trying to allocate %s: exceeded limit %d",
                   *(undefined8 *)(param_2 + 0xa0),200);
    }
  }
  else {
LAB_0088bafc:
    if (DAT_00d1ec80 == '\x01') {
      if (param_1[0x1a5] != 0) {
        uVar11 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
        uVar11 = (param_2 >> 0x20 ^ uVar11 >> 0x2f ^ uVar11) * -0x622015f714c7d297;
        uVar11 = (uVar11 ^ uVar11 >> 0x2f) * -0x6b622cb0470b6a63 >>
                 ((ulong)*(byte *)(param_1 + 0x1a6) & 0x3f);
        if ((*(ulong *)(param_1[0x1a3] + (uVar11 >> 6) * 8) >> (uVar11 & 0x3f) & 1) != 0) {
LAB_0088bb80:
          if (*(ulong *)(param_1[0x1a0] + uVar11 * 0x20) != param_2) goto code_r0x0088bb90;
          lVar15 = param_1[0x1a0] + uVar11 * 0x20;
          lVar22 = *(long *)(lVar15 + 0x10) - *(long *)(lVar15 + 8);
          if (lVar22 == 8) {
            local_6c = '\0';
          }
          else {
            uVar11 = 0;
            do {
              local_70 = 2;
              local_6c = (char)uVar11;
                    /* try { // try from 0088c18c to 0088c197 has its CatchHandler @ 0088c2d8 */
              FUN_00899d1c(param_1 + 0x100,&local_70);
              uVar11 = uVar11 + 1;
              uVar9 = *(long *)(lVar15 + 0x10) - *(long *)(lVar15 + 8);
            } while (uVar11 < ((long)uVar9 >> 3) - 1U);
            local_6c = (char)(uVar9 >> 3) + -1;
          }
          if (param_4 != -1) {
            local_6c = param_4;
          }
          local_70 = (uint)(param_4 == -1) << 1;
                    /* try { // try from 0088c1d8 to 0088c1e3 has its CatchHandler @ 0088c2ac */
          FUN_00899d1c(param_1 + 0x100,&local_70);
          uVar11 = lVar22 >> 3;
          goto LAB_0088bbac;
        }
      }
LAB_0088bba8:
      uVar11 = 0;
LAB_0088bbac:
      uVar9 = puVar2[1];
      if (uVar11 < (ulong)((long)(puVar2[2] - uVar9) >> 3)) {
LAB_0088be60:
        uVar9 = *(ulong *)(uVar9 + uVar11 * 8);
        uVar14 = uVar9 >> 0x20;
        uVar16 = (ulong)(uint)((int)uVar9 << 3);
        if (param_1[0x19] != 0) {
          uVar13 = (uVar16 + 8 ^ uVar14) * -0x622015f714c7d297;
          uVar13 = (uVar14 ^ uVar13 >> 0x2f ^ uVar13) * -0x622015f714c7d297;
          uVar13 = (uVar13 ^ uVar13 >> 0x2f) * -0x6b622cb0470b6a63;
          uVar19 = uVar13 >> ((ulong)*(byte *)(param_1 + 0x1a) & 0x3f);
          if ((*(ulong *)(param_1[0x17] + (uVar19 >> 6) * 8) >> (uVar19 & 0x3f) & 1) != 0) {
            do {
              puVar17 = (ulong *)(param_1[0x14] + uVar19 * 0x18);
              if (*puVar17 == uVar9) {
                if (*(char *)((long)puVar17 + 9) == '\x01') {
                  local_70 = 0;
                  if (param_1[0x27] == 0) goto LAB_0088be34;
                  uVar13 = uVar13 >> ((ulong)*(byte *)(param_1 + 0x28) & 0x3f);
                  if ((*(ulong *)(param_1[0x25] + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) == 0)
                  goto LAB_0088be30;
                  goto LAB_0088bf24;
                }
                break;
              }
              uVar19 = uVar19 + 1 & param_1[0x18] - 1;
            } while ((*(ulong *)(param_1[0x17] + (uVar19 >> 6) * 8) >> (uVar19 & 0x3f) & 1) != 0);
          }
        }
        if (param_1[0x35] != 0) {
          uVar16 = (uVar16 + 8 ^ uVar14) * -0x622015f714c7d297;
          uVar14 = (uVar14 ^ uVar16 >> 0x2f ^ uVar16) * -0x622015f714c7d297;
          uVar14 = (uVar14 ^ uVar14 >> 0x2f) * -0x6b622cb0470b6a63 >>
                   ((ulong)*(byte *)(param_1 + 0x36) & 0x3f);
          if ((*(ulong *)(param_1[0x33] + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0) {
            do {
              puVar17 = (ulong *)(param_1[0x30] + uVar14 * 0x30);
              if (*puVar17 == uVar9) {
                puVar17 = puVar17 + 1;
                if ((int)*puVar17 != 0) {
                  iVar4 = *(int *)((long)param_1 + 0x64c);
                  uVar7 = iVar4 + 1;
                  if (0xff < uVar7) {
                    if (*(long *)(lVar5 + 0x28) == local_68) {
                    /* try { // try from 0088c250 to 0088c267 has its CatchHandler @ 0088c2bc */
                    /* WARNING: Subroutine does not return */
                      FUN_0087fcd8(param_2 + 0xc,
                                   "Out of registers when trying to allocate %d registers: exceeded limit %d"
                                   ,1,0xff);
                    }
                    goto LAB_0088c314;
                  }
                  *(uint *)((long)param_1 + 0x64c) = uVar7;
                  uVar1 = *(uint *)(param_1 + 0xca);
                  if (*(uint *)(param_1 + 0xca) <= uVar7) {
                    uVar1 = uVar7;
                  }
                  *(uint *)(param_1 + 0xca) = uVar1;
                    /* try { // try from 0088bff8 to 0088c007 has its CatchHandler @ 0088c2c4 */
                  FUN_0088d98c(param_1,param_2,puVar17,iVar4);
                  local_70 = 0;
                  local_6c = (char)iVar4;
                    /* try { // try from 0088c010 to 0088c01b has its CatchHandler @ 0088c2c0 */
                  FUN_00899d1c(param_1 + 0x100,&local_70);
                  goto LAB_0088be4c;
                }
                break;
              }
              uVar14 = uVar14 + 1 & param_1[0x34] - 1;
            } while ((*(ulong *)(param_1[0x33] + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0);
          }
        }
                    /* try { // try from 0088c034 to 0088c03b has its CatchHandler @ 0088c2e8 */
        local_6c = FUN_0088dd6c(param_1);
        local_70 = 2;
                    /* try { // try from 0088c044 to 0088c04f has its CatchHandler @ 0088c2e4 */
        FUN_00899d1c(param_1 + 0x100,&local_70);
        goto LAB_0088be4c;
      }
LAB_0088c05c:
      if (0x638 < (ulong)(param_1[0x101] - param_1[0x100])) goto LAB_0088c280;
    }
    else {
      puVar17 = (ulong *)puVar2[1];
      puVar20 = (ulong *)puVar2[2];
      if (puVar17 != puVar20) {
LAB_0088bc34:
        uVar11 = *puVar17;
        uVar9 = uVar11 >> 0x20;
        uVar14 = (ulong)(uint)((int)uVar11 << 3);
        if (param_1[0x19] != 0) {
          uVar16 = (uVar14 + 8 ^ uVar9) * -0x622015f714c7d297;
          uVar16 = (uVar9 ^ uVar16 >> 0x2f ^ uVar16) * -0x622015f714c7d297;
          uVar16 = (uVar16 ^ uVar16 >> 0x2f) * -0x6b622cb0470b6a63;
          uVar13 = uVar16 >> ((ulong)*(byte *)(param_1 + 0x1a) & 0x3f);
          if ((*(ulong *)(param_1[0x17] + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0) {
            do {
              puVar12 = (ulong *)(param_1[0x14] + uVar13 * 0x18);
              if (*puVar12 == uVar11) {
                if (*(char *)((long)puVar12 + 9) == '\x01') {
                  local_70 = 0;
                  if (param_1[0x27] == 0) goto LAB_0088bc10;
                  uVar16 = uVar16 >> ((ulong)*(byte *)(param_1 + 0x28) & 0x3f);
                  if ((*(ulong *)(param_1[0x25] + (uVar16 >> 6) * 8) >> (uVar16 & 0x3f) & 1) == 0)
                  goto LAB_0088bc0c;
                  goto LAB_0088bcf8;
                }
                break;
              }
              uVar13 = uVar13 + 1 & param_1[0x18] - 1;
            } while ((*(ulong *)(param_1[0x17] + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0);
          }
        }
        if (param_1[0x35] != 0) {
          uVar14 = (uVar14 + 8 ^ uVar9) * -0x622015f714c7d297;
          uVar9 = (uVar9 ^ uVar14 >> 0x2f ^ uVar14) * -0x622015f714c7d297;
          uVar9 = (uVar9 ^ uVar9 >> 0x2f) * -0x6b622cb0470b6a63 >>
                  ((ulong)*(byte *)(param_1 + 0x36) & 0x3f);
          if ((*(ulong *)(param_1[0x33] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0) {
            do {
              puVar12 = (ulong *)(param_1[0x30] + uVar9 * 0x30);
              if (*puVar12 == uVar11) {
                puVar12 = puVar12 + 1;
                if ((int)*puVar12 != 0) {
                  iVar4 = *(int *)((long)param_1 + 0x64c);
                  uVar7 = iVar4 + 1;
                  if (0xff < uVar7) {
                    if (*(long *)(lVar5 + 0x28) == local_68) {
                    /* try { // try from 0088c200 to 0088c217 has its CatchHandler @ 0088c2cc */
                    /* WARNING: Subroutine does not return */
                      FUN_0087fcd8(param_2 + 0xc,
                                   "Out of registers when trying to allocate %d registers: exceeded limit %d"
                                   ,1,0xff);
                    }
                    goto LAB_0088c314;
                  }
                  *(uint *)((long)param_1 + 0x64c) = uVar7;
                  uVar1 = *(uint *)(param_1 + 0xca);
                  if (*(uint *)(param_1 + 0xca) <= uVar7) {
                    uVar1 = uVar7;
                  }
                  *(uint *)(param_1 + 0xca) = uVar1;
                    /* try { // try from 0088bdd0 to 0088bddf has its CatchHandler @ 0088c2d4 */
                  FUN_0088d98c(param_1,param_2,puVar12,iVar4);
                  local_70 = 0;
                  local_6c = (char)iVar4;
                    /* try { // try from 0088bde8 to 0088bdf3 has its CatchHandler @ 0088c2d0 */
                  FUN_00899d1c(param_1 + 0x100,&local_70);
                  goto LAB_0088bc28;
                }
                break;
              }
              uVar9 = uVar9 + 1 & param_1[0x34] - 1;
            } while ((*(ulong *)(param_1[0x33] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0);
          }
        }
                    /* try { // try from 0088be08 to 0088be0f has its CatchHandler @ 0088c2f0 */
        local_6c = FUN_0088dd6c(param_1);
        local_70 = 2;
                    /* try { // try from 0088be18 to 0088be23 has its CatchHandler @ 0088c2ec */
        FUN_00899d1c(param_1 + 0x100,&local_70);
        goto LAB_0088bc28;
      }
    }
LAB_0088c070:
                    /* try { // try from 0088c080 to 0088c08b has its CatchHandler @ 0088c2dc */
                    /* try { // try from 0088c0a0 to 0088c0a3 has its CatchHandler @ 0088c2b0 */
    if ((((*(int *)(param_1 + 1) < 1) || (uVar11 = FUN_00899e00(param_1,param_2), (uVar11 & 1) == 0)
         ) || ((*(byte *)((long)param_1 + 0x679) & 1) != 0)) ||
       (uVar7 = FUN_008754b0(*param_1,(int)*puVar2), 0x7fff < uVar7)) {
                    /* try { // try from 0088c0cc to 0088c0eb has its CatchHandler @ 0088c2dc */
      FUN_008769e0(*param_1,"allocation: closure with %d upvalues",
                   (ulong)(param_1[0x101] - param_1[0x100]) >> 3);
      uVar10 = 0x13;
    }
    else {
      uVar10 = 0x40;
      uVar24 = uVar7;
    }
    FUN_00875cac(*param_1,uVar10,param_3,uVar24);
    pcVar23 = (char *)param_1[0x101];
    for (pcVar21 = (char *)param_1[0x100]; pcVar21 != pcVar23; pcVar21 = pcVar21 + 8) {
                    /* try { // try from 0088c108 to 0088c117 has its CatchHandler @ 0088c2f4 */
      FUN_00875b54(*param_1,0x46,*pcVar21,pcVar21[4],-(uint)(*pcVar21 == '\x01'));
    }
    *(undefined4 *)((long)param_1 + 0x64c) = uVar3;
    if (*(long *)(lVar5 + 0x28) == local_68) {
      return;
    }
  }
LAB_0088c314:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
  while (uVar16 = uVar16 + 1 & param_1[0x26] - 1,
        (*(ulong *)(param_1[0x25] + (uVar16 >> 6) * 8) >> (uVar16 & 0x3f) & 1) != 0) {
LAB_0088bcf8:
    puVar18 = (ulong *)(param_1[0x22] + uVar16 * 0x28);
    if (*puVar18 == uVar11) {
      local_70 = (uint)(byte)puVar18[4];
      goto LAB_0088bc10;
    }
  }
LAB_0088bc0c:
  local_70 = 0;
LAB_0088bc10:
  local_6c = (char)puVar12[1];
                    /* try { // try from 0088bc1c to 0088bc27 has its CatchHandler @ 0088c2c8 */
  FUN_00899d1c(param_1 + 0x100,&local_70);
LAB_0088bc28:
  puVar17 = puVar17 + 1;
  if (puVar17 == puVar20) goto LAB_0088c070;
  goto LAB_0088bc34;
code_r0x0088bb90:
  uVar11 = uVar11 + 1 & param_1[0x1a4] - 1;
  if ((*(ulong *)(param_1[0x1a3] + (uVar11 >> 6) * 8) >> (uVar11 & 0x3f) & 1) == 0)
  goto LAB_0088bba8;
  goto LAB_0088bb80;
  while (uVar13 = uVar13 + 1 & param_1[0x26] - 1,
        (*(ulong *)(param_1[0x25] + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0) {
LAB_0088bf24:
    puVar20 = (ulong *)(param_1[0x22] + uVar13 * 0x28);
    if (*puVar20 == uVar9) {
      local_70 = (uint)(byte)puVar20[4];
      goto LAB_0088be34;
    }
  }
LAB_0088be30:
  local_70 = 0;
LAB_0088be34:
  local_6c = (char)puVar17[1];
                    /* try { // try from 0088be40 to 0088be4b has its CatchHandler @ 0088c2b8 */
  FUN_00899d1c(param_1 + 0x100,&local_70);
LAB_0088be4c:
  uVar9 = puVar2[1];
  uVar11 = uVar11 + 1;
  if ((ulong)((long)(puVar2[2] - uVar9) >> 3) <= uVar11) goto LAB_0088c05c;
  goto LAB_0088be60;
}

