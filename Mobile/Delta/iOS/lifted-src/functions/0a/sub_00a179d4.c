/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa179d4..0xa17aa0 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a179d4_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
} st_a179d4_0;

extern unsigned long long g_e8ef20;
extern unsigned long long g_e8ef30;

unsigned long long sub_a179d4(st_a179d4_0 *a0, unsigned long long *a1)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (a0->field_8 == 6)
    {
        v4 = sub_a7168c();
        if (!(unsigned int)v4)
            return v4;
    }
    else if (a0->field_8 == 4)
    {
        v0 = a0->field_10;
        v3 = a0->field_10 != 0;
        if (!(unsigned int)v3)
            return v3;
    }
    else
    {
        return 0;
    }
    if (!v0)
    {
        *(unsigned int *)a1 = 1;
        return 1;
    }
    if (sub_a6e200(v0, "explicit"))
    {
        if (!sub_a6e200(v0, "named_curve") && (int)g_e8ef30 >= 0)
        {
            *(int *)a1 = g_e8ef30;
            return 1;
        }
    }
    else
    {
        if ((int)g_e8ef20 >= 0)
        {
            *(int *)a1 = g_e8ef20;
            return 1;
        }
    }
    return 0;
}
