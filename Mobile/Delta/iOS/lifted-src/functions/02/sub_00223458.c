/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x223458..0x22355c (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_223458_0 {
    char padding_0[88];
    void* field_58;
} st_223458_0;

typedef struct st_223458_1 {
    char field_0;
} st_223458_1;

typedef struct st_223458_2 {
    char padding_0[257];
    char field_101;
} st_223458_2;

typedef struct st_223458_3 {
    char padding_0[96];
    struct st_223458_2 *field_60;
} st_223458_3;

extern st_223458_3 *g_f0d198;

int sub_223458(st_223458_0 *a0)
{
    char v10;  // x0
    char v11;  // w20
    void* v12;  // x8
    st_223458_1 **v0;  // [bp-0x70], Other Possible Types: char
    st_223458_1 *v1;  // [bp-0x68]
    st_223458_1 **v2;  // [bp-0x60], Other Possible Types: char
    st_223458_1 *v3;  // [bp-0x58]
    st_223458_1 *v4;  // [bp-0x50], Other Possible Types: char
    char v5;  // [bp-0x48]
    st_223458_1 **v6;  // [bp-0x40], Other Possible Types: char
    st_223458_1 *v7;  // [bp-0x38], Other Possible Types: st_223458_1 **, char
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
        if (v10 && *(long long *)(v10 + 24))
        {
            v3 = &v2;
            v4 = *(long long *)(v10 + 24);
            v2 = &v3;
            v7 = &v6;
            v6 = &v7;
            v5 = 1;
            std::__1::mutex::lock(v4);
            if (sub_60768(v4 + 112, 2) && *(long long *)(v4 + 96))
                v11 = *(long long *)(*(long long *)(v4 + 96) + 32) != 0;
            else
                v11 = 0;
            sub_63c20(&v4);
            v12 = a0->field_58;
            *(unsigned int *)v12 = v11;
            *(unsigned int *)&v12[12] = 1;
            a0->field_58 = a0->field_58 + 16;
            return 1;
        }
    }
    sub_c60dec(a0);
}
