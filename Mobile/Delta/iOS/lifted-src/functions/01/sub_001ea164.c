/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ea164..0x1ea258 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ea164_3 {
    unsigned int field_0;
    char padding_4[8];
    unsigned int field_c;
} st_1ea164_3;

typedef struct st_1ea164_0 {
    char padding_0[384];
    unsigned long long field_180;
} st_1ea164_0;

typedef struct st_1ea164_2 {
    char padding_0[88];
    struct st_1ea164_3 *field_58;
} st_1ea164_2;

typedef struct st_1ea164_1 {
    char padding_0[96];
    struct st_1ea164_0 *field_60;
} st_1ea164_1;

extern st_1ea164_1 *g_f0d198;
extern char g_10002b0;

int sub_1ea164(st_1ea164_2 *a0)
{
    st_1ea164_0 *v8;  // x8
    unsigned int *v9;  // x9
    unsigned long long i;  // [bp-0x48]
    double v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x2b]
    unsigned long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v8 = g_f0d198->field_60;
    v1 = 5.03338568247029e-234;
    v2 = 0;
    v3 = 0;
    v4 = 0;
    i = 0;
    if (28 >= i)
    {
        do
        {
            *((char *)&v1 + i) = (unsigned int)i + 2563270913 + *((char *)&v1 + i) - ((unsigned int)i + 2563270913 & *((char *)&v1 + i)) * 2 - 7;
            i += 1;
        } while (i < 29);
    }
    v9 = &a0->field_58->field_0;
    *v9 = !(*(unsigned long long *)&v1 & ~v8->field_180);
    v9[3] = 1;
    a0->field_58 = a0->field_58 + 1;
    if (*(long long *)&g_10002b0 == v5)
        return 1;
    ___stack_chk_fail();
}
