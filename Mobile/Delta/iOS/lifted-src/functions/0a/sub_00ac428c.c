/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac428c..0xac44b8 (556 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac428c_2 {
    char padding_0[160];
    struct st_ac428c_3 *field_a0;
    struct st_ac428c_0 *field_a8;
} st_ac428c_2;

typedef struct st_ac428c_3 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[12];
    unsigned int field_20;
    unsigned int field_24;
} st_ac428c_3;

typedef struct st_ac428c_1 {
    unsigned long long field_0;
} st_ac428c_1;

typedef struct st_ac428c_0 {
    char padding_0[80];
    struct st_ac428c_1 *field_50;
} st_ac428c_0;

extern char g_10002b0;

long long sub_ac428c(st_ac428c_2 **a0, char *a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long long a5)
{
    unsigned int *v9;  // x11
    unsigned long v10;  // x26
    unsigned int v11;  // w8
    unsigned int v12;  // x9
    unsigned int v13;  // x10
    unsigned long v14;  // x27
    unsigned int *iter;  // x12
    char *v16;  // x1
    unsigned int v0;  // [bp-0x15c]
    unsigned int v1;  // [bp-0x158]
    unsigned long v2;  // [bp-0x150]
    unsigned long long v3;  // [bp-0x148]
    char v4;  // [bp-0x13c]
    unsigned int v5;  // [bp-0x11c]
    unsigned long v6;  // [bp-0x70]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v3 = a5;
    v6 = *(long long *)&g_10002b0;
    v9 = *a0->field_a0;
    v10 = v9[9];
    if ((unsigned int)v10)
    {
        v11 = 0;
        v12 = 0;
        v13 = 0;
        v2 = v9[4];
        v14 = v9[8];
        v0 = 1 << ((char)v14 & 31);
        iter = &v5;
        while (1)
        {
            if (v12 < (unsigned int)v14)
            {
                v16 = a1 + 1;
                v11 = *a1 | v11 * 0x100;
                v12 += 8;
                a1 = v16;
            }
            else
            {
                v12 -= v14;
                *iter = v11 >> ((char)v12 & 31) & ~(0xffffffff << ((char)v14 & 31));
                iter += 1;
                v13 += 1;
                if (v13 == v10)
                    break;
            }
        }
        v1 = 0;
        *a0->field_a8->field_50();
    }
    else
    {
        sub_a66ec0(&v4, 32);
        if (*(long long *)&g_10002b0 == v6)
            return 1;
        ___stack_chk_fail();
    }
}
