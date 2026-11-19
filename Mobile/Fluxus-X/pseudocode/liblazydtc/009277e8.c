/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009277e8
 */

undefined * FUN_009277e8(char *param_1)

{
  int iVar1;
  size_t sVar2;
  undefined *puVar3;
  long lVar4;
  char *pcVar5;
  
  puVar3 = (undefined *)0x0;
  if (param_1 != (char *)0x0) {
    sVar2 = strlen(param_1);
    puVar3 = (undefined *)0x0;
    if (3 < sVar2) {
      pcVar5 = param_1 + (sVar2 - 4);
      iVar1 = curl_strequal(pcVar5,&DAT_002d5167);
      lVar4 = 0;
      if (iVar1 == 0) {
        iVar1 = curl_strequal(pcVar5,&DAT_0029d759);
        if (iVar1 == 0) {
          if ((sVar2 < 5) || (iVar1 = curl_strequal(param_1 + (sVar2 - 5),".jpeg"), iVar1 == 0)) {
            iVar1 = curl_strequal(pcVar5,&DAT_002b5386);
            if (iVar1 == 0) {
              iVar1 = curl_strequal(pcVar5,&DAT_002c0fc4);
              if (iVar1 == 0) {
                iVar1 = curl_strequal(pcVar5,&DAT_002db281);
                if (iVar1 == 0) {
                  iVar1 = curl_strequal(pcVar5,&DAT_002cae44);
                  if (iVar1 == 0) {
                    if ((sVar2 < 5) ||
                       (iVar1 = curl_strequal(param_1 + (sVar2 - 5),".html"), iVar1 == 0)) {
                      iVar1 = curl_strequal(pcVar5,&DAT_002a180d);
                      if (iVar1 == 0) {
                        iVar1 = curl_strequal(pcVar5,&DAT_002cae49);
                        if (iVar1 == 0) {
                          return (undefined *)0x0;
                        }
                        lVar4 = 9;
                      }
                      else {
                        lVar4 = 8;
                      }
                    }
                    else {
                      lVar4 = 7;
                    }
                  }
                  else {
                    lVar4 = 6;
                  }
                }
                else {
                  lVar4 = 5;
                }
              }
              else {
                lVar4 = 4;
              }
            }
            else {
              lVar4 = 3;
            }
          }
          else {
            lVar4 = 2;
          }
        }
        else {
          lVar4 = 1;
        }
      }
      puVar3 = (&PTR_s_image_gif_00c4f770)[lVar4 * 2];
    }
  }
  return puVar3;
}

