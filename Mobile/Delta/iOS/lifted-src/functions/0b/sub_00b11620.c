/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb11620..0xb116bc (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b11620_0 {
    char padding_0[376];
    unsigned long long field_178;
    char padding_180[24];
    struct st_b11620_1 *field_198;
} st_b11620_0;

typedef struct st_b11620_1 {
    unsigned long long field_0;
} st_b11620_1;


int sub_b11620(st_b11620_0 *a0, unsigned long a1, unsigned long long *a2, unsigned long a3)
{
    unsigned int v2;  // w0
    unsigned long long v3;  // 4110
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!v2)
        return v2;
    v3 = arm64g_calculate_condition(2, a0->field_178, 1, 0);
    if (v3 & 1)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/digests/sha3_prov.c", 0x77, "keccak_final");
        sub_a36abc(57, 166, 0);
        return 0;
    }
    else if (a3)
    {
        a0->field_198();
    }
    else
    {
        *a2 = a0->field_178;
        return 1;
    }
}
