/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4312c..0xa43264 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4312c_0 {
    char padding_0[248];
    unsigned int field_f8;
    unsigned int field_fc;
    char padding_100[8];
    int field_108;
} st_a4312c_0;

extern unsigned int g_f0d568;

unsigned int sub_a4312c(long long a0, long long a1, unsigned int a2)
{
    st_a4312c_0 *v2;  // x0
    st_a4312c_0 *v3;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    if (!a1 && !a2)
        return 1;
    v3 = v2;
    if (a1)
    {
        if ((int)sub_a50904(a0) >= 1)
        {
            if (g_f0d568 >> 2 & 1)
            {
                sub_9b9440(a1);
            }
            else if (!(g_f0d568 & 1))
            {
                sub_9b8880(a1);
            }
            else
            {
                sub_9bf0e0(a1);
            }
            sub_a93220(&v3[1].padding_0[12]);
            *(unsigned long long *)&v3[1].padding_0[0x44] = 0;
            v3->field_f8 = 1;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/e_aes.c", 3493, "aes_ccm_init_key");
            sub_a36abc(6, 130, 0);
            return 0;
        }
    }
    if (!a2)
        return 1;
    _memcpy(a0 + 40, a2, 15 - v3->field_108);
    v3->field_fc = 1;
    return 1;
}
