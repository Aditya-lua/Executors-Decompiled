/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7ab2c..0xa7ab90 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7ab2c_0 {
    char padding_0[208];
    char field_d0;
} st_a7ab2c_0;


char sub_a7ab2c(st_a7ab2c_0 *a0, unsigned int a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    char v8;  // x19
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a1)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        do
        {
            /* unsupported instruction */;
            v8 = /* unsupported instruction */ + 1;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        if (!(a0->field_d0 & 1))
        {
            return v8;
        }
        else if (!sub_a779ec())
        {
            sub_a78ccc(a0);
            return 0;
        }
        else
        {
            return v8;
        }
    }
}
