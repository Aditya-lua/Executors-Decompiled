/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x223b90..0x223c38 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_223b90_0 {
    unsigned int field_0;
    char padding_4[8];
    long long field_c;
} st_223b90_0;

typedef struct st_223b90_1 {
    char padding_0[88];
    struct st_223b90_0 *field_58;
} st_223b90_1;

typedef struct st_223b90_2 {
    char field_0;
} st_223b90_2;

typedef struct st_223b90_3 {
    char padding_0[257];
    char field_101;
} st_223b90_3;

typedef struct st_223b90_4 {
    char padding_0[96];
    struct st_223b90_3 *field_60;
} st_223b90_4;

extern st_223b90_4 *g_f0d198;

long long sub_223b90(st_223b90_1 *a0)
{
    char v6;  // x0
    st_223b90_0 *v7;  // x9
    st_223b90_2 **v0;  // [bp-0x40], Other Possible Types: char
    st_223b90_2 *v1;  // [bp-0x38]
    st_223b90_2 **v2;  // [bp-0x30], Other Possible Types: char
    st_223b90_2 *v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v6 = sub_2194ec(a0, 1);
        if (v6 && *(long long *)(v6 + 24))
        {
            v7 = a0->field_58;
            v7->field_0 = *(int *)(*(long long *)(v6 + 24) + 64) == 3;
            *(unsigned int *)&(v7->padding_4)[1] = 1;
            a0->field_58 = &a0->field_58->field_c;
            return 1;
        }
    }
    sub_c60dec(a0);
}
