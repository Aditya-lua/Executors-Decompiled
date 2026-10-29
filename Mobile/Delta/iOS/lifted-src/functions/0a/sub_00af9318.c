/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf9318..0xaf93bc (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af9318_1 {
    uint128_t field_0;
    unsigned int field_10;
} st_af9318_1;

typedef struct st_af9318_0 {
    char padding_0[232];
    unsigned int field_e8;
    char padding_ec[76];
    uint128_t field_138;
    unsigned int field_148;
} st_af9318_0;


int sub_af9318(st_af9318_0 *a0, long long a1, st_af9318_1 *a2, unsigned long a3)
{
    uint128_t v2;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a509f4(a1, "SHA1") && (a0->field_e8 & 0x100100) == 0x100)
    {
        if (a3)
            *(unsigned int *)a3 = 20;
        v2 = *(int128_t *)&(a0->padding_ec)[1];
        a2->field_10 = *(int *)((char *)&a0->field_138 + 8);
        a2->field_0 = v2;
        return 1;
    }
    sub_afc3e0();
}
