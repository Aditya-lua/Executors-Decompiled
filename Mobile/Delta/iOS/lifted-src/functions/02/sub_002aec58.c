/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aec58..0x2aecc8 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aec58_0 {
    char field_0;
} st_2aec58_0;

extern unsigned long long g_e7cb88;

long long sub_2aec58(st_2aec58_0 **a0)
{
    unsigned int v0;  // w9
    unsigned long v1;  // x10
    unsigned long v2;  // x11
    unsigned long v3;  // x9

    v0 = *(char *)*a0;
    v1 = 24;
    if (v0 == 1)
        v1 = 0;
    v2 = 8;
    if (v0 == 2)
        v1 = v2;
    v3 = 16;
    if (!v0)
        v1 = v3;
    goto *((void *)(*(long long *)((char *)&g_e7cb88 + v1)));
}
