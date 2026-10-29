/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5cf34..0xa5cfb0 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5cf34_0 {
    struct st_a5cf34_0 *field_0;
    char padding_8[16];
    struct st_a5cf34_0 *field_18;
    struct st_a5cf34_0 *field_20;
} st_a5cf34_0;


unsigned int sub_a5cf34(st_a5cf34_0 *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        if (a0->field_18)
        {
            sub_a5d5bc(a0);
            if (a0->field_20)
            {
                *(unsigned int *)&a0->field_0 = 8;
                return 1;
            }
        }
        *(unsigned int *)&a0->field_0 = 0;
    }
    sub_a368c8();
    sub_a369bc("crypto/evp/pmeth_gn.c", 351, "fromdata_init");
    sub_a36abc(6, 150, 0);
    return 0xfffffffe;
}
