/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e671c..0x9e6850 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e671c_1 {
    long long field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned int field_10;
} st_9e671c_1;

typedef struct st_9e671c_0 {
    char padding_0[32];
    long long field_20;
    unsigned int field_28;
} st_9e671c_0;


long long sub_9e671c(st_9e671c_1 *a0, st_9e671c_1 *a1, st_9e671c_1 *a2, st_9e671c_0 *a3, long long a4)
{
    unsigned long v2;  // x24
    long long v3;  // x0
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a3->field_28;
    if (0x1fe >= (unsigned int)v2 - 2 && a1->field_8 == (unsigned int)v2 && a2->field_8 == (unsigned int)v2)
    {
        if (!sub_9e4cdc(a0, v2))
        {
            return 0;
        }
        else if (sub_9d9620(a0->field_0, a1->field_0, a2->field_0, a3->field_20, (char *)&a3[1].field_20 + 4, v2))
        {
            a0->field_10 = a2->field_10 ^ a1->field_10;
            a0->field_8 = v2;
            return 1;
        }
    }
    if ((int)(a2->field_8 + a1->field_8) > (int)((unsigned int)v2 * 2))
        return 0;
    sub_9de064(a4);
    v3 = sub_9de208(a4);
    if (v3)
    {
        if (a1 != a2)
        {
            if (sub_9e7df8())
            {
                v4 = sub_9e6850(a0, v3, a3);
                sub_9de17c(a4);
                return v4;
            }
        }
        else
        {
            if (sub_9eac58())
            {
                v4 = sub_9e6850(a0, v3, a3);
                sub_9de17c(a4);
                return v4;
            }
        }
    }
    sub_9de17c(a4);
    return 0;
}
