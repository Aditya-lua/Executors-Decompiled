/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa32c78..0xa32d54 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a32c78_0 {
    unsigned long long field_0;
} st_a32c78_0;

extern long long g_f0d560;

unsigned long long * sub_a32c78(st_a32c78_0 **a0, unsigned long long *a1)
{
    unsigned long long *v2;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (unsigned long long *)(int)a0[20];
    *(unsigned int *)&a0[20] = (unsigned int)(unsigned long long *)((char *)v2 - 1);
    if (v2 == 1 && a0[13])
    {
        if (a1)
        {
            sub_a7c1b4(g_f0d560);
            a0[13]();
        }
        a0[13]();
    }
    if (sub_a33034())
        return 1;
    sub_a368c8();
    sub_a369bc("crypto/engine/eng_init.c", 79, "engine_unlocked_finish");
    sub_a36abc(38, 106, 0);
    return 0;
}
