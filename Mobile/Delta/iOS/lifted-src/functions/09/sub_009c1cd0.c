/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c1cd0..0x9c1d34 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c1cd0_0 {
    int field_0;
    unsigned int field_4;
} st_9c1cd0_0;


st_9c1cd0_0 * sub_9c1cd0(st_9c1cd0_0 *a0)
{
    unsigned long long v4;  // x30
    st_9c1cd0_0 *v5;  // x0
    char v0;  // [bp-0x18]
    char *v1;  // [bp-0x10]
    unsigned long long v2;  // [bp-0x8]
    char v3;  // [bp+0x0]

    if (!a0)
    {
        return a0;
    }
    else if ((a0->field_4 & 0xfffffeff) != 10)
    {
        return 0xffffffffffffffff;
    }
    else if (a0->field_0 > 8)
    {
        return 0xffffffff;
    }
    else
    {
        v1 = &v3;
        v2 = v4;
        if (sub_9c167c(&v0))
            v5 = (st_9c1cd0_0 *)v0;
        else
            v5 = 0xffffffffffffffff;
        return v5;
    }
}
