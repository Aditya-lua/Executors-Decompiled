/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x71db4..0x71e68 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_71db4_0 {
    struct st_71db4_1 *field_0;
} st_71db4_0;

typedef struct st_71db4_1 {
    struct st_71db4_0 *field_0;
} st_71db4_1;


long long sub_71db4(unsigned long a0, long long a1, long long a2, long long a3)
{
    long long v6;  // x21
    unsigned long v7;  // x0
    unsigned long long v8;  // x0
    long long v9;  // x0
    long long v10;  // w0
    st_71db4_1 **v0;  // [bp-0x70]
    st_71db4_1 **v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    if (!a2)
        return a3;
    do
    {
        v6 = a2;
        v7 = sub_a0c8(v6 + 32);
        v8 = sub_6b08(v6 + 32);
        v9 = sub_a0c8(a1);
        v0 = &v1;
        v1 = &v0;
        v2 = v7;
        v3 = v8;
        v10 = (unsigned int)sub_2a304(&v2, v9, sub_6b08(a1));
        a2 = *(long long *)(v6 + ((unsigned long long)(v10) >> 28 & 8));
        if (v10 >= 0)
            a3 = v6;
    } while (*(long long *)(v6 + ((unsigned long long)(v10) >> 28 & 8)));
    return a3;
}
