/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb23244..0xb23330 (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b23244_0 {
    char padding_0[12];
    struct st_b23244_1 *field_c;
} st_b23244_0;

typedef struct st_b23244_1 {
    unsigned long long field_0;
} st_b23244_1;


unsigned long long * sub_b23244(long long a0, long long a1, long long a2, unsigned long a3, unsigned long long *a4, unsigned long a5, st_b23244_0 *a6)
{
    unsigned long long *v4;  // x20
    unsigned long long *v5;  // x0
    unsigned int v0;  // [bp-0x4c]
    unsigned long long *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    v0 = 0xffffffff;
    if (!*(int *)&(a6->padding_0)[1])
    {
        return 0;
    }
    else if (a4)
    {
        a4();
    }
    else
    {
        v4 = sub_b22ff4(a1, a2, a4);
        if (v4)
            v5 = sub_a9ddf0(a0, v4);
        else
            v5 = 0;
        sub_9d0454(v4);
        return v5;
    }
}
