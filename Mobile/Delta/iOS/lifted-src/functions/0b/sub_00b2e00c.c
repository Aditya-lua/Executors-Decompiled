/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2e00c..0xb2e1a4 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2e00c_0 {
    struct st_b2e00c_0 *field_0;
    char field_8;
    char padding_9[23];
    unsigned long long field_20;
    uint128_t field_28;
    uint128_t field_38;
    uint128_t field_48;
    uint128_t field_58;
    uint128_t field_68;
    uint128_t field_78;
    uint128_t field_88;
    uint128_t field_98;
    unsigned long long field_a8;
    long long field_b0;
    long long field_b8;
    long long field_c0;
    long long field_c8;
    unsigned int field_d0;
} st_b2e00c_0;


st_b2e00c_0 * sub_b2e00c(st_b2e00c_0 *a0)
{
    st_b2e00c_0 *v2;  // x19
    st_b2e00c_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(216, "providers/implementations/kdfs/hmacdrbg_kdf.c", 47);
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/hmacdrbg_kdf.c", 49, "hmac_drbg_kdf_new");
        sub_a36abc(57, 0xc0100, 0);
        return v2;
    }
    *(long long *)((char *)&v2->field_98 + 8) = *(long long *)((char *)&a0->field_98 + 8);
    if ((!a0->field_0 || (v3 = sub_a57f5c(a0->field_0), v2->field_0 = v3, v3)) && sub_afe05c(&v2->field_8, &a0->field_8))
    {
        *(int128_t *)&(&v2->field_20)[1] = *(int128_t *)&(&a0->field_20)[1];
        *(int128_t *)((char *)&v2->field_28 + 8) = *(int128_t *)((char *)&a0->field_28 + 8);
        *(int128_t *)((char *)&v2->field_38 + 8) = *(int128_t *)((char *)&a0->field_38 + 8);
        *(int128_t *)((char *)&v2->field_48 + 8) = *(int128_t *)((char *)&a0->field_48 + 8);
        *(int128_t *)((char *)&v2->field_58 + 8) = *(int128_t *)((char *)&a0->field_58 + 8);
        *(int128_t *)((char *)&v2->field_68 + 8) = *(int128_t *)((char *)&a0->field_68 + 8);
        *(int128_t *)((char *)&v2->field_78 + 8) = *(int128_t *)((char *)&a0->field_78 + 8);
        *(int128_t *)((char *)&v2->field_88 + 8) = *(int128_t *)((char *)&a0->field_88 + 8);
        v2->field_20 = a0->field_20;
        if (sub_afe694(a0->field_a8, a0->field_b8, &v2->field_a8, &v2->field_b8) && sub_afe694(a0->field_b0, a0->field_c0, &v2->field_b0, &v2->field_c0))
        {
            *(int *)&v2->field_c8 = a0->field_c8;
            return v2;
        }
    }
    sub_a57f0c(v2->field_0);
    sub_afe028(&v2->field_8);
    sub_a6c4e8(v2->field_a8, v2->field_b8, "providers/implementations/kdfs/hmacdrbg_kdf.c", 64);
    sub_a6c4e8(v2->field_b0, v2->field_c0, "providers/implementations/kdfs/hmacdrbg_kdf.c", 65);
    sub_a66ec0(v2, 216);
    *(long long *)((char *)&v2->field_98 + 8) = *(long long *)((char *)&v2->field_98 + 8);
    sub_a6c2e4(v2, "providers/implementations/kdfs/hmacdrbg_kdf.c", 76);
    return 0;
}
