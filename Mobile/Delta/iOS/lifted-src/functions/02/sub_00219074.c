/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x219074..0x21922c (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_219074_3 {
    struct st_219074_0 *field_0;
} st_219074_3;

typedef struct st_219074_0 {
    char field_0;
} st_219074_0;

typedef struct st_219074_5 {
    unsigned long long field_0;
} st_219074_5;

typedef struct st_219074_1 {
    char padding_0[257];
    char field_101;
} st_219074_1;

typedef struct st_219074_4 {
    char padding_0[184];
    struct st_219074_5 *field_b8;
} st_219074_4;

typedef struct st_219074_2 {
    char padding_0[96];
    struct st_219074_1 *field_60;
} st_219074_2;

extern st_219074_2 *g_f0d198;
extern st_219074_4 *g_f0d3d8;

long long sub_219074(unsigned long long *a0)
{
    char v10;  // x0
    char idx;  // x20
    char v12;  // x21
    st_219074_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_219074_0 *v1;  // [bp-0x68]
    st_219074_0 **v2;  // [bp-0x60], Other Possible Types: char
    st_219074_0 *v3;  // [bp-0x58]
    st_219074_0 *v4;  // [bp-0x50], Other Possible Types: char
    long long v5;  // [bp-0x48]
    st_219074_0 **v6;  // [bp-0x40], Other Possible Types: st_219074_3 **, char
    st_219074_0 *v7;  // [bp-0x38], Other Possible Types: st_219074_0 **, st_219074_3 **, char
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v4 = &v7;
    v7 = &v4;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v10 = sub_2194ec(a0, 1);
        if (v10)
        {
            idx = *(long long *)(v10 + 24);
            if (idx)
            {
                v7 = &v6;
                v6 = &v7;
                v4 = idx;
                v5 = 1;
                std::__1::mutex::lock(idx);
                if (sub_60768(idx + 112, 2))
                {
                    v12 = *(long long *)(idx + 72);
                    if (v12)
                    {
                        sub_63c20(&v4);
LABEL_219120:
                        if (*(long long *)(v12 + 80) == a0[10])
                        {
                            v3 = &v2;
                            v4 = idx;
                            v2 = &v3;
                            v7 = &v6;
                            v6 = &v7;
                            v5 = 1;
                            std::__1::mutex::lock(idx);
                            if (!sub_60768(idx + 112, 2))
                            {
LABEL_2191e0:
                            }
                            else if (!*(int *)(idx + 80))
                            {
                                if (!*(long long *)(idx + 104))
                                    goto LABEL_2191e0;
                                *(int *)(idx + 80) = *(int *)(*(long long *)(idx + 104) + 52);
                            }
                            sub_63c20(&v4);
                            g_f0d3d8->field_b8();
                        }
                    }
                    else
                    {
                        if (!*(long long *)(idx + 104))
                            goto LABEL_2191ac;
                        v12 = *(long long *)(*(long long *)(idx + 104) + 40);
                        *(unsigned long long *)(idx + 72) = v12;
                        sub_63c20(&v4);
                        if (v12)
                            goto LABEL_219120;
                    }
                }
                else
                {
LABEL_2191ac:
                    sub_63c20(&v4);
                }
                *(unsigned int *)(a0[11] + 12) = 0;
                a0[11] = a0[11] + 16;
                return 1;
            }
        }
    }
    sub_c60dec(a0);
}
