/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3507c..0xb350d0 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3507c_0 {
    char padding_0[16];
    unsigned long long field_10;
    char padding_18[8];
    unsigned int field_20;
} st_b3507c_0;


st_b3507c_0 * sub_b3507c(long long a0)
{
    st_b3507c_0 *v2;  // x0
    st_b3507c_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(72, "providers/implementations/kem/ec_kem.c", 195);
    if (!v2)
        return v2;
    v3 = v2;
    v3->field_10 = sub_9f2aec(a0);
    v3->field_20 = 1;
    return v3;
}
