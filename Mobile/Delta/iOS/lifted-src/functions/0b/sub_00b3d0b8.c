/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3d0b8..0xb3d114 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3d0b8_0 {
    unsigned long long field_0;
    char padding_8[56];
    struct st_b3d0b8_0 *field_40;
} st_b3d0b8_0;


int sub_b3d0b8(void)
{
    long long v2;  // x0
    st_b3d0b8_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f2aec();
    if (sub_a2f9e0(v2))
    {
        v3 = sub_a6bffc(72, "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 71);
        if (v3)
        {
            /* unsupported instruction */;
            *(unsigned int *)&v3->padding_8[0] = 1;
            v3->field_0 = v2;
            *(unsigned int *)&v3->field_40 = 0;
        }
    }
    else
    {
        v3 = 0;
    }
    return (unsigned int)v3;
}
