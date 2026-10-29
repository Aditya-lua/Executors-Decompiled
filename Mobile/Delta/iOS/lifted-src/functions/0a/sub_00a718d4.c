/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa718d4..0xa71994 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a718d4_0 {
    struct st_a718d4_0 *field_0;
    char padding_8[8];
    struct st_a718d4_0 *field_10;
    struct st_a718d4_0 *field_18;
    char padding_20[8];
    struct st_a718d4_0 *field_28;
} st_a718d4_0;


unsigned long long sub_a718d4(st_a718d4_0 *a0, st_a718d4_0 *a1, st_a718d4_0 **a2, st_a718d4_0 **a3)
{
    st_a718d4_0 *v5;  // x21
    unsigned long long v6;  // x0
    st_a718d4_0 *v0;  // [bp-0x48]
    st_a718d4_0 *v1;  // [bp-0x40]
    st_a718d4_0 *v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!a0 || !a1 || !a0->field_0)
        return 0xffffffff;
    do
    {
        v5 = a0;
        if (!_strcmp(a1))
        {
            v0 = 0;
            v1 = 0;
            if (v5->field_10 && v5->field_18)
            {
                v2 = 0;
                v6 = sub_a712cc(v5, &v1, &v2, &v0, 5);
                if (!(unsigned int)v6)
                    return v6;
            }
            sub_a6c4e8(*a2, *a3, "crypto/params.c", 1573);
            *a2 = v1;
            *a3 = v0;
            return 1;
        }
    } while ((a0 = &v5->field_28, v5->field_28));
    return 0xffffffff;
}
