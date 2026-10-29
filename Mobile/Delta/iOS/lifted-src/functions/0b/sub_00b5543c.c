/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5543c..0xb554bc (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5543c_0 {
    char padding_0[16];
    long long field_10;
    long long field_18;
    unsigned int field_20;
    char padding_24[32];
    long long field_44;
} st_b5543c_0;


long long sub_b5543c(st_b5543c_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (*(int *)&(a0->padding_24)[1])
    {
        return 1;
    }
    else if (!(int)a0->field_10)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        if (!sub_9d46fc(a0->field_18, 10, 0, 0))
            return sub_9d46fc(a0->field_18, 2, 0, 0) != 0;
        return 0;
    }
    else if ((int)a0->field_10 != 1)
    {
        return 1;
    }
    else
    {
        return a0->field_20;
    }
}
