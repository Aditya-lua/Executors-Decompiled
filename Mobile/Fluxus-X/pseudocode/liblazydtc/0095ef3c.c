/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095ef3c
 */

int FUN_0095ef3c(long param_1,undefined1 *param_2)

{
  ushort *puVar1;
  ulong uVar2;
  ulong uVar3;
  ushort *puVar4;
  uint uVar5;
  long lVar6;
  socklen_t sVar7;
  int iVar8;
  int iVar9;
  long lVar10;
  time_t tVar11;
  undefined4 *puVar12;
  undefined8 uVar13;
  ssize_t sVar14;
  void *pvVar15;
  size_t sVar16;
  long lVar17;
  char *pcVar18;
  long lVar19;
  ushort *puVar20;
  int *piVar21;
  long lVar22;
  ulong uVar23;
  socklen_t local_174;
  sockaddr asStack_170 [17];
  
  lVar6 = tpidr_el0;
  lVar19 = *(long *)(lVar6 + 0x28);
  piVar21 = *(int **)(*(long *)(param_1 + 0x20) + 0x428);
  lVar10 = FUN_009086d4(*(undefined8 *)(piVar21 + 4),0,*piVar21 == 0);
  if (lVar10 < 0) {
    piVar21[2] = -99;
    *piVar21 = 3;
LAB_0095efdc:
    *param_2 = 0;
    iVar8 = FUN_0093456c(piVar21[6],0xffffffff,0xffffffff,0);
    iVar9 = 0;
    if (iVar8 == 0) goto LAB_0095f440;
    if (iVar8 == -1) {
      puVar12 = (undefined4 *)__errno();
      uVar13 = FUN_00941a94(*puVar12,asStack_170,0x100);
      FUN_00904b80(param_1,&DAT_002b6c62,uVar13);
      iVar9 = 0;
      piVar21[3] = 5;
      goto LAB_0095f440;
    }
    lVar10 = *(long *)(*(long *)(param_1 + 0x20) + 0x428);
    local_174 = 0x80;
    sVar14 = recvfrom(*(int *)(lVar10 + 0x18),*(void **)(lVar10 + 0x148),
                      (long)*(int *)(lVar10 + 0x13c) + 4,0,asStack_170,&local_174);
    sVar7 = local_174;
    iVar9 = (int)sVar14;
    *(int *)(lVar10 + 0x134) = iVar9;
    if (*(int *)(lVar10 + 0x130) == 0) {
      memcpy((void *)(lVar10 + 0xb0),asStack_170,(ulong)local_174);
      iVar9 = *(int *)(lVar10 + 0x134);
      *(socklen_t *)(lVar10 + 0x130) = sVar7;
      if (iVar9 < 4) goto LAB_0095f080;
LAB_0095f0c0:
      puVar20 = *(ushort **)(lVar10 + 0x148);
      uVar5 = (uint)(*puVar20 >> 8) | (*puVar20 & 0xff00ff) << 8;
      *(uint *)(lVar10 + 0xc) = uVar5;
      switch(uVar5) {
      case 3:
        if ((4 < iVar9) &&
           ((ushort)(*(short *)(lVar10 + 0x144) + 1U) == (ushort)(puVar20[1] >> 8 | puVar20[1] << 8)
           )) {
          iVar9 = FUN_00934dd0(param_1,1,puVar20 + 2,(long)(iVar9 + -4));
          if (iVar9 != 0) {
            FUN_0095f758(lVar10,5);
            goto LAB_0095f440;
          }
        }
        break;
      case 4:
        break;
      case 5:
        puVar1 = puVar20 + 2;
        uVar23 = (ulong)(iVar9 + -4);
        *(uint *)(lVar10 + 8) = (uint)CONCAT11((char)puVar20[1],*(undefined1 *)((long)puVar20 + 3));
        pvVar15 = memchr(puVar1,0,uVar23);
        uVar3 = uVar23;
        if (pvVar15 != (void *)0x0) {
          uVar3 = (long)pvVar15 - (long)puVar1;
        }
        if (((uVar3 < uVar23) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
           ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
        {
          FUN_00904c98(param_1,"TFTP error: %s",puVar1);
        }
        break;
      case 6:
        lVar22 = *(long *)(lVar10 + 0x10);
        *(undefined4 *)(lVar10 + 0x13c) = 0x200;
        puVar1 = (ushort *)((long)(puVar20 + 1) + (long)(iVar9 + -2));
        puVar20 = puVar20 + 1;
        do {
          uVar23 = (long)puVar1 - (long)puVar20;
          pvVar15 = memchr(puVar20,0,uVar23);
          uVar3 = uVar23;
          if (pvVar15 != (void *)0x0) {
            uVar3 = (long)pvVar15 - (long)puVar20;
          }
          uVar2 = uVar3 + 1;
          sVar16 = uVar23 - uVar2;
          if (uVar23 < uVar2 || sVar16 == 0) {
LAB_0095f474:
            pcVar18 = "Malformed ACK packet, rejecting";
LAB_0095f47c:
            FUN_00904b80(lVar22,pcVar18);
LAB_0095f4e4:
            iVar9 = 0x47;
            goto LAB_0095f440;
          }
          pvVar15 = memchr((void *)((long)puVar20 + uVar2),0,sVar16);
          if (pvVar15 != (void *)0x0) {
            sVar16 = (long)pvVar15 - (long)((long)puVar20 + uVar2);
          }
          uVar3 = uVar3 + sVar16 + 2;
          if (uVar23 < uVar3) goto LAB_0095f474;
          sVar16 = strlen((char *)puVar20);
          puVar4 = (ushort *)((long)puVar20 + uVar3);
          if (puVar4 == (ushort *)0x0) goto LAB_0095f474;
          pcVar18 = (char *)((long)puVar20 + sVar16 + 1);
          if (((lVar22 != 0) && ((*(byte *)(lVar22 + 0xa85) >> 4 & 1) != 0)) &&
             ((*(long *)(lVar22 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(lVar22 + 0x12a0) + 8)))))
          {
            FUN_00904c98(lVar22,"got option=(%s) value=(%s)",puVar20,pcVar18);
          }
          iVar9 = curl_strnequal(puVar20,"blksize",7);
          if (iVar9 != 0) {
            lVar17 = strtol(pcVar18,(char **)0x0,10);
            if (lVar17 == 0) {
              pcVar18 = "invalid blocksize value in OACK packet";
              goto LAB_0095f47c;
            }
            if (lVar17 < 0xffb9) {
              if (7 < lVar17) {
                if (*(int *)(lVar10 + 0x140) < lVar17) {
                  FUN_00904b80(lVar22,"%s (%ld)","server requested blksize larger than allocated");
                  goto LAB_0095f4e4;
                }
                *(int *)(lVar10 + 0x13c) = (int)lVar17;
                if (((lVar22 != 0) && ((*(byte *)(lVar22 + 0xa85) >> 4 & 1) != 0)) &&
                   ((*(long *)(lVar22 + 0x12a0) == 0 ||
                    (0 < *(int *)(*(long *)(lVar22 + 0x12a0) + 8))))) {
                  FUN_00904c98(lVar22,"%s (%d) %s (%d)","blksize parsed from OACK",lVar17,
                               "requested");
                }
                goto LAB_0095f3b8;
              }
              pcVar18 = "blksize is smaller than min supported";
              uVar13 = 8;
            }
            else {
              pcVar18 = "blksize is larger than max supported";
              uVar13 = 0xffb8;
            }
            FUN_00904b80(lVar22,"%s (%d)",pcVar18,uVar13);
            goto LAB_0095f4e4;
          }
          iVar9 = curl_strnequal(puVar20,"tsize",5);
          if (iVar9 != 0) {
            lVar17 = strtol(pcVar18,(char **)0x0,10);
            if (((lVar22 != 0) && ((*(byte *)(lVar22 + 0xa85) >> 4 & 1) != 0)) &&
               ((*(long *)(lVar22 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(lVar22 + 0x12a0) + 8))))
               ) {
              FUN_00904c98(lVar22,"%s (%ld)","tsize parsed from OACK",lVar17);
            }
            if ((*(byte *)(lVar22 + 0x131e) >> 1 & 1) == 0) {
              if (lVar17 == 0) {
                FUN_00904b80(lVar22,"invalid tsize -:%s:- value in OACK packet",pcVar18);
                goto LAB_0095f4e4;
              }
              FUN_00931c24(lVar22,lVar17);
            }
          }
LAB_0095f3b8:
          puVar20 = puVar4;
        } while (puVar4 < puVar1);
        break;
      default:
        FUN_00904b80(param_1,&DAT_002b6c62,"Internal error: Unexpected packet");
      }
      iVar9 = FUN_009314dc(param_1);
      if (iVar9 != 0) {
        FUN_0095f758(lVar10,5);
        iVar9 = 0x2a;
        goto LAB_0095f440;
      }
    }
    else {
      if (3 < iVar9) goto LAB_0095f0c0;
LAB_0095f080:
      FUN_00904b80(param_1,"Received too short packet");
      *(undefined4 *)(lVar10 + 0xc) = 7;
    }
    iVar9 = piVar21[3];
  }
  else {
    tVar11 = time((time_t *)0x0);
    if (tVar11 <= *(long *)(piVar21 + 10) + (long)piVar21[8]) goto LAB_0095efdc;
    tVar11 = time((time_t *)0x0);
    *(time_t *)(piVar21 + 10) = tVar11;
    *param_2 = 0;
    iVar9 = 7;
  }
  iVar9 = FUN_0095f758(piVar21,iVar9);
  if ((iVar9 == 0) && (iVar8 = *piVar21, *param_2 = iVar8 == 3, iVar8 == 3)) {
    FUN_00943194(param_1);
    iVar9 = 0;
  }
LAB_0095f440:
  if (*(long *)(lVar6 + 0x28) != lVar19) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar9;
}

