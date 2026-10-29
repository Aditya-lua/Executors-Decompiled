/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc60e4c..0xc60f2c (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c60e4c_0 {
    char padding_0[8];
    struct st_c60e4c_1 *field_8;
    char padding_10[2472];
    unsigned int field_9b8;
} st_c60e4c_0;

typedef struct st_c60e4c_1 {
    unsigned long long field_0;
} st_c60e4c_1;

extern unsigned long long g_d27b30;

unsigned long long sub_c60e4c(st_c60e4c_0 *a0, unsigned int a1, unsigned int *a2, long long a3, unsigned int a4)
{
    unsigned int v2;  // w9
    unsigned long long t;  // x0
    unsigned int *v4;  // x1
    unsigned int *v5;  // x1
    unsigned long v6;  // x0
    long long v7;  // x2
    unsigned long long v8;  // x0
    unsigned long long *v9;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (4 > (unsigned long long)a3)
        return 0;
    if (!a1)
        v2 = 32;
    else
        v2 = 64;
    if (a0->field_9b8 & v2)
    {
        t = _time(0);
        v4 = a2;
        *v4 = (((((t * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | t * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((t * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | t * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        v5 = v4 + 1;
        v6 = *(long long *)a0->field_8;
        v7 = a3 - 4;
    }
    else
    {
        v6 = *(long long *)a0->field_8;
        v5 = a2;
        v7 = a3;
    }
    v8 = sub_aa8658(v6, v5, v7, 0);
    if ((int)v8 < 1)
    {
        return v8;
    }
    else if ((unsigned long long)a3 >= 9)
    {
        if (a4 == 1)
        {
            v9 = &g_d27b30;
        }
        else if (a4 == 2)
        {
            v9 = "DOWNGRD";
        }
        else
        {
            return v8;
        }
        *(unsigned long long *)((char *)a2 + a3 - 8) = *v9;
        return v8;
    }
    return 0;
}
