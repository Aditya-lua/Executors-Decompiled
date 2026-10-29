/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x966d14..0x966d78 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_966d14_0 {
    char padding_0[132];
    char field_84;
    char padding_85[2171];
    long long field_900;
    char padding_908[640];
    long long field_b88;
} st_966d14_0;


long long sub_966d14(st_966d14_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0->field_900)
    {
        return 0;
    }
    else if (!(a0->field_84 & 1))
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        if (sub_9a5694() || sub_9a5714(a0))
            return 0;
        sub_966ac4(a0->field_b88, a0->field_900, 1);
        return 1;
        return 0;
    }
    else
    {
        return 0;
    }
}
