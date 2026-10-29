/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50060..0xa50104 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50060_0 {
    char padding_0[16];
    unsigned int field_10;
} st_a50060_0;

extern char g_10002b0;

st_a50060_0 * sub_a50060(unsigned long a0, st_a50060_0 *a1, st_a50060_0 *ptr)
{
    st_a50060_0 *v5;  // x0
    st_a50060_0 *v6;  // x0
    unsigned long long v7;  // 4118
    char v0;  // [bp-0x40]
    char v1;  // [bp-0x38]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = 0;
    v2 = *(long long *)&g_10002b0;
    if (a1 && ptr)
    {
        v6 = sub_9c984c(a1, &v0, &v1, 16);
        v7 = arm64g_calculate_condition(33, (unsigned int)v6 - 0x11, 16, 0);
        if (!(v7 & 1))
        {
            v5 = 0xffffffff;
        }
        else
        {
            _memcpy(ptr, &v1, v6 & 0xffffffff);
            v5 = v6;
            ptr->field_10 = (unsigned int)v5;
        }
    }
    if (*(long long *)&g_10002b0 == v2)
        return v5;
    ___stack_chk_fail();
}
