/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x989320..0x989368 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_989370;

unsigned long long sub_989320(long long *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a19710(*a0, 0);
    sub_a66ccc(*a0, &g_989370, a0);
    v2 = sub_a66664(*a0);
    *a0 = 0;
    return v2;
}
