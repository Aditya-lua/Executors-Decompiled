
void FUN_00060648(void)

{
  ulong uVar1;
  ulong uVar2;
  byte bVar3;
  char cVar4;
  char cVar5;
  bool bVar6;
  int iVar7;
  long *plVar8;
  uint uVar9;
  int iVar10;
  ulong uVar11;
  int iVar12;
  ulong uVar13;
  uint uVar14;
  int iVar15;
  ulong uVar16;
  uint uVar17;
  long *unaff_x21;
  long unaff_x22;
  ulong unaff_x24;
  
code_r0x00060648:
LAB_00060280:
  do {
    while( true ) {
      uVar1 = unaff_x24 + 1;
      uVar11 = (ulong)*(byte *)((long)unaff_x21 + 0x17);
      bVar6 = -1 < (char)*(byte *)((long)unaff_x21 + 0x17);
      uVar13 = unaff_x21[1];
      uVar16 = uVar13;
      if (bVar6) {
        uVar16 = uVar11;
      }
      if (uVar16 <= uVar1) {
        return;
      }
      if (bVar6) break;
      plVar8 = (long *)*unaff_x21;
      uVar16 = uVar13;
      if (*(char *)(*unaff_x21 + uVar1) == '%') goto code_r0x000602dc;
code_r0x00060274:
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
      unaff_x24 = uVar1;
    }
    plVar8 = unaff_x21;
    uVar16 = uVar11;
    if (*(char *)((long)unaff_x21 + uVar1) != '%') goto code_r0x00060274;
code_r0x000602dc:
    uVar2 = unaff_x24 + 2;
    if (uVar16 <= uVar2) goto code_r0x00060274;
    bVar3 = *(byte *)((long)plVar8 + uVar2);
    if ((ulong)bVar3 == 0x75) {
      if (bVar6) {
        uVar13 = uVar11;
      }
      if (((uVar13 <= unaff_x24 + 3) ||
          (cVar5 = *(char *)((long)plVar8 + unaff_x24 + 3), cVar5 == '\0')) ||
         (uVar9 = (uint)cVar5, cVar5 < ' ')) goto code_r0x000605d0;
      if ((*(uint *)(unaff_x22 + (ulong)uVar9 * 4 + 0x3c) >> 10 & 1) == 0) {
        if (uVar9 - 0x41 < 6) {
          iVar10 = -0x37;
          cVar4 = *(char *)((long)plVar8 + unaff_x24 + 4);
          goto joined_r0x0006033c;
        }
        if (uVar9 - 0x61 < 6) {
          iVar10 = -0x57;
          uVar9 = (uint)*(char *)((long)plVar8 + unaff_x24 + 4);
          if (uVar9 == 0) goto code_r0x000605d0;
          goto code_r0x00060430;
        }
      }
      else {
        iVar10 = -0x30;
        cVar4 = *(char *)((long)plVar8 + unaff_x24 + 4);
joined_r0x0006033c:
        uVar9 = (uint)cVar4;
        if (cVar4 != '\0') {
code_r0x00060430:
          if (0x1f < (int)uVar9) {
            if ((*(uint *)(unaff_x22 + (ulong)uVar9 * 4 + 0x3c) >> 10 & 1) == 0) {
              if (uVar9 - 0x41 < 6) {
                iVar12 = -0x37;
                cVar4 = *(char *)((long)plVar8 + unaff_x24 + 5);
                goto joined_r0x000604d4;
              }
              if (5 < uVar9 - 0x61) goto code_r0x000605d0;
              iVar12 = -0x57;
              uVar14 = (uint)*(char *)((long)plVar8 + unaff_x24 + 5);
              if (uVar14 == 0) goto code_r0x000605d0;
            }
            else {
              iVar12 = -0x30;
              cVar4 = *(char *)((long)plVar8 + unaff_x24 + 5);
joined_r0x000604d4:
              uVar14 = (uint)cVar4;
              if (cVar4 == '\0') goto code_r0x000605d0;
            }
            if (0x1f < (int)uVar14) {
              if ((*(uint *)(unaff_x22 + (ulong)uVar14 * 4 + 0x3c) >> 10 & 1) == 0) {
                if (uVar14 - 0x41 < 6) {
                  iVar15 = -0x37;
                  cVar4 = *(char *)((long)plVar8 + unaff_x24 + 6);
                  goto joined_r0x00060538;
                }
                if (5 < uVar14 - 0x61) goto code_r0x000605d0;
                iVar15 = -0x57;
                uVar17 = (uint)*(char *)((long)plVar8 + unaff_x24 + 6);
                if (uVar17 == 0) goto code_r0x000605d0;
              }
              else {
                iVar15 = -0x30;
                cVar4 = *(char *)((long)plVar8 + unaff_x24 + 6);
joined_r0x00060538:
                uVar17 = (uint)cVar4;
                if (cVar4 == '\0') goto code_r0x000605d0;
              }
              unaff_x24 = unaff_x24 + 6;
              if (0x1f < (int)uVar17) {
                if ((*(uint *)(unaff_x22 + (ulong)uVar17 * 4 + 0x3c) >> 10 & 1) != 0) {
                  iVar7 = -0x30;
                  goto code_r0x0006059c;
                }
                if (uVar17 - 0x41 < 6) {
                  iVar7 = -0x37;
                  goto code_r0x0006059c;
                }
                if (uVar17 - 0x61 < 6) break;
              }
            }
          }
        }
      }
code_r0x000605d0:
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
      unaff_x24 = uVar1;
      goto LAB_00060280;
    }
    if (bVar6) {
      uVar13 = uVar11;
    }
    if ((uVar2 < uVar13) && ('\x1f' < (char)bVar3)) {
      if ((*(uint *)(unaff_x22 + (ulong)bVar3 * 4 + 0x3c) >> 10 & 1) == 0) {
        if ((byte)(bVar3 + 0xbf) < 6) {
          bVar3 = *(byte *)((long)plVar8 + unaff_x24 + 3);
        }
        else {
          if (5 < (byte)(bVar3 + 0x9f)) goto code_r0x00060498;
          bVar3 = *(byte *)((long)plVar8 + unaff_x24 + 3);
        }
      }
      else {
        bVar3 = *(byte *)((long)plVar8 + unaff_x24 + 3);
      }
      if (('\x1f' < (char)bVar3) &&
         (((unaff_x24 = unaff_x24 + 3,
           (*(uint *)(unaff_x22 + (ulong)bVar3 * 4 + 0x3c) >> 10 & 1) != 0 ||
           ((byte)(bVar3 + 0xbf) < 6)) || ((byte)(bVar3 + 0x9f) < 6)))) {
        __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
        goto LAB_00060280;
      }
    }
code_r0x00060498:
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
    unaff_x24 = uVar1;
  } while( true );
  iVar7 = -0x57;
code_r0x0006059c:
  uVar9 = uVar17 + (uVar14 + (uVar9 + (iVar10 + cVar5) * 0x10 + iVar12) * 0x10 + iVar15) * 0x10 +
          iVar7;
  if ((((int)uVar9 < 0x80) || (uVar9 < 0x800)) ||
     ((uVar9 >> 0xb < 0x1b || ((0xdfff < uVar9 && ((uVar9 >> 0x10 == 0 || (uVar9 >> 0x10 < 0x11)))))
      ))) {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm();
  }
  goto code_r0x00060648;
}

