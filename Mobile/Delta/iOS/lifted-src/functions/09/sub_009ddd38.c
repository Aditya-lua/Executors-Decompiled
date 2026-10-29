/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ddd38..0x9dddcc (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ddd38_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
} st_9ddd38_0;


unsigned long long sub_9ddd38(st_9ddd38_0 **a0, char *a1)
{
    char *v2;  // x1
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*a1 != 45)
        v2 = a1;
    else
        v2 = a1 + 1;
    if (*v2 == 48 && (v2[1] | 32) == 120)
    {
        v3 = sub_9dd9cc(a0, v2 + 2);
        if (!(unsigned int)v3)
            return v3;
    }
    else
    {
        v4 = sub_9ddb90(a0);
        if (!(unsigned int)v4)
            return v4;
    }
    if (*a1 != 45)
        return 1;
    if (!*a0->field_8)
        return 1;
    *(unsigned int *)&*a0->field_10 = 1;
    return 1;
}
