
undefined8 FUN_0079b980(ulong param_1,ulong param_2)

{
  char cVar1;
  byte bVar2;
  long *plVar3;
  long *in_x9;
  long lVar4;
  ulong in_x10;
  ulong in_x11;
  ulong uVar5;
  int in_w12;
  long *unaff_x19;
  ulong unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  undefined1 unaff_w24;
  long *unaff_x25;
  ulong unaff_x26;
  ulong uVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  
  do {
    bVar2 = (byte)(param_2 >> 0x38);
    if (in_w12 < 0) {
      if (((in_x11 - param_1 ^ unaff_x26 - param_1) & in_x10) < 8) goto LAB_0079bbdc;
LAB_0079b99c:
      plVar3 = (long *)((long)in_x9 + ~in_x11 * unaff_x23);
      cVar1 = *(char *)((long)in_x9 + in_x11);
      *(byte *)((long)in_x9 + in_x11) = bVar2 >> 1;
      *(byte *)(*unaff_x19 + (in_x11 - 8 & in_x10) + 8) = bVar2 >> 1;
      if (cVar1 == -1) {
        uVar5 = unaff_x19[1];
        *(undefined1 *)(*unaff_x19 + unaff_x26) = unaff_w24;
        *(undefined1 *)(*unaff_x19 + (uVar5 & unaff_x26 - 8) + 8) = unaff_w24;
        lVar4 = *unaff_x25;
        lVar8 = unaff_x25[3];
        lVar7 = unaff_x25[2];
        plVar3[1] = unaff_x25[1];
        *plVar3 = lVar4;
        plVar3[3] = lVar8;
        plVar3[2] = lVar7;
        lVar7 = unaff_x25[5];
        lVar4 = unaff_x25[4];
        lVar9 = unaff_x25[7];
        lVar8 = unaff_x25[6];
        lVar10 = unaff_x25[8];
        lVar12 = unaff_x25[0xb];
        lVar11 = unaff_x25[10];
        plVar3[9] = unaff_x25[9];
        plVar3[8] = lVar10;
        plVar3[0xb] = lVar12;
        plVar3[10] = lVar11;
        plVar3[5] = lVar7;
        plVar3[4] = lVar4;
        plVar3[7] = lVar9;
        plVar3[6] = lVar8;
        lVar7 = unaff_x25[0xd];
        lVar4 = unaff_x25[0xc];
        lVar9 = unaff_x25[0xf];
        lVar8 = unaff_x25[0xe];
        lVar10 = unaff_x25[0x10];
        lVar12 = unaff_x25[0x13];
        lVar11 = unaff_x25[0x12];
        plVar3[0x11] = unaff_x25[0x11];
        plVar3[0x10] = lVar10;
        plVar3[0x13] = lVar12;
        plVar3[0x12] = lVar11;
        plVar3[0xd] = lVar7;
        plVar3[0xc] = lVar4;
        plVar3[0xf] = lVar9;
        plVar3[0xe] = lVar8;
        lVar7 = unaff_x25[0x15];
        lVar4 = unaff_x25[0x14];
        lVar9 = unaff_x25[0x17];
        lVar8 = unaff_x25[0x16];
        lVar11 = unaff_x25[0x19];
        lVar10 = unaff_x25[0x18];
        plVar3[0x1a] = unaff_x25[0x1a];
        plVar3[0x17] = lVar9;
        plVar3[0x16] = lVar8;
        plVar3[0x19] = lVar11;
        plVar3[0x18] = lVar10;
        plVar3[0x15] = lVar7;
        plVar3[0x14] = lVar4;
        goto LAB_0079bbf8;
      }
      lVar4 = *unaff_x25;
      *unaff_x25 = *plVar3;
      *plVar3 = lVar4;
      lVar4 = unaff_x25[1];
      unaff_x25[1] = plVar3[1];
      plVar3[1] = lVar4;
      lVar4 = unaff_x25[2];
      unaff_x25[2] = plVar3[2];
      plVar3[2] = lVar4;
      lVar4 = unaff_x25[3];
      unaff_x25[3] = plVar3[3];
      plVar3[3] = lVar4;
      lVar4 = unaff_x25[4];
      unaff_x25[4] = plVar3[4];
      plVar3[4] = lVar4;
      lVar4 = unaff_x25[5];
      unaff_x25[5] = plVar3[5];
      plVar3[5] = lVar4;
      lVar4 = unaff_x25[6];
      unaff_x25[6] = plVar3[6];
      plVar3[6] = lVar4;
      lVar4 = unaff_x25[7];
      unaff_x25[7] = plVar3[7];
      plVar3[7] = lVar4;
      lVar4 = unaff_x25[8];
      unaff_x25[8] = plVar3[8];
      plVar3[8] = lVar4;
      lVar4 = unaff_x25[9];
      unaff_x25[9] = plVar3[9];
      plVar3[9] = lVar4;
      lVar4 = unaff_x25[10];
      unaff_x25[10] = plVar3[10];
      plVar3[10] = lVar4;
      lVar4 = unaff_x25[0xb];
      unaff_x25[0xb] = plVar3[0xb];
      plVar3[0xb] = lVar4;
      lVar4 = unaff_x25[0xc];
      unaff_x25[0xc] = plVar3[0xc];
      plVar3[0xc] = lVar4;
      lVar4 = unaff_x25[0xd];
      unaff_x25[0xd] = plVar3[0xd];
      plVar3[0xd] = lVar4;
      lVar4 = unaff_x25[0xe];
      unaff_x25[0xe] = plVar3[0xe];
      plVar3[0xe] = lVar4;
      lVar4 = unaff_x25[0xf];
      unaff_x25[0xf] = plVar3[0xf];
      plVar3[0xf] = lVar4;
      lVar4 = unaff_x25[0x10];
      unaff_x25[0x10] = plVar3[0x10];
      plVar3[0x10] = lVar4;
      lVar4 = unaff_x25[0x11];
      unaff_x25[0x11] = plVar3[0x11];
      plVar3[0x11] = lVar4;
      lVar4 = unaff_x25[0x12];
      unaff_x25[0x12] = plVar3[0x12];
      plVar3[0x12] = lVar4;
      lVar4 = unaff_x25[0x13];
      unaff_x25[0x13] = plVar3[0x13];
      plVar3[0x13] = lVar4;
      lVar4 = unaff_x25[0x14];
      unaff_x25[0x14] = plVar3[0x14];
      plVar3[0x14] = lVar4;
      lVar4 = unaff_x25[0x15];
      unaff_x25[0x15] = plVar3[0x15];
      plVar3[0x15] = lVar4;
      lVar4 = unaff_x25[0x16];
      unaff_x25[0x16] = plVar3[0x16];
      plVar3[0x16] = lVar4;
      lVar4 = unaff_x25[0x17];
      unaff_x25[0x17] = plVar3[0x17];
      plVar3[0x17] = lVar4;
      lVar4 = unaff_x25[0x18];
      unaff_x25[0x18] = plVar3[0x18];
      plVar3[0x18] = lVar4;
      lVar4 = unaff_x25[0x19];
      unaff_x25[0x19] = plVar3[0x19];
      plVar3[0x19] = lVar4;
      lVar4 = unaff_x25[0x1a];
      unaff_x25[0x1a] = plVar3[0x1a];
      plVar3[0x1a] = lVar4;
    }
    else {
      lVar4 = *in_x9;
      uVar5 = CONCAT17(-(lVar4 < 0),
                       CONCAT16(-((char)((ulong)lVar4 >> 0x30) < '\0'),
                                CONCAT15(-((char)((ulong)lVar4 >> 0x28) < '\0'),
                                         CONCAT14(-((char)((ulong)lVar4 >> 0x20) < '\0'),
                                                  CONCAT13(-((char)((ulong)lVar4 >> 0x18) < '\0'),
                                                           CONCAT12(-((char)((ulong)lVar4 >> 0x10) <
                                                                     '\0'),CONCAT11(-((char)((ulong)
                                                  lVar4 >> 8) < '\0'),-((char)lVar4 < '\0'))))))));
      uVar5 = (uVar5 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar5 & 0x5555555555555555) << 1;
      uVar5 = (uVar5 & 0xcccccccccccccccc) >> 2 | (uVar5 & 0x3333333333333333) << 2;
      uVar5 = (uVar5 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar5 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
      uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
      in_x11 = (ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3;
      if (7 < ((in_x11 - param_1 ^ unaff_x26 - param_1) & in_x10)) goto LAB_0079b99c;
LAB_0079bbdc:
      *(byte *)((long)in_x9 + unaff_x26) = bVar2 >> 1;
      *(byte *)(*unaff_x19 + (in_x10 & unaff_x26 - 8) + 8) = bVar2 >> 1;
LAB_0079bbf8:
      do {
        unaff_x26 = unaff_x22;
        if (unaff_x21 <= unaff_x26) {
          uVar5 = unaff_x19[1];
          if (7 < uVar5) {
            uVar5 = (uVar5 + 1 >> 3) * 7;
          }
          unaff_x19[2] = uVar5 - unaff_x19[3];
          return 0x8000000000000001;
        }
        unaff_x22 = unaff_x26 + 1;
      } while (*(char *)(*unaff_x19 + unaff_x26) != -0x80);
      unaff_x25 = (long *)(*unaff_x19 + ~unaff_x26 * unaff_x23);
    }
    param_2 = func_0x0023deb8();
    in_x9 = (long *)*unaff_x19;
    in_x10 = unaff_x19[1];
    param_1 = in_x10 & param_2;
    lVar4 = *(long *)((long)in_x9 + param_1);
    uVar6 = CONCAT17(-(lVar4 < 0),
                     CONCAT16(-((char)((ulong)lVar4 >> 0x30) < '\0'),
                              CONCAT15(-((char)((ulong)lVar4 >> 0x28) < '\0'),
                                       CONCAT14(-((char)((ulong)lVar4 >> 0x20) < '\0'),
                                                CONCAT13(-((char)((ulong)lVar4 >> 0x18) < '\0'),
                                                         CONCAT12(-((char)((ulong)lVar4 >> 0x10) <
                                                                   '\0'),CONCAT11(-((char)((ulong)
                                                  lVar4 >> 8) < '\0'),-((char)lVar4 < '\0'))))))));
    uVar5 = param_1;
    if (uVar6 == 0) {
      lVar4 = 8;
      do {
        uVar5 = uVar5 + lVar4 & in_x10;
        lVar7 = *(long *)((long)in_x9 + uVar5);
        uVar6 = CONCAT17(-(lVar7 < 0),
                         CONCAT16(-((char)((ulong)lVar7 >> 0x30) < '\0'),
                                  CONCAT15(-((char)((ulong)lVar7 >> 0x28) < '\0'),
                                           CONCAT14(-((char)((ulong)lVar7 >> 0x20) < '\0'),
                                                    CONCAT13(-((char)((ulong)lVar7 >> 0x18) < '\0'),
                                                             CONCAT12(-((char)((ulong)lVar7 >> 0x10)
                                                                       < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar7 >> 8) < '\0'),-((char)lVar7 < '\0'))))
                                                  ))));
        lVar4 = lVar4 + 8;
      } while (uVar6 == 0);
    }
    uVar6 = (uVar6 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar6 & 0x5555555555555555) << 1;
    uVar6 = (uVar6 & 0xcccccccccccccccc) >> 2 | (uVar6 & 0x3333333333333333) << 2;
    uVar6 = (uVar6 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar6 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar6 = (uVar6 & 0xff00ff00ff00ff00) >> 8 | (uVar6 & 0xff00ff00ff00ff) << 8;
    uVar6 = (uVar6 & 0xffff0000ffff0000) >> 0x10 | (uVar6 & 0xffff0000ffff) << 0x10;
    in_x11 = uVar5 + ((ulong)LZCOUNT(uVar6 >> 0x20 | uVar6 << 0x20) >> 3) & in_x10;
    in_w12 = (int)*(char *)((long)in_x9 + in_x11);
  } while( true );
}

