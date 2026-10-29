/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x958f68..0x958fd8 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_958f68_1 {
    unsigned int field_0;
    char padding_4[4];
    struct st_958f68_0 *field_8;
} st_958f68_1;

typedef struct st_958f68_0 {
    char padding_0[304];
    unsigned long long field_130;
} st_958f68_0;


unsigned long long sub_958f68(st_958f68_1 *a0)
{
    unsigned long v2;  // x9
    unsigned long long v3;  // x8
    unsigned long long *v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return 0;
    v2 = a0->field_0;
    v3 = a0;
    if ((unsigned int)v2)
    {
        if (!(v2 >> 7 & 1))
            return 0;
        v3 = sub_980dc8();
        if (!v3)
            return v3;
    }
    if (!*(int *)(v3 + 120))
    {
        v5 = v3 + 856;
    }
    else if (!*(long long *)(v3 + 2472))
    {
        v5 = &a0->field_8->field_130;
    }
    else
    {
        return *(long long *)(v3 + 2472);
    }
    return *v5;
}
