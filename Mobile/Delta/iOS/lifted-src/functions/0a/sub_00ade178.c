/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xade178..0xade218 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ade178_1 {
    char padding_0[25];
    char field_19;
} st_ade178_1;

typedef struct st_ade178_0 {
    char field_0;
    char padding_1[7];
    long long field_8;
    char padding_10[8];
    long long field_18;
} st_ade178_0;


char sub_ade178(st_ade178_1 *a0, st_ade178_0 **a1, long long a2)
{
    st_ade178_0 *v2;  // x21
    char v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a1;
    if (!(a0->field_19 >> 2 & 1) && v2->field_0 & 3)
    {
        if ((int)sub_ad69e4(v2->field_18) < 1)
            return 0;
        v3 = 0;
        do
        {
            if (!sub_a9ae30(sub_ad69f8(v2->field_18, v3), a2))
                return 1;
        } while ((v3 += 1, v3 < (int)sub_ad69e4(v2->field_18)));
        return 0;
    }
    return !sub_a9ae30(v2->field_8, a2);
}
