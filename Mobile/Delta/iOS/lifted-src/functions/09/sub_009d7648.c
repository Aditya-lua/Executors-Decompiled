/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d7648..0x9d78a0 (600 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d7648_0 {
    char padding_0[109];
    char field_6d;
    unsigned short field_6e;
    char padding_70[20];
    unsigned int field_84;
    char padding_88[80];
    void* field_d8;
    char padding_e0[28];
    void* field_fc;
} st_9d7648_0;

typedef struct st_9d7648_2 {
    unsigned long long field_0;
    void* field_8;
    void* field_10;
    void* field_18;
    void* field_20;
} st_9d7648_2;

typedef struct st_9d7648_1 {
    char padding_0[56];
    unsigned int field_38;
    char padding_3c[4];
    struct st_9d7648_0 *field_40;
} st_9d7648_1;

extern char g_10002b0;

void* sub_9d7648(st_9d7648_1 *a0, st_9d7648_2 *a1, unsigned long a2, void* a3, unsigned long a4, void* *a5)
{
    st_9d7648_0 *v13;  // x9
    void* v14;  // w9
    void* v23;  // x9
    st_9d7648_0 *v24;  // x8
    unsigned int v25;  // w10
    void* v26;  // x9
    void* v27;  // x8
    void* v28;  // w0
    unsigned int v15;  // w9
    void* v16;  // x9
    void* v17;  // x11
    unsigned long v18;  // x0
    long long v19;  // x1
    void* v20;  // x0
    void* v21;  // x0
    unsigned long v22;  // x11
    unsigned long v0;  // [bp-0xb8]
    void* v1;  // [bp-0xb0]
    void* v2;  // [bp-0xa8]
    void* v3;  // [bp-0xa0]
    char *v4;  // [bp-0x98]
    void* v5;  // [bp-0x90]
    void* v6;  // [bp-0x88]
    unsigned int v7;  // [bp-0x80]
    void* v8;  // [bp-0x7c]
    char v9;  // [bp-0x78]
    unsigned long v10;  // [bp-0x38]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v10 = *(long long *)&g_10002b0;
    if (!a3)
    {
        v27 = 0;
        goto LABEL_9d784c;
    }
    v13 = a0->field_40;
    v0 = a1->field_0;
    v1 = a1->field_8;
    if ((int)v13->field_d8)
    {
        v14 = (void*)0;
        v2 = 0;
    }
    else
    {
        v2 = a1->field_10;
        if (a1->field_10)
        {
            v15 = v13->field_6d;
            if (v15 == 30)
                v14 = (void*)28;
            else
                v14 = (void*)0;
            if (v15 == 2)
                v14 = (void*)16;
        }
        else
        {
            v14 = (void*)0;
        }
    }
    v3 = v14;
    v4 = &v0;
    v5 = (void*)1;
    v16 = a1->field_18;
    v17 = &v9;
    if (!v16)
        v17 = 0;
    v6 = v17;
    v7 = (v16 != 0) * 64;
    v8 = (void*)0;
    if (v16 && !(v13->padding_e0)[1])
    {
        sub_a368c8();
        sub_a369bc("crypto/bio/bss_dgram.c", 1651, "dgram_recvmmsg");
        v18 = 32;
        v19 = 111;
        goto LABEL_9d7830;
    }
    else
    {
        v20 = _recvmsg(a0->field_38, &v2, 0);
        if (v20 >= 0)
        {
            a1->field_8 = v20;
            a1->field_20 = 0;
            v21 = a1->field_18;
            if (v21)
            {
                v22 = v7;
                if ((unsigned int)v22 >= 12)
                {
                    v23 = v6;
                    if (v23)
                    {
                        v24 = a0->field_40;
                        v25 = v24->field_6d;
                        v26 = v23;
                        do
                        {
                            if (v25 != 30)
                            {
                                if (v25 != 2 || (int)v26[4] || (int)v26[8] != 26)
                                    continue;
                                *(int *)&v21[4] = (int)v26[20];
                                *(char *)&v21[1] = 2;
                                *(unsigned short *)&v21[2] = v24->field_6e;
                                goto LABEL_9d7848;
                            }
                            else if ((int)v26[4] == 41 && (int)v26[8] == 46)
                            {
                                *(int128_t *)&v21[8] = (int128_t)v26[12];
                                *(char *)&v21[1] = 30;
                                *(unsigned short *)&v21[2] = v24->field_6e;
                                *(unsigned int *)&v21[24] = v24->field_84;
                                *(unsigned int *)&v21[4] = 0;
                                goto LABEL_9d7848;
                            }
                        } while ((v26 += *(int *)v26 + 3 & 0x1fffffffc, v23 + v22 >= v26 + 12));
                    }
                }
                sub_9d353c();
            }
LABEL_9d7848:
            v27 = 1;
LABEL_9d784c:
            v28 = (void*)1;
        }
        else
        {
            sub_a368c8();
            v19 = *(int *)___error(sub_a369bc("crypto/bio/bss_dgram.c", 1658, "dgram_recvmmsg"), 1658, "dgram_recvmmsg");
            v18 = 2;
LABEL_9d7830:
            sub_a36abc(v18, v19, 0);
            v27 = 0;
            v28 = (void*)0;
        }
    }
    *a5 = v27;
    if (*(long long *)&g_10002b0 == v10)
        return v28;
    ___stack_chk_fail();
}
