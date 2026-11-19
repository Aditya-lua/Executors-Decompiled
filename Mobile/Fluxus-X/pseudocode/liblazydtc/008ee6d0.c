/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ee6d0
 */

/* cpr::Session::SetMultipart(cpr::Multipart const&) */

void __thiscall cpr::Session::SetMultipart(Session *this,Multipart *param_1)

{
  byte *pbVar1;
  byte bVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  byte *pbVar6;
  long lVar7;
  undefined8 *puVar8;
  byte *pbVar9;
  
  puVar8 = *(undefined8 **)(this + 0x18);
  if (puVar8[3] != 0) {
    curl_mime_free();
    puVar8 = *(undefined8 **)(this + 0x18);
  }
  uVar3 = curl_mime_init(*puVar8);
  puVar8 = *(undefined8 **)(this + 0x18);
  puVar8[3] = uVar3;
  pbVar9 = *(byte **)param_1;
  pbVar1 = *(byte **)(param_1 + 8);
  if (pbVar9 != pbVar1) {
    do {
      if (pbVar9[0x58] == 0) {
        uVar3 = curl_mime_addpart(*(undefined8 *)(*(long *)(this + 0x18) + 0x18));
        bVar2 = pbVar9[0x30];
        if ((bVar2 & 1) == 0) {
          if (bVar2 >> 1 != 0) goto LAB_008ee840;
        }
        else if (*(long *)(pbVar9 + 0x38) != 0) {
LAB_008ee840:
          if ((bVar2 & 1) == 0) {
            pbVar6 = pbVar9 + 0x31;
          }
          else {
            pbVar6 = *(byte **)(pbVar9 + 0x40);
          }
          curl_mime_type(uVar3,pbVar6);
        }
        bVar2 = pbVar9[0x59];
        if ((*pbVar9 & 1) == 0) {
          pbVar6 = pbVar9 + 1;
        }
        else {
          pbVar6 = *(byte **)(pbVar9 + 0x10);
        }
        curl_mime_name(uVar3,pbVar6);
        if (bVar2 == 0) {
          if ((pbVar9[0x18] & 1) == 0) {
            pbVar6 = pbVar9 + 0x19;
          }
          else {
            pbVar6 = *(byte **)(pbVar9 + 0x28);
          }
          curl_mime_data(uVar3,pbVar6,0xffffffffffffffff);
        }
        else {
          curl_mime_data(uVar3,*(undefined8 *)(pbVar9 + 0x48),*(undefined8 *)(pbVar9 + 0x50));
          if ((pbVar9[0x18] & 1) == 0) {
            pbVar6 = pbVar9 + 0x19;
          }
          else {
            pbVar6 = *(byte **)(pbVar9 + 0x28);
          }
          curl_mime_filename(uVar3,pbVar6);
        }
      }
      else {
        lVar4 = Files::begin((Files *)(pbVar9 + 0x60));
        lVar5 = Files::end((Files *)(pbVar9 + 0x60));
        if (lVar4 != lVar5) {
          lVar4 = lVar4 + 0x19;
          do {
            uVar3 = curl_mime_addpart(*(undefined8 *)(*(long *)(this + 0x18) + 0x18));
            bVar2 = pbVar9[0x30];
            if ((bVar2 & 1) == 0) {
              if (bVar2 >> 1 != 0) goto LAB_008ee780;
            }
            else if (*(long *)(pbVar9 + 0x38) != 0) {
LAB_008ee780:
              pbVar6 = pbVar9 + 0x31;
              if ((bVar2 & 1) != 0) {
                pbVar6 = *(byte **)(pbVar9 + 0x40);
              }
              curl_mime_type(uVar3,pbVar6);
            }
            if ((*(byte *)(lVar4 + -0x19) & 1) == 0) {
              lVar7 = lVar4 + -0x18;
            }
            else {
              lVar7 = *(long *)(lVar4 + -9);
            }
            curl_mime_filedata(uVar3,lVar7);
            pbVar6 = pbVar9 + 1;
            if ((*pbVar9 & 1) != 0) {
              pbVar6 = *(byte **)(pbVar9 + 0x10);
            }
            curl_mime_name(uVar3,pbVar6);
            bVar2 = *(byte *)(lVar4 + -1);
            if ((bVar2 & 1) == 0) {
              if (bVar2 >> 1 != 0) goto LAB_008ee7e8;
            }
            else if (*(long *)(lVar4 + 7) != 0) {
LAB_008ee7e8:
              lVar7 = lVar4;
              if ((bVar2 & 1) != 0) {
                lVar7 = *(long *)(lVar4 + 0xf);
              }
              curl_mime_filename(uVar3,lVar7);
            }
            lVar7 = lVar4 + 0x17;
            lVar4 = lVar4 + 0x30;
          } while (lVar7 != lVar5);
        }
      }
      pbVar9 = pbVar9 + 0x78;
    } while (pbVar9 != pbVar1);
    puVar8 = *(undefined8 **)(this + 0x18);
    uVar3 = puVar8[3];
  }
  curl_easy_setopt(*puVar8,0x281d,uVar3);
  this[0x10] = (Session)0x1;
  return;
}

