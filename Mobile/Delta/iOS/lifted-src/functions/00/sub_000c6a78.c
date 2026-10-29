/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6a78..0xc6be0 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6a78_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    void* field_10;
    void* field_18;
    unsigned long long field_20;
} st_c6a78_0;

extern unsigned long long g_e6d4f8;

unsigned long long sub_c6a78(st_c6a78_0 *a0, void* a1, unsigned long long a2)
{
    void* v0;  // x8
    unsigned long long v1;  // x9
    void* v2;  // x8
    unsigned long long v3;  // w8
    unsigned long long v4;  // w9
    unsigned long long v5;  // w9
    unsigned long long v6;  // x9

    if (!a2)
    {
        memset(a0, 0, 40);
        return 0xffffffffffffffb8;
    }
    a0->field_18 = a1;
    a0->field_20 = a1 + 8;
    if (a2 >= 8)
    {
        v0 = a1 + a2;
        v1 = *(long long *)((char *)v0 - 8);
        v2 = v0 - 8;
        a0->field_10 = v2;
        a0->field_0 = v1;
        v3 = (char)v2[7];
        if (!((v3 & 0xff) * 0x100000000))
            v4 = 32;
        else
            v4 = (unsigned int)Clz((v3 & 0xff) * 0x100000000);
        if (!v3)
            v5 = 0;
        else
            v5 = 8 - (v4 ^ 31);
        *(unsigned int *)&a0->field_8 = v5;
        if (v3)
            return a2;
        return 0xffffffffffffffff;
    }
    a0->field_10 = a1;
    a0->field_0 = *(char *)a1;
    v6 = 48;
    if (a2 == 7)
        v6 = 120;
    if (a2 == 6)
        v6 = 32;
    if (a2 == 5)
        v6 = 160;
    if (a2 == 4)
        v6 = 104;
    if (a2 == 3)
        v6 = 0;
    if (a2 == 2)
        v6 = 56;
    goto *((void *)(*(long long *)((char *)&g_e6d4f8 + v6)));
}
