/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc26950..0xc2724c (2300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c26950_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_c26950_0;

typedef struct st_c26950_1 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_c26950_1;

extern char g_c269d8;
extern st_c26950_1 g_e06b9e;

unsigned long long * sub_c26950(unsigned long long *a0, st_c26950_0 *a1, st_c26950_0 *a2)
{
    unsigned long long v4;  // x8
    unsigned long long *v0;  // [bp-0x248]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (*a0 - a0[2] >= (a2 - a1 >> 3) * 1117984489315730401)
    {
        v0 = a0;
        if (a1 == a2)
        {
            v0[2] = a0[2];
            return a0;
        }
    }
    else
    {
        sub_c736c8();
        v0 = a0;
        if (a1 == a2)
        {
            v0[2] = a0[2];
            return a0;
        }
    }
    v4 = 9;
    if (11 < a1->field_18)
        v4 = a1->field_18 - 12;
    goto *((void *)(&(&g_c269d8)[4 * (&g_e06b9e.field_0)[v4]]));
}
