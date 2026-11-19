/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094299c
 */

void FUN_0094299c(long param_1,long param_2,int param_3)

{
  undefined *puVar1;
  byte bVar2;
  long lVar3;
  bool bVar4;
  bool bVar5;
  char *pcVar6;
  bool bVar7;
  int iVar8;
  long lVar9;
  undefined8 uVar10;
  uint uVar11;
  undefined8 *puVar12;
  undefined8 local_80;
  char *local_78;
  long local_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  local_70 = param_2;
  if (param_3 == 1) {
    bVar5 = false;
    goto LAB_00942b50;
  }
  *(int *)(param_1 + 0xcd0) = *(int *)(param_1 + 0xcd0) + 1;
  if (param_3 != 2) {
    bVar5 = false;
    if (param_3 != 3) {
LAB_00942b50:
      if (*(int *)(param_1 + 0x124) == 0x191) {
        bVar7 = false;
      }
      else {
        bVar7 = false;
        if (*(int *)(param_1 + 0x124) != 0x197) {
          lVar9 = FUN_00960bb4(local_70,0,0,0);
          bVar7 = lVar9 != 0;
        }
      }
      uVar10 = *(undefined8 *)(param_1 + 0x1170);
      if (param_3 != 1) {
        if (param_3 != 3) goto LAB_00942bb4;
        uVar11 = 0x880;
        goto LAB_00942bb8;
      }
      uVar11 = 8;
      bVar4 = true;
      goto LAB_00942bdc;
    }
    if ((*(long *)(param_1 + 0x200) != -1) &&
       (*(long *)(param_1 + 0x200) <= *(long *)(param_1 + 0xcc8))) {
      param_3 = 1;
      bVar5 = true;
      goto LAB_00942b50;
    }
    *(long *)(param_1 + 0xcc8) = *(long *)(param_1 + 0xcc8) + 1;
    if ((*(byte *)(param_1 + 0xa85) >> 2 & 1) == 0) {
LAB_00942b4c:
      bVar5 = false;
      param_3 = 3;
      goto LAB_00942b50;
    }
    local_78 = (char *)0x0;
    if (*(char *)(param_1 + 0x131d) < '\0') {
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x11c0),param_2,param_2);
      *(undefined8 *)(param_1 + 0x11c0) = 0;
      *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) & 0xffff7fff;
    }
    lVar9 = curl_url();
    if (lVar9 != 0) {
      iVar8 = curl_url_set(lVar9,0,*(undefined8 *)(param_1 + 0x11b8),0);
      if ((((iVar8 == 0) && (iVar8 = curl_url_set(lVar9,9,0,0), iVar8 == 0)) &&
          (iVar8 = curl_url_set(lVar9,2,0,0), iVar8 == 0)) &&
         (iVar8 = curl_url_set(lVar9,3,0,0), iVar8 == 0)) {
        iVar8 = curl_url_get(lVar9,0,&local_78,0);
      }
      curl_url_cleanup(lVar9);
      if ((iVar8 == 0) && (local_78 != (char *)0x0)) {
        *(char **)(param_1 + 0x11c0) = local_78;
        *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) | 0x8000;
        goto LAB_00942b4c;
      }
    }
LAB_00942c10:
    uVar10 = 0x1b;
    goto LAB_00942fd8;
  }
  uVar10 = *(undefined8 *)(param_1 + 0x1170);
  bVar5 = false;
  bVar7 = false;
LAB_00942bb4:
  uVar11 = 0x800;
LAB_00942bb8:
  bVar4 = false;
  uVar11 = (uint)((ulong)*(undefined8 *)(param_1 + 0xa82) >> 0x25) & 0x10 | uVar11;
