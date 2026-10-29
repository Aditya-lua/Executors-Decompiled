/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3fe10..0xa3ff18 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3fe10_1 {
    unsigned int field_0;
} st_a3fe10_1;

typedef struct st_a3fe10_0 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[8];
    struct st_a3fe10_1 *field_28;
} st_a3fe10_0;


unsigned int sub_a3fe10(st_a3fe10_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned int *v2;  // x10
    unsigned int v3;  // w9
    long long v4;  // x1
    unsigned int v5;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2)
        return 1;
    if (!(a0->field_18 >> 11 & 1))
    {
        v2 = a0->field_28;
        if (v2 && !(v3 = *v2, !(v3 & 49648) || !*(long long *)&v2[12]))
        {
            switch (v3)
            {
            default:
                sub_a368c8();
                v4 = 412;
                break;
            }
        }
        else
        {
            v5 = *(long long *)&a0->padding_0[8];
            if (!v5 || a0->field_18 >> 8 & 1 || !*(long long *)(v5 + 112))
            {
                if (!*(long long *)&a0[1].padding_0[0])
                    return 0;
                goto *((void *)(*(long long *)&a0[1].padding_0[0]));
            }
            else if (*(long long *)(v5 + 144))
            {
                goto *((void *)(*(long long *)(v5 + 144)));
            }
            else
            {
                sub_a368c8();
                v4 = 422;
            }
        }
    }
    else
    {
        sub_a368c8();
        v4 = 391;
    }
    sub_a369bc("crypto/evp/digest.c", v4, "EVP_DigestUpdate");
    sub_a36abc(6, 189, 0);
    return 0;
}
