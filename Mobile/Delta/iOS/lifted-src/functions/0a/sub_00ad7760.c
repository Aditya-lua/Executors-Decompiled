/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad7760..0xad77bc (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad7760_0 {
    unsigned int field_0;
    char padding_4[12];
    unsigned long long field_10;
} st_ad7760_0;


long long sub_ad7760(st_ad7760_0 *a0, unsigned long a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0->field_0 != 1)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/store/store_lib.c", 644, "OSSL_STORE_INFO_set0_NAME_description");
        sub_a36abc(44, 0x80106, 0);
        return 0;
    }
    a0->field_10 = a1;
    return 1;
}
