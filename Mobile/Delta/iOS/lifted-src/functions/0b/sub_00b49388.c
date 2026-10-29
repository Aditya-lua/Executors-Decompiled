/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb49388..0xb49450 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b49388_1 {
    char padding_0[224];
    long long field_e0;
    char padding_e8[8];
    struct st_b49388_0 *field_f0;
} st_b49388_1;

typedef struct st_b49388_0 {
    char padding_0[24];
    long long field_18;
} st_b49388_0;


long long sub_b49388(st_b49388_1 *a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6)
{
    st_b49388_0 *v2;  // x26
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_f0;
    v3 = sub_a3f728(sub_a3f73c(v2->field_18));
    v2->field_18 = v3;
    if (v3 && sub_b497e0(a0, &v2[1].padding_0[8], 0xff, a1, a2, a3, a4, a5, a6))
        return sub_b497e0(a0, &v2[4].padding_0[23], 0, &v2[1].padding_0[8], a0->field_e0, 0, 0, 0, 0);
    return 0;
}
