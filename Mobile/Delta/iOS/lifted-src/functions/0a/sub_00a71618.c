/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa71618..0xa71670 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a71618_0 {
    long long field_0;
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
    long long field_18;
    unsigned long long field_20;
} st_a71618_0;


long long sub_a71618(long long a0, long long a1, long long a2)
{
    long long len;  // x0
    long long v3;  // x0
    st_a71618_0 *v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    len = a0;
    if (a1)
    {
        len = a0;
        if (!a2)
        {
            len = _strlen(a1);
            a2 = len;
        }
    }
    v3 = len;
    v4->field_0 = a0;
    v4->field_8 = 4;
    v4->field_10 = a1;
    v4->field_18 = a2;
    v4->field_20 = 0xffffffffffffffff;
    return v3;
}
