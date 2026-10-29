/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40cea4..0x40cf54 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40cea4_0 {
    char field_0;
} st_40cea4_0;

extern unsigned long long g_e81070;

long long sub_40cea4(st_40cea4_0 **a0)
{
    unsigned int v0;  // w9
    unsigned long long v1;  // x10
    unsigned long long v2;  // x11
    unsigned long long v3;  // x9

    v0 = *(char *)*a0;
    v1 = ((v0 == 1) * 8 | (char)(v0 == 1) >> 61) & 0x7fffffff8 & 0x7ffffffff;
    v2 = 24;
    if (v0 == 2)
        v1 = v2;
    v3 = 16;
    if (!v0)
        v1 = v3;
    goto *((void *)(*(long long *)((char *)&g_e81070 + v1)));
}
