/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa045ec..0xa04658 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a045ec_0 {
    unsigned long long field_0;
    char padding_8[12];
    char field_14;
} st_a045ec_0;


char sub_a045ec(st_a045ec_0 *a0, char a1)
{
    char v3;  // x3
    unsigned long long v4;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0 && a1)
    {
        if (!(a0->field_14 & 1))
        {
            v3 = *(long long *)((char *)&a0[2].field_0 + 6);
            if (!*(long long *)((char *)&a0[2].field_0 + 6))
            {
                v3 = *(long long *)(a0->field_0 + 48);
                if (!*(long long *)(a0->field_0 + 48))
                    return 0;
            }
            goto *((void *)(v3));
        }
        else
        {
            return 0;
        }
    }
    v0 = &v2;
    v1 = v4;
    sub_a368c8();
    sub_a369bc("crypto/dso/dso_lib.c", 251, "DSO_merge");
    sub_a36abc(37, 0xc0102, 0);
    return 0;
}
