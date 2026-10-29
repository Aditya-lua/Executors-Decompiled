/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa78c78..0xa78ccc (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a78c78_0 {
    char padding_0[208];
    char field_d0;
} st_a78c78_0;


char sub_a78c78(st_a78c78_0 *a0)
{
    char v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    do
    {
        /* unsupported instruction */;
        v2 = /* unsupported instruction */ + 1;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    if (!(a0->field_d0 & 1))
    {
        return v2;
    }
    else if (!sub_a779ec())
    {
        sub_a78ccc(a0);
        return 0;
    }
    else
    {
        return v2;
    }
}
