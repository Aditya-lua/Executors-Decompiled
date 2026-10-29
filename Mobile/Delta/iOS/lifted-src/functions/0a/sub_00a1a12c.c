/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1a12c..0xa1a174 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1a12c_0 {
    char padding_0[152];
    unsigned int field_98;
    char padding_9c[4];
    long long field_a0;
} st_a1a12c_0;


st_a1a12c_0 * sub_a1a12c(st_a1a12c_0 *a0)
{
    st_a1a12c_0 *v2;  // x0
    st_a1a12c_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_98 != 6)
    {
        v2 = a0;
        if (v2->field_98 == 5)
            v2 = sub_a224e4(a0->field_a0);
    }
    else
    {
        v2 = sub_a1c668(a0->field_a0);
    }
    v3 = v2;
    a0->field_a0 = 0;
    return v3;
}
