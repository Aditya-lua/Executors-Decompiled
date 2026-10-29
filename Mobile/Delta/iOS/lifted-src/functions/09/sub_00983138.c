/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x983138..0x983400 (712 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_983138_1 {
    struct st_983138_0 *field_0;
    struct st_983138_0 *field_8;
    unsigned long long field_10;
    struct st_983138_0 *field_18;
    struct st_983138_0 *field_20;
    unsigned long long field_28;
    struct st_983138_0 *field_30;
    struct st_983138_0 *field_38;
    unsigned long long field_40;
    char padding_48[944];
    unsigned int field_3f8;
} st_983138_1;

typedef struct st_983138_0 {
    struct st_983138_0 *field_0;
    struct st_983138_0 *field_8;
    unsigned long long field_10;
    char padding_18[24];
    struct st_983138_0 *field_30;
    struct st_983138_0 *field_38;
    unsigned long long field_40;
    struct st_983138_0 *field_48;
    struct st_983138_0 *field_50;
    unsigned long long field_58;
    struct st_983138_0 *field_60;
    struct st_983138_0 *field_68;
    unsigned long long field_70;
    struct st_983138_0 *field_78;
    struct st_983138_0 *field_80;
    unsigned long long field_88;
    char padding_90[24];
    char field_a8;
    char padding_a9[919];
    unsigned int field_440;
} st_983138_0;


void sub_983138(void* a0)
{
    unsigned int v2;  // w8
    void* v3;  // x9
    void* v12;  // x21
    st_983138_1 *v13;  // x8
    void* v14;  // x9
    void* v15;  // x8
    void* v16;  // x1
    void* v17;  // x20
    void* v18;  // x8
    void* v19;  // x8
    void* v20;  // x1
    void* v21;  // x20
    void* v4;  // x0
    void* v22;  // x8
    void* v5;  // x8
    void* v6;  // x21
    st_983138_1 *v7;  // x8
    void* v8;  // x9
    void* v9;  // x9
    void* v10;  // x0
    void* v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return;
    v2 = (int)a0[1088];
    *(unsigned int *)&a0[1088] = v2 - 1;
    if (v2 != 1)
        return;
    v3 = (long long)a0[96];
    if (v3)
    {
        v4 = v3;
        while (1)
        {
            v5 = v4;
            v6 = (long long)v5[72];
            v7 = v5 + 72;
            if (v3 == v4)
                *(void* *)&a0[96] = v6;
            v8 = (long long)v4[80];
            if ((long long)a0[104] == v4)
            {
                *(void* *)&a0[104] = v8;
                if (v8)
                {
LABEL_9831ac:
                    *(void* *)&v8[72] = v6;
                }
            }
            else if (!(!v8))
            {
                goto LABEL_9831ac;
            }
            if (!v6)
                break;
            *(void* *)&v6[80] = v8;
            *(long long *)&a0[112] = (long long)a0[112] - 1;
            v7->field_0 = 0;
            v7->field_8 = 0;
            sub_a6c2e4();
            v3 = (long long)a0[96];
            v4 = v6;
        }
        *(long long *)&a0[112] = (long long)a0[112] - 1;
        v7->field_0 = 0;
        v7->field_8 = 0;
        sub_a6c2e4();
    }
    v9 = (long long)a0[120];
    if (v9)
    {
        v10 = v9;
        while (1)
        {
            v11 = v10;
            v12 = (long long)v11[72];
            v13 = v11 + 72;
            if (v9 == v10)
                *(void* *)&a0[120] = v12;
            v14 = (long long)v10[80];
            if ((long long)a0[128] == v10)
            {
                *(void* *)&a0[128] = v14;
                if (v14)
                {
LABEL_983248:
                    *(void* *)&v14[72] = v12;
                }
            }
            else if (!(!v14))
            {
                goto LABEL_983248;
            }
            if (!v12)
                break;
            *(void* *)&v12[80] = v14;
            *(long long *)&a0[0x88] = (long long)a0[0x88] - 1;
            v13->field_0 = 0;
            v13->field_8 = 0;
            sub_a6c2e4();
            v9 = (long long)a0[120];
            v10 = v12;
        }
        *(long long *)&a0[0x88] = (long long)a0[0x88] - 1;
        v13->field_0 = 0;
        v13->field_8 = 0;
        sub_a6c2e4();
    }
    v15 = (long long)a0[48];
    if (v15)
    {
        v16 = v15;
        while (1)
        {
            v17 = *(long long *)v16;
            if (v15 == v16)
                *(void* *)&a0[48] = v17;
            v18 = (long long)v16[8];
            if ((long long)a0[56] == v16)
            {
                *(void* *)&a0[56] = v18;
                if (v18)
                {
LABEL_9832d8:
                    *(void* *)v18 = v17;
                }
            }
            else if (!(!v18))
            {
                goto LABEL_9832d8;
            }
            if (!v17)
                break;
            *(void* *)&v17[8] = v18;
            *(long long *)&a0[64] = (long long)a0[64] - 1;
            *(unsigned long long *)v16 = 0;
            *(unsigned long long *)&v16[8] = 0;
            sub_97b768((long long)a0[16]);
            v15 = (long long)a0[48];
            v16 = v17;
        }
        *(long long *)&a0[64] = (long long)a0[64] - 1;
        *(unsigned long long *)v16 = 0;
        *(unsigned long long *)&v16[8] = 0;
        sub_97b768((long long)a0[16]);
    }
    v19 = (long long)a0[72];
    if (v19)
    {
        v20 = v19;
        while (1)
        {
            v21 = *(long long *)v20;
            if (v19 == v20)
                *(void* *)&a0[72] = v21;
            v22 = (long long)v20[8];
            if ((long long)a0[80] == v20)
            {
                *(void* *)&a0[80] = v22;
                if (v22)
                {
LABEL_98335c:
                    *(void* *)v22 = v21;
                }
            }
            else if (!(!v22))
            {
                goto LABEL_98335c;
            }
            if (!v21)
                break;
            *(void* *)&v21[8] = v22;
            *(long long *)&a0[88] = (long long)a0[88] - 1;
            *(unsigned long long *)v20 = 0;
            *(unsigned long long *)&v20[8] = 0;
            sub_97b768((long long)a0[16]);
            v19 = (long long)a0[72];
            v20 = v21;
        }
        *(long long *)&a0[88] = (long long)a0[88] - 1;
        *(unsigned long long *)v20 = 0;
        *(unsigned long long *)&v20[8] = 0;
        sub_97b768((long long)a0[16]);
    }
    sub_c62520(a0 + 168, 0);
    sub_c62520(a0 + 168, 1);
    sub_c62520(a0 + 168, 2);
    sub_c62520(a0 + 168, 3);
    sub_a6c2e4();
    return;
}
