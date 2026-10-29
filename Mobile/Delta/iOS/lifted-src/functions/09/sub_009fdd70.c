/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fdd70..0x9fdec4 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fdd70_0 {
    char padding_0[176];
    long long field_b0;
} st_9fdd70_0;


unsigned long long sub_9fdd70(st_9fdd70_0 *a0, unsigned int *a1)
{
    unsigned long long v2;  // x19
    unsigned long long v3;  // x0
    unsigned long long v4;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *a1 = 0;
    if (*(long long *)&a0->padding_0[8] && *(long long *)&a0->padding_0[24])
    {
        v2 = sub_9dddcc(a0->field_b0);
        if (v2)
        {
            sub_9de064(v2);
            v3 = sub_9de208(v2);
            if (v3)
            {
                v4 = v3;
                if (!sub_9e5c70(*(long long *)&a0->padding_0[8]))
                    *a1 = *a1 | 1;
                if (sub_9e5c94(*(long long *)&a0->padding_0[24]) || sub_9e4828(*(long long *)&a0->padding_0[24]) || sub_9e5b90(*(long long *)&a0->padding_0[24]))
                    *a1 = *a1 | 8;
                if (sub_9e4c34(v4, *(long long *)&a0->padding_0[8]) && sub_9ebaf8(v4, 1))
                {
                    if (!(sub_9e5528(*(long long *)&a0->padding_0[24], v4) >> 31 & 1))
                        *a1 = *a1 | 8;
                    if (0x1ff >= (int)sub_9e46a8(*(long long *)&a0->padding_0[8]))
                        *a1 = *a1 | 128;
                    if ((int)sub_9e46a8(*(long long *)&a0->padding_0[8]) >= 10001)
                        *a1 = *a1 | 0x100;
                    sub_9de17c(v2);
                    sub_9dded4(v2);
                    return 1;
                }
            }
        }
        sub_9de17c(v2);
        sub_9dded4(v2);
        return 0;
    }
    *a1 = 9;
    return 1;
}
