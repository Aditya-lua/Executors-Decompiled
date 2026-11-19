/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00921204
 */

int FUN_00921204(undefined8 param_1,undefined8 param_2,long *param_3,undefined8 param_4)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  long *plVar8;
  int iVar9;
  char *__s1;
  
  FUN_00925eb8(param_2);
  if (param_3 == (long *)0x0) {
    iVar1 = 0;
  }
  else {
    lVar2 = curl_mime_init(param_1);
    if (lVar2 == 0) {
LAB_0092152c:
      iVar1 = 0x1b;
    }
    else {
      iVar1 = curl_mime_subparts(param_2,lVar2);
      iVar9 = iVar1;
      if (iVar1 == 0) {
        do {
          lVar5 = lVar2;
          iVar1 = iVar9;
          if (param_3[9] != 0) {
            lVar3 = curl_mime_addpart(lVar2);
            iVar1 = 0x1b;
            if (lVar3 != 0) {
              iVar1 = iVar9;
            }
            if (iVar1 != 0) goto LAB_00921530;
            lVar5 = param_3[1];
            if ((lVar5 == 0) || (param_3[2] == 0)) {
              iVar1 = curl_mime_name(lVar3,lVar5);
            }
            else {
              lVar5 = FUN_00941948(lVar5);
              if (lVar5 == 0) goto LAB_0092152c;
              iVar1 = curl_mime_name(lVar3,lVar5);
              (*(code *)PTR_free_00cc4678)(lVar5);
            }
            if (iVar1 != 0) goto LAB_00921530;
            lVar5 = curl_mime_init(param_1);
            if (lVar5 == 0) goto LAB_0092152c;
            iVar1 = curl_mime_subparts(lVar3,lVar5);
          }
          if (iVar1 == 0) {
            plVar8 = param_3;
            do {
              lVar3 = curl_mime_addpart(lVar5);
              if (lVar3 == 0) {
                iVar1 = 0x1b;
                break;
              }
              iVar1 = curl_mime_headers(lVar3,plVar8[8],0);
              if ((iVar1 != 0) || ((plVar8[7] != 0 && (iVar1 = curl_mime_type(lVar3), iVar1 != 0))))
              goto LAB_00921530;
              if (param_3[9] == 0) {
                lVar6 = param_3[1];
                if ((lVar6 == 0) || (param_3[2] == 0)) {
                  iVar1 = curl_mime_name(lVar3,lVar6);
                }
                else {
                  lVar6 = FUN_00941948(lVar6);
                  if (lVar6 == 0) goto LAB_0092152c;
                  iVar1 = curl_mime_name(lVar3,lVar6);
                  (*(code *)PTR_free_00cc4678)(lVar6);
                }
                if (iVar1 != 0) goto LAB_00921530;
              }
              uVar7 = param_3[10];
              lVar6 = 0x20;
              if ((uVar7 & 0x80) != 0) {
                lVar6 = 0x68;
              }
              if ((uVar7 & 3) == 0) {
                if (((uint)uVar7 >> 4 & 1) == 0) {
                  lVar6 = *(long *)((long)param_3 + lVar6);
                  if (lVar6 == 0) {
                    lVar6 = -1;
                  }
                  if (((uint)uVar7 >> 6 & 1) != 0) {
                    iVar1 = curl_mime_data_cb(lVar3,lVar6,param_4,0,0,param_3[0xc]);
                    if (iVar1 == 0) goto LAB_00921444;
                    goto LAB_00921530;
                  }
                  lVar4 = param_3[3];
                }
                else {
                  lVar4 = param_3[5];
                  lVar6 = param_3[6];
                  if (lVar6 == 0) {
                    lVar6 = -1;
                  }
                }
                iVar1 = curl_mime_data(lVar3,lVar4,lVar6);
joined_r0x009214f4:
                if (iVar1 != 0) goto LAB_00921530;
              }
              else {
                __s1 = (char *)plVar8[3];
                iVar1 = strcmp(__s1,"-");
                if (iVar1 == 0) {
                  iVar1 = curl_mime_data_cb(lVar3,0xffffffffffffffff,fread,&LAB_009215f8,0,&__sF);
                }
                else {
                  iVar1 = curl_mime_filedata(lVar3,__s1);
                }
                if (iVar1 != 0) goto LAB_00921530;
                if ((*(byte *)(param_3 + 10) >> 1 & 1) != 0) {
                  iVar1 = curl_mime_filename(lVar3,0);
                  goto joined_r0x009214f4;
                }
              }
LAB_00921444:
              if ((param_3[0xb] == 0) ||
                 ((param_3[9] == 0 && ((*(byte *)(param_3 + 10) & 0x51) == 0)))) {
                iVar1 = 0;
              }
              else {
                iVar1 = curl_mime_filename(lVar3);
                if (iVar1 != 0) break;
              }
              plVar8 = (long *)plVar8[9];
            } while (plVar8 != (long *)0x0);
          }
          param_3 = (long *)*param_3;
        } while ((param_3 != (long *)0x0) && (iVar9 = iVar1, iVar1 == 0));
        if (iVar1 == 0) {
          return 0;
        }
      }
    }
LAB_00921530:
    FUN_00925eb8(param_2);
  }
  return iVar1;
}

