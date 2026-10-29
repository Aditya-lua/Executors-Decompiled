/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d5274..0x9d5358 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_9d5274(long long a0, long long a1, long long a2)
{
    unsigned long long v9;  // x19
    char v0;  // [bp-0x84c]
    unsigned long v1;  // [bp-0x848]
    unsigned long v2;  // [bp-0x840]
    char *v3;  // [bp-0x838]
    char v4;  // [bp-0x830]
    char v5;  // [bp-0x828]
    unsigned long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v3 = &v5;
    v1 = 0;
    v2 = 0x800;
    if (!sub_9d5358(&v3, &v1, &v2, &v4, &v0, a1, a2))
    {
        sub_a6c2e4(v1, "crypto/bio/bio_print.c", 909);
        v9 = 0xffffffff;
    }
    else if (v1)
    {
        v9 = sub_9d3fec(a0);
        sub_a6c2e4(v1, "crypto/bio/bio_print.c", 914);
    }
    else
    {
        v9 = sub_9d3fec(a0, &v5);
    }
    if (*(long long *)&g_10002b0 == v6)
        return v9;
    ___stack_chk_fail();
}
