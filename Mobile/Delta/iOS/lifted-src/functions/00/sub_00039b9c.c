/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x39b9c..0x39c60 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_39b9c_1 {
    char padding_0[24];
    long long field_18;
} st_39b9c_1;

typedef struct st_39b9c_0 {
    char field_0;
} st_39b9c_0;

extern long long g_cbed28;

long long sub_39b9c(unsigned long long *a0, unsigned int *a1)
{
    st_39b9c_1 *v6;  // x0
    unsigned long long v7;  // x0
    st_39b9c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_39b9c_0 *v1;  // [bp-0x48]
    char v2;  // [bp-0x39]
    unsigned int *v3;  // [bp-0x38], Other Possible Types: unsigned long
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = sub_400fc(a0 + 3);
    if (!v6)
    {
        v3 = *a1;
        sub_f2b8(a0, &v3);
        v3 = a1;
        v7 = sub_3e424(a0 + 3, a1, &g_cbed28, &v3, &v2);
        *(unsigned long long *)(v7 + 24) = ((long long)(a0[1] - *a0) >> 3) - 1;
        return a0[1] - 4;
    }
    return sub_3a064(a0, v6->field_18) + 4;
}
