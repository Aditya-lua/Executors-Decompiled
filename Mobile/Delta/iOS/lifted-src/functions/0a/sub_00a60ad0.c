/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa60ad0..0xa60b8c (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a60ad0_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_a60ad0_0;


unsigned long long sub_a60ad0(st_a60ad0_0 *a0, unsigned long a1, unsigned int *a2)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    long long v4;  // x19
    unsigned long long v5;  // x0
    unsigned long long v6;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a609cc();
    if (!(unsigned int)v2)
        return v2;
    if (*a2 || !a0->field_8)
        return 1;
    v3 = sub_9dddcc(0);
    if (!v3)
        return v3;
    v4 = v3;
    sub_9de064();
    v5 = sub_9de208(v4);
    if (v5 && sub_9dea6c())
    {
        if (!sub_9e5b90(v5))
            *a2 = *a2 | 4;
        v6 = 1;
    }
    else
    {
        v6 = 0;
    }
    sub_9de17c(v4);
    sub_9dded4(v4);
    return v6;
    return 1;
}
