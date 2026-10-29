/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d0824..0x9d0878 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_f127a8;
extern long long g_f127b0;

long long sub_9d0824(void)
{
    long long v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (unsigned int)sub_a6b7dc(&g_f127a8, 0);
    if (!v2)
    {
        return v2;
    }
    else if (sub_a6b7dc(&g_f127b0, 0))
    {
        return 1;
    }
    else
    {
        sub_a7c240(&g_f127a8);
        return 0;
    }
}
