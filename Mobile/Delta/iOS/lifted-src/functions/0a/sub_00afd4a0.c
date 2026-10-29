/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafd4a0..0xafd56c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_afd56c;
extern long long g_afd5c8;
extern long long g_afd624;
extern long long g_afd664;
extern long long g_afd6ac;
extern long long g_afd704;
extern long long g_afd720;

long long sub_afd4a0(void)
{
    long long v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9d50a0(1049, "BIO to Core filter");
    if (v2 && sub_9d51b4(v2, &g_afd56c) && sub_9d5204(v2, &g_afd5c8) && sub_9d5210(v2, &g_afd624) && sub_9d521c(v2, &g_afd664) && sub_9d5228(v2, &g_afd6ac) && sub_9d5234(v2, &g_afd704) && sub_9d5240(v2, &g_afd720))
        return v2;
    sub_9d5124(v2);
    return 0;
}
