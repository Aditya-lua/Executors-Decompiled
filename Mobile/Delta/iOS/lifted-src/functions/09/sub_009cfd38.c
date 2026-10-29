/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cfd38..0x9cfdc8 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cfd38_0 {
    char padding_0[40];
    char field_28;
} st_9cfd38_0;


long long sub_9cfd38(long long *a0, long long a1, long long a2, unsigned long a3, unsigned long a4, st_9cfd38_0 *a5)
{
    char v2;  // x0
    char v3;  // x0
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*a0)
    {
        v2 = sub_9e4988();
        *a0 = v2;
        if (!v2)
            return v2;
    }
    v3 = sub_9e4db0(a1, a2);
    v4 = *a0;
    if (v3)
    {
        sub_9e5d14(v4, 4);
        return 1;
    }
    else if (v4)
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
        return v4;
    }
}
