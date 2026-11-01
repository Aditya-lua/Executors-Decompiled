
void FUN_000602a0(void)

{
  ulong uVar1;
  byte bVar2;
  char cVar3;
  char cVar4;
  undefined1 in_CY;
  int iVar5;
  long *plVar6;
  byte in_w9;
  uint uVar7;
  int iVar8;
  ulong in_x11;
  int iVar9;
  ulong in_x12;
  uint uVar10;
  int iVar11;
  ulong uVar12;
  uint uVar13;
  long *unaff_x21;
  long unaff_x22;
  ulong uVar14;
  ulong unaff_x23;
  
  do {
    if ((bool)in_CY) {
      return;
    }
    uVar14 = unaff_x23;
    if ((in_w9 & 1) == 0) {
      plVar6 = unaff_x21;
      uVar12 = in_x11;
      if (*(char *)((long)unaff_x21 + unaff_x23) == '%') goto LAB_000602dc;
LAB_00060274:
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
    }
    else {
      plVar6 = (long *)*unaff_x21;
      uVar12 = in_x12;
      if (*(char *)(*unaff_x21 + unaff_x23) != '%') goto LAB_00060274;
LAB_000602dc:
      uVar1 = unaff_x23 + 1;
      if (uVar12 <= uVar1) goto LAB_00060274;
      bVar2 = *(byte *)((long)plVar6 + uVar1);
      if ((ulong)bVar2 == 0x75) {
        if ((in_w9 & 1) == 0) {
          in_x12 = in_x11;
        }
        if (((in_x12 <= unaff_x23 + 2) ||
            (cVar4 = *(char *)((long)plVar6 + unaff_x23 + 2), cVar4 == '\0')) ||
           (uVar7 = (uint)cVar4, cVar4 < ' ')) goto LAB_000605d0;
        if ((*(uint *)(unaff_x22 + (ulong)uVar7 * 4 + 0x3c) >> 10 & 1) == 0) {
          if (uVar7 - 0x41 < 6) {
            iVar8 = -0x37;
            cVar3 = *(char *)((long)plVar6 + unaff_x23 + 3);
            goto joined_r0x0006042c;
          }
          if (uVar7 - 0x61 < 6) {
            iVar8 = -0x57;
            uVar7 = (uint)*(char *)((long)plVar6 + unaff_x23 + 3);
            if (uVar7 == 0) goto LAB_000605d0;
            goto LAB_00060430;
          }
        }
        else {
          iVar8 = -0x30;
          cVar3 = *(char *)((long)plVar6 + unaff_x23 + 3);
joined_r0x0006042c:
          uVar7 = (uint)cVar3;
          if (cVar3 != '\0') {
LAB_00060430:
            if (0x1f < (int)uVar7) {
              if ((*(uint *)(unaff_x22 + (ulong)uVar7 * 4 + 0x3c) >> 10 & 1) == 0) {
                if (uVar7 - 0x41 < 6) {
                  iVar9 = -0x37;
                  cVar3 = *(char *)((long)plVar6 + unaff_x23 + 4);
                  goto joined_r0x000604d4;
                }
                if (5 < uVar7 - 0x61) goto LAB_000605d0;
                iVar9 = -0x57;
                uVar10 = (uint)*(char *)((long)plVar6 + unaff_x23 + 4);
                if (uVar10 == 0) goto LAB_000605d0;
              }
              else {
                iVar9 = -0x30;
                cVar3 = *(char *)((long)plVar6 + unaff_x23 + 4);
joined_r0x000604d4:
                uVar10 = (uint)cVar3;
                if (cVar3 == '\0') goto LAB_000605d0;
              }
              if (0x1f < (int)uVar10) {
                if ((*(uint *)(unaff_x22 + (ulong)uVar10 * 4 + 0x3c) >> 10 & 1) == 0) {
                  if (uVar10 - 0x41 < 6) {
                    iVar11 = -0x37;
                    cVar3 = *(char *)((long)plVar6 + unaff_x23 + 5);
                    goto joined_r0x00060538;
                  }
                  if (5 < uVar10 - 0x61) goto LAB_000605d0;
                  iVar11 = -0x57;
                  uVar13 = (uint)*(char *)((long)plVar6 + unaff_x23 + 5);
                  if (uVar13 == 0) goto LAB_000605d0;
                }
                else {
                  iVar11 = -0x30;
                  cVar3 = *(char *)((long)plVar6 + unaff_x23 + 5);
joined_r0x00060538:
                  uVar13 = (uint)cVar3;
                  if (cVar3 == '\0') goto LAB_000605d0;
                }
                if (0x1f < (int)uVar13) {
                  if ((*(uint *)(unaff_x22 + (ulong)uVar13 * 4 + 0x3c) >> 10 & 1) == 0) {
                    if (uVar13 - 0x41 < 6) {
                      iVar5 = -0x37;
                    }
                    else {
                      if (5 < uVar13 - 0x61) goto LAB_000605d0;
                      iVar5 = -0x57;
                    }
                  }
                  else {
                    iVar5 = -0x30;
                  }
                  uVar7 = uVar13 + (uVar10 + (uVar7 + (iVar8 + cVar4) * 0x10 + iVar9) * 0x10 +
                                   iVar11) * 0x10 + iVar5;
                  if ((((int)uVar7 < 0x80) || (uVar7 < 0x800)) ||
                     ((uVar7 >> 0xb < 0x1b ||
                      ((0xdfff < uVar7 && ((uVar7 >> 0x10 == 0 || (uVar7 >> 0x10 < 0x11)))))))) {
                    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
                  }
                  uVar14 = unaff_x23 + 5;
                  goto LAB_00060280;
                }
              }
            }
          }
        }
LAB_000605d0:
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
      }
      else {
        if ((in_w9 & 1) == 0) {
          in_x12 = in_x11;
        }
        if ((uVar1 < in_x12) && ('\x1f' < (char)bVar2)) {
          if ((*(uint *)(unaff_x22 + (ulong)bVar2 * 4 + 0x3c) >> 10 & 1) == 0) {
            if ((byte)(bVar2 + 0xbf) < 6) {
              bVar2 = *(byte *)((long)plVar6 + unaff_x23 + 2);
            }
            else {
              if (5 < (byte)(bVar2 + 0x9f)) goto LAB_00060498;
              bVar2 = *(byte *)((long)plVar6 + unaff_x23 + 2);
            }
          }
          else {
            bVar2 = *(byte *)((long)plVar6 + unaff_x23 + 2);
          }
          if (('\x1f' < (char)bVar2) &&
             (((uVar14 = unaff_x23 + 2,
               (*(uint *)(unaff_x22 + (ulong)bVar2 * 4 + 0x3c) >> 10 & 1) != 0 ||
               ((byte)(bVar2 + 0xbf) < 6)) || ((byte)(bVar2 + 0x9f) < 6)))) {
            __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
            goto LAB_00060280;
          }
        }
LAB_00060498:
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
        uVar14 = unaff_x23;
      }
    }
LAB_00060280:
    unaff_x23 = uVar14 + 1;
    in_x11 = (ulong)*(byte *)((long)unaff_x21 + 0x17);
    in_w9 = (char)*(byte *)((long)unaff_x21 + 0x17) < '\0';
    in_x12 = unaff_x21[1];
    uVar14 = in_x12;
    if (!(bool)in_w9) {
      uVar14 = in_x11;
    }
    in_CY = uVar14 <= unaff_x23;
  } while( true );
}

