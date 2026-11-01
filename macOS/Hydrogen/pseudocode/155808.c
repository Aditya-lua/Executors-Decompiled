
ulong FUN_00155808(void)

{
  int iVar1;
  ushort *puVar2;
  ushort *puVar3;
  ushort *puVar4;
  undefined4 *puVar5;
  uint uVar6;
  byte bVar7;
  byte bVar8;
  byte bVar9;
  bool bVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 *puVar13;
  long lVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  undefined8 *puVar17;
  uint uVar18;
  ulong unaff_x19;
  undefined8 *unaff_x20;
  long lVar19;
  int unaff_w22;
  undefined8 *unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  undefined8 *unaff_x26;
  ulong unaff_x27;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 uVar20;
  undefined8 *in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  undefined8 *in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  uint in_stack_00000040;
  ulong *in_stack_00000048;
  ulong *in_stack_00000050;
  ulong *in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  undefined8 uStack0000000000000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  
code_r0x00155808:
  puVar15 = unaff_x23;
code_r0x0015580c:
  if (unaff_x19 < 0x10) {
    if (unaff_x19 < 8) {
      iVar1 = *(int *)(&UNK_008143b0 + unaff_x19 * 4);
      *(undefined1 *)unaff_x20 = *(undefined1 *)puVar15;
      *(undefined1 *)((long)unaff_x20 + 1) = *(undefined1 *)((long)puVar15 + 1);
      *(undefined1 *)((long)unaff_x20 + 2) = *(undefined1 *)((long)puVar15 + 2);
      *(undefined1 *)((long)unaff_x20 + 3) = *(undefined1 *)((long)puVar15 + 3);
      puVar5 = (undefined4 *)((long)puVar15 + (ulong)*(uint *)(&UNK_00814390 + unaff_x19 * 4));
      puVar15 = (undefined8 *)((long)puVar5 - (long)iVar1);
      *(undefined4 *)((long)unaff_x20 + 4) = *puVar5;
    }
    else {
      *unaff_x20 = *puVar15;
    }
    if (8 < unaff_x27) {
      puVar16 = puVar15 + 1;
      puVar13 = unaff_x20 + 1;
      if ((long)puVar13 - (long)puVar16 < 0x10) {
        do {
          puVar15 = puVar13 + 1;
          *puVar13 = *puVar16;
          puVar16 = puVar16 + 1;
          puVar13 = puVar15;
        } while (puVar15 < (undefined8 *)((long)unaff_x20 + unaff_x27));
      }
      else {
        uVar20 = *puVar16;
        unaff_x20[2] = puVar15[2];
        *puVar13 = uVar20;
        if (0x10 < unaff_x27 - 8) {
          puVar16 = unaff_x20 + 3;
          puVar15 = puVar15 + 5;
          do {
            uVar20 = puVar15[-2];
            puVar16[1] = puVar15[-1];
            *puVar16 = uVar20;
            uVar20 = *puVar15;
            puVar16[3] = puVar15[1];
            puVar16[2] = uVar20;
            puVar16 = puVar16 + 4;
            puVar15 = puVar15 + 4;
          } while (puVar16 < (undefined8 *)((long)unaff_x20 + unaff_x27));
        }
      }
    }
  }
  else {
    uVar20 = *puVar15;
    unaff_x20[1] = puVar15[1];
    *unaff_x20 = uVar20;
    if (0x10 < unaff_x27) {
      puVar16 = unaff_x20 + 2;
      do {
        uVar20 = puVar15[2];
        puVar16[1] = puVar15[3];
        *puVar16 = uVar20;
        uVar20 = puVar15[4];
        puVar16[3] = puVar15[5];
        puVar16[2] = uVar20;
        puVar16 = puVar16 + 4;
        puVar15 = puVar15 + 4;
      } while (puVar16 < (undefined8 *)((long)unaff_x20 + unaff_x27));
    }
  }
LAB_0015585c:
  do {
    if (0xffffffffffffff88 < unaff_x28) {
      return unaff_x28;
    }
    unaff_x26 = (undefined8 *)((long)unaff_x26 + unaff_x28);
    unaff_w22 = unaff_w22 + -1;
    if (unaff_w22 == 0) {
      if (in_stack_00000048 != in_stack_00000050) {
        return 0xffffffffffffffec;
      }
      if (in_stack_00000040 != 0x40) {
        return 0xffffffffffffffec;
      }
      *in_stack_00000000 = CONCAT44((int)in_stack_00000098,(int)uStack0000000000000090);
      *(int *)(in_stack_00000000 + 1) = (int)in_stack_000000a0;
      in_stack_00000030 = in_stack_00000030 - *(long *)(unaff_x29 + -0x78);
      if ((ulong)(in_stack_00000008 - (long)unaff_x26) < in_stack_00000030) {
        return 0xffffffffffffffba;
      }
      if (unaff_x26 == (undefined8 *)0x0) {
        lVar14 = 0;
      }
      else {
        _memcpy(unaff_x26,*(long *)(unaff_x29 + -0x78),in_stack_00000030);
        lVar14 = (long)unaff_x26 + in_stack_00000030;
      }
      return lVar14 - in_stack_00000010;
    }
    puVar2 = (ushort *)(in_stack_00000068 + in_stack_00000060 * 8);
    puVar3 = (ushort *)(in_stack_00000088 + in_stack_00000080 * 8);
    puVar4 = (ushort *)(in_stack_00000078 + in_stack_00000070 * 8);
    unaff_x27 = (ulong)*(uint *)(puVar3 + 2);
    uVar12 = (ulong)*(uint *)(puVar2 + 2);
    uVar6 = *(uint *)(puVar4 + 2);
    bVar7 = (byte)puVar2[1];
    bVar8 = (byte)puVar3[1];
    bVar9 = (byte)puVar4[1];
    uVar18 = (uint)bVar9;
    puVar15 = in_stack_00000018;
    if (bVar9 < 2) {
      bVar10 = *(uint *)(puVar2 + 2) == 0;
      if (bVar9 != 0) {
        if (bVar10) {
          uVar6 = uVar6 + 1;
        }
        uVar11 = (ulong)in_stack_00000040;
        in_stack_00000040 = in_stack_00000040 + 1;
        lVar14 = (ulong)uVar6 - ((long)(in_stack_00000038 << (uVar11 & 0x3f)) >> 0x3f);
        if (lVar14 == 3) {
          unaff_x19 = (uStack0000000000000090 - 1) - (ulong)(uStack0000000000000090 - 1 == 0);
        }
        else {
          unaff_x19 = (&uStack0000000000000090)[lVar14] -
                      (ulong)((&uStack0000000000000090)[lVar14] == 0);
          if (lVar14 == 1) goto code_r0x00155644;
        }
        goto code_r0x0015561c;
      }
      unaff_x19 = *(ulong *)(unaff_x25 + (ulong)bVar10 * 8);
      puVar15 = (undefined8 *)(unaff_x25 + (ulong)!bVar10 * 8);
    }
    else {
      uVar11 = (ulong)in_stack_00000040;
      in_stack_00000040 = in_stack_00000040 + uVar18;
      unaff_x19 = ((in_stack_00000038 << (uVar11 & 0x3f)) >> ((ulong)-uVar18 & 0x3f)) + (ulong)uVar6
      ;
code_r0x0015561c:
      in_stack_000000a0 = in_stack_00000098;
    }
code_r0x00155644:
    uStack0000000000000090 = unaff_x19;
    in_stack_00000098 = *puVar15;
    if (bVar8 != 0) {
      uVar11 = (ulong)in_stack_00000040;
      in_stack_00000040 = in_stack_00000040 + bVar8;
      unaff_x27 = ((in_stack_00000038 << (uVar11 & 0x3f)) >> ((ulong)-(uint)bVar8 & 0x3f)) +
                  unaff_x27;
    }
    if (0x1e < ((uint)bVar8 + (uint)bVar7 + uVar18 & 0xff)) {
      if (in_stack_00000040 < 0x41) {
        if (in_stack_00000048 < in_stack_00000058) {
          if (in_stack_00000048 == in_stack_00000050) goto LAB_00155684;
          uVar6 = (int)in_stack_00000048 - (int)in_stack_00000050;
          if (in_stack_00000050 <=
              (ulong *)((long)in_stack_00000048 - (ulong)(in_stack_00000040 >> 3))) {
            uVar6 = in_stack_00000040 >> 3;
          }
          in_stack_00000040 = in_stack_00000040 + uVar6 * -8;
        }
        else {
          uVar6 = in_stack_00000040 >> 3;
          in_stack_00000040 = in_stack_00000040 & 7;
        }
        in_stack_00000048 = (ulong *)((long)in_stack_00000048 - (ulong)uVar6);
        in_stack_00000038 = *in_stack_00000048;
      }
      else {
        in_stack_00000048 = (ulong *)&UNK_00814388;
      }
    }
LAB_00155684:
    if (bVar7 != 0) {
      uVar11 = (ulong)in_stack_00000040;
      in_stack_00000040 = in_stack_00000040 + bVar7;
      uVar12 = ((in_stack_00000038 << (uVar11 & 0x3f)) >> ((ulong)-(uint)bVar7 & 0x3f)) + uVar12;
    }
    if (unaff_w22 != 1) {
      iVar1 = in_stack_00000040 + *(byte *)((long)puVar2 + 3);
      in_stack_00000060 =
           (in_stack_00000038 >> ((ulong)(uint)-iVar1 & 0x3f) &
           (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar2 + 3) * 4)) +
           (ulong)*puVar2;
      iVar1 = iVar1 + (uint)*(byte *)((long)puVar3 + 3);
      in_stack_00000080 =
           (in_stack_00000038 >> ((ulong)(uint)-iVar1 & 0x3f) &
           (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar3 + 3) * 4)) +
           (ulong)*puVar3;
      in_stack_00000040 = iVar1 + (uint)*(byte *)((long)puVar4 + 3);
      in_stack_00000070 =
           (in_stack_00000038 >> ((ulong)-in_stack_00000040 & 0x3f) &
           (ulong)*(uint *)(&UNK_00814304 + (ulong)(uint)*(byte *)((long)puVar4 + 3) * 4)) +
           (ulong)*puVar4;
      if (in_stack_00000040 < 0x41) {
        if (in_stack_00000048 < in_stack_00000058) {
          if (in_stack_00000048 == in_stack_00000050) goto code_r0x0015577c;
          uVar6 = (int)in_stack_00000048 - (int)in_stack_00000050;
          if (in_stack_00000050 <=
              (ulong *)((long)in_stack_00000048 - (ulong)(in_stack_00000040 >> 3))) {
            uVar6 = in_stack_00000040 >> 3;
          }
          in_stack_00000040 = in_stack_00000040 + uVar6 * -8;
        }
        else {
          uVar6 = in_stack_00000040 >> 3;
          in_stack_00000040 = in_stack_00000040 & 7;
        }
        in_stack_00000048 = (ulong *)((long)in_stack_00000048 - (ulong)uVar6);
        in_stack_00000038 = *in_stack_00000048;
      }
      else {
        in_stack_00000048 = (ulong *)&UNK_00814388;
      }
    }
