/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97b7ac..0x97b82c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97b7ac_0 {
    uint128_t field_0;
    long long field_10;
} st_97b7ac_0;

typedef struct st_97b7ac_1 {
    uint128_t field_0;
    long long field_10;
    long long field_18;
} st_97b7ac_1;

extern long long g_97b978;

st_97b7ac_0 * sub_97b7ac(st_97b7ac_1 *a0)
{
    st_97b7ac_0 *v2;  // x19
    long long v3;  // x3
    long long v4;  // x5
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(168, "ssl/quic/quic_engine.c", 30);
    if (!v2)
        return v2;
    v2->field_0 = a0->field_0;
    v3 = a0->field_10;
    v4 = a0->field_18;
    v2->field_10 = v3;
    if (sub_982bf4(&v2[1].field_10, &g_97b978, v2, v3, 0, v4))
        return v2;
    sub_a6c2e4(v2, "ssl/quic/quic_engine.c", 38);
    return 0;
}
