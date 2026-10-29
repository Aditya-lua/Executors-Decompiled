/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4aee8..0xb4af7c (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4aee8_0 {
    char padding_0[8];
    struct st_b4aee8_1 *field_8;
    unsigned int field_10;
    char padding_14[20];
    struct st_b4aee8_1 *field_28;
    char padding_30[16];
    struct st_b4aee8_1 *field_40;
    char padding_48[8];
    unsigned int field_50;
} st_b4aee8_0;

typedef struct st_b4aee8_1 {
    char field_0;
} st_b4aee8_1;


char * sub_b4aee8(st_b4aee8_0 *a0, char *a1, unsigned int a2, char *i, char *n)
{
    char *v2;  // x8
    unsigned int v3;  // w9
    unsigned int v4;  // w9
    char *v5;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 > a0->field_10)
        return 0;
    if ((int)a0->field_8)
    {
        if (i)
        {
            v2 = 0;
            do
            {
                v3 = a0->field_50 ^ a0->field_50 * 0x2000;
                v4 = v3 ^ v3 >> 0x11 ^ (v3 ^ v3 >> 0x11) * 32;
                a0->field_50 = v4;
                *(char *)(a1 + v2) = v4;
                v2 += 1;
            } while (i != v2);
            return i;
        }
        else
        {
            return i;
        }
    }
    else
    {
        if (a0->field_28)
        {
            v5 = a0->field_40;
            if (a0->field_40 < n)
                n = v5;
            if (!a1)
                return n;
            _memcpy(a1, a0->field_28, n);
            return n;
        }
    }
    return 0;
}
