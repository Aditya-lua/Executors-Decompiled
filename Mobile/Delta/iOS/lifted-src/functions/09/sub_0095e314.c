/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95e314..0x95e3b8 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95e314_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    long long field_20;
    long long field_28;
} st_95e314_0;


long long sub_95e314(st_95e314_0 *a0, long long a1, unsigned long a2, unsigned int a3)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    if ((int)/* unsupported instruction */ < 1)
        return 0;
    v2 = sub_a7c11c();
    a0->field_28 = v2;
    if (v2)
    {
        /* unsupported instruction */;
        *(unsigned int *)&a0->field_20 = 1;
        if (sub_a6a660(0, a0, a0 + 1))
        {
            a0->field_0 = a3;
            a0->field_10 = a2;
            a0->field_18 = a2;
            a0->field_8 = a1;
            return 1;
        }
    }
    sub_a7c1d0();
    a0->field_28 = 0;
    sub_95e3b8(a1);
    return 0;
}
