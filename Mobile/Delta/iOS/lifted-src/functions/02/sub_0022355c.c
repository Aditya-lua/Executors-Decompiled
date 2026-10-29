/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x22355c..0x223688 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_22355c_4 {
    char field_0;
    char padding_1[11];
    char field_c;
} st_22355c_4;

typedef struct st_22355c_3 {
    char padding_0[80];
    unsigned long long field_50;
    struct st_22355c_4 *field_58;
} st_22355c_3;

typedef struct st_22355c_0 {
    char field_0;
} st_22355c_0;

typedef struct st_22355c_1 {
    char padding_0[257];
    char field_101;
} st_22355c_1;

typedef struct st_22355c_2 {
    char padding_0[96];
    struct st_22355c_1 *field_60;
} st_22355c_2;

extern st_22355c_2 *g_f0d198;

long long sub_22355c(st_22355c_3 *a0)
{
    char v8;  // x0
    char idx;  // x20
    char v10;  // x21
    char *v11;  // x8
    st_22355c_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_22355c_0 *v1;  // [bp-0x58]
    st_22355c_0 *v2;  // [bp-0x50], Other Possible Types: char
    long long v3;  // [bp-0x48]
    st_22355c_0 **v4;  // [bp-0x40], Other Possible Types: char
    st_22355c_0 *v5;  // [bp-0x38], Other Possible Types: st_22355c_0 **, char
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
LABEL_223608:
                        if (*(long long *)(v10 + 80) == a0->field_50)
                        {
                            v11 = &a0->field_58->field_0;
                            *(unsigned long long *)v11 = v10;
                            *(unsigned int *)&v11[12] = 10;
                            a0->field_58 = &a0->field_58[1].padding_1[2];
                            return 1;
                        }
                    }
                    else
                    {
                        if (!*(long long *)(idx + 104))
                            goto LABEL_223648;
                        v10 = *(long long *)(*(long long *)(idx + 104) + 40);
                        *(unsigned long long *)(idx + 72) = v10;
                        sub_63c20(&v2);
                        if (v10)
                            goto LABEL_223608;
                    }
                }
                else
                {
LABEL_223648:
                    sub_63c20(&v2);
                }
                *(unsigned int *)&a0->field_58->field_c = 0;
                a0->field_58 = &a0->field_58[1].padding_1[2];
                return 1;
            }
        }
    }
    sub_c60dec(a0);
}
