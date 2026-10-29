/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa576f0..0xa578ec (508 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a576f0_0 {
    char padding_0[168];
    struct st_a576f0_1 *field_a8;
} st_a576f0_0;

typedef struct st_a576f0_2 {
    unsigned int field_0;
    char padding_4[36];
    struct st_a576f0_0 *field_28;
} st_a576f0_2;

typedef struct st_a576f0_3 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[8];
    struct st_a576f0_2 *field_28;
} st_a576f0_3;

typedef struct st_a576f0_1 {
    unsigned long long field_0;
} st_a576f0_1;


unsigned long long sub_a576f0(st_a576f0_3 *a0, unsigned long long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    st_a576f0_2 *v2;  // x24
    st_a576f0_0 *v3;  // x22
    long long v4;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_28;
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/m_sigver.c", 624, "EVP_DigestSign");
        v4 = 134;
    }
    else if (!(a0->field_18 >> 11 & 1))
    {
        if (v2->field_0 == 128 && *(long long *)&v2[1].field_0 && !(v3 = v2->field_28, !v3))
        {
            if (v3->field_a8)
            {
                if (a1)
                {
                    a0->field_18 = a0->field_18 | 0x800;
                    sub_a36c8c();
                }
                else
                {
                    sub_a36c8c();
                }
                v3->field_a8();
            }
        }
        else
        {
            if (*(long long *)&v2[2].padding_4[20] && *(long long *)(*(long long *)&v2[2].padding_4[20] + 208))
                goto *((void *)(*(long long *)(*(long long *)&v2[2].padding_4[20] + 208)));
        }
        if (a1 && (int)sub_a56f14() < 1)
            return 0;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/m_sigver.c", 629, "EVP_DigestSign");
        v4 = 188;
    }
    sub_a36abc(6, v4, 0);
    return 0;
}
