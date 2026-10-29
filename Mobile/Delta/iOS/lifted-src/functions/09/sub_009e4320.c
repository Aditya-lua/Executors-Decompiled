/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e4320..0x9e43b0 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e4320_0 {
    long long field_0;
    unsigned int field_8;
} st_9e4320_0;


long long sub_9e4320(st_9e4320_0 *a0, long long a1, unsigned long long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_9e4cdc())
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_intern.c", 0xbb, "bn_set_words");
        sub_a36abc(3, 0x80003, 0);
        return 0;
    }
    _memcpy(a0->field_0, a1, (long long)(a2 * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(a2, 3) & 0x7fffffff8 & 0x7ffffffff);
    a0->field_8 = a2;
    sub_9e5708(a0);
    return 1;
}
