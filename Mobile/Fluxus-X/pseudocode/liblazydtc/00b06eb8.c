/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b06eb8
 */

undefined8 ossl_a2i_ipadd(undefined8 *param_1,char *param_2)

{
  long lVar1;
  size_t __n;
  int iVar2;
  int iVar3;
  char *pcVar4;
  undefined8 uVar5;
  uint local_60;
  undefined4 uStack_5c;
  undefined8 uStack_58;
  undefined8 local_50;
  int local_48;
  int local_40;
  uint local_3c;
  uint uStack_38;
  uint local_34;
  
  pcVar4 = strchr(param_2,0x3a);
  if (pcVar4 == (char *)0x0) {
    iVar3 = sscanf(param_2,"%d.%d.%d.%d%n",(int *)&local_60,(int *)&local_34,(int *)&uStack_38,
                   (int *)&local_3c,&local_40);
    if (iVar3 != 4) {
      return 0;
    }
    if (0xff < (local_34 | local_60 | uStack_38 | local_3c)) {
      return 0;
    }
    if ((param_2[local_40] == '\0') ||
       (uVar5 = ossl_ctype_check(param_2[local_40],8), (int)uVar5 != 0)) {
      *(char *)param_1 = (char)local_60;
      *(char *)((long)param_1 + 1) = (char)local_34;
      *(char *)((long)param_1 + 2) = (char)uStack_38;
      *(char *)((long)param_1 + 3) = (char)local_3c;
      return 4;
    }
    return uVar5;
  }
  local_50 = -0x100000000;
  local_48 = 0;
  iVar3 = CONF_parse_list(param_2,0x3a,0,(list_cb *)&LAB_00b07bf4,&local_60);
  if (iVar3 != 0) {
    iVar3 = (int)local_50;
    lVar1 = (long)(int)local_50;
    iVar2 = local_50._4_4_;
    __n = (size_t)local_50._4_4_;
    if (local_50._4_4_ == -1) {
      if ((int)local_50 == 0x10) goto LAB_00b06fe4;
    }
    else if (((int)local_50 != 0x10) && (local_48 < 4)) {
      if (local_48 == 2) {
        if ((local_50._4_4_ != 0) && ((int)local_50 != local_50._4_4_)) {
          return 0;
        }
      }
      else if (local_48 == 3) {
        if (0 < (int)local_50) {
          return 0;
        }
      }
      else {
        if (local_50._4_4_ == 0) {
          return 0;
        }
        if ((int)local_50 == local_50._4_4_) {
          return 0;
        }
      }
      if (-1 < local_50) {
        memcpy(param_1,&local_60,__n);
        memset((undefined1 *)((long)param_1 + __n),0,0x10 - lVar1);
        if (iVar3 != iVar2) {
          memcpy((undefined1 *)((long)param_1 + __n) + (0x10 - lVar1),
                 (void *)((long)&local_60 + __n),(long)(iVar3 - iVar2));
        }
        return 0x10;
      }
LAB_00b06fe4:
      param_1[1] = uStack_58;
      *param_1 = CONCAT44(uStack_5c,local_60);
      return 0x10;
    }
  }
  return 0;
}

