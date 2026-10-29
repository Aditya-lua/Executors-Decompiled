/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb811b4..0xb81238 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b811b4_0 {
    unsigned long long field_0;
    void* field_8;
    struct st_b811b4_0 *field_10;
    char field_18;
} st_b811b4_0;


unsigned long long sub_b811b4(st_b811b4_0 *a0)
{
    st_b811b4_0 *iter;  // x19
    unsigned long v3;  // x8
    unsigned int v4;  // w8
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    iter = a0;
    v3 = a0->field_0;
    if (a0->field_0 == 9)
    {
        do
        {
            v4 = iter->field_18;
            if (2 <= v4 - 13)
                return 6 > v4 - 7;
            v5 = sub_b811b4(iter->field_8);
            if (!(unsigned int)v5)
                return v5;
            iter = iter->field_10;
            v3 = iter->field_0;
        } while (iter->field_0 == 9);
    }
    if (v3 != 6)
        return 0;
    return iter->field_8 == 0x8000000000000001;
}
