/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cdd74..0x3ce150 (988 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cdd74_0 {
    char field_0;
} st_3cdd74_0;

typedef struct st_3cdd74_1 {
    unsigned long long field_0;
} st_3cdd74_1;

extern unsigned long long g_e7eaf8;
extern st_3cdd74_1 *g_f0b120;
extern char g_10002b0;

long long sub_3cdd74(long long a0, unsigned int a1, unsigned int a2, unsigned int *a3, unsigned long a4)
{
    unsigned int v11;  // x27
    unsigned int v12;  // w28
    char *iter;  // x20
    unsigned int i;  // w0
    unsigned int v15;  // w0
    unsigned int v16;  // w0
    unsigned int v17;  // w8
    unsigned int v18;  // w8
    unsigned long long v19;  // x9
    unsigned long long v20;  // x8
    unsigned int v0;  // [bp-0xd4]
    unsigned long v1;  // [bp-0xd0]
    unsigned int v2;  // [bp-0xc8]
    unsigned long v3;  // [bp-0xc0]
    st_3cdd74_0 **v4;  // [bp-0xb0], Other Possible Types: char
    st_3cdd74_0 *v5;  // [bp-0xa8]
    uint48_t v6;  // [bp-0x86]
    unsigned long v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = 0;
    v12 = 0;
    v8 = *(long long *)&g_10002b0;
    v5 = &v4;
    v4 = &v5;
    iter = (char *)&v6 + 2;
    do
    {
        if (v11 == 10)
            g_f0b120();
        i = sub_3d706c(a0);
        v15 = sub_3d706c(a0);
        *(iter - 2) = v15;
        *(iter - 1) = sub_3d706c(a0);
        v16 = sub_3d706c(a0);
        *iter = v16;
        if (sub_3d2248(a0))
            g_f0b120();
        if (v15 != 8)
            g_f0b120();
        v12 |= v16;
        iter += 3;
        v11 += 1;
    } while (i);
    if (!(v12 & 16))
        v17 = 3;
    else
        v17 = 4;
    *a3 = v17;
    if ((int)a2 >= 1)
    {
        v1 = a2;
        v0 = a1 * 4;
        v2 = 0;
        v3 = a4 + 0 * v0;
        v18 = *(char *)((void*)&v6 + 1);
        if (!v18)
            v19 = 16;
        else
            v19 = 376;
        if (v18 == 1)
            v19 = 152;
        if (v18 == 2)
            v20 = 456;
        else
            v20 = v19;
        goto *((void *)(*(long long *)((char *)&g_e7eaf8 + v20)));
    }
    else
    {
        if (*(long long *)&g_10002b0 == v8)
            return a4;
        ___stack_chk_fail();
    }
}
