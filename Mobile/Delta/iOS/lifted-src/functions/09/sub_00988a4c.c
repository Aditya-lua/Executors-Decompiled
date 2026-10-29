/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x988a4c..0x988ae8 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_988a4c_0 {
    struct st_988a4c_0 *field_0;
    struct st_988a4c_0 *field_8;
    struct st_988a4c_0 *field_10;
} st_988a4c_0;


st_988a4c_0 * sub_988a4c(long long a0)
{
    st_988a4c_0 *v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(88, "ssl/quic/quic_sstream.c", 64);
    if (!v2)
        return v2;
    *(uint128_t *)&v2->field_0 = 0;
    *(uint128_t *)&v2->field_10 = 0;
    if (!sub_985ee0(v2, a0, 0))
    {
        sub_a6c2e4(v2->field_0, "include/internal/ring_buf.h", 60);
        v2->field_0 = 0;
        v2->field_8 = 0;
        sub_a6c2e4(v2, "ssl/quic/quic_sstream.c", 71);
        return 0;
    }
    sub_991a38(&v2[1].field_8);
    sub_991a38(&v2[2].field_8);
    return v2;
}
