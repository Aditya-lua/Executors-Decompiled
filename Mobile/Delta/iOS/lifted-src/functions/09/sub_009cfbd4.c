/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cfbd4..0x9cfc58 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cfbd4_0 {
    char padding_0[40];
    char field_28;
} st_9cfbd4_0;


long long sub_9cfbd4(unsigned long long *a0, long long a1, long long a2, unsigned long a3, unsigned long a4, st_9cfbd4_0 *a5)
{
    char v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*a0)
    {
        v2 = sub_9e4958();
        *a0 = v2;
        if (!v2)
            return v2;
    }
    if (sub_9e4db0(a1, a2))
    {
        return 1;
    }
    else if (*a0)
    {
        if (!(a5->field_28 & 1))
            sub_9e48d4();
        else
            sub_9e4838();
        *a0 = 0;
        return 0;
    }
    else
    {
        return *a0;
    }
}
