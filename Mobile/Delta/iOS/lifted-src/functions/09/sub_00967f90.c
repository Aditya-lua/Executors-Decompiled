/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x967f90..0x96801c (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_967f90_1 {
    char padding_0[8];
    struct st_967f90_2 *field_8;
    char padding_10[2160];
    struct st_967f90_0 *field_880;
    char padding_888[512];
    unsigned long long field_a88;
    unsigned long long field_a90;
} st_967f90_1;

typedef struct st_967f90_0 {
    char padding_0[30];
    unsigned short field_1e;
} st_967f90_0;

typedef struct st_967f90_2 {
    char padding_0[656];
    unsigned long long field_290;
    unsigned long long field_298;
} st_967f90_2;

extern char g_d28258;
extern char g_d2825a;

st_967f90_1 * sub_967f90(st_967f90_1 *a0, void* a1, int *a2)
{
    unsigned int v0;  // w8
    unsigned long long *v1;  // x8
    unsigned long v2;  // x8

    v0 = a0->field_880->field_1e & 3;
    if (1 >= (int)v0)
    {
        if (!v0)
        {
            if (a0->field_a90)
            {
                *(unsigned long long *)a1 = a0->field_a90;
                *(unsigned long long *)a2 = a0->field_a88;
                return a0;
            }
            v1 = a0->field_8;
            *(unsigned long long *)a1 = v1[83];
            *(unsigned long long *)a2 = v1[82];
            return a0;
        }
        v2 = &g_d28258;
    }
    else if (v0 == 2)
    {
        v2 = &g_d2825a;
    }
    else
    {
        *(char **)a1 = &g_d28258;
        *(unsigned long long *)a2 = 2;
        return a0;
    }
    *(unsigned long *)a1 = v2;
    *(unsigned long long *)a2 = 1;
    return a0;
}
