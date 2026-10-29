/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d8a38..0x9d8aec (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d8a38_1 {
    unsigned long long field_0;
    long long field_8;
    unsigned long long field_10;
} st_9d8a38_1;

typedef struct st_9d8a38_0 {
    char padding_0[48];
    unsigned int field_30;
    char padding_34[4];
    unsigned int field_38;
    char padding_3c[4];
    unsigned long long field_40;
} st_9d8a38_0;


unsigned long long sub_9d8a38(st_9d8a38_0 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long n;  // x19
    st_9d8a38_1 *v3;  // x22
    unsigned long v4;  // x8
    unsigned long long v5;  // x10
    unsigned long long v6;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    n = a2;
    v3 = *(long long *)(a0->field_40 + ((0xffffffff ^ a0->field_30 >> 6) & 8));
    sub_9d3d58();
    v4 = v3->field_0;
    if (!(n >> 31 & 1))
    {
        if (v4 < (n & 0xffffffff))
            n = v4 & 0xffffffff;
        else
            n &= 0xffffffff;
        if (!a1 || (int)n < 1)
            goto LABEL_9d8ac0;
        _memcpy(a1, v3->field_8, n);
        v5 = v3->field_10 - n;
        v6 = v3->field_8 + n;
        v3->field_0 = v3->field_0 - n;
        v3->field_8 = v6;
        v3->field_10 = v5;
    }
    else
    {
LABEL_9d8ac0:
        if (!v4)
        {
            n = a0->field_38;
            if ((unsigned int)n)
                sub_9d3d74(a0, 9);
        }
    }
    return n;
}
