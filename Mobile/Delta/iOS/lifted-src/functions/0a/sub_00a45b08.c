/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa45b08..0xa45bf4 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a45b08_0 {
    char padding_0[280];
    unsigned int field_118;
    unsigned int field_11c;
    char padding_120[8];
    unsigned int field_128;
    unsigned int field_12c;
} st_a45b08_0;


unsigned long long sub_a45b08(long long a0, long long a1, unsigned long long a2)
{
    st_a45b08_0 *v2;  // x0
    st_a45b08_0 *v3;  // x20
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    if (!a1 && !a2)
        return 1;
    v3 = v2;
    if (a1)
    {
        v4 = sub_9bf864(a1, sub_a50904(a0) * 8, v3);
        sub_a93220(&v3[1].padding_0[8], v3->field_12c, v3->field_128, v3, " )");
        if (v4 >> 31 & 1)
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/e_aria.c", 525, "aria_ccm_init_key");
            sub_a36abc(6, 176, 0);
            return 0;
        }
        *(unsigned long long *)&v3[1].padding_0[64] = 0;
        v3->field_118 = 1;
    }
    if (!a2)
        return 1;
    _memcpy(a0 + 40, a2, 15 - v3->field_128);
    v3->field_11c = 1;
    return 1;
}