LAB_00942bdc:
  puVar12 = (undefined8 *)(param_1 + 0x1170);
  iVar8 = curl_url_set(uVar10,0,local_70,uVar11);
  if (iVar8 == 0) {
    iVar8 = curl_url_get(*puVar12,0,&local_70,0);
    if (iVar8 != 0) {
      uVar10 = FUN_00946f8c();
      goto LAB_00942fd8;
    }
    if ((param_3 != 1) && (((uint)*(undefined8 *)(param_1 + 0xa82) >> 0x17 & 1) == 0)) {
      uVar11 = (uint)*(ushort *)(param_1 + 0x1e8);
      if ((*(ushort *)(param_1 + 0x1e8) == 0) || ((*(byte *)(param_1 + 0x131c) >> 4 & 1) == 0)) {
        iVar8 = curl_url_get(*puVar12,6,&local_78,1);
        pcVar6 = local_78;
        if (iVar8 == 0) {
          uVar11 = atoi(local_78);
          (*(code *)PTR_free_00cc4678)(pcVar6);
          goto LAB_00942cc8;
        }
LAB_00942cf0:
        (*(code *)PTR_free_00cc4678)(local_70);
        uVar10 = FUN_00946f8c(iVar8);
        goto LAB_00942fd8;
      }
LAB_00942cc8:
      if (uVar11 == *(uint *)(param_1 + 0x13e0)) {
        iVar8 = curl_url_get(*puVar12,1,&local_80,0);
        if (iVar8 != 0) goto LAB_00942cf0;
        lVar9 = FUN_00946e30(local_80);
        if ((lVar9 == 0) || (*(int *)(lVar9 + 0x8c) == *(int *)(param_1 + 0x13f0))) {
          (*(code *)PTR_free_00cc4678)(local_80);
          goto joined_r0x00942fac;
        }
        if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
           ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
        {
          FUN_00904c98(param_1,"Clear auth, redirects scheme from %s to %s",
                       *(undefined8 *)(param_1 + 0x13e8),local_80);
        }
        (*(code *)PTR_free_00cc4678)(local_80);
      }
      else if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
              ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))
              )) {
        FUN_00904c98(param_1,"Clear auth, redirects to port from %u to %u",
                     *(uint *)(param_1 + 0x13e0),uVar11);
      }
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12f0));
      *(undefined8 *)(param_1 + 0x12f0) = 0;
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x12f8));
      *(undefined8 *)(param_1 + 0x12f8) = 0;
    }
joined_r0x00942fac:
    if (!bVar4) {
      uVar11 = *(uint *)(param_1 + 0x131c);
      if (bVar7) {
        uVar11 = uVar11 & 0xffffffef;
        *(uint *)(param_1 + 0x131c) = uVar11;
      }
      if ((uVar11 >> 0xe & 1) != 0) {
        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x11b8));
        uVar11 = *(uint *)(param_1 + 0x131c);
        *(undefined8 *)(param_1 + 0x11b8) = 0;
      }
      *(long *)(param_1 + 0x11b8) = local_70;
      *(uint *)(param_1 + 0x131c) = uVar11 | 0x4000;
      FUN_00932728(param_1 + 0xd8,param_1);
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"Issue another request to this URL: \'%s\'",
                     *(undefined8 *)(param_1 + 0x11b8));
      }
      iVar8 = *(int *)(param_1 + 0x1328);
      if (iVar8 == 0x12f) {
        uVar11 = (uint)*(byte *)(param_1 + 0x131a);
        if (uVar11 - 1 < 3) {
          if ((*(byte *)(param_1 + 0xa68) >> 2 & 1) == 0) goto LAB_00942ed0;
        }
        else if (uVar11 != 0) {
LAB_00942ed0:
          *(byte *)(param_1 + 0x131a) = 0;
          if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
             ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))
             ) {
            puVar1 = &DAT_002d7152;
            if ((*(uint *)(param_1 + 0x1b1) & 0x8000) != 0) {
              puVar1 = &DAT_002bce54;
            }
            FUN_00904c98(param_1,"Switch to %s",puVar1);
          }
        }
      }
      else if (iVar8 == 0x12e) {
        if (*(byte *)(param_1 + 0x131a) - 1 < 3) {
          bVar2 = *(byte *)(param_1 + 0xa68) >> 1;
          goto joined_r0x00942e88;
        }
      }
      else if ((iVar8 == 0x12d) && (*(byte *)(param_1 + 0x131a) - 1 < 3)) {
        bVar2 = *(byte *)(param_1 + 0xa68);
joined_r0x00942e88:
        if ((bVar2 & 1) == 0) {
          if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
             ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))
             ) {
            FUN_00904c98(param_1,"Switch from POST to GET");
          }
          *(undefined1 *)(param_1 + 0x131a) = 0;
          FUN_00935430(param_1,0);
        }
      }
      FUN_00931d94(param_1,0xb);
      FUN_00931c0c(param_1);
      uVar10 = 0;
      goto LAB_00942fd8;
    }
  }
  else {
    if (!bVar4) {
      uVar10 = curl_url_strerror(iVar8);
      FUN_00904b80(param_1,"The redirect target URL could not be parsed: %s",uVar10);
      uVar10 = FUN_00946f8c(iVar8);
      goto LAB_00942fd8;
    }
    local_70 = (*(code *)PTR_strdup_00cc4688)(local_70);
    if (local_70 == 0) goto LAB_00942c10;
  }
  uVar10 = 0;
  *(long *)(param_1 + 0x1368) = local_70;
  if (bVar5) {
    FUN_00904b80(param_1,"Maximum (%ld) redirects followed",*(undefined8 *)(param_1 + 0x200));
    uVar10 = 0x2f;
  }
LAB_00942fd8:
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar10);
  }
  return;
}

