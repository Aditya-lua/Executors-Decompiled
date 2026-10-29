/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9de520..0x9de610 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9de520_0 {
    unsigned long long field_0;
    int field_8;
} st_9de520_0;


unsigned long long sub_9de520(unsigned long long a0, unsigned long long a1, long long a2, st_9de520_0 *a3, long long a4)
{
    long long v2;  // x1
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_9e4828(a3))
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_div.c", 217, "BN_div");
        v2 = 103;
    }
    else
    {
        if (*(long long *)(a3->field_0 + a3->field_8 * 8 - 8))
        {
            v3 = sub_9de610(a0, a1, a2, a3, a4);
            if (!(unsigned int)v3)
                return v3;
            if (a0)
                sub_9e5708(a0);
            if (!a1)
                return 1;
            sub_9e5708(a1);
            return 1;
        }
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_div.c", 227, "BN_div");
        v2 = 107;
    }
    sub_a36abc(3, v2, 0);
    return 0;
}
