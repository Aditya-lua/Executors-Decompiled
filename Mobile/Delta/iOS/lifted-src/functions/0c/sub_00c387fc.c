/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc387fc..0xc3896c (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c387fc_0 {
    unsigned int field_0;
} st_c387fc_0;

extern char g_e06c8e;
extern long long g_efc880;

unsigned long long sub_c387fc(unsigned long long a0, st_c387fc_0 **a1, unsigned long long *a2)
{
    unsigned int *v2;  // x22
    unsigned int *i;  // x23
    unsigned long v4;  // x24
    unsigned long long *v5;  // x8
    unsigned long long *v6;  // x26
    unsigned long v7;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1[3];
    i = a1[1];
    if (a1[1] != v2)
    {
        a0 = a0;
        do
        {
            v4 = *i;
            i += 1;
            a1[1] = i;
            if (a2[5] <= v4 || !(v5 = a2[4] + v4 * 32, *v5 != 0x8000000000000000))
                sub_c73c64(&g_efc880);
            v6 = v5[1] + 264 * v5[2] - 240;
            if (v5[2] * 0xfffffffffffffef8)
            {
                if (11 < *v6)
                    v7 = *v6 - 12;
                else
                    v7 = 9;
                goto *((void *)(sub_c388ac + (&g_e06c8e)[v7] * 4));
            }
        } while (i != v2);
    }
    *(unsigned long long *)a0 = 0;
    return a0;
}
