/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3d81c..0xb3d878 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3d81c_0 {
    unsigned long long field_0;
    unsigned int field_8;
} st_b3d81c_0;


int sub_b3d81c(void)
{
    long long v2;  // x0
    st_b3d81c_0 *v3;  // x0
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
            v3->field_8 = 1;
            v3->field_0 = v2;
            *(unsigned int *)((char *)&v3[5].field_0 + 4) = 1;
        }
    }
    else
    {
        v3 = 0;
    }
    return (unsigned int)v3;
}