code_r0x0015577c:
    puVar16 = *(undefined8 **)(unaff_x29 + -0x78);
    unaff_x20 = (undefined8 *)((long)unaff_x26 + uVar12);
    puVar15 = (undefined8 *)((long)unaff_x20 - unaff_x19);
    Hint_Prefetch(puVar15,0,0,0);
    if (((long)puVar16 + uVar12 <= in_stack_00000030) &&
       (unaff_x28 = uVar12 + unaff_x27, (long)unaff_x26 + unaff_x28 <= unaff_x24)) {
      uVar20 = *puVar16;
      unaff_x26[1] = puVar16[1];
      *unaff_x26 = uVar20;
      if (0x10 < uVar12) {
        uVar20 = puVar16[2];
        unaff_x26[3] = puVar16[3];
        unaff_x26[2] = uVar20;
        if (0x10 < uVar12 - 0x10) {
          puVar13 = unaff_x26 + 4;
          puVar17 = puVar16 + 6;
          do {
            uVar20 = puVar17[-2];
            puVar13[1] = puVar17[-1];
            *puVar13 = uVar20;
            uVar20 = *puVar17;
            puVar13[3] = puVar17[1];
            puVar13[2] = uVar20;
            puVar13 = puVar13 + 4;
            puVar17 = puVar17 + 4;
          } while (puVar13 < unaff_x20);
        }
      }
      *(ulong *)(unaff_x29 + -0x78) = (long)puVar16 + uVar12;
      if ((ulong)((long)unaff_x20 - (long)unaff_x23) < unaff_x19) {
        if ((ulong)((long)unaff_x20 - in_stack_00000028) < unaff_x19) {
          return 0xffffffffffffffec;
        }
        lVar19 = (long)puVar15 - (long)unaff_x23;
        lVar14 = in_stack_00000020 + lVar19;
        if (in_stack_00000020 < lVar14 + unaff_x27) {
          _memmove(unaff_x20,lVar14,-lVar19);
          unaff_x20 = (undefined8 *)((long)unaff_x20 - lVar19);
          unaff_x27 = lVar19 + unaff_x27;
          goto code_r0x00155808;
        }
        _memmove(unaff_x20,lVar14,unaff_x27);
        goto LAB_0015585c;
      }
      goto code_r0x0015580c;
    }
    *(ulong *)(unaff_x29 + -0x70) = uVar12;
    *(ulong *)(unaff_x29 + -0x68) = unaff_x27;
    *(ulong *)(unaff_x29 + -0x60) = unaff_x19;
    unaff_x28 = func_0x00155c78(unaff_x26,in_stack_00000008,unaff_x29 + -0x70,unaff_x29 + -0x78,
                                in_stack_00000030);
  } while( true );
}

