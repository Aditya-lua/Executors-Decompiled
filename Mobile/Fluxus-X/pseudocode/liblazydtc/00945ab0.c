/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00945ab0
 */

int FUN_00945ab0(long *param_1,long param_2,byte param_3,undefined4 *param_4)

{
  long lVar1;
  ushort uVar2;
  int iVar3;
  ulong uVar4;
  size_t sVar5;
  char *__s;
  long lVar6;
  long lVar7;
  undefined4 uVar8;
  long lVar9;
  undefined4 uVar10;
  undefined1 auStack_b0 [28];
  int local_94;
  undefined1 auStack_90 [8];
  undefined8 local_88;
  undefined1 auStack_80 [24];
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  lVar7 = *(long *)(param_2 + 0x798);
  lVar9 = *(long *)(param_2 + 0x20);
  if (lVar7 == 0) {
    lVar7 = *(long *)*param_1;
  }
  lVar6 = *(long *)(param_2 + 0x918);
  FUN_00907b8c(param_2,0,&local_88,auStack_90,&local_94);
  FUN_00925214(auStack_b0);
  FUN_00925214(auStack_80);
  uVar2 = *(ushort *)((long)param_1 + 0x1a) & *(ushort *)(param_1 + 3);
  *(undefined2 *)((long)param_1 + 0x1c) = 0;
  *(byte *)((long)param_1 + 0x1e) = *(byte *)((long)param_1 + 0x1e) & 0xfb | (param_3 & 1) << 2;
  *param_4 = 0;
  if (((uVar2 >> 5 & 1) == 0) || (**(char **)(lVar9 + 0x1d0) != '\0')) {
    if (*(long *)(param_2 + 0x12f0) == 0) {
      iVar3 = 0;
      goto LAB_00945e50;
    }
    if (((uVar2 >> 3 & 1) == 0) || (uVar4 = FUN_00963d90(), (uVar4 & 1) == 0)) {
      if ((uVar2 >> 2 & 1) == 0) {
        if (((uVar2 >> 6 & 1) == 0) || (uVar4 = FUN_00966eb8(), (uVar4 & 1) == 0)) {
          if ((lVar6 == 0) || ((uVar2 >> 8 & 1) == 0)) {
            if ((lVar6 == 0) || ((uVar2 >> 7 & 1) == 0)) {
              if ((uVar2 >> 1 & 1) == 0) {
                iVar3 = 0;
                if ((uVar2 & 1) == 0) goto LAB_00945e50;
                *(undefined2 *)((long)param_1 + 0x1c) = 1;
                if (((param_3 & 1) != 0) || ((*(byte *)(param_2 + 0xa86) >> 5 & 1) != 0)) {
                  FUN_00963bb4(*(undefined8 *)(lVar9 + 0x1c8),auStack_80);
                }
                uVar8 = 2;
                uVar10 = 3;
                __s = "LOGIN";
              }
              else {
                *(undefined2 *)((long)param_1 + 0x1c) = 2;
                if (((param_3 & 1) != 0) || ((*(byte *)(param_2 + 0xa86) >> 5 & 1) != 0)) {
                  iVar3 = FUN_00963a84(*(undefined8 *)(lVar9 + 0x1e0),*(undefined8 *)(lVar9 + 0x1c8)
                                       ,*(undefined8 *)(lVar9 + 0x1d0),auStack_80);
                  __s = "PLAIN";
                  uVar10 = 0x11;
                  uVar8 = 1;
                  goto joined_r0x00945d54;
                }
                uVar8 = 1;
                uVar10 = 0x11;
                __s = "PLAIN";
              }
            }
            else {
              *(undefined2 *)((long)param_1 + 0x1c) = 0x80;
              if (((param_3 & 1) != 0) || ((*(byte *)(param_2 + 0xa86) >> 5 & 1) != 0)) {
                iVar3 = FUN_009678ac(*(undefined8 *)(lVar9 + 0x1c8),lVar6,auStack_80);
                __s = "XOAUTH2";
                uVar10 = 0x11;
                goto joined_r0x00945d54;
              }
              uVar8 = 0xd;
              uVar10 = 0x11;
              __s = "XOAUTH2";
            }
          }
          else {
            *(undefined2 *)((long)param_1 + 0x1c) = 0x100;
            if (((param_3 & 1) != 0) || ((*(byte *)(param_2 + 0xa86) >> 5 & 1) != 0)) {
              iVar3 = FUN_0096781c(*(undefined8 *)(lVar9 + 0x1c8),local_88,(long)local_94,lVar6,
                                   auStack_80);
              __s = "OAUTHBEARER";
              uVar10 = 0xe;
joined_r0x00945d54:
              uVar8 = 0xd;
              goto joined_r0x00945d54;
            }
            uVar8 = 0xd;
            uVar10 = 0xe;
            __s = "OAUTHBEARER";
          }
        }
        else {
          *(undefined2 *)((long)param_1 + 0x1c) = 0x40;
          if (((param_3 & 1) == 0) && ((*(byte *)(param_2 + 0xa86) >> 5 & 1) == 0)) {
            uVar8 = 8;
            uVar10 = 9;
            __s = "NTLM";
          }
          else {
            iVar3 = FUN_009670b4(param_2,*(undefined8 *)(lVar9 + 0x1c8),
                                 *(undefined8 *)(lVar9 + 0x1d0),lVar7,local_88,lVar9 + 0x3f8,
                                 auStack_80);
            __s = "NTLM";
            uVar10 = 9;
            uVar8 = 8;
joined_r0x00945d54:
            if (iVar3 != 0) goto LAB_00945e50;
          }
        }
      }
      else {
        uVar8 = 5;
        uVar10 = 0x11;
        *(undefined2 *)((long)param_1 + 0x1c) = 4;
        __s = "CRAM-MD5";
      }
    }
    else {
      uVar8 = 6;
      uVar10 = 0x11;
      *(undefined2 *)((long)param_1 + 0x1c) = 8;
      __s = "DIGEST-MD5";
    }
  }
  else {
    *(undefined2 *)((long)param_1 + 0x1c) = 0x20;
    if (((param_3 & 1) != 0) || ((*(byte *)(param_2 + 0xa86) >> 5 & 1) != 0)) {
      FUN_00963be8(*(undefined8 *)(lVar9 + 0x1c8),auStack_80);
    }
    uVar8 = 4;
    uVar10 = 0x11;
    __s = "EXTERNAL";
  }
  param_1[2] = (long)__s;
  lVar7 = FUN_009252a8(auStack_80);
  if (lVar7 == 0) {
    iVar3 = 0;
  }
  else {
    iVar3 = FUN_00945e90(param_1,auStack_80);
  }
  if (*(long *)(*param_1 + 0x28) != 0) {
    sVar5 = strlen(__s);
    lVar7 = FUN_009252b0(auStack_80);
    if (*(ulong *)(*param_1 + 0x28) < lVar7 + sVar5) {
      FUN_00925220(auStack_80);
    }
  }
  if ((iVar3 == 0) && (iVar3 = (**(code **)(*param_1 + 8))(param_2,__s,auStack_80), iVar3 == 0)) {
    *param_4 = 1;
    lVar7 = FUN_009252a8(auStack_80);
    if (lVar7 != 0) {
      uVar8 = uVar10;
    }
    *(undefined4 *)(param_1 + 1) = uVar8;
  }
LAB_00945e50:
  FUN_00925220(auStack_80);
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

