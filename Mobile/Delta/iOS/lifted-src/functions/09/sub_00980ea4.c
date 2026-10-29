/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x980ea4..0x981120 (636 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_980ea4_0 {
    void* field_0;
    uint128_t field_8;
    void* field_18;
    unsigned short field_20;
    char padding_22[2];
    unsigned short field_24;
} st_980ea4_0;

extern long long g_9819a8;

void* sub_980ea4(st_980ea4_0 *a0)
{
    void* v2;  // x19
    void* v3;  // x0
    void* v12;  // x9
    void* v13;  // x20
    unsigned int v14;  // w0
    unsigned long v15;  // x22
    void* v16;  // w0
    void* v4;  // x9
    unsigned int v5;  // w22
    unsigned short v6;  // x8
    unsigned int v7;  // w10
    void* v8;  // x8
    void* v9;  // x21
    unsigned long long v10;  // x20
    void* v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(176, "ssl/quic/quic_port.c", 106);
    if (!v2)
        return v2;
    v3 = 0;
    v4 = a0->field_0;
    *(void* *)v2 = v4;
    v5 = __ROL__((short)a0->field_18, 1) & 2 & 3;
    v6 = (short)v2[154] & 0xfffffff9;
    v7 = *(short *)((char *)&a0->field_18 + 4);
    v8 = *(long long *)((char *)&a0->field_8 + 8);
    *(void* *)&v2[40] = v8;
    *(unsigned short *)&v2[154] = v6 | (unsigned short)(__ROL__(v7, 2)) & 4 & 7 | (unsigned short)v5;
    *(int128_t *)&v2[24] = *(int128_t *)&(&a0->field_0)[1];
    *(unsigned long long *)&v2[168] = 0x100;
    v9 = 0;
    if (v4 && v8)
    {
        v3 = sub_a3708c();
        *(void* *)&v2[144] = v3;
        if (v3 && !(v10 = v5 * 4, v3 = sub_97b0fc(0, v10, &g_9819a8, v2), *(void* *)&v2[64] = v3, !v3))
        {
            sub_97b358();
            v3 = sub_9880e8(*(long long *)*(long long *)v2, *(long long *)(*(long long *)v2 + 8));
            *(void* *)&v2[0x88] = v3;
            if (!v3 || (v3 = sub_980310(*(long long *)*(long long *)v2, v10), *(void* *)&v2[128] = v3, !v3))
                goto LABEL_9810c4;
            *(char *)&v2[152] = v10;
            *(char *)&v2[0x99] = 8;
            *(unsigned short *)&v2[154] = (short)v2[154] & 0xfffe;
            v11 = *(long long *)v2;
            v12 = (long long)v11[144];
            if (v12)
                *(void* *)&v12[8] = v2;
            *(unsigned long long *)&v2[8] = 0;
            *(void* *)&v2[16] = v12;
            *(void* *)&v11[144] = v2;
            if (!(long long)v11[0x88])
                *(void* *)&v11[0x88] = v2;
            *(long long *)&v11[152] = (long long)v11[152] + 1;
            *(unsigned short *)&v2[154] = (short)v2[154] | 288;
            v3 = sub_a4bc70();
            *(void* *)&v2[160] = v3;
            if (!v3 || (v3 = sub_a4e104(*(long long *)*(long long *)v2, "AES-256-GCM", 0), !v3))
                goto LABEL_9810c4;
            v13 = v3;
            if (sub_a4d02c((long long)v2[160], v13, 0, 0, 0) && !(v14 = sub_a50904((long long)v2[160]), (int)v14 < 1))
            {
                v15 = v14;
                v9 = sub_a6bf4c(v15, "ssl/quic/quic_port.c", 183);
                if (!v9 || !sub_aa8658(*(long long *)*(long long *)v2, v9, v15, 0))
                    goto LABEL_981118;
                v16 = (void*)(unsigned int)sub_a4d02c((long long)v2[160], 0, 0, v9, 0);
                sub_a4bbe4(v13);
                sub_a6c2e4(v9, "ssl/quic/quic_port.c", 191);
                if (v16)
                    return v2;
                goto LABEL_9810e0;
            }
            else
            {
                v9 = 0;
LABEL_981118:
                v3 = v13;
            }
        }
        else
        {
LABEL_9810c4:
            v9 = 0;
        }
    }
    sub_a4bbe4(v3);
    sub_a6c2e4(v9, "ssl/quic/quic_port.c", 191);
LABEL_9810e0:
    sub_981158(v2);
    sub_a6c2e4(v2, "ssl/quic/quic_port.c", 118);
    return 0;
}
