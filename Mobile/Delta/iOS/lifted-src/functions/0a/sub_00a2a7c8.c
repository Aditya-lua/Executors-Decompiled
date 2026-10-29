/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2a7c8..0xa2a8a4 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2a7c8_0 {
    unsigned long long field_0;
    struct st_a2a7c8_0 *field_8;
    char field_10;
    char padding_11[71];
    unsigned long long field_58;
    unsigned int field_60;
    unsigned int field_64;
} st_a2a7c8_0;

extern unsigned long long g_def000[4];

st_a2a7c8_0 * sub_a2a7c8(unsigned long a0, unsigned int a1, char a2, st_a2a7c8_0 *a3)
{
    st_a2a7c8_0 *v2;  // x0
    st_a2a7c8_0 *v3;  // x8
    st_a2a7c8_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(104, "crypto/ec/ecx_key.c", 23);
    if (!v2)
        return v2;
    v2->field_0 = a0;
    v2->field_10 = v2->field_10 & 254 | a2 & 1;
    if (3 >= a1)
        v2->field_58 = g_def000[a1];
    v2->field_60 = a1;
    /* unsupported instruction */;
    v2->field_64 = 1;
    if (!a3)
        return v2;
    v3 = sub_a6d9b4(a3, "crypto/ec/ecx_key.c", 50);
    v4 = v2;
    v4->field_8 = v3;
    if (v3)
        return v4;
    sub_a6c2e4(0, "crypto/ec/ecx_key.c", 57);
    sub_a6c2e4(v4, "crypto/ec/ecx_key.c", 60);
    return 0;
}
