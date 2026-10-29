/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb44d58..0xb44e0c (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b44d58_0 {
    char padding_0[8];
    long long field_8;
    char field_10;
    char padding_11[23];
    unsigned long long field_28;
    long long field_30;
    long long field_38;
} st_b44d58_0;


st_b44d58_0 * sub_b44d58(long long a0, long long a1)
{
    st_b44d58_0 *v2;  // x19
    st_b44d58_0 *v3;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b44e0c();
    if (!v2)
        return v2;
    if (sub_afe114(&v2->field_10, a1, sub_9f2aec(a0)))
    {
        v3 = (st_b44d58_0 *)(unsigned int)sub_a50ac8(sub_954340(&v2->field_10));
        if (v3 > 0)
        {
            v2->field_28 = v3;
            return v2;
        }
    }
    sub_a3f73c(v2->field_8);
    sub_afe028(&v2->field_10);
    sub_a66ec0(&v2[1].padding_0[4], v2->field_30);
    sub_a66ec0(&v2[11].padding_11[19], v2->field_38);
    sub_a6c2e4(v2, "providers/implementations/macs/kmac_prov.c", 163);
    return 0;
}
