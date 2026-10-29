/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2193b8..0x2194ec (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2193b8_4 {
    char padding_0[12];
    unsigned int field_c;
} st_2193b8_4;

typedef struct st_2193b8_0 {
    char padding_0[88];
    void* field_58;
} st_2193b8_0;

typedef struct st_2193b8_1 {
    char field_0;
} st_2193b8_1;

typedef struct st_2193b8_2 {
    char padding_0[257];
    char field_101;
    char padding_102[1406];
    unsigned long long field_680;
} st_2193b8_2;

typedef struct st_2193b8_3 {
    char padding_0[96];
    struct st_2193b8_2 *field_60;
} st_2193b8_3;

extern st_2193b8_3 *g_f0d198;

int sub_2193b8(st_2193b8_0 *a0)
{
    char v8;  // x0
    char idx;  // x20
    char v10;  // x22
    void* v11;  // x8
    st_2193b8_4 **v12;  // x19
    st_2193b8_1 **v0;  // [bp-0x60], Other Possible Types: char
    st_2193b8_1 *v1;  // [bp-0x58]
    st_2193b8_1 *v2;  // [bp-0x50], Other Possible Types: char
    char v3;  // [bp-0x48]
    st_2193b8_1 **v4;  // [bp-0x40], Other Possible Types: char
    st_2193b8_1 *v5;  // [bp-0x38], Other Possible Types: st_2193b8_1 **, char
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &v5;
    v5 = &v2;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v8 = sub_2194ec(a0, 1);
        if (v8)
        {
            idx = *(long long *)(v8 + 24);
            if (idx)
            {
                v5 = &v4;
                v4 = &v5;
                v2 = idx;
                v3 = 1;
                std::__1::mutex::lock(idx);
                if (sub_60768(idx + 112, 2))
                {
                    v10 = *(long long *)(idx + 72);
                    if (v10)
                    {
                        sub_63c20(&v2);
                    }
                    else
                    {
                        if (!*(long long *)(idx + 104))
                            goto LABEL_2194a8;
                        v10 = *(long long *)(*(long long *)(idx + 104) + 40);
                        *(unsigned long long *)(idx + 72) = v10;
                        sub_63c20(&v2);
                        if (!v10)
                            goto LABEL_2194b0;
                    }
                    v11 = a0->field_58;
                    v12 = &a0->field_58;
                    *(unsigned int *)v11 = *(long long *)(v10 + 80) != g_f0d198->field_60->field_680;
                }
                else
                {
LABEL_2194a8:
                    sub_63c20(&v2);
LABEL_2194b0:
                    v11 = a0->field_58;
                    v12 = &a0->field_58;
                    *(unsigned int *)v11 = 0;
                }
                *(unsigned int *)&v11[12] = 1;
                *v12 = *v12 + 1;
                return 1;
            }
        }
    }
    sub_c60dec(a0);
}
