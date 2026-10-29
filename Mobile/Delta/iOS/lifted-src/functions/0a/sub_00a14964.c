/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa14964..0xa149c0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a14964_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_a14964_0;


unsigned long long sub_a14964(long long a0, st_a14964_0 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x0
    unsigned long long v9;  // x19
    unsigned long long v10;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a1->field_20)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        v8 = sub_a18ce8(a1->field_20);
        if (!v8)
            return v8;
        v9 = v8;
        v10 = sub_a5ab14(a0, 408, v9);
        if ((unsigned int)v10)
            return v10;
        sub_a18c08(v9);
        return 0;
    }
}
