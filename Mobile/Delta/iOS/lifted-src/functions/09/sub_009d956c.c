/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d956c..0x9d95d4 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d956c_0 {
    unsigned int field_0;
    char padding_4[4];
    struct st_9d956c_0 *field_8;
} st_9d956c_0;


int sub_9d956c(void)
{
    st_9d956c_0 *v2;  // x0
    st_9d956c_0 *v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9d885c();
    if (v2)
    {
        v3 = v2;
        v2 = sub_a6bf4c(16, "crypto/bio/ossl_core_bio.c", 25);
        if (v2)
        {
            /* unsupported instruction */;
            v2->field_0 = 1;
            v2->field_8 = v3;
        }
        else
        {
            sub_a6c2e4();
            sub_9d3c28(v3);
            v2 = 0;
        }
    }
    return (unsigned int)v2;
}
