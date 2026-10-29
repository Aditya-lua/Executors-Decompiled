/* 7ff70c8f2df0 FUN_7ff70c8f2df0 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int FUN_7ff70c8f2df0(longlong param_1,int param_2,uint *param_3)

{
  char *pcVar1;
  int *piVar2;
  char cVar3;
  undefined2 uVar4;
  uint uVar5;
  uint uVar6;
  int iVar7;
  int iVar8;
  longlong lVar9;
  longlong lVar10;
  undefined8 uVar11;
  ulonglong uVar12;
  byte bVar13;
  bool bVar14;
  undefined4 uStack_20;
  undefined4 uStack_1c;
  
  iVar7 = 4;
  if (param_2 < 0x2711) {
    switch(param_2) {
    case 3:
      if (0xffff < *param_3) {
        return 0x2b;
      }
      *(short *)(param_1 + 0x208) = (short)*param_3;
      break;
    default:
      goto code_r0x7ff70c8f4d67;
    case 0xd:
      if (0x20c49b < *param_3) {
        return 0x2b;
      }
      uVar5 = *param_3 * 1000;
      goto code_r0x7ff70c8f384b;
    case 0xe:
      lVar9 = (longlong)(int)*param_3;
code_r0x7ff70c8f374d:
      if (lVar9 < -1) {
        return 0x2b;
      }
      *(longlong *)(param_1 + 0x318) = lVar9;
      break;
    case 0x13:
      if ((int)*param_3 < 0) {
        return 0x2b;
      }
      *(uint *)(param_1 + 800) = *param_3;
      break;
    case 0x14:
      if ((int)*param_3 < 0) {
        return 0x2b;
      }
      *(uint *)(param_1 + 0x324) = *param_3;
      break;
    case 0x15:
      lVar9 = (longlong)(int)*param_3;
code_r0x7ff70c8f372f:
      if (lVar9 < -1) {
        return 0x2b;
      }
      *(longlong *)(param_1 + 0x338) = lVar9;
      break;
    case 0x1b:
      *(bool *)(param_1 + 0xa26) = *param_3 != 0;
      break;
    case 0x20:
    case 0xfa:
      uVar5 = *param_3;
      if (0x7ffff < (int)(uVar5 & 0xffff0000)) {
        return 0x2b;
      }
      if ((uVar5 & 0xfffe) == 2) {
        return 0x2b;
      }
      if ((uVar5 & 0x8000fff8) != 0) {
        return 0x2b;
      }
      lVar9 = param_1 + 0x528;
      if (param_2 != 0x20) {
        lVar9 = param_1 + 0x5e0;
      }
      *(char *)(lVar9 + 0x68) = (char)uVar5;
      *(uint *)(lVar9 + 100) = uVar5 & 0xffff0000;
      break;
    case 0x21:
      if (3 < *param_3) {
        return 0x2b;
      }
      *(char *)(param_1 + 0x520) = (char)*param_3;
      break;
    case 0x22:
      lVar9 = (longlong)(int)*param_3;
LAB_7ff70c8f390a:
      *(longlong *)(param_1 + 0x518) = lVar9;
      break;
    case 0x29:
      *(bool *)(param_1 + 0xa37) = *param_3 != 0;
      break;
    case 0x2a:
      *(bool *)(param_1 + 0xa33) = *param_3 != 0;
      break;
    case 0x2b:
      uVar5 = *param_3;
      *(bool *)(param_1 + 0xa2d) = uVar5 != 0;
      if (uVar5 == 0) {
        uVar5 = *(uint *)(param_1 + 0xaa4) & 0xffffffef;
      }
      else {
        uVar5 = *(uint *)(param_1 + 0xaa4) | 0x10;
      }
      *(uint *)(param_1 + 0xaa4) = uVar5;
      break;
    case 0x2c:
      uVar5 = *param_3;
      *(bool *)(param_1 + 0xa36) = uVar5 != 0;
      if (uVar5 == 0) {
        if (*(char *)(param_1 + 0x521) == '\x05') goto code_r0x7ff70c8f4b0c;
      }
      else {
        *(undefined1 *)(param_1 + 0x521) = 5;
      }
      break;
    case 0x2d:
      *(bool *)(param_1 + 0xa2e) = *param_3 != 0;
      break;
    case 0x2e:
    case 0x36:
      if (*param_3 == 0) goto code_r0x7ff70c8f4b0c;
      *(undefined1 *)(param_1 + 0x521) = 4;
code_r0x7ff70c8f3b60:
      *(undefined1 *)(param_1 + 0xa36) = 0;
      break;
    case 0x2f:
      if (*param_3 != 0) {
        *(undefined1 *)(param_1 + 0x521) = 1;
        goto code_r0x7ff70c8f3b60;
      }
code_r0x7ff70c8f4b0c:
      *(undefined1 *)(param_1 + 0x521) = 0;
      break;
    case 0x32:
      *(bool *)(param_1 + 0xa2c) = *param_3 != 0;
      break;
    case 0x33:
      if (2 < *param_3) {
        return 0x2b;
      }
      *(char *)(param_1 + 0x6e8) = (char)*param_3;
      break;
    case 0x34:
      *(bool *)(param_1 + 0xa30) = *param_3 != 0;
      break;
    case 0x35:
      *(bool *)(param_1 + 0xa2b) = *param_3 != 0;
      break;
    case 0x3a:
      *(bool *)(param_1 + 0xa35) = *param_3 != 0;
      break;
    case 0x3b:
      if (0xffff < *param_3) {
        return 0x2b;
      }
      *(short *)(param_1 + 0x6a0) = (short)*param_3;
      break;
    case 0x3c:
      lVar9 = (longlong)(int)*param_3;
code_r0x7ff70c8f3955:
      if (lVar9 < -1) {
        return 0x2b;
      }
      if ((*(longlong *)(param_1 + 0x228) < lVar9) &&
         (*(longlong *)(param_1 + 0x218) == *(longlong *)(param_1 + 0x968))) {
        (*_DAT_7ff70cbebad8)(*(longlong *)(param_1 + 0x968));
        *(undefined8 *)(param_1 + 0x968) = 0;
        *(undefined8 *)(param_1 + 0x218) = 0;
      }
      *(longlong *)(param_1 + 0x228) = lVar9;
      break;
    case 0x3d:
      *(bool *)(param_1 + 0xa2a) = *param_3 != 0;
      break;
    case 0x40:
      uVar5 = *param_3;
      *(bool *)(param_1 + 0x591) = uVar5 != 0;
      if (*(longlong *)(param_1 + 0x20) != 0) {
        *(bool *)(*(longlong *)(param_1 + 0x20) + 0x251) = uVar5 != 0;
      }
      break;
    case 0x44:
      if ((int)*param_3 < -1) {
        return 0x2b;
      }
      *(uint *)(param_1 + 0x214) = *param_3;
      break;
    case 0x45:
      *(bool *)(param_1 + 0xa29) = *param_3 != 0;
      break;
    case 0x47:
      if ((longlong)(int)*param_3 < 0) {
        return 0x2b;
      }
      *(longlong *)(param_1 + 0x9d0) = (longlong)(int)*param_3;
      break;
    case 0x4a:
      *(bool *)(param_1 + 0xa3a) = *param_3 != 0;
      break;
    case 0x4b:
      *(bool *)(param_1 + 0xa39) = *param_3 != 0;
      break;
    case 0x4e:
      if (0x20c49b < *param_3) {
        return 0x2b;
      }
      uVar5 = *param_3 * 1000;
      goto code_r0x7ff70c8f379d;
    case 0x50:
      if (*param_3 != 0) {
        *(undefined1 *)(param_1 + 0x521) = 0;
        goto code_r0x7ff70c8f3b60;
      }
      break;
    case 0x51:
      bVar14 = (*param_3 & 3) != 0;
      *(bool *)(param_1 + 0x592) = bVar14;
      if (*(longlong *)(param_1 + 0x20) != 0) {
        *(bool *)(*(longlong *)(param_1 + 0x20) + 0x252) = bVar14;
      }
      break;
    case 0x54:
      uVar5 = *param_3;
      if (2 < uVar5) {
        if (-1 < (int)uVar5) {
          return 1;
        }
        return 0x2b;
      }
      *(char *)(param_1 + 0x522) = (char)uVar5;
      break;
    case 0x5a:
      (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x838));
      *(undefined8 *)(param_1 + 0x838) = 0;
      iVar7 = func_0x7ff70c942930(param_1);
      return iVar7;
    case 0x5b:
    case 0xe1:
      break;
    case 0x5c:
      if ((int)*param_3 < -1) {
        return 0x2b;
      }
      *(uint *)(param_1 + 0x6b8) = *param_3;
      break;
    case 0x60:
      *(bool *)(param_1 + 0xa25) = *param_3 != 0;
      break;
    case 0x62:
      if (*(longlong *)(param_1 + 0xc40) != 0) {
        return 0x2b;
      }
      uVar5 = *param_3;
      uVar6 = 0xa00000;
      if ((int)uVar5 < 0xa00001) {
        if ((int)uVar5 < 1) {
          uVar6 = 0x4000;
        }
        else {
          uVar6 = 0x400;
          if (0x400 < uVar5) {
            uVar6 = uVar5;
          }
        }
      }
      *(uint *)(param_1 + 0x6bc) = uVar6;
      break;
    case 99:
      *(bool *)(param_1 + 0xa3b) = *param_3 != 0;
      break;
    case 0x65:
      if (7 < *param_3) {
        return 0x2b;
      }
      *(char *)(param_1 + 0x6a2) = (char)*param_3;
      break;
    case 0x69:
      *(bool *)(param_1 + 0xa32) = *param_3 != 0;
      break;
    case 0x6b:
      uVar5 = *param_3;
      if (uVar5 == 0) {
        *(undefined4 *)(param_1 + 0x20c) = 0;
      }
      else {
        *(char *)(param_1 + 0xd76) = (char)((uVar5 & 0x10) >> 4);
        uVar6 = uVar5 & 0xffffffdf;
        if ((uVar5 & 0x10) != 0) {
          uVar6 = uVar5 & 0xffffffcd | 2;
        }
        if ((uVar6 & 0x7fffffdf) == 0) {
          return 4;
        }
        *(uint *)(param_1 + 0x20c) = uVar6;
      }
      break;
    case 0x6f:
      uVar5 = *param_3;
      if (uVar5 == 0) {
        *(undefined4 *)(param_1 + 0x210) = 0;
      }
      else {
        *(char *)(param_1 + 0xd86) = (char)((uVar5 & 0x10) >> 4);
        uVar6 = uVar5 & 0xffffffdf;
        if ((uVar5 & 0x10) != 0) {
          uVar6 = uVar5 & 0xffffffcd | 2;
        }
        if ((uVar6 & 0x7fffffdf) == 0) {
          return 4;
        }
        *(uint *)(param_1 + 0x210) = uVar6;
      }
      break;
    case 0x70:
      if (0x20c49b < *param_3) {
        return 0x2b;
      }
      *(uint *)(param_1 + 0x30c) = *param_3 * 1000;
      break;
    case 0x71:
      if (2 < *param_3) {
        return 0x2b;
      }
      *(char *)(param_1 + 0x6d8) = (char)*param_3;
      break;
    case 0x72:
      lVar9 = (longlong)(int)*param_3;
joined_r0x7ff70c8f36ce:
      if (lVar9 < 0) {
        return 0x2b;
      }
      *(longlong *)(param_1 + 0x6e0) = lVar9;
      break;
    case 0x77:
      if (3 < *param_3) {
        return 0x2b;
      }
      *(char *)(param_1 + 0xa21) = (char)*param_3;
      break;
    case 0x79:
      *(bool *)(param_1 + 0xa3c) = *param_3 != 0;
      break;
    case 0x88:
      *(bool *)(param_1 + 0xa3d) = *param_3 != 0;
      break;
    case 0x8b:
      if (0xffff < *param_3) {
        return 0x2b;
      }
      uVar4 = func_0x7ff70c94fb50(*param_3);
      *(undefined2 *)(param_1 + 0x230) = uVar4;
      break;
    case 0x8c:
      if (0xffff < *param_3) {
        return 0x2b;
      }
      uVar4 = func_0x7ff70c94fb50(*param_3);
      *(undefined2 *)(param_1 + 0x232) = uVar4;
      break;
    case 0x8d:
      if (2 < (int)*param_3) {
        return 0x2b;
      }
      *(char *)(param_1 + 0xa22) = (char)*param_3;
      break;
    case 0x96:
      uVar5 = *param_3;
      *(bool *)(param_1 + 0x594) = uVar5 != 0;
      *(bool *)(param_1 + 0x64c) = uVar5 != 0;
      break;
    case 0x9b:
      uVar5 = *param_3;
code_r0x7ff70c8f384b:
      *(uint *)(param_1 + 0x300) = uVar5;
      break;
    case 0x9c:
      uVar5 = *param_3;
code_r0x7ff70c8f379d:
      *(uint *)(param_1 + 0x304) = uVar5;
      break;
    case 0x9d:
      *(bool *)(param_1 + 0xa3e) = *param_3 == 0;
      break;
    case 0x9e:
      *(bool *)(param_1 + 0xa3f) = *param_3 == 0;
      break;
    case 0xa1:
      if ((int)*param_3 < 0) {
        return 0x2b;
      }
      *(byte *)(param_1 + 0xa20) = (byte)*param_3 & 7;
      break;
    case 0xa6:
      if (*param_3 == 1) {
        *(undefined1 *)(param_1 + 0xa40) = 1;
      }
      else {
        if (*param_3 != 0) {
          return 0x2b;
        }
        *(undefined1 *)(param_1 + 0xa40) = 0;
      }
      break;
    case 0xab:
      *(uint *)(param_1 + 0x9b0) = *param_3;
      break;
    case 0xac:
      cVar3 = FUN_7ff70c943d00(param_1,2);
      if (cVar3 == '\0') {
        return 4;
      }
      *(bool *)(param_1 + 0x5d8) = *param_3 != 0;
      break;
    case 0xb4:
      *(bool *)(param_1 + 0xa41) = *param_3 != 0;
      break;
    case 0xb5:
      *(uint *)(param_1 + 0x9b4) = *param_3;
      break;
    case 0xb6:
      *(uint *)(param_1 + 0x9b8) = *param_3;
      break;
    case 0xcf:
      *(bool *)(param_1 + 0xa31) = *param_3 != 0;
      break;
    case 0xd2:
      *(byte *)(param_1 + 0x9c0) = (byte)*param_3 & 3;
      break;
    case 0xd5:
      *(bool *)(param_1 + 0xa43) = *param_3 != 0;
      break;
    case 0xd6:
      if ((int)*param_3 < 0) {
        return 0x2b;
      }
      *(uint *)(param_1 + 0x9c4) = *param_3;
      break;
    case 0xd7:
      if ((int)*param_3 < 0) {
        return 0x2b;
      }
      *(uint *)(param_1 + 0x9c8) = *param_3;
      break;
    case 0xd8:
      uVar5 = *param_3;
      bVar13 = (byte)uVar5;
      *(byte *)(param_1 + 0x588) = bVar13;
      *(uint *)(param_1 + 0x5da) =
           (uVar5 & 0xff | (uint)(bVar13 >> 1) << 8 | (uint)(bVar13 >> 2) << 0x10 |
           (uint)(bVar13 >> 3) << 0x18) & (uint)UNK_7ff70cb44500;
      *(byte *)(param_1 + 0x5de) = bVar13 >> 4 & 1;
      *(byte *)(param_1 + 0x5df) = bVar13 >> 5 & 1;
      break;
    case 0xda:
      *(bool *)(param_1 + 0xa42) = *param_3 != 0;
      break;
    case 0xe2:
      *(bool *)(param_1 + 0xa45) = *param_3 != 0;
      break;
    case 0xe3:
      if ((int)*param_3 < 0) {
        return 0x2b;
      }
      *(uint *)(param_1 + 0x9d8) = *param_3;
      break;
    case 0xe5:
      *(byte *)(param_1 + 0xa24) = (byte)*param_3 & 1;
      break;
    case 0xe8:
      cVar3 = func_0x7ff70c943170();
      if (cVar3 == '\0') {
        return 4;
      }
      uVar5 = *param_3;
      *(bool *)(param_1 + 0x593) = uVar5 != 0;
      if (*(longlong *)(param_1 + 0x20) != 0) {
        *(bool *)(*(longlong *)(param_1 + 0x20) + 0x253) = uVar5 != 0;
      }
      break;
    case 0xe9:
      cVar3 = func_0x7ff70c943180();
      if (cVar3 == '\0') {
        return 4;
      }
      *(bool *)(param_1 + 0x5d9) = *param_3 != 0;
      break;
    case 0xea:
      *(bool *)(param_1 + 0xa46) = *param_3 != 0;
      break;
    case 0xed:
      *(bool *)(param_1 + 0xa47) = *param_3 != 0;
      break;
    case 0xef:
      goto code_r0x7ff70c8f4d67;
    case 0xf4:
      return 4;
    case 0xf5:
      *(bool *)(param_1 + 0xa2f) = *param_3 != 0;
      break;
    case 0xf8:
      uVar5 = *param_3;
      *(bool *)(param_1 + 0x649) = uVar5 != 0;
      if (*(longlong *)(param_1 + 0x20) != 0) {
        *(bool *)(*(longlong *)(param_1 + 0x20) + 0x2c1) = uVar5 != 0;
      }
      break;
    case 0xf9:
      bVar14 = (*param_3 & 3) != 0;
      *(bool *)(param_1 + 0x64a) = bVar14;
      if (*(longlong *)(param_1 + 0x20) != 0) {
        *(bool *)(*(longlong *)(param_1 + 0x20) + 0x2c2) = bVar14;
      }
      break;
    case 0x105:
      uVar5 = *param_3;
      bVar13 = (byte)uVar5;
      *(byte *)(param_1 + 0x640) = bVar13;
      *(uint *)(param_1 + 0x692) =
           (uVar5 & 0xff | (uint)(bVar13 >> 1) << 8 | (uint)(bVar13 >> 2) << 0x10 |
           (uint)(bVar13 >> 3) << 0x18) & (uint)UNK_7ff70cb44500;
      *(byte *)(param_1 + 0x696) = bVar13 >> 4 & 1;
      *(byte *)(param_1 + 0x697) = bVar13 >> 5 & 1;
      break;
    case 0x109:
      *(bool *)(param_1 + 0xa48) = *param_3 != 0;
      break;
    case 0x10b:
      uVar5 = *param_3;
      *(char *)(param_1 + 0x6a3) = (char)uVar5;
      return (uint)((uVar5 & 0xfa) != 0) << 2;
    case 0x10f:
      *(uint *)(param_1 + 0x308) = *param_3;
      break;
    case 0x112:
      *(bool *)(param_1 + 0xa4a) = *param_3 != 0;
      break;
    case 0x113:
      *(bool *)(param_1 + 0xa49) = *param_3 != 0;
      break;
    case 0x116:
      *(bool *)(param_1 + 0xa4c) = *param_3 != 0;
      break;
    case 0x118:
      uVar5 = 0x4000;
      if (0x4000 < (int)*param_3) {
        uVar5 = *param_3;
      }
      uVar6 = 0x200000;
      if ((int)uVar5 < 0x200000) {
        uVar6 = uVar5;
      }
      *(uint *)(param_1 + 0x6c0) = uVar6;
      (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0xc48));
      *(undefined8 *)(param_1 + 0xc48) = 0;
      break;
    case 0x119:
      if ((int)*param_3 < 0) {
        return 0x2b;
      }
      *(uint *)(param_1 + 0x9f0) = *param_3;
      break;
    case 0x11d:
      if (1 < (int)*param_3) {
        return 0x2b;
      }
      *(bool *)(param_1 + 0xa51) = *param_3 != 0;
      break;
    case 0x11e:
      lVar9 = *(longlong *)(param_1 + 0xa68);
      if (lVar9 == 0) {
        lVar9 = func_0x7ff70c950050();
        *(longlong *)(param_1 + 0xa68) = lVar9;
        if (lVar9 == 0) {
          return 0x1b;
        }
      }
      iVar7 = func_0x7ff70c950370(lVar9,*param_3);
      if (iVar7 != 0) {
        return iVar7;
      }
      return 0;
    case 0x120:
      if ((int)*param_3 < 0) {
        return 0x2b;
      }
      *(uint *)(param_1 + 0x310) = *param_3;
      break;
    case 299:
      if ((*param_3 & 1) == 0) {
code_r0x7ff70c8f4c41:
        FUN_7ff70c9512c0(param_1 + 0xa60);
      }
      else if (*(longlong *)(param_1 + 0xa60) == 0) {
        lVar9 = func_0x7ff70c951290();
        *(longlong *)(param_1 + 0xa60) = lVar9;
        if (lVar9 == 0) {
          return 0x1b;
        }
        return 0;
      }
      break;
    case 0x132:
      *(bool *)(param_1 + 0xa4e) = *param_3 != 0;
      break;
    case 0x133:
      *(bool *)(param_1 + 0xa4f) = (*param_3 & 3) != 0;
      break;
    case 0x134:
      cVar3 = func_0x7ff70c943170();
      if (cVar3 == '\0') {
        return 4;
      }
      *(bool *)(param_1 + 0xa50) = *param_3 != 0;
      break;
    case 0x13a:
      if ((int)*param_3 < 0) {
        return 0x2b;
      }
      *(uint *)(param_1 + 0x314) = *param_3;
      break;
    case 0x13b:
      *(uint *)(param_1 + 0x9bc) = *param_3;
      break;
    case 0x141:
      if ((int)*param_3 < -1) {
        return 0x2b;
      }
      *(uint *)(param_1 + 0x6b0) = *param_3;
      break;
    case 0x142:
      *(bool *)(param_1 + 0xa28) = *param_3 != 0;
    }
    goto LAB_7ff70c8f4d63;
  }
  if (0x4e57 < param_2) {
    if (0x75a2 < param_2) {
      switch(param_2) {
      case 0x9d63:
        iVar7 = func_0x7ff70c8f2d50(param_1 + 0x970,*(undefined8 *)param_3);
        return iVar7;
      case 0x9d64:
        iVar7 = func_0x7ff70c8f2d50(param_1 + 0x980,*(undefined8 *)param_3);
        return iVar7;
      case 0x9d65:
        iVar7 = func_0x7ff70c8f2d50(param_1 + 0x978,*(undefined8 *)param_3);
        return iVar7;
      case 0x9d66:
        iVar7 = func_0x7ff70c8f2d50(param_1 + 0x988,*(undefined8 *)param_3);
        return iVar7;
      case 0x9d67:
        iVar7 = func_0x7ff70c8f2d50(param_1 + 0x990,*(undefined8 *)param_3);
        return iVar7;
      case 0x9d68:
      case 0x9d6a:
      case 0x9d6b:
      case 0x9d6c:
      case 0x9d6d:
      case 0x9d6e:
      case 0x9d6f:
      case 0x9d70:
      case 0x9d71:
      case 0x9d72:
      case 0x9d73:
      case 0x9d74:
code_r0x7ff70c8f4d67:
        return 0x30;
      case 0x9d69:
        iVar7 = func_0x7ff70c8f2d50(param_1 + 0x998,*(undefined8 *)param_3);
        return iVar7;
      case 0x9d75:
        cVar3 = FUN_7ff70c943d00(param_1,0x40);
        if (cVar3 == '\0') {
          return 4;
        }
        uVar11 = *(undefined8 *)param_3;
        param_1 = param_1 + 0x9a0;
        break;
      case 0x9d76:
        cVar3 = FUN_7ff70c943d00(param_1,0x40);
        if (cVar3 == '\0') {
          return 4;
        }
        uVar11 = *(undefined8 *)param_3;
        param_1 = param_1 + 0x9a8;
        break;
      default:
        switch(param_2) {
        case 0x75a3:
          lVar9 = *(longlong *)param_3;
          goto code_r0x7ff70c8f374d;
        case 0x75a4:
          lVar9 = *(longlong *)param_3;
          goto code_r0x7ff70c8f372f;
        case 0x75a5:
          lVar9 = *(longlong *)param_3;
          goto joined_r0x7ff70c8f36ce;
        case 0x75a6:
        case 0x75a7:
        case 0x75a9:
        case 0x75aa:
        case 0x75ab:
        case 0x75ac:
        case 0x75ad:
        case 0x75ae:
        case 0x75af:
        case 0x75b0:
        case 0x75b1:
        case 0x75b2:
        case 0x75b3:
        case 0x75b4:
        case 0x75b5:
        case 0x75b6:
        case 0x75b7:
        case 0x75b8:
        case 0x75b9:
        case 0x75ba:
        case 0x75bb:
        case 0x75bc:
        case 0x75bd:
        case 0x75be:
        case 0x75bf:
        case 0x75c0:
          goto code_r0x7ff70c8f4d67;
        case 0x75a8:
          lVar9 = *(longlong *)param_3;
          goto code_r0x7ff70c8f3955;
        case 0x75c1:
          if (*(longlong *)param_3 < 0) {
            return 0x2b;
          }
          *(longlong *)(param_1 + 0x328) = *(longlong *)param_3;
          break;
        case 0x75c2:
          if (*(longlong *)param_3 < 0) {
            return 0x2b;
          }
          *(longlong *)(param_1 + 0x330) = *(longlong *)param_3;
          break;
        default:
          if (param_2 != 0x763e) {
            return 0x30;
          }
          lVar9 = *(longlong *)param_3;
          goto LAB_7ff70c8f390a;
        }
        goto LAB_7ff70c8f4d63;
      }
      iVar7 = func_0x7ff70c8f2d50(param_1,uVar11);
      return iVar7;
    }
    if (param_2 < 0x4ef0) {
      if (param_2 < 0x4e8c) {
        if (param_2 == 0x4e58) {
          lVar9 = *(longlong *)param_3;
          *(longlong *)(param_1 + 600) = lVar9;
LAB_7ff70c8f3073:
          if (lVar9 == 0) {
            *(undefined1 *)(param_1 + 0xbf4) = 0;
          }
          else {
            *(undefined1 *)(param_1 + 0xbf4) = 1;
          }
        }
        else if (param_2 == 0x4e6f) {
          *(undefined8 *)(param_1 + 0x240) = *(undefined8 *)param_3;
        }
        else {
          if (param_2 != 0x4e7e) {
            return 0x30;
          }
          *(undefined8 *)(param_1 + 0x268) = *(undefined8 *)param_3;
        }
      }
      else {
        switch(param_2) {
        case 0x4ea2:
          *(undefined8 *)(param_1 + 0x270) = *(undefined8 *)param_3;
          break;
        case 0x4ea3:
        case 0x4ea4:
        case 0x4ea5:
        case 0x4ea6:
        case 0x4ea7:
        case 0x4ea8:
        case 0x4ea9:
        case 0x4eaa:
        case 0x4eab:
        case 0x4eac:
        case 0x4ead:
        case 0x4eae:
        case 0x4eaf:
        case 0x4eb0:
        case 0x4eb1:
        case 0x4eb2:
        case 0x4eb3:
        case 0x4eb5:
        case 0x4eb6:
        case 0x4eb7:
        case 0x4eb8:
        case 0x4eb9:
        case 0x4eba:
        case 0x4ebb:
        case 0x4ebc:
        case 0x4ebd:
        case 0x4ebe:
        case 0x4ebf:
        case 0x4ec0:
        case 0x4ec1:
        case 0x4ec2:
        case 0x4ec4:
        case 0x4ec5:
        case 0x4ec6:
          goto code_r0x7ff70c8f4d67;
        case 0x4eb4:
          *(undefined8 *)(param_1 + 0x278) = *(undefined8 *)param_3;
          break;
        case 0x4ec3:
          *(undefined8 *)(param_1 + 0x288) = *(undefined8 *)param_3;
          break;
        case 0x4ec7:
          *(undefined8 *)(param_1 + 0x220) = *(undefined8 *)param_3;
          break;
        default:
          if (param_2 != 0x4e8c) {
            return 0x30;
          }
          cVar3 = FUN_7ff70c943d00(param_1,8);
          if (cVar3 == '\0') {
            return 4;
          }
          *(undefined8 *)(param_1 + 0x5a0) = *(undefined8 *)param_3;
        }
      }
    }
    else {
      switch(param_2) {
      case 0x4f30:
        *(undefined8 *)(param_1 + 0x9e0) = *(undefined8 *)param_3;
        break;
      case 0x4f31:
      case 0x4f32:
      case 0x4f33:
      case 0x4f34:
      case 0x4f35:
      case 0x4f36:
      case 0x4f37:
      case 0x4f38:
      case 0x4f39:
      case 0x4f3a:
      case 0x4f3c:
      case 0x4f3d:
      case 0x4f3e:
      case 0x4f3f:
      case 0x4f40:
      case 0x4f41:
      case 0x4f42:
      case 0x4f43:
      case 0x4f44:
      case 0x4f45:
      case 0x4f46:
      case 0x4f47:
      case 0x4f48:
      case 0x4f49:
      case 0x4f4a:
      case 0x4f4b:
      case 0x4f4c:
      case 0x4f4e:
      case 0x4f50:
      case 0x4f51:
      case 0x4f52:
      case 0x4f53:
      case 0x4f54:
      case 0x4f55:
      case 0x4f56:
      case 0x4f57:
        goto code_r0x7ff70c8f4d67;
      case 0x4f3b:
        *(undefined8 *)(param_1 + 0xa18) = *(undefined8 *)param_3;
        break;
      case 0x4f4d:
        *(undefined8 *)(param_1 + 0x2d0) = *(undefined8 *)param_3;
        break;
      case 0x4f4f:
        *(undefined8 *)(param_1 + 0x2e0) = *(undefined8 *)param_3;
        break;
      case 0x4f58:
        *(undefined8 *)(param_1 + 0x2a8) = *(undefined8 *)param_3;
        break;
      default:
        if (param_2 != 0x4ef0) {
          if (param_2 != 0x4efb) {
            return 0x30;
          }
          lVar9 = *(longlong *)param_3;
          *(longlong *)(param_1 + 0x260) = lVar9;
          goto LAB_7ff70c8f3073;
        }
        *(undefined8 *)(param_1 + 0x298) = *(undefined8 *)param_3;
      }
    }
    goto LAB_7ff70c8f4d63;
  }
  switch(param_2) {
  case 0x2711:
    *(undefined8 *)(param_1 + 0x1f0) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x2712:
    if (*(char *)(param_1 + 0x12cb) == '\x01') {
      (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x1168));
      *(undefined8 *)(param_1 + 0x1168) = 0;
      *(undefined1 *)(param_1 + 0x12cb) = 0;
    }
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x7b8,*(undefined8 *)param_3);
    *(undefined8 *)(param_1 + 0x1168) = *(undefined8 *)(param_1 + 0x7b8);
    break;
  case 0x2713:
  case 0x2718:
  case 0x271b:
  case 0x271c:
  case 0x271d:
  case 0x271e:
  case 0x2721:
  case 0x2723:
  case 0x2724:
  case 0x2725:
  case 0x272b:
  case 0x272c:
  case 0x272e:
  case 0x2730:
  case 0x2731:
  case 0x2732:
  case 0x2733:
  case 0x2736:
  case 0x2737:
  case 0x2738:
  case 0x2739:
  case 0x273a:
  case 0x273b:
  case 0x273c:
  case 0x273d:
  case 0x273e:
  case 0x273f:
  case 0x2740:
  case 0x2741:
  case 0x2742:
  case 0x2743:
  case 0x2744:
  case 0x2745:
  case 0x2746:
  case 0x2747:
  case 0x2748:
  case 0x274a:
  case 0x274b:
  case 0x274c:
  case 0x274d:
  case 0x274f:
  case 0x2750:
  case 0x2752:
  case 0x2753:
  case 0x2754:
  case 0x2755:
  case 0x2756:
  case 0x2757:
  case 0x2758:
  case 0x2759:
  case 0x275a:
  case 0x275b:
  case 0x275e:
  case 0x275f:
  case 0x2760:
  case 0x2761:
  case 0x2764:
  case 0x2765:
  case 0x276a:
  case 0x276b:
  case 0x276c:
  case 0x276d:
  case 0x276e:
  case 0x2770:
  case 0x2772:
  case 0x2773:
  case 0x2775:
  case 0x2779:
  case 0x277a:
  case 0x277b:
  case 0x277c:
  case 0x277e:
  case 0x277f:
  case 0x2780:
  case 0x2781:
  case 0x2782:
  case 0x2783:
  case 0x2784:
  case 0x2785:
  case 0x2787:
  case 0x2788:
  case 0x2789:
  case 0x278a:
  case 0x278b:
  case 0x278c:
  case 0x278d:
  case 0x278e:
  case 0x278f:
  case 0x2790:
  case 0x2791:
  case 0x2792:
  case 0x2794:
  case 0x2795:
  case 0x2796:
  case 0x2798:
  case 0x2799:
  case 0x279a:
  case 0x279b:
  case 0x279c:
  case 0x279d:
  case 0x279e:
  case 0x279f:
  case 0x27a0:
  case 0x27a1:
  case 0x27a2:
  case 0x27a3:
  case 0x27a4:
  case 0x27a6:
  case 0x27a7:
  case 0x27a8:
  case 0x27a9:
  case 0x27aa:
  case 0x27ab:
  case 0x27ac:
  case 0x27ad:
  case 0x27ae:
  case 0x27af:
  case 0x27b0:
  case 0x27b1:
  case 0x27b2:
  case 0x27b3:
  case 0x27b6:
  case 0x27b7:
  case 0x27bb:
  case 0x27bc:
  case 0x27c2:
  case 0x27c4:
  case 0x27c5:
  case 0x27c6:
  case 0x27c7:
  case 0x27c8:
  case 0x27c9:
  case 0x27ca:
  case 0x27cb:
  case 0x27cc:
  case 0x27cd:
  case 0x27ce:
  case 0x27cf:
  case 0x27d0:
  case 0x27d1:
  case 0x27d2:
  case 0x27d3:
  case 0x27d4:
  case 0x27d5:
  case 0x27d6:
  case 0x27d7:
  case 0x27d8:
  case 0x27d9:
  case 0x27da:
  case 0x27dc:
  case 0x27dd:
  case 0x27de:
  case 0x27df:
  case 0x27e0:
  case 0x27e2:
  case 0x27e3:
  case 0x27e4:
  case 0x27e5:
  case 0x27e6:
  case 0x27e7:
  case 0x27e8:
  case 0x27e9:
  case 0x27ea:
  case 0x27eb:
  case 0x27ed:
  case 0x27ee:
  case 0x27ef:
  case 0x27f1:
  case 0x27f2:
  case 0x27f3:
  case 0x27f5:
  case 0x27f8:
  case 0x27f9:
  case 0x27fa:
  case 0x27fd:
  case 0x27ff:
  case 0x2802:
  case 0x2804:
  case 0x2805:
  case 0x2808:
  case 0x2809:
  case 0x280a:
  case 0x280b:
  case 0x280c:
  case 0x280d:
  case 0x2815:
  case 0x2819:
  case 0x281b:
  case 0x281c:
  case 0x281e:
  case 0x281f:
  case 0x2820:
  case 0x2822:
  case 0x2823:
  case 0x2826:
  case 0x2828:
  case 0x2829:
  case 0x282b:
  case 0x282d:
  case 0x282e:
  case 0x2830:
  case 0x2832:
  case 0x2833:
  case 0x2834:
  case 0x2835:
  case 0x2836:
  case 0x2837:
  case 0x2839:
  case 0x283b:
  case 0x283d:
  case 0x283f:
  case 0x2842:
  case 0x2843:
  case 0x2844:
  case 0x2845:
  case 0x2846:
  case 0x2847:
  case 0x2848:
  case 0x284a:
  case 0x284b:
  case 0x284c:
  case 0x284d:
  case 0x2850:
  case 0x2851:
  case 0x2852:
    goto code_r0x7ff70c8f4d67;
  case 0x2714:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x798,*(undefined8 *)param_3);
    break;
  case 0x2715:
    lVar9 = param_1 + 0x848;
    param_1 = param_1 + 0x840;
    goto code_r0x7ff70c8f436f;
  case 0x2716:
    lVar9 = param_1 + 0x860;
    param_1 = param_1 + 0x858;
code_r0x7ff70c8f436f:
    iVar7 = func_0x7ff70c8f4e90(*(undefined8 *)param_3,param_1,lVar9);
    break;
  case 0x2717:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x7a8,*(undefined8 *)param_3);
    break;
  case 0x2719:
    *(undefined8 *)(param_1 + 0x1f8) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x271a:
    *(undefined8 *)(param_1 + 0x1e8) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x271f:
    *(undefined8 *)(param_1 + 0x218) = *(undefined8 *)param_3;
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x968));
    *(undefined8 *)(param_1 + 0x968) = 0;
    *(undefined1 *)(param_1 + 0x521) = 1;
    goto LAB_7ff70c8f4d63;
  case 0x2720:
    if (*(char *)(param_1 + 0x12cc) == '\x01') {
      (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x1170));
      *(undefined8 *)(param_1 + 0x1170) = 0;
      *(undefined1 *)(param_1 + 0x12cc) = 0;
    }
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x7b0,*(undefined8 *)param_3);
    *(undefined8 *)(param_1 + 0x1170) = *(undefined8 *)(param_1 + 0x7b0);
    break;
  case 0x2722:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x810,*(undefined8 *)param_3);
    break;
  case 0x2726:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x710,*(undefined8 *)param_3);
    break;
  case 0x2727:
    *(undefined8 *)(param_1 + 0x340) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x2728:
    *(undefined8 *)(param_1 + 0x348) = *(undefined8 *)param_3;
    *(undefined1 *)(param_1 + 0x521) = 2;
    *(undefined1 *)(param_1 + 0xa36) = 0;
    uVar11 = *(undefined8 *)(param_1 + 0x1188);
    goto code_r0x7ff70c8f43f6;
  case 0x2729:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x6f0,*(undefined8 *)param_3);
    break;
  case 0x272a:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x768,*(undefined8 *)param_3);
    break;
  case 0x272d:
    *(undefined8 *)(param_1 + 0x200) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x272f:
    lVar9 = *(longlong *)param_3;
    if (lVar9 == 0) {
      FUN_7ff70c8f2cb0(*(undefined8 *)(param_1 + 0x2c0));
      *(undefined8 *)(param_1 + 0x2c0) = 0;
      if ((*(longlong *)(param_1 + 0xe8) == 0) ||
         (*(longlong *)(*(longlong *)(param_1 + 0xe8) + 0xb8) == 0)) {
        func_0x7ff70c953ed0(*(undefined8 *)(param_1 + 0xa58));
        func_0x7ff70c9537d0(*(undefined8 *)(param_1 + 0xa58));
      }
      *(undefined8 *)(param_1 + 0xa58) = 0;
    }
    else {
      uVar12 = FUN_7ff70cb12e80(lVar9);
      if (8000000 < uVar12) {
        return 0x2b;
      }
      lVar9 = FUN_7ff70c8f2b60(*(undefined8 *)(param_1 + 0x2c0),lVar9);
      if (lVar9 == 0) {
        FUN_7ff70c8f2cb0(*(undefined8 *)(param_1 + 0x2c0));
        *(undefined8 *)(param_1 + 0x2c0) = 0;
        return 0x1b;
      }
      *(longlong *)(param_1 + 0x2c0) = lVar9;
    }
    goto LAB_7ff70c8f4d63;
  case 0x2734:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x720,*(undefined8 *)param_3);
    break;
  case 0x2735:
    lVar9 = *(longlong *)param_3;
    *(longlong *)(param_1 + 0x1d8) = lVar9;
    if (lVar9 == 0) {
      uVar11 = func_0x7ff70ca9db98();
      *(undefined8 *)(param_1 + 0x1d8) = uVar11;
    }
    goto LAB_7ff70c8f4d63;
  case 0x2749:
    *(undefined8 *)(param_1 + 0x2f0) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x274e:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x730,*(undefined8 *)param_3);
    break;
  case 0x2751:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 2000,*(undefined8 *)param_3);
    break;
  case 0x275c:
  case 0x275d:
    goto LAB_7ff70c8f4d63;
  case 0x2762:
    iVar8 = func_0x7ff70c8f2cf0(param_1 + 0x718,*(undefined8 *)param_3);
    lVar9 = func_0x7ff70c951fa0(param_1,0,*(undefined8 *)(param_1 + 0xa58),
                                *(undefined1 *)(param_1 + 0xa25));
    iVar7 = 0x1b;
    if (lVar9 != 0) {
      iVar7 = iVar8;
    }
    *(longlong *)(param_1 + 0xa58) = lVar9;
    break;
  case 0x2763:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x7f0,*(undefined8 *)param_3);
    break;
  case 0x2766:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x700,*(undefined8 *)param_3);
    break;
  case 0x2767:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x758,*(undefined8 *)param_3);
    break;
  case 0x2768:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x778,*(undefined8 *)param_3);
    break;
  case 0x2769:
    pcVar1 = *(char **)param_3;
    if (pcVar1 != (char *)0x0) {
      if (*pcVar1 == '\0') {
        return 0;
      }
      iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x838,pcVar1);
      if (iVar7 == 0) {
        iVar7 = func_0x7ff70c942910(param_1,pcVar1);
        return iVar7;
      }
      return iVar7;
    }
    goto LAB_7ff70c8f4d63;
  case 0x276f:
    *(undefined8 *)(param_1 + 0x1e0) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x2771:
    cVar3 = FUN_7ff70c943d00(param_1,1);
    if (cVar3 == '\0') {
      return 4;
    }
    uVar11 = *(undefined8 *)param_3;
    param_1 = param_1 + 0x7c0;
    goto code_r0x7ff70c8f47ae;
  case 0x2774:
    piVar2 = *(int **)param_3;
    if (*(longlong *)(param_1 + 0xe8) != 0) {
      FUN_7ff70c959850(param_1,1,2);
      if (*(int *)(param_1 + 0xd0) == 2) {
        *(undefined8 *)(param_1 + 200) = 0;
        *(undefined4 *)(param_1 + 0xd0) = 0;
        lVar9 = *(longlong *)(param_1 + 0xe8);
        if (*(longlong *)(lVar9 + 0xb8) != *(longlong *)(param_1 + 0xa58))
        goto code_r0x7ff70c8f499a;
code_r0x7ff70c8f470f:
        *(undefined8 *)(param_1 + 0xa58) = 0;
        if (*(longlong *)(lVar9 + 0xc0) != *(longlong *)(param_1 + 0xa60))
        goto code_r0x7ff70c8f49ae;
code_r0x7ff70c8f472e:
        *(undefined8 *)(param_1 + 0xa60) = 0;
        if (*(longlong *)(lVar9 + 200) == *(longlong *)(param_1 + 0xc70)) {
code_r0x7ff70c8f474d:
          *(undefined8 *)(param_1 + 0xc70) = 0;
        }
      }
      else {
        lVar9 = *(longlong *)(param_1 + 0xe8);
        if (*(longlong *)(lVar9 + 0xb8) == *(longlong *)(param_1 + 0xa58))
        goto code_r0x7ff70c8f470f;
code_r0x7ff70c8f499a:
        if (*(longlong *)(lVar9 + 0xc0) == *(longlong *)(param_1 + 0xa60))
        goto code_r0x7ff70c8f472e;
code_r0x7ff70c8f49ae:
        if (*(longlong *)(lVar9 + 200) == *(longlong *)(param_1 + 0xc70)) goto code_r0x7ff70c8f474d;
      }
      *(int *)(lVar9 + 8) = *(int *)(lVar9 + 8) + -1;
      FUN_7ff70c959890(param_1,1);
      *(undefined8 *)(param_1 + 0xe8) = 0;
    }
    if ((piVar2 != (int *)0x0) && (*piVar2 == 0x7e117a1e)) {
      *(int **)(param_1 + 0xe8) = piVar2;
      FUN_7ff70c959850(param_1,1,2);
      piVar2 = (int *)(*(longlong *)(param_1 + 0xe8) + 8);
      *piVar2 = *piVar2 + 1;
      lVar9 = *(longlong *)(param_1 + 0xe8);
      if ((*(byte *)(lVar9 + 4) & 8) != 0) {
        *(longlong *)(param_1 + 200) = lVar9 + 0x88;
        *(undefined4 *)(param_1 + 0xd0) = 2;
      }
      if (*(longlong *)(lVar9 + 0xb8) != 0) {
        func_0x7ff70c9537d0(*(undefined8 *)(param_1 + 0xa58));
        lVar9 = *(longlong *)(param_1 + 0xe8);
        *(undefined8 *)(param_1 + 0xa58) = *(undefined8 *)(lVar9 + 0xb8);
      }
      if (*(longlong *)(lVar9 + 0xc0) != 0) {
        FUN_7ff70c9512c0(param_1 + 0xa60);
        lVar9 = *(longlong *)(param_1 + 0xe8);
        *(undefined8 *)(param_1 + 0xa60) = *(undefined8 *)(lVar9 + 0xc0);
      }
      if (*(longlong *)(lVar9 + 200) != 0) {
        *(undefined8 *)(param_1 + 0x6a8) = *(undefined8 *)(lVar9 + 0xd0);
        *(undefined8 *)(param_1 + 0xc70) = *(undefined8 *)(lVar9 + 200);
      }
      FUN_7ff70c959890(param_1,1);
    }
    goto LAB_7ff70c8f4d63;
  case 0x2776:
    if (*(char **)param_3 != (char *)0x0) {
      if (**(char **)param_3 != '\0') {
        iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x738);
        return iVar7;
      }
      lVar9 = func_0x7ff70c9598d0();
      if (lVar9 == 0) {
        return 0x1b;
      }
      iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x738,lVar9);
      (*_DAT_7ff70cbebad8)(lVar9);
      return iVar7;
    }
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x738));
    *(undefined8 *)(param_1 + 0x738) = 0;
    goto LAB_7ff70c8f4d63;
  case 0x2777:
    *(undefined8 *)(param_1 + 0x6c8) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x2778:
    *(undefined8 *)(param_1 + 0x6d0) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x277d:
    cVar3 = FUN_7ff70c943d00(param_1,8);
    if (cVar3 == '\0') {
      return 4;
    }
    *(undefined8 *)(param_1 + 0x5a8) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x2786:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x790,*(undefined8 *)param_3);
    break;
  case 0x2793:
    *(undefined8 *)(param_1 + 0x2f8) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x2797:
    lVar9 = *(longlong *)param_3;
    if (lVar9 != 0) {
      iVar7 = FUN_7ff70c959220(lVar9,&UNK_7ff70cb8a156);
      if (iVar7 == 0) {
        iVar7 = FUN_7ff70c959220(lVar9,&UNK_7ff70cb89a9c);
        if (iVar7 == 0) {
          iVar7 = FUN_7ff70c959220(lVar9,&UNK_7ff70cb8a237);
          if (iVar7 == 0) {
            iVar7 = FUN_7ff70c959220(lVar9,&UNK_7ff70cb8aa72);
            if (iVar7 == 0) {
              if (*(longlong *)(param_1 + 0xa58) == 0) {
                uVar11 = func_0x7ff70c951fa0(param_1,0,0,1);
                *(undefined8 *)(param_1 + 0xa58) = uVar11;
              }
              uVar12 = FUN_7ff70cb12e80(lVar9);
              if (8000000 < uVar12) {
                return 0x2b;
              }
              lVar9 = (*_DAT_7ff70cbebae8)(lVar9);
              if ((lVar9 == 0) || (*(longlong *)(param_1 + 0xa58) == 0)) {
                (*_DAT_7ff70cbebad8)(lVar9);
                return 0x1b;
              }
              FUN_7ff70c959850(param_1,2,2);
              iVar7 = FUN_7ff70c9592a0(lVar9,&UNK_7ff70cb8b0db,0xb);
              if (iVar7 == 0) {
                uVar11 = *(undefined8 *)(param_1 + 0xa58);
                lVar10 = lVar9;
              }
              else {
                uVar11 = *(undefined8 *)(param_1 + 0xa58);
                lVar10 = lVar9 + 0xb;
              }
              func_0x7ff70c952260(param_1,uVar11,iVar7 != 0,0,lVar10,(undefined1  [16])0x0,1);
              FUN_7ff70c959890(param_1,2);
              (*_DAT_7ff70cbebad8)(lVar9);
            }
            else {
              func_0x7ff70c951f00(param_1);
            }
          }
          else {
            FUN_7ff70c9541d0(param_1,0);
          }
          goto LAB_7ff70c8f4d63;
        }
        FUN_7ff70c959850(param_1,2,2);
        func_0x7ff70c953f70(*(undefined8 *)(param_1 + 0xa58));
      }
      else {
        FUN_7ff70c959850(param_1,2,2);
        func_0x7ff70c953ed0(*(undefined8 *)(param_1 + 0xa58));
      }
      FUN_7ff70c959890(param_1,2);
    }
    goto LAB_7ff70c8f4d63;
  case 0x27a5:
    *(undefined8 *)(param_1 + 0x280) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x27b4:
    *(undefined8 *)(param_1 + 0x290) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x27b5:
    lVar9 = *(longlong *)param_3;
    if (lVar9 == 0) {
      (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x968));
      *(undefined8 *)(param_1 + 0x968) = 0;
code_r0x7ff70c8f4b56:
      iVar7 = 0;
    }
    else if (*(longlong *)(param_1 + 0x228) == -1) {
      iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x968,lVar9);
    }
    else {
      iVar7 = 0x1b;
      if (-1 < *(longlong *)(param_1 + 0x228)) {
        (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x968));
        *(undefined8 *)(param_1 + 0x968) = 0;
        lVar10 = (*_DAT_7ff70cbebad0)
                           (*(longlong *)(param_1 + 0x228) +
                            (ulonglong)(*(longlong *)(param_1 + 0x228) == 0));
        iVar7 = 0x1b;
        if (lVar10 != 0) {
          if (*(longlong *)(param_1 + 0x228) != 0) {
            FUN_7ff70cb12b60(lVar10,lVar9);
          }
          *(longlong *)(param_1 + 0x968) = lVar10;
          goto code_r0x7ff70c8f4b56;
        }
      }
    }
    *(undefined8 *)(param_1 + 0x218) = *(undefined8 *)(param_1 + 0x968);
    *(undefined1 *)(param_1 + 0x521) = 1;
    break;
  case 0x27b8:
    *(undefined8 *)(param_1 + 0x2b8) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x27b9:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x818,*(undefined8 *)param_3);
    break;
  case 0x27ba:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x828,*(undefined8 *)param_3);
    break;
  case 0x27bd:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x840,*(undefined8 *)param_3);
    break;
  case 0x27be:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x848,*(undefined8 *)param_3);
    break;
  case 0x27bf:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x858,*(undefined8 *)param_3);
    break;
  case 0x27c0:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x860,*(undefined8 *)param_3);
    break;
  case 0x27c1:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x868,*(undefined8 *)param_3);
    break;
  case 0x27c3:
  case 0x27fb:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x8b0,*(undefined8 *)param_3);
    break;
  case 0x27db:
    uVar11 = *(undefined8 *)param_3;
    *(undefined8 *)(param_1 + 0x508) = uVar11;
    *(undefined8 *)(param_1 + 0x1178) = uVar11;
    goto LAB_7ff70c8f4d63;
  case 0x27e1:
    *(undefined8 *)(param_1 + 0x2a0) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x27ec:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x8f0,*(undefined8 *)param_3);
    break;
  case 0x27f0:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x850,*(undefined8 *)param_3);
    break;
  case 0x27f4:
    *(undefined8 *)(param_1 + 0x698) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x27f6:
    cVar3 = FUN_7ff70c943d00(param_1,4);
    if (cVar3 == '\0') {
      return 4;
    }
    uVar11 = *(undefined8 *)param_3;
    param_1 = param_1 + 0x7e0;
    goto code_r0x7ff70c8f47ae;
  case 0x27f7:
    *(undefined1 *)(param_1 + 0xa4b) = 0;
    goto code_r0x7ff70c8f48d7;
  case 0x27fc:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x8b8,*(undefined8 *)param_3);
    break;
  case 0x27fe:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x728,*(undefined8 *)param_3);
    break;
  case 0x2800:
  case 0x2801:
    if (*(int **)param_3 == (int *)0x0) {
      return 4;
    }
    iVar7 = 0;
    if (**(int **)param_3 == -0x3f212453) {
      return 4;
    }
    break;
  case 0x2803:
    *(undefined8 *)(param_1 + 0x510) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x2806:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x7d8,*(undefined8 *)param_3);
    break;
  case 0x2807:
    cVar3 = FUN_7ff70c943d00(param_1,1);
    if (cVar3 == '\0') {
      return 4;
    }
    uVar11 = *(undefined8 *)param_3;
    param_1 = param_1 + 0x7c8;
    goto code_r0x7ff70c8f47ae;
  case 0x280e:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x6f8,*(undefined8 *)param_3);
    break;
  case 0x280f:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x708,*(undefined8 *)param_3);
    break;
  case 0x2810:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x760,*(undefined8 *)param_3);
    break;
  case 0x2811:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x780,*(undefined8 *)param_3);
    break;
  case 0x2812:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x770,*(undefined8 *)param_3);
    break;
  case 0x2813:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x7f8,*(undefined8 *)param_3);
    break;
  case 0x2814:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x820,*(undefined8 *)param_3);
    break;
  case 0x2816:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x7a0,*(undefined8 *)param_3);
    break;
  case 0x2817:
    cVar3 = FUN_7ff70c943d00(param_1,4);
    if (cVar3 == '\0') {
      return 4;
    }
    uVar11 = *(undefined8 *)param_3;
    param_1 = param_1 + 0x7e8;
code_r0x7ff70c8f47ae:
    iVar7 = func_0x7ff70c8f2cf0(param_1,uVar11);
    break;
  case 0x2818:
    *(undefined1 *)(param_1 + 0xa4b) = 1;
code_r0x7ff70c8f48d7:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x8f8,*(undefined8 *)param_3);
    break;
  case 0x281a:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x900,*(undefined8 *)param_3);
    break;
  case 0x281d:
    iVar7 = func_0x7ff70c8fb000(param_1 + 0x350,*(undefined8 *)param_3,0);
    if (iVar7 != 0) {
      return iVar7;
    }
    *(undefined1 *)(param_1 + 0x521) = 3;
    *(undefined1 *)(param_1 + 0xa36) = 0;
    uVar11 = *(undefined8 *)(param_1 + 0x1188);
code_r0x7ff70c8f43f6:
    FUN_7ff70c8f9ca0(uVar11);
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x1188));
    *(undefined8 *)(param_1 + 0x1188) = 0;
    goto LAB_7ff70c8f4d63;
  case 0x2821:
    *(undefined8 *)(param_1 + 0x9e8) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x2824:
    cVar3 = FUN_7ff70c943d00(param_1,0x20);
    if (cVar3 == '\0') {
      return 4;
    }
    uVar11 = *(undefined8 *)param_3;
    param_1 = param_1 + 0x800;
    goto code_r0x7ff70c8f48af;
  case 0x2825:
    cVar3 = FUN_7ff70c943d00(param_1,0x20);
    if (cVar3 == '\0') {
      return 4;
    }
    uVar11 = *(undefined8 *)param_3;
    param_1 = param_1 + 0x808;
code_r0x7ff70c8f48af:
    iVar7 = func_0x7ff70c8f2cf0(param_1,uVar11);
    break;
  case 0x2827:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x908,*(undefined8 *)param_3);
    *(bool *)(param_1 + 0xa4d) = *(longlong *)(param_1 + 0x908) != 0;
    break;
  case 0x282a:
    *(undefined8 *)(param_1 + 0xa08) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x282c:
    *(undefined8 *)(param_1 + 0xa10) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x282f:
    if (*(longlong *)(param_1 + 0xa68) == 0) {
      lVar9 = func_0x7ff70c950050();
      *(longlong *)(param_1 + 0xa68) = lVar9;
      if (lVar9 == 0) {
        return 0x1b;
      }
    }
    lVar9 = *(longlong *)param_3;
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x910,lVar9);
    if (iVar7 != 0) {
      return iVar7;
    }
    if (lVar9 != 0) {
      func_0x7ff70c950090(*(undefined8 *)(param_1 + 0xa68),lVar9);
    }
    goto LAB_7ff70c8f4d63;
  case 0x2831:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x920,*(undefined8 *)param_3);
    break;
  case 0x2838:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x830,*(undefined8 *)param_3);
    break;
  case 0x283a:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x948,*(undefined8 *)param_3);
    break;
  case 0x283c:
    if (*(longlong *)(param_1 + 0xa60) == 0) {
      lVar9 = func_0x7ff70c951290();
      *(longlong *)(param_1 + 0xa60) = lVar9;
      if (lVar9 == 0) {
        return 0x1b;
      }
    }
    lVar9 = *(longlong *)param_3;
    if (lVar9 == 0) {
      FUN_7ff70c8f2cb0(*(undefined8 *)(param_1 + 0x2c8));
      *(undefined8 *)(param_1 + 0x2c8) = 0;
      if ((*(longlong *)(param_1 + 0xe8) == 0) ||
         (*(longlong *)(*(longlong *)(param_1 + 0xe8) + 0xc0) == 0)) goto code_r0x7ff70c8f4c41;
    }
    else {
      iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x918,lVar9);
      if (iVar7 != 0) {
        return iVar7;
      }
      lVar9 = FUN_7ff70c8f2b60(*(undefined8 *)(param_1 + 0x2c8),lVar9);
      if (lVar9 == 0) {
        FUN_7ff70c8f2cb0(*(undefined8 *)(param_1 + 0x2c8));
        *(undefined8 *)(param_1 + 0x2c8) = 0;
        return 0x1b;
      }
      *(longlong *)(param_1 + 0x2c8) = lVar9;
    }
    goto LAB_7ff70c8f4d63;
  case 0x283e:
    *(undefined8 *)(param_1 + 0x2d8) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x2840:
    *(undefined8 *)(param_1 + 0x2e8) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x2841:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x950,*(undefined8 *)param_3);
    if (*(longlong *)(param_1 + 0x950) != 0) {
      *(undefined4 *)(param_1 + 0x20c) = 0x80;
    }
    break;
  case 0x2849:
    *(undefined8 *)(param_1 + 0x2b0) = *(undefined8 *)param_3;
    goto LAB_7ff70c8f4d63;
  case 0x284e:
    iVar7 = func_0x7ff70c8f4f70(*(undefined8 *)param_3,&uStack_1c);
    if (iVar7 != 0) {
      return iVar7;
    }
    *(undefined4 *)(param_1 + 0x9b4) = uStack_1c;
    goto LAB_7ff70c8f4d63;
  case 0x284f:
    iVar7 = func_0x7ff70c8f4f70(*(undefined8 *)param_3,&uStack_20);
    if (iVar7 != 0) {
      return iVar7;
    }
    *(undefined4 *)(param_1 + 0x9b8) = uStack_20;
    goto LAB_7ff70c8f4d63;
  case 0x2853:
    iVar7 = func_0x7ff70c8f2cf0(param_1 + 0x958,*(undefined8 *)param_3);
    *(undefined1 *)(param_1 + 0xa4a) = 1;
    break;
  default:
    if (param_2 == 0x4e2b) {
      lVar9 = *(longlong *)param_3;
      if (*(longlong *)param_3 == 0) {
        lVar9 = _DAT_7ff70cb96448;
      }
      *(longlong *)(param_1 + 0x238) = lVar9;
    }
    else {
      if (param_2 != 0x4e2c) {
        return 0x30;
      }
      lVar9 = *(longlong *)param_3;
      *(longlong *)(param_1 + 0x250) = lVar9;
      if (lVar9 == 0) {
        *(undefined1 *)(param_1 + 0xa23) = 0;
        *(undefined8 *)(param_1 + 0x250) = _DAT_7ff70cb96428;
      }
      else {
        *(undefined1 *)(param_1 + 0xa23) = 1;
      }
    }
LAB_7ff70c8f4d63:
    iVar7 = 0;
  }
code_r0x7ff70c8f4d67:
  return iVar7;
}


