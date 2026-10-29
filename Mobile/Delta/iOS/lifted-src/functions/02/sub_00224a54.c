/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x224a54..0x225b1c (4296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_224a54_9 {
    char padding_0[2];
    char field_2;
    char padding_3[69];
    unsigned long long field_48;
    struct st_224a54_8 *field_50;
    unsigned long long field_58;
    char padding_60[24];
    unsigned long long field_78;
} st_224a54_9;

typedef struct st_224a54_8 {
    char padding_0[32];
    struct st_224a54_9 *field_20;
} st_224a54_8;

typedef struct st_224a54_3 {
    char padding_0[40];
    unsigned long long field_28;
} st_224a54_3;

typedef struct st_224a54_1 {
    struct st_224a54_0 *field_0;
} st_224a54_1;

typedef struct st_224a54_2 {
    char padding_0[80];
    unsigned long long field_50;
} st_224a54_2;

typedef struct st_224a54_4 {
    char padding_0[64];
    unsigned int field_40;
    char padding_44[4];
    struct st_224a54_2 *field_48;
    unsigned long long field_50;
    char padding_58[16];
    struct st_224a54_3 *field_68;
} st_224a54_4;

typedef struct st_224a54_0 {
    char field_0;
} st_224a54_0;

typedef struct st_224a54_11 {
    unsigned long long field_0;
} st_224a54_11;

typedef struct st_224a54_5 {
    char padding_0[1664];
    unsigned long long field_680;
} st_224a54_5;

typedef struct st_224a54_10 {
    char padding_0[184];
    struct st_224a54_11 *field_b8;
    char padding_c0[16];
    struct st_224a54_11 *field_d0;
    char padding_d8[160];
    struct st_224a54_11 *field_178;
} st_224a54_10;

typedef struct st_224a54_6 {
    char padding_0[96];
    struct st_224a54_5 *field_60;
} st_224a54_6;

extern st_224a54_6 *g_f0d198;
extern st_224a54_10 *g_f0d3d8;

unsigned long long sub_224a54(st_224a54_4 *a0, st_224a54_9 *a1)
{
    unsigned long long v11;  // x0
    unsigned long long v12;  // x22
    unsigned long i;  // x9
    unsigned long long v13;  // x0
    unsigned long v14;  // x8
    st_224a54_8 *v15;  // x9
    unsigned long long v16;  // w23
    unsigned long long v17;  // x0
    unsigned long long *v18;  // x0
    unsigned long long *v19;  // x22
    unsigned long v20;  // x8
    st_224a54_0 **v0;  // [bp-0xf0], Other Possible Types: char
    st_224a54_0 *v1;  // [bp-0xe8]
    unsigned int v2;  // [bp-0xdc]
    st_224a54_0 **v3;  // [bp-0xc0], Other Possible Types: st_224a54_1 **, char
    st_224a54_0 *v4;  // [bp-0xb8], Other Possible Types: st_224a54_1 **
    st_224a54_4 *v5;  // [bp-0xb0]
    int v6;  // [bp-0xa8]
    st_224a54_0 **v7;  // [bp-0x88], Other Possible Types: st_224a54_1 **, char
    st_224a54_0 *v8;  // [bp-0x80], Other Possible Types: st_224a54_1 **
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v1 = &v0;
    v0 = &v1;
    v4 = &v3;
    v5 = a0;
    v3 = &v4;
    v8 = &v7;
    v7 = &v8;
    v6 = 1;
    std::__1::mutex::lock();
    if (sub_60768(a0 + 1, 2) && *(long long *)&a0->padding_58[8])
    {
        v11 = sub_63c20(&v5);
        if (!*(long long *)(*(long long *)&a0->padding_58[8] + 32))
            return v11;
        v8 = &v7;
        v7 = &v8;
        v5 = a0;
        v6 = 1;
        std::__1::mutex::lock(a0);
        if (sub_60768(a0 + 1, 2))
        {
            v12 = a0->field_48;
            if (v12)
            {
                v13 = sub_63c20(&v5);
                goto LABEL_224b34;
            }
            else if (a0->field_68)
            {
                v12 = a0->field_68->field_28;
                a0->field_48 = v12;
                v13 = sub_63c20(&v5);
                if (!v12)
                    return v13;
LABEL_224b34:
                if (*(long long *)(v12 + 80) == g_f0d198->field_60->field_680)
                    return v13;
                if (a0->field_40 == 3)
                {
                    if ((int)(a1->field_58 - a1->field_48 >> 4) >= 1)
                    {
                        v14 = a1->field_2;
                        if (v14 >> 2 & 1)
                        {
                            v15 = a1->field_50;
                            a1->field_2 = (char)v14 & 251;
                            a1->field_78 = v15->field_20;
                            v15->field_20 = a1;
                        }
                        g_f0d3d8->field_178();
                    }
                    else
                    {
                        g_f0d3d8->field_d0();
                    }
                }
                v4 = &v3;
                v5 = a0;
                v3 = &v4;
                v8 = &v7;
                v7 = &v8;
                v6 = 1;
                std::__1::mutex::lock(a0);
                if (sub_60768(a0 + 1, 2))
                {
                    if ((int)a0->field_50)
                    {
                        sub_63c20(&v5);
                        goto LABEL_225278;
                    }
                    else if (a0->field_68)
                    {
                        v16 = *(int *)&a0->field_68[1].padding_0[4];
                        *(unsigned int *)&a0->field_50 = v16;
                        v17 = sub_63c20(&v5);
                        if (!v16)
                            return v17;
LABEL_225278:
                        v2 = 0xffffffff;
                        v18 = sub_8b4808(v12, &v2);
                        v19 = v18;
                        v20 = v18[11];
                        i = v18[9];
                        if (i > v18[11])
                        {
                            do
                            {
                                v19[11] = v20 + 16;
                                *(unsigned int *)(v20 + 12) = 0;
                                v20 = v19[11];
                                i = v19[9];
                            } while (v19[11] < i);
                        }
                        v19[11] = i;
                        g_f0d3d8->field_b8();
                    }
                }
            }
        }
    }
    return sub_63c20(&v5);
}
