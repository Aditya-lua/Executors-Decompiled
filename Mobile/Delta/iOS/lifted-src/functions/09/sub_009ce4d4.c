/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ce4d4..0x9ce524 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ce4d4_0 {
    char padding_0[1];
    char field_1;
} st_9ce4d4_0;

extern char g_f08410;

void sub_9ce4d4(unsigned long a0, unsigned long long a1, unsigned long a2, unsigned long a3, st_9ce4d4_0 *a4)
{
    unsigned long long v0;  // [bp-0x18]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a1;
    if (!a4)
        a4 = &g_f08410;
    sub_9ce524();
    return;
}
