/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa17b90..0xa17c40 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a17b90_0 {
    int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_a17b90_0;


st_a17b90_0 * sub_a17b90(long long a0)
{
    st_a17b90_0 *v6;  // x19
    unsigned long v0;  // [bp-0x38]
    st_a17b90_0 *v1;  // [bp-0x30]
    st_a17b90_0 *v2;  // [bp-0x24]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = (st_a17b90_0 *)0;
    v1 = 0;
    sub_9cf830(0, &v2, &v1, a0);
    switch (v2)
    {
    case 16:
        v0 = v1->field_8;
        if (sub_a15f74(0, &v0, v1->field_0))
            v6 = sub_a1abcc() == 1172;
        else
            v6 = 0;
        sub_a1a174();
        return v6;
    case 6:
        return sub_a99eac(v1) == 1172;
    default:
        return 0;
    }
}
