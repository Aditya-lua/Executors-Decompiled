/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091b654
 */

int FUN_0091b654(long param_1,int param_2,undefined8 *param_3)

{
  uint *puVar1;
  byte bVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  long lVar6;
  undefined8 uVar7;
  ulong uVar8;
  uint uVar9;
  long lVar10;
  char *pcVar11;
  
  if ((*(byte *)(param_1 + 0x1b3) & 1) == 0) {
    if (3 < param_2 - 1U) {
      *(undefined8 *)(param_1 + 0x1158) = 0;
      goto LAB_0091b758;
    }
    lVar10 = *(long *)(param_1 + 0x1158);
    switch(param_2) {
    case 1:
      if (lVar10 != 0) {
        if (*(long *)(param_1 + 0x208) == 0) {
          lVar6 = FUN_00941e8c(param_1,"Transfer-Encoding",0x11);
          if ((lVar6 != 0) &&
             (uVar8 = FUN_0091a870(lVar6,"Transfer-Encoding:",0x12,"chunked",7), (uVar8 & 1) != 0))
          {
            lVar10 = -1;
          }
          goto LAB_0091b740;
        }
        if (0 < lVar10) {
          iVar3 = FUN_00935e10(param_1,*(long *)(param_1 + 0x208),lVar10);
          goto joined_r0x0091b750;
        }
      }
      goto LAB_0091b758;
    case 2:
      if (*(long *)(param_1 + 0x11d8) == 0) {
        lVar10 = (*(code *)PTR_calloc_00cc4690)(1,0x1b8);
        *(long *)(param_1 + 0x11d8) = lVar10;
        if (lVar10 == 0) {
          return 0x1b;
        }
        FUN_00925eb8();
        iVar3 = FUN_00921204(param_1,*(undefined8 *)(param_1 + 0x11d8),
                             *(undefined8 *)(param_1 + 0x348),*(undefined8 *)(param_1 + 0x1160));
        if (iVar3 != 0) {
          (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x11d8));
          *(undefined8 *)(param_1 + 0x11d8) = 0;
          return iVar3;
        }
        lVar10 = *(long *)(param_1 + 0x11d8);
        *(long *)(param_1 + 0x11d0) = lVar10;
      }
      else {
        lVar10 = *(long *)(param_1 + 0x11d0);
      }
      if (lVar10 != 0) goto LAB_0091b6fc;
      iVar3 = FUN_00935d48(param_1);
      break;
    case 3:
      *(long *)(param_1 + 0x11d0) = param_1 + 0x350;
LAB_0091b6fc:
      lVar10 = FUN_00941e8c(param_1,"Content-Type",0xc);
      lVar6 = *(long *)(param_1 + 0x11d0);
      *(uint *)(lVar6 + 0x14) = *(uint *)(lVar6 + 0x14) | 2;
      if (lVar10 == 0) {
        pcVar11 = "multipart/form-data";
        if (*(int *)(lVar6 + 0x10) != 4) {
          pcVar11 = (char *)0x0;
        }
      }
      else {
        pcVar11 = (char *)(lVar10 + 0xc);
        do {
          pcVar11 = pcVar11 + 1;
        } while (*pcVar11 == ' ');
      }
      curl_mime_headers(lVar6,*(undefined8 *)(param_1 + 0x340),0);
      iVar3 = FUN_00927968(param_1,*(undefined8 *)(param_1 + 0x11d0),pcVar11,0,1);
      if (iVar3 != 0) {
        return iVar3;
      }
      curl_mime_headers(*(undefined8 *)(param_1 + 0x11d0),0,0);
      iVar4 = FUN_00927fcc(param_1,*(undefined8 *)(param_1 + 0x11d0));
      iVar3 = 0;
      if (iVar4 != 0) {
        return iVar4;
      }
      break;
    case 4:
      if (lVar10 == 0) goto LAB_0091b758;
LAB_0091b740:
      iVar3 = FUN_009357d8(param_1,lVar10);
joined_r0x0091b750:
      if (iVar3 != 0) {
        return iVar3;
      }
      goto LAB_0091b7f4;
    }
    uVar7 = FUN_00935f5c(param_1);
    *(undefined8 *)(param_1 + 0x1158) = uVar7;
  }
  else {
LAB_0091b758:
    iVar3 = FUN_00935d48(param_1);
  }
  if (iVar3 == 0) {
LAB_0091b7f4:
    puVar1 = (uint *)(param_1 + 0x1b1);
    if (((param_2 == 4) || (param_2 == 1)) && (*(long *)(param_1 + 0x1118) != 0)) {
      if (*(long *)(param_1 + 0x1118) < 0) {
        *(undefined8 *)(param_1 + 0x1118) = 0;
      }
      else if (((*(byte *)(param_1 + 0x1b3) & 1) == 0) &&
              (iVar3 = FUN_00935fa8(param_1), iVar3 != 0)) {
        FUN_00904b80(param_1,"Unable to resume from offset %ld",*(undefined8 *)(param_1 + 0x1118));
        return iVar3;
      }
    }
    lVar10 = FUN_00941e8c(param_1,"Transfer-Encoding",0x11);
    if (lVar10 == 0) {
      lVar10 = FUN_00935f5c(param_1);
      if (lVar10 < 0) {
        if (((*(char *)(param_1 + 0x1319) == '\n') ||
            (bVar2 = *(byte *)(*(long *)(param_1 + 0x20) + 0x574), bVar2 == 10)) ||
           (*(char *)(param_1 + 0x1318) == '\x01')) {
          FUN_00904b80(param_1,"Chunky upload is not supported by HTTP 1.0");
          return 0x19;
        }
        uVar9 = *puVar1 & 0xffffc000 | *puVar1 & 0x1fff | (uint)(bVar2 < 0x14) << 0xd;
      }
      else {
        uVar9 = *puVar1 & 0xffffdfff;
      }
      iVar3 = 0;
      *puVar1 = uVar9;
      if ((uVar9 >> 0xd & 1) != 0) {
        iVar3 = 0;
        *param_3 = "Transfer-Encoding: chunked\r\n";
      }
    }
    else {
      uVar5 = FUN_0091a870(lVar10,"Transfer-Encoding:",0x12,"chunked",7);
      iVar3 = 0;
      uVar9 = *puVar1 & 0xffffc000 | *puVar1 & 0x1fff | (uVar5 & 1) << 0xd;
      *puVar1 = uVar9;
      if (((uVar5 & 1) != 0) && (iVar3 = 0, *(char *)(param_1 + 0x1319) != '\n')) {
        iVar3 = 0;
        bVar2 = *(byte *)(*(long *)(param_1 + 0x20) + 0x574);
        if (bVar2 != 10) {
          if (*(char *)(param_1 + 0x1318) == '\x01') {
            iVar3 = 0;
          }
          else {
            iVar3 = 0;
            if (0x13 < bVar2) {
              if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
                 ((*(long *)(param_1 + 0x12a0) == 0 ||
                  (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
                FUN_00904c98(param_1,
                             "suppressing chunked transfer encoding on connection using HTTP version 2 or higher"
                            );
                uVar9 = *puVar1;
              }
              iVar3 = 0;
              *puVar1 = uVar9 & 0xffffdfff;
            }
          }
        }
      }
    }
  }
  return iVar3;
}

