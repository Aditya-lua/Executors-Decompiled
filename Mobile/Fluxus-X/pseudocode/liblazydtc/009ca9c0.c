/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ca9c0
 */

int ssl3_read_n(SSL *param_1,_func_3155 *param_2,_func_3155 *param_3,int param_4,int param_5,
               ulong *param_6)

{
  void *__dest;
  _func_3155 *p_Var1;
  uint uVar2;
  byte bVar3;
  int iVar4;
  int iVar5;
  undefined4 *puVar6;
  void *__src;
  undefined8 uVar7;
  ulong uVar8;
  _func_3155 *p_Var9;
  ulong uVar10;
  long lVar11;
  _func_3155 *p_Var12;
  _func_3155 *p_Var13;
  long lVar14;
  ulong uVar15;
  _func_3155 *p_Var16;
  
  if (param_2 == (_func_3155 *)0x0) {
    return 0;
  }
  uVar8 = param_1[4].mode;
  if (uVar8 == 0) {
    iVar4 = ssl3_setup_read_buffer(param_1);
    if (iVar4 == 0) {
      return -1;
    }
    uVar8 = param_1[4].mode;
  }
  p_Var13 = param_1[4].tlsext_debug_cb;
  uVar15 = (ulong)~((int)uVar8 + 4U) & 7;
  if (param_4 == 0) {
    if (p_Var13 == (_func_3155 *)0x0) {
      *(ulong *)&param_1[4].max_send_fragment = uVar15;
      uVar10 = uVar15;
    }
    else {
      uVar10 = *(ulong *)&param_1[4].max_send_fragment;
    }
    __src = (void *)(uVar8 + uVar10);
    *(void **)&param_1[10].first_packet = __src;
    *(undefined8 *)&param_1[10].max_send_fragment = 0;
  }
  else {
    __src = *(void **)&param_1[10].first_packet;
  }
  if (__src == (void *)0x0) {
    ERR_new();
    uVar7 = 0xeb;
  }
  else {
    lVar14 = *(long *)&param_1[10].max_send_fragment;
    __dest = (void *)(uVar8 + uVar15);
    if ((param_5 == 1) && (__src != __dest)) {
      memmove(__dest,__src,(size_t)(p_Var13 + lVar14));
      *(void **)&param_1[10].first_packet = __dest;
      *(ulong *)&param_1[4].max_send_fragment = lVar14 + uVar15;
    }
    uVar2 = *(uint *)(param_1->method->get_timeout + 0x60);
    p_Var12 = param_2;
    if ((uVar2 >> 3 & 1) != 0) {
      if ((param_4 != 0) && (p_Var13 == (_func_3155 *)0x0)) {
        return 0;
      }
      p_Var12 = p_Var13;
      if (param_2 <= p_Var13 || p_Var13 == (_func_3155 *)0x0) {
        p_Var12 = param_2;
      }
    }
    if (p_Var12 <= p_Var13) {
      lVar14 = *(long *)&param_1[10].max_send_fragment;
      param_1[4].tlsext_debug_cb = p_Var13 + -(long)p_Var12;
      *(_func_3155 **)&param_1[10].max_send_fragment = p_Var12 + lVar14;
      *(_func_3155 **)&param_1[4].max_send_fragment =
           p_Var12 + *(long *)&param_1[4].max_send_fragment;
      *param_6 = (ulong)p_Var12;
      return 1;
    }
    p_Var9 = (_func_3155 *)
             (*(long *)&param_1[4].first_packet - *(long *)&param_1[4].max_send_fragment);
    if (p_Var12 <= p_Var9) {
      p_Var16 = p_Var12;
      if (*(int *)&param_1[4].client_CA != 0 || (uVar2 & 8) != 0) {
        p_Var1 = p_Var12;
        if (p_Var12 <= param_3) {
          p_Var1 = param_3;
        }
        p_Var16 = p_Var9;
        if (p_Var1 <= p_Var9) {
          p_Var16 = p_Var1;
        }
      }
      puVar6 = (undefined4 *)__errno();
      do {
        *puVar6 = 0;
        if (param_1->rbio == (BIO *)0x0) {
          ERR_new();
          ERR_set_debug("ssl/record/rec_layer_s3.c",0x147,"ssl3_read_n");
          ossl_statem_fatal(param_1,0x50,0xd3,0);
          iVar4 = -1;
LAB_009cac6c:
          bVar3 = *(byte *)&param_1[3].tlsext_debug_arg;
          param_1[4].tlsext_debug_cb = p_Var13;
          if ((bVar3 >> 4 & 1) == 0) {
            return iVar4;
          }
          if (p_Var13 + lVar14 != (_func_3155 *)0x0) {
            return iVar4;
          }
          if ((*(uint *)(param_1->method->get_timeout + 0x60) >> 3 & 1) == 0) {
            ssl3_release_read_buffer(param_1);
            return iVar4;
          }
          return iVar4;
        }
        param_1->rwstate = 3;
        iVar4 = BIO_read(param_1->rbio,p_Var13 + (long)__dest + lVar14,(int)p_Var16 - (int)p_Var13);
        if (iVar4 < 1) {
          iVar5 = BIO_test_flags(param_1->rbio,8);
          if ((iVar5 == 0) && (lVar11 = BIO_ctrl(param_1->rbio,2,0,(void *)0x0), (int)lVar11 != 0))
          {
            if (*(char *)&param_1[3].tlsext_debug_cb < '\0') {
              SSL_set_shutdown(param_1,2);
              *(undefined4 *)&(param_1->ex_data).field_0xc = 0;
            }
            else {
              ERR_new();
              ERR_set_debug("ssl/record/rec_layer_s3.c",0x143,"ssl3_read_n");
              ossl_statem_fatal(param_1,0x32,0x126,0);
            }
          }
          goto LAB_009cac6c;
        }
        p_Var13 = p_Var13 + ((long)iVar4 & ((long)iVar4 >> 0x3f ^ 0xffffffffffffffffU));
        p_Var9 = p_Var13;
        if (((uint)(p_Var13 < p_Var12) & ((byte)param_1->method->get_timeout[0x60] & 8) >> 3) == 0)
        {
          p_Var9 = p_Var12;
        }
        p_Var12 = p_Var9;
        if (p_Var9 <= p_Var13) {
          lVar11 = *(long *)&param_1[4].max_send_fragment;
          param_1[4].tlsext_debug_cb = p_Var13 + -(long)p_Var9;
          lVar14 = *(long *)&param_1[10].max_send_fragment;
          param_1->rwstate = 1;
          *(_func_3155 **)&param_1[4].max_send_fragment = p_Var9 + lVar11;
          *(_func_3155 **)&param_1[10].max_send_fragment = p_Var9 + lVar14;
          *param_6 = (ulong)p_Var9;
          return 1;
        }
      } while( true );
    }
    ERR_new();
    uVar7 = 0x114;
  }
  ERR_set_debug("ssl/record/rec_layer_s3.c",uVar7,"ssl3_read_n");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
  return -1;
}

