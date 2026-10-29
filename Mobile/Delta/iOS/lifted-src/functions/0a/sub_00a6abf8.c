/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6abf8..0xa6ac44 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6abf8_0 {
    char padding_0[16];
    unsigned int field_10;
} st_a6abf8_0;


st_a6abf8_0 * sub_a6abf8(st_a6abf8_0 **a0, st_a6abf8_0 **a1)
{
    st_a6abf8_0 *v0;  // x8
    st_a6abf8_0 *v1;  // x9
    unsigned long long v2;  // 4110

    v0 = *a0;
    v1 = *a1;
    if (v0 == v1)
    {
        return 0;
    }
    else if (!v0)
    {
        return 1;
    }
    else if (!v1)
    {
        return 0xffffffff;
    }
    else if (v0->field_10 == v1->field_10)
    {
        return 0;
    }
    else
    {
        v2 = arm64g_calculate_condition(195, v0->field_10, v1->field_10, 0);
        if (!(v2 & 1))
            return 0;
        return 0xffffffff;
    }
}
