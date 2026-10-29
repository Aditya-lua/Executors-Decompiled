/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x47cd4..0x47e14 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_47cd4_1 {
    unsigned long long field_0;
} st_47cd4_1;

typedef struct st_47cd4_0 {
    char field_0;
} st_47cd4_0;

extern unsigned long long g_e66948;
extern unsigned long long g_e66950;

long long sub_47cd4(st_47cd4_1 **a0, unsigned long long a1)
{
    unsigned long long v8;  // x20
    unsigned long long v9;  // x19
    unsigned long long v10;  // x30
    unsigned long long *v11;  // x11
    long long v12;  // x8
    long long v13;  // x9
    st_47cd4_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_47cd4_0 *v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v3 = v8;
    v4 = v9;
    v5 = &v7;
    v6 = v10;
    v1 = &v0;
    v0 = &v1;
    v2 = a1;
    v11 = a0[201];
    v12 = (long long)(a0[202] - v11) >> 3;
    if (a0[202] != v11)
    {
        v13 = 0;
        if (1 >= (unsigned long long)v12)
            v12 = 1;
        while (1)
        {
            if (v11[v13] != a1)
            {
                v13 += 1;
                if (v12 == v13)
                    goto *((void *)(g_e66948));
            }
            else
            {
                goto *((void *)(g_e66950));
            }
        }
    }
    else
    {
        goto *((void *)(g_e66948));
    }
}
