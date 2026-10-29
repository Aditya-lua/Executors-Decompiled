/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x82758..0x827b0 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_82758_0 {
    char padding_0[72];
    unsigned int field_48;
} st_82758_0;

extern unsigned long long g_e6b670;

long long sub_82758(st_82758_0 *a0)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // x8

    v0 = 40;
    if (a0->field_48 == 1)
        v0 = 0;
    v1 = 8;
    if (a0->field_48 == 2)
        v0 = v1;
    goto *((void *)(*(long long *)((char *)&g_e6b670 + v0)));
}
