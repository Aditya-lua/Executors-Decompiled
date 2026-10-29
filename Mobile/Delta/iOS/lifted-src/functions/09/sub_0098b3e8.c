/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98b3e8..0x98b428 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98b3e8_1 {
    char padding_0[192];
    long long field_c0;
} st_98b3e8_1;

typedef struct st_98b3e8_0 {
    char padding_0[112];
    struct st_98b3e8_0 *field_70;
} st_98b3e8_0;


st_98b3e8_0 * sub_98b3e8(long long a0, unsigned int a1, st_98b3e8_1 *a2)
{
    unsigned long long v2;  // 4117
    st_98b3e8_0 *v3;  // x0
    st_98b3e8_0 **v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = arm64g_calculate_condition(2, a0, 1, 0);
    if (!(v2 & 1))
    {
        v3 = sub_98952c(a2->field_c0, a0);
        if (!v3)
            return v3;
        v4 = &v3->field_70;
    }
    else
    {
        v4 = &a2->padding_0[8 * a1 + 288];
    }
    return *v4;
}
