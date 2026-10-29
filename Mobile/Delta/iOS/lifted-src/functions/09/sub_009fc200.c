/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fc200..0x9fc26c (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_d368a8;

char * sub_9fc200(char *a0)
{
    *a0 = (&g_d368a8)[*a0];
    a0[1] = (&g_d368a8)[a0[1]];
    a0[2] = (&g_d368a8)[a0[2]];
    a0[3] = (&g_d368a8)[a0[3]];
    a0[4] = (&g_d368a8)[a0[4]];
    a0[5] = (&g_d368a8)[a0[5]];
    a0[6] = (&g_d368a8)[a0[6]];
    a0[7] = (&g_d368a8)[a0[7]];
    return a0;
}
