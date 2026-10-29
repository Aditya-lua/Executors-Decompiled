/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cf884..0x3cfce4 (1120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cf884_0 {
    unsigned long long field_0;
} st_3cf884_0;

extern unsigned long long g_e7e280;
extern st_3cf884_0 *g_f0b120;

long long sub_3cf884(long long ptr, unsigned int a1, unsigned long long a2, long long a3, unsigned long long a4)
{
    long long v2;  // x0
    unsigned int v3;  // w10
    unsigned long long v4;  // x11
    unsigned long long v5;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((unsigned int)a2 == a1)
        return ptr;
    v2 = sub_3d6ef0(a2, a3, a4, 0);
    if (!v2)
    {
        _free(ptr);
        g_f0b120();
    }
    else if ((int)a4 >= 1)
    {
        v3 = (unsigned int)a2 + a1 * 8;
        v4 = 248;
        if (v3 == 10)
            v4 = 112;
        if (v3 == 11)
            v4 = 104;
        if (v3 == 12)
            v4 = 56;
        if (v3 == 0x11)
            v4 = 240;
        if (v3 == 19)
            v4 = 224;
        if (v3 == 20)
            v4 = 88;
        if (v3 == 28)
            v4 = 0x100;
        if (v3 == 25)
            v4 = 184;
        if (v3 == 26)
            v4 = 288;
        if (v3 == 33)
            v4 = 376;
        if (v3 == 0x22)
            v4 = 24;
        v5 = 64;
        if (v3 == 35)
            v4 = v5;
        goto *((void *)(*(long long *)((char *)&g_e7e280 + v4)));
    }
    else
    {
        _free(ptr);
        return v2;
    }
}
