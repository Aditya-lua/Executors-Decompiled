/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009cf908
 */

undefined8 dtls1_get_record(uint *param_1)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  int iVar6;
  undefined8 uVar7;
  long lVar8;
  uint uVar9;
  byte *pbVar10;
  ulong uVar11;
  int local_6c;
  ulong local_68;
  
  iVar6 = dtls1_process_buffered_records();
  if (iVar6 != 0) {
    do {
      iVar6 = dtls1_retrieve_buffered_record(param_1,*(long *)(param_1 + 0x744) + 0x38);
      if (iVar6 != 0) {
        return 1;
      }
      if ((param_1[0x319] == 0xf1) && (0xc < *(ulong *)(param_1 + 0x72c))) {
        uVar11 = *(ulong *)(param_1 + 0x4ac);
LAB_009cfa5c:
        if ((*(long *)(param_1 + 0x72c) - 0xdU < uVar11) &&
           ((iVar6 = ssl3_read_n(param_1,uVar11,uVar11,1,1,&local_68), iVar6 < 1 ||
            (local_68 != uVar11)))) {
LAB_009cfb70:
          iVar6 = ossl_statem_in_error(param_1);
          if (iVar6 != 0) {
            return 0xffffffff;
          }
          goto LAB_009cfb7c;
        }
        param_1[0x319] = 0xf0;
        lVar8 = dtls1_get_bitmap(param_1,param_1 + 0x4aa,&local_6c);
        if (lVar8 == 0) {
          param_1[0x4ac] = 0;
          param_1[0x4ad] = 0;
          goto LAB_009cfb84;
        }
        iVar6 = dtls1_record_replay_check(param_1,lVar8);
        if (iVar6 == 0) {
LAB_009cfb7c:
          param_1[0x4ac] = 0;
          param_1[0x4ad] = 0;
          param_1[0x4b8] = 1;
          goto LAB_009cfb84;
        }
        if (*(long *)(param_1 + 0x4ac) != 0) {
          if (local_6c == 0) {
            iVar6 = dtls1_process_record(param_1,lVar8);
            if (iVar6 != 0) {
              return 1;
            }
            goto LAB_009cfb70;
          }
          iVar6 = SSL_in_init(param_1);
          if (((iVar6 != 0) || (iVar6 = ossl_statem_get_in_handshake(param_1), iVar6 != 0)) &&
             (iVar6 = dtls1_buffer_record(param_1,*(long *)(param_1 + 0x744) + 0x28,param_1 + 0x4bc)
             , iVar6 < 0)) {
            return 0xffffffff;
          }
          goto LAB_009cfb7c;
        }
        param_1[0x4b8] = 1;
      }
      else {
        uVar7 = ssl3_read_n(param_1,0xd,*(undefined8 *)(param_1 + 0x322),0,1,&local_68);
        if ((int)uVar7 < 1) {
          return uVar7;
        }
        if (*(long *)(param_1 + 0x72c) == 0xd) {
          pbVar10 = *(byte **)(param_1 + 0x72a);
          param_1[0x319] = 0xf1;
          if (*(code **)(param_1 + 0x130) != (code *)0x0) {
            (**(code **)(param_1 + 0x130))
                      (0,0,0x100,pbVar10,0xd,param_1,*(undefined8 *)(param_1 + 0x132));
          }
          bVar1 = *pbVar10;
          param_1[0x4ab] = (uint)bVar1;
          bVar2 = pbVar10[1];
          bVar3 = pbVar10[2];
          *(ulong *)(param_1 + 0x4ba) = (ulong)CONCAT11(pbVar10[3],pbVar10[4]);
          *(undefined2 *)((long)param_1 + 0x1cfe) = *(undefined2 *)(pbVar10 + 9);
          *(undefined4 *)((long)param_1 + 0x1cfa) = *(undefined4 *)(pbVar10 + 5);
          bVar4 = pbVar10[0xb];
          bVar5 = pbVar10[0xc];
          param_1[0x4b8] = 0;
          uVar11 = (ulong)CONCAT11(bVar4,bVar5);
          *(ulong *)(param_1 + 0x4ac) = uVar11;
          if ((bVar1 == 0x15) || (param_1[0x282] != 0)) {
            uVar9 = *param_1;
LAB_009cfb10:
            if ((((uVar9 & 0xff00) == (uint)bVar2 * 0x100) && (uVar11 < 0x4541)) &&
               ((*(long *)(param_1 + 0x246) == 0 ||
                ((uVar9 = *(byte *)(*(long *)(param_1 + 0x246) + 0x368) - 1, 3 < uVar9 ||
                 (uVar11 <= (0x200 << (ulong)(uVar9 & 0x1f)) + 0x140)))))) goto LAB_009cfa5c;
          }
          else {
            uVar9 = (uint)CONCAT11(bVar2,bVar3);
            if (*param_1 == uVar9) goto LAB_009cfb10;
          }
          goto LAB_009cfb7c;
        }
LAB_009cfb84:
        param_1[0x72c] = 0;
        param_1[0x72d] = 0;
      }
      iVar6 = dtls1_process_buffered_records(param_1);
    } while (iVar6 != 0);
  }
  return 0xffffffff;
}

