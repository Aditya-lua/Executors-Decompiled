
/* WARNING: Removing unreachable block (ram,0x00138a20) */

void FUN_00138688(undefined8 param_1,long *param_2,long param_3)

{
  int iVar1;
  long lVar2;
  undefined1 in_ZR;
  long lVar3;
  int in_w8;
  int in_w9;
  int in_w10;
  long in_x11;
  ulong in_x12;
  ulong in_x13;
  long in_x14;
  int in_w15;
  byte in_w16;
  int iVar4;
  long unaff_x19;
  long lVar5;
  long *plVar6;
  long unaff_x24;
  int unaff_w26;
  
  do {
    if ((bool)in_ZR) {
      iVar4 = 4;
    }
    else {
      if ((in_w16 & 0xf0) != 0xe0) goto LAB_0013864c;
      iVar4 = 3;
    }
    while( true ) {
      while( true ) {
        while( true ) {
          in_x13 = (ulong)(uint)(iVar4 + (int)in_x13);
          if (in_x12 <= in_x13) {
            lVar5 = *param_2 + (long)in_w9 * 0xc;
            if (*(int *)(param_3 + 4) < in_w10) {
              if (in_w9 != unaff_w26) {
                lVar3 = *param_2 + (long)unaff_w26 * 0xc;
                plVar6 = (long *)(unaff_x24 + (long)in_w8 * 0x18 + 8);
                lVar2 = *plVar6 - lVar3;
                if (lVar2 != 0) {
                  _memmove(lVar5,lVar3,lVar2 + -3);
                }
                *plVar6 = lVar5 + lVar2;
              }
            }
            else {
              plVar6 = (long *)(unaff_x24 + (long)in_w8 * 0x18 + 8);
              if (lVar5 != *plVar6) {
                *plVar6 = lVar5;
              }
            }
            *(undefined1 *)(unaff_x19 + 0x5d) = 1;
            return;
          }
          in_w16 = *(byte *)(in_x11 + in_x13 * in_x14);
          if (in_w16 != 9) break;
          iVar4 = *(int *)(unaff_x19 + 0x54);
          iVar1 = 0;
          if (iVar4 != 0) {
            iVar1 = in_w10 / iVar4;
          }
          in_w10 = iVar4 + iVar1 * iVar4;
          in_w16 = 0;
LAB_0013864c:
          iVar4 = in_w15;
          if ((in_w16 & 0xe0) == 0xc0) {
            iVar4 = in_w15 + 1;
          }
        }
        in_w10 = in_w10 + 1;
        if ((in_w16 & 0xfe) != 0xfc) break;
        iVar4 = 6;
      }
      if ((in_w16 & 0xfc) != 0xf8) break;
      iVar4 = 5;
    }
    in_ZR = (in_w16 & 0xf8) == 0xf0;
  } while( true );
}

