/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95c8ac..0x95c958 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95c8ac_0 {
    char padding_0[8];
    long long field_8;
    long long field_10;
    unsigned short field_18;
} st_95c8ac_0;

extern st_95c8ac_0 g_e86ac8;

st_95c8ac_0 * sub_95c8ac(unsigned int *a0, long long a1)
{
    st_95c8ac_0 *v2;  // x19
    unsigned long long v3;  // x22
    unsigned long long v4;  // x22
    unsigned long v5;  // x8
    unsigned long v6;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return 0;
    v2 = &g_e86ac8.padding_0[0];
    v3 = 60;
    do
    {
        v4 = v3;
        v5 = v2->field_18;
        v6 = *a0;
        if ((!(v5 >> 3 & 1) || v6 >> 3 & 1) && (!(v5 >> 2 & 1) || v6 >> 2 & 1) && (!(v5 >> 5 & 1) || v6 >> 5 & 1))
        {
            if (v6 & 1 && v2->field_10 && !_strcmp(v2->field_10, a1))
                return v2;
            if (v6 >> 1 & 1 && v2->field_8 && !sub_a6e200(v2->field_8, a1))
                return v2;
        }
    } while ((v2 = &v2[1].padding_0[6], v3 = v4 - 1, v4 != 1));
    return 0;
}
