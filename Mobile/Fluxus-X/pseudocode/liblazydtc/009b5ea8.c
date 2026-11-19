/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b5ea8
 */

int SSL_select_next_proto
              (uchar **out,uchar *outlen,uchar *in,uint inlen,uchar *client,uint client_len)

{
  uint uVar1;
  uint uVar2;
  byte bVar3;
  byte bVar4;
  int iVar5;
  ulong uVar6;
  ulong uVar7;
  
  if (inlen == 0) {
    iVar5 = 2;
  }
  else {
    uVar7 = 0;
    do {
      bVar3 = in[uVar7];
      uVar1 = (int)uVar7 + 1;
      if (client_len != 0) {
        uVar6 = 0;
        do {
          bVar4 = client[uVar6];
          uVar2 = (int)uVar6 + 1;
          if (((uint)bVar3 == (uint)bVar4) &&
             (iVar5 = memcmp(in + uVar1,client + uVar2,(ulong)bVar3), iVar5 == 0)) {
            client = in + uVar7;
            iVar5 = 1;
            goto LAB_009b5f54;
          }
          uVar2 = uVar2 + bVar4;
          uVar6 = (ulong)uVar2;
        } while (uVar2 < client_len);
      }
      uVar1 = uVar1 + bVar3;
      uVar7 = (ulong)uVar1;
    } while (uVar1 < inlen);
    iVar5 = 2;
  }
LAB_009b5f54:
  *out = client + 1;
  *outlen = *client;
  return iVar5;
}

