/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa550c..0xaa5618 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa550c_3 {
    struct st_aa550c_2 *field_0;
    unsigned long long field_8;
} st_aa550c_3;

typedef struct st_aa550c_2 {
    char padding_0[32];
    unsigned long long field_20;
} st_aa550c_2;

typedef struct st_aa550c_0 {
    unsigned long long field_0;
    char padding_8[24];
    struct st_aa550c_1 *field_20;
} st_aa550c_0;

typedef struct st_aa550c_1 {
    unsigned long long field_0;
} st_aa550c_1;


st_aa550c_0 * sub_aa550c(unsigned long a0, long long *a1, st_aa550c_3 *a2)
{
    st_aa550c_0 *v2;  // x0
    unsigned int v3;  // w25
    unsigned long v4;  // x22
    st_aa550c_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad69e4(a1[1]);
    if ((int)(unsigned int)v2 < 1)
        return v2;
    v3 = (unsigned int)v2 + 1;
    while (1)
    {
        v4 = v3 - 2;
        v5 = sub_ad69f8(a1[1], v4);
        if (v5->field_0 == a2->field_8)
        {
            sub_ad664c(a1[1], v4);
            v5->field_20();
        }
        v3 -= 1;
        if (v3 <= 1)
            return v5;
    }
}
