/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x985e50..0x985ee0 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_985e50_0 {
    char padding_0[48];
    unsigned long long field_30;
    unsigned long long field_38;
    char padding_40[16];
    struct st_985e50_0 *field_50;
    char padding_58[8];
    struct st_985e50_0 *field_60;
} st_985e50_0;


st_985e50_0 * sub_985e50(unsigned long a0, unsigned long a1, long long a2)
{
    st_985e50_0 *v2;  // x20
    st_985e50_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(112, "ssl/quic/quic_rstream.c", 27);
    if (!v2)
        return v2;
    v3 = v2;
    *(uint128_t *)&v3->field_50 = 0;
    *(uint128_t *)&v3->field_60 = 0;
    if (!sub_985ee0(&v3->field_50, a2, 0))
    {
        sub_a6c2e4(v3, "ssl/quic/quic_rstream.c", 0x22);
        return 0;
    }
    sub_987bfc(v3);
    v3->field_30 = a0;
    v3->field_38 = a1;
    return v3;
}
