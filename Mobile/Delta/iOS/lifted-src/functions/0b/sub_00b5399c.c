/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5399c..0xb53a40 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5399c_0 {
    unsigned long long field_0;
    struct st_b5399c_0 *field_8;
    char padding_10[9];
    unsigned int field_19;
    char padding_1d[331];
    unsigned long long field_168;
} st_b5399c_0;


st_b5399c_0 * sub_b5399c(long long a0, st_b5399c_0 *a1)
{
    st_b5399c_0 *v2;  // x19
    st_b5399c_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(384, "providers/implementations/signature/sm2_sig.c", 122);
    if (!v2)
        return v2;
    v2->field_0 = sub_9f2aec(a0);
    if (a1)
    {
        v3 = sub_a6d9b4(a1, "providers/implementations/signature/sm2_sig.c", 128);
        v2->field_8 = v3;
        if (!v3)
        {
            sub_a6c2e4(v2, "providers/implementations/signature/sm2_sig.c", 129);
            return 0;
        }
    }
    *(unsigned long long *)&v2->padding_1d[328] = 32;
    *(unsigned int *)&(v2->padding_10)[1] = 3362131;
    return v2;
}
