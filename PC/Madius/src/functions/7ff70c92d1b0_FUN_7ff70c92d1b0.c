/* 7ff70c92d1b0 FUN_7ff70c92d1b0 */

void FUN_7ff70c92d1b0(undefined8 *param_1)

{
  byte *pbVar1;
  byte bVar2;
  uint uVar3;
  longlong lVar4;
  byte *pbVar5;
  byte bVar6;
  
  pbVar5 = (byte *)*param_1;
  pbVar1 = (byte *)param_1[1];
  if (pbVar5 == pbVar1) {
    *(undefined4 *)(param_1 + 0xe) = 0xffffffff;
    *(undefined1 *)((longlong)param_1 + 0x75) = 0;
    return;
  }
  bVar6 = *pbVar5;
  *(byte *)((longlong)param_1 + 0x75) = bVar6;
  lVar4 = FUN_7ff70cb12b40(&UNK_7ff70cb46740,(int)(char)bVar6,0x17);
  if (lVar4 == 0) goto LAB_7ff70c92d298;
  *(uint *)(param_1 + 0xe) = (uint)bVar6;
  switch(bVar6) {
  case 0x24:
    uVar3 = (uint)param_1[0xc];
    if ((param_1[0xc] & 0x1000000) == 0) {
      return;
    }
    if (pbVar5 + 1 == pbVar1) {
      return;
    }
    bVar6 = pbVar5[1];
    if (bVar6 == 0x5c) {
      bVar2 = func_0x7ff70c92d350(param_1);
      bVar6 = pbVar5[(ulonglong)bVar2 + 1];
      uVar3 = (uint)param_1[0xc];
    }
    else {
      bVar2 = 0;
    }
    if (((*(int *)((longlong)param_1 + 0x14) == 0 && bVar6 == 10) & (byte)((uVar3 & 4) >> 2)) != 0)
    {
      return;
    }
    bVar6 = bVar2 & bVar6 == 0x29 & *(int *)((longlong)param_1 + 0x14) != 0;
    break;
  case 0x25:
  case 0x26:
  case 0x27:
  case 0x2a:
  case 0x2c:
  case 0x2d:
  case 0x2e:
  case 0x2f:
  case 0x30:
  case 0x31:
  case 0x32:
  case 0x33:
  case 0x34:
  case 0x35:
  case 0x36:
  case 0x37:
  case 0x38:
  case 0x39:
  case 0x3a:
  case 0x3b:
  case 0x3c:
  case 0x3d:
  case 0x3e:
  case 0x40:
  case 0x41:
  case 0x42:
  case 0x43:
  case 0x44:
  case 0x45:
  case 0x46:
  case 0x47:
  case 0x48:
  case 0x49:
  case 0x4a:
  case 0x4b:
  case 0x4c:
  case 0x4d:
  case 0x4e:
  case 0x4f:
  case 0x50:
  case 0x51:
  case 0x52:
  case 0x53:
  case 0x54:
  case 0x55:
  case 0x56:
  case 0x57:
  case 0x58:
  case 0x59:
  case 0x5a:
  case 0x5b:
  case 0x5d:
  case 0x5e:
  case 0x5f:
  case 0x60:
  case 0x61:
  case 0x62:
  case 99:
  case 100:
  case 0x65:
  case 0x66:
  case 0x67:
  case 0x68:
  case 0x69:
  case 0x6a:
  case 0x6b:
  case 0x6c:
  case 0x6d:
  case 0x6e:
  case 0x6f:
  case 0x70:
  case 0x71:
  case 0x72:
  case 0x73:
  case 0x74:
  case 0x75:
  case 0x76:
  case 0x77:
  case 0x78:
  case 0x79:
  case 0x7a:
    goto LAB_7ff70c92d29f;
  case 0x28:
  case 0x29:
    bVar6 = *(byte *)(param_1 + 0xc) & 8;
    goto joined_r0x7ff70c92d22b;
  case 0x2b:
  case 0x3f:
    bVar6 = *(byte *)(param_1 + 0xc) & 1;
joined_r0x7ff70c92d22b:
    if (bVar6 != 0) {
      return;
    }
    goto LAB_7ff70c92d298;
  case 0x5c:
    if (*(char *)((longlong)param_1 + 0x74) != '\0') {
      return;
    }
    pbVar5 = pbVar5 + 1;
    if (pbVar5 == pbVar1) {
      return;
    }
    if (((param_1[0xc] & 8) != 0) || (uVar3 = (uint)*pbVar5, (*pbVar5 & 0xfe) != 0x28)) {
      if ((param_1[0xc] & 0x10) != 0) {
        return;
      }
      bVar6 = *pbVar5;
      uVar3 = (uint)bVar6;
      if ((bVar6 != 0x7d) && (bVar6 != 0x7b)) {
        return;
      }
    }
    *(char *)((longlong)param_1 + 0x75) = (char)uVar3;
    *(uint *)(param_1 + 0xe) = uVar3;
    return;
  case 0x7b:
  case 0x7d:
    bVar6 = *(byte *)(param_1 + 0xc) & 0x10;
    break;
  case 0x7c:
    bVar6 = *(byte *)(param_1 + 0xc) & 2;
    break;
  default:
    if (((bVar6 == 10) && ((*(byte *)(param_1 + 0xc) & 4) != 0)) &&
       (*(int *)((longlong)param_1 + 0x14) == 0)) {
      *(undefined4 *)(param_1 + 0xe) = 0x7c;
    }
    goto LAB_7ff70c92d29f;
  }
  if (bVar6 == 0) {
LAB_7ff70c92d298:
    *(undefined4 *)(param_1 + 0xe) = 0;
  }
LAB_7ff70c92d29f:
  return;
}


