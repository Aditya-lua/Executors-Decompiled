/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa144c0..0xa14530 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a144c0_0 {
    char padding_0[32];
    long long field_20;
} st_a144c0_0;


long long sub_a144c0(st_a144c0_0 *a0, st_a144c0_0 *a1)
{
    long long v2;  // x0
    long long v3;  // x19
    long long v4;  // x0
    long long v5;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a1a70c(sub_9ffdd0(a1->field_20));
    if (!v2)
        return 0;
    v3 = v2;
    v4 = a0->field_20;
    if (v4 || (v4 = sub_a18b6c(0), a0->field_20 = v4, v4))
    {
        if (!sub_a19718(v4, v3))
            goto LABEL_a14514;
        v5 = 1;
    }
    else
    {
LABEL_a14514:
        v5 = 0;
    }
    sub_a1a174(v3);
    return v5;
}
