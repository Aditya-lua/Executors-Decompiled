/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb051f8..0xb052f4 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b051f8_0 {
    char padding_0[32];
    char field_20;
    char padding_21[75];
    char field_6c;
    char padding_6d[579];
    char field_2b0;
    char padding_2b1[31];
    struct st_b051f8_1 *field_2d0;
} st_b051f8_0;

typedef struct st_b051f8_1 {
    unsigned long long field_0;
} st_b051f8_1;

extern char g_1000001;

unsigned long long sub_b051f8(st_b051f8_0 *a0, unsigned long long a1, long long *a2, unsigned long a3, unsigned long long a4, long long a5)
{
    unsigned long long v2;  // w0
    unsigned long v3;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (unsigned int)sub_a2f9e0();
    if (!v2)
        return v2;
    if (!*(long long *)&a0->field_2b0 || !*(long long *)&a0->padding_2b1[7])
        return 0;
    if ((unsigned long long)a5 < 16)
    {
        return 0;
    }
    else if (!a4)
    {
        return 0;
    }
    else if (a1)
    {
        v3 = a0->field_6c;
        if (!(v3 >> 2 & 1))
        {
            return 0;
        }
        else if ((unsigned long long)a5 >= &g_1000001)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/cipher_aes_xts.c", 202, "aes_xts_cipher");
            sub_a36abc(57, 148, 0);
        }
        else if (a0->field_2d0)
        {
            a0->field_2d0();
        }
        else if (!sub_a98764(&a0->field_2b0, &a0->field_20, a4, a1, a5, __ROL__((unsigned int)v3, 31) & 0x80000001 & 1))
        {
            *a2 = a5;
            return 1;
        }
    }
    else
    {
        return 0;
    }
    return 0;
}
