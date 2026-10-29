/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cfd40..0x3d019c (1116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cfd40_0 {
    unsigned long long field_0;
} st_3cfd40_0;

extern unsigned long long g_e7e400;
extern st_3cfd40_0 *g_f0b120;

long long sub_3cfd40(long long ptr, unsigned int a1, unsigned int a2, unsigned int a3, int a4)
{
    long long ptr1;  // x0
    unsigned int v3;  // w10
    unsigned long long v4;  // x11
    unsigned long long v5;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 == a1)
        return ptr;
    ptr1 = _malloc(a4 * a3 * a2 * 2);
    if (!ptr1)
    {
        _free(ptr);
        g_f0b120();
    }
    else if (a4 >= 1)
    {
        v3 = a2 + a1 * 8;
        v4 = 96;
        if (v3 == 10)
            v4 = 72;
        if (v3 == 11)
            v4 = 184;
        if (v3 == 12)
            v4 = 16;
        if (v3 == 0x11)
            v4 = 296;
        if (v3 == 19)
            v4 = 48;
        if (v3 == 20)
            v4 = 240;
        if (v3 == 28)
            v4 = 320;
        if (v3 == 25)
            v4 = 104;
        if (v3 == 26)
            v4 = 304;
        if (v3 == 33)
            v4 = 200;
        if (v3 == 0x22)
            v4 = 216;
        v5 = 344;
        if (v3 == 35)
            v4 = v5;
        goto *((void *)(*(long long *)((char *)&g_e7e400 + v4)));
    }
    else
    {
        _free(ptr);
        return ptr1;
    }
}
