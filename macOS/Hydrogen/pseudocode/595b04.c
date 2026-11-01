
void FUN_00595b04(ulong *param_1,ulong param_2)

{
  char cVar1;
  byte bVar2;
  ulong in_x9;
  ulong uVar3;
  ulong uVar4;
  ulong in_x10;
  ulong uVar5;
  ulong in_x11;
  long lVar6;
  long *unaff_x19;
  code *unaff_x20;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  undefined1 unaff_w25;
  long unaff_x26;
  long unaff_x27;
  
code_r0x00595b04:
  if (in_x10 < 8) goto LAB_00595b7c;
  do {
    uVar5 = ~in_x11;
    cVar1 = *(char *)((long)param_1 + in_x11);
    bVar2 = (byte)(param_2 >> 0x38);
    *(byte *)((long)param_1 + in_x11) = bVar2 >> 1;
    *(byte *)(*unaff_x19 + (in_x11 - 8 & in_x9) + 8) = bVar2 >> 1;
    if (cVar1 == -1) {
      uVar3 = unaff_x19[1];
      *(undefined1 *)(*unaff_x19 + unaff_x23) = unaff_w25;
      *(undefined1 *)(*unaff_x19 + (uVar3 & unaff_x23 - 8) + 8) = unaff_w25;
      param_1[uVar5] = *(ulong *)(unaff_x26 + unaff_x27);
      goto LAB_00595b98;
    }
    uVar3 = *(ulong *)(unaff_x26 + unaff_x27);
    *(ulong *)(unaff_x26 + unaff_x27) = param_1[uVar5];
    param_1[uVar5] = uVar3;
    while( true ) {
      param_2 = (*unaff_x20)();
      param_1 = (ulong *)*unaff_x19;
      in_x9 = unaff_x19[1];
      uVar4 = in_x9 & param_2;
      uVar5 = *(ulong *)((long)param_1 + uVar4) & 0x8080808080808080;
      uVar3 = uVar4;
      if (uVar5 == 0) {
        lVar6 = 8;
        do {
          uVar3 = uVar3 + lVar6 & in_x9;
          lVar6 = lVar6 + 8;
          uVar5 = *(ulong *)((long)param_1 + uVar3) & 0x8080808080808080;
        } while (uVar5 == 0);
      }
      uVar5 = (uVar5 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar5 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
      in_x11 = uVar3 + ((ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3) & in_x9;
      if (*(char *)((long)param_1 + in_x11) < '\0') {
        in_x10 = (in_x11 - uVar4 ^ unaff_x23 - uVar4) & in_x9;
        goto code_r0x00595b04;
      }
      uVar5 = (*param_1 & 0x8080808080808080) >> 7;
      uVar5 = (uVar5 & 0xff00ff00ff00ff00) >> 8 | (uVar5 & 0xff00ff00ff00ff) << 8;
      uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
      in_x11 = (ulong)LZCOUNT(uVar5 >> 0x20 | uVar5 << 0x20) >> 3;
      if (7 < ((in_x11 - uVar4 ^ unaff_x23 - uVar4) & in_x9)) break;
LAB_00595b7c:
      bVar2 = (byte)(param_2 >> 0x38);
      *(byte *)((long)param_1 + unaff_x23) = bVar2 >> 1;
      *(byte *)(*unaff_x19 + (in_x9 & unaff_x23 - 8) + 8) = bVar2 >> 1;
LAB_00595b98:
      do {
        unaff_x23 = unaff_x24;
        if (unaff_x22 <= unaff_x23) {
          uVar5 = unaff_x19[1];
          if (7 < uVar5) {
            uVar5 = (uVar5 + 1 >> 3) * 7;
          }
          unaff_x19[2] = uVar5 - unaff_x19[3];
          return;
        }
        unaff_x24 = unaff_x23 + 1;
        unaff_x26 = *unaff_x19;
      } while (*(char *)(unaff_x26 + unaff_x23) != -0x80);
      unaff_x27 = ~unaff_x23 << 3;
    }
  } while( true );
}

