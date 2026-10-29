/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2a660..0xb2a728 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2a660_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[64];
    uint128_t field_4c;
    unsigned int field_5c;
    char padding_60[4];
    unsigned int field_64;
    char padding_68[24];
    unsigned long long field_80;
} st_b2a660_0;


double sub_b2a660(long long a0)
{
    unsigned long v2;  // x0
    st_b2a660_0 *ptr;  // x20
    unsigned long long v4;  // x0
    unsigned long long v5;  // d0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return v5;
    v2 = sub_a6bffc(160, "providers/implementations/kdfs/argon2.c", 950);
    if (v2)
    {
        ptr = v2;
        v4 = sub_9f2aec(a0);
        memset(ptr, 0, 160);
        *(unsigned long long *)&ptr->padding_68[20] = v4;
        ptr->field_8 = 64;
        *(uint128_t *)&(ptr->padding_c)[1] = 0x1000000010000000800000003;
        *(unsigned int *)((char *)&ptr->field_4c + 12) = 19;
        *(unsigned int *)ptr->padding_60 = 1;
        return 34359738371;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/kdfs/argon2.c", 952, "kdf_argon2i_new");
    sub_a36abc(57, 0xc0100, 0);
    return v5;
}
