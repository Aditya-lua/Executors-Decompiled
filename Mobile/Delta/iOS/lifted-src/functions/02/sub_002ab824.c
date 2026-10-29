/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ab824..0x2ab880 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ab824_0 {
    char field_0;
} st_2ab824_0;

extern unsigned long long g_e7cc08;

long long sub_2ab824(st_2ab824_0 **a0)
{
    unsigned int v0;  // w9
    unsigned long long v1;  // x10
    unsigned long long v2;  // x9

    v0 = *(char *)*a0;
    v1 = 24;
    if (v0 == 1)
        v1 = 0;
    v2 = 8;
    if (v0 == 2)
        v1 = v2;
    goto *((void *)(*(long long *)((char *)&g_e7cc08 + v1)));
}
